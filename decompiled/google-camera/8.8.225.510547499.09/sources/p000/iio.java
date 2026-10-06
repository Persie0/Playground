package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.p014ui.views.CaptureAnimationOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iio extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ValueAnimator f31113a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CaptureAnimationOverlay f31114b;

    public iio(CaptureAnimationOverlay captureAnimationOverlay, ValueAnimator valueAnimator) {
        this.f31114b = captureAnimationOverlay;
        this.f31113a = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31113a.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.f31114b;
        captureAnimationOverlay.f7194c = 2;
        captureAnimationOverlay.setVisibility(0);
    }
}
