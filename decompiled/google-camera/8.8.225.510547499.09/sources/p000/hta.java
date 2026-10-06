package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.captureframe.CaptureFrameUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hta extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CaptureFrameUi f29483a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ htb f29484b;

    public hta(htb htbVar, CaptureFrameUi captureFrameUi) {
        this.f29484b = htbVar;
        this.f29483a = captureFrameUi;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        synchronized (this.f29484b.f29485a) {
            if (((htd) this.f29484b.f29488d).equals(htd.HIDDEN)) {
                this.f29483a.setVisibility(8);
            }
            htb htbVar = this.f29484b;
            htbVar.f29487c = htbVar.f29488d;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        synchronized (this.f29484b.f29485a) {
            if (!((htd) this.f29484b.f29488d).equals(htd.HIDDEN)) {
                this.f29483a.setVisibility(0);
            }
        }
    }
}
