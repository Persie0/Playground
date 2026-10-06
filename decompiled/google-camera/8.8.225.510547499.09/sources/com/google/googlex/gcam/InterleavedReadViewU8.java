package com.google.googlex.gcam;

import p000.nsd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InterleavedReadViewU8 {

    /* JADX INFO: renamed from: a */
    public transient long f8300a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8301b;

    public InterleavedReadViewU8() {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_0());
    }

    public InterleavedReadViewU8(long j) {
        this.f8301b = true;
        this.f8300a = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m5010a() {
        return GcamModuleJNI.InterleavedReadViewU8_c_stride(this.f8300a, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m5011b() {
        return GcamModuleJNI.InterleavedReadViewU8_channels(this.f8300a, this);
    }

    /* JADX INFO: renamed from: c */
    public final int m5012c() {
        return GcamModuleJNI.InterleavedReadViewU8_height(this.f8300a, this);
    }

    /* JADX INFO: renamed from: d */
    public final int m5013d() {
        return GcamModuleJNI.InterleavedReadViewU8_width(this.f8300a, this);
    }

    /* JADX INFO: renamed from: e */
    public final int m5014e() {
        return GcamModuleJNI.InterleavedReadViewU8_x_stride(this.f8300a, this);
    }

    /* JADX INFO: renamed from: f */
    public final int m5015f() {
        return GcamModuleJNI.InterleavedReadViewU8_y_stride(this.f8300a, this);
    }

    protected final void finalize() {
        m5017h();
    }

    /* JADX INFO: renamed from: g */
    public final nsd m5016g() {
        long jInterleavedReadViewU8_data = GcamModuleJNI.InterleavedReadViewU8_data(this.f8300a, this);
        if (jInterleavedReadViewU8_data == 0) {
            return null;
        }
        return new nsd(jInterleavedReadViewU8_data);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m5017h() {
        long j = this.f8300a;
        if (j != 0) {
            if (this.f8301b) {
                this.f8301b = false;
                GcamModuleJNI.delete_InterleavedReadViewU8(j);
            }
            this.f8300a = 0L;
        }
    }
}
