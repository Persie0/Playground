package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AeMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8221a;

    public AeMetadata() {
        this(GcamModuleJNI.new_AeMetadata());
    }

    public AeMetadata(long j) {
        this.f8221a = j;
    }

    /* JADX INFO: renamed from: a */
    public final WeightedPixelRectVector m4875a() {
        long jAeMetadata_metering_rectangles_get = GcamModuleJNI.AeMetadata_metering_rectangles_get(this.f8221a, this);
        if (jAeMetadata_metering_rectangles_get == 0) {
            return null;
        }
        return new WeightedPixelRectVector(jAeMetadata_metering_rectangles_get);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4876b() {
        if (this.f8221a != 0) {
            this.f8221a = 0L;
        }
    }

    protected final void finalize() {
        m4876b();
    }
}
