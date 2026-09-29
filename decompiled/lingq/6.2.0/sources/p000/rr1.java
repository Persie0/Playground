package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends d32 {

    /* JADX INFO: renamed from: h */
    public final C3645ue f59736h;

    public rr1(C3645ue c3645ue) {
        this.f59736h = c3645ue;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: A */
    public final int mo10067A(int i, int i2, LayoutDirection layoutDirection, l87 l87Var, int i3) {
        int iMo1630V = l87Var.mo1630V(this.f59736h.f63803a);
        if (iMo1630V == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iMo1630V;
        return layoutDirection == LayoutDirection.Rtl ? (i - i2) - i4 : i4;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: E */
    public final Integer mo10068E(l87 l87Var) {
        return Integer.valueOf(l87Var.mo1630V(this.f59736h.f63803a));
    }
}
