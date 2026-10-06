package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igi extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShutterButtonProgressOverlay f30743a;

    public igi(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.f30743a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30743a;
        shutterButtonProgressOverlay.f7182k = 1;
        shutterButtonProgressOverlay.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30743a;
        shutterButtonProgressOverlay.f7182k = 1;
        shutterButtonProgressOverlay.setVisibility(4);
        this.f30743a.f7178g = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30743a;
        shutterButtonProgressOverlay.f7173b = shutterButtonProgressOverlay.f7176e;
        shutterButtonProgressOverlay.f7182k = 3;
    }
}
