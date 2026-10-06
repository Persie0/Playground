package com.google.android.apps.camera.p014ui.zoomlock;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.akf;
import p000.ija;
import p000.iko;
import p000.ikp;
import p000.ikq;
import p000.ikr;
import p000.iks;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ZoomLockView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f7303a;

    /* JADX INFO: renamed from: b */
    public ImageView f7304b;

    /* JADX INFO: renamed from: c */
    public ImageView f7305c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f7306d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f7307e;

    /* JADX INFO: renamed from: f */
    public ImageView f7308f;

    /* JADX INFO: renamed from: g */
    public boolean f7309g;

    /* JADX INFO: renamed from: h */
    public final ilk f7310h;

    /* JADX INFO: renamed from: i */
    public AmbientModeSupport.AmbientController f7311i;

    /* JADX INFO: renamed from: j */
    private AnimatorSet f7312j;

    public ZoomLockView(Context context) {
        super(context);
        this.f7310h = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: b */
    private static ObjectAnimator m4506b(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    private final ObjectAnimator m4507c(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", getResources().getDimension(C0100R.dimen.zoom_lock_translation));
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public final void m4508a() {
        if (this.f7309g) {
            return;
        }
        this.f7312j.start();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ZoomLockView:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.zoom_lock_layout, (ViewGroup) this, true);
        this.f7303a = (ImageView) findViewById(C0100R.id.zoom_lock_icon);
        this.f7304b = (ImageView) findViewById(C0100R.id.lock_click_button);
        this.f7305c = (ImageView) findViewById(C0100R.id.lock_click_ring);
        this.f7308f = (ImageView) findViewById(C0100R.id.zoom_lock_bg);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7304b, "scaleX", 1.5f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f7304b, "scaleY", 1.5f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat2.setInterpolator(new akf());
        objectAnimatorOfFloat.addListener(new iko(this));
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getResources().getColor(C0100R.color.zoom_lock_button_start_color, null)), Integer.valueOf(getResources().getColor(C0100R.color.zoom_lock_button_end_color, null)));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new ija(this, 2));
        valueAnimatorOfObject.addListener(new ikp(this));
        valueAnimatorOfObject.setStartDelay(50L);
        ObjectAnimator objectAnimatorM4507c = m4507c(this.f7308f);
        ObjectAnimator objectAnimatorM4507c2 = m4507c(this.f7303a);
        ObjectAnimator objectAnimatorM4506b = m4506b(this.f7308f);
        ObjectAnimator objectAnimatorM4506b2 = m4506b(this.f7303a);
        objectAnimatorM4506b.addListener(new ikq(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7306d = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f7306d.play(valueAnimatorOfObject).after(objectAnimatorOfFloat);
        this.f7306d.play(objectAnimatorM4507c).with(valueAnimatorOfObject);
        this.f7306d.play(objectAnimatorM4506b).with(valueAnimatorOfObject);
        this.f7306d.play(objectAnimatorM4507c2).with(valueAnimatorOfObject);
        this.f7306d.play(objectAnimatorM4506b2).with(valueAnimatorOfObject);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f7307e = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setDuration(200L);
        this.f7307e.setInterpolator(new akf());
        this.f7307e.addListener(new ikr(this));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f7304b, "scaleX", 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f7304b, "scaleY", 1.0f);
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat4.setInterpolator(new akf());
        objectAnimatorOfFloat5.setInterpolator(new akf());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7312j = animatorSet2;
        animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.f7312j.addListener(new iks(this));
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("ZoomLockView:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Trace.beginSection("ZoomLockView:applyOrientation");
            ImageView imageView = this.f7303a;
            if (imageView != null) {
                jvh.m13578z(imageView, this.f7310h);
            }
            Trace.endSection();
        }
        Trace.endSection();
    }

    public ZoomLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7310h = ilk.PORTRAIT;
    }
}
