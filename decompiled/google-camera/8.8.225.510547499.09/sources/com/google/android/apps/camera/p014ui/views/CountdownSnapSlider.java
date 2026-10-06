package com.google.android.apps.camera.p014ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C0280ix;
import p000.ckw;
import p000.hxf;
import p000.hxk;
import p000.jzn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CountdownSnapSlider extends C0280ix {

    /* JADX INFO: renamed from: a */
    public final Set f7200a;

    /* JADX INFO: renamed from: b */
    public int f7201b;

    /* JADX INFO: renamed from: c */
    public double f7202c;

    /* JADX INFO: renamed from: d */
    public double f7203d;

    /* JADX INFO: renamed from: e */
    public double f7204e;

    /* JADX INFO: renamed from: f */
    public double f7205f;

    /* JADX INFO: renamed from: g */
    public hxf f7206g;

    /* JADX INFO: renamed from: h */
    private final PointF f7207h;

    /* JADX INFO: renamed from: i */
    private final Paint f7208i;

    /* JADX INFO: renamed from: j */
    private final Paint f7209j;

    /* JADX INFO: renamed from: k */
    private int f7210k;

    /* JADX INFO: renamed from: l */
    private int f7211l;

    /* JADX INFO: renamed from: m */
    private final int f7212m;

    /* JADX INFO: renamed from: n */
    private final int f7213n;

    /* JADX INFO: renamed from: o */
    private final int f7214o;

    /* JADX INFO: renamed from: p */
    private final int f7215p;

    /* JADX INFO: renamed from: q */
    private final int f7216q;

    /* JADX INFO: renamed from: r */
    private final PointF f7217r;

    public CountdownSnapSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: j */
    private final double m4437j(double d) {
        return Math.min(this.f7203d, Math.max(this.f7202c, d));
    }

    /* JADX INFO: renamed from: k */
    private final void m4438k(Canvas canvas, float f, double d) {
        this.f7209j.setAlpha((int) (d * 77.0d));
        canvas.drawLine(f, this.f7207h.y, f + this.f7213n, this.f7207h.y, this.f7209j);
    }

    /* JADX INFO: renamed from: l */
    private final void m4439l(Canvas canvas, float f, double d) {
        this.f7208i.setAlpha((int) (d * 255.0d));
        canvas.drawCircle(f, this.f7207h.y, this.f7212m, this.f7208i);
    }

    /* JADX INFO: renamed from: a */
    public final double m4440a(double d) {
        double d2 = this.f7210k;
        double dM4443d = m4443d();
        Double.isNaN(d2);
        Double.isNaN(dM4443d);
        return (d2 * d) / dM4443d;
    }

    /* JADX INFO: renamed from: b */
    public final double m4441b(double d) {
        double d2 = Double.MAX_VALUE;
        double d3 = d;
        for (int i = 0; i < this.f7201b; i++) {
            double d4 = i;
            Double.isNaN(d4);
            double dAbs = Math.abs(d - d4);
            if (!this.f7200a.contains(Integer.valueOf(i)) && dAbs < d2) {
                d3 = d4;
                d2 = dAbs;
            }
        }
        return d3;
    }

    /* JADX INFO: renamed from: c */
    public final double m4442c() {
        return m4441b(this.f7205f);
    }

    /* JADX INFO: renamed from: d */
    public final int m4443d() {
        return this.f7201b - 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m4444e(double d) {
        this.f7205f = Math.min(m4443d(), Math.max(0.0d, d));
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public final void m4445f(int i) {
        this.f7211l = i;
        this.f7207h.set(getWidth() / 2.0f, (getHeight() / 2.0f) - this.f7211l);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4446g(int i) {
        return this.f7200a.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4447h() {
        return this.f7205f % 1.0d == 0.0d;
    }

    /* JADX INFO: renamed from: i */
    public final void m4448i() {
        this.f7201b = 3;
        int iM4443d = m4443d();
        setMax(iM4443d);
        if (this.f7200a.contains(Integer.valueOf(iM4443d))) {
            iM4443d--;
        }
        this.f7203d = iM4443d;
        int i = this.f7216q;
        this.f7210k = i + i;
    }

    @Override // p000.C0280ix, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        double d = this.f7207h.x;
        double dM4440a = m4440a(this.f7205f);
        Double.isNaN(d);
        float f = (float) (d - dM4440a);
        if (this.f7200a.contains(0)) {
            m4439l(canvas, f, this.f7204e);
            m4438k(canvas, this.f7212m + f + this.f7215p, this.f7204e);
        } else {
            m4439l(canvas, f, 1.0d);
            m4438k(canvas, this.f7212m + f + this.f7215p, 1.0d);
        }
        float f2 = this.f7216q + f;
        for (int i = 0; i < this.f7201b - 2; i++) {
            float f3 = (this.f7216q * i) + f2;
            m4439l(canvas, f3, 1.0d);
            if (i < this.f7201b - 3) {
                m4438k(canvas, f3 + this.f7212m + this.f7215p, 1.0d);
            }
        }
        float f4 = f + this.f7210k;
        float f5 = this.f7216q;
        float f6 = (f4 - f5) + this.f7212m + this.f7215p;
        if (!this.f7200a.contains(Integer.valueOf(m4443d()))) {
            m4438k(canvas, f6, 1.0d);
            m4439l(canvas, f6 + this.f7213n + this.f7215p + this.f7212m, 1.0d);
            return;
        }
        m4438k(canvas, f6, this.f7204e);
        m4439l(canvas, f6 + this.f7213n + this.f7215p + this.f7212m, this.f7204e);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        this.f7202c = 0.0d;
        m4448i();
        this.f7204e = 0.0d;
        setBackgroundColor(0);
        this.f7208i.setColor(jzn.m13800C(this));
        this.f7208i.setStyle(Paint.Style.FILL);
        this.f7208i.setFlags(1);
        this.f7209j.setColor(getResources().getColor(C0100R.color.countdown_slider_secondary_color, null));
        this.f7209j.setStrokeCap(Paint.Cap.ROUND);
        this.f7209j.setStrokeWidth(this.f7214o);
        this.f7209j.setStyle(Paint.Style.FILL);
        this.f7209j.setFlags(1);
        setEnabled(true);
        super.onFinishInflate();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7207h.set(getWidth() / 2.0f, (getHeight() / 2.0f) - this.f7211l);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                hxf hxfVar = this.f7206g;
                if (hxfVar != null) {
                    Iterator it = hxfVar.f29792d.f29803a.iterator();
                    while (it.hasNext()) {
                        ((ckw) ((AmbientMode.AmbientController) it.next()).f1697a).m3872c();
                    }
                    hxfVar.f29789a = hxfVar.f29792d.f29806d.m4442c();
                    hxfVar.f29790b = hxfVar.f29792d.f29806d.m4447h();
                    hxfVar.f29791c = hxfVar.f29792d.f29806d.f7205f;
                }
                this.f7217r.set(motionEvent.getX(), motionEvent.getY());
                invalidate();
                return true;
            case 1:
            case 3:
                double dM4441b = m4441b(m4437j(this.f7205f));
                this.f7205f = dM4441b;
                hxf hxfVar2 = this.f7206g;
                if (hxfVar2 != null) {
                    Iterator it2 = hxfVar2.f29792d.f29803a.iterator();
                    while (it2.hasNext()) {
                        ((ckw) ((AmbientMode.AmbientController) it2.next()).f1697a).m3888s();
                    }
                    hxk hxkVar = hxfVar2.f29792d;
                    hxkVar.f29805c.m4354n(hxkVar.f29806d.m4440a(dM4441b));
                    if (hxfVar2.f29789a != dM4441b) {
                        hxfVar2.f29792d.m10830s(hxk.m10811u((int) dM4441b));
                    }
                    if (!hxfVar2.f29790b) {
                        hxfVar2.f29792d.m10819h();
                    }
                }
                setProgress((int) this.f7205f);
                invalidate();
                return true;
            case 2:
                float x = motionEvent.getX() - this.f7217r.x;
                double dM4443d = m4443d();
                double d = this.f7210k;
                double d2 = this.f7205f;
                double d3 = x;
                Double.isNaN(d3);
                Double.isNaN(dM4443d);
                Double.isNaN(d);
                double dM4437j = m4437j(d2 - ((d3 * dM4443d) / d));
                this.f7205f = dM4437j;
                hxf hxfVar3 = this.f7206g;
                if (hxfVar3 != null) {
                    hxfVar3.f29792d.f29805c.m4354n(m4440a(dM4437j));
                    boolean zM4447h = hxfVar3.f29792d.f29806d.m4447h();
                    CountdownSnapSlider countdownSnapSlider = hxfVar3.f29792d.f29806d;
                    double d4 = countdownSnapSlider.f7205f;
                    double d5 = hxfVar3.f29791c;
                    double dM4442c = countdownSnapSlider.m4442c();
                    if ((Math.min(d5, d4) < dM4442c && Math.max(d5, d4) > dM4442c) || (!hxfVar3.f29790b && zM4447h)) {
                        hxfVar3.f29792d.m10819h();
                    }
                    hxfVar3.f29791c = d4;
                    hxfVar3.f29790b = zM4447h;
                }
                invalidate();
                this.f7217r.set(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return false;
        }
    }

    public CountdownSnapSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7207h = new PointF();
        this.f7208i = new Paint();
        this.f7209j = new Paint();
        this.f7217r = new PointF();
        this.f7200a = new HashSet();
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.slider_primary_tick_radius);
        this.f7212m = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0100R.dimen.slider_line_length);
        this.f7213n = dimensionPixelSize2;
        this.f7214o = resources.getDimensionPixelSize(C0100R.dimen.slider_line_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0100R.dimen.slider_tick_line_gap);
        this.f7215p = dimensionPixelSize3;
        this.f7211l = resources.getDimensionPixelSize(C0100R.dimen.slider_y_offset_default);
        this.f7216q = dimensionPixelSize + dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize3 + dimensionPixelSize3;
        this.f7205f = 1.0d;
        setProgress(1);
    }
}
