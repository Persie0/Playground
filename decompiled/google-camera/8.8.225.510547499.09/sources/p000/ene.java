package p000;

import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ene implements end {

    /* JADX INFO: renamed from: a */
    private static final nbh f14748a = nbh.m17259h("com/google/android/apps/camera/jni/gyro/GyroQueueImpl");

    /* JADX INFO: renamed from: b */
    private static final float[] f14749b = m7557e();

    /* JADX INFO: renamed from: c */
    private static final int[] f14750c = {1, 0, 2};

    /* JADX INFO: renamed from: d */
    private static final int[] f14751d = {1, 1, 1};

    /* JADX INFO: renamed from: f */
    private final Object f14753f = new Object();

    /* JADX INFO: renamed from: h */
    private long f14755h = 0;

    /* JADX INFO: renamed from: e */
    private final long f14752e = GyroQueueNative.createHandle(f14750c, f14751d);

    /* JADX INFO: renamed from: g */
    private boolean f14754g = false;

    /* JADX INFO: renamed from: e */
    private static final float[] m7557e() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override // p000.end
    /* JADX INFO: renamed from: a */
    public final long mo7553a() {
        long j;
        synchronized (this.f14753f) {
            j = this.f14755h;
        }
        return j;
    }

    @Override // p000.end
    /* JADX INFO: renamed from: c */
    public final boolean mo7555c(long j, float f, float f2, float f3, float[] fArr) {
        System.arraycopy(f14749b, 0, fArr, 0, 9);
        synchronized (this.f14753f) {
            if (this.f14754g) {
                return false;
            }
            if (GyroQueueNative.getProjectionMatrix(this.f14752e, j, f, f2, f3, 0L, fArr)) {
                return true;
            }
            ((nbe) ((nbe) f14748a.m17252c()).mo17276G(1608)).mo17292q("Projection matrix could not be computed for timestamp = %d", j);
            return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14753f) {
            if (this.f14754g) {
                return;
            }
            this.f14754g = true;
            GyroQueueNative.releaseHandle(this.f14752e);
        }
    }

    @Override // p000.end
    /* JADX INFO: renamed from: d */
    public final float[] mo7556d(long j, float f, float f2, float f3, long j2, float f4, float f5, float f6) throws Throwable {
        float[] fArrM7557e = m7557e();
        synchronized (this.f14753f) {
            try {
                try {
                    if (this.f14754g) {
                        return fArrM7557e;
                    }
                    if (!GyroQueueNative.getTransformBetweenTime(this.f14752e, j, f, f2, f3, j2, f4, f5, f6, 0L, fArrM7557e)) {
                        ((nbe) ((nbe) f14748a.m17252c()).mo17276G(1610)).mo17297v("Transformation matrix could not be computed for timestamps %d - %d", j, j2);
                    }
                    return fArrM7557e;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p000.end
    /* JADX INFO: renamed from: b */
    public final void mo7554b(float f, float f2, float f3, long j) {
        synchronized (this.f14753f) {
            if (!this.f14754g && this.f14755h < j) {
                this.f14755h = j;
                GyroQueueNative.processAndEnqueueGyro(this.f14752e, f, f2, f3, j);
            }
        }
    }
}
