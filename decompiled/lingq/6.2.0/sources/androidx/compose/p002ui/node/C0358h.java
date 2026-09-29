package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;
import p000.AbstractC3393o1;
import p000.C3185ki;
import p000.C3309ls;
import p000.C3500qj;
import p000.C3538rj;
import p000.an0;
import p000.d16;
import p000.ea2;
import p000.el9;
import p000.fa1;
import p000.fa2;
import p000.fb2;
import p000.ll2;
import p000.ml2;
import p000.omd;
import p000.pq4;
import p000.te1;
import p000.vi0;
import p000.vi3;
import p000.x66;
import p000.xfa;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.node.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0358h implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final an0 f4358a = new an0();

    /* JADX INFO: renamed from: b */
    public ll2 f4359b;

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f4358a.mo901B(j);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: C0 */
    public final void mo591C0(vi0 vi0Var, long j, long j2, long j3, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        this.f4358a.mo591C0(vi0Var, j, j2, j3, f, ml2Var, fa1Var, i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f4358a.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f4358a.mo903F0(j);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: K0 */
    public final void mo592K0(vi0 vi0Var, long j, long j2, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        this.f4358a.mo592K0(vi0Var, j, j2, f, ml2Var, fa1Var, i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f4358a.mo904N(f);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: O */
    public final void mo593O(vi0 vi0Var, long j, long j2, float f, int i, float f2) {
        this.f4358a.mo593O(vi0Var, j, j2, f, i, f2);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f4358a.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return f / this.f4358a.mo594a();
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: Y */
    public final void mo1421Y(long j, final vi3 vi3Var, C0312a c0312a) {
        final ll2 ll2Var = this.f4359b;
        c0312a.m1428e(this, getLayoutDirection(), j, new vi3() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) throws Throwable {
                ll2 ll2Var2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                C0358h c0358h = this.f4234b;
                an0 an0Var = c0358h.f4358a;
                ll2 ll2Var3 = c0358h.f4359b;
                c0358h.f4359b = ll2Var;
                try {
                    fb2 fb2VarM16517t = interfaceC0310a.mo603o0().m16517t();
                    LayoutDirection layoutDirectionM16519w = interfaceC0310a.mo603o0().m16519w();
                    ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
                    long jM16483A = interfaceC0310a.mo603o0().m16483A();
                    C0312a c0312a2 = (C0312a) interfaceC0310a.mo603o0().f50065c;
                    vi3 vi3Var2 = vi3Var;
                    fb2 fb2VarM16517t2 = an0Var.f853b.m16517t();
                    LayoutDirection layoutDirectionM16519w2 = an0Var.f853b.m16519w();
                    ym0 ym0VarM16515r2 = an0Var.f853b.m16515r();
                    long jM16483A2 = an0Var.f853b.m16483A();
                    C3309ls c3309ls = an0Var.f853b;
                    try {
                        C0312a c0312a3 = (C0312a) c3309ls.f50065c;
                        c3309ls.m16499S(fb2VarM16517t);
                        c3309ls.m16500T(layoutDirectionM16519w);
                        c3309ls.m16497Q(ym0VarM16515r);
                        c3309ls.m16501U(jM16483A);
                        c3309ls.f50065c = c0312a2;
                        ym0VarM16515r.mo17016h();
                        try {
                            vi3Var2.invoke(c0358h);
                            ym0VarM16515r.mo17024p();
                            C3309ls c3309ls2 = an0Var.f853b;
                            c3309ls2.m16499S(fb2VarM16517t2);
                            c3309ls2.m16500T(layoutDirectionM16519w2);
                            c3309ls2.m16497Q(ym0VarM16515r2);
                            c3309ls2.m16501U(jM16483A2);
                            c3309ls2.f50065c = c0312a3;
                            c0358h.f4359b = ll2Var3;
                            return xfa.f68157a;
                        } catch (Throwable th) {
                            ll2Var2 = ll2Var3;
                            try {
                                ym0VarM16515r.mo17024p();
                                C3309ls c3309ls3 = an0Var.f853b;
                                c3309ls3.m16499S(fb2VarM16517t2);
                                c3309ls3.m16500T(layoutDirectionM16519w2);
                                c3309ls3.m16497Q(ym0VarM16515r2);
                                c3309ls3.m16501U(jM16483A2);
                                c3309ls3.f50065c = c0312a3;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                c0358h.f4359b = ll2Var2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ll2Var2 = ll2Var3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ll2Var2 = ll2Var3;
                }
            }
        });
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f4358a.mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final void m1614b() {
        an0 an0Var = this.f4358a;
        ym0 ym0VarM16515r = an0Var.f853b.m16515r();
        ea2 ea2Var = this.f4359b;
        if (ea2Var == null) {
            throw AbstractC3393o1.m17745t("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        d16 d16Var = (d16) ea2Var;
        d16 d16VarM21992f = d16Var.f34837a.f34842f;
        if (d16VarM21992f != null && (d16VarM21992f.f34840d & 4) != 0) {
            while (true) {
                if (d16VarM21992f != null) {
                    int i = d16VarM21992f.f34839c;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            d16VarM21992f = d16VarM21992f.f34842f;
                        }
                    }
                }
                d16VarM21992f = null;
                break;
            }
        } else {
            d16VarM21992f = null;
            break;
        }
        if (d16VarM21992f == null) {
            AbstractC0362l abstractC0362lM21976I = te1.m21976I(ea2Var, 4);
            if (abstractC0362lM21976I.mo1543f1() == d16Var.f34837a) {
                abstractC0362lM21976I = abstractC0362lM21976I.f4433K;
                abstractC0362lM21976I.getClass();
            }
            abstractC0362lM21976I.mo1548u1(ym0VarM16515r, (C0312a) an0Var.f853b.f50065c);
            return;
        }
        x66 x66Var = null;
        while (d16VarM21992f != null) {
            if (d16VarM21992f instanceof ll2) {
                ll2 ll2Var = (ll2) d16VarM21992f;
                C0312a c0312a = (C0312a) an0Var.f853b.f50065c;
                AbstractC0362l abstractC0362lM21976I2 = te1.m21976I(ll2Var, 4);
                long jM18152h0 = omd.m18152h0(abstractC0362lM21976I2.f49303c);
                C0357g c0357g = abstractC0362lM21976I2.f4432J;
                c0357g.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSharedDrawScope().m1615c(ym0VarM16515r, jM18152h0, abstractC0362lM21976I2, ll2Var, c0312a);
            } else if ((d16VarM21992f.f34839c & 4) != 0 && (d16VarM21992f instanceof fa2)) {
                int i2 = 0;
                for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                    if ((d16Var2.f34839c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            d16VarM21992f = d16Var2;
                        } else {
                            if (x66Var == null) {
                                x66Var = new x66(new d16[16]);
                            }
                            if (d16VarM21992f != null) {
                                x66Var.m24305c(d16VarM21992f);
                                d16VarM21992f = null;
                            }
                            x66Var.m24305c(d16Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            d16VarM21992f = te1.m21992f(x66Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1615c(ym0 ym0Var, long j, AbstractC0362l abstractC0362l, ll2 ll2Var, C0312a c0312a) {
        ll2 ll2Var2 = this.f4359b;
        this.f4359b = ll2Var;
        LayoutDirection layoutDirection = abstractC0362l.f4432J.f4328U;
        an0 an0Var = this.f4358a;
        fb2 fb2VarM16517t = an0Var.f853b.m16517t();
        C3309ls c3309ls = an0Var.f853b;
        LayoutDirection layoutDirectionM16519w = c3309ls.m16519w();
        ym0 ym0VarM16515r = c3309ls.m16515r();
        long jM16483A = c3309ls.m16483A();
        C0312a c0312a2 = (C0312a) c3309ls.f50065c;
        c3309ls.m16499S(abstractC0362l);
        c3309ls.m16500T(layoutDirection);
        c3309ls.m16497Q(ym0Var);
        c3309ls.m16501U(j);
        c3309ls.f50065c = c0312a;
        ym0Var.mo17016h();
        try {
            ll2Var.mo952i0(this);
            ym0Var.mo17024p();
            c3309ls.m16499S(fb2VarM16517t);
            c3309ls.m16500T(layoutDirectionM16519w);
            c3309ls.m16497Q(ym0VarM16515r);
            c3309ls.m16501U(jM16483A);
            c3309ls.f50065c = c0312a2;
            this.f4359b = ll2Var2;
        } catch (Throwable th) {
            ym0Var.mo17024p();
            c3309ls.m16499S(fb2VarM16517t);
            c3309ls.m16500T(layoutDirectionM16519w);
            c3309ls.m16497Q(ym0VarM16515r);
            c3309ls.m16501U(jM16483A);
            c3309ls.f50065c = c0312a2;
            throw th;
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f4358a.mo597d0();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f4358a.mo594a() * f;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    public final LayoutDirection getLayoutDirection() {
        return this.f4358a.f852a.f71735b;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: h */
    public final long mo1422h() {
        return this.f4358a.mo1422h();
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: h0 */
    public final void mo598h0(long j, long j2, long j3, long j4, ml2 ml2Var, int i) {
        this.f4358a.mo598h0(j, j2, j3, j4, ml2Var, i);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: k */
    public final void mo599k(C3500qj c3500qj, long j, float f, ml2 ml2Var) {
        this.f4358a.mo599k(c3500qj, j, f, ml2Var);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: l0 */
    public final void mo600l0(vi0 vi0Var, float f, long j, float f2, ml2 ml2Var) {
        this.f4358a.mo600l0(vi0Var, f, j, f2, ml2Var);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: n0 */
    public final void mo601n0(long j, float f, float f2, long j2, long j3, float f3, el9 el9Var) {
        this.f4358a.mo601n0(j, f, f2, j2, j3, f3, el9Var);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: o */
    public final void mo602o(long j, float f, long j2, float f2, ml2 ml2Var) {
        this.f4358a.mo602o(j, f, j2, f2, ml2Var);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: o0 */
    public final C3309ls mo603o0() {
        return this.f4358a.f853b;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f4358a.mo913q0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f4358a.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f4358a.mo915v(j);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: w */
    public final void mo604w(long j, long j2, long j3, float f, int i, C3538rj c3538rj) {
        this.f4358a.mo604w(j, j2, j3, f, i, c3538rj);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f4358a.mo916w0(f);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: x0 */
    public final void mo605x0(C3185ki c3185ki, long j, long j2, long j3, float f, fa1 fa1Var, int i) {
        this.f4358a.mo605x0(c3185ki, j, j2, j3, f, fa1Var, i);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: y */
    public final void mo606y(C3500qj c3500qj, vi0 vi0Var, float f, ml2 ml2Var, fa1 fa1Var, int i) {
        this.f4358a.mo606y(c3500qj, vi0Var, f, ml2Var, fa1Var, i);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: z */
    public final void mo607z(long j, long j2, long j3, float f, ml2 ml2Var, int i) {
        this.f4358a.mo607z(j, j2, j3, f, ml2Var, i);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a
    /* JADX INFO: renamed from: z0 */
    public final long mo1423z0() {
        return this.f4358a.mo1423z0();
    }
}
