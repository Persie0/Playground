package p000;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class m21 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o21 f50445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p21 f50446b;

    public m21(p21 p21Var, o21 o21Var) {
        this.f50446b = p21Var;
        this.f50445a = o21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o21 o21Var = this.f50445a;
        p21.m18858d(fFloatValue, o21Var);
        p21 p21Var = this.f50446b;
        p21Var.m18859a(fFloatValue, o21Var, false);
        p21Var.invalidateSelf();
    }
}
