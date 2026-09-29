package p492xn;

import dm.C5207g;
import p372rm.InterfaceC8830c;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: xn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10253b extends AbstractC10252a {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8830c f51687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10253b(InterfaceC8830c interfaceC8830c, AbstractC5257t abstractC5257t) {
        super(abstractC5257t, null);
        C5207g.m11111f(interfaceC8830c, "classDescriptor");
        C5207g.m11111f(abstractC5257t, "receiverType");
        this.f51687c = interfaceC8830c;
    }

    public final String toString() {
        return mo17105c() + ": Ctx { " + this.f51687c + " }";
    }
}
