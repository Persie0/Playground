package p424v0;

import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.C9151j;
import p387t0.InterfaceC9165q;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9618b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9620d f49294a;

    public C9618b(InterfaceC9620d interfaceC9620d) {
        this.f49294a = interfaceC9620d;
    }

    /* JADX INFO: renamed from: a */
    public final void m18082a(C9151j c9151j, int i10) {
        this.f49294a.mo18080b().mo17417a(c9151j, i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m18083b(float f3, float f10, float f11, float f12, int i10) {
        this.f49294a.mo18080b().mo17426m(f3, f10, f11, f12, i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m18084c(float f3, float f10, float f11, float f12) {
        InterfaceC9620d interfaceC9620d = this.f49294a;
        InterfaceC9165q interfaceC9165qMo18080b = interfaceC9620d.mo18080b();
        long jM16788m = C8584v.m16788m(C8944f.m17177d(interfaceC9620d.mo18081d()) - (f11 + f3), C8944f.m17175b(interfaceC9620d.mo18081d()) - (f12 + f10));
        if (!(C8944f.m17177d(jM16788m) >= 0.0f && C8944f.m17175b(jM16788m) >= 0.0f)) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
        interfaceC9620d.mo18079a(jM16788m);
        interfaceC9165qMo18080b.mo17427n(f3, f10);
    }

    /* JADX INFO: renamed from: d */
    public final void m18085d(long j10) {
        InterfaceC9165q interfaceC9165qMo18080b = this.f49294a.mo18080b();
        interfaceC9165qMo18080b.mo17427n(C8941c.m17164c(j10), C8941c.m17165d(j10));
        interfaceC9165qMo18080b.mo17425l();
        interfaceC9165qMo18080b.mo17427n(-C8941c.m17164c(j10), -C8941c.m17165d(j10));
    }

    /* JADX INFO: renamed from: e */
    public final void m18086e(float[] fArr) {
        this.f49294a.mo18080b().mo17423i(fArr);
    }

    /* JADX INFO: renamed from: f */
    public final void m18087f(float f3, float f10) {
        this.f49294a.mo18080b().mo17427n(f3, f10);
    }
}
