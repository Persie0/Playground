package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mkh f40824a;

    public mkf(mkh mkhVar) {
        this.f40824a = mkhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40824a.mo16459a();
        mkh mkhVar = this.f40824a;
        atc atcVar = mkhVar.f40833h;
        if (atcVar != null) {
            atcVar.mo1979b(mkhVar.f40790j);
        }
    }
}
