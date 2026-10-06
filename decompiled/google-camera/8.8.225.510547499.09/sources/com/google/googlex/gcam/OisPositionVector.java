package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class OisPositionVector {

    /* JADX INFO: renamed from: a */
    public transient long f8328a;

    public OisPositionVector() {
        this(GcamModuleJNI.new_OisPositionVector__SWIG_0());
    }

    public OisPositionVector(long j) {
        this.f8328a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5058a() {
        if (this.f8328a != 0) {
            this.f8328a = 0L;
        }
    }

    protected final void finalize() {
        m5058a();
    }
}
