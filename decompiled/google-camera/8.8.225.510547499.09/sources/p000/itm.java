package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class itm extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ itx f32150a;

    public itm(itx itxVar) {
        this.f32150a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32150a.f32208t.setVisibility(8);
    }
}
