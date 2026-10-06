package com.google.android.apps.camera.filmstrip.transition;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import p000.afx;
import p000.dwa;
import p000.dwd;
import p000.dwe;
import p000.dwf;
import p000.dwg;
import p000.ill;
import p000.jvh;
import p000.kpa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FilmstripTransitionLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator f6662a;

    /* JADX INFO: renamed from: b */
    public final ValueAnimator f6663b;

    /* JADX INFO: renamed from: c */
    public boolean f6664c;

    /* JADX INFO: renamed from: d */
    public boolean f6665d;

    /* JADX INFO: renamed from: e */
    public FilmstripTransitionThumbnailView f6666e;

    /* JADX INFO: renamed from: f */
    public RoundedThumbnailView f6667f;

    /* JADX INFO: renamed from: g */
    public boolean f6668g;

    /* JADX INFO: renamed from: h */
    public dwf f6669h;

    /* JADX INFO: renamed from: i */
    public dwa f6670i;

    /* JADX INFO: renamed from: j */
    private final kpa f6671j;

    public FilmstripTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6664c = false;
        this.f6665d = false;
        this.f6670i = null;
        this.f6671j = kpa.m14659a();
        this.f6668g = true;
        setVisibility(4);
        m4122b(0.0f);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f6662a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new afx(this, 5));
        valueAnimatorOfFloat.addListener(new dwd(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6663b = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat2.addUpdateListener(new afx(this, 6));
        valueAnimatorOfFloat2.addListener(new dwe(this));
    }

    /* JADX INFO: renamed from: a */
    public final dwg m4121a() {
        int iMax;
        this.f6667f.getClass();
        SizeF sizeF = new SizeF(this.f6666e.m4124a().getWidth(), this.f6666e.m4124a().getHeight());
        float thumbnailFinalDiameter = this.f6667f.getThumbnailFinalDiameter();
        Point pointM13568p = jvh.m13568p(this.f6667f);
        float rippleRingMaxDiameterDp = this.f6667f.getRippleRingMaxDiameterDp();
        RectF rectF = new RectF(pointM13568p.x, pointM13568p.y, pointM13568p.x + rippleRingMaxDiameterDp, pointM13568p.y + rippleRingMaxDiameterDp);
        View rootView = getRootView();
        int[] iArrM11435f = ill.m11435f(rootView);
        int iMax2 = 0;
        int i = iArrM11435f[0];
        RectF rectF2 = new RectF(i, iArrM11435f[1], i + rootView.getWidth(), iArrM11435f[1] + rootView.getHeight());
        Context context = getContext();
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(point);
        RectF rectF3 = new RectF(0.0f, 0.0f, point.x, point.y);
        boolean z = this.f6671j.f36759b;
        if (ill.m11433d(this)) {
            int[] iArrM11435f2 = ill.m11435f(getRootView());
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (getResources().getConfiguration().orientation == 1) {
                iMax = Math.max(iArrM11435f2[1] + rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetBottom());
            } else {
                iMax2 = Math.max(iArrM11435f2[0] + rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetRight());
                iMax = 0;
            }
            Point point2 = new Point(iMax2, iMax);
            rectF3.inset(point2.x, point2.y);
        }
        return new dwg(sizeF, rectF2, rectF3, rectF, thumbnailFinalDiameter);
    }

    /* JADX INFO: renamed from: b */
    public final void m4122b(float f) {
        setBackgroundColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
    }

    /* JADX INFO: renamed from: c */
    public final void m4123c(float f) {
        dwf dwfVar = this.f6669h;
        dwfVar.getClass();
        float fM6806b = dwfVar.m6806b(f);
        this.f6666e.setScaleX(fM6806b);
        this.f6666e.setScaleY(fM6806b);
        PointF pointFM6807c = this.f6669h.m6807c(f);
        this.f6666e.setTranslationX(pointFM6807c.x);
        this.f6666e.setTranslationY(pointFM6807c.y);
        this.f6666e.m4125b(this.f6669h.m6805a(f));
        m4122b(dwf.m6804d(f));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6666e = (FilmstripTransitionThumbnailView) findViewById(C0100R.id.transition_thumbnail_view);
    }
}
