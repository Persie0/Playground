package p000;

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixs extends C0789lb {

    /* JADX INFO: renamed from: b */
    public int f32606b = 0;

    /* JADX INFO: renamed from: c */
    private final float f32607c;

    /* JADX INFO: renamed from: d */
    private final float f32608d;

    /* JADX INFO: renamed from: e */
    private RecyclerView f32609e;

    public ixs(float f, float f2) {
        this.f32607c = f;
        this.f32608d = f2;
    }

    @Override // p000.C0789lb, p000.AbstractC0815ma
    /* JADX INFO: renamed from: a */
    public final int mo11871a(AbstractC0812ly abstractC0812ly, int i, int i2) {
        View viewMo2046b;
        int iM16136be;
        int iComputeHorizontalScrollRange;
        int iMo11871a = super.mo11871a(abstractC0812ly, i, i2);
        RecyclerView recyclerView = this.f32609e;
        int iM16165al = abstractC0812ly.m16165al();
        if (recyclerView == null || iM16165al == 0 || (viewMo2046b = mo2046b(abstractC0812ly)) == null || (iM16136be = AbstractC0812ly.m16136be(viewMo2046b)) == -1) {
            return iMo11871a;
        }
        if (abstractC0812ly.mo1163W()) {
            iComputeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            iComputeHorizontalScrollRange = abstractC0812ly.mo1162V() ? recyclerView.computeHorizontalScrollRange() : 0;
        }
        this.f32606b = (iComputeHorizontalScrollRange / iM16165al) * Math.abs(iMo11871a - iM16136be);
        return iMo11871a;
    }

    @Override // p000.C0789lb, p000.AbstractC0815ma
    /* JADX INFO: renamed from: c */
    public final int[] mo11872c(AbstractC0812ly abstractC0812ly, View view) {
        int[] iArrMo11872c = super.mo11872c(abstractC0812ly, view);
        Point pointM13922k = kbd.m13922k(abstractC0812ly, view);
        iArrMo11872c[0] = iArrMo11872c[0] + pointM13922k.x;
        iArrMo11872c[1] = iArrMo11872c[1] + pointM13922k.y;
        return iArrMo11872c;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: d */
    public final C0825mk mo11873d(AbstractC0812ly abstractC0812ly) {
        RecyclerView recyclerView = this.f32609e;
        if (recyclerView == null) {
            return null;
        }
        return new ixz(recyclerView.getContext(), this.f32607c, this.f32608d, new dvz(this, abstractC0812ly, 9), new dfg(this, 8));
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: e */
    public final void mo11874e(RecyclerView recyclerView) {
        super.mo11874e(recyclerView);
        this.f32609e = recyclerView;
    }

    @Override // p000.AbstractC0815ma
    /* JADX INFO: renamed from: g */
    public final int[] mo11875g(int i, int i2) {
        int i3;
        int i4;
        int[] iArrG = super.mo11875g(i, i2);
        RecyclerView recyclerView = this.f32609e;
        if (recyclerView != null) {
            AbstractC0806ls abstractC0806ls = recyclerView.f1123m;
            if (abstractC0806ls == null) {
                i4 = 0;
            } else {
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                int i5 = displayMetrics.widthPixels + displayMetrics.heightPixels;
                int iMo1762a = abstractC0806ls.mo1762a();
                if (iMo1762a <= 10) {
                    i3 = 4;
                } else {
                    i3 = iMo1762a >= 100 ? 8 : (int) ((((iMo1762a - 10) / 90.0f) * 4.0f) + 4.0f);
                }
                i4 = (i5 / 2) * i3;
            }
            int iMin = Math.min(i4, recyclerView.computeHorizontalScrollRange());
            int iMin2 = Math.min(i4, recyclerView.computeVerticalScrollRange());
            iArrG[0] = aax.m69d(iArrG[0], -iMin, iMin);
            iArrG[1] = aax.m69d(iArrG[1], -iMin2, iMin2);
        }
        this.f32606b = Math.max(Math.abs(iArrG[0]), Math.abs(iArrG[1]));
        return iArrG;
    }
}
