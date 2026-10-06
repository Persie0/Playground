package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GrayReadViewU8 {

    /* JADX INFO: renamed from: a */
    public transient long f8279a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8280b;

    public GrayReadViewU8() {
        this(GcamModuleJNI.new_GrayReadViewU8__SWIG_0());
    }

    public GrayReadViewU8(long j) {
        this.f8280b = true;
        this.f8279a = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m4986a() {
        return GcamModuleJNI.GrayReadViewU8_x_stride(this.f8279a, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m4987b() {
        return GcamModuleJNI.GrayReadViewU8_y_stride(this.f8279a, this);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4988c() {
        long j = this.f8279a;
        if (j != 0) {
            if (this.f8280b) {
                this.f8280b = false;
                GcamModuleJNI.delete_GrayReadViewU8(j);
            }
            this.f8279a = 0L;
        }
    }

    protected final void finalize() {
        m4988c();
    }
}
