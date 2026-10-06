package com.google.android.apps.camera.p014ui.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.cdp;
import p000.dhl;
import p000.dhm;
import p000.dhv;
import p000.ilk;
import p000.jvh;
import p000.kxk;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FrontLensIndicatorOverlay extends View {

    /* JADX INFO: renamed from: a */
    public static final nbh f7225a = nbh.m17259h("com/google/android/apps/camera/ui/views/FrontLensIndicatorOverlay");

    /* JADX INFO: renamed from: b */
    public ValueAnimator f7226b;

    /* JADX INFO: renamed from: c */
    public final dhl f7227c;

    /* JADX INFO: renamed from: d */
    public final Paint f7228d;

    /* JADX INFO: renamed from: e */
    public final Paint f7229e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f7230f;

    /* JADX INFO: renamed from: g */
    public final Interpolator f7231g;

    /* JADX INFO: renamed from: h */
    public final int f7232h;

    /* JADX INFO: renamed from: i */
    public int f7233i;

    /* JADX INFO: renamed from: j */
    public final int f7234j;

    /* JADX INFO: renamed from: k */
    public float f7235k;

    /* JADX INFO: renamed from: l */
    public float f7236l;

    /* JADX INFO: renamed from: m */
    public float f7237m;

    /* JADX INFO: renamed from: n */
    public float f7238n;

    /* JADX INFO: renamed from: o */
    public float f7239o;

    /* JADX INFO: renamed from: p */
    public ilk f7240p;

    /* JADX INFO: renamed from: q */
    public int f7241q;

    /* JADX INFO: renamed from: r */
    private final RectF f7242r;

    /* JADX WARN: Multi-variable type inference failed */
    public FrontLensIndicatorOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7226b = null;
        this.f7242r = new RectF();
        this.f7233i = 0;
        this.f7235k = 0.0f;
        this.f7236l = 0.0f;
        this.f7237m = 0.0f;
        this.f7238n = 1.0f;
        this.f7240p = ilk.PORTRAIT;
        this.f7241q = 1;
        dhv dhvVarMo3499a = ((cdp) context).mo3499a();
        int iIntValue = ((Integer) dhvVarMo3499a.mo6173a(dhm.f11136a).get()).intValue();
        this.f7232h = iIntValue;
        this.f7227c = dhm.m6166a(dhvVarMo3499a, iIntValue);
        this.f7230f = new LinearInterpolator();
        this.f7231g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.f7234j = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_front_lens_width);
        Paint paint = new Paint();
        this.f7228d = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(kxk.m15024q(this, C0100R.attr.colorOnSurface));
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.f7229e = paint2;
        paint2.setAlpha((int) (this.f7238n * 255.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m4450a() {
        Trace.beginSection("FrontLensIndicator:applyOrientation");
        jvh.m13577y(this, this.f7240p);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.f7235k;
        float f2 = this.f7236l;
        float f3 = this.f7237m;
        int i = this.f7241q;
        if (i == 4 || i == 3) {
            this.f7228d.setStrokeWidth(this.f7239o);
            this.f7229e.setStrokeWidth(this.f7239o);
            this.f7242r.set(f - f3, f2 - f3, f + f3, f2 + f3);
            canvas.drawArc(this.f7242r, -99.0f, this.f7233i, false, this.f7229e);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4450a();
        }
    }
}
