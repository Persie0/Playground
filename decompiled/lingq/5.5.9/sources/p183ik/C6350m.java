package p183ik;

import android.animation.Animator;
import android.animation.AnimatorSet;
import dm.C5207g;

/* JADX INFO: renamed from: ik.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6350m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnimatorSet f36680a;

    public C6350m(AnimatorSet animatorSet) {
        this.f36680a = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C5207g.m11111f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5207g.m11111f(animator, "animator");
        this.f36680a.start();
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
