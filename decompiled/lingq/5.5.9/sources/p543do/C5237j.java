package p543do;

import ae.C0062b;
import dm.C5206f;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p102eo.C5441f;
import p102eo.InterfaceC5444i;
import p139go.InterfaceC5849c;
import p260m8.C7499b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p420um.C9576k0;

/* JADX INFO: renamed from: do.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5237j extends AbstractC5241l implements InterfaceC5233h, InterfaceC5849c {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f33327b;

    /* JADX INFO: renamed from: c */
    public final boolean f33328c;

    /* JADX INFO: renamed from: do.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C5237j m11271a(AbstractC5262v0 abstractC5262v0, boolean z10) {
            C5207g.m11111f(abstractC5262v0, "type");
            if (abstractC5262v0 instanceof C5237j) {
                return (C5237j) abstractC5262v0;
            }
            boolean zM11296g = true;
            if (!((abstractC5262v0.mo11250X0() instanceof InterfaceC5444i) || (abstractC5262v0.mo11250X0().mo11235q() instanceof InterfaceC8847k0) || (abstractC5262v0 instanceof C5441f) || (abstractC5262v0 instanceof C5226d0))) {
                zM11296g = false;
            } else if (abstractC5262v0 instanceof C5226d0) {
                zM11296g = C5258t0.m11296g(abstractC5262v0);
            } else {
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0.mo11250X0().mo11235q();
                C9576k0 c9576k0 = interfaceC8834eMo11235q instanceof C9576k0 ? (C9576k0) interfaceC8834eMo11235q : null;
                if (!((c9576k0 == null || c9576k0.f49209H) ? false : true)) {
                    zM11296g = (z10 && (abstractC5262v0.mo11250X0().mo11235q() instanceof InterfaceC8847k0)) ? C5258t0.m11296g(abstractC5262v0) : true ^ C7499b.m14920R(C7499b.m14965t(false, true, C5206f.f33268c, null, null, 24), C0062b.m262E1(abstractC5262v0), TypeCheckerState.AbstractC7055b.b.f39891a);
                }
            }
            if (!zM11296g) {
                return null;
            }
            if (abstractC5262v0 instanceof AbstractC5249p) {
                AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0;
                C5207g.m11106a(abstractC5249p.f33340b.mo11250X0(), abstractC5249p.f33341c.mo11250X0());
            }
            return new C5237j(C0062b.m262E1(abstractC5262v0).mo11217b1(false), z10);
        }
    }

    public C5237j(AbstractC5265x abstractC5265x, boolean z10) {
        this.f33327b = abstractC5265x;
        this.f33328c = z10;
    }

    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: J0 */
    public final boolean mo11268J0() {
        AbstractC5265x abstractC5265x = this.f33327b;
        return (abstractC5265x.mo11250X0() instanceof InterfaceC5444i) || (abstractC5265x.mo11250X0().mo11235q() instanceof InterfaceC8847k0);
    }

    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: N */
    public final AbstractC5262v0 mo11269N(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "replacement");
        return C0062b.m266F1(abstractC5257t.mo11288a1(), this.f33328c);
    }

    @Override // p543do.AbstractC5241l, p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return false;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        return z10 ? this.f33327b.mo11217b1(z10) : this;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C5237j(this.f33327b.mo11243d1(c5238j0), this.f33328c);
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: g1 */
    public final AbstractC5265x mo11221g1() {
        return this.f33327b;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: i1 */
    public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
        return new C5237j(abstractC5265x, this.f33328c);
    }

    @Override // p543do.AbstractC5265x
    public final String toString() {
        return this.f33327b + " & Any";
    }
}
