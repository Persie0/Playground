package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.p014ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ibw implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30277a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30278b;

    public /* synthetic */ ibw(ShutterButton shutterButton, int i) {
        this.f30278b = i;
        this.f30277a = shutterButton;
    }

    public ibw(ShutterButtonProgressOverlay shutterButtonProgressOverlay, int i) {
        this.f30278b = i;
        this.f30277a = shutterButtonProgressOverlay;
    }

    public ibw(CaptureAnimationOverlay captureAnimationOverlay, int i) {
        this.f30278b = i;
        this.f30277a = captureAnimationOverlay;
    }

    public ibw(FrontLensIndicatorOverlay frontLensIndicatorOverlay, int i) {
        this.f30278b = i;
        this.f30277a = frontLensIndicatorOverlay;
    }

    public /* synthetic */ ibw(icc iccVar, int i) {
        this.f30278b = i;
        this.f30277a = iccVar;
    }

    public /* synthetic */ ibw(ick ickVar, int i) {
        this.f30278b = i;
        this.f30277a = ickVar;
    }

    public /* synthetic */ ibw(idn idnVar, int i) {
        this.f30278b = i;
        this.f30277a = idnVar;
    }

    public /* synthetic */ ibw(iga igaVar, int i) {
        this.f30278b = i;
        this.f30277a = igaVar;
    }

    public /* synthetic */ ibw(iiu iiuVar, int i) {
        this.f30278b = i;
        this.f30277a = iiuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30278b) {
            case 0:
                Object obj = this.f30277a;
                icc iccVar = (icc) obj;
                iccVar.f30317m.f30280a.set((Rect) valueAnimator.getAnimatedValue());
                iccVar.m11052i();
                break;
            case 1:
                ((icc) this.f30277a).m11053j((Rect) valueAnimator.getAnimatedValue());
                break;
            case 2:
                ((icc) this.f30277a).m11053j((Rect) valueAnimator.getAnimatedValue());
                break;
            case 3:
                ((ick) this.f30277a).invalidate();
                break;
            case 4:
                ((idn) this.f30277a).f30474a.invalidate();
                break;
            case 5:
                ((ShutterButton) this.f30277a).m4430x760531c1(valueAnimator);
                break;
            case 6:
                ((ShutterButton) this.f30277a).m4432x1bc333b8(valueAnimator);
                break;
            case 7:
                ((iga) this.f30277a).f30701b.invalidate();
                break;
            case 8:
                ((ShutterButtonProgressOverlay) this.f30277a).f7175d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((ShutterButtonProgressOverlay) this.f30277a).invalidate();
                break;
            case 9:
                ((ShutterButtonProgressOverlay) this.f30277a).f7173b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((ShutterButtonProgressOverlay) this.f30277a).invalidate();
                break;
            case 10:
                ((ShutterButtonProgressOverlay) this.f30277a).f7174c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay = (ShutterButtonProgressOverlay) this.f30277a;
                shutterButtonProgressOverlay.f7172a.setStrokeWidth(shutterButtonProgressOverlay.f7174c);
                ((ShutterButtonProgressOverlay) this.f30277a).invalidate();
                break;
            case 11:
                ((ShutterButtonProgressOverlay) this.f30277a).f7174c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ShutterButtonProgressOverlay) this.f30277a).invalidate();
                break;
            case 12:
                ((CaptureAnimationOverlay) this.f30277a).f7192a.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                ((CaptureAnimationOverlay) this.f30277a).invalidate();
                break;
            case 13:
                iiu iiuVar = (iiu) this.f30277a;
                iiuVar.f31132d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                iiuVar.invalidate();
                break;
            case 14:
                Object obj2 = this.f30277a;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iiu iiuVar2 = (iiu) obj2;
                iiuVar2.f31133e = fFloatValue;
                iiuVar2.f31129a.setStrokeWidth(fFloatValue);
                iiuVar2.invalidate();
                break;
            case 15:
                ((iiu) this.f30277a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                iiu iiuVar3 = (iiu) this.f30277a;
                iiuVar3.f31133e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iiuVar3.invalidate();
                break;
            case 17:
                ((iiu) this.f30277a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ((FrontLensIndicatorOverlay) this.f30277a).f7233i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((FrontLensIndicatorOverlay) this.f30277a).invalidate();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay = (FrontLensIndicatorOverlay) this.f30277a;
                if (frontLensIndicatorOverlay.f7233i == 360) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay.f7230f);
                    valueAnimatorOfFloat.addListener(new iiw(frontLensIndicatorOverlay));
                    valueAnimatorOfFloat.addUpdateListener(new ibw(frontLensIndicatorOverlay, 20));
                    valueAnimatorOfFloat.start();
                }
                break;
            case 19:
                ((FrontLensIndicatorOverlay) this.f30277a).f7239o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay2 = (FrontLensIndicatorOverlay) this.f30277a;
                frontLensIndicatorOverlay2.f7228d.setStrokeWidth(frontLensIndicatorOverlay2.f7239o);
                ((FrontLensIndicatorOverlay) this.f30277a).invalidate();
                break;
            default:
                ((FrontLensIndicatorOverlay) this.f30277a).f7238n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay3 = (FrontLensIndicatorOverlay) this.f30277a;
                frontLensIndicatorOverlay3.f7229e.setAlpha((int) (frontLensIndicatorOverlay3.f7238n * 255.0f));
                ((FrontLensIndicatorOverlay) this.f30277a).invalidate();
                break;
        }
    }
}
