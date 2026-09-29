package p000;

import android.animation.ValueAnimator;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import com.google.android.material.slider.AbstractC1071b;
import com.google.android.material.timepicker.ClockHandView;
import com.lingq.core.achievements.views.StreakCircularProgressIndicator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ba0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8202b;

    public /* synthetic */ ba0(Object obj, int i) {
        this.f8201a = i;
        this.f8202b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f8201a;
        Object obj = this.f8202b;
        switch (i) {
            case 0:
                AbstractC1071b abstractC1071b = (AbstractC1071b) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (d6a d6aVar : abstractC1071b.f13198l) {
                    d6aVar.f35061p0 = fFloatValue;
                    d6aVar.f35062q0 = fFloatValue;
                    d6aVar.f35065t0 = AbstractC0853cn.m4879b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    d6aVar.invalidateSelf();
                }
                abstractC1071b.postInvalidateOnAnimation();
                break;
            case 1:
                int i2 = ClockHandView.f13341I;
                ((ClockHandView) obj).m6253b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                mc2 mc2Var = (mc2) obj;
                mc2Var.f51060K.f8675e = mc2Var.f51065P.getInterpolation(mc2Var.f51064O.getAnimatedFraction());
                break;
            case 3:
                ((ym2) obj).f46064d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                C0868b c0868b = (C0868b) obj;
                AsyncUpdates asyncUpdates = c0868b.f10635h0;
                if (asyncUpdates == null) {
                    asyncUpdates = wk4.f66962a;
                }
                if (asyncUpdates == AsyncUpdates.ENABLED) {
                    c0868b.invalidateSelf();
                } else {
                    rf1 rf1Var = c0868b.f10604K;
                    if (rf1Var != null) {
                        rf1Var.mo17869q(c0868b.f10622b.m10473a());
                    }
                }
                break;
            case 5:
                yr5 yr5Var = (yr5) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yr5Var.f70335k.setAlpha((int) (255.0f * fFloatValue2));
                yr5Var.f70349y = fFloatValue2;
                break;
            default:
                StreakCircularProgressIndicator streakCircularProgressIndicator = (StreakCircularProgressIndicator) obj;
                int i3 = StreakCircularProgressIndicator.f14284l;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue3 = ((Float) animatedValue).floatValue();
                streakCircularProgressIndicator.f14294j = (int) fFloatValue3;
                streakCircularProgressIndicator.f14289e = (fFloatValue3 / streakCircularProgressIndicator.f14293i) * 360.0f;
                streakCircularProgressIndicator.invalidate();
                break;
        }
    }
}
