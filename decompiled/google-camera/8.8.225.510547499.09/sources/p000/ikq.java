package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikq extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ZoomLockView f31371a;

    public ikq(ZoomLockView zoomLockView) {
        this.f31371a = zoomLockView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31371a.f7304b.bringToFront();
        this.f31371a.f7303a.bringToFront();
        super.onAnimationEnd(animator);
        AmbientModeSupport.AmbientController ambientController = this.f31371a.f7311i;
        if (ambientController != null) {
            ((ikt) ambientController.f1702a).m11409b(true);
        }
    }
}
