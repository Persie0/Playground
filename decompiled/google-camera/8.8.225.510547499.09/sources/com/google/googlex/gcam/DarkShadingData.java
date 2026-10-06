package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DarkShadingData {

    /* JADX INFO: renamed from: a */
    public transient long f8238a;

    public DarkShadingData() {
        this(GcamModuleJNI.new_DarkShadingData());
    }

    public DarkShadingData(long j) {
        this.f8238a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4916a() {
        if (this.f8238a != 0) {
            this.f8238a = 0L;
        }
    }

    protected final void finalize() {
        m4916a();
    }
}
