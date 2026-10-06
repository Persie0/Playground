package p000;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kll {

    /* JADX INFO: renamed from: a */
    private final CaptureFailure f36477a;

    public kll(CaptureFailure captureFailure) {
        this.f36477a = captureFailure;
    }

    /* JADX INFO: renamed from: a */
    public final int m14499a() {
        return this.f36477a.getReason();
    }

    /* JADX INFO: renamed from: b */
    public final long m14500b() {
        return this.f36477a.getFrameNumber();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14501c() {
        return this.f36477a.wasImageCaptured();
    }

    public final String toString() {
        return "frame number=" + m14500b() + ", reason=" + m14499a() + ", wasImageCaptured=" + m14501c() + ", sequenceId=" + this.f36477a.getSequenceId();
    }
}
