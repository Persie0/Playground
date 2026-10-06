package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mke extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mkh f40823a;

    public mke(mkh mkhVar) {
        this.f40823a = mkhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        mkh mkhVar = this.f40823a;
        mkhVar.f40830e = (mkhVar.f40830e + 1) % mkhVar.f40829d.f40743c.length;
        mkhVar.f40831f = true;
    }
}
