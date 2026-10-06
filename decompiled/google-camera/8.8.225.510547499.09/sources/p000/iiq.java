package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.views.CaptureAnimationOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iiq extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f31116a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CaptureAnimationOverlay f31117b;

    public iiq(CaptureAnimationOverlay captureAnimationOverlay, boolean z) {
        this.f31117b = captureAnimationOverlay;
        this.f31116a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f31116a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.f31117b;
        captureAnimationOverlay.f7194c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f31116a) {
            return;
        }
        CaptureAnimationOverlay captureAnimationOverlay = this.f31117b;
        captureAnimationOverlay.f7194c = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f31116a) {
            CaptureAnimationOverlay captureAnimationOverlay = this.f31117b;
            captureAnimationOverlay.f7194c = 3;
            captureAnimationOverlay.setVisibility(0);
        }
    }
}
