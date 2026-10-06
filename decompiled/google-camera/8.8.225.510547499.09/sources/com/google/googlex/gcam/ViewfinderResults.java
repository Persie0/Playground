package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ViewfinderResults {

    /* JADX INFO: renamed from: a */
    public transient long f8381a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8382b;

    public ViewfinderResults() {
        this(GcamModuleJNI.new_ViewfinderResults());
    }

    public ViewfinderResults(long j) {
        this.f8382b = true;
        this.f8381a = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m5138a() {
        return GcamModuleJNI.ViewfinderResults_gyro_speed_rad_per_sec_get(this.f8381a, this);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5139b() {
        long j = this.f8381a;
        if (j != 0) {
            if (this.f8382b) {
                this.f8382b = false;
                GcamModuleJNI.delete_ViewfinderResults(j);
            }
            this.f8381a = 0L;
        }
    }

    protected final void finalize() {
        m5139b();
    }
}
