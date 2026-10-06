package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mie extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ min f40579a;

    /* JADX INFO: renamed from: b */
    private boolean f40580b;

    public mie(min minVar) {
        this.f40579a = minVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f40580b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        min minVar = this.f40579a;
        minVar.f40610A = 0;
        minVar.f40629v = null;
        if (this.f40580b) {
            return;
        }
        minVar.f40611B.m16443g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40579a.f40611B.m16443g(0, false);
        min minVar = this.f40579a;
        minVar.f40610A = 1;
        minVar.f40629v = animator;
        this.f40580b = false;
    }
}
