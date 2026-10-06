package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bom {

    /* JADX INFO: renamed from: a */
    public static final int f4019a;

    static {
        try {
            try {
                f4019a = Class.forName("android.hardware.camera2.CameraCharacteristics").getField("CONTROL_SCENE_MODE_HDR").getInt(null);
            } catch (Exception e) {
                Log.e("LegacyVendorTags", "Error while reflecting on SCENE_MODE_HDR enum, HDR will not be available: " + e);
                f4019a = -1;
            }
        } catch (Throwable th) {
            f4019a = -1;
            throw th;
        }
    }
}
