package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: pb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C0897pb implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    private boolean f47306a;

    /* JADX INFO: renamed from: a */
    public void mo19286a() {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f47306a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f47306a) {
            return;
        }
        mo19286a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f47306a = false;
    }
}
