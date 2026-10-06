package p000;

import android.hardware.Camera;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmy implements bod {

    /* JADX INFO: renamed from: a */
    private final Camera.CameraInfo[] f3848a;

    /* JADX INFO: renamed from: b */
    private final int f3849b;

    private bmy(Camera.CameraInfo[] cameraInfoArr, int i) {
        this.f3848a = cameraInfoArr;
        this.f3849b = i;
    }

    /* JADX INFO: renamed from: c */
    public static bmy m2760c() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                cameraInfoArr[i] = cameraInfo;
                Camera.getCameraInfo(i, cameraInfo);
            }
            int i2 = -1;
            for (int i3 = numberOfCameras - 1; i3 >= 0; i3--) {
                if (cameraInfoArr[i3].facing == 0) {
                    i2 = i3;
                } else {
                    int i4 = cameraInfoArr[i3].facing;
                }
            }
            return new bmy(cameraInfoArr, i2);
        } catch (RuntimeException e) {
            bop.m2813b(bnh.f3875a, "Exception while creating CameraDeviceInfo", e);
            return null;
        }
    }

    @Override // p000.bod
    /* JADX INFO: renamed from: a */
    public final int mo2714a() {
        return this.f3849b;
    }

    @Override // p000.bod
    /* JADX INFO: renamed from: b */
    public final boc mo2715b(int i) {
        Camera.CameraInfo cameraInfo = this.f3848a[i];
        if (cameraInfo != null) {
            return new bmx(cameraInfo);
        }
        return null;
    }
}
