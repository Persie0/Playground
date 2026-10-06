package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bml extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bnk f3791a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bmr f3792b;

    /* JADX INFO: renamed from: c */
    private boolean f3793c = false;

    public bml(bmr bmrVar, bnk bnkVar) {
        this.f3792b = bmrVar;
        this.f3791a = bnkVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m2733a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) == null || this.f3793c) {
            return;
        }
        this.f3793c = true;
        bmr bmrVar = this.f3792b;
        bmrVar.f3814l = this.f3791a;
        bmrVar.f3818p.mo2735a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m2733a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        bop.m2812a(bmt.f3831a, "Focusing failed with reason " + captureFailure.getReason());
        this.f3791a.mo2767a(false, this.f3792b.f3807e);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m2733a(captureResult);
    }
}
