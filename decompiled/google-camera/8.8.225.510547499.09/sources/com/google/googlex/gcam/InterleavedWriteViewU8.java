package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedWriteViewU8 {

    /* JADX INFO: renamed from: a */
    public transient long f8304a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8305b;

    public InterleavedWriteViewU8() {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_0());
    }

    public InterleavedWriteViewU8(long j) {
        this.f8305b = true;
        this.f8304a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m5019a(InterleavedWriteViewU8 interleavedWriteViewU8) {
        if (interleavedWriteViewU8 == null) {
            return 0L;
        }
        return interleavedWriteViewU8.f8304a;
    }

    /* JADX INFO: renamed from: b */
    public final InterleavedReadViewU8 m5020b() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedWriteViewU8_read_view(this.f8304a, this));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5021c() {
        long j = this.f8304a;
        if (j != 0) {
            if (this.f8305b) {
                this.f8305b = false;
                GcamModuleJNI.delete_InterleavedWriteViewU8(j);
            }
            this.f8304a = 0L;
        }
    }

    protected final void finalize() {
        m5021c();
    }
}
