package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ito extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ itx f32152a;

    public ito(itx itxVar) {
        this.f32152a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32152a.f32207s.m4556d().setEnabled(false);
        this.f32152a.f32207s.m4577y();
        this.f32152a.f32207s.m4556d().setVisibility(8);
    }
}
