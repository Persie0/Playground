package com.google.android.apps.camera.jni.facebeautification;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.nio.ByteBuffer;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FaceBeautificationNative {
    static {
        kbi.m13938a(FaceBeautificationNative.class);
    }

    private FaceBeautificationNative() {
    }

    public static native long createHandle(int i, int i2, boolean z);

    public static native byte[] doFaceBeautification(long j, int i, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, FaceToBeautify[] faceToBeautifyArr, int i10, int i11);

    public static native void releaseHandle(long j);
}
