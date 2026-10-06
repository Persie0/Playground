package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SpatialGainMap {

    /* JADX INFO: renamed from: a */
    public transient long f8362a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8363b;

    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0());
    }

    public SpatialGainMap(long j) {
        this.f8363b = true;
        this.f8362a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5117a() {
        long j = this.f8362a;
        if (j != 0) {
            if (this.f8363b) {
                this.f8363b = false;
                GcamModuleJNI.delete_SpatialGainMap(j);
            }
            this.f8362a = 0L;
        }
    }

    protected final void finalize() {
        m5117a();
    }
}
