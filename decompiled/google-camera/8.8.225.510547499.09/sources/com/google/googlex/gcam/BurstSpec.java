package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BurstSpec {

    /* JADX INFO: renamed from: a */
    public transient long f8234a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8235b;

    public BurstSpec() {
        this(GcamModuleJNI.new_BurstSpec());
    }

    public BurstSpec(long j) {
        this.f8235b = true;
        this.f8234a = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m4910a(float f, boolean z) {
        return GcamModuleJNI.BurstSpec_TotalCaptureTimeMs__SWIG_0(this.f8234a, this, f, z);
    }

    /* JADX INFO: renamed from: b */
    public final FrameRequestVector m4911b() {
        long jBurstSpec_frame_requests_get = GcamModuleJNI.BurstSpec_frame_requests_get(this.f8234a, this);
        if (jBurstSpec_frame_requests_get == 0) {
            return null;
        }
        return new FrameRequestVector(jBurstSpec_frame_requests_get, false);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4912c() {
        long j = this.f8234a;
        if (j != 0) {
            if (this.f8235b) {
                this.f8235b = false;
                GcamModuleJNI.delete_BurstSpec(j);
            }
            this.f8234a = 0L;
        }
    }

    protected final void finalize() {
        m4912c();
    }
}
