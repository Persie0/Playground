package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OisMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8324a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8325b;

    public OisMetadata() {
        long jNew_OisMetadata = GcamModuleJNI.new_OisMetadata();
        this.f8325b = true;
        this.f8324a = jNew_OisMetadata;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5056a() {
        long j = this.f8324a;
        if (j != 0) {
            if (this.f8325b) {
                this.f8325b = false;
                GcamModuleJNI.delete_OisMetadata(j);
            }
            this.f8324a = 0L;
        }
    }

    protected final void finalize() {
        m5056a();
    }
}
