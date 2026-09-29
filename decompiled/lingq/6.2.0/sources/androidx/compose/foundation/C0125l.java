package androidx.compose.foundation;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.C3309ls;
import p000.a45;
import p000.a80;
import p000.an0;
import p000.bk1;
import p000.ct5;
import p000.d16;
import p000.dk1;
import p000.fy4;
import p000.gc2;
import p000.gm5;
import p000.iq5;
import p000.it5;
import p000.jt5;
import p000.kq5;
import p000.l87;
import p000.lda;
import p000.ll2;
import p000.lq5;
import p000.p93;
import p000.pg9;
import p000.qn3;
import p000.qp3;
import p000.sc9;
import p000.ss5;
import p000.t66;
import p000.te1;
import p000.wfb;
import p000.xc9;
import p000.xj2;

/* JADX INFO: renamed from: androidx.compose.foundation.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0125l extends d16 implements InterfaceC0354d, ll2, p93 {

    /* JADX INFO: renamed from: J */
    public int f2409J;

    /* JADX INFO: renamed from: K */
    public float f2410K;

    /* JADX INFO: renamed from: O */
    public pg9 f2414O;

    /* JADX INFO: renamed from: P */
    public C0312a f2415P;

    /* JADX INFO: renamed from: Q */
    public final t66 f2416Q;

    /* JADX INFO: renamed from: T */
    public final gc2 f2419T;

    /* JADX INFO: renamed from: L */
    public final sc9 f2411L = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: M */
    public final sc9 f2412M = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: N */
    public final t66 f2413N = AbstractC0278f.m1260j(Boolean.FALSE);

    /* JADX INFO: renamed from: R */
    public final t66 f2417R = AbstractC0278f.m1260j(new iq5());

    /* JADX INFO: renamed from: S */
    public final C0059a f2418S = AbstractC3489q9.m19771a(0.0f);

    public C0125l(int i, lq5 lq5Var, float f) {
        this.f2409J = i;
        this.f2410K = f;
        this.f2416Q = AbstractC0278f.m1260j(lq5Var);
        this.f2419T = AbstractC0278f.m1254d(new a45(3, lq5Var, this));
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        C0312a c0312a = this.f2415P;
        qp3 qp3VarM21977J = te1.m21977J(this);
        if (c0312a != null) {
            qp3VarM21977J.mo14485a(c0312a);
        }
        this.f2415P = qp3VarM21977J.mo14487c();
        m966a1();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        pg9 pg9Var = this.f2414O;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f2414O = null;
        C0312a c0312a = this.f2415P;
        if (c0312a != null) {
            te1.m21977J(this).mo14485a(c0312a);
            this.f2415P = null;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m965Z0() {
        return ((Number) this.f2419T.getValue()).intValue();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m966a1() {
        pg9 pg9Var = this.f2414O;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        if (this.f34836I) {
            this.f2414O = wfb.m23926u(m9971N0(), null, null, new MarqueeModifierNode$restartAnimation$1(pg9Var, this, null), 3);
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return 0;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return ct5Var.mo1510U(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, Integer.MAX_VALUE, 0, 0, 13, j));
        int iM10429g = dk1.m10429g(l87VarMo1514r.f49301a, j);
        sc9 sc9Var = this.f2412M;
        sc9Var.m21223i(iM10429g);
        this.f2411L.m21223i(l87VarMo1514r.f49301a);
        return jt5Var.mo9895M0(sc9Var.m21222h(), l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new a80(l87VarMo1514r, 1));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return ct5Var.mo1513p(i);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        float fM21222h;
        float fFloatValue;
        int iM21222h;
        long j;
        int iM24559a = xj2.m24559a(this.f2410K, 0.0f);
        sc9 sc9Var = this.f2412M;
        C0059a c0059a = this.f2418S;
        sc9 sc9Var2 = this.f2411L;
        if (iM24559a > 0) {
            int i = kq5.f48333a[c0358h.getLayoutDirection().ordinal()];
            if (i == 1) {
                fM21222h = ((Number) c0059a.m745d()).floatValue();
            } else if (i != 2) {
                gm5.m12750e();
                return;
            } else {
                fFloatValue = (-((Number) c0059a.m745d()).floatValue()) + (sc9Var2.m21222h() * 2) + m965Z0();
                iM21222h = sc9Var.m21222h();
                fM21222h = fFloatValue - iM21222h;
            }
        } else {
            int i2 = kq5.f48333a[c0358h.getLayoutDirection().ordinal()];
            if (i2 == 1) {
                fM21222h = (-((Number) c0059a.m745d()).floatValue()) + sc9Var2.m21222h() + m965Z0();
            } else if (i2 != 2) {
                gm5.m12750e();
                return;
            } else {
                fFloatValue = ((Number) c0059a.m745d()).floatValue() + sc9Var2.m21222h();
                iM21222h = sc9Var.m21222h();
                fM21222h = fFloatValue - iM21222h;
            }
        }
        boolean z = fM21222h < ((float) sc9Var2.m21222h());
        boolean z2 = ((float) sc9Var.m21222h()) + fM21222h > ((float) (m965Z0() + sc9Var2.m21222h()));
        float fM965Z0 = m965Z0() + sc9Var2.m21222h();
        an0 an0Var = c0358h.f4358a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L));
        C0312a c0312a = this.f2415P;
        if (c0312a != null) {
            j = 4294967295L;
            c0358h.mo1421Y((((long) ss5.m21693T(fIntBitsToFloat)) & 4294967295L) | (((long) sc9Var2.m21222h()) << 32), new fy4(c0358h, 9), c0312a);
        } else {
            j = 4294967295L;
        }
        float fM21222h2 = sc9Var.m21222h();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (an0Var.mo1422h() & j));
        C3309ls c3309ls = an0Var.f853b;
        long jM16483A = c3309ls.m16483A();
        c3309ls.m16515r().mo17016h();
        try {
            ((qn3) c3309ls.f50064b).m20070k(0.0f, 0.0f, fM21222h2, fIntBitsToFloat2, 1);
            float f = -fM21222h;
            ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(f, 0.0f);
            try {
                C0312a c0312a2 = this.f2415P;
                if (c0312a2 != null) {
                    if (z) {
                        lda.m16134t(c0358h, c0312a2);
                    }
                    if (z2) {
                        ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(fM965Z0, 0.0f);
                        try {
                            lda.m16134t(c0358h, c0312a2);
                            ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-fM965Z0, -0.0f);
                        } catch (Throwable th) {
                            ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-fM965Z0, -0.0f);
                            throw th;
                        }
                    }
                } else {
                    if (z) {
                        c0358h.m1614b();
                    }
                    if (z2) {
                        ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(fM965Z0, 0.0f);
                        try {
                            c0358h.m1614b();
                            ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-fM965Z0, -0.0f);
                        } catch (Throwable th2) {
                            ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-fM965Z0, -0.0f);
                            throw th2;
                        }
                    }
                }
                ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-f, -0.0f);
                AbstractC3393o1.m17751z(c3309ls, jM16483A);
            } catch (Throwable th3) {
                ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-f, -0.0f);
                throw th3;
            }
        } catch (Throwable th4) {
            AbstractC3393o1.m17751z(c3309ls, jM16483A);
            throw th4;
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        return ct5Var.mo1511c(Integer.MAX_VALUE);
    }

    @Override // p000.p93
    /* JADX INFO: renamed from: j0 */
    public final void mo971j0(FocusStateImpl focusStateImpl) {
        ((xc9) this.f2413N).setValue(Boolean.valueOf(focusStateImpl.getHasFocus()));
    }
}
