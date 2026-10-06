package com.google.googlex.gcam;

import android.hardware.HardwareBuffer;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LockedHardwareBuffer implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private long f8315a;

    private LockedHardwareBuffer(HardwareBuffer hardwareBuffer, long j) {
        hardwareBuffer.getClass();
        long jLockHardwareBuffer = lockHardwareBuffer(hardwareBuffer, j);
        this.f8315a = jLockHardwareBuffer;
        lku.m15670x(jLockHardwareBuffer != 0, "Failed to lock HardwareBuffer.");
    }

    /* JADX INFO: renamed from: c */
    public static LockedHardwareBuffer m5040c(HardwareBuffer hardwareBuffer, long j) {
        return new LockedHardwareBuffer(hardwareBuffer, j);
    }

    private static native long getInterleavedReadViewU8Impl(long j);

    private static native long getInterleavedWriteViewU8Impl(long j);

    private static native long lockHardwareBuffer(HardwareBuffer hardwareBuffer, long j);

    private static native void unlockHardwareBuffer(long j);

    /* JADX INFO: renamed from: a */
    public final InterleavedReadViewU8 m5041a() {
        return new InterleavedReadViewU8(getInterleavedReadViewU8Impl(this.f8315a));
    }

    /* JADX INFO: renamed from: b */
    public final InterleavedWriteViewU8 m5042b() {
        return new InterleavedWriteViewU8(getInterleavedWriteViewU8Impl(this.f8315a));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.f8315a;
        if (j != 0) {
            unlockHardwareBuffer(j);
            this.f8315a = 0L;
        }
    }
}
