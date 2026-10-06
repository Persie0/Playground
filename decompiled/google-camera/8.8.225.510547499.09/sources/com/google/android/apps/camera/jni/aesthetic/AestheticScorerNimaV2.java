package com.google.android.apps.camera.jni.aesthetic;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ena;
import p000.kbi;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AestheticScorerNimaV2 implements ena {

    /* JADX INFO: renamed from: a */
    private static final nbh f6748a = nbh.m17259h("com/google/android/apps/camera/jni/aesthetic/AestheticScorerNimaV2");

    /* JADX INFO: renamed from: b */
    private long f6749b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f6750c = new AtomicBoolean(true);

    static {
        try {
            kbi.m13938a(AestheticScorerNimaV2.class);
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
            ((nbe) ((nbe) ((nbe) f6748a.m17252c()).mo17283h(e)).mo17276G((char) 1601)).mo17290o("Ignoring loading native library for non-android environments.");
        }
    }

    private native void nativeClose(long j);

    private static native long nativeLoad(boolean z);

    private native float nativeScoreYUV(long j, int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr);

    @Override // p000.ena
    /* JADX INFO: renamed from: a */
    public final float mo4183a(int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr) {
        if (this.f6750c.get()) {
            return 0.0f;
        }
        return nativeScoreYUV(this.f6749b, i, i2, buffer, i3, i4, buffer2, i5, i6, buffer3, i7, i8, fArr);
    }

    @Override // p000.ena
    /* JADX INFO: renamed from: b */
    public final void mo4184b() {
        if (this.f6750c.getAndSet(true)) {
            return;
        }
        nativeClose(this.f6749b);
    }

    @Override // p000.ena
    /* JADX INFO: renamed from: c */
    public final void mo4185c(boolean z) {
        if (this.f6750c.getAndSet(false)) {
            this.f6749b = nativeLoad(z);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            mo4184b();
        } finally {
            super.finalize();
        }
    }
}
