package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;
import p000.ap9;
import p000.b0a;
import p000.bk1;
import p000.bp9;
import p000.ct5;
import p000.d16;
import p000.dk1;
import p000.fa4;
import p000.it5;
import p000.jt5;
import p000.k54;
import p000.l43;
import p000.l87;
import p000.v56;
import p000.wfb;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.material3.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0250j0 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public v56 f3539J;

    /* JADX INFO: renamed from: K */
    public boolean f3540K;

    /* JADX INFO: renamed from: L */
    public l43 f3541L;

    /* JADX INFO: renamed from: M */
    public boolean f3542M;

    /* JADX INFO: renamed from: N */
    public C0059a f3543N;

    /* JADX INFO: renamed from: O */
    public C0059a f3544O;

    /* JADX INFO: renamed from: P */
    public float f3545P;

    /* JADX INFO: renamed from: Q */
    public float f3546Q;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        wfb.m23926u(m9971N0(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        this.f3543N = null;
        this.f3544O = null;
        this.f3546Q = Float.NaN;
        this.f3545P = Float.NaN;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        float f;
        boolean z = (ct5Var.mo1511c(bk1.m3801i(j)) == 0 || ct5Var.mo1513p(bk1.m3800h(j)) == 0) ? false : true;
        if (this.f3542M) {
            f = bp9.f8816n;
        } else {
            f = (z || this.f3540K) ? ap9.f7332a : ap9.f7333b;
        }
        float fMo912g0 = jt5Var.mo912g0(f);
        C0059a c0059a = this.f3544O;
        int iFloatValue = (int) (c0059a != null ? ((Number) c0059a.m745d()).floatValue() : fMo912g0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            k54.m14852a("width and height must be >= 0");
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10430h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo912g1 = jt5Var.mo912g0((ap9.f7335d - jt5Var.mo906W(fMo912g0)) / 2.0f);
        float fMo912g2 = jt5Var.mo912g0((ap9.f7334c - ap9.f7332a) - ap9.f7336e);
        boolean z2 = this.f3542M;
        if (z2 && this.f3540K) {
            fMo912g1 = fMo912g2 - jt5Var.mo912g0(bp9.f8823u);
        } else if (z2 && !this.f3540K) {
            fMo912g1 = jt5Var.mo912g0(bp9.f8823u);
        } else if (this.f3540K) {
            fMo912g1 = fMo912g2;
        }
        C0059a c0059a2 = this.f3544O;
        if (!fa4.m11649k(c0059a2 != null ? (Float) ((xc9) c0059a2.f1542e).getValue() : null, fMo912g0)) {
            wfb.m23926u(m9971N0(), null, null, new ThumbNode$measure$1(this, fMo912g0, null), 3);
        }
        C0059a c0059a3 = this.f3543N;
        if (!fa4.m11649k(c0059a3 != null ? (Float) ((xc9) c0059a3.f1542e).getValue() : null, fMo912g1)) {
            wfb.m23926u(m9971N0(), null, null, new ThumbNode$measure$2(this, fMo912g1, null), 3);
        }
        if (Float.isNaN(this.f3546Q) && Float.isNaN(this.f3545P)) {
            this.f3546Q = fMo912g0;
            this.f3545P = fMo912g1;
        }
        return jt5Var.mo9895M0(iFloatValue, iFloatValue, AbstractC3194a.m15360M(), new b0a(l87VarMo1514r, this, fMo912g1));
    }
}
