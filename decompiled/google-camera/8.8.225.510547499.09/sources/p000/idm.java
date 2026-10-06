package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class idm extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ idn f30473a;

    public idm(idn idnVar) {
        this.f30473a = idnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30473a.f30474a.setForeground(null);
    }
}
