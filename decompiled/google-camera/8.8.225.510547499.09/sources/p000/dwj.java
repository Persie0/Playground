package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FocusIndicatorAccessoryView f12764a;

    public dwj(FocusIndicatorAccessoryView focusIndicatorAccessoryView) {
        this.f12764a = focusIndicatorAccessoryView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12764a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12764a.setVisibility(8);
    }
}
