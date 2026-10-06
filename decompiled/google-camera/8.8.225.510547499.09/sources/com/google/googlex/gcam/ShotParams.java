package com.google.googlex.gcam;

import p000.nsc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ShotParams {

    /* JADX INFO: renamed from: a */
    public transient long f8358a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8359b;

    public ShotParams() {
        this(GcamModuleJNI.new_ShotParams__SWIG_0());
    }

    public ShotParams(long j) {
        this.f8359b = true;
        this.f8358a = j;
    }

    public ShotParams(ShotParams shotParams) {
        this(GcamModuleJNI.new_ShotParams__SWIG_1(shotParams.f8358a, shotParams));
    }

    /* JADX INFO: renamed from: a */
    public final AeShotParams m5110a() {
        long jShotParams_ae_get = GcamModuleJNI.ShotParams_ae_get(this.f8358a, this);
        if (jShotParams_ae_get == 0) {
            return null;
        }
        return new AeShotParams(jShotParams_ae_get, false);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5111b() {
        long j = this.f8358a;
        if (j != 0) {
            if (this.f8359b) {
                this.f8359b = false;
                GcamModuleJNI.delete_ShotParams(j);
            }
            this.f8358a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5112c(AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_force_wb_set(this.f8358a, this, AwbInfo.m4899a(awbInfo), awbInfo);
    }

    /* JADX INFO: renamed from: d */
    public final void m5113d(boolean z) {
        GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.f8358a, this, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m5114e(nsc nscVar) {
        GcamModuleJNI.ShotParams_resampling_method_override_set(this.f8358a, this, nscVar.f44359d);
    }

    /* JADX INFO: renamed from: f */
    public final void m5115f(boolean z) {
        GcamModuleJNI.ShotParams_shasta_enabled_set(this.f8358a, this, z);
    }

    protected final void finalize() {
        m5111b();
    }
}
