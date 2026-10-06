package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AwbMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8231a;

    public AwbMetadata() {
        this(GcamModuleJNI.new_AwbMetadata());
    }

    public AwbMetadata(long j) {
        this.f8231a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4901a() {
        if (this.f8231a != 0) {
            this.f8231a = 0L;
        }
    }

    protected final void finalize() {
        m4901a();
    }
}
