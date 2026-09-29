package p492xn;

import dm.C5207g;
import p372rm.InterfaceC8830c;
import p420um.AbstractC9557b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: xn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10256e implements InterfaceC10257f, InterfaceC10259h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8830c f51690a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c f51691b;

    public C10256e(AbstractC9557b abstractC9557b) {
        C5207g.m11111f(abstractC9557b, "classDescriptor");
        this.f51690a = abstractC9557b;
        this.f51691b = abstractC9557b;
    }

    @Override // p492xn.InterfaceC10257f
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo17105c() {
        AbstractC5265x abstractC5265xMo5316v = this.f51690a.mo5316v();
        C5207g.m11110e(abstractC5265xMo5316v, "classDescriptor.defaultType");
        return abstractC5265xMo5316v;
    }

    public final boolean equals(Object obj) {
        InterfaceC8830c interfaceC8830c = null;
        C10256e c10256e = obj instanceof C10256e ? (C10256e) obj : null;
        if (c10256e != null) {
            interfaceC8830c = c10256e.f51690a;
        }
        return C5207g.m11106a(this.f51690a, interfaceC8830c);
    }

    public final int hashCode() {
        return this.f51690a.hashCode();
    }

    @Override // p492xn.InterfaceC10259h
    /* JADX INFO: renamed from: s */
    public final InterfaceC8830c mo19220s() {
        return this.f51690a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        AbstractC5265x abstractC5265xMo5316v = this.f51690a.mo5316v();
        C5207g.m11110e(abstractC5265xMo5316v, "classDescriptor.defaultType");
        sb2.append(abstractC5265xMo5316v);
        sb2.append('}');
        return sb2.toString();
    }
}
