package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1156i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f7297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f7298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f7299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1152g f7300d;

    public C1156i(View view, ViewPropertyAnimator viewPropertyAnimator, C1152g c1152g, RecyclerView.AbstractC1109b0 abstractC1109b0) {
        this.f7300d = c1152g;
        this.f7297a = abstractC1109b0;
        this.f7298b = view;
        this.f7299c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7298b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7299c.setListener(null);
        C1152g c1152g = this.f7300d;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7297a;
        c1152g.m4275d(abstractC1109b0);
        c1152g.f7267o.remove(abstractC1109b0);
        c1152g.m4482n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7300d.getClass();
    }
}
