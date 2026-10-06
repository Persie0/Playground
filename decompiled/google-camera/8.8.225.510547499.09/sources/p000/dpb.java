package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dpc f12176a;

    public dpb(dpc dpcVar) {
        this.f12176a = dpcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12176a.f12180d.setVisibility(8);
    }
}
