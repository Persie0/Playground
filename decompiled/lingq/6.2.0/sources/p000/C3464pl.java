package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import java.util.HashMap;

/* JADX INFO: renamed from: pl */
/* JADX INFO: loaded from: classes.dex */
public final class C3464pl extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final HashMap f56393a;

    /* JADX INFO: renamed from: b */
    public final HashMap f56394b;

    public C3464pl(Context context) {
        super(context);
        setClipChildren(false);
        this.f56393a = new HashMap();
        this.f56394b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC0442b, C0357g> getHolderToLayoutNode() {
        return this.f56393a;
    }

    public final HashMap<C0357g, AbstractC0442b> getLayoutNodeToHolder() {
        return this.f56394b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC0442b abstractC0442b : this.f56393a.keySet()) {
            abstractC0442b.layout(abstractC0442b.getLeft(), abstractC0442b.getTop(), abstractC0442b.getRight(), abstractC0442b.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            i54.m13662a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            i54.m13662a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC0442b abstractC0442b : this.f56393a.keySet()) {
            int i4 = abstractC0442b.f5186Q;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC0442b.f5187R) != Integer.MIN_VALUE) {
                abstractC0442b.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0357g c0357g = (C0357g) this.f56393a.get(childAt);
            if (childAt.isLayoutRequested() && c0357g != null) {
                C0357g.m1555b0(c0357g, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
