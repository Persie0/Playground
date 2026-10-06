package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedImageU8 {

    /* JADX INFO: renamed from: a */
    protected transient boolean f8296a;

    /* JADX INFO: renamed from: b */
    private transient long f8297b;

    public InterleavedImageU8() {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_0());
    }

    public InterleavedImageU8(long j) {
        this.f8296a = true;
        this.f8297b = j;
    }

    /* JADX INFO: renamed from: d */
    public static long m5001d(InterleavedImageU8 interleavedImageU8) {
        if (interleavedImageU8 == null) {
            return 0L;
        }
        return interleavedImageU8.f8297b;
    }

    /* JADX INFO: renamed from: a */
    public final int m5002a() {
        return GcamModuleJNI.InterleavedImageU8_channels(this.f8297b, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m5003b() {
        return GcamModuleJNI.InterleavedImageU8_height(this.f8297b, this);
    }

    /* JADX INFO: renamed from: c */
    public final int m5004c() {
        return GcamModuleJNI.InterleavedImageU8_width(this.f8297b, this);
    }

    /* JADX INFO: renamed from: e */
    public final InterleavedReadViewU8 m5005e() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedImageU8_read_view(this.f8297b, this));
    }

    /* JADX INFO: renamed from: f */
    public final InterleavedWriteViewU8 m5006f() {
        return new InterleavedWriteViewU8(GcamModuleJNI.InterleavedImageU8_write_view(this.f8297b, this));
    }

    protected final void finalize() {
        m5007g();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5007g() {
        long j = this.f8297b;
        if (j != 0) {
            if (this.f8296a) {
                this.f8296a = false;
                GcamModuleJNI.delete_InterleavedImageU8(j);
            }
            this.f8297b = 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5008h() {
        return GcamModuleJNI.InterleavedImageU8_empty(this.f8297b, this);
    }

    public InterleavedImageU8(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_1(i, i2, i3));
    }
}
