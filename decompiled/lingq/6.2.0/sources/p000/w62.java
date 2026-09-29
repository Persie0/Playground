package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class w62 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o38 f66446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f66448c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f66449d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f66450e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ a72 f66451f;

    public w62(a72 a72Var, o38 o38Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f66451f = a72Var;
        this.f66446a = o38Var;
        this.f66447b = i;
        this.f66448c = view;
        this.f66449d = i2;
        this.f66450e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f66447b;
        View view = this.f66448c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f66449d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f66450e.setListener(null);
        a72 a72Var = this.f66451f;
        o38 o38Var = this.f66446a;
        a72Var.m23068c(o38Var);
        a72Var.f315p.remove(o38Var);
        a72Var.m155i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f66451f.getClass();
    }
}
