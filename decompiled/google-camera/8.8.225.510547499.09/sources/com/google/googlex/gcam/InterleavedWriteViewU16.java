package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedWriteViewU16 {

    /* JADX INFO: renamed from: a */
    public transient long f8302a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8303b;

    public InterleavedWriteViewU16() {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_0());
    }

    public InterleavedWriteViewU16(long j) {
        this.f8303b = true;
        this.f8302a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5018a() {
        long j = this.f8302a;
        if (j != 0) {
            if (this.f8303b) {
                this.f8303b = false;
                GcamModuleJNI.delete_InterleavedWriteViewU16(j);
            }
            this.f8302a = 0L;
        }
    }

    protected final void finalize() {
        m5018a();
    }
}
