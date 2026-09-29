package androidx.compose.material3;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import p000.e83;
import p000.kj7;
import p000.lj7;
import p000.mj7;
import p000.q84;
import p000.q93;
import p000.r93;
import p000.rv3;
import p000.sv3;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0255n implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f3558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f3559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0256o f3560c;

    public C0255n(ArrayList arrayList, un1 un1Var, C0256o c0256o) {
        this.f3558a = arrayList;
        this.f3559b = un1Var;
        this.f3560c = c0256o;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        q84 q84Var = (q84) obj;
        boolean z = q84Var instanceof rv3;
        ArrayList arrayList = this.f3558a;
        if (z) {
            arrayList.add(q84Var);
        } else if (q84Var instanceof sv3) {
            arrayList.remove(((sv3) q84Var).f61480a);
        } else if (q84Var instanceof q93) {
            arrayList.add(q84Var);
        } else if (q84Var instanceof r93) {
            arrayList.remove(((r93) q84Var).f58940a);
        } else if (q84Var instanceof lj7) {
            arrayList.add(q84Var);
        } else if (q84Var instanceof mj7) {
            arrayList.remove(((mj7) q84Var).f51399a);
        } else if (q84Var instanceof kj7) {
            arrayList.remove(((kj7) q84Var).f47397a);
        }
        wfb.m23926u(this.f3559b, null, null, new FloatingActionButtonElevation$animateElevation$2$1$1$1(this.f3560c, (q84) u91.m22598P0(arrayList), null), 3);
        return xfa.f68157a;
    }
}
