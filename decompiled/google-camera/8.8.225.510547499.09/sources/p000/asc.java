package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1109wy f2222a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ asf f2223b;

    public asc(asf asfVar, C1109wy c1109wy) {
        this.f2223b = asfVar;
        this.f2222a = c1109wy;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2222a.remove(animator);
        this.f2223b.f2236i.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2223b.f2236i.add(animator);
    }
}
