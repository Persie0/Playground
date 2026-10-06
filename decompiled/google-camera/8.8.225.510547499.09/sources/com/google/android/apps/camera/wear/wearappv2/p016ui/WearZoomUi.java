package com.google.android.apps.camera.wear.wearappv2.p016ui;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.abu;
import p000.ija;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearZoomUi extends ScrollView {

    /* JADX INFO: renamed from: a */
    public float f7314a;

    /* JADX INFO: renamed from: b */
    private final Paint f7315b;

    /* JADX INFO: renamed from: c */
    private final Paint f7316c;

    /* JADX INFO: renamed from: d */
    private final Paint f7317d;

    /* JADX INFO: renamed from: e */
    private final float f7318e;

    /* JADX INFO: renamed from: f */
    private final float f7319f;

    /* JADX INFO: renamed from: g */
    private final ValueAnimator f7320g;

    public WearZoomUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f7314a = 154.0f;
        Resources resources = context.getResources();
        this.f7318e = resources.getDimension(C0100R.dimen.wear_zoom_slider_margin_outer);
        this.f7319f = resources.getDimension(C0100R.dimen.wear_zoom_bar_slider_knob_size);
        Paint paint = new Paint();
        this.f7315b = paint;
        paint.setColor(abu.m159a(context, C0100R.color.light_grey));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setAlpha(143);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(resources.getDimension(C0100R.dimen.wear_zoom_slider_width));
        Paint paint2 = new Paint();
        this.f7316c = paint2;
        paint2.setColor(abu.m159a(context, R.color.white));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f7317d = paint3;
        paint3.setColor(abu.m159a(context, C0100R.color.zoom_slider_knob_text));
        paint3.setAntiAlias(true);
        try {
            paint3.setTypeface(Typeface.create("google-sans", 1));
        } catch (RuntimeException e) {
            this.f7317d.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        }
        this.f7317d.setTextSize(resources.getDimension(C0100R.dimen.wear_zoom_slider_knob_text_size));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f7320g = valueAnimator;
        valueAnimator.setDuration(Duration.ofMillis(context.getResources().getInteger(C0100R.integer.wear_zoom_bar_anim_duration_default_ms)).toMillis());
        valueAnimator.addUpdateListener(new ija(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final float m4516a() {
        return getWidth() / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m4517b() {
        return getHeight() / 2.0f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - this.f7318e;
        canvas.drawArc(m4516a() - fMin, m4517b() - fMin, m4516a() + fMin, m4517b() + fMin, 154.0f, 52.0f, false, this.f7315b);
        double d = this.f7314a;
        double dCos = Math.cos(Math.toRadians(d));
        double d2 = fMin;
        Double.isNaN(d2);
        double d3 = dCos * d2;
        double dM4516a = m4516a();
        double dSin = Math.sin(Math.toRadians(d));
        Double.isNaN(d2);
        double d4 = dSin * d2;
        double dM4517b = m4517b();
        Double.isNaN(dM4517b);
        Double.isNaN(dM4516a);
        float f = (float) (d3 + dM4516a);
        float f2 = (float) (d4 + dM4517b);
        canvas.drawCircle(f, f2, this.f7319f, this.f7316c);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        canvas.rotate(180.0f, f, f2);
        new Rect();
        throw null;
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        isPressed();
        super.setPressed(z);
    }
}
