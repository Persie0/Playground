package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klq extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    private final kph f36486a;

    public klq(kph kphVar) {
        this.f36486a = kphVar;
    }

    /* JADX INFO: renamed from: a */
    private static final kpi m14504a(CameraCaptureSession cameraCaptureSession) {
        return cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? new klj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession) : new kli(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        kph kphVar = this.f36486a;
        m14504a(cameraCaptureSession);
        kphVar.mo14390i();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f36486a.mo14385d(m14504a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f36486a.mo14386e(m14504a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f36486a.mo14387f(m14504a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        kph kphVar = this.f36486a;
        m14504a(cameraCaptureSession);
        kphVar.mo14391j();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        kph kphVar = this.f36486a;
        m14504a(cameraCaptureSession);
        kphVar.mo14392k(surface);
    }
}
