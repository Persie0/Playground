package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FrameRequestVector {

    /* JADX INFO: renamed from: a */
    public transient long f8269a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8270b;

    public FrameRequestVector() {
        this(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
    }

    public FrameRequestVector(long j, boolean z) {
        this.f8270b = z;
        this.f8269a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m4967a() {
        return GcamModuleJNI.FrameRequestVector_size(this.f8269a, this);
    }

    /* JADX INFO: renamed from: b */
    public final FrameRequest m4968b(int i) {
        return new FrameRequest(GcamModuleJNI.FrameRequestVector_get(this.f8269a, this, i), false);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4969c() {
        long j = this.f8269a;
        if (j != 0) {
            if (this.f8270b) {
                this.f8270b = false;
                GcamModuleJNI.delete_FrameRequestVector(j);
            }
            this.f8269a = 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4970d() {
        return GcamModuleJNI.FrameRequestVector_isEmpty(this.f8269a, this);
    }

    protected final void finalize() {
        m4969c();
    }
}
