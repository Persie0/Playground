package p507yc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0323j0;
import p153hc.C6031a;

/* JADX INFO: renamed from: yc.e */
/* JADX INFO: loaded from: classes.dex */
public class C10338e extends C0323j0 {

    /* JADX INFO: renamed from: K */
    public Drawable f52029K;

    /* JADX INFO: renamed from: L */
    public final Rect f52030L;

    /* JADX INFO: renamed from: M */
    public final Rect f52031M;

    /* JADX INFO: renamed from: N */
    public int f52032N;

    /* JADX INFO: renamed from: O */
    public final boolean f52033O;

    /* JADX INFO: renamed from: P */
    public boolean f52034P;

    public C10338e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10338e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f52030L = new Rect();
        this.f52031M = new Rect();
        this.f52032N = 119;
        this.f52033O = true;
        this.f52034P = false;
        TypedArray typedArrayM19357d = C10344k.m19357d(context, attributeSet, C6031a.f35664n, 0, 0, new int[0]);
        this.f52032N = typedArrayM19357d.getInt(1, this.f52032N);
        Drawable drawable = typedArrayM19357d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f52033O = typedArrayM19357d.getBoolean(2, true);
        typedArrayM19357d.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f52029K;
        if (drawable != null) {
            if (this.f52034P) {
                this.f52034P = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f52033O;
                Rect rect = this.f52030L;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f52032N;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f52031M;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f3, float f10) {
        super.drawableHotspotChanged(f3, f10);
        Drawable drawable = this.f52029K;
        if (drawable != null) {
            drawable.setHotspot(f3, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f52029K;
        if (drawable != null && drawable.isStateful()) {
            this.f52029K.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f52029K;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f52032N;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f52029K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f52034P = z10 | this.f52034P;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f52034P = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f52029K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f52029K);
            }
            this.f52029K = drawable;
            this.f52034P = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f52032N == 119) {
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
    public void setForegroundGravity(int i10) {
        if (this.f52032N != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f52032N = i10;
            if (i10 == 119 && this.f52029K != null) {
                this.f52029K.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f52029K;
    }
}
