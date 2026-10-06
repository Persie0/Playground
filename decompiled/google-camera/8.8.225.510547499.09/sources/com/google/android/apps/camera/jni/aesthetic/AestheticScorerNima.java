package com.google.android.apps.camera.jni.aesthetic;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ena;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AestheticScorerNima implements ena {

    /* JADX INFO: renamed from: a */
    private long f6746a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f6747b;

    public AestheticScorerNima() {
        kbi.m13938a(AestheticScorerNima.class);
        this.f6747b = new AtomicBoolean(true);
    }

    private native void nativeClose(long j);

    private static native long nativeLoad(Boolean bool);

    private native float nativeScoreYUV(long j, int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr);

    @Override // p000.ena
    /* JADX INFO: renamed from: a */
    public final float mo4183a(int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float[] fArr) {
        if (this.f6747b.get()) {
            return 0.0f;
        }
        return nativeScoreYUV(this.f6746a, i, i2, buffer, i3, i4, buffer2, i5, i6, buffer3, i7, i8, fArr);
    }

    @Override // p000.ena
    /* JADX INFO: renamed from: b */
    public final void mo4184b() {
        if (this.f6747b.getAndSet(true)) {
            return;
        }
        nativeClose(this.f6746a);
    }

    @Override // p000.ena
    /* JADX INFO: renamed from: c */
    public final void mo4185c(boolean z) {
        if (this.f6747b.getAndSet(false)) {
            this.f6746a = nativeLoad(Boolean.valueOf(z));
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
