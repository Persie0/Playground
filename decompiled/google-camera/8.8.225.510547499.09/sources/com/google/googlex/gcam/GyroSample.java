package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GyroSample {

    /* JADX INFO: renamed from: a */
    public transient long f8283a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8284b;

    public GyroSample() {
        long jNew_GyroSample = GcamModuleJNI.new_GyroSample();
        this.f8284b = true;
        this.f8283a = jNew_GyroSample;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4990a() {
        long j = this.f8283a;
        if (j != 0) {
            if (this.f8284b) {
                this.f8284b = false;
                GcamModuleJNI.delete_GyroSample(j);
            }
            this.f8283a = 0L;
        }
    }

    protected final void finalize() {
        m4990a();
    }
}
