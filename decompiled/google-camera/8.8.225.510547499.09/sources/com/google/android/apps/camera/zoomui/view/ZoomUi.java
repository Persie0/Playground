package com.google.android.apps.camera.zoomui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p000.acn;
import p000.akf;
import p000.cdp;
import p000.cgm;
import p000.hah;
import p000.hze;
import p000.hzj;
import p000.idi;
import p000.ija;
import p000.ilk;
import p000.ill;
import p000.iuk;
import p000.iul;
import p000.iuu;
import p000.iws;
import p000.jzn;
import p000.kxk;
import p000.mxk;
import p000.nbh;
import p000.nbz;
import p000.nch;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ZoomUi extends FrameLayout implements hze {

    /* JADX INFO: renamed from: a */
    public static final Object f7405a = new Object();

    /* JADX INFO: renamed from: b */
    public static final nbh f7406b = nbh.m17259h("com/google/android/apps/camera/zoomui/view/ZoomUi");

    /* JADX INFO: renamed from: c */
    public final List f7407c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f7408d;

    /* JADX INFO: renamed from: e */
    public ilk f7409e;

    /* JADX INFO: renamed from: f */
    public boolean f7410f;

    /* JADX INFO: renamed from: g */
    public float f7411g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f7412h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f7413i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f7414j;

    /* JADX INFO: renamed from: k */
    public hah f7415k;

    /* JADX INFO: renamed from: l */
    public int f7416l;

    /* JADX INFO: renamed from: m */
    private final boolean f7417m;

    /* JADX INFO: renamed from: n */
    private final ValueAnimator.AnimatorUpdateListener f7418n;

    /* JADX INFO: renamed from: o */
    private hzj f7419o;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7407c = new ArrayList();
        iws iwsVar = new iws(this, 1);
        this.f7418n = iwsVar;
        this.f7409e = ilk.PORTRAIT;
        this.f7416l = 1;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f7408d = valueAnimator;
        valueAnimator.addUpdateListener(iwsVar);
        valueAnimator.setInterpolator(new akf());
        valueAnimator.setDuration(200L);
        this.f7417m = context instanceof cdp ? jzn.m13833u(((cdp) context).mo3499a()) : false;
    }

    /* JADX INFO: renamed from: H */
    private final void m4545H() {
        Collection$EL.forEach(mxk.m17141M(m4557e(), m4558f(), m4572t(), m4568p(), m4570r(), m4569q(), m4571s(), m4566n()), new idi(this, 6));
        if (this.f7417m) {
            Collection$EL.forEach(mxk.m17137I(m4573u(), m4567o()), new idi(this, 7));
        }
    }

    /* JADX INFO: renamed from: b */
    public static ObjectAnimator m4546b(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: A */
    public final void m4547A(int i, boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m4560h().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m4561i().getLayoutParams();
        if (layoutParams.leftMargin == m4554a(i)) {
            return;
        }
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams.leftMargin = m4554a(i);
        m4561i().setLayoutParams(layoutParams2);
        m4560h().setLayoutParams(layoutParams);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C0100R.dimen.zoom_toggle_button_size_factor, typedValue, true);
        float f = typedValue.getFloat();
        if (z) {
            m4560h().setAlpha(0.0f);
            m4560h().setScaleY(f);
            m4560h().setScaleX(f);
            m4561i().setAlpha(1.0f);
            m4561i().setVisibility(0);
            m4561i().animate().alpha(0.5f).scaleX(f).scaleY(f).setDuration(100L).setListener(new iuu(this)).start();
            m4560h().animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(100L).start();
        } else if (m4560h().getAlpha() == 1.0f) {
            m4560h().setAlpha(0.0f);
            m4560h().setScaleX(0.0f);
            m4560h().setScaleY(0.0f);
            m4561i().setVisibility(4);
            m4560h().animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        }
        m4563k().setProgress(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m4548B(int i) {
        this.f7408d.setIntValues(((FrameLayout.LayoutParams) m4560h().getLayoutParams()).leftMargin, m4554a(i));
        if (this.f7408d.isRunning()) {
            this.f7408d.end();
        }
        this.f7408d.start();
        m4563k().setProgress(i);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m4549C(boolean z, Animator.AnimatorListener animatorListener) {
        if (!this.f7410f) {
            return false;
        }
        this.f7412h.cancel();
        if (!z) {
            this.f7412h.reverse();
            this.f7412h.end();
            this.f7410f = false;
            return false;
        }
        this.f7410f = false;
        if (animatorListener != null) {
            this.f7412h.addListener(animatorListener);
        }
        this.f7412h.reverse();
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4550D() {
        boolean z;
        synchronized (f7405a) {
            int i = this.f7416l;
            z = true;
            if (i != 2 && i != 3 && i != 4) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public final int m4551E(int i) {
        iuk iukVar = iuk.ULTRA_WIDE;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 2:
                return getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_width);
            case 3:
                return getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_four_btn_width);
            default:
                return getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_two_btn_width);
        }
    }

    /* JADX INFO: renamed from: F */
    public final AnimatorSet m4552F(int i, boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_height);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_height);
        float dimensionPixelSize4 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_width) * this.f7411g;
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_height) - dimensionPixelSize3;
        int dimensionPixelSize6 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_background_padding_top);
        iuk iukVar = iuk.ULTRA_WIDE;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 2:
                dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_width);
                break;
            case 3:
                dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_four_btn_width);
                break;
            default:
                dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_two_btn_width);
                break;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(dimensionPixelSize, (int) dimensionPixelSize4);
        valueAnimatorOfInt.addUpdateListener(new ija(this, 17));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(dimensionPixelSize2, dimensionPixelSize3);
        valueAnimatorOfInt2.addUpdateListener(new ija(this, 18));
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(dimensionPixelSize6, (((dimensionPixelSize5 / 2) + 1) / 2) + dimensionPixelSize6);
        valueAnimatorOfInt3.addUpdateListener(new ija(this, 19));
        AnimatorSet animatorSet = new AnimatorSet();
        valueAnimatorOfInt2.setDuration(150L);
        valueAnimatorOfInt3.setDuration(150L);
        valueAnimatorOfInt.setDuration(200L);
        animatorSet.setInterpolator(new akf());
        if (z) {
            animatorSet.play(valueAnimatorOfInt2).after(valueAnimatorOfInt);
            animatorSet.play(valueAnimatorOfInt3).with(valueAnimatorOfInt2);
        } else {
            animatorSet.play(valueAnimatorOfInt2).with(valueAnimatorOfInt3);
            animatorSet.play(valueAnimatorOfInt).after(valueAnimatorOfInt2);
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: G */
    public final void m4553G(boolean z, int i) {
        if (!z) {
            m4570r().setVisibility(8);
            m4569q().setVisibility(8);
            m4565m().setVisibility(8);
            m4564l().setVisibility(8);
        } else if (i == 4) {
            m4570r().setVisibility(0);
            m4565m().setVisibility(0);
            m4569q().setVisibility(0);
            m4564l().setVisibility(0);
        } else if (i == 3) {
            m4570r().setVisibility(0);
            m4565m().setVisibility(0);
        }
        m4571s().setTextAlignment(4);
        m4568p().setTextAlignment(4);
    }

    /* JADX INFO: renamed from: a */
    public final int m4554a(int i) {
        int i2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_unselected_button_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_button_space);
        synchronized (f7405a) {
            int i3 = this.f7416l;
            i2 = 0;
            switch (i) {
                case 0:
                    if (i3 != 2) {
                        i2 = i3 != 3 ? ((-(dimensionPixelSize + dimensionPixelSize2)) * 3) / 2 : -(dimensionPixelSize + dimensionPixelSize2);
                    } else {
                        i2 = (-(dimensionPixelSize + dimensionPixelSize2)) / 2;
                    }
                    break;
                case 1:
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i2 = (-(dimensionPixelSize + dimensionPixelSize2)) / 2;
                        }
                    }
                    break;
                case 2:
                    i2 = i3 != 3 ? (dimensionPixelSize + dimensionPixelSize2) / 2 : dimensionPixelSize + dimensionPixelSize2;
                    break;
                case 3:
                    i2 = ((dimensionPixelSize + dimensionPixelSize2) * 3) / 2;
                    break;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final ViewGroup m4555c() {
        return (ViewGroup) findViewById(C0100R.id.zoom_toggle_ui);
    }

    /* JADX INFO: renamed from: d */
    public final ViewGroup m4556d() {
        return (ViewGroup) findViewById(C0100R.id.zoom_ui_seekbar);
    }

    /* JADX INFO: renamed from: e */
    public final ImageButton m4557e() {
        return (ImageButton) findViewById(C0100R.id.zoom_minus_button);
    }

    /* JADX INFO: renamed from: f */
    public final ImageButton m4558f() {
        return (ImageButton) findViewById(C0100R.id.zoom_plus_button);
    }

    /* JADX INFO: renamed from: g */
    public final ImageView m4559g() {
        return (ImageView) findViewById(C0100R.id.slider_background);
    }

    /* JADX INFO: renamed from: h */
    public final ImageView m4560h() {
        return (ImageView) findViewById(C0100R.id.toggle_btn_bk);
    }

    /* JADX INFO: renamed from: i */
    public final ImageView m4561i() {
        return (ImageView) findViewById(C0100R.id.toggle_btn_bk_pressed);
    }

    /* JADX INFO: renamed from: j */
    public final ImageView m4562j() {
        return (ImageView) findViewById(C0100R.id.slider_indicator);
    }

    /* JADX INFO: renamed from: k */
    public final SeekBar m4563k() {
        return (SeekBar) findViewById(C0100R.id.zoom_slider);
    }

    /* JADX INFO: renamed from: l */
    final Space m4564l() {
        return (Space) findViewById(C0100R.id.toast_icon_space3);
    }

    /* JADX INFO: renamed from: m */
    final Space m4565m() {
        return (Space) findViewById(C0100R.id.toast_icon_space1);
    }

    /* JADX INFO: renamed from: n */
    public final TextView m4566n() {
        return (TextView) findViewById(C0100R.id.animated_zoom_icon);
    }

    /* JADX INFO: renamed from: o */
    public final TextView m4567o() {
        return (TextView) findViewById(C0100R.id.animated_zoom_icon_reeded_edge);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Trace.beginSection("zoomUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.zoom_ui_layout, this);
        SeekBar seekBarM4563k = m4563k();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_icon_size);
        int layoutDirection = getResources().getConfiguration().getLayoutDirection();
        seekBarM4563k.setMax(100000);
        ZoomKnob zoomKnobM4572t = m4572t();
        float f = getResources().getDisplayMetrics().densityDpi >= 500 ? 0.85f : 1.0f;
        this.f7411g = f;
        float dimensionPixelSize3 = zoomKnobM4572t.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_knob_text_size) / zoomKnobM4572t.f7330b.getDisplayMetrics().scaledDensity;
        zoomKnobM4572t.f7336h = seekBarM4563k;
        int dimensionPixelSize4 = zoomKnobM4572t.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_knob_elevation);
        zoomKnobM4572t.setElevation(zoomKnobM4572t.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_thumb_elevation));
        zoomKnobM4572t.setGravity(17);
        zoomKnobM4572t.setTextAlignment(4);
        zoomKnobM4572t.setTextSize(dimensionPixelSize3);
        acn.m206a(zoomKnobM4572t.getContext(), C0100R.font.google_sans_medium_compat, new iul(zoomKnobM4572t));
        zoomKnobM4572t.f7334f = ((seekBarM4563k.getLayoutParams().height - zoomKnobM4572t.f7332d) / 2) - (dimensionPixelSize4 / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zoomKnobM4572t.getLayoutParams();
        layoutParams.bottomMargin = zoomKnobM4572t.f7334f;
        zoomKnobM4572t.setLayoutParams(layoutParams);
        seekBarM4563k.setSplitTrack(false);
        zoomKnobM4572t.f7335g = f;
        ImageButton imageButtonM4557e = m4557e();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButtonM4557e.getLayoutParams();
        boolean z = layoutDirection == 1;
        if (z) {
            layoutParams2.rightMargin = -((dimensionPixelSize / 2) + dimensionPixelSize2);
        } else {
            layoutParams2.leftMargin = -((dimensionPixelSize / 2) + dimensionPixelSize2);
        }
        imageButtonM4557e.setLayoutParams(layoutParams2);
        ImageButton imageButtonM4558f = m4558f();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageButtonM4558f.getLayoutParams();
        if (z) {
            layoutParams3.rightMargin = (dimensionPixelSize / 2) + dimensionPixelSize2;
        } else {
            layoutParams3.leftMargin = (dimensionPixelSize / 2) + dimensionPixelSize2;
        }
        imageButtonM4558f.setLayoutParams(layoutParams3);
        m4573u().m4539h();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", ill.m11431b(52.0f));
        this.f7412h = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(300L);
        this.f7412h.setStartDelay(150L);
        this.f7412h.setInterpolator(new AccelerateDecelerateInterpolator());
        if (this.f7417m) {
            m4559g().setBackgroundResource(C0100R.drawable.bg_zoom_toggle_reeded_edge);
            ViewGroup.LayoutParams layoutParams4 = m4566n().getLayoutParams();
            layoutParams4.getClass();
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            layoutParams5.topMargin = getResources().getDimensionPixelOffset(C0100R.dimen.zoom_icon_background_margin_top);
            layoutParams5.leftMargin = getResources().getDimensionPixelOffset(C0100R.dimen.zoom_collapsed_icon_margin_left);
            layoutParams5.gravity = 51;
        }
        Trace.endSection();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            onLayoutUpdated(this.f7419o, this.f7409e);
        }
    }

    @Override // p000.hze
    public final void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        if (this.f7409e == ilkVar && isLaidOut()) {
            if (this.f7409e.equals(ilk.PORTRAIT)) {
                return;
            }
            m4545H();
            return;
        }
        this.f7419o = hzjVar;
        this.f7409e = ilkVar;
        m4545H();
        if (this.f7410f) {
            setTranslationY(0.0f);
            this.f7412h.end();
        }
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }

    /* JADX INFO: renamed from: p */
    public final TextView m4568p() {
        return (TextView) findViewById(C0100R.id.zoom_toggle_tele);
    }

    /* JADX INFO: renamed from: q */
    public final TextView m4569q() {
        return (TextView) findViewById(C0100R.id.zoom_toggle_ultratele);
    }

    /* JADX INFO: renamed from: r */
    public final TextView m4570r() {
        return (TextView) findViewById(C0100R.id.zoom_toggle_ultrawide);
    }

    /* JADX INFO: renamed from: s */
    public final TextView m4571s() {
        return (TextView) findViewById(C0100R.id.zoom_toggle_wide);
    }

    /* JADX INFO: renamed from: t */
    public final ZoomKnob m4572t() {
        return (ZoomKnob) findViewById(C0100R.id.zoom_knob);
    }

    /* JADX INFO: renamed from: u */
    public final ZoomSliderView m4573u() {
        return (ZoomSliderView) findViewById(C0100R.id.zoom_ruler_slider);
    }

    /* JADX INFO: renamed from: v */
    public final void m4574v(TextView textView, int i, float f, Typeface typeface) {
        textView.setTextColor(i);
        textView.setLetterSpacing(f);
        textView.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: w */
    public final void m4575w(boolean z) {
        if (!z) {
            SeekBar seekBarM4563k = m4563k();
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_height);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_bar_margin_top);
            float dimensionPixelSize3 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_touch_area_expand) * this.f7411g;
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_width);
            int dimensionPixelSize5 = getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_height);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) seekBarM4563k.getLayoutParams();
            layoutParams.width = (int) (dimensionPixelSize4 * this.f7411g);
            layoutParams.height = dimensionPixelSize5;
            seekBarM4563k.setLayoutParams(layoutParams);
            seekBarM4563k.setMax(100000);
            int i = (dimensionPixelSize5 - dimensionPixelSize) / 2;
            int i2 = dimensionPixelSize2 + i;
            int i3 = i - dimensionPixelSize2;
            int i4 = (int) dimensionPixelSize3;
            seekBarM4563k.setPaddingRelative(i4, i2, i4, i3);
            seekBarM4563k.setClickable(true);
            m4563k().setProgressDrawable(getResources().getDrawable(C0100R.drawable.bg_zoom_seekbar_dark, null));
        }
        ZoomKnob zoomKnobM4572t = m4572t();
        if (z) {
            zoomKnobM4572t.setTextColor(kxk.m15024q(zoomKnobM4572t, C0100R.attr.colorOnSecondary));
        } else {
            zoomKnobM4572t.f7334f = ((zoomKnobM4572t.f7336h.getLayoutParams().height - zoomKnobM4572t.f7332d) / 2) - (zoomKnobM4572t.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_thumb_elevation) / 2);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zoomKnobM4572t.getLayoutParams();
            layoutParams2.bottomMargin = zoomKnobM4572t.f7334f;
            zoomKnobM4572t.setLayoutParams(layoutParams2);
            InsetDrawable insetDrawable = new InsetDrawable(zoomKnobM4572t.f7330b.getDrawable(C0100R.drawable.bg_zoom_knob, null), zoomKnobM4572t.f7331c);
            zoomKnobM4572t.setTextColor(zoomKnobM4572t.f7330b.getColor(C0100R.color.zoom_knob_text_color, null));
            zoomKnobM4572t.setBackground(insetDrawable);
        }
        zoomKnobM4572t.invalidate();
    }

    /* JADX INFO: renamed from: x */
    public final void m4576x() {
        for (AmbientMode.AmbientController ambientController : this.f7407c) {
            int i = cgm.f5622f;
            nbz nbzVar = nch.f41987a;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4577y() {
        for (AmbientMode.AmbientController ambientController : this.f7407c) {
            int i = cgm.f5622f;
            nbz nbzVar = nch.f41987a;
            ((cgm) ambientController.f1697a).m3641d(false);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4578z(String str) {
        m4566n().setText(str);
        if (this.f7417m) {
            m4567o().setText(str);
        }
    }
}
