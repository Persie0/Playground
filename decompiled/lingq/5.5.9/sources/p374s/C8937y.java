package p374s;

import dm.C5207g;
import p338qd.C8573r0;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.y */
/* JADX INFO: loaded from: classes.dex */
public final class C8937y<T, V extends AbstractC8911i> implements InterfaceC8895a<T, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8910h0<V> f46871a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8906f0<T, V> f46872b;

    /* JADX INFO: renamed from: c */
    public final T f46873c;

    /* JADX INFO: renamed from: d */
    public final T f46874d;

    /* JADX INFO: renamed from: e */
    public final V f46875e;

    /* JADX INFO: renamed from: f */
    public final V f46876f;

    /* JADX INFO: renamed from: g */
    public final V f46877g;

    /* JADX INFO: renamed from: h */
    public final long f46878h;

    /* JADX INFO: renamed from: i */
    public final V f46879i;

    public C8937y() {
        throw null;
    }

    public C8937y(InterfaceC8901d<T> interfaceC8901d, InterfaceC8906f0<T, V> interfaceC8906f0, T t10, T t11, V v10) {
        C5207g.m11111f(interfaceC8901d, "animationSpec");
        C5207g.m11111f(interfaceC8906f0, "typeConverter");
        InterfaceC8910h0<V> interfaceC8910h0Mo17134a = interfaceC8901d.mo17134a(interfaceC8906f0);
        C5207g.m11111f(interfaceC8910h0Mo17134a, "animationSpec");
        this.f46871a = interfaceC8910h0Mo17134a;
        this.f46872b = interfaceC8906f0;
        this.f46873c = t10;
        this.f46874d = t11;
        V vMo528n = interfaceC8906f0.mo17140a().mo528n(t10);
        this.f46875e = vMo528n;
        V vMo528n2 = interfaceC8906f0.mo17140a().mo528n(t11);
        this.f46876f = vMo528n2;
        V v11 = v10 != null ? (V) C8573r0.m16709Y(v10) : (V) C8573r0.m16686M0(interfaceC8906f0.mo17140a().mo528n(t10));
        this.f46877g = v11;
        this.f46878h = interfaceC8910h0Mo17134a.mo17143b(vMo528n, vMo528n2, v11);
        this.f46879i = (V) interfaceC8910h0Mo17134a.mo17146e(vMo528n, vMo528n2, v11);
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: a */
    public final boolean mo17126a() {
        this.f46871a.mo17142a();
        return false;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: b */
    public final long mo17127b() {
        return this.f46878h;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: c */
    public final InterfaceC8906f0<T, V> mo17128c() {
        return this.f46872b;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: d */
    public final V mo17129d(long j10) {
        return !m17130e(j10) ? (V) this.f46871a.mo17144c(j10, this.f46875e, this.f46876f, this.f46877g) : this.f46879i;
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: f */
    public final T mo17131f(long j10) {
        if (m17130e(j10)) {
            return this.f46874d;
        }
        AbstractC8911i abstractC8911iMo17145d = this.f46871a.mo17145d(j10, this.f46875e, this.f46876f, this.f46877g);
        int iMo17136b = abstractC8911iMo17145d.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            if (!(!Float.isNaN(abstractC8911iMo17145d.mo17135a(i10)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + abstractC8911iMo17145d + ". Animation: " + this + ", playTimeNanos: " + j10).toString());
            }
        }
        return (T) this.f46872b.mo17141b().mo528n(abstractC8911iMo17145d);
    }

    @Override // p374s.InterfaceC8895a
    /* JADX INFO: renamed from: g */
    public final T mo17132g() {
        return this.f46874d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f46873c + " -> " + this.f46874d + ",initial velocity: " + this.f46877g + ", duration: " + (mo17127b() / 1000000) + " ms,animationSpec: " + this.f46871a;
    }
}
