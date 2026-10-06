package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ViewfinderProcessingOptions {

    /* JADX INFO: renamed from: a */
    public transient long f8379a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8380b;

    public ViewfinderProcessingOptions() {
        long jNew_ViewfinderProcessingOptions__SWIG_0 = GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0();
        this.f8380b = true;
        this.f8379a = jNew_ViewfinderProcessingOptions__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5137a() {
        long j = this.f8379a;
        if (j != 0) {
            if (this.f8380b) {
                this.f8380b = false;
                GcamModuleJNI.delete_ViewfinderProcessingOptions(j);
            }
            this.f8379a = 0L;
        }
    }

    protected final void finalize() {
        m5137a();
    }
}
