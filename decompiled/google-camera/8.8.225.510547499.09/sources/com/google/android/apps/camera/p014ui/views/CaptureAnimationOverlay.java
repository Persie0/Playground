package com.google.android.apps.camera.p014ui.views;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p000.ibw;
import p000.iio;
import p000.iip;
import p000.iiq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CaptureAnimationOverlay extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f7192a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f7193b;

    /* JADX INFO: renamed from: c */
    public int f7194c;

    /* JADX INFO: renamed from: d */
    private final RectF f7195d;

    /* JADX INFO: renamed from: e */
    private final Interpolator f7196e;

    /* JADX INFO: renamed from: f */
    private final Interpolator f7197f;

    /* JADX INFO: renamed from: g */
    private final Interpolator f7198g;

    /* JADX INFO: renamed from: h */
    private final ValueAnimator.AnimatorUpdateListener f7199h;

    public CaptureAnimationOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7194c = 1;
        this.f7195d = new RectF();
        Paint paint = new Paint();
        this.f7192a = paint;
        paint.setColor(-16777216);
        this.f7196e = new LinearInterpolator();
        this.f7197f = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.f7198g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_linear_in);
        this.f7199h = new ibw(this, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m4435a(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        AnimatorSet animatorSet = this.f7193b;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f7193b.cancel();
        }
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.6f);
            valueAnimatorOfFloat.setDuration(167L);
            valueAnimatorOfFloat.setInterpolator(this.f7197f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 0.0f);
            valueAnimatorOfFloat.setDuration(133L);
            valueAnimatorOfFloat.setInterpolator(this.f7198g);
        }
        valueAnimatorOfFloat.addUpdateListener(this.f7199h);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7193b = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat);
        this.f7193b.addListener(new iiq(this, z));
        this.f7193b.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m4436b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.76f, 0.76f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.76f, 0.0f);
        valueAnimatorOfFloat.setDuration(66L);
        valueAnimatorOfFloat2.setDuration(166L);
        valueAnimatorOfFloat.addUpdateListener(this.f7199h);
        valueAnimatorOfFloat2.addUpdateListener(this.f7199h);
        valueAnimatorOfFloat.setInterpolator(this.f7196e);
        valueAnimatorOfFloat2.setInterpolator(this.f7196e);
        valueAnimatorOfFloat.addListener(new iio(this, valueAnimatorOfFloat2));
        valueAnimatorOfFloat2.addListener(new iip(this));
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.f7195d.set(new Rect(i, i2, i3, i4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f7194c != 1) {
            canvas.drawRect(this.f7195d, this.f7192a);
            canvas.clipRect(this.f7195d);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7195d.set(i, i2, i3, i4);
    }
}
