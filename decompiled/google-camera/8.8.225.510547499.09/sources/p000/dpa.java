package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpa extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dpc f12175a;

    public dpa(dpc dpcVar) {
        this.f12175a = dpcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12175a.f12180d.setVisibility(0);
    }
}
