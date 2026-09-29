package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0369a;
import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import no.C7828f;
import no.InterfaceC7882z;
import p021b0.AbstractC1283h;
import p021b0.C1278c;
import p021b0.C1279d;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5338t0;
import p260m8.C7499b;
import p267n0.AbstractC7687r;
import p267n0.C7682m;
import p267n0.C7686q;
import p374s.C8905f;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.C9169u;
import p423v.C9615m;
import p424v0.C9617a;
import p424v0.C9623g;
import p424v0.InterfaceC9619c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends AbstractC1283h implements InterfaceC5338t0 {

    /* JADX INFO: renamed from: b */
    public final boolean f2575b;

    /* JADX INFO: renamed from: c */
    public final float f2576c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5301c1<C9169u> f2577d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5301c1<C1278c> f2578e;

    /* JADX INFO: renamed from: f */
    public final C7682m<C9615m, RippleAnimation> f2579f;

    public CommonRippleIndicationInstance() {
        throw null;
    }

    public CommonRippleIndicationInstance(boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0, InterfaceC5312g0 interfaceC5312g1) {
        super(interfaceC5312g1, z10);
        this.f2575b = z10;
        this.f2576c = f3;
        this.f2577d = interfaceC5312g0;
        this.f2578e = interfaceC5312g1;
        this.f2579f = new C7682m<>();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: a */
    public final void mo1536a() {
        this.f2579f.clear();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: b */
    public final void mo1537b() {
        this.f2579f.clear();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p386t.InterfaceC9127s
    /* JADX INFO: renamed from: d */
    public final void mo1547d(InterfaceC9619c interfaceC9619c) {
        this = this;
        interfaceC9619c = interfaceC9619c;
        C5207g.m11111f(interfaceC9619c, "<this>");
        long j10 = this.f2577d.getValue().f47705a;
        interfaceC9619c.mo12668E0();
        this.m4788f(interfaceC9619c, this.f2576c, j10);
        Object it = this.f2579f.f42171b.iterator();
        while (((AbstractC7687r) it).hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) ((C7686q) it).next()).getValue();
            float f3 = this.f2578e.getValue().f7960d;
            if (!(f3 == 0.0f)) {
                long jM17496b = C9169u.m17496b(j10, f3);
                rippleAnimation.getClass();
                if (rippleAnimation.f2593d == null) {
                    long jMo12674d = interfaceC9619c.mo12674d();
                    float f10 = C1279d.f7961a;
                    rippleAnimation.f2593d = Float.valueOf(Math.max(C8944f.m17177d(jMo12674d), C8944f.m17175b(jMo12674d)) * 0.3f);
                }
                Float f11 = rippleAnimation.f2594e;
                boolean z10 = rippleAnimation.f2592c;
                if (f11 == null) {
                    float f12 = rippleAnimation.f2591b;
                    rippleAnimation.f2594e = Float.isNaN(f12) ? Float.valueOf(C1279d.m4782a(interfaceC9619c, z10, interfaceC9619c.mo12674d())) : Float.valueOf(interfaceC9619c.mo1463i0(f12));
                }
                if (rippleAnimation.f2590a == null) {
                    rippleAnimation.f2590a = new C8941c(interfaceC9619c.mo12680y0());
                }
                if (rippleAnimation.f2595f == null) {
                    rippleAnimation.f2595f = new C8941c(C7499b.m14932c(C8944f.m17177d(interfaceC9619c.mo12674d()) / 2.0f, C8944f.m17175b(interfaceC9619c.mo12674d()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) rippleAnimation.f2601l.getValue()).booleanValue() || ((Boolean) rippleAnimation.f2600k.getValue()).booleanValue()) ? rippleAnimation.f2596g.m1383c().floatValue() : 1.0f;
                Float f13 = rippleAnimation.f2593d;
                C5207g.m11108c(f13);
                float fFloatValue2 = f13.floatValue();
                Float f14 = rippleAnimation.f2594e;
                C5207g.m11108c(f14);
                float fFloatValue3 = f14.floatValue();
                float fFloatValue4 = rippleAnimation.f2597h.m1383c().floatValue();
                float f15 = 1;
                float f16 = (fFloatValue4 * fFloatValue3) + ((f15 - fFloatValue4) * fFloatValue2);
                C8941c c8941c = rippleAnimation.f2590a;
                C5207g.m11108c(c8941c);
                float fM17164c = C8941c.m17164c(c8941c.f46892a);
                C8941c c8941c2 = rippleAnimation.f2595f;
                C5207g.m11108c(c8941c2);
                float fM17164c2 = C8941c.m17164c(c8941c2.f46892a);
                C0369a<Float, C8905f> c0369a = rippleAnimation.f2598i;
                float fFloatValue5 = c0369a.m1383c().floatValue();
                float f17 = (f15 - fFloatValue5) * fM17164c;
                C8941c c8941c3 = rippleAnimation.f2590a;
                C5207g.m11108c(c8941c3);
                float fM17165d = C8941c.m17165d(c8941c3.f46892a);
                C8941c c8941c4 = rippleAnimation.f2595f;
                C5207g.m11108c(c8941c4);
                float fM17165d2 = C8941c.m17165d(c8941c4.f46892a);
                float fFloatValue6 = c0369a.m1383c().floatValue();
                long jM14932c = C7499b.m14932c((fFloatValue5 * fM17164c2) + f17, (fFloatValue6 * fM17165d2) + ((f15 - fFloatValue6) * fM17165d));
                long jM17496b2 = C9169u.m17496b(jM17496b, C9169u.m17498d(jM17496b) * fFloatValue);
                if (z10) {
                    float fM17177d = C8944f.m17177d(interfaceC9619c.mo12674d());
                    float fM17175b = C8944f.m17175b(interfaceC9619c.mo12674d());
                    C9617a.b bVarMo12676l0 = interfaceC9619c.mo12676l0();
                    long jMo18081d = bVarMo12676l0.mo18081d();
                    bVarMo12676l0.mo18080b().mo17420d();
                    bVarMo12676l0.f49292a.m18083b(0.0f, 0.0f, fM17177d, fM17175b, 1);
                    interfaceC9619c.mo12678r0(jM17496b2, (124 & 2) != 0 ? C8944f.m17176c(interfaceC9619c.mo12674d()) / 2.0f : f16, (124 & 4) != 0 ? interfaceC9619c.mo12680y0() : jM14932c, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? C9623g.f49295a : null, null, (124 & 64) != 0 ? 3 : 0);
                    bVarMo12676l0.mo18080b().mo17428o();
                    bVarMo12676l0.mo18079a(jMo18081d);
                    j10 = j10;
                } else {
                    interfaceC9619c.mo12678r0(jM17496b2, (124 & 2) != 0 ? C8944f.m17176c(interfaceC9619c.mo12674d()) / 2.0f : f16, (124 & 4) != 0 ? interfaceC9619c.mo12680y0() : jM14932c, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? C9623g.f49295a : null, null, (124 & 64) != 0 ? 3 : 0);
                }
            }
        }
    }

    @Override // p021b0.AbstractC1283h
    /* JADX INFO: renamed from: e */
    public final void mo1548e(C9615m c9615m, InterfaceC7882z interfaceC7882z) {
        C5207g.m11111f(c9615m, "interaction");
        C5207g.m11111f(interfaceC7882z, "scope");
        C7682m<C9615m, RippleAnimation> c7682m = this.f2579f;
        Iterator it = c7682m.f42171b.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            rippleAnimation.f2601l.setValue(Boolean.TRUE);
            rippleAnimation.f2599j.m15637T(C9072e.f47360a);
        }
        boolean z10 = this.f2575b;
        RippleAnimation rippleAnimation2 = new RippleAnimation(z10 ? new C8941c(c9615m.f49282a) : null, this.f2576c, z10);
        c7682m.put(c9615m, rippleAnimation2);
        C7828f.m15570d(interfaceC7882z, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation2, this, c9615m, null), 3);
    }

    @Override // p021b0.AbstractC1283h
    /* JADX INFO: renamed from: g */
    public final void mo1549g(C9615m c9615m) {
        C5207g.m11111f(c9615m, "interaction");
        RippleAnimation rippleAnimation = this.f2579f.get(c9615m);
        if (rippleAnimation != null) {
            rippleAnimation.f2601l.setValue(Boolean.TRUE);
            rippleAnimation.f2599j.m15637T(C9072e.f47360a);
        }
    }
}
