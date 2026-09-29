package p000;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class gg0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40756b;

    public /* synthetic */ gg0(Object obj, int i) {
        this.f40755a = i;
        this.f40756b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f40755a;
        Object obj = this.f40756b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fs5 fs5Var = ((BottomSheetBehavior) obj).f12728j;
                if (fs5Var != null) {
                    fs5Var.m12077u(fFloatValue);
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                uz2 uz2Var = (uz2) obj;
                uz2Var.f64566c.setAlpha(iFloatValue);
                uz2Var.f64567d.setAlpha(iFloatValue);
                uz2Var.f64582s.invalidate();
                break;
            case 2:
                ((va4) obj).f65134m = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                ((f69) obj).invalidateSelf();
                break;
            case 4:
                ((TextInputLayout) obj).f13266R0.m4326m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
