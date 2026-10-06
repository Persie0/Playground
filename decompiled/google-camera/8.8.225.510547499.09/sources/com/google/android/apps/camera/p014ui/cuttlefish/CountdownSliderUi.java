package com.google.android.apps.camera.p014ui.cuttlefish;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.CountdownSnapSlider;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p000.afx;
import p000.hxl;
import p000.hxm;
import p000.hzj;
import p000.ilk;
import p000.jpd;
import p000.jvh;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CountdownSliderUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CountdownSnapSlider f7001a;

    /* JADX INFO: renamed from: b */
    public ilk f7002b;

    /* JADX INFO: renamed from: c */
    ValueAnimator f7003c;

    /* JADX INFO: renamed from: d */
    ValueAnimator f7004d;

    /* JADX INFO: renamed from: e */
    AnimatorSet f7005e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f7006f;

    /* JADX INFO: renamed from: g */
    float f7007g;

    /* JADX INFO: renamed from: h */
    public float f7008h;

    /* JADX INFO: renamed from: i */
    public final Set f7009i;

    /* JADX INFO: renamed from: j */
    private hzj f7010j;

    /* JADX INFO: renamed from: k */
    private PointF f7011k;

    /* JADX INFO: renamed from: l */
    private Optional f7012l;

    /* JADX INFO: renamed from: m */
    private boolean f7013m;

    public CountdownSliderUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7010j = hzj.PHONE_LAYOUT;
        this.f7002b = ilk.PORTRAIT;
        this.f7012l = Optional.empty();
        this.f7013m = true;
        this.f7009i = new HashSet();
    }

    /* JADX INFO: renamed from: A */
    private static final ValueAnimator m4332A(View view, boolean z) {
        return m4338x(view, z, 0L, 200L);
    }

    /* JADX INFO: renamed from: r */
    public static final void m4333r(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: t */
    private final void m4334t(TextView textView, TextView textView2) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0100R.dimen.label_top_padding);
        textView.setPadding(textView.getPaddingLeft(), dimensionPixelOffset, textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.setPadding(textView2.getPaddingLeft(), dimensionPixelOffset, textView2.getPaddingRight(), textView2.getPaddingBottom());
    }

    /* JADX INFO: renamed from: u */
    private final void m4335u(View view, double d, float f) {
        double d2 = this.f7008h;
        Double.isNaN(d2);
        view.setTranslationX((float) (d2 - d));
        if (this.f7009i.contains(view)) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: v */
    private final boolean m4336v() {
        return m4337w() && !Locale.getDefault().getLanguage().equals("en");
    }

    /* JADX INFO: renamed from: w */
    private final boolean m4337w() {
        return jpd.m13431l(this.f7010j) && !ilk.m11427e(this.f7002b);
    }

    /* JADX INFO: renamed from: x */
    private static final ValueAnimator m4338x(View view, boolean z, long j, long j2) {
        float[] fArr = new float[2];
        fArr[0] = view.getAlpha();
        fArr[1] = true != z ? 0.0f : 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.addUpdateListener(new afx(view, 17));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m4339y(float f, float f2, View view) {
        return f >= view.getX() && f <= view.getX() + ((float) view.getWidth()) && f2 >= view.getY() && f2 <= view.getY() + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: z */
    private static final void m4340z(TextView textView, int i, int i2, Optional optional, int i3) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = i;
        layoutParams.height = i2;
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundResource(i3);
        if (optional.isPresent()) {
            textView.setText(((Integer) optional.get()).intValue());
        } else {
            textView.setText("");
        }
    }

    /* JADX INFO: renamed from: a */
    public final ImageView m4341a() {
        return (ImageView) findViewById(C0100R.id.slider_background_full);
    }

    /* JADX INFO: renamed from: b */
    public final ImageView m4342b() {
        return (ImageView) findViewById(C0100R.id.slider_background_short);
    }

    /* JADX INFO: renamed from: c */
    public final TextView m4343c() {
        return (TextView) findViewById(C0100R.id.auto_touch_area);
    }

    /* JADX INFO: renamed from: d */
    final TextView m4344d() {
        return (TextView) findViewById(C0100R.id.center_tick_text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f7011k = new PointF(x, y);
            if (m4339y(x, y, m4343c())) {
                this.f7001a.onTouchEvent(motionEvent);
                this.f7012l = Optional.m12505of(m4343c());
                return true;
            }
            if (m4339y(x, y, m4346f())) {
                this.f7001a.onTouchEvent(motionEvent);
                this.f7012l = Optional.m12505of(m4346f());
                return true;
            }
            if (m4339y(x, y, m4345e())) {
                this.f7001a.onTouchEvent(motionEvent);
                this.f7012l = Optional.m12505of(m4345e());
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.f7012l.isPresent()) {
                double d = x;
                double d2 = this.f7011k.x;
                double d3 = y;
                double d4 = this.f7011k.y;
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d4);
                if (Math.hypot(d - d2, d3 - d4) < 1.0d) {
                    ((View) this.f7012l.get()).callOnClick();
                } else {
                    this.f7001a.onTouchEvent(motionEvent);
                }
                this.f7012l = Optional.empty();
                return true;
            }
        } else if (actionMasked == 2 && this.f7012l.isPresent()) {
            this.f7001a.onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final TextView m4345e() {
        return (TextView) findViewById(C0100R.id.max_value_label);
    }

    /* JADX INFO: renamed from: f */
    public final TextView m4346f() {
        return (TextView) findViewById(C0100R.id.min_value_label);
    }

    /* JADX INFO: renamed from: g */
    public final CountdownSnapSlider m4347g() {
        return (CountdownSnapSlider) findViewById(C0100R.id.countdown_slider_view);
    }

    /* JADX INFO: renamed from: h */
    public final void m4348h(boolean z) {
        if (z) {
            if (getVisibility() == 0 && getAlpha() == 1.0f) {
                return;
            }
        } else if (getVisibility() == 4) {
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = z ? this.f7007g : 0.0f;
        fArr[1] = z ? 0.0f : this.f7007g;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.addUpdateListener(new afx(this, 18));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_extra_slow_in));
        valueAnimatorOfFloat.setDuration(500L);
        ValueAnimator valueAnimatorM4338x = m4338x(this, z, true != z ? 0L : 100L, true != z ? 83L : 167L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM4338x);
        animatorSet.addListener(new hxm(this, z));
        animatorSet.start();
        this.f7006f = animatorSet;
    }

    /* JADX INFO: renamed from: i */
    public final void m4349i(hzj hzjVar, ilk ilkVar) {
        this.f7002b = ilkVar;
        this.f7010j = hzjVar;
        m4356p();
        jvh.m13578z(m4344d(), ilkVar);
        m4350j();
    }

    /* JADX INFO: renamed from: j */
    public final void m4350j() {
        if (getVisibility() == 0) {
            setTranslationX(0.0f);
        } else {
            setTranslationX(this.f7007g);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4351k(String str) {
        if (((String) m4344d().getText()).equals(str)) {
            return;
        }
        m4344d().setText(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m4352l(boolean z, boolean z2) {
        TextView textViewM4346f = m4346f();
        TextView textViewM4345e = m4345e();
        if (!this.f7009i.contains(textViewM4346f)) {
            if (z2) {
                ValueAnimator valueAnimator = this.f7003c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorM4332A = m4332A(textViewM4346f, z);
                this.f7003c = valueAnimatorM4332A;
                valueAnimatorM4332A.start();
            } else {
                textViewM4346f.setAlpha(true != z ? 0.0f : 1.0f);
            }
        }
        if (this.f7009i.contains(textViewM4345e)) {
            return;
        }
        if (!z2) {
            textViewM4345e.setAlpha(true == z ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimator2 = this.f7004d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorM4332A2 = m4332A(textViewM4345e, z);
        this.f7004d = valueAnimatorM4332A2;
        valueAnimatorM4332A2.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m4353m(double d) {
        m4335u(m4341a(), d, m4341a().getAlpha());
        m4335u(m4342b(), d, m4342b().getAlpha());
    }

    /* JADX INFO: renamed from: n */
    public final void m4354n(double d) {
        m4335u(m4346f(), d, m4346f().getAlpha());
        m4335u(m4345e(), d, m4345e().getAlpha());
        m4335u(m4343c(), d, m4343c().getAlpha());
        m4353m(d);
    }

    /* JADX INFO: renamed from: o */
    public final void m4355o(double d, float f) {
        m4335u(m4346f(), d, f);
        m4335u(m4345e(), d, f);
        m4335u(m4343c(), d, f);
        m4353m(d);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.countdown_slider_layout, this);
        this.f7001a = m4347g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4349i(this.f7010j, this.f7002b);
        }
        if (this.f7013m) {
            this.f7013m = false;
            this.f7007g = getWidth() / 2.0f;
            CountdownSnapSlider countdownSnapSlider = this.f7001a;
            this.f7008h = (float) countdownSnapSlider.m4440a(Math.floor(countdownSnapSlider.m4443d() / 2.0f));
            m4356p();
            CountdownSnapSlider countdownSnapSlider2 = this.f7001a;
            m4354n(countdownSnapSlider2.m4440a(countdownSnapSlider2.m4442c()));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m4356p() {
        TextView textViewM4346f = m4346f();
        TextView textViewM4345e = m4345e();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0100R.dimen.label_dim);
        if (m4336v()) {
            m4340z(textViewM4346f, dimensionPixelOffset, dimensionPixelOffset, Optional.empty(), C0100R.drawable.ns_off_icon_padded);
            m4340z(textViewM4345e, dimensionPixelOffset, dimensionPixelOffset, Optional.empty(), C0100R.drawable.ns_max_icon_padded);
        } else {
            m4340z(textViewM4346f, -2, dimensionPixelOffset, Optional.m12505of(Integer.valueOf(C0100R.string.min_value_label)), 0);
            m4340z(textViewM4345e, -2, dimensionPixelOffset, Optional.m12505of(Integer.valueOf(C0100R.string.max_value_label)), 0);
        }
        float width = getWidth();
        Resources resources = getResources();
        float f = width / 2.0f;
        if (!m4337w()) {
            this.f7001a.m4445f(resources.getDimensionPixelOffset(C0100R.dimen.slider_y_offset_default));
            textViewM4346f.setRotation(0.0f);
            textViewM4345e.setRotation(0.0f);
            m4333r(textViewM4346f, (int) ((f - this.f7008h) - (textViewM4346f.getWidth() / 2.0f)));
            m4333r(textViewM4345e, (int) ((f + this.f7008h) - (textViewM4345e.getWidth() / 2.0f)));
            m4334t(textViewM4346f, textViewM4345e);
            return;
        }
        this.f7001a.m4445f(resources.getDimensionPixelOffset(C0100R.dimen.slider_y_offset_vertical));
        float f2 = this.f7002b.m11428c().f31449e;
        textViewM4346f.setRotation(f2);
        textViewM4345e.setRotation(f2);
        if (m4336v()) {
            m4333r(textViewM4346f, (int) ((f - this.f7008h) - textViewM4346f.getHeight()));
            m4333r(textViewM4345e, (int) (f + this.f7008h));
            return;
        }
        m4333r(textViewM4346f, (int) (((f - this.f7008h) - textViewM4346f.getHeight()) - resources.getDimensionPixelOffset(C0100R.dimen.label_vertical_offset_min)));
        m4333r(textViewM4345e, (int) ((f + this.f7008h) - resources.getDimensionPixelOffset(C0100R.dimen.label_vertical_offset_max)));
        m4334t(textViewM4346f, textViewM4345e);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4357q() {
        return !this.f7009i.isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public final void m4358s(boolean z, long j) {
        if ((m4342b().getVisibility() == 0 || m4341a().getVisibility() == 0) && m4357q()) {
            AnimatorSet animatorSet = this.f7005e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ImageView imageViewM4341a = m4341a();
            ImageView imageViewM4342b = m4342b();
            ValueAnimator valueAnimatorM4338x = m4338x(imageViewM4342b, !z, 0L, 200L);
            ValueAnimator valueAnimatorM4338x2 = m4338x(imageViewM4341a, z, 0L, 200L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimatorM4338x, valueAnimatorM4338x2);
            animatorSet2.setStartDelay(j);
            animatorSet2.addListener(new hxl(z, imageViewM4341a, imageViewM4342b));
            animatorSet2.start();
            this.f7005e = animatorSet2;
        }
    }
}
