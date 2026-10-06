package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class WeightedNormalizedRect {

    /* JADX INFO: renamed from: a */
    public transient long f8383a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8384b;

    public WeightedNormalizedRect() {
        long jNew_WeightedNormalizedRect = GcamModuleJNI.new_WeightedNormalizedRect();
        this.f8384b = true;
        this.f8383a = jNew_WeightedNormalizedRect;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5140a() {
        long j = this.f8383a;
        if (j != 0) {
            if (this.f8384b) {
                this.f8384b = false;
                GcamModuleJNI.delete_WeightedNormalizedRect(j);
            }
            this.f8383a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5141b(float f) {
        GcamModuleJNI.WeightedNormalizedRect_weight_set(this.f8383a, this, f);
    }

    protected final void finalize() {
        m5140a();
    }
}
