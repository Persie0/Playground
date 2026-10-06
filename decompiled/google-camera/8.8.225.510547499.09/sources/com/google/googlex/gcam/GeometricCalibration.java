package com.google.googlex.gcam;

import p000.nrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GeometricCalibration {

    /* JADX INFO: renamed from: a */
    public transient long f8275a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8276b;

    public GeometricCalibration() {
        long jNew_GeometricCalibration = GcamModuleJNI.new_GeometricCalibration();
        this.f8276b = true;
        this.f8275a = jNew_GeometricCalibration;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4979a() {
        long j = this.f8275a;
        if (j != 0) {
            if (this.f8276b) {
                this.f8276b = false;
                GcamModuleJNI.delete_GeometricCalibration(j);
            }
            this.f8275a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4980b(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.f8275a, this, fArr);
    }

    /* JADX INFO: renamed from: c */
    public final void m4981c(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.f8275a, this, fArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m4982d(nrm nrmVar) {
        GcamModuleJNI.GeometricCalibration_quality_set(this.f8275a, this, nrmVar.f44247c);
    }

    protected final void finalize() {
        m4979a();
    }
}
