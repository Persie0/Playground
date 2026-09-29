package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1154h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f7289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7291c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1152g f7292d;

    public C1154h(View view, ViewPropertyAnimator viewPropertyAnimator, C1152g c1152g, RecyclerView.AbstractC1109b0 abstractC1109b0) {
        this.f7292d = c1152g;
        this.f7289a = abstractC1109b0;
        this.f7290b = viewPropertyAnimator;
        this.f7291c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7290b.setListener(null);
        this.f7291c.setAlpha(1.0f);
        C1152g c1152g = this.f7292d;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7289a;
        c1152g.m4275d(abstractC1109b0);
        c1152g.f7269q.remove(abstractC1109b0);
        c1152g.m4482n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7292d.getClass();
    }
}
