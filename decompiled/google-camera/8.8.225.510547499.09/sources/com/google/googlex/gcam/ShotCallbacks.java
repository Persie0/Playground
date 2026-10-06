package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ShotCallbacks {

    /* JADX INFO: renamed from: a */
    public transient long f8354a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8355b;

    public ShotCallbacks() {
        long jNew_ShotCallbacks = GcamModuleJNI.new_ShotCallbacks();
        this.f8355b = true;
        this.f8354a = jNew_ShotCallbacks;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5094a() {
        long j = this.f8354a;
        if (j != 0) {
            if (this.f8355b) {
                this.f8355b = false;
                GcamModuleJNI.delete_ShotCallbacks(j);
            }
            this.f8354a = 0L;
        }
    }

    protected final void finalize() {
        m5094a();
    }
}
