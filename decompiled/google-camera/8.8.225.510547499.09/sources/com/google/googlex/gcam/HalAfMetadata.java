package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class HalAfMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8287a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8288b;

    public HalAfMetadata() {
        this(GcamModuleJNI.new_HalAfMetadata(), true);
    }

    public HalAfMetadata(long j, boolean z) {
        this.f8288b = z;
        this.f8287a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4992a() {
        long j = this.f8287a;
        if (j != 0) {
            if (this.f8288b) {
                this.f8288b = false;
                GcamModuleJNI.delete_HalAfMetadata(j);
            }
            this.f8287a = 0L;
        }
    }

    protected final void finalize() {
        m4992a();
    }
}
