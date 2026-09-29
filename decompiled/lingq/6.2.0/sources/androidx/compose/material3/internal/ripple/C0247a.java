package androidx.compose.material3.internal.ripple;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import p000.e83;
import p000.fa4;
import p000.fda;
import p000.fh8;
import p000.io2;
import p000.jh8;
import p000.lh8;
import p000.nh8;
import p000.nj7;
import p000.q84;
import p000.q93;
import p000.qh8;
import p000.r93;
import p000.rv3;
import p000.sv3;
import p000.t66;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.wk2;
import p000.xc9;
import p000.xfa;
import p000.xk2;
import p000.yk2;

/* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0247a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0248b f3521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f3522b;

    public C0247a(AbstractC0248b abstractC0248b, un1 un1Var) {
        this.f3521a = abstractC0248b;
        this.f3522b = un1Var;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws IllegalAccessException {
        q84 q84Var = (q84) obj;
        AbstractC0248b abstractC0248b = this.f3521a;
        t66 t66Var = abstractC0248b.f3536W;
        if (q84Var instanceof nj7) {
            if (abstractC0248b.f3530Q) {
                abstractC0248b.m1174Z0((nj7) q84Var);
            } else {
                abstractC0248b.f3531R.m13090g(q84Var);
            }
        }
        ((Boolean) ((xc9) t66Var).getValue()).getClass();
        ArrayList arrayList = abstractC0248b.f3533T;
        boolean z = q84Var instanceof rv3;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            arrayList.add(q84Var);
        } else if (q84Var instanceof sv3) {
            arrayList.remove(((sv3) q84Var).f61480a);
        } else if (q84Var instanceof q93) {
            arrayList.add(q84Var);
            ((xc9) t66Var).setValue(Boolean.TRUE);
        } else if (q84Var instanceof r93) {
            arrayList.remove(((r93) q84Var).f58940a);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    ((xc9) t66Var).setValue(Boolean.FALSE);
                    break;
                }
                if (((q84) arrayList.get(i)) instanceof q93) {
                    break;
                }
                i++;
            }
        } else if (q84Var instanceof xk2) {
            arrayList.add(q84Var);
        } else {
            if (!(q84Var instanceof yk2)) {
                if (q84Var instanceof wk2) {
                    arrayList.remove(((wk2) q84Var).f66961a);
                }
                return xfaVar;
            }
            arrayList.remove(((yk2) q84Var).f69926a);
        }
        q84 q84Var2 = (q84) u91.m22598P0(arrayList);
        qh8 qh8Var = (qh8) abstractC0248b.f3527N.mo0a();
        if (!fa4.m11650l(abstractC0248b.f3534U, q84Var2)) {
            un1 un1Var = this.f3522b;
            if (q84Var2 != null) {
                boolean z2 = q84Var2 instanceof rv3;
                float f = 0.0f;
                if (z2) {
                    if (qh8Var.f57793c instanceof nh8) {
                        f = 0.08f;
                    }
                } else if (q84Var2 instanceof q93) {
                    if (qh8Var.f57792b instanceof lh8) {
                        f = 0.1f;
                    }
                } else if ((q84Var2 instanceof xk2) && (qh8Var.f57794d instanceof jh8)) {
                    f = 0.16f;
                }
                fda fdaVar = fh8.f39110a;
                if (!z2 && ((q84Var2 instanceof q93) || (q84Var2 instanceof xk2))) {
                    fdaVar = new fda(45, io2.f44352d, 2);
                }
                wfb.m23926u(un1Var, null, null, new RippleNode$onAttach$1$1$2(abstractC0248b, f, fdaVar, null), 3);
            } else {
                q84 q84Var3 = abstractC0248b.f3534U;
                fda fdaVar2 = fh8.f39110a;
                if (!(q84Var3 instanceof rv3) && !(q84Var3 instanceof q93) && (q84Var3 instanceof xk2)) {
                    fdaVar2 = new fda(150, io2.f44352d, 2);
                }
                wfb.m23926u(un1Var, null, null, new RippleNode$onAttach$1$1$3(abstractC0248b, fdaVar2, null), 3);
            }
            wfb.m23926u(un1Var, null, null, new RippleNode$onAttach$1$1$5(abstractC0248b, null), 3);
            abstractC0248b.f3534U = q84Var2;
        }
        return xfaVar;
    }
}
