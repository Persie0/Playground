package p543do;

import dm.C5207g;
import fo.C5599e;
import fo.C5602h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p102eo.AbstractC5439d;
import p102eo.InterfaceC5444i;

/* JADX INFO: renamed from: do.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5223c extends AbstractC5265x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5444i f33306b;

    /* JADX INFO: renamed from: c */
    public final boolean f33307c;

    /* JADX INFO: renamed from: d */
    public final C5599e f33308d;

    public AbstractC5223c(InterfaceC5444i interfaceC5444i, boolean z10) {
        C5207g.m11111f(interfaceC5444i, "originalTypeVariable");
        this.f33306b = interfaceC5444i;
        this.f33307c = z10;
        this.f33308d = C5602h.m11911b(ErrorScopeKind.STUB_TYPE_SCOPE, interfaceC5444i.toString());
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return EmptyList.f38032a;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        C5238j0.f33329b.getClass();
        return C5238j0.f33330c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return this.f33307c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5262v0 mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return this;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        return z10 == this.f33307c ? this : mo11244g1(z10);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return this;
    }

    /* JADX INFO: renamed from: g1 */
    public abstract C5226d0 mo11244g1(boolean z10);

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public MemberScope mo11245q() {
        return this.f33308d;
    }
}
