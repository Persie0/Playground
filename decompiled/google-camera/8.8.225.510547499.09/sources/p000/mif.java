package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mif extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ min f40581a;

    public mif(min minVar) {
        this.f40581a = minVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        min minVar = this.f40581a;
        minVar.f40610A = 0;
        minVar.f40629v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f40581a.f40611B.m16443g(0, false);
        min minVar = this.f40581a;
        minVar.f40610A = 2;
        minVar.f40629v = animator;
    }
}
