package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class IspAwbMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8306a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8307b;

    public IspAwbMetadata() {
        this(GcamModuleJNI.new_IspAwbMetadata());
    }

    public IspAwbMetadata(long j) {
        this.f8307b = true;
        this.f8306a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5022a() {
        long j = this.f8306a;
        if (j != 0) {
            if (this.f8307b) {
                this.f8307b = false;
                GcamModuleJNI.delete_IspAwbMetadata(j);
            }
            this.f8306a = 0L;
        }
    }

    protected final void finalize() {
        m5022a();
    }
}
