package p543do;

import dm.C5207g;

/* JADX INFO: renamed from: do.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5267z extends AbstractC5243m {

    /* JADX INFO: renamed from: c */
    public final C5238j0 f33362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5267z(AbstractC5265x abstractC5265x, C5238j0 c5238j0) {
        super(abstractC5265x);
        C5207g.m11111f(abstractC5265x, "delegate");
        C5207g.m11111f(c5238j0, "attributes");
        this.f33362c = c5238j0;
    }

    @Override // p543do.AbstractC5241l, p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        return this.f33362c;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: i1 */
    public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
        return new C5267z(abstractC5265x, this.f33362c);
    }
}
