package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PhysicalStabilityParams {

    /* JADX INFO: renamed from: a */
    private transient long f8329a;

    public PhysicalStabilityParams() {
        this(GcamModuleJNI.new_PhysicalStabilityParams());
    }

    public PhysicalStabilityParams(long j) {
        this.f8329a = j;
    }

    /* JADX INFO: renamed from: a */
    public final PhysicalStabilityThresholds m5059a() {
        long jPhysicalStabilityParams_thresholds_get = GcamModuleJNI.PhysicalStabilityParams_thresholds_get(this.f8329a, this);
        if (jPhysicalStabilityParams_thresholds_get == 0) {
            return null;
        }
        return new PhysicalStabilityThresholds(jPhysicalStabilityParams_thresholds_get);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5060b() {
        if (this.f8329a != 0) {
            this.f8329a = 0L;
        }
    }

    protected final void finalize() {
        m5060b();
    }
}
