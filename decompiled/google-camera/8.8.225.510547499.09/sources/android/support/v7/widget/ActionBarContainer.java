package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0193fr;
import p000.C0249ht;
import p000.afb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f938a;

    /* JADX INFO: renamed from: b */
    public Drawable f939b;

    /* JADX INFO: renamed from: c */
    public Drawable f940c;

    /* JADX INFO: renamed from: d */
    public boolean f941d;

    /* JADX INFO: renamed from: e */
    public boolean f942e;

    /* JADX INFO: renamed from: f */
    private boolean f943f;

    /* JADX INFO: renamed from: g */
    private View f944g;

    /* JADX INFO: renamed from: h */
    private View f945h;

    /* JADX INFO: renamed from: i */
    private int f946i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1041a(boolean z) {
        this.f943f = z;
        setDescendantFocusability(true != z ? 262144 : 393216);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f938a;
        if (drawable != null && drawable.isStateful()) {
            this.f938a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f939b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f939b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f940c;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f940c.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f938a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f939b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f940c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f944g = findViewById(C0100R.id.action_bar);
        this.f945h = findViewById(C0100R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f943f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f941d) {
            Drawable drawable = this.f940c;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f938a != null) {
                z2 = true;
                if (this.f944g.getVisibility() == 0) {
                    this.f938a.setBounds(this.f944g.getLeft(), this.f944g.getTop(), this.f944g.getRight(), this.f944g.getBottom());
                } else {
                    View view = this.f945h;
                    if (view == null || view.getVisibility() != 0) {
                        this.f938a.setBounds(0, 0, 0, 0);
                    } else {
                        this.f938a.setBounds(this.f945h.getLeft(), this.f945h.getTop(), this.f945h.getRight(), this.f945h.getBottom());
                    }
                }
            } else {
                z2 = false;
            }
            this.f942e = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f944g == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f946i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f944g == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.f938a;
        boolean z = i == 0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f939b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f940c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f938a || this.f941d) {
            return (drawable == this.f940c && this.f941d) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        afb.m432m(this, new C0249ht(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23257a);
        boolean z = false;
        this.f938a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f939b = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f946i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C0100R.id.split_action_bar) {
            this.f941d = true;
            this.f940c = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (this.f941d) {
            if (this.f940c == null) {
                z = true;
            }
        } else if (this.f938a == null && this.f939b == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
