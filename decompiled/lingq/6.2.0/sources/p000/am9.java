package p000;

import androidx.compose.foundation.style.C0159d;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class am9 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public C0159d f849J;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        pba pbaVarM19849a = qba.m19849a(this, "StyleOuterNode");
        pbaVarM19849a.getClass();
        C0159d c0159d = (C0159d) pbaVarM19849a;
        c0159d.f2751L = this;
        this.f849J = c0159d;
        c0159d.m1061f1(true);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        C0159d c0159d = this.f849J;
        c0159d.getClass();
        em9 em9VarM1057e1 = C0159d.m1057e1(c0159d, 1);
        float f = em9VarM1057e1.m11249s((byte) 8) ? em9VarM1057e1.f37510k : 0.0f;
        final float f2 = (em9VarM1057e1.m11249s((byte) 0) ? em9VarM1057e1.f37501c : 0.0f) + f;
        float f3 = (em9VarM1057e1.m11249s((byte) 1) ? em9VarM1057e1.f37503d : 0.0f) + f;
        final float f4 = (em9VarM1057e1.m11249s((byte) 2) ? em9VarM1057e1.f37504e : 0.0f) + f;
        float f5 = em9VarM1057e1.m11249s((byte) 3) ? em9VarM1057e1.f37505f : 0.0f;
        int iRound = Math.round(f3 + f2);
        int iRound2 = Math.round(f5 + f + f4);
        final l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10431i(j, -iRound, -iRound2));
        return jt5Var.mo9895M0(dk1.m10429g(l87VarMo1514r.f49301a + iRound, j), dk1.m10428f(l87VarMo1514r.f49302b + iRound2, j), AbstractC3194a.m15360M(), new vi3() { // from class: zl9
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((AbstractC0343j) obj).m1530f(l87VarMo1514r, Math.round(f2), Math.round(f4), 0.0f);
                return xfa.f68157a;
            }
        });
    }
}
