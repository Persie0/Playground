package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cmb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cmc f6199a;

    public cmb(cmc cmcVar) {
        this.f6199a = cmcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6199a.setVisibility(8);
        this.f6199a.f6206g = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6199a.setVisibility(0);
        this.f6199a.f6200a.setAlpha(1.0f);
        this.f6199a.f6201b.setAlpha(1.0f);
    }
}
