package ad;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: ad.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0058b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0057a f108b;

    public C0058b(AbstractC0057a abstractC0057a, float f3) {
        this.f108b = abstractC0057a;
        this.f107a = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f108b.m231b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f107a);
    }
}
