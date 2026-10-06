package p000;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class giy {
    /* JADX INFO: renamed from: a */
    public static mxk m9300a(boolean z) {
        return z ? mxk.m17139K(kgq.m14215e(CaptureRequest.FLASH_MODE, 0), kgq.m14215e(CaptureRequest.CONTROL_AE_MODE, 1), kgq.m14215e(ivr.f32309a, 1), kgq.m14215e(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1)) : mxk.m17137I(kgq.m14215e(CaptureRequest.FLASH_MODE, 0), kgq.m14215e(CaptureRequest.CONTROL_AE_MODE, 1));
    }
}
