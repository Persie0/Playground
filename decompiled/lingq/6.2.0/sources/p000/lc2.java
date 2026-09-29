package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class lc2 extends AbstractC3184kh {
    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: H */
    public final void mo11327H(Object obj, float f) {
        mc2 mc2Var = (mc2) obj;
        mc2Var.f51060K.f8672b = f / 10000.0f;
        mc2Var.invalidateSelf();
        int i = (int) f;
        x90 x90Var = mc2Var.f69974b;
        if (x90Var.m24412b(true)) {
            Context context = mc2Var.f69973a;
            if (mc2Var.f51064O == null) {
                int i2 = R$attr.motionEasingStandardInterpolator;
                LinearInterpolator linearInterpolator = AbstractC0853cn.f10296a;
                mc2Var.f51066Q = r46.m20365H(context, i2, linearInterpolator);
                mc2Var.f51067R = r46.m20365H(context, R$attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                ValueAnimator valueAnimator = new ValueAnimator();
                mc2Var.f51064O = valueAnimator;
                valueAnimator.setDuration(500L);
                mc2Var.f51064O.setFloatValues(0.0f, 1.0f);
                mc2Var.f51064O.setInterpolator(null);
                mc2Var.f51064O.addUpdateListener(new ba0(mc2Var, 2));
            }
            float f2 = i;
            float f3 = (f2 < x90Var.f67958o * 10000.0f || f2 > x90Var.f67959p * 10000.0f) ? 0.0f : 1.0f;
            float f4 = mc2Var.f51061L;
            ValueAnimator valueAnimator2 = mc2Var.f51064O;
            if (f3 == f4) {
                if (valueAnimator2.isRunning()) {
                    return;
                }
                mc2Var.f51060K.f8675e = f3;
                mc2Var.invalidateSelf();
                return;
            }
            if (valueAnimator2.isRunning()) {
                mc2Var.f51064O.cancel();
            }
            mc2Var.f51061L = f3;
            if (f3 == 1.0f) {
                mc2Var.f51065P = mc2Var.f51066Q;
                mc2Var.f51064O.start();
            } else {
                mc2Var.f51065P = mc2Var.f51067R;
                mc2Var.f51064O.reverse();
            }
        }
    }

    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: u */
    public final float mo11328u(Object obj) {
        return ((mc2) obj).f51060K.f8672b * 10000.0f;
    }
}
