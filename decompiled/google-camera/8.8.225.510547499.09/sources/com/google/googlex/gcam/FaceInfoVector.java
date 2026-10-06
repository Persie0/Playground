package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FaceInfoVector {

    /* JADX INFO: renamed from: a */
    public transient long f8251a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8252b;

    public FaceInfoVector() {
        this(GcamModuleJNI.new_FaceInfoVector__SWIG_0(), true);
    }

    public FaceInfoVector(long j, boolean z) {
        this.f8252b = z;
        this.f8251a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m4936a() {
        return GcamModuleJNI.FaceInfoVector_size(this.f8251a, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m4937b(FaceInfo faceInfo) {
        GcamModuleJNI.FaceInfoVector_add(this.f8251a, this, faceInfo.f8247a, faceInfo);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4938c() {
        long j = this.f8251a;
        if (j != 0) {
            if (this.f8252b) {
                this.f8252b = false;
                GcamModuleJNI.delete_FaceInfoVector(j);
            }
            this.f8251a = 0L;
        }
    }

    protected final void finalize() {
        m4938c();
    }
}
