package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import p000.C3100i5;
import p000.io8;
import p000.z0d;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1047a;

    /* JADX INFO: renamed from: b */
    public View f1048b;

    /* JADX INFO: renamed from: c */
    public View f1049c;

    /* JADX INFO: renamed from: d */
    public Drawable f1050d;

    /* JADX INFO: renamed from: e */
    public Drawable f1051e;

    /* JADX INFO: renamed from: f */
    public Drawable f1052f;

    /* JADX INFO: renamed from: g */
    public final boolean f1053g;

    /* JADX INFO: renamed from: h */
    public boolean f1054h;

    /* JADX INFO: renamed from: i */
    public final int f1055i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C3100i5(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
        this.f1050d = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.f1051e = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.f1055i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R$id.split_action_bar) {
            this.f1053g = true;
            this.f1052f = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1053g ? this.f1050d != null || this.f1051e != null : this.f1052f != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1050d;
        if (drawable != null && drawable.isStateful()) {
            this.f1050d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1051e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1051e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1052f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1052f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1050d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1051e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1052f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1048b = findViewById(R$id.action_bar);
        this.f1049c = findViewById(R$id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1047a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f1053g) {
            Drawable drawable = this.f1052f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1050d == null) {
                z2 = false;
            } else if (this.f1048b.getVisibility() == 0) {
                this.f1050d.setBounds(this.f1048b.getLeft(), this.f1048b.getTop(), this.f1048b.getRight(), this.f1048b.getBottom());
            } else {
                View view = this.f1049c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1050d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1050d.setBounds(this.f1049c.getLeft(), this.f1049c.getTop(), this.f1049c.getRight(), this.f1049c.getBottom());
                }
            }
            this.f1054h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1048b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1055i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1048b == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1050d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1050d);
        }
        this.f1050d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1048b;
            if (view != null) {
                this.f1050d.setBounds(view.getLeft(), this.f1048b.getTop(), this.f1048b.getRight(), this.f1048b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f1053g ? !(this.f1050d != null || this.f1051e != null) : this.f1052f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        z0d.m25400b(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1052f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1052f);
        }
        this.f1052f = drawable;
        boolean z = this.f1053g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f1052f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f1050d != null || this.f1051e != null) : this.f1052f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        z0d.m25400b(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1051e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1051e);
        }
        this.f1051e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1054h && this.f1051e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f1053g ? !(this.f1050d != null || this.f1051e != null) : this.f1052f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        z0d.m25400b(this);
    }

    public void setTabContainer(io8 io8Var) {
    }

    public void setTransitioning(boolean z) {
        this.f1047a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1050d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1051e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1052f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1050d;
        boolean z = this.f1053g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f1051e && this.f1054h) {
            return true;
        }
        return (drawable == this.f1052f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
