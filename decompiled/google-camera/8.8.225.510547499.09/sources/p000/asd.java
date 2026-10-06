package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asd extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ asf f2224a;

    public asd(asf asfVar) {
        this.f2224a = asfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2224a.m1946p();
        animator.removeListener(this);
    }
}
