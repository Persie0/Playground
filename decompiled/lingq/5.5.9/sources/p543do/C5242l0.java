package p543do;

import dm.C5207g;
import java.util.Map;

/* JADX INFO: renamed from: do.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5242l0 extends AbstractC5244m0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map<InterfaceC5240k0, InterfaceC5246n0> f33332c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f33333d;

    /* JADX WARN: Multi-variable type inference failed */
    public C5242l0(Map<InterfaceC5240k0, ? extends InterfaceC5246n0> map, boolean z10) {
        this.f33332c = map;
        this.f33333d = z10;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: a */
    public final boolean mo11274a() {
        return this.f33333d;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: e */
    public final boolean mo11276e() {
        return this.f33332c.isEmpty();
    }

    @Override // p543do.AbstractC5244m0
    /* JADX INFO: renamed from: g */
    public final InterfaceC5246n0 mo11246g(InterfaceC5240k0 interfaceC5240k0) {
        C5207g.m11111f(interfaceC5240k0, "key");
        return this.f33332c.get(interfaceC5240k0);
    }
}
