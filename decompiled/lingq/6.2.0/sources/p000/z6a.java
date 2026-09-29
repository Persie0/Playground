package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public final class z6a implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnimatorSet f70994b;

    public /* synthetic */ z6a(AnimatorSet animatorSet, int i) {
        this.f70993a = i;
        this.f70994b = animatorSet;
    }

    /* JADX INFO: renamed from: a */
    private final void m25472a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m25473b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m25474c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m25475d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m25476e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m25477f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f70993a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f70993a;
        AnimatorSet animatorSet = this.f70994b;
        switch (i) {
            case 0:
                animatorSet.start();
                break;
            default:
                animatorSet.start();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f70993a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f70993a;
    }
}
