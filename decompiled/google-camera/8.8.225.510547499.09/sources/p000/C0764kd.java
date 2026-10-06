package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0764kd extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0765ke f35621a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f35622b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f35623c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0766kf f35624d;

    public C0764kd(C0766kf c0766kf, C0765ke c0765ke, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f35624d = c0766kf;
        this.f35621a = c0765ke;
        this.f35622b = viewPropertyAnimator;
        this.f35623c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35622b.setListener(null);
        this.f35623c.setAlpha(1.0f);
        this.f35623c.setTranslationX(0.0f);
        this.f35623c.setTranslationY(0.0f);
        this.f35624d.m16076l(this.f35621a.f35707b);
        this.f35624d.f35805g.remove(this.f35621a.f35707b);
        this.f35624d.m14104a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C0829mo c0829mo = this.f35621a.f35707b;
    }
}
