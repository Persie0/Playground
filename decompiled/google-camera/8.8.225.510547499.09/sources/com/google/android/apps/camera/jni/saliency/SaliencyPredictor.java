package com.google.android.apps.camera.jni.saliency;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SaliencyPredictor {

    /* JADX INFO: renamed from: a */
    public long f6754a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f6755b = new AtomicBoolean(true);

    static {
        try {
            System.loadLibrary("saliency_predictor_jni");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }

    private native void nativeClose(long j);

    public static native long nativeLoad(Boolean bool);

    /* JADX INFO: renamed from: a */
    public final void m4187a() {
        if (this.f6755b.getAndSet(true)) {
            return;
        }
        nativeClose(this.f6754a);
    }

    protected final void finalize() throws Throwable {
        try {
            m4187a();
        } finally {
            super.finalize();
        }
    }

    public native float[] nativeGetSaliencyHeatMap(long j, int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float f, float f2, float[] fArr);
}
