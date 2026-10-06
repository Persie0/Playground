package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedReadViewU16 {

    /* JADX INFO: renamed from: a */
    public transient long f8298a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8299b;

    public InterleavedReadViewU16() {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_0());
    }

    public InterleavedReadViewU16(long j) {
        this.f8299b = true;
        this.f8298a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5009a() {
        long j = this.f8298a;
        if (j != 0) {
            if (this.f8299b) {
                this.f8299b = false;
                GcamModuleJNI.delete_InterleavedReadViewU16(j);
            }
            this.f8298a = 0L;
        }
    }

    protected final void finalize() {
        m5009a();
    }
}
