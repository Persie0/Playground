package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DirtyLensHistory {

    /* JADX INFO: renamed from: a */
    public transient long f8241a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8242b;

    public DirtyLensHistory() {
        long jNew_DirtyLensHistory = GcamModuleJNI.new_DirtyLensHistory();
        this.f8242b = true;
        this.f8241a = jNew_DirtyLensHistory;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4921a() {
        long j = this.f8241a;
        if (j != 0) {
            if (this.f8242b) {
                this.f8242b = false;
                GcamModuleJNI.delete_DirtyLensHistory(j);
            }
            this.f8241a = 0L;
        }
    }

    protected final void finalize() {
        m4921a();
    }
}
