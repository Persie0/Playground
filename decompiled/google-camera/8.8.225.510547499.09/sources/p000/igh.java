package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igh extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShutterButtonProgressOverlay f30742a;

    public igh(ShutterButtonProgressOverlay shutterButtonProgressOverlay) {
        this.f30742a = shutterButtonProgressOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30742a;
        shutterButtonProgressOverlay.f7182k = 4;
        shutterButtonProgressOverlay.f7173b = shutterButtonProgressOverlay.f7176e;
        shutterButtonProgressOverlay.f7174c = shutterButtonProgressOverlay.f7177f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30742a.f7182k = 4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30742a;
        shutterButtonProgressOverlay.f7182k = 2;
        shutterButtonProgressOverlay.setVisibility(0);
    }
}
