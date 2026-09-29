package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class vua extends RecyclerView {

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ ViewPager2 f65959g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vua(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f65959g1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f65959g1.f7117O.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f65959g1;
        accessibilityEvent.setFromIndex(viewPager2.f7121d);
        accessibilityEvent.setToIndex(viewPager2.f7121d);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f7117O.f50863e);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f65959g1.f7115M && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f65959g1.f7115M && super.onTouchEvent(motionEvent);
    }
}
