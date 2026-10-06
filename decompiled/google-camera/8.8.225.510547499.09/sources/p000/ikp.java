package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomLockView f31370a;

    public ikp(ZoomLockView zoomLockView) {
        this.f31370a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31370a.f7305c.setVisibility(0);
        this.f31370a.f7308f.setVisibility(0);
        this.f31370a.f7303a.setVisibility(0);
        super.onAnimationEnd(animator);
    }
}
