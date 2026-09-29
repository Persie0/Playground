package p543do;

import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5599e;
import fo.C5603i;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266y extends AbstractC5265x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5240k0 f33357b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC5246n0> f33358c;

    /* JADX INFO: renamed from: d */
    public final boolean f33359d;

    /* JADX INFO: renamed from: e */
    public final MemberScope f33360e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<AbstractC5439d, AbstractC5265x> f33361f;

    /* JADX WARN: Multi-variable type inference failed */
    public C5266y(InterfaceC5240k0 interfaceC5240k0, List<? extends InterfaceC5246n0> list, boolean z10, MemberScope memberScope, InterfaceC2052l<? super AbstractC5439d, ? extends AbstractC5265x> interfaceC2052l) {
        C5207g.m11111f(interfaceC5240k0, "constructor");
        C5207g.m11111f(list, "arguments");
        C5207g.m11111f(memberScope, "memberScope");
        C5207g.m11111f(interfaceC2052l, "refinedTypeFactory");
        this.f33357b = interfaceC5240k0;
        this.f33358c = list;
        this.f33359d = z10;
        this.f33360e = memberScope;
        this.f33361f = interfaceC2052l;
        if (!(memberScope instanceof C5599e) || (memberScope instanceof C5603i)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + interfaceC5240k0);
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return this.f33358c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        C5238j0.f33329b.getClass();
        return C5238j0.f33330c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return this.f33357b;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return this.f33359d;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5265x abstractC5265xMo528n = this.f33361f.mo528n(abstractC5439d);
        if (abstractC5265xMo528n == null) {
            abstractC5265xMo528n = this;
        }
        return abstractC5265xMo528n;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5262v0 mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5265x abstractC5265xMo528n = this.f33361f.mo528n(abstractC5439d);
        if (abstractC5265xMo528n == null) {
            abstractC5265xMo528n = this;
        }
        return abstractC5265xMo528n;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        if (z10 == this.f33359d) {
            return this;
        }
        return z10 ? new C5261v(this) : new C5259u(this);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return c5238j0.isEmpty() ? this : new C5267z(this, c5238j0);
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return this.f33360e;
    }
}
