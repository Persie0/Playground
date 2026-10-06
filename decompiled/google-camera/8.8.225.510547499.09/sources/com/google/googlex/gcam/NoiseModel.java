package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NoiseModel {

    /* JADX INFO: renamed from: a */
    public transient long f8320a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8321b = true;

    public NoiseModel(long j) {
        this.f8320a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5049a() {
        long j = this.f8320a;
        if (j != 0) {
            if (this.f8321b) {
                this.f8321b = false;
                GcamModuleJNI.delete_NoiseModel(j);
            }
            this.f8320a = 0L;
        }
    }

    protected final void finalize() {
        m5049a();
    }
}
