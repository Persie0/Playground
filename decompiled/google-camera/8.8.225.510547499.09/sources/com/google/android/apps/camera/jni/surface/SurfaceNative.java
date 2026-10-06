package com.google.android.apps.camera.jni.surface;

import android.view.Surface;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SurfaceNative {
    static {
        kbi.m13939b(SurfaceNative.class, "surface-jni");
    }

    public static native int setSurfaceGeometry(Surface surface, int i, int i2, int i3);

    public static native int setSurfaceTransform(Surface surface, int i);

    public static native void tryAllocateBuffers(Surface surface);
}
