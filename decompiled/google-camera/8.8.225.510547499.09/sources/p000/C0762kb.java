package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: kb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0762kb extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0829mo f35506a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f35507b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f35508c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f35509d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f35510e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C0766kf f35511f;

    public C0762kb(C0766kf c0766kf, C0829mo c0829mo, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f35511f = c0766kf;
        this.f35506a = c0829mo;
        this.f35507b = i;
        this.f35508c = view;
        this.f35509d = i2;
        this.f35510e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f35507b != 0) {
            this.f35508c.setTranslationX(0.0f);
        }
        if (this.f35509d != 0) {
            this.f35508c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f35510e.setListener(null);
        this.f35511f.m16076l(this.f35506a);
        this.f35511f.f35803e.remove(this.f35506a);
        this.f35511f.m14104a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
