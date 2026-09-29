package p000;

import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.AbstractC0402n;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class bs3 extends d16 implements tf1, InterfaceC0354d, qp6 {

    /* JADX INFO: renamed from: J */
    public vx9 f8932J;

    /* JADX INFO: renamed from: K */
    public int f8933K;

    /* JADX INFO: renamed from: L */
    public int f8934L;

    /* JADX INFO: renamed from: M */
    public boolean f8935M;

    /* JADX INFO: renamed from: N */
    public int f8936N;

    /* JADX INFO: renamed from: O */
    public int f8937O;

    /* JADX INFO: renamed from: P */
    public vx9 f8938P;

    /* JADX INFO: renamed from: Q */
    public wda f8939Q;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        wa3 wa3Var = (wa3) thb.m22050i(this, AbstractC0402n.f4819k);
        this.f8938P = vz1.m23615W(this.f8932J, te1.m21979L(this).f4328U);
        xa3 xa3Var = m4156b1().f66065a.f42269f;
        bc3 bc3Var = m4156b1().f66065a.f42266c;
        if (bc3Var == null) {
            bc3Var = bc3.f8321g;
        }
        wb3 wb3Var = m4156b1().f66065a.f42267d;
        int i = wb3Var != null ? wb3Var.f66583a : 0;
        xb3 xb3Var = m4156b1().f66065a.f42268e;
        this.f8939Q = ((ya3) wa3Var).m25018b(xa3Var, bc3Var, i, xb3Var != null ? xb3Var.f68021a : 65535);
        AbstractC0356f.m1552b(this, new as3(this, 0));
        this.f8935M = true;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f8938P = null;
        this.f8939Q = null;
        this.f8935M = false;
    }

    @Override // p000.ea2
    /* JADX INFO: renamed from: V */
    public final void mo1344V() {
        this.f8938P = vz1.m23615W(this.f8932J, te1.m21979L(this).f4328U);
        this.f8935M = true;
        d32.m10020R(this);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m4154Z0(jt5 jt5Var, vx9 vx9Var, wa3 wa3Var) {
        pw9 pw9Var = ju9.m14658b(vx9Var, jt5Var, wa3Var, 3).f49728d;
        float fM19551h = pw9Var.m19551h(0);
        float fM19551h2 = pw9Var.m19551h(1);
        float fM19551h3 = pw9Var.m19551h(2);
        this.f8936N = AbstractC3184kh.m15212f(fM19551h, fM19551h2, fM19551h3, this.f8933K, 1);
        this.f8937O = AbstractC3184kh.m15212f(fM19551h, fM19551h2, fM19551h3, this.f8934L, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m4155a1(AbstractC0359i abstractC0359i) {
        if (this.f8935M) {
            m4154Z0(abstractC0359i, m4156b1(), (wa3) thb.m22050i(this, AbstractC0402n.f4819k));
            this.f8935M = false;
        }
        int i = this.f8936N;
        this.f8936N = i >= 0 ? i : 0;
        int i2 = this.f8937O;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.f8937O = i2;
    }

    /* JADX INFO: renamed from: b1 */
    public final vx9 m4156b1() {
        vx9 vx9Var = this.f8938P;
        if (vx9Var != null) {
            return vx9Var;
        }
        throw wq1.m24126v("Resolved style is not set.");
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        m4155a1(abstractC0359i);
        int i2 = this.f8936N;
        if (i2 == this.f8937O) {
            return i2;
        }
        int iMo1510U = ct5Var.mo1510U(i);
        int i3 = this.f8936N;
        int i4 = this.f8937O;
        if (iMo1510U < i3) {
            iMo1510U = i3;
        }
        return iMo1510U > i4 ? i4 : iMo1510U;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        if (this.f8935M) {
            m4154Z0(jt5Var, m4156b1(), (wa3) thb.m22050i(this, AbstractC0402n.f4819k));
            this.f8935M = false;
        }
        int i = this.f8936N;
        int iM15945h = i != -1 ? l70.m15945h(i, bk1.m3802j(j), bk1.m3800h(j)) : bk1.m3802j(j);
        int i2 = this.f8937O;
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, 0, iM15945h, i2 != -1 ? l70.m15945h(i2, bk1.m3802j(j), bk1.m3800h(j)) : bk1.m3800h(j), 3, j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 6));
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        this.f8935M = true;
        d32.m10020R(this);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        m4155a1(abstractC0359i);
        int i2 = this.f8936N;
        int i3 = this.f8937O;
        if (i2 == i3) {
            return i3;
        }
        int iMo1511c = ct5Var.mo1511c(i);
        int i4 = this.f8936N;
        int i5 = this.f8937O;
        if (iMo1511c < i4) {
            iMo1511c = i4;
        }
        return iMo1511c > i5 ? i5 : iMo1511c;
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        if (this.f8939Q != null) {
            AbstractC0356f.m1552b(this, new as3(this, 1));
        }
        this.f8935M = true;
        d32.m10020R(this);
    }
}
