#!/usr/bin/env python3
"""Convert verified PP-LiteSeg ONNX probabilities to iOS 17 Core ML via PyTorch.

Never substitute a random/untrained model. Inputs use the original RGB CHW
and -1..1 normalization; output is the foreground probability mask.
"""
import argparse,json,hashlib
from pathlib import Path
import numpy as np,onnx,onnxruntime as ort
from onnx2torch import convert as onnx_to_torch
import torch
import coremltools as ct

def main():
    p=argparse.ArgumentParser()
    p.add_argument('--onnx',type=Path,required=True)
    p.add_argument('--out',type=Path,required=True)
    a=p.parse_args()
    a.out.mkdir(parents=True,exist_ok=True)
    torch.set_grad_enabled(False)
    onnx_model=onnx.load(str(a.onnx))
    # Paddle2ONNX encodes "same" padding with auto_pad=SAME_UPPER.
    # onnx2torch cannot import auto_pad, so replace with mathematically
    # equivalent explicit Conv pads using statically inferred feature shapes.
    inferred=onnx.shape_inference.infer_shapes(onnx_model)
    shapes={}
    for info in list(inferred.graph.input)+list(inferred.graph.value_info):
        dims=[int(d.dim_value) for d in info.type.tensor_type.shape.dim]
        if all(d>0 for d in dims):shapes[info.name]=dims
    fixed=0
    for node in onnx_model.graph.node:
        if node.op_type!='Conv':continue
        pad=next((attr for attr in node.attribute if attr.name=='auto_pad'),None)
        if pad is None or pad.s!=b'SAME_UPPER':continue
        shape=shapes.get(node.input[0])
        if shape is None or len(shape)!=4:
            raise RuntimeError(f'Conv input shape unavailable for SAME_UPPER: {node.name} {node.input[0]}')
        kernel=next((list(a.ints) for a in node.attribute if a.name=='kernel_shape'),None)
        stride=next((list(a.ints) for a in node.attribute if a.name=='strides'),[1,1])
        dilations=next((list(a.ints) for a in node.attribute if a.name=='dilations'),[1,1])
        assert kernel is not None and len(kernel)==2
        pairs=[]
        for inp,k,st,dil in zip(shape[-2:],kernel,stride,dilations):
            required=max(0,((inp+st-1)//st-1)*st + (k-1)*dil+1-inp)
            pairs.append((required//2, required-required//2))
        node.attribute.remove(pad)
        node.attribute.append(onnx.helper.make_attribute('pads',[pairs[0][0],pairs[1][0],pairs[0][1],pairs[1][1]]))
        fixed+=1
    print('CONV SAME_UPPER -> explicit padding',fixed,flush=True)
    onnx.checker.check_model(onnx_model)
    net=onnx_to_torch(onnx_model).eval()
    sample=torch.zeros((1,3,512,512),dtype=torch.float32)
    with torch.no_grad():
        actual=net(sample)
        if isinstance(actual,(list,tuple)): actual=actual[0]
        print('TORCH shape', tuple(actual.shape),actual.dtype,flush=True)
        assert tuple(actual.shape)==(1,512,512),tuple(actual.shape)
        traced=torch.jit.trace(net,sample,strict=False)
        traced=torch.jit.freeze(traced)
    output=a.out/'resistor_segmenter_ppliteseg.mlpackage'
    model=ct.convert(traced,
        convert_to='mlprogram',
        minimum_deployment_target=ct.target.iOS17,
        compute_precision=ct.precision.FLOAT16,
        inputs=[ct.TensorType(name='image',shape=(1,3,512,512),dtype=np.float32)],
        outputs=[ct.TensorType(name='foreground_probability')],
    )
    model.save(str(output))
    print('Core ML model saved',output,flush=True)
    reference=ort.InferenceSession(str(a.onnx),providers=['CPUExecutionProvider'])
    reference_input=reference.get_inputs()[0].name
    # Compile/predict on the macOS runner CPU to validate model and tensor contract.
    cpu_model=ct.models.MLModel(str(output),compute_units=ct.ComputeUnit.CPU_ONLY)
    rng=np.random.default_rng(2048)
    stats=[]
    for k in range(2):
        x=rng.uniform(-1.,1.,(1,3,512,512)).astype(np.float32)
        expected=reference.run(None,{reference_input:x})[0].squeeze()
        results=cpu_model.predict({'image':x})
        assert len(results)==1,results.keys()
        got=np.asarray(next(iter(results.values()))).squeeze()
        assert got.shape==(512,512),(got.shape,results.keys())
        mae=float(np.mean(np.abs(expected-got)))
        masks=float(np.mean((expected>=.5)==(got>=.5)))
        print('COREML validated sample',k,'MAE',mae,'mask agreement',masks,flush=True)
        assert mae<.02 and masks>=.995,(mae,masks)
        stats.append(dict(mae=mae,mask_agreement=masks))
    report=dict(
        source='resistor_model release v5 PP-LiteSeg STDC2, 512x512',
        output='foreground_probability',compute_precision='float16',
        input_shape=[1,3,512,512],output_shape=[1,512,512],
        comparisons=stats)
    (a.out/'coreml-parity-report.json').write_text(json.dumps(report,indent=2)+'\n')
    print('COREML_VALIDATION_SUCCESS',flush=True)

if __name__=='__main__':main()
