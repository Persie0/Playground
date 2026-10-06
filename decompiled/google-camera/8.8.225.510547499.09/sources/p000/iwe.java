package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwe extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    private final View f32462a;

    /* JADX INFO: renamed from: b */
    private boolean f32463b = false;

    public iwe(View view) {
        this.f32462a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f32463b) {
            this.f32463b = false;
            this.f32462a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f32462a.hasOverlappingRendering() && this.f32462a.getLayerType() == 0) {
            this.f32463b = true;
            this.f32462a.setLayerType(2, null);
        }
    }
}
