package p000;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmo extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bmr f3798a;

    public bmo(bmr bmrVar) {
        this.f3798a = bmrVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        bnr bnrVar = this.f3798a.f3813k;
        if (bnrVar != null) {
            bnrVar.mo2777a();
            this.f3798a.f3813k = null;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        bop.m2812a(bmt.f3831a, "Failed to configure the camera for capture");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        bmr bmrVar = this.f3798a;
        bmrVar.f3811i = cameraCaptureSession;
        bmrVar.m2739a(8);
    }
}
