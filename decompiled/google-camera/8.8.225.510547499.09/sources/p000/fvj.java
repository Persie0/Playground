package p000;

import android.hardware.camera2.CameraManager;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvj extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    private final fvh f23632a;

    /* JADX INFO: renamed from: b */
    private final kmg f23633b;

    /* JADX INFO: renamed from: c */
    private final mxk f23634c;

    public fvj(fvh fvhVar, kmg kmgVar, mxk mxkVar) {
        this.f23632a = fvhVar;
        this.f23633b = kmgVar;
        this.f23634c = mxkVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onCameraAvailable(String str) {
        if (this.f23633b.f36540a.equals(str)) {
            if (this.f23632a.f23628b.isDone()) {
                mxk mxkVar = this.f23634c;
                fvh fvhVar = this.f23632a;
                fvhVar.getClass();
                Collection$EL.forEach(mxkVar, new fvi(fvhVar, 0));
            } else {
                fvh fvhVar2 = this.f23632a;
                mxk mxkVar2 = this.f23634c;
                if (!fvhVar2.f23628b.isDone()) {
                    Collection$EL.forEach(mxkVar2, new fvi(fvhVar2, 1));
                    fvhVar2.f23628b.mo14894e(true);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onPhysicalCameraAvailable(String str, String str2) {
        if (this.f23633b.f36540a.equals(str)) {
            this.f23632a.m8828a(str2);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final synchronized void onPhysicalCameraUnavailable(String str, String str2) {
        if (this.f23633b.f36540a.equals(str)) {
            this.f23632a.m8829b(str2);
        }
    }
}
