package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwi extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FocusIndicatorAccessoryView f12763a;

    public dwi(FocusIndicatorAccessoryView focusIndicatorAccessoryView) {
        this.f12763a = focusIndicatorAccessoryView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12763a.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12763a.setVisibility(0);
    }
}
