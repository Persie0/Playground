package com.google.android.libraries.vision.smartcapture;

import java.io.Closeable;
import java.nio.ByteBuffer;
import p000.msb;
import p000.nxf;
import p000.odn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BurstCurator implements Closeable {

    /* JADX INFO: renamed from: a */
    public final nxf f7968a;

    /* JADX INFO: renamed from: b */
    public final long f7969b;

    /* JADX INFO: renamed from: c */
    public boolean f7970c;

    static {
        try {
            System.loadLibrary("smartcapture_native");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(msb.JAVA_VM_NAME.m16855a())) {
                throw e;
            }
        }
    }

    public BurstCurator(long j) {
        if (j == 0) {
            throw new IllegalStateException("Could not initialize BurstCurator.");
        }
        this.f7969b = j;
        this.f7970c = false;
        nxf nxfVarM18012b = nxf.m18012b();
        this.f7968a = nxfVarM18012b;
        nxfVarM18012b.m18014d(odn.f45633j);
    }

    private native void nativeClose(long j);

    public static native long nativeCreateFromOptions(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7970c) {
            return;
        }
        nativeClose(this.f7969b);
        this.f7970c = true;
    }

    protected final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native byte[] nativeProcessMetadata(long j, byte[] bArr);

    public native byte[] nativeProcessYUV(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr, int i9);
}
