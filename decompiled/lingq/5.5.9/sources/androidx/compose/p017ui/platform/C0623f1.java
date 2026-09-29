package androidx.compose.p017ui.platform;

import p338qd.C8573r0;
import p375s0.C8939a;
import p375s0.C8942d;
import p387t0.C9151j;
import p387t0.InterfaceC9138c0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0623f1 {
    /* JADX INFO: renamed from: a */
    public static final boolean m2350a(InterfaceC9138c0 interfaceC9138c0, float f3, float f10) {
        C8942d c8942d = new C8942d(f3 - 0.005f, f10 - 0.005f, f3 + 0.005f, f10 + 0.005f);
        C9151j c9151jM16758t = C8573r0.m16758t();
        c9151jM16758t.m17471n(c8942d);
        C9151j c9151jM16758t2 = C8573r0.m16758t();
        c9151jM16758t2.mo17411g(interfaceC9138c0, c9151jM16758t, 1);
        boolean zM17472o = c9151jM16758t2.m17472o();
        c9151jM16758t2.mo17407c();
        c9151jM16758t.mo17407c();
        return !zM17472o;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m2351b(float f3, float f10, float f11, float f12, long j10) {
        float f13 = f3 - f11;
        float f14 = f10 - f12;
        float fM17157b = C8939a.m17157b(j10);
        float fM17158c = C8939a.m17158c(j10);
        return ((f14 * f14) / (fM17158c * fM17158c)) + ((f13 * f13) / (fM17157b * fM17157b)) <= 1.0f;
    }
}
