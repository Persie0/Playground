package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.d16;
import p000.fb2;
import p000.lj0;
import p000.ll2;
import p000.omd;
import p000.qp6;
import p000.te1;
import p000.ui3;
import p000.vi3;
import p000.vj6;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.draw.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0295b extends d16 implements qp6, lj0, ll2 {

    /* JADX INFO: renamed from: J */
    public final C0296c f3861J;

    /* JADX INFO: renamed from: K */
    public boolean f3862K;

    /* JADX INFO: renamed from: L */
    public vi3 f3863L;

    public C0295b(C0296c c0296c, vi3 vi3Var) {
        this.f3861J = c0296c;
        this.f3863L = vi3Var;
        c0296c.f3864a = this;
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: Q */
    public final void mo1343Q() {
        m1345Z0();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        m1345Z0();
    }

    @Override // p000.ea2
    /* JADX INFO: renamed from: V */
    public final void mo1344V() {
        m1345Z0();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1345Z0() {
        this.f3862K = false;
        this.f3861J.f3865b = null;
        AbstractC3489q9.m19789s(this);
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: a */
    public final fb2 mo1346a() {
        return te1.m21979L(this).f4327T;
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        m1345Z0();
    }

    @Override // p000.lj0
    public final LayoutDirection getLayoutDirection() {
        return te1.m21979L(this).f4328U;
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: h */
    public final long mo1347h() {
        return omd.m18152h0(te1.m21976I(this, 4).f49303c);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        boolean z = this.f3862K;
        final C0296c c0296c = this.f3861J;
        if (!z) {
            c0296c.f3865b = null;
            AbstractC0356f.m1552b(this, new ui3() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    this.f3856b.f3863L.invoke(c0296c);
                    return xfa.f68157a;
                }
            });
            if (c0296c.f3865b == null) {
                throw AbstractC3393o1.m17745t("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f3862K = true;
        }
        vj6 vj6Var = c0296c.f3865b;
        vj6Var.getClass();
        ((vi3) vj6Var.f65506b).invoke(c0358h);
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        m1345Z0();
    }
}
