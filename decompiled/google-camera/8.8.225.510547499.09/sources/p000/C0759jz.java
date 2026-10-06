package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: jz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0759jz extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f35210a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f35211b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f35212c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0766kf f35213d;

    public C0759jz(C0766kf c0766kf, C0829mo c0829mo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f35213d = c0766kf;
        this.f35210a = c0829mo;
        this.f35211b = viewPropertyAnimator;
        this.f35212c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35211b.setListener(null);
        this.f35212c.setAlpha(1.0f);
        this.f35213d.m16076l(this.f35210a);
        this.f35213d.f35804f.remove(this.f35210a);
        this.f35213d.m14104a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
