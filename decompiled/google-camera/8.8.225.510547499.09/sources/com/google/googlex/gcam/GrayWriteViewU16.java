package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GrayWriteViewU16 {

    /* JADX INFO: renamed from: a */
    public transient long f8281a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8282b;

    public GrayWriteViewU16() {
        this(GcamModuleJNI.new_GrayWriteViewU16__SWIG_0());
    }

    public GrayWriteViewU16(long j) {
        this.f8282b = true;
        this.f8281a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4989a() {
        long j = this.f8281a;
        if (j != 0) {
            if (this.f8282b) {
                this.f8282b = false;
                GcamModuleJNI.delete_GrayWriteViewU16(j);
            }
            this.f8281a = 0L;
        }
    }

    protected final void finalize() {
        m4989a();
    }
}
