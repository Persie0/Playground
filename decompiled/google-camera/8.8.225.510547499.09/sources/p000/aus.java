package p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aus extends RecyclerView {

    /* JADX INFO: renamed from: W */
    final /* synthetic */ ViewPager2 f2435W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aus(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f2435W = viewPager2;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setFromIndex(this.f2435W.f1667b);
        accessibilityEvent.setToIndex(this.f2435W.f1667b);
        accessibilityEvent.setSource(((auq) this.f2435W.f1675j).f2430a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2435W.f1672g && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f2435W.f1672g && super.onTouchEvent(motionEvent);
    }
}
