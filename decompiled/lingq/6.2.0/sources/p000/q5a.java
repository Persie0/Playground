package p000;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class q5a implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f57303b;

    public /* synthetic */ q5a(View view, int i) {
        this.f57302a = i;
        this.f57303b = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f57302a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f57302a;
        View view = this.f57303b;
        animator.getClass();
        switch (i) {
            case 0:
                ((t6a) view).clearAnimation();
                break;
            default:
                ((d7a) view).clearAnimation();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f57302a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f57302a;
        animator.getClass();
    }
}
