package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class WeightedPixelRectVector {

    /* JADX INFO: renamed from: a */
    public transient long f8388a;

    public WeightedPixelRectVector() {
        this(GcamModuleJNI.new_WeightedPixelRectVector__SWIG_0());
    }

    public WeightedPixelRectVector(long j) {
        this.f8388a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5146a() {
        if (this.f8388a != 0) {
            this.f8388a = 0L;
        }
    }

    protected final void finalize() {
        m5146a();
    }
}
