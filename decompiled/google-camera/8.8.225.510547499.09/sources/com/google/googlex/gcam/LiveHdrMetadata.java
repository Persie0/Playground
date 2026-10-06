package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LiveHdrMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8311a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8312b;

    public LiveHdrMetadata() {
        this(GcamModuleJNI.new_LiveHdrMetadata(), true);
    }

    public LiveHdrMetadata(long j, boolean z) {
        this.f8312b = z;
        this.f8311a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5027a() {
        long j = this.f8311a;
        if (j != 0) {
            if (this.f8312b) {
                this.f8312b = false;
                GcamModuleJNI.delete_LiveHdrMetadata(j);
            }
            this.f8311a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5028b(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_set(this.f8311a, this, f);
    }

    /* JADX INFO: renamed from: c */
    public final void m5029c(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_set(this.f8311a, this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m5030d(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_set(this.f8311a, this, f);
    }

    /* JADX INFO: renamed from: e */
    public final void m5031e(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_portrait_tet_set(this.f8311a, this, f);
    }

    /* JADX INFO: renamed from: f */
    public final void m5032f(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_set(this.f8311a, this, f);
    }

    protected final void finalize() {
        m5027a();
    }
}
