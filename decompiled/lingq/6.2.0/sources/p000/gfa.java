package p000;

import android.animation.Animator;

/* JADX INFO: loaded from: classes3.dex */
public final class gfa implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f40752b;

    public /* synthetic */ gfa(int i, ui3 ui3Var) {
        this.f40751a = i;
        this.f40752b = ui3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f40751a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f40751a;
        ui3 ui3Var = this.f40752b;
        animator.getClass();
        switch (i) {
            case 0:
                ui3Var.mo0a();
                break;
            default:
                ui3Var.mo0a();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f40751a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f40751a;
        animator.getClass();
    }
}
