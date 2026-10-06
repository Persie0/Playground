package com.google.android.apps.camera.p014ui.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.afq;
import p000.akf;
import p000.idi;
import p000.ija;
import p000.ijb;
import p000.ijc;
import p000.ilk;
import p000.jvh;
import p000.nbe;
import p000.nbh;
import p021j$.time.Duration;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ToggleUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public static final Duration f7276a = Duration.ofMillis(200);

    /* JADX INFO: renamed from: h */
    private static final nbh f7277h = nbh.m17259h("com/google/android/apps/camera/ui/views/ToggleUi");

    /* JADX INFO: renamed from: b */
    public ilk f7278b;

    /* JADX INFO: renamed from: c */
    public ToggleButton f7279c;

    /* JADX INFO: renamed from: d */
    public TextView f7280d;

    /* JADX INFO: renamed from: e */
    public ImageView f7281e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f7282f;

    /* JADX INFO: renamed from: g */
    public float f7283g;

    /* JADX INFO: renamed from: i */
    private FrameLayout f7284i;

    /* JADX INFO: compiled from: PG */
    public class ToggleButton extends ImageButton {

        /* JADX INFO: renamed from: b */
        private static final nbh f7285b = nbh.m17259h("com/google/android/apps/camera/ui/views/ToggleUi$ToggleButton");

        /* JADX INFO: renamed from: a */
        public boolean f7286a;

        public ToggleButton(Context context) {
            super(context);
        }

        @Override // android.view.View
        public final void setScaleX(float f) {
            if (this.f7286a) {
                super.setScaleX(f);
            } else {
                ((nbe) ((nbe) f7285b.m17252c()).mo17276G((char) 4281)).mo17293r("setScaleX ignored %s", Float.valueOf(f));
            }
        }

        @Override // android.view.View
        public final void setScaleY(float f) {
            if (this.f7286a) {
                super.setScaleY(f);
            } else {
                ((nbe) ((nbe) f7285b.m17252c()).mo17276G((char) 4282)).mo17293r("setScaleY ignored %s", Float.valueOf(f));
            }
        }

        public ToggleButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public ToggleButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    public ToggleUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7278b = ilk.PORTRAIT;
        this.f7283g = 1.0f;
    }

    /* JADX INFO: renamed from: h */
    private static void m4479h(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.setInterpolator(new akf());
    }

    /* JADX INFO: renamed from: a */
    public final void m4480a(ilk ilkVar) {
        this.f7278b = ilkVar;
        Collection$EL.forEach(jvh.m13570r(this.f7284i), new idi(ilkVar, 4));
    }

    /* JADX INFO: renamed from: b */
    public final void m4481b() {
        AnimatorSet animatorSet = this.f7282f;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f7282f.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m4482c() {
        this.f7280d.setVisibility(8);
        this.f7279c.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4483d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f7283g);
        m4479h(valueAnimatorOfFloat, new ija(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        m4479h(valueAnimatorOfFloat2, new ija(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7282f = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f7282f.setDuration(f7276a.toMillis());
        this.f7282f.addListener(new ijc(this));
    }

    /* JADX INFO: renamed from: e */
    public final void m4484e(int i) {
        this.f7281e.setImageResource(i);
    }

    /* JADX INFO: renamed from: f */
    public final void m4485f(Drawable drawable) {
        if (drawable != null) {
            this.f7279c.setImageDrawable(drawable);
        } else {
            ((nbe) ((nbe) f7277h.m17251b()).mo17276G((char) 4285)).mo17290o("Invalid button image resource.");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4486g(int i) {
        this.f7284i.setContentDescription(getResources().getString(i));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ToggleUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.toggle_view_contents, this);
        Trace.endSection();
        this.f7284i = (FrameLayout) findViewById(C0100R.id.toggle_container);
        this.f7279c = (ToggleButton) findViewById(C0100R.id.toggle_button);
        this.f7281e = (ImageView) findViewById(C0100R.id.toggle_background);
        this.f7280d = (TextView) findViewById(C0100R.id.toggle_text);
        afq.m547g(this.f7284i, new ijb());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4480a(this.f7278b);
        }
    }
}
