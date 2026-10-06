package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class isx extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ite f32040a;

    public isx(ite iteVar) {
        this.f32040a = iteVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32040a.f32052C.mo3415bf(gee.f24361a);
        animator.removeListener(this.f32040a.f32082af);
    }
}
