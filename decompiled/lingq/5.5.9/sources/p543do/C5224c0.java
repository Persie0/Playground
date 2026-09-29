package p543do;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;

/* JADX INFO: renamed from: do.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5224c0 extends AbstractC5244m0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<InterfaceC5240k0> f33309c;

    public C5224c0(ArrayList arrayList) {
        this.f33309c = arrayList;
    }

    @Override // p543do.AbstractC5244m0
    /* JADX INFO: renamed from: g */
    public final InterfaceC5246n0 mo11246g(InterfaceC5240k0 interfaceC5240k0) {
        C5207g.m11111f(interfaceC5240k0, "key");
        if (!this.f33309c.contains(interfaceC5240k0)) {
            return null;
        }
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
        C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return C5258t0.m11302m((InterfaceC8847k0) interfaceC8834eMo11235q);
    }
}
