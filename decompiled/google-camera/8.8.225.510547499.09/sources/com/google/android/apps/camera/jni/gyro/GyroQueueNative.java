package com.google.android.apps.camera.jni.gyro;

import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GyroQueueNative {
    static {
        kbi.m13938a(GyroQueueNative.class);
    }

    public static native long createHandle(int[] iArr, int[] iArr2);

    public static native boolean getProjectionMatrix(long j, long j2, float f, float f2, float f3, long j3, float[] fArr);

    public static native boolean getTransformBetweenTime(long j, long j2, float f, float f2, float f3, long j3, float f4, float f5, float f6, long j4, float[] fArr);

    public static native boolean processAndEnqueueGyro(long j, float f, float f2, float f3, long j2);

    public static native void releaseHandle(long j);
}
