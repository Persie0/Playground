package com.google.android.clockwork.common.wearable.wearmaterial.slider;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.preference.WearInlineSliderPreference;
import p000.anu;
import p000.aon;
import p000.aoo;
import p000.ith;
import p000.iys;
import p000.iyv;
import p000.iyw;
import p000.jbx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearInlineSlider extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public float f7534a;

    /* JADX INFO: renamed from: b */
    public float f7535b;

    /* JADX INFO: renamed from: c */
    public float f7536c;

    /* JADX INFO: renamed from: d */
    public float f7537d;

    /* JADX INFO: renamed from: e */
    public WearInlineSliderPreference f7538e;

    /* JADX INFO: renamed from: f */
    private final ImageView f7539f;

    /* JADX INFO: renamed from: g */
    private final ImageView f7540g;

    /* JADX INFO: renamed from: h */
    private final ImageView f7541h;

    /* JADX INFO: renamed from: i */
    private final SliderProgressDrawable f7542i;

    /* JADX INFO: renamed from: j */
    private final iyv f7543j;

    /* JADX INFO: renamed from: k */
    private final ObjectAnimator f7544k;

    /* JADX INFO: renamed from: l */
    private final Runnable f7545l;

    /* JADX INFO: renamed from: m */
    private boolean f7546m;

    /* JADX INFO: renamed from: n */
    private boolean f7547n;

    public WearInlineSlider(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m4619l() {
        removeCallbacks(this.f7545l);
        post(this.f7545l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m4620m(float f, boolean z) {
        float fM12864i;
        aoo aooVar;
        aon aonVar;
        float f2 = this.f7537d;
        float f3 = this.f7534a;
        if (f3 > 0.0f) {
            int iRound = Math.round((f - this.f7535b) / f3);
            float f4 = this.f7535b;
            fM12864i = jbx.m12864i((iRound * this.f7534a) + f4, f4, this.f7536c);
            this.f7537d = fM12864i;
        } else {
            fM12864i = jbx.m12864i(f, this.f7535b, this.f7536c);
            this.f7537d = fM12864i;
        }
        boolean z2 = fM12864i != f2;
        WearInlineSliderPreference wearInlineSliderPreference = this.f7538e;
        if (wearInlineSliderPreference != null && z2 && wearInlineSliderPreference.f7514a != fM12864i) {
            if (wearInlineSliderPreference.m1505W(Float.valueOf(fM12864i))) {
                wearInlineSliderPreference.m4617k(fM12864i, false);
            } else {
                m4627g(wearInlineSliderPreference.f7514a);
            }
            anu anuVar = wearInlineSliderPreference.f1587o;
            if ((anuVar == null || !anuVar.mo1735a()) && (aooVar = wearInlineSliderPreference.f1583k) != null && (aonVar = aooVar.f1904c) != null) {
                aonVar.mo1754A(wearInlineSliderPreference);
            }
        }
        if (z || z2) {
            float fillAmount = this.f7542i.getFillAmount();
            float f5 = this.f7547n ? this.f7535b - this.f7534a : this.f7535b;
            float f6 = this.f7537d - f5;
            float f7 = this.f7536c - f5;
            float f8 = f7 != 0.0f ? f6 / f7 : 0.0f;
            if (fillAmount != f8) {
                if (isLaidOut()) {
                    this.f7544k.cancel();
                    this.f7544k.setFloatValues(this.f7542i.getFillAmount(), f8);
                    this.f7544k.start();
                } else {
                    this.f7542i.setFillAmount(f8);
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public final void m4621a(CharSequence charSequence) {
        this.f7540g.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m4622b(CharSequence charSequence) {
        this.f7539f.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public final void m4623c(CharSequence charSequence) {
        this.f7541h.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final void m4624d(boolean z) {
        if (this.f7546m != z) {
            this.f7546m = z;
            m4619l();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4625e(boolean z) {
        if (this.f7547n != z) {
            this.f7547n = z;
            m4619l();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4626f(float f) {
        if (this.f7534a != f) {
            this.f7534a = f;
            m4619l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4627g(float f) {
        if (this.f7537d != f) {
            m4620m(f, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4628h(float f) {
        if (this.f7535b != f) {
            this.f7535b = f;
            m4619l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4629i(float f) {
        if (this.f7536c != f) {
            this.f7536c = f;
            m4619l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4630j() {
        float fMax = Math.max(this.f7535b, this.f7536c);
        this.f7536c = fMax;
        float f = this.f7534a;
        if (f <= 0.0f || (fMax - this.f7535b) % f > 0.0f) {
            f = fMax - this.f7535b;
            this.f7534a = f;
        }
        int i = 0;
        if (this.f7546m) {
            float f2 = fMax - this.f7535b;
            float f3 = f2 / f;
            if (f3 <= 8.0f && f2 % f == 0.0f) {
                i = (int) f3;
                if (this.f7547n) {
                    i++;
                }
            }
        }
        m4620m(this.f7537d, true);
        SliderProgressDrawable sliderProgressDrawable = this.f7542i;
        sliderProgressDrawable.f7531d = i;
        sliderProgressDrawable.invalidateSelf();
        this.f7543j.m11910a();
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.inlineSliderStyle);
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C0100R.style.Widget_InlineSlider_Default);
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        SliderProgressDrawable sliderProgressDrawable = new SliderProgressDrawable();
        this.f7542i = sliderProgressDrawable;
        this.f7545l = new ith(this, 9);
        setOrientation(0);
        setClipToOutline(true);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(C0100R.layout.wear_inline_slider, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(C0100R.id.inline_slider_increment);
        this.f7539f = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0100R.id.inline_slider_decrement);
        this.f7540g = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0100R.id.inline_slider_progress);
        this.f7541h = imageView3;
        imageView3.setOutlineProvider(new iyw(context2.getResources().getDimensionPixelSize(C0100R.dimen.inline_slider_progress_corner_radius)));
        imageView3.setClipToOutline(true);
        imageView3.setImageDrawable(sliderProgressDrawable);
        iyv iyvVar = new iyv(imageView, imageView2);
        this.f7543j = iyvVar;
        iyvVar.f32690e = new AmbientMode.AmbientController(this);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context2, C0100R.animator.wear_slider_value_transition);
        this.f7544k = objectAnimator;
        objectAnimator.setTarget(sliderProgressDrawable);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iys.f32682a, i, i2);
        iyvVar.f32686a = typedArrayObtainStyledAttributes.getBoolean(5, false);
        iyvVar.m11910a();
        m4628h(typedArrayObtainStyledAttributes.getFloat(2, 0.0f));
        m4629i(typedArrayObtainStyledAttributes.getFloat(3, 1.0f));
        m4626f(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        m4627g(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        sliderProgressDrawable.f7528a.setColor(typedArrayObtainStyledAttributes.getColor(9, 0));
        sliderProgressDrawable.f7529b.setColor(typedArrayObtainStyledAttributes.getColor(13, 0));
        m4624d(typedArrayObtainStyledAttributes.getBoolean(14, false));
        m4625e(typedArrayObtainStyledAttributes.getBoolean(15, false));
        imageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(11));
        imageView2.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(8));
        sliderProgressDrawable.f7530c.setColor(typedArrayObtainStyledAttributes.getColor(6, 0));
        m4621a(typedArrayObtainStyledAttributes.getString(7));
        m4622b(typedArrayObtainStyledAttributes.getString(10));
        m4623c(typedArrayObtainStyledAttributes.getString(12));
        typedArrayObtainStyledAttributes.recycle();
        m4630j();
    }
}
