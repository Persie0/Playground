package p374s;

import ae.C0062b;
import dm.C5207g;
import p338qd.C8573r0;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8919m<T, V extends AbstractC8911i> implements InterfaceC8895a<T, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8916k0<V> f46827a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8906f0<T, V> f46828b;

    /* JADX INFO: renamed from: c */
    public final T f46829c;

    /* JADX INFO: renamed from: d */
    public final V f46830d;

    /* JADX INFO: renamed from: e */
    public final V f46831e;

    /* JADX INFO: renamed from: f */
    public final V f46832f;

    /* JADX INFO: renamed from: g */
    public final T f46833g;

    /* JADX INFO: renamed from: h */
    public final long f46834h;

    public C8919m(InterfaceC8921n<T> interfaceC8921n, InterfaceC8906f0<T, V> interfaceC8906f0, T t10, V v10) {
        C5207g.m11111f(interfaceC8921n, "animationSpec");
        C5207g.m11111f(interfaceC8906f0, "typeConverter");
        C5207g.m11111f(v10, "initialVelocityVector");
        C8924o0 c8924o0Mo17151a = interfaceC8921n.mo17151a(interfaceC8906f0);
        C5207g.m11111f(c8924o0Mo17151a, "animationSpec");
        this.f46827a = c8924o0Mo17151a;
        this.f46828b = interfaceC8906f0;
        this.f46829c = t10;
        V vMo528n = interfaceC8906f0.mo17140a().mo528n(t10);
        this.f46830d = vMo528n;
        this.f46831e = (V) C8573r0.m16709Y(v10);
        this.f46833g = (T) interfaceC8906f0.mo17141b().mo528n(c8924o0Mo17151a.m17153e(vMo528n, v10));
        long jM17152d = c8924o0Mo17151a.m17152d(vMo528n, v10);
        this.f46834h = jM17152d;
        V v11 = (V) C8573r0.m16709Y(c8924o0Mo17151a.mo17148b(jM17152d, vMo528n, v10));
        this.f46832f = v11;
        int iMo17136b = v11.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v12 = this.f46832f;
            v12.mo17139e(i10, C0062b.m357j0(v12.mo17135a(i10), -this.f46827a.mo17147a(), this.f46827a.mo17147a()));
        }
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: a */
    public final boolean mo17126a() {
        return false;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: b */
    public final long mo17127b() {
        return this.f46834h;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: c */
    public final InterfaceC8906f0<T, V> mo17128c() {
        return this.f46828b;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: d */
    public final V mo17129d(long j10) {
        if (m17130e(j10)) {
            return this.f46832f;
        }
        return (V) this.f46827a.mo17148b(j10, this.f46830d, this.f46831e);
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: f */
    public final T mo17131f(long j10) {
        if (m17130e(j10)) {
            return this.f46833g;
        }
        return (T) this.f46828b.mo17141b().mo528n(this.f46827a.mo17149c(j10, this.f46830d, this.f46831e));
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: g */
    public final T mo17132g() {
        return this.f46833g;
    }
}
