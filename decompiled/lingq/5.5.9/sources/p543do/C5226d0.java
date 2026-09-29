package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p102eo.InterfaceC5444i;

/* JADX INFO: renamed from: do.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5226d0 extends AbstractC5223c {

    /* JADX INFO: renamed from: e */
    public final InterfaceC5240k0 f33311e;

    /* JADX INFO: renamed from: f */
    public final MemberScope f33312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5226d0(InterfaceC5444i interfaceC5444i, boolean z10, InterfaceC5240k0 interfaceC5240k0) {
        super(interfaceC5444i, z10);
        C5207g.m11111f(interfaceC5444i, "originalTypeVariable");
        C5207g.m11111f(interfaceC5240k0, "constructor");
        this.f33311e = interfaceC5240k0;
        this.f33312f = interfaceC5444i.mo11234o().m13549f().mo11245q();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return this.f33311e;
    }

    @Override // p543do.AbstractC5223c
    /* JADX INFO: renamed from: g1 */
    public final C5226d0 mo11244g1(boolean z10) {
        return new C5226d0(this.f33306b, z10, this.f33311e);
    }

    @Override // p543do.AbstractC5223c, p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return this.f33312f;
    }

    @Override // p543do.AbstractC5265x
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(this.f33306b);
        sb2.append(this.f33307c ? "?" : "");
        return sb2.toString();
    }
}
