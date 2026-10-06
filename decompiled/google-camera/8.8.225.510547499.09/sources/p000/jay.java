package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.jni.eis.EisNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jay {

    /* JADX INFO: renamed from: a */
    public long f33635a;

    public jay() {
    }

    public jay(long j) {
        this.f33635a = j;
    }

    public jay(enb enbVar, int i, int i2, float f, boolean z, String str) {
        this.f33635a = EisNative.createHandle(enbVar.f14747j, i, i2, f, z, -1, str);
    }

    public jay(byte[] bArr) {
        this.f33635a = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m12810a() {
        this.f33635a = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m12811b() {
        this.f33635a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12812c(long j) {
        return this.f33635a == 0 || SystemClock.elapsedRealtime() - this.f33635a > j;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m12813d() {
        long j;
        j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("getNumOfFramesToLookAhead() called on a released EisNativeWrapper.");
        }
        return EisNative.getNumOfFramesToLookAhead(j);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m12814e() {
        long j;
        j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("getNumStrips() called on a released EisNativeWrapper.");
        }
        return EisNative.getNumStrips(j);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m12815f() {
        long j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("release() called on a released EisNativeWrapper.");
        }
        EisNative.releaseHandle(j);
        this.f33635a = 0L;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m12816g(int i, int i2) {
        long j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("setActiveArraySize() called on a released EisNativeWrapper.");
        }
        EisNative.setActiveArraySize(j, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m12817h(int i, int i2) {
        long j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("setCropWindowSize() called on a released EisNativeWrapper.");
        }
        EisNative.setCropWindowSize(j, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m12818i() {
        long j;
        j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("isTripodMode() called on a released EisNativeWrapper.");
        }
        return EisNative.isTripodMode(j);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized long m12819j(byte[] bArr, int i, int i2, long j, long j2, long j3, long j4, float f, float f2, float f3, float[] fArr, float[] fArr2, float[] fArr3, int i3, boolean z) {
        long j5;
        j5 = this.f33635a;
        if (j5 == 0) {
            throw new IllegalStateException("processFrame() called on a released EisNativeWrapper.");
        }
        return EisNative.processFrame(j5, bArr, i, i2, j, j2, j3, j4, f, f2, f3, true, 0L, fArr, fArr2, fArr3, i3, z);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m12820k(float f, float f2, float f3, long j) {
        long j2 = this.f33635a;
        if (j2 == 0) {
            throw new IllegalStateException("processGyro() called on a released EisNativeWrapper.");
        }
        EisNative.processGyro(j2, f, f2, f3, j);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m12821l(float f, float f2, long j, int i) {
        long j2 = this.f33635a;
        if (j2 == 0) {
            throw new IllegalStateException("processLensOffset() called on a released EisNativeWrapper.");
        }
        EisNative.processLensOffset(j2, f, f2, j, i);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m12822m() {
        long j = this.f33635a;
        if (j == 0) {
            throw new IllegalStateException("setStabilizationStrength() called on a released EisNativeWrapper.");
        }
        EisNative.setStabilizationStrength(j, 1.0f);
    }
}
