package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DngColorCalibrationVector {

    /* JADX INFO: renamed from: a */
    public transient long f8245a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8246b;

    public DngColorCalibrationVector() {
        long jNew_DngColorCalibrationVector__SWIG_0 = GcamModuleJNI.new_DngColorCalibrationVector__SWIG_0();
        this.f8246b = true;
        this.f8245a = jNew_DngColorCalibrationVector__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4926a(DngColorCalibration dngColorCalibration) {
        GcamModuleJNI.DngColorCalibrationVector_add(this.f8245a, this, dngColorCalibration.f8243a, dngColorCalibration);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4927b() {
        long j = this.f8245a;
        if (j != 0) {
            if (this.f8246b) {
                this.f8246b = false;
                GcamModuleJNI.delete_DngColorCalibrationVector(j);
            }
            this.f8245a = 0L;
        }
    }

    protected final void finalize() {
        m4927b();
    }
}
