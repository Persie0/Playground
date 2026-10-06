package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: hv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0251hv extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f29633a;

    public C0251hv(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f29633a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f29633a;
        actionBarOverlayLayout.f969i = null;
        actionBarOverlayLayout.f966f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f29633a;
        actionBarOverlayLayout.f969i = null;
        actionBarOverlayLayout.f966f = false;
    }
}
