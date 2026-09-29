package p543do;

import ae.C0062b;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6719b;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225d extends AbstractC5234h0<C5225d> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9077e f33310a;

    public C5225d(InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC9077e, "annotations");
        this.f33310a = interfaceC9077e;
    }

    @Override // p543do.AbstractC5234h0
    /* JADX INFO: renamed from: a */
    public final C5225d mo11247a(AbstractC5234h0 abstractC5234h0) {
        C5225d c5225d = (C5225d) abstractC5234h0;
        return c5225d == null ? this : new C5225d(C0062b.m409w0(this.f33310a, c5225d.f33310a));
    }

    @Override // p543do.AbstractC5234h0
    /* JADX INFO: renamed from: b */
    public final InterfaceC6719b<? extends C5225d> mo11248b() {
        return C5209i.m11118a(C5225d.class);
    }

    @Override // p543do.AbstractC5234h0
    /* JADX INFO: renamed from: c */
    public final C5225d mo11249c(AbstractC5234h0 abstractC5234h0) {
        if (C5207g.m11106a((C5225d) abstractC5234h0, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5225d) {
            return C5207g.m11106a(((C5225d) obj).f33310a, this.f33310a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33310a.hashCode();
    }
}
