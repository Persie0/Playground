package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PortraitOutputs {

    /* JADX INFO: renamed from: a */
    public transient long f8336a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8337b;

    public PortraitOutputs() {
        long jNew_PortraitOutputs = GcamModuleJNI.new_PortraitOutputs();
        this.f8337b = true;
        this.f8336a = jNew_PortraitOutputs;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5075a() {
        long j = this.f8336a;
        if (j != 0) {
            if (this.f8337b) {
                this.f8337b = false;
                GcamModuleJNI.delete_PortraitOutputs(j);
            }
            this.f8336a = 0L;
        }
    }

    protected final void finalize() {
        m5075a();
    }
}
