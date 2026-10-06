package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GyroSampleVector {

    /* JADX INFO: renamed from: a */
    public transient long f8285a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8286b;

    public GyroSampleVector() {
        long jNew_GyroSampleVector__SWIG_0 = GcamModuleJNI.new_GyroSampleVector__SWIG_0();
        this.f8286b = true;
        this.f8285a = jNew_GyroSampleVector__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4991a() {
        long j = this.f8285a;
        if (j != 0) {
            if (this.f8286b) {
                this.f8286b = false;
                GcamModuleJNI.delete_GyroSampleVector(j);
            }
            this.f8285a = 0L;
        }
    }

    protected final void finalize() {
        m4991a();
    }
}
