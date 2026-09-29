package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;
import p000.C3185ki;
import p000.C3309ls;
import p000.C3500qj;
import p000.C3538rj;
import p000.an0;
import p000.do7;
import p000.el9;
import p000.fa1;
import p000.fb2;
import p000.ml2;
import p000.vi0;
import p000.vi3;
import p000.w33;
import p000.x89;
import p000.xfa;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0310a extends fb2 {
    /* JADX INFO: renamed from: A0 */
    static /* synthetic */ void m1408A0(InterfaceC0310a interfaceC0310a, C3500qj c3500qj, long j, float f, ml2 ml2Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            ml2Var = w33.f66328a;
        }
        interfaceC0310a.mo599k(c3500qj, j, f2, ml2Var);
    }

    /* JADX INFO: renamed from: E */
    static void m1410E(C0358h c0358h, C3185ki c3185ki, long j, float f, fa1 fa1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        int i2 = (i & 32) != 0 ? 3 : 0;
        an0 an0Var = c0358h.f4358a;
        an0Var.f852a.f71736c.mo17019k(c3185ki, j, an0Var.m595c(null, w33.f66328a, f2, fa1Var, i2, 1));
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m1412G(InterfaceC0310a interfaceC0310a, vi0 vi0Var, long j, long j2, long j3, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        interfaceC0310a.mo591C0(vi0Var, j4, (i & 4) != 0 ? m1415X(interfaceC0310a.mo1422h(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? w33.f66328a : ml2Var, (i & 64) != 0 ? null : fa1Var, (i & 128) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: G0 */
    static /* synthetic */ void m1413G0(InterfaceC0310a interfaceC0310a, C3500qj c3500qj, vi0 vi0Var, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            ml2Var = w33.f66328a;
        }
        ml2 ml2Var2 = ml2Var;
        if ((i & 16) != 0) {
            fa1Var = null;
        }
        interfaceC0310a.mo606y(c3500qj, vi0Var, f2, ml2Var2, fa1Var, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: L0 */
    static /* synthetic */ void m1414L0(InterfaceC0310a interfaceC0310a, long j, long j2, long j3, float f, el9 el9Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        interfaceC0310a.mo607z(j, j4, (i2 & 4) != 0 ? m1415X(interfaceC0310a.mo1422h(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? w33.f66328a : el9Var, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: X */
    static long m1415X(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: Z */
    static void m1416Z(InterfaceC0310a interfaceC0310a, C3185ki c3185ki, long j, long j2, float f, fa1 fa1Var, int i, int i2) {
        interfaceC0310a.mo605x0(c3185ki, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, fa1Var, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: c0 */
    static /* synthetic */ void m1417c0(InterfaceC0310a interfaceC0310a, long j, float f, long j2, float f2, ml2 ml2Var, int i) {
        if ((i & 2) != 0) {
            f = x89.m24406c(interfaceC0310a.mo1422h()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = interfaceC0310a.mo1423z0();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        interfaceC0310a.mo602o(j, f3, j3, f2, (i & 16) != 0 ? w33.f66328a : ml2Var);
    }

    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ void m1418s0(InterfaceC0310a interfaceC0310a, vi0 vi0Var, long j, long j2, float f, ml2 ml2Var, fa1 fa1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        interfaceC0310a.mo592K0(vi0Var, j3, (i2 & 4) != 0 ? m1415X(interfaceC0310a.mo1422h(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? w33.f66328a : ml2Var, (i2 & 32) != 0 ? null : fa1Var, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: t0 */
    static /* synthetic */ void m1419t0(InterfaceC0310a interfaceC0310a, long j, float f, float f2, long j2, long j3, float f3, el9 el9Var, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        interfaceC0310a.mo601n0(j, f, f2, j4, (i & 32) != 0 ? m1415X(interfaceC0310a.mo1422h(), j4) : j3, (i & 64) != 0 ? 1.0f : f3, el9Var);
    }

    /* JADX INFO: renamed from: v0 */
    static /* synthetic */ void m1420v0(InterfaceC0310a interfaceC0310a, vi0 vi0Var, long j, long j2, float f, float f2, int i) {
        int i2 = (i & 16) != 0 ? 0 : 1;
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        interfaceC0310a.mo593O(vi0Var, j, j2, f, i2, f2);
    }

    /* JADX INFO: renamed from: C0 */
    void mo591C0(vi0 vi0Var, long j, long j2, long j3, float f, ml2 ml2Var, fa1 fa1Var, int i);

    /* JADX INFO: renamed from: K0 */
    void mo592K0(vi0 vi0Var, long j, long j2, float f, ml2 ml2Var, fa1 fa1Var, int i);

    /* JADX INFO: renamed from: O */
    void mo593O(vi0 vi0Var, long j, long j2, float f, int i, float f2);

    /* JADX INFO: renamed from: Y */
    default void mo1421Y(long j, final vi3 vi3Var, C0312a c0312a) {
        c0312a.m1428e(this, getLayoutDirection(), j, new vi3() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                C3309ls c3309lsMo603o0;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                fb2 fb2VarM16517t = interfaceC0310a.mo603o0().m16517t();
                LayoutDirection layoutDirectionM16519w = interfaceC0310a.mo603o0().m16519w();
                ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
                long jM16483A = interfaceC0310a.mo603o0().m16483A();
                C0312a c0312a2 = (C0312a) interfaceC0310a.mo603o0().f50065c;
                vi3 vi3Var2 = vi3Var;
                InterfaceC0310a interfaceC0310a2 = this.f3956b;
                fb2 fb2VarM16517t2 = interfaceC0310a2.mo603o0().m16517t();
                LayoutDirection layoutDirectionM16519w2 = interfaceC0310a2.mo603o0().m16519w();
                ym0 ym0VarM16515r2 = interfaceC0310a2.mo603o0().m16515r();
                long jM16483A2 = interfaceC0310a2.mo603o0().m16483A();
                C0312a c0312a3 = (C0312a) interfaceC0310a2.mo603o0().f50065c;
                C3309ls c3309lsMo603o1 = interfaceC0310a2.mo603o0();
                c3309lsMo603o1.m16499S(fb2VarM16517t);
                c3309lsMo603o1.m16500T(layoutDirectionM16519w);
                c3309lsMo603o1.m16497Q(ym0VarM16515r);
                c3309lsMo603o1.m16501U(jM16483A);
                c3309lsMo603o1.f50065c = c0312a2;
                ym0VarM16515r.mo17016h();
                try {
                    vi3Var2.invoke(interfaceC0310a2);
                    return xfa.f68157a;
                } finally {
                    ym0VarM16515r.mo17024p();
                    c3309lsMo603o0 = interfaceC0310a2.mo603o0();
                    c3309lsMo603o0.m16499S(fb2VarM16517t2);
                    c3309lsMo603o0.m16500T(layoutDirectionM16519w2);
                    c3309lsMo603o0.m16497Q(ym0VarM16515r2);
                    c3309lsMo603o0.m16501U(jM16483A2);
                    c3309lsMo603o0.f50065c = c0312a3;
                }
            }
        });
    }

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: h */
    default long mo1422h() {
        return mo603o0().m16483A();
    }

    /* JADX INFO: renamed from: h0 */
    void mo598h0(long j, long j2, long j3, long j4, ml2 ml2Var, int i);

    /* JADX INFO: renamed from: k */
    void mo599k(C3500qj c3500qj, long j, float f, ml2 ml2Var);

    /* JADX INFO: renamed from: l0 */
    void mo600l0(vi0 vi0Var, float f, long j, float f2, ml2 ml2Var);

    /* JADX INFO: renamed from: n0 */
    void mo601n0(long j, float f, float f2, long j2, long j3, float f3, el9 el9Var);

    /* JADX INFO: renamed from: o */
    void mo602o(long j, float f, long j2, float f2, ml2 ml2Var);

    /* JADX INFO: renamed from: o0 */
    C3309ls mo603o0();

    /* JADX INFO: renamed from: w */
    void mo604w(long j, long j2, long j3, float f, int i, C3538rj c3538rj);

    /* JADX INFO: renamed from: x0 */
    void mo605x0(C3185ki c3185ki, long j, long j2, long j3, float f, fa1 fa1Var, int i);

    /* JADX INFO: renamed from: y */
    void mo606y(C3500qj c3500qj, vi0 vi0Var, float f, ml2 ml2Var, fa1 fa1Var, int i);

    /* JADX INFO: renamed from: z */
    void mo607z(long j, long j2, long j3, float f, ml2 ml2Var, int i);

    /* JADX INFO: renamed from: z0 */
    default long mo1423z0() {
        return do7.m10538n(mo603o0().m16483A());
    }
}
