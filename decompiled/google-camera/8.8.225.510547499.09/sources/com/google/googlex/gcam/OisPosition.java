package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OisPosition {

    /* JADX INFO: renamed from: a */
    public transient long f8326a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8327b;

    public OisPosition() {
        long jNew_OisPosition = GcamModuleJNI.new_OisPosition();
        this.f8327b = true;
        this.f8326a = jNew_OisPosition;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5057a() {
        long j = this.f8326a;
        if (j != 0) {
            if (this.f8327b) {
                this.f8327b = false;
                GcamModuleJNI.delete_OisPosition(j);
            }
            this.f8326a = 0L;
        }
    }

    protected final void finalize() {
        m5057a();
    }
}
