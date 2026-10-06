package com.google.android.apps.camera.facemetadata.jni;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FaceMetadataNative {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f6661a = new AtomicBoolean();

    private FaceMetadataNative() {
    }

    public static native long createHandle();

    public static native long[] generateFaceInfos(FaceToBeautify[] faceToBeautifyArr);

    public static native long[] generateFaceThumbnails(int i, int i2, long[] jArr, long j);

    public static native int getThumbnailSize(long j);

    public static native void releaseFaceInfos(long[] jArr);

    public static native void releaseFaceThumbnails(long[] jArr);

    public static native void releaseHandle(long j);
}
