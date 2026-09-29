package p543do;

import ae.C0062b;
import dm.C5207g;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5220a0 extends AbstractC5241l implements InterfaceC5260u0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f33303b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5257t f33304c;

    public C5220a0(AbstractC5265x abstractC5265x, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5265x, "delegate");
        C5207g.m11111f(abstractC5257t, "enhancement");
        this.f33303b = abstractC5265x;
        this.f33304c = abstractC5257t;
    }

    @Override // p543do.InterfaceC5260u0
    /* JADX INFO: renamed from: P */
    public final AbstractC5257t mo11226P() {
        return this.f33304c;
    }

    @Override // p543do.InterfaceC5260u0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC5262v0 mo11227P0() {
        return this.f33303b;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        AbstractC5262v0 abstractC5262v0M247A2 = C0062b.m247A2(this.f33303b.mo11217b1(z10), this.f33304c.mo11288a1().mo11217b1(z10));
        C5207g.m11109d(abstractC5262v0M247A2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC5265x) abstractC5262v0M247A2;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        AbstractC5262v0 abstractC5262v0M247A2 = C0062b.m247A2(this.f33303b.mo11243d1(c5238j0), this.f33304c);
        C5207g.m11109d(abstractC5262v0M247A2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC5265x) abstractC5262v0M247A2;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: g1 */
    public final AbstractC5265x mo11221g1() {
        return this.f33303b;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: i1 */
    public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
        return new C5220a0(abstractC5265x, this.f33304c);
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public final C5220a0 mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(this.f33303b);
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5220a0((AbstractC5265x) abstractC5257tMo11663o0, abstractC5439d.mo11663o0(this.f33304c));
    }

    @Override // p543do.AbstractC5265x
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f33304c + ")] " + this.f33303b;
    }
}
