package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikr extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomLockView f31372a;

    public ikr(ZoomLockView zoomLockView) {
        this.f31372a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31372a.setVisibility(8);
        this.f31372a.f7308f.setTranslationX(0.0f);
        this.f31372a.f7308f.setTranslationY(0.0f);
        this.f31372a.f7303a.setTranslationY(0.0f);
        this.f31372a.f7303a.setTranslationX(0.0f);
        this.f31372a.f7304b.setScaleX(0.0f);
        this.f31372a.f7304b.setScaleY(0.0f);
        this.f31372a.f7304b.setTranslationX(0.0f);
        this.f31372a.f7304b.setTranslationY(0.0f);
        ZoomLockView zoomLockView = this.f31372a;
        zoomLockView.f7309g = false;
        zoomLockView.setAlpha(1.0f);
        super.onAnimationEnd(animator);
    }
}
