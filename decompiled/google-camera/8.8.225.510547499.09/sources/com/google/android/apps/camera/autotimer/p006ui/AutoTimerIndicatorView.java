package com.google.android.apps.camera.autotimer.p006ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.afx;
import p000.hdf;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AutoTimerIndicatorView extends View {

    /* JADX INFO: renamed from: a */
    public static final Duration f6494a = Duration.ofMillis(250);

    /* JADX INFO: renamed from: b */
    static final Duration f6495b = Duration.ofMillis(100);

    /* JADX INFO: renamed from: c */
    public final View.OnLayoutChangeListener f6496c;

    /* JADX INFO: renamed from: d */
    final Paint f6497d;

    /* JADX INFO: renamed from: e */
    final ValueAnimator f6498e;

    /* JADX INFO: renamed from: f */
    public ViewPropertyAnimator f6499f;

    /* JADX INFO: renamed from: g */
    private final int f6500g;

    /* JADX INFO: renamed from: h */
    private final int f6501h;

    /* JADX INFO: renamed from: i */
    private final int f6502i;

    /* JADX INFO: renamed from: j */
    private final int f6503j;

    /* JADX INFO: renamed from: k */
    private final int f6504k;

    /* JADX INFO: renamed from: l */
    private final float f6505l;

    /* JADX INFO: renamed from: m */
    private final float f6506m;

    /* JADX INFO: renamed from: n */
    private final float f6507n;

    /* JADX INFO: renamed from: o */
    private final Matrix f6508o;

    /* JADX INFO: renamed from: p */
    private final Paint f6509p;

    /* JADX INFO: renamed from: q */
    private final Paint f6510q;

    /* JADX INFO: renamed from: r */
    private final RectF f6511r;

    /* JADX INFO: renamed from: s */
    private final RectF f6512s;

    /* JADX INFO: renamed from: t */
    private final RectF f6513t;

    /* JADX INFO: renamed from: u */
    private final RectF f6514u;

    /* JADX INFO: renamed from: v */
    private int f6515v;

    /* JADX INFO: renamed from: w */
    private float f6516w;

    public AutoTimerIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, null);
        Resources resources = getResources();
        this.f6501h = resources.getDimensionPixelSize(C0100R.dimen.autotimer_indicator_height);
        this.f6504k = resources.getDimensionPixelSize(C0100R.dimen.autotimer_indicator_rounded_corner);
        this.f6503j = resources.getDimensionPixelSize(C0100R.dimen.autotimer_indicator_min_width);
        this.f6502i = resources.getDimensionPixelSize(C0100R.dimen.autotimer_indicator_margin);
        int color = resources.getColor(C0100R.color.autotimer_indicator_foreground);
        this.f6500g = color;
        float dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.autotimer_indicator_border_width);
        this.f6505l = dimensionPixelSize;
        this.f6508o = new Matrix();
        this.f6511r = new RectF();
        this.f6514u = new RectF();
        this.f6512s = new RectF();
        this.f6513t = new RectF();
        Paint paint = new Paint();
        this.f6497d = paint;
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f6509p = paint2;
        paint2.setColor(resources.getColor(C0100R.color.autotimer_indicator_background));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f6510q = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(resources.getColor(C0100R.color.autotimer_indicator_background_stroke));
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(dimensionPixelSize);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f);
        this.f6498e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new afx(this, 3));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        float integer = resources.getInteger(C0100R.integer.autotimer_indicator_foreground_alpha_min);
        float integer2 = resources.getInteger(C0100R.integer.autotimer_indicator_foreground_alpha_max);
        this.f6506m = integer / integer2;
        this.f6507n = (integer2 - integer) / integer2;
        this.f6496c = new hdf(this, 1);
    }

    /* JADX INFO: renamed from: c */
    private static RectF m4038c(int i, int i2, int i3, int i4, int i5) {
        return (i5 == 1 || i5 == 3) ? new RectF(i2, i, i4, i3) : new RectF(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m4039a(float f) {
        this.f6516w = f;
        if (getVisibility() == 0) {
            if (this.f6498e.isRunning()) {
                this.f6498e.cancel();
            }
            this.f6498e.setFloatValues(((Float) this.f6498e.getAnimatedValue()).floatValue(), f);
            this.f6498e.setDuration(f6495b.toMillis());
            this.f6498e.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4040b(int i, int i2, int i3, int i4) {
        Display display = getDisplay();
        int rotation = display != null ? display.getRotation() : 0;
        this.f6515v = rotation;
        this.f6508o.reset();
        this.f6508o.postRotate((-rotation) * 90, 0.5f, 0.5f);
        this.f6508o.postTranslate((i3 - i) * 0.5f, (i4 - i2) * 0.5f);
        RectF rectFM4038c = m4038c(i, i2, i3, i4, this.f6515v);
        this.f6513t.top = ((-rectFM4038c.height()) * 0.5f) + this.f6502i;
        RectF rectF = this.f6513t;
        rectF.bottom = rectF.top + this.f6501h;
        this.f6513t.left = ((-rectFM4038c.width()) * 0.5f) + this.f6502i;
        RectF rectF2 = this.f6513t;
        rectF2.right = -rectF2.left;
        this.f6512s.top = this.f6513t.top;
        this.f6512s.bottom = this.f6513t.bottom;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectFM4038c = m4038c(getLeft(), getTop(), getRight(), getBottom(), this.f6515v);
        float fFloatValue = ((Float) this.f6498e.getAnimatedValue()).floatValue();
        int i = this.f6503j;
        float fWidth = rectFM4038c.width();
        int i2 = this.f6502i;
        this.f6512s.left = (-Math.max(i, (int) ((fWidth - (i2 + i2)) * fFloatValue))) * 0.5f;
        RectF rectF = this.f6512s;
        rectF.right = -rectF.left;
        this.f6508o.mapRect(this.f6514u, this.f6512s);
        this.f6508o.mapRect(this.f6511r, this.f6513t);
        this.f6497d.setColor((((int) (((this.f6516w * this.f6507n) + this.f6506m) * 255.0f)) << 24) | (this.f6500g & 16777215));
        RectF rectF2 = this.f6511r;
        float f = this.f6504k;
        canvas.drawRoundRect(rectF2, f, f, this.f6509p);
        float f2 = this.f6511r.left - this.f6505l;
        float f3 = this.f6511r.top - this.f6505l;
        float f4 = this.f6511r.right + this.f6505l;
        float f5 = this.f6511r.bottom + this.f6505l;
        float f6 = this.f6504k;
        canvas.drawRoundRect(f2, f3, f4, f5, f6, f6, this.f6510q);
        RectF rectF3 = this.f6514u;
        float f7 = this.f6504k;
        canvas.drawRoundRect(rectF3, f7, f7, this.f6497d);
    }
}
