package p374s;

import dm.C5207g;
import p338qd.C8573r0;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8924o0<V extends AbstractC8911i> implements InterfaceC8916k0<V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8932t f46841a;

    /* JADX INFO: renamed from: b */
    public V f46842b;

    /* JADX INFO: renamed from: c */
    public V f46843c;

    /* JADX INFO: renamed from: d */
    public V f46844d;

    /* JADX INFO: renamed from: e */
    public final float f46845e;

    public C8924o0(InterfaceC8932t interfaceC8932t) {
        C5207g.m11111f(interfaceC8932t, "floatDecaySpec");
        this.f46841a = interfaceC8932t;
        interfaceC8932t.mo16931a();
        this.f46845e = 0.0f;
    }

    @Override // p374s.InterfaceC8916k0
    /* JADX INFO: renamed from: a */
    public final float mo17147a() {
        return this.f46845e;
    }

    @Override // p374s.InterfaceC8916k0
    /* JADX INFO: renamed from: b */
    public final V mo17148b(long j10, V v10, V v11) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "initialVelocity");
        if (this.f46843c == null) {
            this.f46843c = (V) C8573r0.m16686M0(v10);
        }
        V v12 = this.f46843c;
        if (v12 == null) {
            C5207g.m11117l("velocityVector");
            throw null;
        }
        int iMo17136b = v12.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v13 = this.f46843c;
            if (v13 == null) {
                C5207g.m11117l("velocityVector");
                throw null;
            }
            v10.mo17135a(i10);
            v13.mo17139e(i10, this.f46841a.mo16932b(v11.mo17135a(i10), j10));
        }
        V v14 = this.f46843c;
        if (v14 != null) {
            return v14;
        }
        C5207g.m11117l("velocityVector");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p374s.InterfaceC8916k0
    /* JADX INFO: renamed from: c */
    public final V mo17149c(long j10, V v10, V v11) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "initialVelocity");
        if (this.f46842b == null) {
            this.f46842b = (V) C8573r0.m16686M0(v10);
        }
        V v12 = this.f46842b;
        if (v12 == null) {
            C5207g.m11117l("valueVector");
            throw null;
        }
        int iMo17136b = v12.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v13 = this.f46842b;
            if (v13 == null) {
                C5207g.m11117l("valueVector");
                throw null;
            }
            v13.mo17139e(i10, this.f46841a.mo16933c(v10.mo17135a(i10), v11.mo17135a(i10), j10));
        }
        V v14 = this.f46842b;
        if (v14 != null) {
            return v14;
        }
        C5207g.m11117l("valueVector");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final long m17152d(V v10, V v11) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "initialVelocity");
        if (this.f46843c == null) {
            this.f46843c = (V) C8573r0.m16686M0(v10);
        }
        V v12 = this.f46843c;
        if (v12 == null) {
            C5207g.m11117l("velocityVector");
            throw null;
        }
        int iMo17136b = v12.mo17136b();
        long jMax = 0;
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            v10.mo17135a(i10);
            jMax = Math.max(jMax, this.f46841a.mo16934d(v11.mo17135a(i10)));
        }
        return jMax;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final V m17153e(V v10, V v11) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "initialVelocity");
        if (this.f46844d == null) {
            this.f46844d = (V) C8573r0.m16686M0(v10);
        }
        V v12 = this.f46844d;
        if (v12 == null) {
            C5207g.m11117l("targetVector");
            throw null;
        }
        int iMo17136b = v12.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v13 = this.f46844d;
            if (v13 == null) {
                C5207g.m11117l("targetVector");
                throw null;
            }
            v13.mo17139e(i10, this.f46841a.mo16935e(v10.mo17135a(i10), v11.mo17135a(i10)));
        }
        V v14 = this.f46844d;
        if (v14 != null) {
            return v14;
        }
        C5207g.m11117l("targetVector");
        throw null;
    }
}
