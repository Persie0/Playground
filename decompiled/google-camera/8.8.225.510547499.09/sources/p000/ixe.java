package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ixe extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f32544a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f32545b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ixl f32546c;

    public ixe(ixl ixlVar, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32546c = ixlVar;
        this.f32544a = c0829mo;
        this.f32545b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32545b.setListener(null);
        this.f32546c.mo11834C(this.f32544a);
        this.f32546c.m16076l(this.f32544a);
        this.f32546c.f32581q.remove(this.f32544a);
        this.f32546c.m11857D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
