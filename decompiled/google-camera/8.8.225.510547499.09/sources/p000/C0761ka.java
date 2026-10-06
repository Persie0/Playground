package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: ka */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0761ka extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f35435a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ View f35436b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f35437c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0766kf f35438d;

    public C0761ka(C0766kf c0766kf, C0829mo c0829mo, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f35438d = c0766kf;
        this.f35435a = c0829mo;
        this.f35436b = view;
        this.f35437c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f35436b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35437c.setListener(null);
        this.f35438d.m16076l(this.f35435a);
        this.f35438d.f35802d.remove(this.f35435a);
        this.f35438d.m14104a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
