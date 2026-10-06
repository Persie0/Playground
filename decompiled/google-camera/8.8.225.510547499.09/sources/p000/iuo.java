package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iuo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomUi f32241a;

    public iuo(ZoomUi zoomUi) {
        this.f32241a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f32241a.m4555c().setAlpha(1.0f);
        this.f32241a.m4560h().setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32241a.m4576x();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f32241a.m4555c().setAlpha(0.0f);
        this.f32241a.m4560h().setAlpha(0.0f);
        if (this.f32241a.m4559g().getVisibility() != 8) {
            this.f32241a.m4555c().setVisibility(0);
            this.f32241a.m4560h().setVisibility(0);
        }
    }
}
