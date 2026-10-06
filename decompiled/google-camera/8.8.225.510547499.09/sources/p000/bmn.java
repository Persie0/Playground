package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmn extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bmr f3797a;

    public bmn(bmr bmrVar) {
        this.f3797a = bmrVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        bop.m2814c(bmt.f3831a, "Camera device '" + this.f3797a.f3804b + "' was disconnected");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        bop.m2812a(bmt.f3831a, "Camera device '" + this.f3797a.f3804b + TVkaNXnfP.gKDM + i + '\'');
        bmr bmrVar = this.f3797a;
        bnm bnmVar = bmrVar.f3803a;
        if (bnmVar != null) {
            int i2 = bmrVar.f3804b;
            bnmVar.mo2771c(i2, bmrVar.m2808c(i2));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        bmr bmrVar = this.f3797a;
        bmrVar.f3806d = cameraDevice;
        if (bmrVar.f3803a != null) {
            try {
                CameraCharacteristics cameraCharacteristics = bmrVar.f3819q.f3835e.getCameraCharacteristics(bmrVar.f3805c);
                boc bocVarMo2715b = this.f3797a.f3819q.mo2743b().mo2715b(this.f3797a.f3804b);
                bmr bmrVar2 = this.f3797a;
                bmt bmtVar = bmrVar2.f3819q;
                bmrVar2.f3807e = new bmk(bmtVar, bmtVar, bmrVar2.f3804b, bocVarMo2715b, cameraCharacteristics);
                this.f3797a.f3808f = new bor();
                this.f3797a.f3809g = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.f3797a.f3810h = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2;
                this.f3797a.m2739a(2);
                bmr bmrVar3 = this.f3797a;
                bmrVar3.f3803a.mo2770b(bmrVar3.f3807e);
            } catch (CameraAccessException e) {
                bmr bmrVar4 = this.f3797a;
                bnm bnmVar = bmrVar4.f3803a;
                int i = bmrVar4.f3804b;
                bnmVar.mo2771c(i, bmrVar4.m2808c(i));
            }
        }
    }
}
