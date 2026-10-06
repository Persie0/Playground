package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iis extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iiu f31119a;

    public iis(iiu iiuVar) {
        this.f31119a = iiuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        iiu iiuVar = this.f31119a;
        iiuVar.f31142n = 4;
        iiuVar.f31132d = iiuVar.f31134f;
        iiuVar.f31133e = iiuVar.f31135g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31119a.f31142n = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        iiu iiuVar = this.f31119a;
        iiuVar.f31142n = 2;
        iiuVar.setVisibility(0);
    }
}
