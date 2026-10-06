package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.kba;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HardwarePixels implements kba {

    /* JADX INFO: renamed from: a */
    public final HardwareBuffer f7925a;

    /* JADX INFO: renamed from: b */
    public final long f7926b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f7927c = new AtomicBoolean(false);

    public HardwarePixels(HardwareBuffer hardwareBuffer) {
        this.f7925a = HardwareBuffers.fork(hardwareBuffer);
        this.f7926b = nativeLockPlanes(hardwareBuffer, 3L);
    }

    public static native ByteBuffer nativeGetData(long j, int i, int i2, int i3);

    private static native long nativeLockPlanes(HardwareBuffer hardwareBuffer, long j);

    public static native int nativePixelStride(long j, int i);

    public static native int nativePlaneCount(long j);

    public static native int nativeRowStride(long j, int i);

    private static native void nativeUnlockBuffer(HardwareBuffer hardwareBuffer);

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f7927c.compareAndSet(false, true)) {
            nativeUnlockBuffer(this.f7925a);
            this.f7925a.close();
        }
    }
}
