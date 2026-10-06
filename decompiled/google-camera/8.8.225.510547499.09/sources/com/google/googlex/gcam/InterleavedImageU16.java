package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageU16 {

    /* JADX INFO: renamed from: a */
    public transient long f8294a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8295b;

    public InterleavedImageU16() {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_0());
    }

    public InterleavedImageU16(long j) {
        this.f8295b = true;
        this.f8294a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5000a() {
        long j = this.f8294a;
        if (j != 0) {
            if (this.f8295b) {
                this.f8295b = false;
                GcamModuleJNI.delete_InterleavedImageU16(j);
            }
            this.f8294a = 0L;
        }
    }

    protected final void finalize() {
        m5000a();
    }
}
