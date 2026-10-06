package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixi extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f32557a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f32558b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ixl f32559c;

    public ixi(ixl ixlVar, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32559c = ixlVar;
        this.f32557a = c0829mo;
        this.f32558b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32558b.setListener(null);
        this.f32559c.mo11845z(this.f32557a);
        this.f32559c.m16076l(this.f32557a);
        this.f32559c.f32582r.remove(this.f32557a);
        this.f32559c.m11857D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
