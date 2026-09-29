package hn;

import ae.C0062b;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p543do.AbstractC5241l;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5258t0;
import p543do.InterfaceC5233h;

/* JADX INFO: renamed from: hn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6084d extends AbstractC5241l implements InterfaceC5233h {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f35824b;

    public C6084d(AbstractC5265x abstractC5265x) {
        C5207g.m11111f(abstractC5265x, "delegate");
        this.f35824b = abstractC5265x;
    }

    /* JADX INFO: renamed from: j1 */
    public static AbstractC5265x m12517j1(AbstractC5265x abstractC5265x) {
        AbstractC5265x abstractC5265xMo11217b1 = abstractC5265x.mo11217b1(false);
        return !C5258t0.m11297h(abstractC5265x) ? abstractC5265xMo11217b1 : new C6084d(abstractC5265xMo11217b1);
    }

    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: J0 */
    public final boolean mo11268J0() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5233h
    /* JADX INFO: renamed from: N */
    public final AbstractC5262v0 mo11269N(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "replacement");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        C5207g.m11111f(abstractC5262v0Mo11288a1, "<this>");
        if (!C5258t0.m11297h(abstractC5262v0Mo11288a1) && !C5258t0.m11296g(abstractC5262v0Mo11288a1)) {
            return abstractC5262v0Mo11288a1;
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            return m12517j1((AbstractC5265x) abstractC5262v0Mo11288a1);
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            AbstractC5249p abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
            return C0062b.m247A2(KotlinTypeFactory.m14184c(m12517j1(abstractC5249p.f33340b), m12517j1(abstractC5249p.f33341c)), C0062b.m346f1(abstractC5262v0Mo11288a1));
        }
        throw new IllegalStateException(("Incorrect type: " + abstractC5262v0Mo11288a1).toString());
    }

    @Override // p543do.AbstractC5241l, p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return false;
    }

    @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C6084d(this.f35824b.mo11243d1(c5238j0));
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        return z10 ? this.f35824b.mo11217b1(true) : this;
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C6084d(this.f35824b.mo11243d1(c5238j0));
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: g1 */
    public final AbstractC5265x mo11221g1() {
        return this.f35824b;
    }

    @Override // p543do.AbstractC5241l
    /* JADX INFO: renamed from: i1 */
    public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
        return new C6084d(abstractC5265x);
    }
}
