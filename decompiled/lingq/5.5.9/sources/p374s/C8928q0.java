package p374s;

import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8928q0<V extends AbstractC8911i> implements InterfaceC8918l0<V> {

    /* JADX INFO: renamed from: a */
    public final int f46851a;

    /* JADX INFO: renamed from: b */
    public final int f46852b;

    /* JADX INFO: renamed from: c */
    public final C8922n0<V> f46853c;

    public C8928q0(int i10, int i11, InterfaceC8925p interfaceC8925p) {
        C5207g.m11111f(interfaceC8925p, "easing");
        this.f46851a = i10;
        this.f46852b = i11;
        this.f46853c = new C8922n0<>(new C8933u(i10, i11, interfaceC8925p));
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: c */
    public final V mo17144c(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        return (V) this.f46853c.mo17144c(j10, v10, v11, v12);
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: d */
    public final V mo17145d(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        return (V) this.f46853c.mo17145d(j10, v10, v11, v12);
    }
}
