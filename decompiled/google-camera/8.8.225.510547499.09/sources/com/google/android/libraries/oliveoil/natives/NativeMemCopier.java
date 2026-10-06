package com.google.android.libraries.oliveoil.natives;

import com.google.android.libraries.oliveoil.util.JniUtil;
import java.nio.ByteBuffer;
import p000.lfu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NativeMemCopier implements lfu {

    /* JADX INFO: renamed from: a */
    private final boolean f7953a;

    public NativeMemCopier() {
        boolean z;
        try {
            int i = JniUtil.f7954a;
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        this.f7953a = z;
    }

    @Override // p000.lfu
    /* JADX INFO: renamed from: a */
    public final boolean mo4711a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.f7953a && byteBuffer.isDirect() && byteBuffer2.isDirect();
    }

    @Override // p000.lfu
    public native void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    @Override // p000.lfu
    public native void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // p000.lfu
    public native void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public final String toString() {
        return getClass().getSimpleName();
    }
}
