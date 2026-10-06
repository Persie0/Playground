package com.google.android.apps.camera.jni.facebeautification;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GpuRetoucherNative {
    static {
        kbi.m13938a(GpuRetoucherNative.class);
    }

    private GpuRetoucherNative() {
    }

    public static native long createRetoucher(boolean z, int i);

    public static native boolean process(long j, HardwareBuffer hardwareBuffer, boolean z, HardwareBuffer hardwareBuffer2, boolean z2, int i, int i2, FaceToBeautify2[] faceToBeautify2Arr, int i3);

    public static native void releaseRetoucher(long j);
}
