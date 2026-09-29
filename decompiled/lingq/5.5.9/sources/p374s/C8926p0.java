package p374s;

import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8926p0<V extends AbstractC8911i> implements InterfaceC8920m0<V> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8922n0<V> f46846a;

    public C8926p0(float f3, float f10, V v10) {
        this.f46846a = new C8922n0<>(v10 != null ? new C8912i0(f3, f10, v10) : new C8914j0(f3, f10));
    }

    @Override // p374s.InterfaceC8920m0, p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: a */
    public final void mo17142a() {
        this.f46846a.getClass();
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: b */
    public final long mo17143b(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        return this.f46846a.mo17143b(v10, v11, v12);
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: c */
    public final V mo17144c(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        return (V) this.f46846a.mo17144c(j10, v10, v11, v12);
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: d */
    public final V mo17145d(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        return (V) this.f46846a.mo17145d(j10, v10, v11, v12);
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: e */
    public final V mo17146e(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        return (V) this.f46846a.mo17146e(v10, v11, v12);
    }
}
