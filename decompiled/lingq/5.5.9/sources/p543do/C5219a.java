package p543do;

import dm.C5207g;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5219a extends AbstractC5241l {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f33301b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5265x f33302c;

    public C5219a(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        C5207g.m11111f(abstractC5265x, "delegate");
        C5207g.m11111f(abstractC5265x2, "abbreviation");
        this.f33301b = abstractC5265x;
        this.f33302c = abstractC5265x2;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C5219a(this.f33301b.mo11243d1(c5238j0), this.f33302c);
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: g1 */
    public final AbstractC5265x mo11221g1() {
        return this.f33301b;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: i1 */
    public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
        return new C5219a(abstractC5265x, this.f33302c);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public final C5219a mo11217b1(boolean z10) {
        return new C5219a(this.f33301b.mo11217b1(z10), this.f33302c.mo11217b1(z10));
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5219a mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(this.f33301b);
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5265x abstractC5265x = (AbstractC5265x) abstractC5257tMo11663o0;
        AbstractC5257t abstractC5257tMo11663o1 = abstractC5439d.mo11663o0(this.f33302c);
        C5207g.m11109d(abstractC5257tMo11663o1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5219a(abstractC5265x, (AbstractC5265x) abstractC5257tMo11663o1);
    }
}
