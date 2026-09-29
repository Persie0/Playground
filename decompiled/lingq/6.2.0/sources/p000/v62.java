package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class v62 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o38 f64911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f64912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f64913c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ a72 f64914d;

    public v62(a72 a72Var, o38 o38Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f64914d = a72Var;
        this.f64911a = o38Var;
        this.f64912b = view;
        this.f64913c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f64912b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f64913c.setListener(null);
        a72 a72Var = this.f64914d;
        o38 o38Var = this.f64911a;
        a72Var.m23068c(o38Var);
        a72Var.f314o.remove(o38Var);
        a72Var.m155i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f64914d.getClass();
    }
}
