package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hhp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hhr f27823a;

    public hhp(hhr hhrVar) {
        this.f27823a = hhrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27823a.f27845q = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27823a.m10312k();
    }
}
