package p000;

import com.lingq.core.settings.C1859b;

/* JADX INFO: loaded from: classes3.dex */
public final class wv7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f67388b;

    public wv7(e83 e83Var, C1859b c1859b) {
        this.f67387a = 13;
        this.f67388b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:118:0x01db  */
    /* JADX WARN: Code duplicated, block: B:133:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0266  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:201:0x0330  */
    /* JADX WARN: Code duplicated, block: B:216:0x036b  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:264:0x0421  */
    /* JADX WARN: Code duplicated, block: B:282:0x0461  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:336:0x060b  */
    /* JADX WARN: Code duplicated, block: B:353:0x064a  */
    /* JADX WARN: Code duplicated, block: B:374:0x069d  */
    /* JADX WARN: Code duplicated, block: B:391:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:406:0x0723  */
    /* JADX WARN: Code duplicated, block: B:421:0x075f  */
    /* JADX WARN: Code duplicated, block: B:442:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:460:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:475:0x083c  */
    /* JADX WARN: Code duplicated, block: B:492:0x087d  */
    /* JADX WARN: Code duplicated, block: B:510:0x08be  */
    /* JADX WARN: Code duplicated, block: B:525:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:540:0x0939  */
    /* JADX WARN: Code duplicated, block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v109 java.lang.Object, still in use, count: 2, list:
          (r4v109 java.lang.Object) from 0x0131: PHI (r4 I:??) = (r4v92 java.lang.Object), (r4v109 java.lang.Object) binds: [B:74:0x0130, B:573:0x0131] A[DONT_GENERATE, DONT_INLINE]
          (r4v109 java.lang.Object) from 0x0127: CHECK_CAST (ac7) (r4v109 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p000.e83
    public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wv7.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ wv7(e83 e83Var, int i) {
        this.f67387a = i;
        this.f67388b = e83Var;
    }
}
