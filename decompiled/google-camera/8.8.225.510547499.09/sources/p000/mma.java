package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mma extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f41008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TabLayout f41009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mma(TabLayout tabLayout, Context context) {
        super(context);
        this.f41009b = tabLayout;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: e */
    private final void m16611e(int i) {
        if (this.f41009b.f8178A != 0) {
            return;
        }
        View childAt = getChildAt(i);
        TabLayout tabLayout = this.f41009b;
        Drawable drawable = tabLayout.f8205l;
        RectF rectFM16542f = mkv.m16542f(tabLayout, childAt);
        drawable.setBounds((int) rectFM16542f.left, drawable.getBounds().top, (int) rectFM16542f.right, drawable.getBounds().bottom);
        this.f41009b.f8194a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m16612a() {
        m16611e(this.f41009b.m4856a());
    }

    /* JADX INFO: renamed from: b */
    public final void m16613b(int i) {
        Rect bounds = this.f41009b.f8205l.getBounds();
        this.f41009b.f8205l.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final void m16614c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = this.f41009b.f8205l;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.f41009b.f8205l.getBounds().bottom);
        } else {
            TabLayout tabLayout = this.f41009b;
            tabLayout.f8179B.mo16562g(tabLayout, view, view2, f, tabLayout.f8205l);
        }
        afb.m426g(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m16615d(boolean z, int i, int i2) {
        TabLayout tabLayout = this.f41009b;
        if (tabLayout.f8194a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.m4856a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m16612a();
            return;
        }
        this.f41009b.f8194a = i;
        mlz mlzVar = new mlz(this, childAt, childAt2, 0);
        if (!z) {
            this.f41008a.removeAllUpdateListeners();
            this.f41008a.addUpdateListener(mlzVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f41008a = valueAnimator;
        valueAnimator.setInterpolator(this.f41009b.f8218y);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(mlzVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int iHeight = this.f41009b.f8205l.getBounds().height();
        if (iHeight < 0) {
            iHeight = this.f41009b.f8205l.getIntrinsicHeight();
        }
        int height = 0;
        switch (this.f41009b.f8212s) {
            case 0:
                height = getHeight() - iHeight;
                iHeight = getHeight();
                break;
            case 1:
                int height2 = getHeight() - iHeight;
                iHeight = (getHeight() + iHeight) / 2;
                height = height2 / 2;
                break;
            case 2:
                break;
            case 3:
                iHeight = getHeight();
                break;
            default:
                iHeight = 0;
                break;
        }
        if (this.f41009b.f8205l.getBounds().width() > 0) {
            Rect bounds = this.f41009b.f8205l.getBounds();
            this.f41009b.f8205l.setBounds(bounds.left, height, bounds.right, iHeight);
            this.f41009b.f8205l.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f41008a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m16615d(false, this.f41009b.m4856a(), -1);
            return;
        }
        TabLayout tabLayout = this.f41009b;
        int iM4856a = tabLayout.f8194a;
        if (iM4856a == -1) {
            iM4856a = tabLayout.m4856a();
            tabLayout.f8194a = iM4856a;
        }
        m16611e(iM4856a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f41009b;
        if (tabLayout.f8210q == 1 || tabLayout.f8213t == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            int iM15399G = (int) lij.m15399G(getContext(), 16);
            if (iMax * childCount <= getMeasuredWidth() - (iM15399G + iM15399G)) {
                boolean z = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                TabLayout tabLayout2 = this.f41009b;
                tabLayout2.f8210q = 0;
                tabLayout2.m4866k(false);
            }
            super.onMeasure(i, i2);
        }
    }
}
