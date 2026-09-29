package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class un8 extends d16 implements InterfaceC0354d, ov8 {

    /* JADX INFO: renamed from: J */
    public yn8 f64111J;

    /* JADX INFO: renamed from: K */
    public boolean f64112K;

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        AbstractC0426f.m1867k(tv8Var);
        final int i = 0;
        final int i2 = 1;
        mn8 mn8Var = new mn8(new ui3(this) { // from class: tn8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ un8 f62575b;

            {
                this.f62575b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int iM21222h;
                int i3 = i;
                un8 un8Var = this.f62575b;
                switch (i3) {
                    case 0:
                        iM21222h = un8Var.f64111J.f70117a.m21222h();
                        break;
                    default:
                        iM21222h = un8Var.f64111J.f70121e.m21222h();
                        break;
                }
                return Float.valueOf(iM21222h);
            }
        }, new ui3(this) { // from class: tn8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ un8 f62575b;

            {
                this.f62575b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int iM21222h;
                int i3 = i2;
                un8 un8Var = this.f62575b;
                switch (i3) {
                    case 0:
                        iM21222h = un8Var.f64111J.f70117a.m21222h();
                        break;
                    default:
                        iM21222h = un8Var.f64111J.f70121e.m21222h();
                        break;
                }
                return Float.valueOf(iM21222h);
            }
        }, false);
        if (this.f64112K) {
            C0427g c0427g = AbstractC0424d.f5016w;
            bh4 bh4Var = AbstractC0426f.f5022a[13];
            tv8Var.mo3709d(c0427g, mn8Var);
        } else {
            C0427g c0427g2 = AbstractC0424d.f5015v;
            bh4 bh4Var2 = AbstractC0426f.f5022a[12];
            tv8Var.mo3709d(c0427g2, mn8Var);
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f64112K) {
            i = Integer.MAX_VALUE;
        }
        return ct5Var.mo1512l(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!this.f64112K) {
            i = Integer.MAX_VALUE;
        }
        return ct5Var.mo1510U(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        thb.m22047f(j, this.f64112K ? Orientation.Vertical : Orientation.Horizontal);
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(0, this.f64112K ? bk1.m3801i(j) : Integer.MAX_VALUE, 0, this.f64112K ? Integer.MAX_VALUE : bk1.m3800h(j), 5, j));
        int i = l87VarMo1514r.f49301a;
        int iM3801i = bk1.m3801i(j);
        if (i > iM3801i) {
            i = iM3801i;
        }
        int i2 = l87VarMo1514r.f49302b;
        int iM3800h = bk1.m3800h(j);
        if (i2 > iM3800h) {
            i2 = iM3800h;
        }
        int i3 = l87VarMo1514r.f49302b - i2;
        int i4 = l87VarMo1514r.f49301a - i;
        if (!this.f64112K) {
            i3 = i4;
        }
        yn8 yn8Var = this.f64111J;
        sc9 sc9Var = yn8Var.f70121e;
        sc9 sc9Var2 = yn8Var.f70117a;
        sc9Var.m21223i(i3);
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            if (sc9Var2.m21222h() > i3) {
                sc9Var2.m21223i(i3);
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            this.f64111J.f70118b.m21223i(this.f64112K ? i2 : i);
            this.f64111J.f70119c.m21223i(this.f64112K ? l87VarMo1514r.f49302b : l87VarMo1514r.f49301a);
            return jt5Var.mo9895M0(i, i2, AbstractC3194a.m15360M(), new m85(this, i3, 2, l87VarMo1514r));
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (this.f64112K) {
            i = Integer.MAX_VALUE;
        }
        return ct5Var.mo1513p(i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        if (!this.f64112K) {
            i = Integer.MAX_VALUE;
        }
        return ct5Var.mo1511c(i);
    }
}
