package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HardwareBuffers {
    static {
        kbi.m13939b(HardwareBuffers.class, "graphics-jni");
    }

    private HardwareBuffers() {
    }

    public static native HardwareBuffer fork(HardwareBuffer hardwareBuffer);

    public static native boolean lockingIsSupported();
}
