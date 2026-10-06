package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmi implements bod {

    /* JADX INFO: renamed from: a */
    private final CameraManager f3777a;

    /* JADX INFO: renamed from: b */
    private final String[] f3778b;

    /* JADX INFO: renamed from: c */
    private final int f3779c;

    public bmi(CameraManager cameraManager, String[] strArr) {
        this.f3777a = cameraManager;
        this.f3778b = strArr;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                int iIntValue = ((Integer) cameraManager.getCameraCharacteristics(strArr[i3]).get(CameraCharacteristics.LENS_FACING)).intValue();
                if (i == -1) {
                    if (iIntValue == 1) {
                        i = i3;
                        iIntValue = 1;
                    } else {
                        i = -1;
                    }
                }
                if (i2 == -1) {
                    i2 = iIntValue == 0 ? i3 : -1;
                }
            } catch (CameraAccessException e) {
                bop.m2815d(bmt.f3831a, "Couldn't get characteristics of camera '" + i3 + "'", e);
            }
        }
        this.f3779c = i;
    }

    @Override // p000.bod
    /* JADX INFO: renamed from: a */
    public final int mo2714a() {
        return this.f3779c;
    }

    @Override // p000.bod
    /* JADX INFO: renamed from: b */
    public final boc mo2715b(int i) {
        try {
            return new bmh(this.f3777a.getCameraCharacteristics(this.f3778b[i]));
        } catch (CameraAccessException e) {
            return null;
        }
    }
}
