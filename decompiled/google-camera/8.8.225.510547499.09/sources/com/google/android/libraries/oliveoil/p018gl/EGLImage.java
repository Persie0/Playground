package com.google.android.libraries.oliveoil.p018gl;

import android.hardware.HardwareBuffer;
import android.opengl.EGL14;
import com.google.android.libraries.oliveoil.util.JniUtil;
import p000.kzf;
import p000.kzh;
import p000.kzi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class EGLImage implements kzf {

    /* JADX INFO: renamed from: a */
    public final long f7948a;

    /* JADX INFO: renamed from: b */
    private final HardwareBuffer f7949b;

    public EGLImage(HardwareBuffer hardwareBuffer) {
        int i = JniUtil.f7954a;
        this.f7949b = hardwareBuffer;
        long jCreateImage = createImage(hardwareBuffer);
        this.f7948a = jCreateImage;
        if (jCreateImage >= 0 || jCreateImage < -15) {
        } else {
            throw new RuntimeException(String.format("Could not create EGLImage: %s (EGL error %d).", jCreateImage != -1 ? jCreateImage != -2 ? jCreateImage == -3 ? "eglCreateImageKHR failed" : "unknown error" : "eglGetNativeClientBufferANDROID failed" : "unsupported Android version", Integer.valueOf(EGL14.eglGetError())));
        }
    }

    public static native void attachToRbo(long j);

    public static native void attachToTexture(long j);

    private static native void close(long j);

    private static native long createImage(HardwareBuffer hardwareBuffer);

    /* JADX INFO: renamed from: a */
    public final int m4706a() {
        return this.f7949b.getFormat();
    }

    /* JADX INFO: renamed from: b */
    public final kzh m4707b() {
        return kzi.m15087d(this.f7949b.getWidth(), this.f7949b.getHeight());
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close(this.f7948a);
    }
}
