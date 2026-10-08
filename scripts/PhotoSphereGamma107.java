import ghidra.app.decompiler.*;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.AddressSet;
import ghidra.program.model.data.PointerDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.SourceType;
import java.io.*;
public class PhotoSphereGamma107 extends GhidraScript {
  public void run() throws Exception {
    String[] arg=getScriptArgs();String out=arg[0];String track=arg[1];
    File dir=new File(out,track);dir.mkdirs();
    FunctionManager manager=currentProgram.getFunctionManager();
    DecompInterface decompiler=new DecompInterface();
    decompiler.toggleCCode(true);decompiler.toggleSyntaxTree(true);
    decompiler.setSimplificationStyle("decompile");decompiler.openProgram(currentProgram);
    try(PrintWriter report=new PrintWriter(new File(dir,"index.txt"))) {
      Function alloc=manager.getFunctionAt(toAddr(0x004f19f4L));
      report.println("TRACK "+track);
      if(alloc!=null){
        report.println("ALLOC_BEFORE noreturn="+alloc.hasNoReturn()+" ret="+alloc.getReturnType());
        alloc.setNoReturn(false);
        alloc.setReturnType(new PointerDataType(),SourceType.USER_DEFINED);
        report.println("ALLOC_AFTER noreturn="+alloc.hasNoReturn()+" ret="+alloc.getReturnType());
        decompiler.flushCache();
      }
      long[] samples=track.equals("constructor")?new long[]{
        0x00440994L,0x00441dc0L,0x0041c618L
      }:new long[]{
        0x0049a19cL,0x0049a548L,0x0049a6a4L,
        0x0049a750L,0x0049a77cL,0x00440d80L
      };
      for(long va:samples){
        Function fun=manager.getFunctionContaining(toAddr(va));
        if(fun==null){report.println("MISSING "+Long.toHexString(va));continue;}
        report.println("FUNCTION "+Long.toHexString(va)+" -> "+fun.getEntryPoint()+" body="+fun.getBody()+" noreturn="+fun.hasNoReturn());
        if(va==0x00440994L || va==0x0049a19cL) {
          long end=(va==0x00440994L)?0x00441dbfL:0x0049a2fbL;
          try {
            fun.setBody(new AddressSet(toAddr(va),toAddr(end)));
            report.println("SET_BODY "+Long.toHexString(va)+" body="+fun.getBody());
            decompiler.flushCache();
          }catch(Exception e){report.println("SET_BODY_FAILED "+Long.toHexString(va)+" "+e);}
        }
        DecompileResults res=decompiler.decompileFunction(fun,180,monitor);
        try(PrintWriter writer=new PrintWriter(new File(dir,Long.toHexString(va)+".c"))) {
          if(res.decompileCompleted() && res.getDecompiledFunction()!=null)
            writer.println(res.getDecompiledFunction().getC());
          else writer.println("DECOMPILE_FAILED "+res.getErrorMessage());
        }
        report.println("DECOMP "+Long.toHexString(va)+" "+res.decompileCompleted()+" msg="+res.getErrorMessage());
      }
    }
    decompiler.dispose();
  }
}
