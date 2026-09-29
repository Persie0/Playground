package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import coil.compose.C0858a;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends d16 implements ll2, InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public C0858a f39241J;

    /* JADX INFO: renamed from: K */
    public InterfaceC3571se f39242K;

    /* JADX INFO: renamed from: L */
    public jl1 f39243L;

    /* JADX INFO: renamed from: M */
    public float f39244M;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public final long m11930Z0(long j) {
        if (x89.m24408e(j)) {
            return 0L;
        }
        long jMo1445i = this.f39241J.mo1445i();
        if (jMo1445i != 9205357640488583168L) {
            float fM24407d = x89.m24407d(jMo1445i);
            if (Float.isInfinite(fM24407d) || Float.isNaN(fM24407d)) {
                fM24407d = x89.m24407d(j);
            }
            float fM24405b = x89.m24405b(jMo1445i);
            if (Float.isInfinite(fM24405b) || Float.isNaN(fM24405b)) {
                fM24405b = x89.m24405b(j);
            }
            long jM10528d = do7.m10528d(fM24407d, fM24405b);
            long jMo10837b = this.f39243L.mo10837b(jM10528d, j);
            int i = km8.f47515a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo10837b >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jMo10837b));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return x74.m24342I(jM10528d, jMo10837b);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: a1 */
    public final long m11931a1(long j) {
        float fM3803k;
        int iM3802j;
        float fM15944g;
        boolean zM3799g = bk1.m3799g(j);
        boolean zM3798f = bk1.m3798f(j);
        if (!zM3799g || !zM3798f) {
            boolean z = bk1.m3797e(j) && bk1.m3796d(j);
            long jMo1445i = this.f39241J.mo1445i();
            if (jMo1445i != 9205357640488583168L) {
                if (!z || (!zM3799g && !zM3798f)) {
                    float fM24407d = x89.m24407d(jMo1445i);
                    float fM24405b = x89.m24405b(jMo1445i);
                    if (Float.isInfinite(fM24407d) || Float.isNaN(fM24407d)) {
                        fM3803k = bk1.m3803k(j);
                    } else {
                        q18 q18Var = kna.f47564b;
                        fM3803k = l70.m15944g(fM24407d, bk1.m3803k(j), bk1.m3801i(j));
                    }
                    if (Float.isInfinite(fM24405b) || Float.isNaN(fM24405b)) {
                        iM3802j = bk1.m3802j(j);
                    } else {
                        q18 q18Var2 = kna.f47564b;
                        fM15944g = l70.m15944g(fM24405b, bk1.m3802j(j), bk1.m3800h(j));
                    }
                    long jM11930Z0 = m11930Z0(do7.m10528d(fM3803k, fM15944g));
                    return bk1.m3794b(dk1.m10429g(ss5.m21693T(x89.m24407d(jM11930Z0)), j), 0, dk1.m10428f(ss5.m21693T(x89.m24405b(jM11930Z0)), j), 0, 10, j);
                }
                fM3803k = bk1.m3801i(j);
                iM3802j = bk1.m3800h(j);
                fM15944g = iM3802j;
                long jM11930Z1 = m11930Z0(do7.m10528d(fM3803k, fM15944g));
                return bk1.m3794b(dk1.m10429g(ss5.m21693T(x89.m24407d(jM11930Z1)), j), 0, dk1.m10428f(ss5.m21693T(x89.m24405b(jM11930Z1)), j), 0, 10, j);
            }
            if (z) {
                return bk1.m3794b(bk1.m3801i(j), 0, bk1.m3800h(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f39241J.mo1445i() == 9205357640488583168L) {
            return ct5Var.mo1512l(i);
        }
        int iMo1512l = ct5Var.mo1512l(bk1.m3800h(m11931a1(dk1.m10424b(0, 0, 0, i, 7))));
        return Math.max(ss5.m21693T(x89.m24407d(m11930Z0(do7.m10528d(iMo1512l, i)))), iMo1512l);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f39241J.mo1445i() == 9205357640488583168L) {
            return ct5Var.mo1510U(i);
        }
        int iMo1510U = ct5Var.mo1510U(bk1.m3801i(m11931a1(dk1.m10424b(0, i, 0, 0, 13))));
        return Math.max(ss5.m21693T(x89.m24405b(m11930Z0(do7.m10528d(i, iMo1510U)))), iMo1510U);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r = ct5Var.mo1514r(m11931a1(j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 2));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f39241J.mo1445i() == 9205357640488583168L) {
            return ct5Var.mo1513p(i);
        }
        int iMo1513p = ct5Var.mo1513p(bk1.m3800h(m11931a1(dk1.m10424b(0, 0, 0, i, 7))));
        return Math.max(ss5.m21693T(x89.m24407d(m11930Z0(do7.m10528d(iMo1513p, i)))), iMo1513p);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        an0 an0Var = c0358h.f4358a;
        long jM11930Z0 = m11930Z0(an0Var.mo1422h());
        InterfaceC3571se interfaceC3571se = this.f39242K;
        q18 q18Var = kna.f47564b;
        long jM18149g = omd.m18149g(ss5.m21693T(x89.m24407d(jM11930Z0)), ss5.m21693T(x89.m24405b(jM11930Z0)));
        long jMo1422h = an0Var.mo1422h();
        long jMo10276a = interfaceC3571se.mo10276a(jM18149g, omd.m18149g(ss5.m21693T(x89.m24407d(jMo1422h)), ss5.m21693T(x89.m24405b(jMo1422h))), c0358h.getLayoutDirection());
        float f = (int) (jMo10276a >> 32);
        float f2 = (int) (jMo10276a & 4294967295L);
        ((qn3) an0Var.f853b.f50064b).m20067V(f, f2);
        this.f39241J.m24872e(c0358h, jM11930Z0, this.f39244M, null);
        ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
        c0358h.m1614b();
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f39241J.mo1445i() == 9205357640488583168L) {
            return ct5Var.mo1511c(i);
        }
        int iMo1511c = ct5Var.mo1511c(bk1.m3801i(m11931a1(dk1.m10424b(0, i, 0, 0, 13))));
        return Math.max(ss5.m21693T(x89.m24405b(m11930Z0(do7.m10528d(i, iMo1511c)))), iMo1511c);
    }
}
