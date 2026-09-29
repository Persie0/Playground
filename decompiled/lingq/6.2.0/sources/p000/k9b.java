package p000;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class k9b extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public Direction f46918J;

    /* JADX INFO: renamed from: K */
    public zi3 f46919K;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10423a(this.f46918J != Direction.Vertical ? 0 : bk1.m3803k(j), bk1.m3801i(j), this.f46918J == Direction.Horizontal ? bk1.m3802j(j) : 0, bk1.m3800h(j)));
        int iM15945h = l70.m15945h(l87VarMo1514r.f49301a, bk1.m3803k(j), bk1.m3801i(j));
        int iM15945h2 = l70.m15945h(l87VarMo1514r.f49302b, bk1.m3802j(j), bk1.m3800h(j));
        return jt5Var.mo9895M0(iM15945h, iM15945h2, AbstractC3194a.m15360M(), new rj8(this, iM15945h, l87VarMo1514r, iM15945h2, jt5Var));
    }
}
