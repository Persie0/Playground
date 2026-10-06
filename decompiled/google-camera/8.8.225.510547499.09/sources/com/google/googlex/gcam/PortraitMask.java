package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PortraitMask {

    /* JADX INFO: renamed from: a */
    public transient long f8335a;

    public PortraitMask() {
        this(GcamModuleJNI.new_PortraitMask());
    }

    public PortraitMask(long j) {
        this.f8335a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5074a() {
        if (this.f8335a != 0) {
            this.f8335a = 0L;
        }
    }

    protected final void finalize() {
        m5074a();
    }
}
