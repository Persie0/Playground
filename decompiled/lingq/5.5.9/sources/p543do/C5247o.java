package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p102eo.AbstractC5439d;
import p306on.InterfaceC8093b;

/* JADX INFO: renamed from: do.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C5247o extends AbstractC5249p {

    /* JADX INFO: renamed from: d */
    public final C5238j0 f33339d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5247o(AbstractC6795c abstractC6795c, C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "attributes");
        AbstractC5265x abstractC5265xM13558o = abstractC6795c.m13558o();
        C5207g.m11110e(abstractC5265xM13558o, "builtIns.nothingType");
        super(abstractC5265xM13558o, abstractC6795c.m13559p());
        this.f33339d = c5238j0;
    }

    @Override // p543do.AbstractC5249p, p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        return this.f33339d;
    }

    @Override // p543do.AbstractC5249p, p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return false;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        return this;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5262v0 mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C5247o(TypeUtilsKt.m14230g(this.f33341c), c5238j0);
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11283e1() {
        return this.f33341c;
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: f1 */
    public final String mo11284f1(DescriptorRenderer descriptorRenderer, InterfaceC8093b interfaceC8093b) {
        C5207g.m11111f(descriptorRenderer, "renderer");
        C5207g.m11111f(interfaceC8093b, "options");
        return "dynamic";
    }
}
