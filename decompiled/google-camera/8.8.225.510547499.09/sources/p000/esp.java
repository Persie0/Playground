package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esp {

    /* JADX INFO: renamed from: a */
    public final Context f15501a;

    public esp(Context context) {
        this.f15501a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m7787a() {
        Trace.beginSection("prewarmCameraService");
        try {
            ((CameraManager) this.f15501a.getSystemService("camera")).getCameraIdList();
        } catch (CameraAccessException e) {
        }
        Trace.endSection();
    }
}
