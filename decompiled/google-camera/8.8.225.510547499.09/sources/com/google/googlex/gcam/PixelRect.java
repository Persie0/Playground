package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PixelRect {

    /* JADX INFO: renamed from: a */
    public transient long f8331a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8332b;

    public PixelRect() {
        this(GcamModuleJNI.new_PixelRect(), true);
    }

    public PixelRect(long j, boolean z) {
        this.f8332b = z;
        this.f8331a = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m5063a() {
        return GcamModuleJNI.PixelRect_x0_get(this.f8331a, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m5064b() {
        return GcamModuleJNI.PixelRect_y0_get(this.f8331a, this);
    }

    /* JADX INFO: renamed from: c */
    public final int m5065c() {
        return GcamModuleJNI.PixelRect_height(this.f8331a, this);
    }

    /* JADX INFO: renamed from: d */
    public final int m5066d() {
        return GcamModuleJNI.PixelRect_width(this.f8331a, this);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5067e() {
        long j = this.f8331a;
        if (j != 0) {
            if (this.f8332b) {
                this.f8332b = false;
                GcamModuleJNI.delete_PixelRect(j);
            }
            this.f8331a = 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5068f(int i) {
        GcamModuleJNI.PixelRect_x0_set(this.f8331a, this, i);
    }

    protected final void finalize() {
        m5067e();
    }

    /* JADX INFO: renamed from: g */
    public final void m5069g(int i) {
        GcamModuleJNI.PixelRect_x1_set(this.f8331a, this, i);
    }

    /* JADX INFO: renamed from: h */
    public final void m5070h(int i) {
        GcamModuleJNI.PixelRect_y0_set(this.f8331a, this, i);
    }

    /* JADX INFO: renamed from: i */
    public final void m5071i(int i) {
        GcamModuleJNI.PixelRect_y1_set(this.f8331a, this, i);
    }
}
