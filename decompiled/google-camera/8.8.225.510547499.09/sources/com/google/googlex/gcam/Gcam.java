package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Gcam {

    /* JADX INFO: renamed from: a */
    public transient long f8271a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8272b = true;

    public Gcam(long j) {
        this.f8271a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m4971a(Gcam gcam) {
        if (gcam == null) {
            return 0L;
        }
        return gcam.f8271a;
    }

    /* JADX INFO: renamed from: b */
    public final StaticMetadata m4972b(int i) {
        return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.f8271a, this, i), false);
    }

    /* JADX INFO: renamed from: c */
    public final Tuning m4973c(int i) {
        return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.f8271a, this, i));
    }

    /* JADX INFO: renamed from: d */
    public final void m4974d(ViewfinderProcessingOptions viewfinderProcessingOptions) {
        GcamModuleJNI.Gcam_ConfigureViewfinderProcessing(this.f8271a, this, viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions);
    }

    /* JADX INFO: renamed from: e */
    public final void m4975e(int i) {
        GcamModuleJNI.Gcam_FlushTemporalBinning(this.f8271a, this, i);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m4976f() {
        long j = this.f8271a;
        if (j != 0) {
            if (this.f8272b) {
                this.f8272b = false;
                GcamModuleJNI.delete_Gcam(j);
            }
            this.f8271a = 0L;
        }
    }

    protected final void finalize() {
        m4976f();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4977g() {
        return GcamModuleJNI.Gcam_AllSensorIdsUnique(this.f8271a, this);
    }
}
