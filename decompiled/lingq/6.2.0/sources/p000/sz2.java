package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class sz2 extends d38 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uz2 f61647a;

    public sz2(uz2 uz2Var) {
        this.f61647a = uz2Var;
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: b */
    public final void mo6123b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        uz2 uz2Var = this.f61647a;
        int i3 = uz2Var.f64564a;
        int iComputeVerticalScrollRange = uz2Var.f64582s.computeVerticalScrollRange();
        int i4 = uz2Var.f64581r;
        uz2Var.f64583t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = uz2Var.f64582s.computeHorizontalScrollRange();
        int i5 = uz2Var.f64580q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        uz2Var.f64584u = z;
        boolean z2 = uz2Var.f64583t;
        if (!z2 && !z) {
            if (uz2Var.f64585v != 0) {
                uz2Var.m23019l(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            uz2Var.f64575l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            uz2Var.f64574k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (uz2Var.f64584u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            uz2Var.f64578o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            uz2Var.f64577n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = uz2Var.f64585v;
        if (i6 == 0 || i6 == 1) {
            uz2Var.m23019l(1);
        }
    }
}
