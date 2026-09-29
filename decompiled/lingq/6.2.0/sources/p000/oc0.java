package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oc0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54163a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f54165c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f54166d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f54167e;

    public /* synthetic */ oc0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f54163a = i;
        this.f54164b = obj;
        this.f54165c = obj2;
        this.f54166d = obj3;
        this.f54167e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
          (r7v8 java.lang.Object) from 0x0172: PHI (r7 I:??) = (r7v5 java.lang.Object), (r7v8 java.lang.Object) binds: [B:63:0x0171, B:125:0x0172] A[DONT_GENERATE, DONT_INLINE]
          (r7v8 java.lang.Object) from 0x0166: CHECK_CAST (pl7) (r7v8 java.lang.Object)
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
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oc0.run():void");
    }

    public /* synthetic */ oc0(Object obj, String str, Object obj2, String str2, int i) {
        this.f54163a = i;
        this.f54164b = obj;
        this.f54165c = str;
        this.f54167e = obj2;
        this.f54166d = str2;
    }
}
