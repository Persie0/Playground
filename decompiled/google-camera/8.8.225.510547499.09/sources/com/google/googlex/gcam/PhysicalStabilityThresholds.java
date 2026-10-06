package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PhysicalStabilityThresholds {

    /* JADX INFO: renamed from: a */
    public transient long f8330a;

    public PhysicalStabilityThresholds() {
        this(GcamModuleJNI.new_PhysicalStabilityThresholds());
    }

    public PhysicalStabilityThresholds(long j) {
        this.f8330a = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m5061a() {
        return GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(this.f8330a, this);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5062b() {
        if (this.f8330a != 0) {
            this.f8330a = 0L;
        }
    }

    protected final void finalize() {
        m5062b();
    }
}
