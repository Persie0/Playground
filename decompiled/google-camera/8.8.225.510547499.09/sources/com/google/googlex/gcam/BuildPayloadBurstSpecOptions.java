package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BuildPayloadBurstSpecOptions {

    /* JADX INFO: renamed from: a */
    public transient long f8232a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8233b;

    public BuildPayloadBurstSpecOptions() {
        long jNew_BuildPayloadBurstSpecOptions__SWIG_0 = GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0();
        this.f8233b = true;
        this.f8232a = jNew_BuildPayloadBurstSpecOptions__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4906a() {
        long j = this.f8232a;
        if (j != 0) {
            if (this.f8233b) {
                this.f8233b = false;
                GcamModuleJNI.delete_BuildPayloadBurstSpecOptions(j);
            }
            this.f8232a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4907b(float f) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(this.f8232a, this, f);
    }

    /* JADX INFO: renamed from: c */
    public final void m4908c(float f) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(this.f8232a, this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4909d(boolean z) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_recompute_ae_set(this.f8232a, this, z);
    }

    protected final void finalize() {
        m4906a();
    }
}
