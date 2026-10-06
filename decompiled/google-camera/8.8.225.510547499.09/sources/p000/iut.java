package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iut extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomUi f32246a;

    public iut(ZoomUi zoomUi) {
        this.f32246a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f32246a.m4572t().setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f32246a.m4572t().f7329a.get()) {
            this.f32246a.m4572t().m4529d(true);
        }
        this.f32246a.m4577y();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f32246a.m4572t().m4529d(false);
        this.f32246a.m4572t().setAlpha(0.0f);
        this.f32246a.m4572t().setVisibility(0);
    }
}
