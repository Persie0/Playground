package p301oh;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import dm.C5207g;

/* JADX INFO: renamed from: oh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8043b extends RecyclerView.AbstractC1119l {

    /* JADX INFO: renamed from: a */
    public final Drawable f43706a;

    /* JADX INFO: renamed from: b */
    public final int f43707b;

    public C8043b(Drawable drawable, int i10) {
        this.f43706a = drawable;
        this.f43707b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    /* JADX INFO: renamed from: h */
    public final void mo4284h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
        C5207g.m11111f(canvas, "canvas");
        C5207g.m11111f(recyclerView, "parent");
        C5207g.m11111f(c1131x, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int i10 = this.f43707b;
        int i11 = paddingLeft + i10;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i10;
        int childCount = recyclerView.getChildCount() - 2;
        if (childCount >= 0) {
            int i12 = 0;
            while (true) {
                View childAt = recyclerView.getChildAt(i12);
                C5207g.m11110e(childAt, "parent.getChildAt(i)");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C5207g.m11109d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1121n) layoutParams)).bottomMargin;
                Drawable drawable = this.f43706a;
                int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                if (drawable != null) {
                    drawable.setBounds(i11, bottom, width, intrinsicHeight);
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                if (i12 == childCount) {
                    break;
                } else {
                    i12++;
                }
            }
        }
    }
}
