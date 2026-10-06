package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class miw extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a */
    protected boolean f40710a;

    /* JADX INFO: renamed from: b */
    boolean f40711b;

    /* JADX INFO: renamed from: c */
    private Drawable f40712c;

    /* JADX INFO: renamed from: d */
    private final Rect f40713d;

    /* JADX INFO: renamed from: e */
    private final Rect f40714e;

    /* JADX INFO: renamed from: i */
    private int f40715i;

    public miw(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f40712c;
        if (drawable != null) {
            if (this.f40711b) {
                this.f40711b = false;
                Rect rect = this.f40713d;
                Rect rect2 = this.f40714e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f40710a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f40715i, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f40712c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f40712c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f40712c.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f40712c;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.f40715i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f40712c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f40711b = z | this.f40711b;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f40711b = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f40712c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f40712c);
            }
            this.f40712c = drawable;
            this.f40711b = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f40715i == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i) {
        if (this.f40715i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f40715i = i;
            if (i == 119 && this.f40712c != null) {
                this.f40712c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f40712c;
    }

    public miw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public miw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40713d = new Rect();
        this.f40714e = new Rect();
        this.f40715i = 119;
        this.f40710a = true;
        this.f40711b = false;
        TypedArray typedArrayM16438a = mjb.m16438a(context, attributeSet, miy.f40717a, i, 0, new int[0]);
        this.f40715i = typedArrayM16438a.getInt(1, this.f40715i);
        Drawable drawable = typedArrayM16438a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f40710a = typedArrayM16438a.getBoolean(2, true);
        typedArrayM16438a.recycle();
    }
}
