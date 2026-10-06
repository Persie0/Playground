package p000;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.zoomui.view.ZoomKnob;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itx extends itg {

    /* JADX INFO: renamed from: a */
    private static final Object f32164a = new Object();

    /* JADX INFO: renamed from: A */
    public final float f32165A;

    /* JADX INFO: renamed from: B */
    public final float f32166B;

    /* JADX INFO: renamed from: C */
    public final boolean f32167C;

    /* JADX INFO: renamed from: D */
    public boolean f32168D;

    /* JADX INFO: renamed from: E */
    public float f32169E;

    /* JADX INFO: renamed from: F */
    public float f32170F;

    /* JADX INFO: renamed from: G */
    public boolean f32171G;

    /* JADX INFO: renamed from: H */
    public boolean f32172H;

    /* JADX INFO: renamed from: I */
    public boolean f32173I;

    /* JADX INFO: renamed from: J */
    public mrm f32174J;

    /* JADX INFO: renamed from: K */
    public float f32175K;

    /* JADX INFO: renamed from: L */
    public int f32176L;

    /* JADX INFO: renamed from: M */
    public int f32177M;

    /* JADX INFO: renamed from: N */
    private final Set f32178N;

    /* JADX INFO: renamed from: O */
    private final AnimatorSet f32179O;

    /* JADX INFO: renamed from: P */
    private final boolean f32180P;

    /* JADX INFO: renamed from: Q */
    private final AnimatorSet f32181Q;

    /* JADX INFO: renamed from: R */
    private final AnimatorSet f32182R;

    /* JADX INFO: renamed from: S */
    private final Set f32183S;

    /* JADX INFO: renamed from: T */
    private final Resources f32184T;

    /* JADX INFO: renamed from: U */
    private final float f32185U;

    /* JADX INFO: renamed from: V */
    private final int f32186V;

    /* JADX INFO: renamed from: W */
    private AnimatorSet f32187W;

    /* JADX INFO: renamed from: X */
    private boolean f32188X;

    /* JADX INFO: renamed from: Y */
    private int f32189Y;

    /* JADX INFO: renamed from: b */
    private final AnimatorListenerAdapter f32190b;

    /* JADX INFO: renamed from: c */
    private final AnimatorListenerAdapter f32191c;

    /* JADX INFO: renamed from: d */
    private final AnimatorListenerAdapter f32192d;

    /* JADX INFO: renamed from: e */
    private final ValueAnimator.AnimatorUpdateListener f32193e;

    /* JADX INFO: renamed from: f */
    private final Runnable f32194f;

    /* JADX INFO: renamed from: g */
    private final Runnable f32195g;

    /* JADX INFO: renamed from: h */
    private final jww f32196h;

    /* JADX INFO: renamed from: i */
    public final dcj f32197i;

    /* JADX INFO: renamed from: j */
    public final jww f32198j;

    /* JADX INFO: renamed from: k */
    public final fcp f32199k;

    /* JADX INFO: renamed from: l */
    public final ZoomKnob f32200l;

    /* JADX INFO: renamed from: m */
    public final SeekBar f32201m;

    /* JADX INFO: renamed from: n */
    public final ValueAnimator f32202n;

    /* JADX INFO: renamed from: o */
    public final ValueAnimator f32203o;

    /* JADX INFO: renamed from: p */
    public final ValueAnimator f32204p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f32205q;

    /* JADX INFO: renamed from: r */
    public final float f32206r;

    /* JADX INFO: renamed from: s */
    public final ZoomUi f32207s;

    /* JADX INFO: renamed from: t */
    public final ZoomSliderView f32208t;

    /* JADX INFO: renamed from: u */
    public final isp f32209u;

    /* JADX INFO: renamed from: v */
    public final mrm f32210v;

    /* JADX INFO: renamed from: w */
    public final jwn f32211w;

    /* JADX INFO: renamed from: x */
    public final dhv f32212x;

    /* JADX INFO: renamed from: y */
    public final Interpolator f32213y;

    /* JADX INFO: renamed from: z */
    public final int f32214z;

    public itx(ZoomUi zoomUi, Set set, jww jwwVar, jww jwwVar2, fcp fcpVar, mrm mrmVar, dcj dcjVar, jwn jwnVar, dhv dhvVar, float f, isp ispVar, Set set2) {
        iti itiVar = new iti(this);
        this.f32190b = itiVar;
        itj itjVar = new itj(this);
        this.f32191c = itjVar;
        itk itkVar = new itk(this);
        this.f32192d = itkVar;
        ija ijaVar = new ija(this, 16);
        this.f32193e = ijaVar;
        this.f32194f = new ith(this, 2);
        this.f32195g = new ith(this, 1);
        this.f32176L = 4;
        this.f32170F = 1.0f;
        this.f32189Y = 0;
        this.f32177M = 3;
        this.f32172H = false;
        this.f32188X = false;
        this.f32173I = true;
        this.f32174J = mrm.m16829i(Float.valueOf(1.0f));
        this.f32175K = 1.0f;
        jvd.m13538a();
        this.f32210v = mrmVar;
        this.f32178N = set;
        this.f32198j = jwwVar;
        this.f32196h = jwwVar2;
        this.f32197i = dcjVar;
        this.f32199k = fcpVar;
        this.f32211w = jwnVar;
        this.f32212x = dhvVar;
        this.f32206r = f;
        this.f32207s = zoomUi;
        this.f32209u = ispVar;
        this.f32180P = dhvVar.mo6184l(dib.f11284ar);
        this.f32183S = set2;
        Resources resources = zoomUi.getResources();
        this.f32184T = resources;
        this.f32200l = zoomUi.m4572t();
        this.f32201m = zoomUi.m4563k();
        this.f32208t = zoomUi.m4573u();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f32204p = valueAnimator;
        valueAnimator.addUpdateListener(ijaVar);
        valueAnimator.addListener(itiVar);
        valueAnimator.setDuration(500L);
        valueAnimator.setInterpolator(new akf());
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f32203o = valueAnimator2;
        valueAnimator2.addUpdateListener(ijaVar);
        valueAnimator2.setInterpolator(new LinearInterpolator());
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.f32202n = valueAnimator3;
        valueAnimator3.addUpdateListener(ijaVar);
        valueAnimator3.setDuration(500L);
        valueAnimator3.setInterpolator(new akf());
        valueAnimator3.addListener(itjVar);
        ValueAnimator valueAnimator4 = new ValueAnimator();
        this.f32205q = valueAnimator4;
        valueAnimator4.addUpdateListener(ijaVar);
        valueAnimator4.setDuration(500L);
        valueAnimator4.setInterpolator(new akf());
        valueAnimator4.addListener(itkVar);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(zoomUi, (Property<ZoomUi, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat.addListener(new itl(zoomUi));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ValueAnimator.ofInt(0, 1).setDuration(100L), objectAnimatorOfFloat);
        this.f32179O = animatorSet;
        this.f32171G = dhvVar.mo6184l(dib.f11276aj);
        this.f32181Q = m11777N(true);
        this.f32182R = m11777N(false);
        this.f32213y = AnimationUtils.loadInterpolator(zoomUi.getContext(), R.interpolator.fast_out_slow_in);
        this.f32214z = resources.getInteger(C0100R.integer.zoom_icon_collapsed_duration_ms);
        this.f32165A = resources.getDimension(C0100R.dimen.zoom_collapsed_icon_margin_left);
        this.f32166B = resources.getDimension(C0100R.dimen.zoom_collapsed_icon_width);
        this.f32167C = jzn.m13833u(dhvVar);
        this.f32185U = resources.getDimension(C0100R.dimen.zoom_slider_zoom_text_y_shift);
        this.f32186V = resources.getInteger(C0100R.integer.fade_in_duration_between_toggle_and_slider);
    }

    /* JADX INFO: renamed from: I */
    public static int m11776I(int i) {
        if (i == 9 || i == 6) {
            return i;
        }
        return 1;
    }

    /* JADX INFO: renamed from: N */
    private final AnimatorSet m11777N(boolean z) {
        TextView textViewM4566n = this.f32207s.m4566n();
        int dimensionPixelSize = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_size);
        int dimensionPixelSize2 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_lift_size);
        int dimensionPixelSize3 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_background_margin_top);
        int dimensionPixelSize4 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_lift_distance);
        float dimensionPixelSize5 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_size);
        float dimensionPixelSize6 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_lift_size);
        float f = dimensionPixelSize5 / this.f32184T.getDisplayMetrics().scaledDensity;
        float f2 = dimensionPixelSize6 / this.f32184T.getDisplayMetrics().scaledDensity;
        int dimensionPixelSize7 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_indicator_hide_margin_top);
        int dimensionPixelSize8 = this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_icon_indicator_show_margin_top);
        ValueAnimator valueAnimatorOfInt = z ? ValueAnimator.ofInt(dimensionPixelSize, dimensionPixelSize2) : ValueAnimator.ofInt(dimensionPixelSize2, dimensionPixelSize);
        valueAnimatorOfInt.addUpdateListener(new ija(textViewM4566n, 12));
        ValueAnimator valueAnimatorOfInt2 = z ? ValueAnimator.ofInt(dimensionPixelSize3, dimensionPixelSize3 - dimensionPixelSize4) : ValueAnimator.ofInt(dimensionPixelSize3 - dimensionPixelSize4, dimensionPixelSize3);
        valueAnimatorOfInt2.addUpdateListener(new ija(textViewM4566n, 13));
        ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(f, f2) : ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.addUpdateListener(new ija(textViewM4566n, 14));
        ValueAnimator valueAnimatorOfInt3 = z ? ValueAnimator.ofInt(dimensionPixelSize7, dimensionPixelSize8) : ValueAnimator.ofInt(dimensionPixelSize8, dimensionPixelSize7);
        valueAnimatorOfInt3.addUpdateListener(new ija(this, 15));
        valueAnimatorOfInt3.setDuration(83L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new akf());
        if (z) {
            valueAnimatorOfInt3.setStartDelay(200L);
        } else {
            valueAnimatorOfInt3.setDuration(30L);
            valueAnimatorOfInt2.setDuration(300L);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfFloat.setDuration(300L);
        }
        animatorSet.play(valueAnimatorOfInt2).with(valueAnimatorOfInt).with(valueAnimatorOfFloat).with(valueAnimatorOfInt3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: O */
    private final boolean m11778O(int i) {
        if (i != 0) {
            return i == 3 && this.f32212x.mo6184l(dib.f11274ah);
        }
        throw null;
    }

    /* JADX INFO: renamed from: A */
    public final void m11779A(boolean z) {
        if (!this.f32171G || this.f32172H) {
            if (z) {
                this.f32179O.reverse();
            } else {
                this.f32207s.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11780B(boolean z) {
        if (z == this.f32188X) {
            return;
        }
        this.f32188X = z;
        Iterator it = this.f32183S.iterator();
        while (it.hasNext()) {
            ges gesVar = (ges) ((AmbientModeSupport.AmbientController) it.next()).f1702a;
            if (gesVar.m9145c() && hzk.m10914b((ikw) gesVar.f24429f.mo3831be())) {
                gesVar.m9143a(!z);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m11781C() {
        m11790M(this.f32177M);
    }

    /* JADX INFO: renamed from: D */
    public final void m11782D() {
        boolean z;
        if (!this.f32171G || this.f32172H) {
            return;
        }
        if (this.f32212x.mo6184l(dib.f11279am)) {
            synchronized (f32164a) {
                ZoomSliderView zoomSliderView = this.f32208t;
                float fM4536e = zoomSliderView.m4536e(((Float) this.f32198j.mo3831be()).floatValue());
                if (Math.round(zoomSliderView.f7386h * 1000.0f) != Math.round(1000.0f * fM4536e)) {
                    zoomSliderView.f7386h = fM4536e;
                }
                if (this.f32208t.getVisibility() != 0) {
                    int i = this.f32176L;
                    if (i == 0) {
                        throw null;
                    }
                    if (i != 1) {
                        AnimatorSet animatorSet = this.f32187W;
                        if (animatorSet != null && animatorSet.isRunning()) {
                            this.f32187W.end();
                        }
                        this.f32207s.m4560h().setVisibility(4);
                        if (!this.f32167C) {
                            this.f32207s.m4566n().setVisibility(0);
                            this.f32207s.m4562j().setVisibility(0);
                        }
                        ZoomUi zoomUi = this.f32207s;
                        View viewFindViewById = zoomUi.getRootView().findViewById(C0100R.id.viewfinder_frame);
                        ZoomSliderView zoomSliderViewM4573u = zoomUi.m4573u();
                        if (viewFindViewById == null || zoomSliderViewM4573u == null) {
                            z = true;
                        } else {
                            int[] iArr = new int[2];
                            viewFindViewById.getLocationOnScreen(iArr);
                            int i2 = iArr[0];
                            int i3 = iArr[1];
                            int width = viewFindViewById.getWidth();
                            int height = viewFindViewById.getHeight();
                            zoomSliderViewM4573u.getLocationOnScreen(iArr);
                            int i4 = iArr[0];
                            int i5 = iArr[1];
                            z = i4 >= i2 && i4 <= i2 + width && i5 >= i3 && i5 <= i3 + height;
                        }
                        this.f32207s.m4559g().setVisibility((((Boolean) zoomUi.f7415k.mo10031c(gzy.f27062u)).booleanValue() || z) ? 0 : 4);
                        this.f32208t.setVisibility(0);
                        this.f32176L = 1;
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f32207s.m4559g().getWidth(), this.f32208t.getWidth() + this.f32184T.getDimensionPixelSize(C0100R.dimen.zoom_slider_background_padding_width));
                        valueAnimatorOfInt.addUpdateListener(new ija(this, 9));
                        valueAnimatorOfInt.setDuration(200L);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ija(this, 10));
                        valueAnimatorOfFloat.setDuration(83L);
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ija(this, 11));
                        valueAnimatorOfFloat2.setDuration(83L);
                        this.f32207s.m4556d().setEnabled(false);
                        this.f32207s.m4566n().setEnabled(false);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f32167C) {
                            TextView textViewM4567o = this.f32207s.m4567o();
                            textViewM4567o.setAlpha(0.0f);
                            textViewM4567o.setTranslationX(m11792w() / 2.0f);
                            textViewM4567o.setTranslationY(this.f32185U / 2.0f);
                            textViewM4567o.setVisibility(0);
                            textViewM4567o.animate().alpha(1.0f).translationY(0.0f).translationX(0.0f).setDuration(this.f32186V).setStartDelay(83L).start();
                            float f = (-this.f32185U) / 2.0f;
                            float f2 = (-m11792w()) / 2.0f;
                            float fM11791v = m11791v();
                            TextView textViewM4566n = this.f32207s.m4566n();
                            textViewM4566n.setTranslationX(fM11791v + m11792w());
                            textViewM4566n.setTranslationY(0.0f);
                            textViewM4566n.setAlpha(1.0f);
                            textViewM4566n.setVisibility(0);
                            textViewM4566n.animate().alpha(0.0f).translationYBy(f).translationXBy(f2).setDuration(83L).start();
                            animatorSet3.playTogether(valueAnimatorOfInt, animatorSet2);
                        } else {
                            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(m11792w(), 0);
                            valueAnimatorOfInt2.addUpdateListener(new ija(this, 5));
                            animatorSet3.playTogether(valueAnimatorOfInt, animatorSet2, this.f32181Q, valueAnimatorOfInt2);
                        }
                        animatorSet3.addListener(new ito(this));
                        this.f32187W = animatorSet3;
                        animatorSet3.start();
                        m11780B(true);
                    }
                }
            }
        } else {
            ZoomUi zoomUi2 = this.f32207s;
            synchronized (ZoomUi.f7405a) {
                int i6 = zoomUi2.f7416l;
                if (i6 != 1) {
                    zoomUi2.f7416l = 1;
                    SeekBar seekBarM4563k = zoomUi2.m4563k();
                    int dimensionPixelSize = zoomUi2.getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_height);
                    float dimensionPixelSize2 = zoomUi2.getResources().getDimensionPixelSize(C0100R.dimen.zoom_touch_area_expand) * zoomUi2.f7411g;
                    int dimensionPixelSize3 = zoomUi2.getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_width);
                    int dimensionPixelSize4 = zoomUi2.getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_height);
                    int dimensionPixelSize5 = zoomUi2.getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_stroke_width);
                    int i7 = ((dimensionPixelSize4 - dimensionPixelSize) / 2) + dimensionPixelSize5 + dimensionPixelSize5;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) seekBarM4563k.getLayoutParams();
                    layoutParams.width = (int) (dimensionPixelSize3 * zoomUi2.f7411g);
                    layoutParams.height = dimensionPixelSize4;
                    seekBarM4563k.setLayoutParams(layoutParams);
                    seekBarM4563k.setMax(100000);
                    int i8 = (int) dimensionPixelSize2;
                    seekBarM4563k.setPaddingRelative(i8, i7, i8, i7);
                    if (zoomUi2.m4559g().getHeight() != dimensionPixelSize || zoomUi2.m4559g().getBackground() == null) {
                        AnimatorSet animatorSetM4552F = zoomUi2.m4552F(i6, false);
                        animatorSetM4552F.addListener(new iur(zoomUi2));
                        ObjectAnimator objectAnimatorM4546b = ZoomUi.m4546b(zoomUi2.m4555c(), false);
                        ObjectAnimator objectAnimatorM4546b2 = ZoomUi.m4546b(zoomUi2.m4560h(), false);
                        objectAnimatorM4546b2.addListener(new ius(zoomUi2));
                        ObjectAnimator objectAnimatorM4546b3 = ZoomUi.m4546b(zoomUi2.m4572t(), true);
                        objectAnimatorM4546b3.addListener(new iut(zoomUi2));
                        zoomUi2.f7413i = new AnimatorSet();
                        zoomUi2.f7413i.play(objectAnimatorM4546b).with(objectAnimatorM4546b2);
                        zoomUi2.f7413i.play(animatorSetM4552F).after(objectAnimatorM4546b);
                        zoomUi2.f7413i.play(objectAnimatorM4546b3).after(animatorSetM4552F);
                        AnimatorSet animatorSet4 = zoomUi2.f7414j;
                        if (animatorSet4 != null && animatorSet4.isRunning()) {
                            zoomUi2.f7414j.cancel();
                        }
                        zoomUi2.f7413i.start();
                    }
                }
            }
        }
        m11795z();
        m11784F();
    }

    /* JADX INFO: renamed from: E */
    public final void m11783E() {
        if (this.f32172H) {
            return;
        }
        m11782D();
        if (this.f32207s.getVisibility() == 8) {
            this.f32179O.start();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11785G() {
        this.f32196h.mo3415bf((Float) this.f32198j.mo3831be());
    }

    /* JADX INFO: renamed from: H */
    public final void m11786H() {
        if (this.f32200l.getAccessibilityLiveRegion() != 0) {
            this.f32200l.postDelayed(new ith(this, 0), this.f32184T.getInteger(C0100R.integer.zoom_knob_talkback_assertiveness_off_delay_ms));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11787J(int i, float f, float f2) {
        this.f32199k.mo8141P(i, f, f2, this.f32197i.mo5895d());
    }

    /* JADX INFO: renamed from: K */
    public final int m11788K(float f, int i) {
        int iOrdinal = iuk.WIDE.ordinal();
        float fM11704c = this.f32209u.m11704c(f, this.f32170F);
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                isp ispVar = this.f32209u;
                return fM11704c >= ispVar.m11704c(ispVar.m11702a(1), this.f32170F) ? 1 : 0;
            case 2:
                if (fM11704c >= this.f32209u.m11702a(iuk.TELE.ordinal())) {
                    return iuk.TELE.ordinal();
                }
                return fM11704c >= this.f32209u.m11702a(iuk.WIDE.ordinal()) ? iOrdinal : iuk.ULTRA_WIDE.ordinal();
            case 3:
                if (fM11704c >= Math.min(this.f32209u.m11703b(), this.f32209u.m11702a(iuk.ULTRA_TELE.ordinal()))) {
                    return iuk.ULTRA_TELE.ordinal();
                }
                if (fM11704c >= this.f32209u.m11702a(iuk.ULTRA_TELE.ordinal()) || fM11704c < this.f32209u.m11702a(iuk.TELE.ordinal())) {
                    return fM11704c >= this.f32209u.m11702a(iuk.WIDE.ordinal()) ? iOrdinal : iuk.ULTRA_WIDE.ordinal();
                }
                return iuk.TELE.ordinal();
            default:
                return iOrdinal;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m11789L(int i) {
        if (this.f32189Y == i) {
            return;
        }
        this.f32189Y = i;
        Iterator it = this.f32178N.iterator();
        while (it.hasNext()) {
            ((iuh) it.next()).mo7491m(i);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m11790M(int i) {
        long currentPlayTime;
        int i2 = i;
        if (!this.f32172H && this.f32207s.getVisibility() == 8 && this.f32201m.isEnabled()) {
            this.f32179O.start();
        }
        ZoomUi zoomUi = this.f32207s;
        synchronized (ZoomUi.f7405a) {
            if (zoomUi.f7416l != i2) {
                zoomUi.f7416l = i2;
                SeekBar seekBarM4563k = zoomUi.m4563k();
                int iM4551E = zoomUi.m4551E(i2);
                int dimensionPixelSize = zoomUi.getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_two_btn_width);
                int dimensionPixelSize2 = zoomUi.getResources().getDimensionPixelSize(C0100R.dimen.zoom_togglebar_touch_area_width);
                int dimensionPixelSize3 = zoomUi.getResources().getDimensionPixelSize(C0100R.dimen.zoom_seekbar_touch_area_height);
                int dimensionPixelSize4 = zoomUi.getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_height);
                int dimensionPixelSize5 = zoomUi.getResources().getDimensionPixelSize(C0100R.dimen.zoom_toggle_extend_touch_area);
                int i3 = (dimensionPixelSize2 - iM4551E) / 2;
                int i4 = (dimensionPixelSize3 - dimensionPixelSize4) / 2;
                if (i2 == 2) {
                    zoomUi.m4553G(false, 2);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zoomUi.m4555c().getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    zoomUi.m4555c().setLayoutParams(layoutParams);
                    if (seekBarM4563k.getMax() != 1) {
                        seekBarM4563k.setMax(1);
                    }
                } else {
                    zoomUi.m4553G(true, i2);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zoomUi.m4555c().getLayoutParams();
                    layoutParams2.width = iM4551E;
                    zoomUi.m4555c().setLayoutParams(layoutParams2);
                    if (i2 != 3) {
                        seekBarM4563k.setMax(3);
                    } else if (seekBarM4563k.getMax() != 2) {
                        seekBarM4563k.setMax(2);
                        i2 = 3;
                    } else {
                        i2 = 3;
                        seekBarM4563k.setMax(3);
                    }
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) seekBarM4563k.getLayoutParams();
                layoutParams3.width = dimensionPixelSize5 + iM4551E;
                layoutParams3.height = dimensionPixelSize3;
                seekBarM4563k.setLayoutParams(layoutParams3);
                if (seekBarM4563k.getProgressDrawable() == null) {
                    seekBarM4563k.setPaddingRelative(i3, i4, i3, i4);
                }
                int height = zoomUi.m4559g().getHeight();
                if (height == 0 || height == dimensionPixelSize4) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(zoomUi.m4559g().getWidth(), iM4551E);
                    valueAnimatorOfInt.addUpdateListener(new ija(zoomUi, 20));
                    valueAnimatorOfInt.addListener(new iuq(zoomUi));
                    valueAnimatorOfInt.setDuration(200L);
                    if (zoomUi.m4559g().getVisibility() == 8) {
                        valueAnimatorOfInt.end();
                    } else {
                        AnimatorSet animatorSet = zoomUi.f7413i;
                        if (animatorSet != null && animatorSet.isRunning()) {
                            zoomUi.f7413i.cancel();
                        }
                        valueAnimatorOfInt.start();
                    }
                    ZoomKnob zoomKnobM4572t = zoomUi.m4572t();
                    zoomKnobM4572t.setVisibility(4);
                    zoomKnobM4572t.m4529d(false);
                    if (zoomUi.m4559g().getVisibility() != 8) {
                        zoomUi.m4555c().setVisibility(0);
                        zoomUi.m4560h().setVisibility(0);
                    }
                } else {
                    ObjectAnimator objectAnimatorM4546b = ZoomUi.m4546b(zoomUi.m4555c(), true);
                    ObjectAnimator objectAnimatorM4546b2 = ZoomUi.m4546b(zoomUi.m4560h(), true);
                    objectAnimatorM4546b.addListener(new iuo(zoomUi));
                    AnimatorSet animatorSetM4552F = zoomUi.m4552F(i2, true);
                    animatorSetM4552F.setInterpolator(new ahy(3));
                    animatorSetM4552F.addListener(new iup(zoomUi));
                    AnimatorSet animatorSet2 = zoomUi.f7414j;
                    if (animatorSet2 == null || !animatorSet2.isRunning()) {
                        currentPlayTime = 0;
                    } else {
                        currentPlayTime = zoomUi.f7414j.getCurrentPlayTime();
                        zoomUi.f7414j.cancel();
                    }
                    zoomUi.f7414j = new AnimatorSet();
                    zoomUi.f7414j.play(objectAnimatorM4546b).after(animatorSetM4552F);
                    zoomUi.f7414j.play(objectAnimatorM4546b2).with(objectAnimatorM4546b);
                    AnimatorSet animatorSet3 = zoomUi.f7413i;
                    if (animatorSet3 != null && animatorSet3.isRunning()) {
                        zoomUi.f7413i.cancel();
                    }
                    zoomUi.f7414j.start();
                    if (currentPlayTime <= 0 || zoomUi.f7414j.getStartDelay() + currentPlayTime >= zoomUi.f7414j.getTotalDuration()) {
                        ((nbe) ((nbe) ZoomUi.f7406b.m17252c()).mo17276G(4475)).mo17297v("Unsupported current playtime = %s, total duration = %s", currentPlayTime, zoomUi.f7414j.getTotalDuration());
                    } else {
                        zoomUi.f7414j.setCurrentPlayTime(currentPlayTime);
                    }
                    zoomUi.m4559g().setBackground(zoomUi.getResources().getDrawable(C0100R.drawable.bg_zoom_toggle, null));
                }
                zoomUi.invalidate();
            }
        }
        if (!this.f32212x.mo6184l(dib.f11279am)) {
            this.f32207s.m4548B(m11788K(((Float) this.f32198j.mo3831be()).floatValue(), i2));
        } else {
            if (m11778O(i2) && this.f32170F < 1.0f) {
                return;
            }
            if (this.f32177M != i2) {
                this.f32207s.m4566n().setVisibility(8);
                if ((this.f32197i.mo5895d().equals(kmq.f36557a) && this.f32212x.mo6184l(dib.f11274ah)) || ((ikw) this.f32211w.mo3831be()).equals(ikw.VIDEO) || ((ikw) this.f32211w.mo3831be()).equals(ikw.SLOW_MOTION) || ((ikw) this.f32211w.mo3831be()).equals(ikw.LONG_EXPOSURE) || m11778O(i2) || ((FrameLayout.LayoutParams) this.f32207s.m4560h().getLayoutParams()).leftMargin != this.f32207s.m4554a(m11788K(((Float) this.f32198j.mo3831be()).floatValue(), i2))) {
                    this.f32207s.m4547A(m11788K(((Float) this.f32198j.mo3831be()).floatValue(), i2), false);
                }
            } else {
                this.f32207s.m4547A(m11788K(((Float) this.f32198j.mo3831be()).floatValue(), i2), false);
            }
        }
        isp ispVar = this.f32209u;
        ispVar.m11706e(this.f32207s, ispVar.m11705d(((Float) this.f32198j.mo3831be()).floatValue()));
        if (!this.f32209u.m11709h(((Float) this.f32198j.mo3831be()).floatValue()) || this.f32177M != i2) {
            if (!this.f32209u.f31997b.isRunning()) {
                this.f32209u.m11708g(this.f32207s, ((Float) this.f32198j.mo3831be()).floatValue());
                this.f32198j.mo3831be();
            } else if (this.f32177M == i2) {
                this.f32209u.m11708g(this.f32207s, ((Float) this.f32198j.mo3831be()).floatValue());
            }
        }
        this.f32177M = i2;
        if (this.f32212x.mo6184l(dib.f11279am)) {
            m11793x();
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m11791v() {
        return ((this.f32207s.getWidth() / 2.0f) - (this.f32166B / 2.0f)) - this.f32165A;
    }

    /* JADX INFO: renamed from: w */
    public final int m11792w() {
        return this.f32207s.m4554a(m11788K(((Float) this.f32198j.mo3831be()).floatValue(), this.f32177M));
    }

    /* JADX INFO: renamed from: x */
    public final AnimatorSet m11793x() {
        synchronized (f32164a) {
            if (this.f32207s.m4556d().getVisibility() != 0 && this.f32176L == 1) {
                AnimatorSet animatorSet = this.f32187W;
                if (animatorSet != null && animatorSet.isRunning()) {
                    this.f32187W.end();
                }
                this.f32176L = this.f32177M;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f32207s.m4559g().getWidth(), this.f32207s.m4551E(this.f32177M));
                valueAnimatorOfInt.addUpdateListener(new ija(this, 6));
                valueAnimatorOfInt.setDuration(200L);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ija(this, 7));
                valueAnimatorOfFloat.setDuration(83L);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ija(this, 8));
                valueAnimatorOfFloat2.setDuration(83L);
                valueAnimatorOfFloat2.addListener(new itm(this));
                this.f32207s.m4566n().setEnabled(false);
                this.f32207s.m4556d().setVisibility(0);
                this.f32207s.m4559g().setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                if (this.f32167C) {
                    TextView textViewM4566n = this.f32207s.m4566n();
                    textViewM4566n.setAlpha(0.0f);
                    textViewM4566n.setTranslationX(m11791v() + (m11792w() / 2.0f));
                    textViewM4566n.setTranslationY((-this.f32185U) / 2.0f);
                    textViewM4566n.setVisibility(0);
                    textViewM4566n.animate().setDuration(this.f32186V).setStartDelay(83L).alpha(1.0f).translationXBy(m11792w() / 2.0f).translationYBy(this.f32185U / 2.0f).start();
                    TextView textViewM4567o = this.f32207s.m4567o();
                    textViewM4567o.setTranslationX(0.0f);
                    textViewM4567o.setTranslationY(0.0f);
                    textViewM4567o.setAlpha(1.0f);
                    textViewM4567o.setVisibility(0);
                    textViewM4567o.animate().alpha(0.0f).translationY(this.f32185U / 2.0f).translationX(m11792w() / 2.0f).setDuration(83L).start();
                    animatorSet3.playTogether(valueAnimatorOfInt, animatorSet2);
                } else {
                    animatorSet3.playTogether(valueAnimatorOfInt, animatorSet2, this.f32182R, m11794y());
                }
                animatorSet3.addListener(new itn(this));
                this.f32187W = animatorSet3;
                animatorSet3.start();
                m11780B(false);
                return animatorSet3;
            }
            return new AnimatorSet();
        }
    }

    /* JADX INFO: renamed from: y */
    public final ValueAnimator m11794y() {
        int iM11792w = m11792w();
        ViewGroup.LayoutParams layoutParams = this.f32207s.m4566n().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams2.leftMargin, iM11792w);
        valueAnimatorOfInt.addUpdateListener(new ifo(this, layoutParams2, 2));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: z */
    final void m11795z() {
        ZoomUi zoomUi = this.f32207s;
        if (zoomUi != null) {
            if (this.f32171G) {
                zoomUi.removeCallbacks(this.f32194f);
            } else {
                zoomUi.removeCallbacks(this.f32195g);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11784F() {
        if (this.f32207s != null) {
            int integer = (!this.f32171G || this.f32180P) ? this.f32184T.getInteger(C0100R.integer.zoom_seekbar_timeout_ms) : this.f32184T.getInteger(C0100R.integer.zoom_togglebar_timeout_ms);
            if (this.f32212x.mo6184l(dib.f11327bh)) {
                integer *= 10;
            }
            if (this.f32171G) {
                this.f32207s.postDelayed(this.f32194f, integer);
            } else {
                this.f32207s.postDelayed(this.f32195g, integer);
            }
        }
    }
}
