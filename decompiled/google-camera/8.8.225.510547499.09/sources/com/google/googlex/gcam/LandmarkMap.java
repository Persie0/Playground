package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LandmarkMap {

    /* JADX INFO: renamed from: a */
    private transient long f8310a;

    public LandmarkMap() {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_0());
    }

    public LandmarkMap(long j) {
        this.f8310a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5025a() {
        if (this.f8310a != 0) {
            this.f8310a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5026b(int i, FaceInfo.Landmark landmark) {
        GcamModuleJNI.LandmarkMap_set(this.f8310a, this, i, landmark.f8249a, landmark);
    }

    protected final void finalize() {
        m5025a();
    }
}
