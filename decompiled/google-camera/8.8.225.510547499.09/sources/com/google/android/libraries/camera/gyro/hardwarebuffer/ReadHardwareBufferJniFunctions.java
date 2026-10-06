package com.google.android.libraries.camera.gyro.hardwarebuffer;

import android.hardware.HardwareBuffer;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ReadHardwareBufferJniFunctions {
    static {
        kbi.m13939b(ReadHardwareBufferJniFunctions.class, "hardwarebuffer-jni");
    }

    public static native boolean isSupported();

    public static native boolean readHardwareBuffer(HardwareBuffer hardwareBuffer, byte[] bArr, int i, int i2, int i3);
}
