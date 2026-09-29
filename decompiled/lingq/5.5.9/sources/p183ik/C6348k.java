package p183ik;

import android.animation.Animator;
import android.animation.AnimatorSet;
import dm.C5207g;

/* JADX INFO: renamed from: ik.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6348k implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnimatorSet f36676a;

    public C6348k(AnimatorSet animatorSet) {
        this.f36676a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5207g.m11111f(animator, "animator");
        this.f36676a.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }
}
