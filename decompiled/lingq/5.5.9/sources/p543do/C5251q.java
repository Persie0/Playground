package p543do;

import ae.C0062b;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p102eo.AbstractC5439d;
import p306on.InterfaceC8093b;
import p372rm.InterfaceC8847k0;

/* JADX INFO: renamed from: do.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5251q extends AbstractC5249p implements InterfaceC5233h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5251q(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        super(abstractC5265x, abstractC5265x2);
        C5207g.m11111f(abstractC5265x, "lowerBound");
        C5207g.m11111f(abstractC5265x2, "upperBound");
    }

    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: J0 */
    public final boolean mo11268J0() {
        AbstractC5265x abstractC5265x = this.f33340b;
        return (abstractC5265x.mo11250X0().mo11235q() instanceof InterfaceC8847k0) && C5207g.m11106a(abstractC5265x.mo11250X0(), this.f33341c.mo11250X0());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: N */
    public final AbstractC5262v0 mo11269N(AbstractC5257t abstractC5257t) {
        AbstractC5262v0 abstractC5262v0M14184c;
        C5207g.m11111f(abstractC5257t, "replacement");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            abstractC5262v0M14184c = abstractC5262v0Mo11288a1;
        } else {
            if (!(abstractC5262v0Mo11288a1 instanceof AbstractC5265x)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5265x abstractC5265x = (AbstractC5265x) abstractC5262v0Mo11288a1;
            abstractC5262v0M14184c = KotlinTypeFactory.m14184c(abstractC5265x, abstractC5265x.mo11217b1(true));
        }
        return C0062b.m382p1(abstractC5262v0M14184c, abstractC5262v0Mo11288a1);
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        return KotlinTypeFactory.m14184c(this.f33340b.mo11217b1(z10), this.f33341c.mo11217b1(z10));
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return KotlinTypeFactory.m14184c(this.f33340b.mo11243d1(c5238j0), this.f33341c.mo11243d1(c5238j0));
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11283e1() {
        return this.f33340b;
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: f1 */
    public final String mo11284f1(DescriptorRenderer descriptorRenderer, InterfaceC8093b interfaceC8093b) {
        C5207g.m11111f(descriptorRenderer, "renderer");
        C5207g.m11111f(interfaceC8093b, "options");
        boolean zMo14048n = interfaceC8093b.mo14048n();
        AbstractC5265x abstractC5265x = this.f33341c;
        AbstractC5265x abstractC5265x2 = this.f33340b;
        if (!zMo14048n) {
            return descriptorRenderer.mo13982r(descriptorRenderer.mo13985u(abstractC5265x2), descriptorRenderer.mo13985u(abstractC5265x), TypeUtilsKt.m14230g(this));
        }
        return "(" + descriptorRenderer.mo13985u(abstractC5265x2) + ".." + descriptorRenderer.mo13985u(abstractC5265x) + ')';
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final AbstractC5249p mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(this.f33340b);
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5257t abstractC5257tMo11663o1 = abstractC5439d.mo11663o0(this.f33341c);
        C5207g.m11109d(abstractC5257tMo11663o1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5251q((AbstractC5265x) abstractC5257tMo11663o0, (AbstractC5265x) abstractC5257tMo11663o1);
    }

    @Override // p543do.AbstractC5249p
    public final String toString() {
        return "(" + this.f33340b + ".." + this.f33341c + ')';
    }
}
