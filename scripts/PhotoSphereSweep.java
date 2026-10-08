import ghidra.app.decompiler.*;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.address.AddressSet;
import ghidra.program.model.data.PointerDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.*;
import java.io.*;
import java.util.*;

public class PhotoSphereSweep extends GhidraScript {
    private static final Map<String,long[]> FOCUS=new LinkedHashMap<>();
    static {
        FOCUS.put("rosette", new long[]{
            0x004440ecL,0x00443e74L,0x004f19f4L,0x004f40fcL,
            0x0021b5f4L,0x0021be38L,0x0021976cL,0x0021e3e4L
        });
        FOCUS.put("seams", new long[]{
            0x00433478L,0x0042114cL,0x00423f2cL,0x00420998L,
            0x00421718L,0x00421c80L,0x004390a8L,0x00439600L
        });
        FOCUS.put("flow-line", new long[]{
            0x001ed84cL,0x001f40f0L,0x001ffc30L,0x001fff14L,
            0x00406504L,0x00406fccL,0x00416a40L,0x00416a64L,
            0x00403cf8L,0x002287c0L
        });
        FOCUS.put("targets-meta", new long[]{
            0x002159fcL,0x002147c4L,0x0021105cL,0x001efb78L,
            0x0020f448L,0x0020f6a0L,0x00419b74L,0x001ed94cL
        });
        FOCUS.put("rosette-access", new long[]{
            0x004440ecL,0x00443e74L,0x0041a6bcL,0x00447c9cL,
            0x00447884L,0x00447bd4L,0x0021b18cL,0x0021b5f4L,
            0x0041ce34L,0x004478b8L,0x0041a2fcL,0x0041b400L
        });
        FOCUS.put("seam-finish", new long[]{
            0x00433478L,0x004390a8L,0x00439600L,0x0042114cL,
            0x00421c80L,0x00421fb0L,0x0042a24cL,0x0042a3d8L,
            0x00423310L,0x00423bc4L,0x00423f2cL,0x00422208L,
            0x0042278cL,0x0042a4fcL,0x0042a6a4L,0x0049c2bcL,
            0x0043901cL,0x00438fecL
        });
        FOCUS.put("flow-config", new long[]{
            0x001f214cL,0x001f327cL,0x001f32b0L,0x001f32bcL,
            0x001f333cL,0x001f40f0L,0x001ffc30L,0x001fff14L,
            0x001f4010L,0x001f2e54L,0x001f5fb0L,0x001f27d8L
        });
        FOCUS.put("target-config", new long[]{
            0x001edb8cL,0x001ed84cL,0x001efb78L,0x001ef8f8L,
            0x002159fcL,0x002147c4L,0x002158fcL,0x0020f6a0L,
            0x0020f448L,0x00216948L,0x00419d40L,0x00419b74L,
            0x0041aa40L,0x0041a6bcL
        });
        FOCUS.put("blend-vtable", new long[]{
            0x0043e930L,0x00423310L,0x00433478L,0x004252b0L,
            0x0042a6a4L,0x0042b114L,0x00423f2cL,0x00421fb0L,
            0x004380dcL,0x0043e870L,0x0043e990L,0x004f19f4L
        });
        FOCUS.put("blend-pixel", new long[]{
            0x0043e930L,0x00423310L,0x004252b0L,0x00425770L,
            0x004121bcL,0x0042368cL,0x0042a4fcL,0x0042a6a4L,
            0x0042b114L,0x0042ad24L,0x0042114cL,0x00421fb0L,
            0x0041fb10L,0x004350ecL,0x00433478L
        });
        FOCUS.put("source-index", new long[]{
            0x0041a6bcL,0x00443e74L,0x004440ecL,0x00447c9cL,
            0x00447bd4L,0x00447a54L,0x004405c8L,0x0041b04cL,
            0x0041a84cL,0x0041a9a8L,0x00419d40L,0x00450c1cL,
            0x00450c9cL,0x001f002cL,0x0021b5f4L
        });
        FOCUS.put("target-provenance", new long[]{
            0x001edb8cL,0x001ed84cL,0x001efb78L,0x002158fcL,
            0x002159fcL,0x002147c4L,0x0020f6a0L,0x0021105cL,
            0x002188b8L,0x0021874cL,0x002189d8L,0x0020f448L,
            0x0020f9e4L,0x0020fc30L,0x0020fa04L,0x001ef8f8L
        });
    }
    private PrintWriter report;
    private File dir;
    private FunctionManager fm;
    private DecompInterface dec;
    private Function find(long va) {
        Address a=toAddr(va);
        Function f=fm.getFunctionAt(a);
        return f!=null?f:fm.getFunctionContaining(a);
    }
    private void outputFunction(Function f,String tag) throws Exception {
        if(f==null || f.isExternal()) return;
        String id=f.getEntryPoint().toString();
        String safe=id.replaceAll("[^0-9a-zA-Z]","_");
        report.println(tag+"\t"+id+"\t"+f.getName()+"\tnoReturn="+f.hasNoReturn());
        DecompileResults result=dec.decompileFunction(f,150,monitor);
        try(PrintWriter w=new PrintWriter(new File(dir,safe+"_"+tag+".c"))) {
            w.println("/* "+tag+" "+f.getName()+" "+f.getEntryPoint()+" */");
            if(result.decompileCompleted()&&result.getDecompiledFunction()!=null)
                w.println(result.getDecompiledFunction().getC());
            else w.println("DECOMPILE FAILED: "+result.getErrorMessage());
        }
        try(PrintWriter w=new PrintWriter(new File(dir,safe+"_"+tag+".asm"))) {
            InstructionIterator it=currentProgram.getListing().getInstructions(f.getBody(),true);
            int n=0;
            while(it.hasNext()&&n++<2400) {
                Instruction ins=it.next();
                w.println(ins.getAddress()+"\t"+ins.toString());
            }
            w.println("instruction_rows="+n);
        }
        int callers=0;
        for(Function c:f.getCallingFunctions(monitor)) {
            if(callers++>=16)break;
            report.println("CALLER\t"+id+"\t"+c.getEntryPoint()+"\t"+c.getName());
        }
        int callees=0;
        for(Function c:f.getCalledFunctions(monitor)) {
            if(callees++>=28)break;
            report.println("CALLEE\t"+id+"\t"+c.getEntryPoint()+"\t"+c.getName());
        }
    }
    public void run() throws Exception {
        String[] args=getScriptArgs();
        dir=new File(args[0],args[1]);dir.mkdirs();
        String track=args[1];
        long[] targets=FOCUS.get(track);
        if(targets==null)throw new IllegalArgumentException("Unknown track: "+track);
        fm=currentProgram.getFunctionManager();
        dec=new DecompInterface();
        dec.toggleCCode(true); dec.toggleSyntaxTree(true);
        dec.setSimplificationStyle("decompile");
        dec.openProgram(currentProgram);
        report=new PrintWriter(new File(dir,"index.tsv"));
        report.println("TRACK\t"+track);
        report.println("BINARY\t"+currentProgram.getName()+"\t"+currentProgram.getImageBase());
        if(track.equals("rosette")) {
            Function allocator=find(0x004f19f4L);
            Function rosette=find(0x004440ecL);
            if(allocator!=null && rosette!=null) {
                report.println("ALLOCATOR_BEFORE\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn()+"\treturn="+allocator.getReturnType());
                outputFunction(rosette,"before");
                allocator.setNoReturn(false);
                allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
                dec.flushCache();
                report.println("ALLOCATOR_AFTER\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn()+"\treturn="+allocator.getReturnType());
                outputFunction(rosette,"after");
            }
        }
        if(track.equals("blend-vtable")) {
            Function allocator=find(0x004f19f4L);
            if(allocator==null) throw new IllegalStateException("Cannot resolve native allocator");
            report.println("ALLOCATOR_BEFORE\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn());
            allocator.setNoReturn(false);
            allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
            dec.flushCache();
            report.println("ALLOCATOR_AFTER\t"+allocator.getEntryPoint()+"\tnoReturn="+allocator.hasNoReturn());
            Function factory=find(0x0043e930L);
            if(factory==null) throw new IllegalStateException("Missing blender factory");
            report.println("BLEND_FACTORY_BEFORE\t"+factory.getBody());
            for(long va=0x0043e940L;va<=0x0043e96cL;va+=4) {
                Address a=toAddr(va);
                if(currentProgram.getListing().getInstructionAt(a)==null)
                    disassemble(a);
                Instruction ins=currentProgram.getListing().getInstructionAt(a);
                report.println("BLEND_FACTORY_RAW\t"+a+"\t"+(ins==null?"MISSING":ins.toString()));
            }
            try {
                factory.setBody(new AddressSet(toAddr(0x0043e930L),toAddr(0x0043e96fL)));
                dec.flushCache();
                report.println("BLEND_FACTORY_AFTER\t"+factory.getBody());
            } catch(Exception ex) {
                report.println("BLEND_FACTORY_REPAIR_ERROR\t"+ex);
            }
        }
        if(track.equals("rosette-access")) {
            Function allocator=find(0x004f19f4L);
            Function rosette=find(0x004440ecL);
            if(allocator!=null && rosette!=null) {
                report.println("BEFORE_REPAIR\t"+rosette.getBody()+"\tallocator_noreturn="+allocator.hasNoReturn());
                try {
                    allocator.setNoReturn(false);
                    allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
                    for(long va:new long[]{0x0044413cL,0x0044419cL,0x004441bcL}) {
                        if(currentProgram.getListing().getInstructionAt(toAddr(va))==null)
                            disassemble(toAddr(va));
                    }
                    rosette.setBody(new AddressSet(toAddr(0x004440ecL),toAddr(0x004441dfL)));
                    dec.flushCache();
                    report.println("AFTER_REPAIR\t"+rosette.getBody()+"\tallocator_noreturn="+allocator.hasNoReturn());
                    outputFunction(rosette,"fixed");
                } catch(Exception e) {
                    report.println("REPAIR_ERROR\t"+e.toString());
                }
            }
        }
        Set<Function> selected=new LinkedHashSet<>();
        for(long va:targets) {
            Function f=find(va);
            report.println("TARGET\t"+Long.toHexString(va)+"\t"+(f==null?"MISSING":f.getEntryPoint()+"\t"+f.getName()));
            if(f!=null)selected.add(f);
        }
        if(track.equals("targets-meta")) {
            DataIterator it=currentProgram.getListing().getDefinedData(true);
            ReferenceManager rm=currentProgram.getReferenceManager();
            int strings=0;
            while(it.hasNext()) {
                Data d=it.next();
                if(!d.hasStringValue())continue;
                Object value=d.getValue();
                if(!(value instanceof String))continue;
                String s=(String)value;
                if(!s.matches("(?is).*?(session\\.meta|source_photos_count|yaw_correction_deg|pose_heading|target_generator\\.cc).*"))continue;
                report.println("STRING\t"+d.getAddress()+"\t"+s.replace('\n',' '));
                ReferenceIterator references=rm.getReferencesTo(d.getAddress());
                while(references.hasNext()) {
                    Reference ref=references.next();
                    Function f=fm.getFunctionContaining(ref.getFromAddress());
                    report.println("STRING_XREF\t"+ref.getFromAddress()+"\t"+(f==null?"NONE":f.getEntryPoint()));
                    if(f!=null)selected.add(f);
                }
                if(++strings>120)break;
            }
        }
        if(track.equals("flow-line")) {
            for(long va:new long[]{0x001ed94cL,0x001f327cL,0x00416a40L}) {
                Function f=find(va);
                if(f!=null) {
                    int n=0;
                    for(Function c:f.getCallingFunctions(monitor)) if(n++<8) selected.add(c);
                }
            }
        }
        for(Function f:selected)outputFunction(f,"investigate");
        report.close();
        dec.dispose();
    }
}