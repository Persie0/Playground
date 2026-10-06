package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MeshTranslation {

    /* JADX INFO: renamed from: a */
    public transient long f8316a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8317b;

    public MeshTranslation() {
        this(GcamModuleJNI.new_MeshTranslation());
    }

    public MeshTranslation(long j) {
        this.f8317b = true;
        this.f8316a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5043a() {
        long j = this.f8316a;
        if (j != 0) {
            if (this.f8317b) {
                this.f8317b = false;
                GcamModuleJNI.delete_MeshTranslation(j);
            }
            this.f8316a = 0L;
        }
    }

    protected final void finalize() {
        m5043a();
    }
}
