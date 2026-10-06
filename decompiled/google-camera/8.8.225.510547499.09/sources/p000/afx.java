package p000;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.autotimer.p006ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.camcorder.p008ui.stabilization.StabilizationUi;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.p014ui.cuttlefish.CountdownSliderUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class afx implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f287a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f288b;

    public /* synthetic */ afx(View view, int i) {
        this.f288b = i;
        this.f287a = view;
    }

    public /* synthetic */ afx(AmbientMode.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f288b = i;
        this.f287a = ambientController;
    }

    public afx(bgv bgvVar, int i) {
        this.f288b = i;
        this.f287a = bgvVar;
    }

    public /* synthetic */ afx(AutoTimerIndicatorView autoTimerIndicatorView, int i) {
        this.f288b = i;
        this.f287a = autoTimerIndicatorView;
    }

    public /* synthetic */ afx(StabilizationUi stabilizationUi, int i) {
        this.f288b = i;
        this.f287a = stabilizationUi;
    }

    public afx(FilmstripTransitionLayout filmstripTransitionLayout, int i) {
        this.f288b = i;
        this.f287a = filmstripTransitionLayout;
    }

    public /* synthetic */ afx(CountdownSliderUi countdownSliderUi, int i) {
        this.f288b = i;
        this.f287a = countdownSliderUi;
    }

    public /* synthetic */ afx(fds fdsVar, int i) {
        this.f288b = i;
        this.f287a = fdsVar;
    }

    public afx(glk glkVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f288b = i;
        this.f287a = glkVar;
    }

    public /* synthetic */ afx(hhh hhhVar, int i) {
        this.f288b = i;
        this.f287a = hhhVar;
    }

    public /* synthetic */ afx(icc iccVar, int i) {
        this.f288b = i;
        this.f287a = iccVar;
    }

    public afx(C0776kp c0776kp, int i) {
        this.f288b = i;
        this.f287a = c0776kp;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [dwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [dwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [dwl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [dwl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [dwl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [dwl, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f288b) {
            case 0:
                ((View) ((C0192fq) ((AmbientMode.AmbientController) this.f287a).f1697a).f23155c.getParent()).invalidate();
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ((C0776kp) this.f287a).f36734b.setAlpha(iFloatValue);
                ((C0776kp) this.f287a).f36735c.setAlpha(iFloatValue);
                ((C0776kp) this.f287a).m14654t();
                break;
            case 2:
                bgv bgvVar = (bgv) this.f287a;
                bkd bkdVar = bgvVar.f3213i;
                if (bkdVar != null) {
                    bkdVar.mo2538l(bgvVar.f3206b.m2682c());
                }
                break;
            case 3:
                ((AutoTimerIndicatorView) this.f287a).invalidate();
                break;
            case 4:
                Object obj = this.f287a;
                ((StabilizationUi) obj).f6583b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ((FilmstripTransitionLayout) this.f287a).m4123c(1.0f - valueAnimator.getAnimatedFraction());
                ((FilmstripTransitionLayout) this.f287a).invalidate();
                break;
            case 6:
                ((FilmstripTransitionLayout) this.f287a).m4123c(valueAnimator.getAnimatedFraction());
                ((FilmstripTransitionLayout) this.f287a).invalidate();
                break;
            case 7:
                ((glk) this.f287a).f25500a.mo6826c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 8:
                ((glk) this.f287a).f25500a.mo6827d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 9:
                ((glk) this.f287a).f25503d.mo6820l(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 10:
                ((glk) this.f287a).f25503d.mo6821m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 11:
                ((glk) this.f287a).f25503d.mo6822n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 12:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((FocusIndicatorAccessoryView) ((glk) this.f287a).f25502c).m4129d(fFloatValue);
                ((FocusIndicatorAccessoryView) ((glk) this.f287a).f25502c).invalidate();
                ((glk) this.f287a).f25503d.mo6821m(fFloatValue);
                ((FocusIndicatorRingView) ((glk) this.f287a).f25501b).invalidate();
                break;
            case 13:
                ((fds) this.f287a).f21483b.setImageAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 14:
                hhh hhhVar = (hhh) this.f287a;
                hhhVar.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (hhhVar.f27811f == 1) {
                    hhhVar.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                }
                hhhVar.requestLayout();
                break;
            case 15:
                hhh hhhVar2 = (hhh) this.f287a;
                hhhVar2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hhhVar2.requestLayout();
                break;
            case 16:
                hhh hhhVar3 = (hhh) this.f287a;
                hhhVar3.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                hhhVar3.requestLayout();
                break;
            case 17:
                ((View) this.f287a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ((CountdownSliderUi) this.f287a).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                icc iccVar = (icc) this.f287a;
                iccVar.f30330z = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                iccVar.m11052i();
                break;
            default:
                icc iccVar2 = (icc) this.f287a;
                iccVar2.f30318n = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                iccVar2.m11052i();
                break;
        }
    }
}
