package p000;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class daa implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f10203a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ dab f10204b;

    public daa(dab dabVar, boolean z) {
        this.f10204b = dabVar;
        this.f10203a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10204b.f10219n = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ibf ibfVar = this.f10204b.f10211f;
        if (this.f10203a) {
            ibfVar.mo10993b();
        } else {
            ibfVar.mo10994c();
        }
    }
}
