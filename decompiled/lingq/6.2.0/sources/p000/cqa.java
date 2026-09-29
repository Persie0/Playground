package p000;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class cqa extends aqa implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: e */
    public final Handler f34393e;

    public cqa(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f34393e = uma.m22816k(null);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: b */
    public final void mo2993b() {
        this.f7371b.registerDisplayListener(this, uma.m22816k(null));
        this.f7370a.postVsyncCallback(this);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: c */
    public final void mo2994c() {
        this.f7371b.unregisterDisplayListener(this);
        this.f34393e.removeCallbacksAndMessages(null);
        this.f7370a.removeVsyncCallback(this);
        this.f7372c = -9223372036854775807L;
        this.f7373d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f7370a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f7372c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f7373d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f7373d = -9223372036854775807L;
        }
        this.f34393e.postDelayed(new mt6(this, 15), 500L);
    }
}
