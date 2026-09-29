package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1161l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1152g.d f7324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7326c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1152g f7327d;

    public C1161l(C1152g c1152g, C1152g.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7327d = c1152g;
        this.f7324a = dVar;
        this.f7325b = viewPropertyAnimator;
        this.f7326c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7325b.setListener(null);
        View view = this.f7326c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1152g.d dVar = this.f7324a;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = dVar.f7278b;
        C1152g c1152g = this.f7327d;
        c1152g.m4275d(abstractC1109b0);
        c1152g.f7270r.remove(dVar.f7278b);
        c1152g.m4482n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7324a.f7278b;
        this.f7327d.getClass();
    }
}
