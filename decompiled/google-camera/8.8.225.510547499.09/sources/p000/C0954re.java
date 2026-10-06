package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: renamed from: re */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0954re {

    /* JADX INFO: renamed from: a */
    private final CameraDevice.StateCallback f47536a;

    /* JADX INFO: renamed from: b */
    private final CameraCaptureSession.StateCallback f47537b;

    public C0954re() {
        this(null);
    }

    public /* synthetic */ C0954re(byte[] bArr) {
        this.f47536a = null;
        this.f47537b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954re)) {
            return false;
        }
        C0954re c0954re = (C0954re) obj;
        CameraDevice.StateCallback stateCallback = c0954re.f47536a;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        CameraCaptureSession.StateCallback stateCallback2 = c0954re.f47537b;
        return ooc.m18737c(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + ((Object) null) + ", cameraSessionStateCallback=" + ((Object) null) + ')';
    }
}
