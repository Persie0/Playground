package p000;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kci extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    private final kct f35567a;

    /* JADX INFO: renamed from: b */
    private final String f35568b;

    public kci(kct kctVar, String str) {
        this.f35567a = kctVar;
        this.f35568b = str;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        lku.m15669w(cameraDevice.getId().equals(this.f35568b));
        this.f35567a.mo13971a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        lku.m15669w(cameraDevice.getId().equals(this.f35568b));
        this.f35567a.mo13972b();
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        lku.m15669w(cameraDevice.getId().equals(this.f35568b));
        kct kctVar = this.f35567a;
        kcl kclVar = (kcl) kcl.f35594t.get(Integer.valueOf(i));
        if (kclVar == null) {
            throw new IllegalStateException("Unknown Camera Device error code");
        }
        kctVar.mo13973c(kclVar);
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        lku.m15669w(cameraDevice.getId().equals(this.f35568b));
        this.f35567a.mo13974d(new klk(cameraDevice));
    }
}
