package p543do;

import dm.C5207g;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;

/* JADX INFO: renamed from: do.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255s extends AbstractC5252q0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8847k0[] f33348b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5246n0[] f33349c;

    /* JADX INFO: renamed from: d */
    public final boolean f33350d;

    public C5255s() {
        throw null;
    }

    public C5255s(InterfaceC8847k0[] interfaceC8847k0Arr, InterfaceC5246n0[] interfaceC5246n0Arr, boolean z10) {
        C5207g.m11111f(interfaceC8847k0Arr, "parameters");
        C5207g.m11111f(interfaceC5246n0Arr, "arguments");
        this.f33348b = interfaceC8847k0Arr;
        this.f33349c = interfaceC5246n0Arr;
        this.f33350d = z10;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: b */
    public final boolean mo11282b() {
        return this.f33350d;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        InterfaceC8847k0 interfaceC8847k0 = interfaceC8834eMo11235q instanceof InterfaceC8847k0 ? (InterfaceC8847k0) interfaceC8834eMo11235q : null;
        if (interfaceC8847k0 == null) {
            return null;
        }
        int index = interfaceC8847k0.getIndex();
        InterfaceC8847k0[] interfaceC8847k0Arr = this.f33348b;
        if (index >= interfaceC8847k0Arr.length || !C5207g.m11106a(interfaceC8847k0Arr[index].mo13600k(), interfaceC8847k0.mo13600k())) {
            return null;
        }
        return this.f33349c[index];
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: e */
    public final boolean mo11276e() {
        return this.f33349c.length == 0;
    }
}
