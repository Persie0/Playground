package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ifu extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ign f30690a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ iga f30691b;

    public ifu(iga igaVar, ign ignVar) {
        this.f30691b = igaVar;
        this.f30690a = ignVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30691b.f30701b.setVideoButtonAnimating(false);
        this.f30691b.f30701b.inFlightSpecBuilder.m11265b(this.f30690a.f30838p);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f30691b.f30701b.setVideoButtonAnimating(true);
    }
}
