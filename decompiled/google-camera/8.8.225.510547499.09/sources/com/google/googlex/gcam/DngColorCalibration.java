package com.google.googlex.gcam;

import p000.nrh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DngColorCalibration {

    /* JADX INFO: renamed from: a */
    public transient long f8243a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8244b;

    public DngColorCalibration() {
        long jNew_DngColorCalibration = GcamModuleJNI.new_DngColorCalibration();
        this.f8244b = true;
        this.f8243a = jNew_DngColorCalibration;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4922a() {
        long j = this.f8243a;
        if (j != 0) {
            if (this.f8244b) {
                this.f8244b = false;
                GcamModuleJNI.delete_DngColorCalibration(j);
            }
            this.f8243a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4923b(nrh nrhVar) {
        GcamModuleJNI.DngColorCalibration_illuminant_set(this.f8243a, this, nrhVar.f44211w);
    }

    /* JADX INFO: renamed from: c */
    public final void m4924c(FloatArray9 floatArray9) {
        GcamModuleJNI.DngColorCalibration_model_rgb_to_device_rgb_set(this.f8243a, this, floatArray9.f8257a, floatArray9);
    }

    /* JADX INFO: renamed from: d */
    public final void m4925d(FloatArray9 floatArray9) {
        GcamModuleJNI.DngColorCalibration_xyz_to_model_rgb_set(this.f8243a, this, floatArray9.f8257a, floatArray9);
    }

    protected final void finalize() {
        m4922a();
    }
}
