package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f32547a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f32548b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ixl f32549c;

    public ixf(ixl ixlVar, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32549c = ixlVar;
        this.f32547a = c0829mo;
        this.f32548b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f32549c.mo11844y(this.f32547a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32548b.setListener(null);
        this.f32549c.mo11844y(this.f32547a);
        this.f32549c.m16076l(this.f32547a);
        this.f32549c.f32579o.remove(this.f32547a);
        this.f32549c.m11857D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
