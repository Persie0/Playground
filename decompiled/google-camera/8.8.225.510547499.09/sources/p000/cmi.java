package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.autotimer.p006ui.AutoTimerIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmi extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AutoTimerIndicatorView f6223a;

    public cmi(AutoTimerIndicatorView autoTimerIndicatorView) {
        this.f6223a = autoTimerIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6223a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6223a.setVisibility(0);
        this.f6223a.m4039a(0.0f);
    }
}
