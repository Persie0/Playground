package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.cuttlefish.CountdownSliderUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxm extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    boolean f29821a = false;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f29822b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ CountdownSliderUi f29823c;

    public hxm(CountdownSliderUi countdownSliderUi, boolean z) {
        this.f29823c = countdownSliderUi;
        this.f29822b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f29821a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f29821a && !this.f29822b) {
            this.f29823c.setVisibility(4);
        }
        this.f29823c.m4350j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f29822b) {
            this.f29823c.setVisibility(0);
        }
    }
}
