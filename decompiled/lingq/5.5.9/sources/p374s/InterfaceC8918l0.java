package p374s;

import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.l0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8918l0<V extends AbstractC8911i> extends InterfaceC8920m0<V> {
    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: b */
    default long mo17143b(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        C8928q0 c8928q0 = (C8928q0) this;
        return ((long) (c8928q0.f46852b + c8928q0.f46851a)) * 1000000;
    }
}
