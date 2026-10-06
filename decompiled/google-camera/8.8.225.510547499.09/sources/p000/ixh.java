package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixh extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f32553a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f32554b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f32555c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ixl f32556d;

    public ixh(ixl ixlVar, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f32556d = ixlVar;
        this.f32553a = c0829mo;
        this.f32554b = viewPropertyAnimator;
        this.f32555c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32554b.setListener(null);
        this.f32555c.setTranslationX(0.0f);
        this.f32555c.setTranslationY(0.0f);
        this.f32556d.mo11832A(this.f32553a);
        this.f32556d.m16076l(this.f32553a);
        this.f32556d.f32582r.remove(this.f32553a);
        this.f32556d.m11857D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
