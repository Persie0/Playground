package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class QcIlluminantVector {

    /* JADX INFO: renamed from: a */
    public transient long f8347a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8348b;

    public QcIlluminantVector() {
        long jNew_QcIlluminantVector__SWIG_0 = GcamModuleJNI.new_QcIlluminantVector__SWIG_0();
        this.f8348b = true;
        this.f8347a = jNew_QcIlluminantVector__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5089a() {
        long j = this.f8347a;
        if (j != 0) {
            if (this.f8348b) {
                this.f8348b = false;
                GcamModuleJNI.delete_QcIlluminantVector(j);
            }
            this.f8347a = 0L;
        }
    }

    protected final void finalize() {
        m5089a();
    }
}
