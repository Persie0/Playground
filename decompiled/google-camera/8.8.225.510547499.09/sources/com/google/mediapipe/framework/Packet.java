package com.google.mediapipe.framework;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Packet {

    /* JADX INFO: renamed from: a */
    public long f8431a;

    public Packet(long j) {
        this.f8431a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeGetTimestamp(long j);

    private native void nativeReleasePacket(long j);

    /* JADX INFO: renamed from: a */
    public final long m5183a() {
        return nativeGetTimestamp(this.f8431a);
    }

    public long getNativeHandle() {
        return this.f8431a;
    }

    public native long nativeCopyPacket(long j);

    public void release() {
        long j = this.f8431a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.f8431a = 0L;
        }
    }
}
