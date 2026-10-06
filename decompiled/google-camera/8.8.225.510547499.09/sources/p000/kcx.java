package p000;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kcx extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kcz f35603a;

    public kcx(kcz kczVar) {
        this.f35603a = kczVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f35603a.f35607a.equals(str)) {
            synchronized (this.f35603a.f35614h) {
                this.f35603a.f35614h.notify();
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
    }
}
