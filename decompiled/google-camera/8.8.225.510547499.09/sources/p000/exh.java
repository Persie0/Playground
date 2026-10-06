package p000;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle$LightCycleProgressCallback;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exh {

    /* JADX INFO: renamed from: a */
    public static final Object f20734a = new Object();

    /* JADX INFO: renamed from: b */
    public static Boolean f20735b = false;

    /* JADX INFO: renamed from: c */
    public static final Map f20736c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final LightCycle$LightCycleProgressCallback f20737d = new LightCycle$LightCycleProgressCallback(null);

    /* JADX INFO: renamed from: a */
    public static int m8000a() {
        int iDeviceOrientationStatus;
        synchronized (f20734a) {
            if (!f20735b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            iDeviceOrientationStatus = LightCycleNative.DeviceOrientationStatus();
        }
        return iDeviceOrientationStatus;
    }

    /* JADX INFO: renamed from: b */
    public static void m8001b(String str, float f) {
        synchronized (f20734a) {
            LightCycleNative.ResetForPhotoSphereCapture(str, f);
            f20735b = true;
        }
    }
}
