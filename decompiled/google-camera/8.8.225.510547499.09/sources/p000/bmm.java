package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmm extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bms f3794a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bmr f3795b;

    /* JADX INFO: renamed from: c */
    private boolean f3796c = false;

    public bmm(bmr bmrVar, bms bmsVar) {
        this.f3795b = bmrVar;
        this.f3794a = bmsVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m2734a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) == null || this.f3796c) {
            return;
        }
        this.f3796c = true;
        bmr bmrVar = this.f3795b;
        bmrVar.f3815m = this.f3794a;
        bmrVar.f3818p.mo2735a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m2734a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        bop.m2812a(bmt.f3831a, "Autoexposure and capture failed with reason " + captureFailure.getReason());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m2734a(captureResult);
    }
}
