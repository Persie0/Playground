package p543do;

import dm.C5207g;

/* JADX INFO: renamed from: do.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5243m extends AbstractC5241l {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f33334b;

    public AbstractC5243m(AbstractC5265x abstractC5265x) {
        C5207g.m11111f(abstractC5265x, "delegate");
        this.f33334b = abstractC5265x;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        return z10 == mo11242Y0() ? this : this.f33334b.mo11217b1(z10).mo11243d1(mo11241W0());
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return c5238j0 != mo11241W0() ? new C5267z(this, c5238j0) : this;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: g1 */
    public final AbstractC5265x mo11221g1() {
        return this.f33334b;
    }
}
