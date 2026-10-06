package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f32550a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f32551b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ixl f32552c;

    public ixg(ixl ixlVar, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32552c = ixlVar;
        this.f32550a = c0829mo;
        this.f32551b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f32552c.mo11833B(this.f32550a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32551b.setListener(null);
        this.f32552c.mo11833B(this.f32550a);
        this.f32552c.m16076l(this.f32550a);
        this.f32552c.f32580p.remove(this.f32550a);
        this.f32552c.m11857D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
