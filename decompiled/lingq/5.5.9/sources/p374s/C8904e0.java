package p374s;

import dm.C5207g;

/* JADX INFO: renamed from: s.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8904e0<T> implements InterfaceC8929r {

    /* JADX INFO: renamed from: a */
    public final int f46804a;

    /* JADX INFO: renamed from: b */
    public final int f46805b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8925p f46806c;

    public C8904e0() {
        this(0, (InterfaceC8925p) null, 7);
    }

    public C8904e0(int i10, int i11, InterfaceC8925p interfaceC8925p) {
        C5207g.m11111f(interfaceC8925p, "easing");
        this.f46804a = i10;
        this.f46805b = i11;
        this.f46806c = interfaceC8925p;
    }

    public C8904e0(int i10, InterfaceC8925p interfaceC8925p, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? C8927q.f46847a : interfaceC8925p);
    }

    @Override // p374s.InterfaceC8901d
    /* JADX INFO: renamed from: a */
    public final InterfaceC8910h0 mo17134a(InterfaceC8906f0 interfaceC8906f0) {
        C5207g.m11111f(interfaceC8906f0, "converter");
        return new C8928q0(this.f46804a, this.f46805b, this.f46806c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8904e0)) {
            return false;
        }
        C8904e0 c8904e0 = (C8904e0) obj;
        return c8904e0.f46804a == this.f46804a && c8904e0.f46805b == this.f46805b && C5207g.m11106a(c8904e0.f46806c, this.f46806c);
    }

    public final int hashCode() {
        return ((this.f46806c.hashCode() + (this.f46804a * 31)) * 31) + this.f46805b;
    }
}
