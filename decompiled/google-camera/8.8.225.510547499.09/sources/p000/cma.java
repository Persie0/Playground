package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cma extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cmc f6198a;

    public cma(cmc cmcVar) {
        this.f6198a = cmcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6198a.f6206g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6198a.setVisibility(0);
        this.f6198a.f6200a.setAlpha(0.0f);
        this.f6198a.f6201b.setAlpha(0.0f);
    }
}
