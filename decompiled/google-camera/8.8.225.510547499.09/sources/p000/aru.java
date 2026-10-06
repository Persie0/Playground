package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aru extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    private final View f2209a;

    /* JADX INFO: renamed from: b */
    private boolean f2210b = false;

    public aru(View view) {
        this.f2209a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f2209a;
        int i = asu.f2264b;
        view.setTransitionAlpha(1.0f);
        if (this.f2210b) {
            this.f2209a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (afb.m436q(this.f2209a) && this.f2209a.getLayerType() == 0) {
            this.f2210b = true;
            this.f2209a.setLayerType(2, null);
        }
    }
}
