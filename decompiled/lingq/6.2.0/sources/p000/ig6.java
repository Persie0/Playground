package p000;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class ig6 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f44089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg6 f44090b;

    public ig6(kg6 kg6Var, float f) {
        this.f44090b = kg6Var;
        this.f44089a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f44090b.m15180d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f44089a);
    }
}
