package p000;

import android.hardware.camera2.CameraAccessException;
import android.view.Window;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0211gi {
    /* JADX INFO: renamed from: a */
    static void m9270a(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    /* JADX INFO: renamed from: b */
    public static final int m9271b(Throwable th) {
        if (!(th instanceof CameraAccessException)) {
            if (th instanceof IllegalArgumentException) {
                return 7;
            }
            if (th instanceof SecurityException) {
                return 8;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected throwable: ");
            sb.append(th);
            throw new IllegalArgumentException("Unexpected throwable: ".concat(th.toString()));
        }
        CameraAccessException cameraAccessException = (CameraAccessException) th;
        switch (cameraAccessException.getReason()) {
            case 1:
                return 3;
            case 2:
                return 6;
            case 3:
                return 0;
            case 4:
                return 1;
            case 5:
                return 2;
            default:
                throw new IllegalArgumentException("Unexpected CameraAccessException reason:" + cameraAccessException.getReason());
        }
    }
}
