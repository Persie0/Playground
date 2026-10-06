package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WeightedPixelRect {

    /* JADX INFO: renamed from: a */
    public transient long f8386a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8387b;

    public WeightedPixelRect() {
        long jNew_WeightedPixelRect = GcamModuleJNI.new_WeightedPixelRect();
        this.f8387b = true;
        this.f8386a = jNew_WeightedPixelRect;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5145a() {
        long j = this.f8386a;
        if (j != 0) {
            if (this.f8387b) {
                this.f8387b = false;
                GcamModuleJNI.delete_WeightedPixelRect(j);
            }
            this.f8386a = 0L;
        }
    }

    protected final void finalize() {
        m5145a();
    }
}
