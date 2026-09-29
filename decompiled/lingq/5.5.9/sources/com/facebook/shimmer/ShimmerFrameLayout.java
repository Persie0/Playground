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
import p359r8.C8746a;
import p359r8.C8747b;

/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Paint f11709a;

    /* JADX INFO: renamed from: b */
    public final C8747b f11710b;

    /* JADX INFO: renamed from: c */
    public boolean f11711c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11709a = new Paint();
        C8747b c8747b = new C8747b();
        this.f11710b = c8747b;
        this.f11711c = true;
        setWillNotDraw(false);
        c8747b.setCallback(this);
        if (attributeSet == null) {
            m6746a(new C2338a.a().m6750a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8746a.f46374a, 0, 0);
        try {
            m6746a(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new C2338a.c() : new C2338a.a()).mo6751b(typedArrayObtainStyledAttributes).m6750a());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6746a(C2338a c2338a) {
        boolean zIsStarted;
        C8747b c8747b = this.f11710b;
        c8747b.f46380f = c2338a;
        if (c2338a != null) {
            c8747b.f46376b.setXfermode(new PorterDuffXfermode(c8747b.f46380f.f11727p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        c8747b.m16984b();
        if (c8747b.f46380f != null) {
            ValueAnimator valueAnimator = c8747b.f46379e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                c8747b.f46379e.cancel();
                c8747b.f46379e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            C2338a c2338a2 = c8747b.f46380f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (c2338a2.f11731t / c2338a2.f11730s) + 1.0f);
            c8747b.f46379e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(c8747b.f46380f.f11729r);
            c8747b.f46379e.setRepeatCount(c8747b.f46380f.f11728q);
            ValueAnimator valueAnimator2 = c8747b.f46379e;
            C2338a c2338a3 = c8747b.f46380f;
            valueAnimator2.setDuration(c2338a3.f11730s + c2338a3.f11731t);
            c8747b.f46379e.addUpdateListener(c8747b.f46375a);
            if (zIsStarted) {
                c8747b.f46379e.start();
            }
        }
        c8747b.invalidateSelf();
        if (c2338a == null || !c2338a.f11725n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f11709a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6747b() {
        C8747b c8747b = this.f11710b;
        ValueAnimator valueAnimator = c8747b.f46379e;
        if (valueAnimator != null) {
            if (!(valueAnimator != null && valueAnimator.isStarted()) && c8747b.getCallback() != null) {
                c8747b.f46379e.start();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6748c() {
        C8747b c8747b = this.f11710b;
        ValueAnimator valueAnimator = c8747b.f46379e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                c8747b.f46379e.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11711c) {
            this.f11710b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11710b.m16983a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6748c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f11710b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f11710b) {
            return false;
        }
        return true;
    }
}
