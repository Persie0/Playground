package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WeightedNormalizedRectVector {

    /* JADX INFO: renamed from: a */
    public transient long f8385a;

    public WeightedNormalizedRectVector() {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0());
    }

    public WeightedNormalizedRectVector(long j) {
        this.f8385a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m5142a() {
        return GcamModuleJNI.WeightedNormalizedRectVector_size(this.f8385a, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5143b(WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_add(this.f8385a, this, weightedNormalizedRect.f8383a, weightedNormalizedRect);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5144c() {
        if (this.f8385a != 0) {
            this.f8385a = 0L;
        }
    }

    protected final void finalize() {
        m5144c();
    }
}
