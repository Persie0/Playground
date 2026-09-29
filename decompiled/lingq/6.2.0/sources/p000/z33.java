package p000;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class z33 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public Direction f70828J;

    /* JADX INFO: renamed from: K */
    public float f70829K;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        int iM3803k;
        int iM3801i;
        int iM3800h;
        int i;
        if (!bk1.m3797e(j) || this.f70828J == Direction.Vertical) {
            iM3803k = bk1.m3803k(j);
            iM3801i = bk1.m3801i(j);
        } else {
            int iRound = Math.round(bk1.m3801i(j) * this.f70829K);
            int iM3803k2 = bk1.m3803k(j);
            iM3803k = bk1.m3801i(j);
            if (iRound < iM3803k2) {
                iRound = iM3803k2;
            }
            if (iRound <= iM3803k) {
                iM3803k = iRound;
            }
            iM3801i = iM3803k;
        }
        if (!bk1.m3796d(j) || this.f70828J == Direction.Horizontal) {
            int iM3802j = bk1.m3802j(j);
            int iM3800h2 = bk1.m3800h(j);
            iM3800h = iM3802j;
            i = iM3800h2;
        } else {
            int iRound2 = Math.round(bk1.m3800h(j) * this.f70829K);
            int iM3802j2 = bk1.m3802j(j);
            iM3800h = bk1.m3800h(j);
            if (iRound2 < iM3802j2) {
                iRound2 = iM3802j2;
            }
            if (iRound2 <= iM3800h) {
                iM3800h = iRound2;
            }
            i = iM3800h;
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iM3800h, i));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 4));
    }
}
