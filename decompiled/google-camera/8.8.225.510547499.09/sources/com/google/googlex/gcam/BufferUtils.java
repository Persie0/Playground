package com.google.googlex.gcam;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BufferUtils {
    private BufferUtils() {
    }

    /* JADX INFO: renamed from: a */
    public static long m4902a(Buffer buffer) {
        buffer.getClass();
        return getDirectBufferAddressImpl(buffer);
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m4903b(long j, int i) {
        lku.m15670x(j != 0, "ptr must not be 0.");
        lku.m15672z(i > 0, "capacity must be positive, got: %s", i);
        return byteBufferViewOfNativePointerImpl(j, i).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer byteBufferViewOfNativePointerImpl(long j, int i);

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m4904c(ByteBuffer byteBuffer) {
        return m4905d(byteBuffer, byteBuffer.isDirect());
    }

    /* JADX INFO: renamed from: d */
    public static ByteBuffer m4905d(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBufferAllocateDirect = z ? ByteBuffer.allocateDirect(byteBuffer.capacity()) : ByteBuffer.allocate(byteBuffer.capacity());
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byteBufferAllocateDirect.put(byteBufferAsReadOnlyBuffer);
        byteBufferAllocateDirect.order(byteBuffer.order());
        return byteBufferAllocateDirect;
    }

    private static native long getDirectBufferAddressImpl(Buffer buffer);

    private static native long getDirectBufferCapacityImpl(Buffer buffer);

    public static native void setByteVectorImpl(byte[] bArr, long j);

    public static native void setFloatVectorImpl(float[] fArr, long j);
}
