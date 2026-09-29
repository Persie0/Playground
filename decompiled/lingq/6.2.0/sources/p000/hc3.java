package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hc3 extends cd5 {

    /* JADX INFO: renamed from: K */
    public Drawable f42162K;

    /* JADX INFO: renamed from: L */
    public final Rect f42163L;

    /* JADX INFO: renamed from: M */
    public final Rect f42164M;

    /* JADX INFO: renamed from: N */
    public int f42165N;

    /* JADX INFO: renamed from: O */
    public final boolean f42166O;

    /* JADX INFO: renamed from: P */
    public boolean f42167P;

    public hc3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42163L = new Rect();
        this.f42164M = new Rect();
        this.f42165N = 119;
        this.f42166O = true;
        this.f42167P = false;
        int[] iArr = R$styleable.ForegroundLinearLayout;
        dy9.m10748a(context, attributeSet, i, 0);
        dy9.m10749b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f42165N = typedArrayObtainStyledAttributes.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f42165N);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f42166O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f42162K;
        if (drawable != null) {
            if (this.f42167P) {
                this.f42167P = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f42166O;
                Rect rect = this.f42163L;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f42165N;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f42164M;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f42162K;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f42162K;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f42162K.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f42162K;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f42165N;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f42162K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.cd5, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f42167P = z | this.f42167P;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f42167P = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f42162K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f42162K);
            }
            this.f42162K = drawable;
            this.f42167P = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f42165N == 119) {
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
    public void setForegroundGravity(int i) {
        if (this.f42165N != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f42165N = i;
            if (i == 119 && this.f42162K != null) {
                this.f42162K.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f42162K;
    }
}
