package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GeometricCalibrationVector {

    /* JADX INFO: renamed from: a */
    public transient long f8277a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8278b;

    public GeometricCalibrationVector() {
        this(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), true);
    }

    public GeometricCalibrationVector(long j, boolean z) {
        this.f8278b = z;
        this.f8277a = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m4983a(GeometricCalibration geometricCalibration) {
        GcamModuleJNI.GeometricCalibrationVector_add(this.f8277a, this, geometricCalibration.f8275a, geometricCalibration);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4984b() {
        long j = this.f8277a;
        if (j != 0) {
            if (this.f8278b) {
                this.f8278b = false;
                GcamModuleJNI.delete_GeometricCalibrationVector(j);
            }
            this.f8277a = 0L;
        }
    }

    protected final void finalize() {
        m4984b();
    }
}
