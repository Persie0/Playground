package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NormalizedRect {

    /* JADX INFO: renamed from: a */
    public transient long f8322a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8323b;

    public NormalizedRect() {
        this(GcamModuleJNI.new_NormalizedRect(), true);
    }

    public NormalizedRect(long j, boolean z) {
        this.f8323b = z;
        this.f8322a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m5050a(NormalizedRect normalizedRect) {
        if (normalizedRect == null) {
            return 0L;
        }
        return normalizedRect.f8322a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5051b() {
        long j = this.f8322a;
        if (j != 0) {
            if (this.f8323b) {
                this.f8323b = false;
                GcamModuleJNI.delete_NormalizedRect(j);
            }
            this.f8322a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5052c(float f) {
        GcamModuleJNI.NormalizedRect_x0_set(this.f8322a, this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m5053d(float f) {
        GcamModuleJNI.NormalizedRect_x1_set(this.f8322a, this, f);
    }

    /* JADX INFO: renamed from: e */
    public final void m5054e(float f) {
        GcamModuleJNI.NormalizedRect_y0_set(this.f8322a, this, f);
    }

    /* JADX INFO: renamed from: f */
    public final void m5055f(float f) {
        GcamModuleJNI.NormalizedRect_y1_set(this.f8322a, this, f);
    }

    protected final void finalize() {
        m5051b();
    }
}
