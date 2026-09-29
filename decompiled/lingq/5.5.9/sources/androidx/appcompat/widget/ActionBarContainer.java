package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.linguist.R;
import java.util.WeakHashMap;
import p058d.C4999a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f787a;

    /* JADX INFO: renamed from: b */
    public C0345u0 f788b;

    /* JADX INFO: renamed from: c */
    public View f789c;

    /* JADX INFO: renamed from: d */
    public View f790d;

    /* JADX INFO: renamed from: e */
    public Drawable f791e;

    /* JADX INFO: renamed from: f */
    public Drawable f792f;

    /* JADX INFO: renamed from: g */
    public Drawable f793g;

    /* JADX INFO: renamed from: h */
    public final boolean f794h;

    /* JADX INFO: renamed from: i */
    public boolean f795i;

    /* JADX INFO: renamed from: j */
    public final int f796j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0298b c0298b = new C0298b(this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(this, c0298b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32587a);
        boolean z10 = false;
        this.f791e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f792f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f796j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f794h = true;
            this.f793g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f794h ? !(this.f791e != null || this.f792f != null) : this.f793g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    /* JADX INFO: renamed from: a */
    public static int m955a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f791e;
        if (drawable != null && drawable.isStateful()) {
            this.f791e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f792f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f792f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f793g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f793g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f788b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f791e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f792f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f793g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f789c = findViewById(R.id.action_bar);
        this.f790d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f787a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[PHI: r0
      0x0059: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00ca, B:33:0x00ce, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        C0345u0 c0345u0 = this.f788b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (c0345u0 == null || c0345u0.getVisibility() == 8) ? false : true;
        if (c0345u0 != null && c0345u0.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0345u0.getLayoutParams();
            int measuredHeight2 = measuredHeight - c0345u0.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            c0345u0.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f794h) {
            Drawable drawable2 = this.f793g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f791e != null) {
                if (this.f789c.getVisibility() == 0) {
                    this.f791e.setBounds(this.f789c.getLeft(), this.f789c.getTop(), this.f789c.getRight(), this.f789c.getBottom());
                } else {
                    View view = this.f790d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f791e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f791e.setBounds(this.f790d.getLeft(), this.f790d.getTop(), this.f790d.getRight(), this.f790d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f795i = z13;
            if (!z13 || (drawable = this.f792f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(c0345u0.getLeft(), c0345u0.getTop(), c0345u0.getRight(), c0345u0.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f789c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f796j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f789c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        C0345u0 c0345u0 = this.f788b;
        if (c0345u0 != null && c0345u0.getVisibility() != 8 && mode != 1073741824) {
            View view = this.f789c;
            boolean z10 = true;
            int iM955a = 0;
            if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
                View view2 = this.f790d;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    iM955a = m955a(this.f790d);
                }
            } else {
                iM955a = m955a(this.f789c);
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(m955a(this.f788b) + iM955a, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f791e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f791e);
        }
        this.f791e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f789c;
            if (view != null) {
                this.f791e.setBounds(view.getLeft(), this.f789c.getTop(), this.f789c.getRight(), this.f789c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f794h ? this.f791e != null || this.f792f != null : this.f793g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f793g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f793g);
        }
        this.f793g = drawable;
        boolean z10 = this.f794h;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f793g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f791e != null || this.f792f != null) : this.f793g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f792f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f792f);
        }
        this.f792f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f795i && (drawable2 = this.f792f) != null) {
                drawable2.setBounds(this.f788b.getLeft(), this.f788b.getTop(), this.f788b.getRight(), this.f788b.getBottom());
            }
        }
        setWillNotDraw(!this.f794h ? !(this.f791e == null && this.f792f == null) : this.f793g != null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0345u0 c0345u0) {
        C0345u0 c0345u1 = this.f788b;
        if (c0345u1 != null) {
            removeView(c0345u1);
        }
        this.f788b = c0345u0;
        if (c0345u0 != null) {
            addView(c0345u0);
            ViewGroup.LayoutParams layoutParams = c0345u0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0345u0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f787a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f791e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f792f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f793g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f791e;
        boolean z10 = this.f794h;
        if ((drawable != drawable2 || z10) && ((drawable != this.f792f || !this.f795i) && (drawable != this.f793g || !z10))) {
            if (!super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
