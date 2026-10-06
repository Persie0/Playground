package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmp extends bmq {

    /* JADX INFO: renamed from: a */
    public int f3799a = -1;

    /* JADX INFO: renamed from: b */
    public long f3800b = -1;

    /* JADX INFO: renamed from: c */
    public long f3801c = -1;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ bmr f3802d;

    public bmp(bmr bmrVar) {
        this.f3802d = bmrVar;
    }

    @Override // p000.bmq
    /* JADX INFO: renamed from: a */
    public final void mo2735a(CaptureResult captureResult) {
        bnl bnlVar;
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null) {
            int iIntValue = num.intValue();
            if (captureResult.getFrameNumber() > this.f3800b) {
                int i = this.f3799a;
                this.f3799a = iIntValue;
                this.f3800b = captureResult.getFrameNumber();
                switch (iIntValue) {
                    case 1:
                    case 2:
                    case 6:
                        if (iIntValue != i && (bnlVar = this.f3802d.f3816n) != null) {
                            bnlVar.m2768a();
                        }
                        break;
                    case 4:
                    case 5:
                        bmr bmrVar = this.f3802d;
                        bnk bnkVar = bmrVar.f3814l;
                        if (bnkVar != null) {
                            bnkVar.mo2767a(iIntValue == 4, bmrVar.f3807e);
                            this.f3802d.f3814l = null;
                        }
                        break;
                }
            }
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            if (captureResult.getFrameNumber() > this.f3801c) {
                this.f3802d.f3817o = num2.intValue();
                this.f3801c = captureResult.getFrameNumber();
                switch (iIntValue2) {
                    case 2:
                    case 3:
                    case 4:
                        bmr bmrVar2 = this.f3802d;
                        bms bmsVar = bmrVar2.f3815m;
                        if (bmsVar != null) {
                            bmrVar2.f3812j.setOnImageAvailableListener(bmsVar, bmrVar2);
                            try {
                                bmr bmrVar3 = this.f3802d;
                                CameraCaptureSession cameraCaptureSession = bmrVar3.f3811i;
                                CaptureRequest captureRequestM2820a = bmrVar3.f3808f.m2820a(bmrVar3.f3806d, 2, bmrVar3.f3812j.getSurface());
                                bmr bmrVar4 = this.f3802d;
                                cameraCaptureSession.capture(captureRequestM2820a, bmrVar4.f3815m, bmrVar4);
                                return;
                            } catch (CameraAccessException e) {
                                bop.m2813b(bmt.f3831a, "Unable to initiate capture", e);
                                return;
                            } finally {
                                this.f3802d.f3815m = null;
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        mo2735a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        bop.m2812a(bmt.f3831a, "Capture attempt failed with reason " + captureFailure.getReason());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        mo2735a(captureResult);
    }
}
