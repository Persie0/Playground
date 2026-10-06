package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mim extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    private boolean f40595a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ min f40596b;

    /* JADX INFO: renamed from: c */
    private float f40597c;

    /* JADX INFO: renamed from: d */
    private float f40598d;

    public mim(min minVar) {
        this.f40596b = minVar;
    }

    /* JADX INFO: renamed from: a */
    protected abstract float mo16400a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40596b.m16412k((int) this.f40598d);
        this.f40595a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f40595a) {
            mkx mkxVar = this.f40596b.f40620m;
            this.f40597c = mkxVar == null ? 0.0f : mkxVar.m16572a();
            this.f40598d = mo16400a();
            this.f40595a = true;
        }
        min minVar = this.f40596b;
        float f = this.f40597c;
        minVar.m16412k((int) (f + ((this.f40598d - f) * valueAnimator.getAnimatedFraction())));
    }
}
