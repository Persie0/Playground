package p030b9;

/* JADX INFO: renamed from: b9.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1342a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8162c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f8163d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f8164e;

    public /* synthetic */ RunnableC1342a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8160a = i10;
        this.f8161b = obj;
        this.f8162c = obj2;
        this.f8163d = obj3;
        this.f8164e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:323:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v26 java.lang.Object, still in use, count: 2, list:
          (r10v26 java.lang.Object) from 0x00b0: PHI (r10 I:??) = (r10v23 java.lang.Object), (r10v26 java.lang.Object) binds: [B:22:0x00af, B:303:0x00b0] A[DONT_GENERATE, DONT_INLINE]
          (r10v26 java.lang.Object) from 0x00a4: CHECK_CAST (o5.f$d) (r10v26 java.lang.Object)
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p030b9.RunnableC1342a.run():void");
    }
}
