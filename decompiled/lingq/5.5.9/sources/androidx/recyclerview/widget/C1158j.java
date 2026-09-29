package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1158j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f7308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7310c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7311d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f7312e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1152g f7313f;

    public C1158j(C1152g c1152g, RecyclerView.AbstractC1109b0 abstractC1109b0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7313f = c1152g;
        this.f7308a = abstractC1109b0;
        this.f7309b = i10;
        this.f7310c = view;
        this.f7311d = i11;
        this.f7312e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f7309b;
        View view = this.f7310c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7311d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7312e.setListener(null);
        C1152g c1152g = this.f7313f;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f7308a;
        c1152g.m4275d(abstractC1109b0);
        c1152g.f7268p.remove(abstractC1109b0);
        c1152g.m4482n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7313f.getClass();
    }
}
