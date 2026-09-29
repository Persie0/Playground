package p000;

import android.content.Context;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ws6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67255c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67256d;

    public /* synthetic */ ws6(w75 w75Var, fe9 fe9Var, vi3 vi3Var) {
        this.f67253a = 1;
        this.f67255c = w75Var;
        this.f67254b = fe9Var;
        this.f67256d = vi3Var;
    }

    /* JADX INFO: renamed from: d */
    private final Object m24142d(Object obj) {
        List list = (List) this.f67254b;
        vi3 vi3Var = (vi3) this.f67256d;
        Context context = (Context) this.f67255c;
        vu4 vu4Var = (vu4) obj;
        vu4Var.getClass();
        vu4Var.m23547h(list.size(), null, new xf8(14, list), new C0282a(802480018, true, new tp8(list, vi3Var, context, 3)));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:237:0x0734  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.String, vi3] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v32 java.lang.Object, still in use, count: 2, list:
          (r3v32 java.lang.Object) from 0x0730: PHI (r3 I:??) = (r3v29 java.lang.Object), (r3v32 java.lang.Object) binds: [B:234:0x072f, B:275:0x0730] A[DONT_GENERATE, DONT_INLINE]
          (r3v32 java.lang.Object) from 0x071e: CHECK_CAST (com.lingq.feature.playlist.MenuPlaylistItem) (r3v32 java.lang.Object)
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
    @Override // p000.vi3
    public final java.lang.Object invoke(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 2640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ws6.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ ws6(Object obj, vi3 vi3Var, Context context, int i) {
        this.f67253a = i;
        this.f67254b = obj;
        this.f67256d = vi3Var;
        this.f67255c = context;
    }

    public /* synthetic */ ws6(Object obj, Object obj2, Object obj3, int i) {
        this.f67253a = i;
        this.f67254b = obj;
        this.f67255c = obj2;
        this.f67256d = obj3;
    }
}
