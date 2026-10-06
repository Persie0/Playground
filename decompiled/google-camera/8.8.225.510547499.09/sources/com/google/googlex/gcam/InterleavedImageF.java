package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageF {

    /* JADX INFO: renamed from: a */
    private transient long f8293a;

    public InterleavedImageF() {
        this(GcamModuleJNI.new_InterleavedImageF());
    }

    public InterleavedImageF(long j) {
        this.f8293a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m4998a(InterleavedImageF interleavedImageF) {
        if (interleavedImageF == null) {
            return 0L;
        }
        return interleavedImageF.f8293a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4999b() {
        if (this.f8293a != 0) {
            this.f8293a = 0L;
        }
    }

    protected final void finalize() {
        m4999b();
    }
}
