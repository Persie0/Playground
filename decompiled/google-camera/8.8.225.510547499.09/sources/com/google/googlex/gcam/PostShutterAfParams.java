package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PostShutterAfParams {

    /* JADX INFO: renamed from: a */
    public transient long f8340a;

    public PostShutterAfParams() {
        this(GcamModuleJNI.new_PostShutterAfParams());
    }

    public PostShutterAfParams(long j) {
        this.f8340a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5081a() {
        if (this.f8340a != 0) {
            this.f8340a = 0L;
        }
    }

    protected final void finalize() {
        m5081a();
    }
}
