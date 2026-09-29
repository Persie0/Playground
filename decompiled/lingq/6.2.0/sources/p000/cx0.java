package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cx0 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f34672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f34673c;

    public /* synthetic */ cx0(e83 e83Var, String str, int i) {
        this.f34671a = i;
        this.f34672b = e83Var;
        this.f34673c = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v10 java.lang.Object, still in use, count: 2, list:
          (r14v10 java.lang.Object) from 0x0151: PHI (r14 I:??) = (r14v7 java.lang.Object), (r14v10 java.lang.Object) binds: [B:79:0x0150, B:113:0x0151] A[DONT_GENERATE, DONT_INLINE]
          (r14v10 java.lang.Object) from 0x0145: CHECK_CAST (com.lingq.core.domain.model.lesson.Note) (r14v10 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cx0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
