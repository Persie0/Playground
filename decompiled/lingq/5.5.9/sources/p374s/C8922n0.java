package p374s;

import ae.C0062b;
import dm.C5207g;
import java.util.Iterator;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import tl.AbstractC9334v;

/* JADX INFO: renamed from: s.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8922n0<V extends AbstractC8911i> implements InterfaceC8920m0<V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8913j f46835a;

    /* JADX INFO: renamed from: b */
    public V f46836b;

    /* JADX INFO: renamed from: c */
    public V f46837c;

    /* JADX INFO: renamed from: d */
    public V f46838d;

    /* JADX INFO: renamed from: s.n0$a */
    public static final class a implements InterfaceC8913j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8931s f46839a;

        public a(InterfaceC8931s interfaceC8931s) {
            this.f46839a = interfaceC8931s;
        }

        @Override // p374s.InterfaceC8913j
        public final InterfaceC8931s get(int i10) {
            return this.f46839a;
        }
    }

    public C8922n0(InterfaceC8913j interfaceC8913j) {
        this.f46835a = interfaceC8913j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8922n0(InterfaceC8931s interfaceC8931s) {
        this(new a(interfaceC8931s));
        C5207g.m11111f(interfaceC8931s, "anim");
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: b */
    public final long mo17143b(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        Iterator<Integer> it = C0062b.m411w2(0, v10.mo17136b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iMo13105a = ((AbstractC9334v) it).mo13105a();
            jMax = Math.max(jMax, this.f46835a.get(iMo13105a).mo1386c(v10.mo17135a(iMo13105a), v11.mo17135a(iMo13105a), v12.mo17135a(iMo13105a)));
        }
        return jMax;
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: c */
    public final V mo17144c(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        if (this.f46837c == null) {
            this.f46837c = (V) C8573r0.m16686M0(v12);
        }
        V v13 = this.f46837c;
        if (v13 == null) {
            C5207g.m11117l("velocityVector");
            throw null;
        }
        int iMo17136b = v13.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v14 = this.f46837c;
            if (v14 == null) {
                C5207g.m11117l("velocityVector");
                throw null;
            }
            v14.mo17139e(i10, this.f46835a.get(i10).mo1385b(j10, v10.mo17135a(i10), v11.mo17135a(i10), v12.mo17135a(i10)));
        }
        V v15 = this.f46837c;
        if (v15 != null) {
            return v15;
        }
        C5207g.m11117l("velocityVector");
        throw null;
    }

    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: d */
    public final V mo17145d(long j10, V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        C5207g.m11111f(v12, "initialVelocity");
        if (this.f46836b == null) {
            this.f46836b = (V) C8573r0.m16686M0(v10);
        }
        V v13 = this.f46836b;
        if (v13 == null) {
            C5207g.m11117l("valueVector");
            throw null;
        }
        int iMo17136b = v13.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v14 = this.f46836b;
            if (v14 == null) {
                C5207g.m11117l("valueVector");
                throw null;
            }
            v14.mo17139e(i10, this.f46835a.get(i10).mo1388e(j10, v10.mo17135a(i10), v11.mo17135a(i10), v12.mo17135a(i10)));
        }
        V v15 = this.f46836b;
        if (v15 != null) {
            return v15;
        }
        C5207g.m11117l("valueVector");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p374s.InterfaceC8910h0
    /* JADX INFO: renamed from: e */
    public final V mo17146e(V v10, V v11, V v12) {
        C5207g.m11111f(v10, "initialValue");
        C5207g.m11111f(v11, "targetValue");
        if (this.f46838d == null) {
            this.f46838d = (V) C8573r0.m16686M0(v12);
        }
        V v13 = this.f46838d;
        if (v13 == null) {
            C5207g.m11117l("endVelocityVector");
            throw null;
        }
        int iMo17136b = v13.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            V v14 = this.f46838d;
            if (v14 == null) {
                C5207g.m11117l("endVelocityVector");
                throw null;
            }
            v14.mo17139e(i10, this.f46835a.get(i10).mo1387d(v10.mo17135a(i10), v11.mo17135a(i10), v12.mo17135a(i10)));
        }
        V v15 = this.f46838d;
        if (v15 != null) {
            return v15;
        }
        C5207g.m11117l("endVelocityVector");
        throw null;
    }
}
