package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iit extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iiu f31120a;

    public iit(iiu iiuVar) {
        this.f31120a = iiuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        iiu iiuVar = this.f31120a;
        iiuVar.f31142n = 1;
        iiuVar.setVisibility(4);
        this.f31120a.f31136h = -1L;
        this.f31120a.f31137i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        iiu iiuVar = this.f31120a;
        iiuVar.f31142n = 1;
        iiuVar.setVisibility(4);
        this.f31120a.f31136h = -1L;
        this.f31120a.f31137i = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        iiu iiuVar = this.f31120a;
        iiuVar.f31132d = iiuVar.f31134f;
        iiuVar.f31142n = 3;
    }
}
