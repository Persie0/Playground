package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iiv extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FrontLensIndicatorOverlay f31155a;

    public iiv(FrontLensIndicatorOverlay frontLensIndicatorOverlay) {
        this.f31155a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f31155a;
        frontLensIndicatorOverlay.f7241q = 4;
        frontLensIndicatorOverlay.f7239o = frontLensIndicatorOverlay.f7234j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator = this.f31155a.f7226b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f31155a;
            frontLensIndicatorOverlay.f7241q = 4;
            ValueAnimator valueAnimator2 = frontLensIndicatorOverlay.f7226b;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                frontLensIndicatorOverlay.f7226b.cancel();
            }
            frontLensIndicatorOverlay.f7226b = ValueAnimator.ofInt(0, 360);
            frontLensIndicatorOverlay.f7226b.setDuration(400L);
            frontLensIndicatorOverlay.f7226b.setInterpolator(frontLensIndicatorOverlay.f7231g);
            frontLensIndicatorOverlay.f7226b.addUpdateListener(new ibw(frontLensIndicatorOverlay, 18));
            frontLensIndicatorOverlay.f7226b.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f31155a;
        frontLensIndicatorOverlay.f7241q = 2;
        frontLensIndicatorOverlay.setVisibility(0);
        this.f31155a.f7229e.setAlpha(255);
    }
}
