import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.*;
import java.io.*;

public class PhotoSphereFlow103 extends GhidraScript {
  public void run() throws Exception {
    String out=getScriptArgs().length>0?getScriptArgs()[0]:"out";
    new File(out).mkdirs();
    DecompInterface decomp=new DecompInterface();
    decomp.openProgram(currentProgram);
    FunctionManager fm=currentProgram.getFunctionManager();
    long[] addrs={
      0x001f44c8L, 0x001ffc30L,0x001fdcc0L,0x001fd76cL,
      0x001f3848L,0x001fdf50L,0x001ff7dcL,0x001ffab0L,
      0x001fd9acL,0x001f40f0L
    };
    try(PrintWriter report=new PrintWriter(new File(out,"flow-index.tsv"))) {
      for(long x:addrs) {
        Address a=toAddr(x);
        Function fn=fm.getFunctionContaining(a);
        report.println("FUNCTION\t"+a+"\t"+(fn==null?"NOT_FOUND":fn.getEntryPoint()+" "+fn.getName()));
        if(fn==null)continue;
        String basename=Long.toHexString(x);
        try(PrintWriter asm=new PrintWriter(new File(out,basename+".asm"))) {
          InstructionIterator it=currentProgram.getListing().getInstructions(fn.getBody(),true);
          for(int n=0;it.hasNext()&&n<2500;n++) {
            Instruction ins=it.next();
            asm.println(ins.getAddress()+" "+ins);
          }
        }
        DecompileResults r=decomp.decompileFunction(fn,120,monitor);
        try(PrintWriter dest=new PrintWriter(new File(out,basename+".c"))) {
          dest.println("FUNCTION "+fn.getEntryPoint()+" "+fn.getName());
          if(r.decompileCompleted()&&r.getDecompiledFunction()!=null)dest.println(r.getDecompiledFunction().getC());
          else dest.println("DECOMP_FAIL "+r.getErrorMessage());
        }
        int count=0;
        for(Function caller:fn.getCallingFunctions(monitor)) {
          report.println("CALLEE_XREF\t"+a+"\t"+caller.getEntryPoint());
          if(++count>25)break;
        }
      }
      long base=0x004fd398L;
      for(int n=-2;n<9;n++) {
        Address a=toAddr(base+8L*n);
        try{
          long v=currentProgram.getMemory().getLong(a);
          report.println("FLOW_VTABLE\t"+a+"\t0x"+Long.toHexString(v));
        }catch(Exception ex){report.println("FLOW_VTABLE_ERROR\t"+a+"\t"+ex);}
      }
      for(long x:new long[]{0x004fd398L,0x004fd390L,0x004fd3e0L,0x001fdcc0L}) {
        Address a=toAddr(x);
        ReferenceIterator ri=currentProgram.getReferenceManager().getReferencesTo(a);
        int count=0;
        while(ri.hasNext()&&count++<90){
          Reference ref=ri.next();
          Function src=fm.getFunctionContaining(ref.getFromAddress());
          report.println("REF_TO\t"+a+"\t"+ref.getFromAddress()+"\t"+(src==null?"UNKNOWN":src.getEntryPoint())+"\t"+ref.getReferenceType());
        }
      }
    }
    decomp.dispose();
  }
}
