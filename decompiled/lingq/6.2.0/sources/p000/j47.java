package p000;

import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class j47 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public float f45044J;

    /* JADX INFO: renamed from: K */
    public dh9 f45045K;

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        int iM3800h;
        dh9 dh9Var = this.f45045K;
        if (dh9Var != null) {
            sc9 sc9Var = (sc9) dh9Var;
            if (((Number) sc9Var.getValue()).intValue() != Integer.MAX_VALUE) {
                iM3800h = Math.round(((Number) sc9Var.getValue()).floatValue() * this.f45044J);
            } else {
                iM3800h = Integer.MAX_VALUE;
            }
        } else {
            iM3800h = Integer.MAX_VALUE;
        }
        int iM3803k = bk1.m3803k(j);
        int iM3802j = iM3800h != Integer.MAX_VALUE ? iM3800h : bk1.m3802j(j);
        int iM3801i = bk1.m3801i(j);
        if (iM3800h == Integer.MAX_VALUE) {
            iM3800h = bk1.m3800h(j);
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10423a(iM3803k, iM3801i, iM3802j, iM3800h));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 9));
    }
}
