package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.views.CaptureAnimationOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iip extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CaptureAnimationOverlay f31115a;

    public iip(CaptureAnimationOverlay captureAnimationOverlay) {
        this.f31115a = captureAnimationOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.f31115a;
        captureAnimationOverlay.f7194c = 1;
        captureAnimationOverlay.setVisibility(4);
    }
}
