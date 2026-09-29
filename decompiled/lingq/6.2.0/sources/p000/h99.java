package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class h99 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public float f42048J;

    /* JADX INFO: renamed from: K */
    public float f42049K;

    /* JADX INFO: renamed from: L */
    public float f42050L;

    /* JADX INFO: renamed from: M */
    public float f42051M;

    /* JADX INFO: renamed from: N */
    public boolean f42052N;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: Z0 */
    public final long m13147Z0(jt5 jt5Var) {
        int iMo916w0;
        int iMo916w1;
        int iMo916w2;
        int i = 0;
        if (Float.isNaN(this.f42050L)) {
            iMo916w0 = Integer.MAX_VALUE;
        } else {
            iMo916w0 = jt5Var.mo916w0(this.f42050L);
            if (iMo916w0 < 0) {
                iMo916w0 = 0;
            }
        }
        if (Float.isNaN(this.f42051M)) {
            iMo916w1 = Integer.MAX_VALUE;
        } else {
            iMo916w1 = jt5Var.mo916w0(this.f42051M);
            if (iMo916w1 < 0) {
                iMo916w1 = 0;
            }
        }
        if (Float.isNaN(this.f42048J)) {
            iMo916w2 = 0;
        } else {
            iMo916w2 = jt5Var.mo916w0(this.f42048J);
            if (iMo916w2 < 0) {
                iMo916w2 = 0;
            }
            if (iMo916w2 > iMo916w0) {
                iMo916w2 = iMo916w0;
            }
            if (iMo916w2 == Integer.MAX_VALUE) {
                iMo916w2 = 0;
            }
        }
        if (!Float.isNaN(this.f42049K)) {
            int iMo916w3 = jt5Var.mo916w0(this.f42049K);
            if (iMo916w3 < 0) {
                iMo916w3 = 0;
            }
            if (iMo916w3 > iMo916w1) {
                iMo916w3 = iMo916w1;
            }
            if (iMo916w3 != Integer.MAX_VALUE) {
                i = iMo916w3;
            }
        }
        return dk1.m10423a(iMo916w2, iMo916w0, i, iMo916w1);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        long jM13147Z0 = m13147Z0(abstractC0359i);
        if (bk1.m3799g(jM13147Z0)) {
            return bk1.m3801i(jM13147Z0);
        }
        if (!this.f42052N) {
            i = dk1.m10428f(i, jM13147Z0);
        }
        return dk1.m10429g(ct5Var.mo1512l(i), jM13147Z0);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        long jM13147Z0 = m13147Z0(abstractC0359i);
        if (bk1.m3798f(jM13147Z0)) {
            return bk1.m3800h(jM13147Z0);
        }
        if (!this.f42052N) {
            i = dk1.m10429g(i, jM13147Z0);
        }
        return dk1.m10428f(ct5Var.mo1510U(i), jM13147Z0);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        int iM3803k;
        int iM3801i;
        int iM3802j;
        int iM3800h;
        long jM10423a;
        long jM13147Z0 = m13147Z0(jt5Var);
        if (this.f42052N) {
            jM10423a = dk1.m10427e(j, jM13147Z0);
        } else {
            if (Float.isNaN(this.f42048J)) {
                iM3803k = bk1.m3803k(j);
                int iM3801i2 = bk1.m3801i(jM13147Z0);
                if (iM3803k > iM3801i2) {
                    iM3803k = iM3801i2;
                }
            } else {
                iM3803k = bk1.m3803k(jM13147Z0);
            }
            if (Float.isNaN(this.f42050L)) {
                iM3801i = bk1.m3801i(j);
                int iM3803k2 = bk1.m3803k(jM13147Z0);
                if (iM3801i < iM3803k2) {
                    iM3801i = iM3803k2;
                }
            } else {
                iM3801i = bk1.m3801i(jM13147Z0);
            }
            if (Float.isNaN(this.f42049K)) {
                iM3802j = bk1.m3802j(j);
                int iM3800h2 = bk1.m3800h(jM13147Z0);
                if (iM3802j > iM3800h2) {
                    iM3802j = iM3800h2;
                }
            } else {
                iM3802j = bk1.m3802j(jM13147Z0);
            }
            if (Float.isNaN(this.f42051M)) {
                iM3800h = bk1.m3800h(j);
                int iM3802j2 = bk1.m3802j(jM13147Z0);
                if (iM3800h < iM3802j2) {
                    iM3800h = iM3802j2;
                }
            } else {
                iM3800h = bk1.m3800h(jM13147Z0);
            }
            jM10423a = dk1.m10423a(iM3803k, iM3801i, iM3802j, iM3800h);
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(jM10423a);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 10));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        long jM13147Z0 = m13147Z0(abstractC0359i);
        if (bk1.m3799g(jM13147Z0)) {
            return bk1.m3801i(jM13147Z0);
        }
        if (!this.f42052N) {
            i = dk1.m10428f(i, jM13147Z0);
        }
        return dk1.m10429g(ct5Var.mo1513p(i), jM13147Z0);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        long jM13147Z0 = m13147Z0(abstractC0359i);
        if (bk1.m3798f(jM13147Z0)) {
            return bk1.m3800h(jM13147Z0);
        }
        if (!this.f42052N) {
            i = dk1.m10429g(i, jM13147Z0);
        }
        return dk1.m10428f(ct5Var.mo1511c(i), jM13147Z0);
    }
}
