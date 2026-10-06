package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AwbInfo {

    /* JADX INFO: renamed from: a */
    public transient long f8229a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8230b;

    public AwbInfo() {
        this(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
    }

    public AwbInfo(long j, boolean z) {
        this.f8230b = z;
        this.f8229a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m4899a(AwbInfo awbInfo) {
        if (awbInfo == null) {
            return 0L;
        }
        return awbInfo.f8229a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4900b() {
        long j = this.f8229a;
        if (j != 0) {
            if (this.f8230b) {
                this.f8230b = false;
                GcamModuleJNI.delete_AwbInfo(j);
            }
            this.f8229a = 0L;
        }
    }

    protected final void finalize() {
        m4900b();
    }
}
