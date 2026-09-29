package p543do;

import ae.C0062b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p102eo.AbstractC5439d;
import p306on.InterfaceC8093b;

/* JADX INFO: renamed from: do.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C5253r extends AbstractC5249p implements InterfaceC5260u0 {

    /* JADX INFO: renamed from: d */
    public final AbstractC5249p f33345d;

    /* JADX INFO: renamed from: e */
    public final AbstractC5257t f33346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5253r(AbstractC5249p abstractC5249p, AbstractC5257t abstractC5257t) {
        super(abstractC5249p.f33340b, abstractC5249p.f33341c);
        C5207g.m11111f(abstractC5249p, "origin");
        C5207g.m11111f(abstractC5257t, "enhancement");
        this.f33345d = abstractC5249p;
        this.f33346e = abstractC5257t;
    }

    @Override // p543do.InterfaceC5260u0
    /* JADX INFO: renamed from: P */
    public final AbstractC5257t mo11226P() {
        return this.f33346e;
    }

    @Override // p543do.InterfaceC5260u0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC5262v0 mo11227P0() {
        return this.f33345d;
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        return C0062b.m247A2(this.f33345d.mo11217b1(z10), this.f33346e.mo11288a1().mo11217b1(z10));
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return C0062b.m247A2(this.f33345d.mo11243d1(c5238j0), this.f33346e);
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11283e1() {
        return this.f33345d.mo11283e1();
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: f1 */
    public final String mo11284f1(DescriptorRenderer descriptorRenderer, InterfaceC8093b interfaceC8093b) {
        C5207g.m11111f(descriptorRenderer, "renderer");
        C5207g.m11111f(interfaceC8093b, "options");
        return interfaceC8093b.mo14032f() ? descriptorRenderer.mo13985u(this.f33346e) : this.f33345d.mo11284f1(descriptorRenderer, interfaceC8093b);
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final C5253r mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(this.f33345d);
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C5253r((AbstractC5249p) abstractC5257tMo11663o0, abstractC5439d.mo11663o0(this.f33346e));
    }

    @Override // p543do.AbstractC5249p
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f33346e + ")] " + this.f33345d;
    }
}
