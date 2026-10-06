package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0084cc extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f5042a;

    /* JADX INFO: renamed from: b */
    private final List f5043b;

    /* JADX INFO: renamed from: c */
    private final List f5044c;

    /* JADX INFO: renamed from: d */
    private View.OnApplyWindowInsetsListener f5045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084cc(Context context, AttributeSet attributeSet, C0111cq c0111cq) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f5043b = new ArrayList();
        this.f5044c = new ArrayList();
        this.f5042a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0047at.f2285b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC0077bw componentCallbacksC0077bwM5324d = c0111cq.m5324d(id);
        if (classAttribute != null && componentCallbacksC0077bwM5324d == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C0085cd c0085cdM5326h = c0111cq.m5326h();
            context.getClassLoader();
            ComponentCallbacksC0077bw componentCallbacksC0077bwMo3476b = c0085cdM5326h.mo3476b(classAttribute);
            componentCallbacksC0077bwMo3476b.getClass();
            componentCallbacksC0077bwMo3476b.onInflate(context, attributeSet, (Bundle) null);
            AbstractC0118cx abstractC0118cxM5327i = c0111cq.m5327i();
            abstractC0118cxM5327i.m5701q();
            componentCallbacksC0077bwMo3476b.f4585M = this;
            abstractC0118cxM5327i.m5698n(getId(), componentCallbacksC0077bwMo3476b, string);
            abstractC0118cxM5327i.mo2016c();
        }
        for (jew jewVar : c0111cq.f8781a.m5548d()) {
            ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) jewVar.f33848c;
            if (componentCallbacksC0077bw.f4576D == getId() && (view = componentCallbacksC0077bw.f4586N) != null && view.getParent() == null) {
                componentCallbacksC0077bw.f4585M = this;
                jewVar.m12999b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3418a(View view) {
        if (this.f5044c.contains(view)) {
            this.f5043b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (C0111cq.m5292g(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ago agoVarM543c;
        windowInsets.getClass();
        ago agoVarM601m = ago.m601m(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5045d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            agoVarM543c = ago.m601m(windowInsetsOnApplyWindowInsets);
        } else {
            agoVarM543c = afq.m543c(this, agoVarM601m);
        }
        if (!agoVarM543c.m616q()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                afq.m542b(getChildAt(i), agoVarM543c);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f5042a) {
            Iterator it = this.f5043b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f5042a && !this.f5043b.isEmpty() && this.f5043b.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f5044c.remove(view);
        if (this.f5043b.remove(view)) {
            this.f5042a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            childAt.getClass();
            m3418a(childAt);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m3418a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m3418a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m3418a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            m3418a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            m3418a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.f5045d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f5044c.add(view);
        }
        super.startViewTransition(view);
    }
}
