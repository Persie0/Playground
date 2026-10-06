package com.google.android.apps.camera.p014ui.shutterbutton;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.ibw;
import p000.igh;
import p000.igi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ShutterButtonProgressOverlay extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f7172a;

    /* JADX INFO: renamed from: b */
    public int f7173b;

    /* JADX INFO: renamed from: c */
    public float f7174c;

    /* JADX INFO: renamed from: d */
    public int f7175d;

    /* JADX INFO: renamed from: e */
    public final int f7176e;

    /* JADX INFO: renamed from: f */
    public final int f7177f;

    /* JADX INFO: renamed from: g */
    public boolean f7178g;

    /* JADX INFO: renamed from: h */
    public boolean f7179h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f7180i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f7181j;

    /* JADX INFO: renamed from: k */
    public int f7182k;

    /* JADX INFO: renamed from: l */
    private final int f7183l;

    /* JADX INFO: renamed from: m */
    private final Paint f7184m;

    /* JADX INFO: renamed from: n */
    private final Interpolator f7185n;

    /* JADX INFO: renamed from: o */
    private final Interpolator f7186o;

    /* JADX INFO: renamed from: p */
    private int f7187p;

    /* JADX INFO: renamed from: q */
    private int f7188q;

    /* JADX INFO: renamed from: r */
    private int f7189r;

    /* JADX INFO: renamed from: s */
    private final RectF f7190s;

    /* JADX INFO: renamed from: t */
    private AnimatorSet f7191t;

    public ShutterButtonProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7182k = 1;
        this.f7175d = 0;
        this.f7187p = 0;
        this.f7190s = new RectF();
        this.f7178g = true;
        this.f7179h = true;
        this.f7180i = null;
        this.f7191t = null;
        this.f7181j = null;
        setVisibility(4);
        this.f7183l = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_radius_max);
        this.f7176e = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_radius);
        this.f7177f = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_width);
        this.f7185n = new LinearInterpolator();
        this.f7186o = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        Paint paint = new Paint();
        this.f7172a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.f7184m = paint2;
        paint2.setAlpha(255);
        this.f7178g = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m4433a() {
        AnimatorSet animatorSet = this.f7191t;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f7191t.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7177f, 0.0f);
        valueAnimatorOfFloat.setDuration(133L);
        valueAnimatorOfFloat.setInterpolator(this.f7185n);
        valueAnimatorOfFloat.addUpdateListener(new ibw(this, 11));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7191t = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat);
        this.f7191t.addListener(new igi(this));
        this.f7191t.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m4434b(int i, long j, boolean z) {
        int iMin = Math.min(100, Math.max(i, 0));
        if (iMin == 0) {
            AnimatorSet animatorSet = this.f7191t;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f7191t.cancel();
            }
            if (this.f7178g) {
                this.f7175d = 0;
                this.f7187p = 0;
                this.f7178g = false;
                this.f7179h = true;
                AnimatorSet animatorSet2 = this.f7180i;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    this.f7180i.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f7183l, this.f7176e);
                valueAnimatorOfInt.setDuration(167L);
                valueAnimatorOfInt.setInterpolator(this.f7186o);
                valueAnimatorOfInt.addUpdateListener(new ibw(this, 9));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f7177f);
                valueAnimatorOfFloat.setDuration(167L);
                valueAnimatorOfFloat.setInterpolator(this.f7186o);
                valueAnimatorOfFloat.addUpdateListener(new ibw(this, 10));
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.f7180i = animatorSet3;
                animatorSet3.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
                this.f7180i.addListener(new igh(this));
                this.f7180i.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = this.f7180i;
        if (animatorSet4 != null && animatorSet4.isRunning()) {
            this.f7180i.cancel();
        }
        this.f7182k = 4;
        if (j > 0) {
            ValueAnimator valueAnimator = this.f7181j;
            boolean z2 = valueAnimator != null && valueAnimator.isRunning();
            if (iMin < 100 && !z2) {
                long j2 = true != z ? j : 3000L;
                int i2 = z ? (int) (j / 3000) : 0;
                ValueAnimator valueAnimator2 = this.f7181j;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f7181j.cancel();
                }
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 360);
                this.f7181j = valueAnimatorOfInt2;
                valueAnimatorOfInt2.setDuration(j2);
                this.f7181j.setInterpolator(this.f7186o);
                this.f7181j.addUpdateListener(new ibw(this, 8));
                this.f7181j.setRepeatCount(i2);
                this.f7181j.start();
            }
        } else {
            this.f7175d = (int) (iMin * 3.6f);
            invalidate();
        }
        if (iMin == 100) {
            ValueAnimator valueAnimator3 = this.f7181j;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                this.f7181j.cancel();
            }
            m4433a();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f7182k == 1) {
            return;
        }
        if (this.f7179h) {
            canvas.drawCircle(this.f7188q, this.f7189r, this.f7173b, this.f7172a);
        }
        int i = this.f7182k;
        if (i == 4 || i == 3) {
            this.f7172a.setStrokeWidth(this.f7174c);
            this.f7184m.setStrokeWidth(this.f7174c);
            RectF rectF = this.f7190s;
            int i2 = this.f7188q;
            int i3 = this.f7173b;
            int i4 = this.f7189r;
            rectF.set(i2 - i3, i4 - i3, i2 + i3, i4 + i3);
            canvas.drawArc(this.f7190s, this.f7187p - 100, 20.0f, false, this.f7184m);
            this.f7187p = this.f7175d;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f7188q = (i3 - i) / 2;
            this.f7189r = (i4 - i2) / 2;
        }
    }
}
