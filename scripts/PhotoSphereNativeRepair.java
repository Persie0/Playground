import ghidra.app.decompiler.*;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.*;
import ghidra.program.model.data.PointerDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.mem.*;
import ghidra.program.model.symbol.*;
import java.io.*;
import java.util.*;

public class PhotoSphereNativeRepair extends GhidraScript {
    private PrintWriter out;
    private DecompInterface dec;
    private FunctionManager fm;
    private Memory mem;
    private Function at(long address) {
        Function f=fm.getFunctionAt(toAddr(address));
        return f!=null?f:fm.getFunctionContaining(toAddr(address));
    }
    private void emit(String s) {out.println(s); println(s);}
    private void decompile(long va, String tag) {
        Function f=at(va);
        if(f==null){emit("NO_FUNCTION "+tag+" "+Long.toHexString(va));return;}
        DecompileResults r=dec.decompileFunction(f,180,monitor);
        out.println("==== C "+tag+" "+f.getEntryPoint()+" body="+f.getBody()+" ====");
        if(r.decompileCompleted()&&r.getDecompiledFunction()!=null)
            out.println(r.getDecompiledFunction().getC());
        else out.println("ERROR "+r.getErrorMessage());
    }
    private void analyze(long start, long[] seeds) {
        Function f=at(start);
        Function next=fm.getFunctionAfter(toAddr(start));
        long nextaddr=next==null?start+0x300:next.getEntryPoint().getOffset();
        emit("REGION start="+Long.toHexString(start)+" function="+(f==null?"null":f.getName())+
             " original_body="+(f==null?"null":f.getBody())+
             " next="+Long.toHexString(nextaddr));
        decompile(start,"before");
        for(long addr:seeds) {
            Function owner=at(addr);
            Instruction ins=currentProgram.getListing().getInstructionAt(toAddr(addr));
            emit("SEED "+Long.toHexString(addr)+" instruction="+(ins==null?"MISSING":ins.toString())+
                 " owner="+(owner==null?"none":owner.getEntryPoint().toString()));
            if(ins==null && addr<nextaddr) {
                try { boolean ok=disassemble(toAddr(addr));emit("DISASSEMBLE "+Long.toHexString(addr)+" "+ok); }
                catch(Exception e){emit("DISASSEMBLE_ERROR "+e);}
            }
        }
        if(f!=null && nextaddr>start) {
            try {
                AddressSet bounds=new AddressSet(toAddr(start),toAddr(nextaddr-4));
                f.setBody(bounds);
                emit("BODY_SET "+f.getBody());
            }catch(Exception e){emit("BODY_ERROR "+e);}
        }
        dec.flushCache();
        decompile(start,"repaired");
        out.println("==== ASM "+Long.toHexString(start)+" ====");
        long last=Math.min(nextaddr,start+0x540);
        for(long va=start;va<last;va+=4) {
            Instruction ins=currentProgram.getListing().getInstructionAt(toAddr(va));
            if(ins!=null)out.println(Long.toHexString(va)+"\t"+ins.toString());
            else if(va>=start&&va<last)out.println(Long.toHexString(va)+"\tUNDISASSEMBLED");
        }
    }
    private void scanTables() {
        out.println("==== POSSIBLE_VTABLES ====");
        long min=0x00400000L, max=0x004a0000L;
        for(MemoryBlock b:mem.getBlocks()) {
            if(!b.isInitialized() || b.isExecute()) continue;
            long first=b.getStart().getOffset(), last=b.getEnd().getOffset();
            if(last-first>0x500000) continue;
            int groups=0;
            for(long i=(first+7)&~7L; i+24<=last && groups<100;i+=8) {
                try {
                    long ptr=mem.getLong(toAddr(i));
                    long ptr2=mem.getLong(toAddr(i+8));
                    long ptr3=mem.getLong(toAddr(i+16));
                    if(!(ptr>=min&&ptr<max&&ptr2>=min&&ptr2<max&&ptr3>=min&&ptr3<max))continue;
                    Function f=at(ptr),g=at(ptr2),h=at(ptr3);
                    if(f==null||g==null||h==null)continue;
                    // Filter for blend- and target-code regions.
                    if((ptr>=0x00420000L&&ptr<0x00450000L) ||
                       (ptr2>=0x00420000L&&ptr2<0x00450000L) ||
                       (ptr>=0x00200000L&&ptr<0x00230000L)) {
                        out.println("VTABLE "+Long.toHexString(i)+
                            " "+Long.toHexString(ptr)+":"+f.getName()+
                            " "+Long.toHexString(ptr2)+":"+g.getName()+
                            " "+Long.toHexString(ptr3)+":"+h.getName());
                        groups++;
                        i+=16;
                    }
                }catch(Exception e){}
            }
        }
    }
    public void run() throws Exception {
        String[] a=getScriptArgs();File dir=new File(a[0]);dir.mkdirs();
        out=new PrintWriter(new File(dir,"native-repair.txt"));
        fm=currentProgram.getFunctionManager();mem=currentProgram.getMemory();
        dec=new DecompInterface();dec.toggleCCode(true);dec.toggleSyntaxTree(true);
        dec.setSimplificationStyle("decompile");dec.openProgram(currentProgram);
        Function allocator=at(0x004f19f4L);
        if(allocator!=null){
            emit("ALLOCATOR "+allocator.getName()+" before="+allocator.hasNoReturn());
            allocator.setNoReturn(false);
            allocator.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
            emit("ALLOCATOR after="+allocator.hasNoReturn());
        }
        dec.flushCache();
        analyze(0x0043e930L,new long[]{0x0043e940L,0x0043e950L,0x0043e970L,0x0043e990L,0x0043e9b0L});
        analyze(0x002189d8L,new long[]{0x00218a14L,0x00218a18L,0x00218a2cL,0x00218a30L,0x00218a68L,0x00218a70L,0x00218a80L,0x00218a8cL,0x00218a9cL,0x00218aa8L});
        analyze(0x004252b0L,new long[]{0x004253b8L,0x00425588L,0x00425680L,0x004256a0L});
        scanTables();
        out.close();dec.dispose();
    }
}
