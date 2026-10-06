package com.google.android.apps.camera.facedeblur.deeprestore.jni;

import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DeepRestoreNative {
    static {
        System.loadLibrary(HEePJw.iiooGIGoJ);
    }

    public static native long createHandle(String str, ByteBuffer byteBuffer, String str2, boolean z, boolean z2);

    public static native int deepRestoreFaceDeblurRgb(long j, long j2, long j3, float f, long[] jArr, long[] jArr2, boolean z, boolean z2, long j4);

    public static native void releaseHandle(long j);
}
