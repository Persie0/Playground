package p350r;

import p374s.InterfaceC8932t;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: r.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8679m implements InterfaceC8932t {

    /* JADX INFO: renamed from: a */
    public final C8675i f46270a;

    public C8679m(InterfaceC10015c interfaceC10015c) {
        this.f46270a = new C8675i(C8680n.f46271a, interfaceC10015c);
    }

    @Override // p374s.InterfaceC8932t
    /* JADX INFO: renamed from: a */
    public final void mo16931a() {
    }

    @Override // p374s.InterfaceC8932t
    /* JADX INFO: renamed from: b */
    public final float mo16932b(float f3, long j10) {
        long j11 = j10 / 1000000;
        C8675i.a aVarM16929a = this.f46270a.m16929a(f3);
        long j12 = aVarM16929a.f46266c;
        return (((Math.signum(aVarM16929a.f46264a) * C8667a.m16924a(j12 > 0 ? j11 / j12 : 1.0f).f46248b) * aVarM16929a.f46265b) / j12) * 1000.0f;
    }

    @Override // p374s.InterfaceC8932t
    /* JADX INFO: renamed from: c */
    public final float mo16933c(float f3, float f10, long j10) {
        long j11 = j10 / 1000000;
        C8675i.a aVarM16929a = this.f46270a.m16929a(f10);
        long j12 = aVarM16929a.f46266c;
        return (Math.signum(aVarM16929a.f46264a) * aVarM16929a.f46265b * C8667a.m16924a(j12 > 0 ? j11 / j12 : 1.0f).f46247a) + f3;
    }

    @Override // p374s.InterfaceC8932t
    /* JADX INFO: renamed from: d */
    public final long mo16934d(float f3) {
        return ((long) (Math.exp(this.f46270a.m16930b(f3) / (((double) C8676j.f46267a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p374s.InterfaceC8932t
    /* JADX INFO: renamed from: e */
    public final float mo16935e(float f3, float f10) {
        C8675i c8675i = this.f46270a;
        double dM16930b = c8675i.m16930b(f10);
        double d10 = C8676j.f46267a;
        return (Math.signum(f10) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dM16930b) * ((double) (c8675i.f46261a * c8675i.f46263c))))) + f3;
    }
}
