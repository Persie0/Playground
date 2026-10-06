package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iur extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomUi f32244a;

    public iur(ZoomUi zoomUi) {
        this.f32244a = zoomUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f32244a.m4559g().setVisibility(0);
        this.f32244a.m4559g().setBackground(this.f32244a.getResources().getDrawable(C0100R.drawable.bg_zoom_seekbar_dark, null));
        animator.removeAllListeners();
    }
}
