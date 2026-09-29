package p000;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class bqa extends aqa implements Choreographer.FrameCallback {
    @Override // p000.aqa
    /* JADX INFO: renamed from: b */
    public final void mo2993b() {
        long refreshRate;
        this.f7371b.registerDisplayListener(this, uma.m22816k(null));
        this.f7370a.postFrameCallback(this);
        Display display = this.f7371b.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            ss5.m21707d0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f7373d = refreshRate;
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: c */
    public final void mo2994c() {
        this.f7371b.unregisterDisplayListener(this);
        this.f7370a.removeFrameCallback(this);
        this.f7372c = -9223372036854775807L;
        this.f7373d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f7372c = j;
        this.f7370a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.f7370a.postFrameCallback(this);
            Display display = this.f7371b.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                ss5.m21707d0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f7373d = refreshRate;
        }
    }
}
