#!/usr/bin/env python3
"""Produce a real calibrated foreground-probability model from PP-LiteSeg logits.

The published 512x512 TFLite returns integer ArgMax labels, so downstream
mean-confidence is always 1.0. Keep the same weights, replace ONLY the final
ArgMax+Cast with Softmax(class axis) and foreground-class Gather.
"""
import argparse
import json
import hashlib
from pathlib import Path
import numpy as np
import onnx
from onnx import TensorProto, helper, numpy_helper
import onnxruntime as ort

def convert(src: Path, dst: Path):
    m = onnx.load(str(src))
    producers = {name: node for node in m.graph.node for name in node.output}
    assert len(m.graph.output) == 1
    output = m.graph.output[0].name
    cast = producers[output]
    assert cast.op_type == "Cast", f"unexpected original output: {cast.op_type}"
    argmax = producers[cast.input[0]]
    assert argmax.op_type == "ArgMax", f"expected ArgMax, got {argmax.op_type}"
    axis = next(onnx.helper.get_attribute_value(a) for a in argmax.attribute if a.name == 'axis')
    assert axis == 1, axis
    logits = argmax.input[0]
    m.graph.node.remove(cast)
    m.graph.node.remove(argmax)
    m.graph.initializer.append(numpy_helper.from_array(np.asarray(1, dtype=np.int64), "foreground_class"))
    m.graph.node.append(helper.make_node("Softmax", [logits], ["class_probabilities"], name="foreground_softmax", axis=1))
    m.graph.node.append(helper.make_node("Gather", ["class_probabilities","foreground_class"],
                                         ["foreground_probability"], name="foreground_probability", axis=1))
    m.graph.ClearField("output")
    m.graph.output.append(helper.make_tensor_value_info("foreground_probability", TensorProto.FLOAT, [1,512,512]))
    onnx.checker.check_model(m)
    onnx.save(m, str(dst))
    return logits

def verify_onnx(original: Path, probability: Path):
    baseline = ort.InferenceSession(str(original), providers=["CPUExecutionProvider"])
    candidate = ort.InferenceSession(str(probability), providers=["CPUExecutionProvider"])
    rng = np.random.default_rng(217)
    stats = []
    for k in range(3):
        data = rng.uniform(-1,1,(1,3,512,512)).astype(np.float32)
        source_mask = baseline.run(None,{baseline.get_inputs()[0].name:data})[0].squeeze()
        prob = candidate.run(None,{candidate.get_inputs()[0].name:data})[0].squeeze()
        assert prob.shape == (512,512) and np.isfinite(prob).all()
        assert 0 <= prob.min() and prob.max() <= 1
        match = float(np.mean(source_mask == (prob >= .5)))
        print("ONNX source argmax vs probability threshold agreement",k,match, flush=True)
        assert match >= .9999
        stats.append(match)
    return stats

def verify_tflite(original:Path, probability:Path, tflite:Path):
    import tensorflow as tf
    baseline = ort.InferenceSession(str(original), providers=["CPUExecutionProvider"])
    candidate = ort.InferenceSession(str(probability), providers=["CPUExecutionProvider"])
    lite = tf.lite.Interpreter(model_path=str(tflite), num_threads=2,
        experimental_op_resolver_type=tf.lite.experimental.OpResolverType.BUILTIN_WITHOUT_DEFAULT_DELEGATES)
    lite.allocate_tensors()
    inp,out=lite.get_input_details(),lite.get_output_details()
    assert len(inp)==len(out)==1
    assert inp[0]["dtype"]==np.float32 and out[0]["dtype"]==np.float32,(inp,out)
    assert tuple(out[0]["shape"]) in ((1,512,512),(1,512,512,1)),out
    shape=tuple(inp[0]["shape"])
    assert shape in ((1,3,512,512),(1,512,512,3)),shape
    rng=np.random.default_rng(854)
    results=[]
    for k in range(3):
        data=rng.uniform(-1,1,(1,3,512,512)).astype(np.float32)
        ref=candidate.run(None,{candidate.get_inputs()[0].name:data})[0].squeeze()
        src=baseline.run(None,{baseline.get_inputs()[0].name:data})[0].squeeze()
        image=data if shape==(1,3,512,512) else np.transpose(data,(0,2,3,1))
        lite.set_tensor(inp[0]["index"],image.copy())
        lite.invoke()
        got=lite.get_tensor(out[0]["index"]).squeeze()
        mae=float(np.mean(np.abs(ref-got)))
        agreement=float(np.mean((got>=.5)==src))
        print("TFLITE PROB PARITY",k,"MAE",mae,"mask agreement",agreement,flush=True)
        assert mae <= .02 and agreement >= .995, (mae,agreement)
        results.append(dict(mae=mae,mask_agreement=agreement))
    return shape,results

def main():
    p=argparse.ArgumentParser()
    p.add_argument("--source",type=Path,required=True)
    p.add_argument("--out",type=Path,required=True)
    a=p.parse_args()
    a.out.mkdir(parents=True,exist_ok=True)
    onnx_out=a.out/"segmenter_probability.onnx"
    logits=convert(a.source,onnx_out)
    check=verify_onnx(a.source,onnx_out)
    print("Logit tensor", logits,flush=True)
    (a.out/"onnx-confidence-report.json").write_text(json.dumps(dict(
        source=str(a.source),logits_tensor=logits,agreement=check),indent=2)+"\n")
if __name__=="__main__":main()
