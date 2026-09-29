package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.d69;
import p000.e69;
import p000.f69;

/* JADX INFO: loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Paint f11527a;

    /* JADX INFO: renamed from: b */
    public final f69 f11528b;

    /* JADX INFO: renamed from: c */
    public final boolean f11529c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.f11527a = new Paint();
        this.f11528b = new f69();
        this.f11529c = true;
        m5260a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m5260a(Context context, AttributeSet attributeSet) {
        d69 d69Var;
        setWillNotDraw(false);
        this.f11528b.setCallback(this);
        if (attributeSet == null) {
            m5261b(new d69(0).m19758b());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShimmerFrameLayout, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.ShimmerFrameLayout_shimmer_colored) && typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_colored, false)) {
                d69Var = new d69(1);
                ((e69) d69Var.f57375b).f36780p = false;
            } else {
                d69Var = new d69(0);
            }
            m5261b(d69Var.mo10129e(typedArrayObtainStyledAttributes).m19758b());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5261b(e69 e69Var) {
        boolean zIsStarted;
        f69 f69Var = this.f11528b;
        f69Var.f38528f = e69Var;
        if (e69Var != null) {
            f69Var.f38524b.setXfermode(new PorterDuffXfermode(f69Var.f38528f.f36780p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        f69Var.m11568b();
        if (f69Var.f38528f != null) {
            ValueAnimator valueAnimator = f69Var.f38527e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                f69Var.f38527e.cancel();
                f69Var.f38527e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            e69 e69Var2 = f69Var.f38528f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (e69Var2.f36784t / e69Var2.f36783s) + 1.0f);
            f69Var.f38527e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(f69Var.f38528f.f36782r);
            f69Var.f38527e.setRepeatCount(f69Var.f38528f.f36781q);
            ValueAnimator valueAnimator2 = f69Var.f38527e;
            e69 e69Var3 = f69Var.f38528f;
            valueAnimator2.setDuration(e69Var3.f36783s + e69Var3.f36784t);
            f69Var.f38527e.addUpdateListener(f69Var.f38523a);
            if (zIsStarted) {
                f69Var.f38527e.start();
            }
        }
        f69Var.invalidateSelf();
        if (e69Var == null || !e69Var.f36778n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f11527a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11529c) {
            this.f11528b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11528b.m11567a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f69 f69Var = this.f11528b;
        ValueAnimator valueAnimator = f69Var.f38527e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        f69Var.f38527e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11528b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11528b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11527a = new Paint();
        this.f11528b = new f69();
        this.f11529c = true;
        m5260a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11527a = new Paint();
        this.f11528b = new f69();
        this.f11529c = true;
        m5260a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f11527a = new Paint();
        this.f11528b = new f69();
        this.f11529c = true;
        m5260a(context, attributeSet);
    }
}
