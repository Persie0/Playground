package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1160k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1152g.d f7320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1152g f7323d;

    public C1160k(C1152g c1152g, C1152g.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7323d = c1152g;
        this.f7320a = dVar;
        this.f7321b = viewPropertyAnimator;
        this.f7322c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7321b.setListener(null);
        View view = this.f7322c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1152g.d dVar = this.f7320a;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = dVar.f7277a;
        C1152g c1152g = this.f7323d;
        c1152g.m4275d(abstractC1109b0);
        c1152g.f7270r.remove(dVar.f7277a);
        c1152g.m4482n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7320a.f7277a;
        this.f7323d.getClass();
    }
}
