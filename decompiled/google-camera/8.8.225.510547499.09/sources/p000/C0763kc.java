package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: kc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0763kc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0765ke f35549a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f35550b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f35551c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0766kf f35552d;

    public C0763kc(C0766kf c0766kf, C0765ke c0765ke, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f35552d = c0766kf;
        this.f35549a = c0765ke;
        this.f35550b = viewPropertyAnimator;
        this.f35551c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35550b.setListener(null);
        this.f35551c.setAlpha(1.0f);
        this.f35551c.setTranslationX(0.0f);
        this.f35551c.setTranslationY(0.0f);
        this.f35552d.m16076l(this.f35549a.f35706a);
        this.f35552d.f35805g.remove(this.f35549a.f35706a);
        this.f35552d.m14104a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C0829mo c0829mo = this.f35549a.f35706a;
    }
}
