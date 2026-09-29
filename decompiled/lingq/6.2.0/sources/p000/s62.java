package p000;

import androidx.compose.p002ui.layout.IntrinsicMinMax;
import androidx.compose.p002ui.layout.IntrinsicWidthHeight;

/* JADX INFO: loaded from: classes.dex */
public final class s62 implements ct5 {

    /* JADX INFO: renamed from: a */
    public final ct5 f60399a;

    /* JADX INFO: renamed from: b */
    public final IntrinsicMinMax f60400b;

    /* JADX INFO: renamed from: c */
    public final IntrinsicWidthHeight f60401c;

    public s62(ct5 ct5Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f60399a = ct5Var;
        this.f60400b = intrinsicMinMax;
        this.f60401c = intrinsicWidthHeight;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f60399a.mo1509A();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        return this.f60399a.mo1510U(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        return this.f60399a.mo1511c(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        return this.f60399a.mo1512l(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        return this.f60399a.mo1513p(i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.Width;
        ct5 ct5Var = this.f60399a;
        IntrinsicWidthHeight intrinsicWidthHeight2 = this.f60401c;
        IntrinsicMinMax intrinsicMinMax = this.f60400b;
        if (intrinsicWidthHeight2 == intrinsicWidthHeight) {
            return new i63(intrinsicMinMax == IntrinsicMinMax.Max ? ct5Var.mo1513p(bk1.m3800h(j)) : ct5Var.mo1512l(bk1.m3800h(j)), bk1.m3796d(j) ? bk1.m3800h(j) : 32767, 0);
        }
        return new i63(bk1.m3797e(j) ? bk1.m3801i(j) : 32767, intrinsicMinMax == IntrinsicMinMax.Max ? ct5Var.mo1511c(bk1.m3801i(j)) : ct5Var.mo1510U(bk1.m3801i(j)), 0);
    }
}
