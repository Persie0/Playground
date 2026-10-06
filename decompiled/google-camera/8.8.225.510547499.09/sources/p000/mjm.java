package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjm extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mjp f40752a;

    public mjm(mjp mjpVar) {
        this.f40752a = mjpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40752a.mo16459a();
        mjp mjpVar = this.f40752a;
        atc atcVar = mjpVar.f40763i;
        if (atcVar != null) {
            atcVar.mo1979b(mjpVar.f40790j);
        }
    }
}
