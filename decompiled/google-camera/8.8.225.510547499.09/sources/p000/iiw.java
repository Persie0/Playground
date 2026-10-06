package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iiw extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FrontLensIndicatorOverlay f31156a;

    public iiw(FrontLensIndicatorOverlay frontLensIndicatorOverlay) {
        this.f31156a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f31156a;
        frontLensIndicatorOverlay.f7241q = 1;
        frontLensIndicatorOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f31156a;
        frontLensIndicatorOverlay.f7241q = 1;
        frontLensIndicatorOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f31156a.f7241q = 3;
    }
}
