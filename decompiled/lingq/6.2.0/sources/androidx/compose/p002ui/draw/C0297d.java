package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;
import p000.InterfaceC3571se;
import p000.an0;
import p000.bk1;
import p000.ct5;
import p000.d16;
import p000.dk1;
import p000.fa1;
import p000.it5;
import p000.jl1;
import p000.jt5;
import p000.l87;
import p000.ll2;
import p000.qn3;
import p000.vi3;
import p000.x74;
import p000.x89;
import p000.xfa;
import p000.y27;

/* JADX INFO: renamed from: androidx.compose.ui.draw.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0297d extends d16 implements InterfaceC0354d, ll2 {

    /* JADX INFO: renamed from: J */
    public y27 f3866J;

    /* JADX INFO: renamed from: K */
    public boolean f3867K;

    /* JADX INFO: renamed from: L */
    public InterfaceC3571se f3868L;

    /* JADX INFO: renamed from: M */
    public jl1 f3869M;

    /* JADX INFO: renamed from: N */
    public float f3870N;

    /* JADX INFO: renamed from: O */
    public fa1 f3871O;

    /* JADX INFO: renamed from: a1 */
    public static boolean m1350a1(long j) {
        return !x89.m24404a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: b1 */
    public static boolean m1351b1(long j) {
        return !x89.m24404a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m1352Z0() {
        return this.f3867K && this.f3866J.mo1445i() != 9205357640488583168L;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!m1352Z0()) {
            return ct5Var.mo1512l(i);
        }
        long jM1353c1 = m1353c1(dk1.m10424b(0, 0, 0, i, 7));
        return Math.max(bk1.m3803k(jM1353c1), ct5Var.mo1512l(i));
    }

    /* JADX INFO: renamed from: c1 */
    public final long m1353c1(long j) {
        boolean z = false;
        boolean z2 = bk1.m3797e(j) && bk1.m3796d(j);
        if (bk1.m3799g(j) && bk1.m3798f(j)) {
            z = true;
        }
        if ((!m1352Z0() && z2) || z) {
            return bk1.m3794b(bk1.m3801i(j), 0, bk1.m3800h(j), 0, 10, j);
        }
        long jMo1445i = this.f3866J.mo1445i();
        int iRound = m1351b1(jMo1445i) ? Math.round(Float.intBitsToFloat((int) (jMo1445i >> 32))) : bk1.m3803k(j);
        int iRound2 = m1350a1(jMo1445i) ? Math.round(Float.intBitsToFloat((int) (jMo1445i & 4294967295L))) : bk1.m3802j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dk1.m10428f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(dk1.m10429g(iRound, j))) << 32);
        if (m1352Z0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m1351b1(this.f3866J.mo1445i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f3866J.mo1445i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m1350a1(this.f3866J.mo1445i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f3866J.mo1445i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : x74.m24342I(jFloatToRawIntBits2, this.f3869M.mo10837b(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return bk1.m3794b(dk1.m10429g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, dk1.m10428f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!m1352Z0()) {
            return ct5Var.mo1510U(i);
        }
        long jM1353c1 = m1353c1(dk1.m10424b(0, i, 0, 0, 13));
        return Math.max(bk1.m3802j(jM1353c1), ct5Var.mo1510U(i));
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final l87 l87VarMo1514r = ct5Var.mo1514r(m1353c1(j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j.m1521j((AbstractC0343j) obj, l87VarMo1514r, 0, 0);
                return xfa.f68157a;
            }
        });
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!m1352Z0()) {
            return ct5Var.mo1513p(i);
        }
        long jM1353c1 = m1353c1(dk1.m10424b(0, 0, 0, i, 7));
        return Math.max(bk1.m3803k(jM1353c1), ct5Var.mo1513p(i));
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        long jMo1445i = this.f3866J.mo1445i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m1351b1(jMo1445i) ? Float.intBitsToFloat((int) (jMo1445i >> 32)) : Float.intBitsToFloat((int) (c0358h.f4358a.mo1422h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m1350a1(jMo1445i) ? Float.intBitsToFloat((int) (jMo1445i & 4294967295L)) : Float.intBitsToFloat((int) (c0358h.f4358a.mo1422h() & 4294967295L)))) & 4294967295L);
        an0 an0Var = c0358h.f4358a;
        long jM24342I = (Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)) == 0.0f || Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L)) == 0.0f) ? 0L : x74.m24342I(jFloatToRawIntBits, this.f3869M.mo10837b(jFloatToRawIntBits, an0Var.mo1422h()));
        long jMo10276a = this.f3868L.mo10276a((((long) Math.round(Float.intBitsToFloat((int) (jM24342I >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM24342I & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L)))) & 4294967295L), c0358h.getLayoutDirection());
        float f = (int) (jMo10276a >> 32);
        float f2 = (int) (jMo10276a & 4294967295L);
        ((qn3) an0Var.f853b.f50064b).m20067V(f, f2);
        try {
            this.f3866J.m24872e(c0358h, jM24342I, this.f3870N, this.f3871O);
            ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
            c0358h.m1614b();
        } catch (Throwable th) {
            ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!m1352Z0()) {
            return ct5Var.mo1511c(i);
        }
        long jM1353c1 = m1353c1(dk1.m10424b(0, i, 0, 0, 13));
        return Math.max(bk1.m3802j(jM1353c1), ct5Var.mo1511c(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f3866J + ", sizeToIntrinsics=" + this.f3867K + ", alignment=" + this.f3868L + ", alpha=" + this.f3870N + ", colorFilter=" + this.f3871O + ')';
    }
}
