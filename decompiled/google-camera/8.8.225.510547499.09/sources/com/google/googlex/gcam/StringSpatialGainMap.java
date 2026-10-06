package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class StringSpatialGainMap {

    /* JADX INFO: renamed from: a */
    public transient long f8373a;

    public StringSpatialGainMap() {
        this(GcamModuleJNI.new_StringSpatialGainMap__SWIG_0());
    }

    public StringSpatialGainMap(long j) {
        this.f8373a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5132a() {
        if (this.f8373a != 0) {
            this.f8373a = 0L;
        }
    }

    protected final void finalize() {
        m5132a();
    }
}
