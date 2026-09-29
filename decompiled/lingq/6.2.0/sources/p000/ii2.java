package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ii2 extends w28 {

    /* JADX INFO: renamed from: a */
    public final Drawable f44135a;

    /* JADX INFO: renamed from: b */
    public final int f44136b;

    public ii2(int i, Drawable drawable) {
        this.f44135a = drawable;
        this.f44136b = i;
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: h */
    public final void mo12779h(Canvas canvas, RecyclerView recyclerView, k38 k38Var) {
        canvas.getClass();
        k38Var.getClass();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = this.f44136b;
        int i2 = paddingLeft + i;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i;
        int childCount = recyclerView.getChildCount() - 2;
        if (childCount < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i3);
            childAt.getClass();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((z28) layoutParams)).bottomMargin;
            Drawable drawable = this.f44135a;
            int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
            if (drawable != null) {
                drawable.setBounds(i2, bottom, width, intrinsicHeight);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (i3 == childCount) {
                return;
            } else {
                i3++;
            }
        }
    }
}
