package p000;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nr3 extends fua {

    /* JADX INFO: renamed from: c */
    public final Rect f53164c;

    /* JADX INFO: renamed from: d */
    public final Rect f53165d;

    /* JADX INFO: renamed from: e */
    public int f53166e;

    /* JADX INFO: renamed from: f */
    public int f53167f;

    public nr3() {
        this.f53164c = new Rect();
        this.f53165d = new Rect();
        this.f53166e = 0;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: m */
    public final boolean mo5995m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutM6004z;
        f6b lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutM6004z = AppBarLayout.ScrollingViewBehavior.m6004z(coordinatorLayout.m1979j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutM6004z.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m11571a() + lastWindowInsets.m11574d();
        }
        int totalScrollRange = appBarLayoutM6004z.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutM6004z.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.m1985r(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // p000.fua
    /* JADX INFO: renamed from: x */
    public final void mo12202x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutM6004z = AppBarLayout.ScrollingViewBehavior.m6004z(coordinatorLayout.m1979j(view));
        if (appBarLayoutM6004z == null) {
            coordinatorLayout.m1984q(view, i);
            this.f53166e = 0;
            return;
        }
        lm1 lm1Var = (lm1) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin;
        int bottom = appBarLayoutM6004z.getBottom() + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin;
        int bottom2 = ((appBarLayoutM6004z.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin;
        Rect rect = this.f53164c;
        rect.set(paddingLeft, bottom, width, bottom2);
        f6b lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.m11572b() + rect.left;
            rect.right -= lastWindowInsets.m11573c();
        }
        int i2 = lm1Var.f49816c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f53165d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iM17597y = m17597y(appBarLayoutM6004z);
        view.layout(rect2.left, rect2.top - iM17597y, rect2.right, rect2.bottom - iM17597y);
        this.f53166e = rect2.top - appBarLayoutM6004z.getBottom();
    }

    /* JADX INFO: renamed from: y */
    public final int m17597y(View view) {
        int i;
        if (this.f53167f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            im1 im1Var = ((lm1) appBarLayout.getLayoutParams()).f49814a;
            int iMo6002y = im1Var instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) im1Var).mo6002y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo6002y > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iMo6002y / i) + 1.0f;
            }
        }
        int i2 = this.f53167f;
        return AbstractC3584sr.m21645x((int) (f * i2), 0, i2);
    }

    public nr3(int i) {
        super(0);
        this.f53164c = new Rect();
        this.f53165d = new Rect();
        this.f53166e = 0;
    }
}
