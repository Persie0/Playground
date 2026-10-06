package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ius extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomUi f32245a;

    public ius(ZoomUi zoomUi) {
        this.f32245a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32245a.m4555c().setVisibility(4);
        this.f32245a.m4560h().setVisibility(4);
        this.f32245a.m4555c().setAlpha(1.0f);
        this.f32245a.m4560h().setAlpha(1.0f);
    }
}
