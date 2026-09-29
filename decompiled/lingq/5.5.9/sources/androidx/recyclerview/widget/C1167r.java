package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1167r implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1165p.f f7453a;

    public C1167r(C1165p.f fVar) {
        this.f7453a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7453a.f7450m = valueAnimator.getAnimatedFraction();
    }
}
