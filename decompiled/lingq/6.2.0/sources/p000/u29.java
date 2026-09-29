package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u29 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63327c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f63328d;

    public /* synthetic */ u29(int i, vi3 vi3Var, Object obj, Object obj2) {
        this.f63325a = i;
        this.f63326b = vi3Var;
        this.f63327c = obj;
        this.f63328d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 java.lang.Object, still in use, count: 2, list:
          (r4v4 java.lang.Object) from 0x00ba: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v4 java.lang.Object) binds: [B:37:0x00b9, B:45:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          (r4v4 java.lang.Object) from 0x00a6: CHECK_CAST (com.lingq.core.domain.model.server.ServerEnvironment) (r4v4 java.lang.Object)
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
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo0a() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u29.mo0a():java.lang.Object");
    }

    public /* synthetic */ u29(Object obj, Object obj2, Object obj3, int i) {
        this.f63325a = i;
        this.f63327c = obj;
        this.f63326b = obj2;
        this.f63328d = obj3;
    }
}
