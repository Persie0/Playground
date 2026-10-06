package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PixelRectVector {

    /* JADX INFO: renamed from: a */
    public transient long f8333a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8334b;

    public PixelRectVector() {
        this(GcamModuleJNI.new_PixelRectVector__SWIG_0(), true);
    }

    public PixelRectVector(long j, boolean z) {
        this.f8334b = z;
        this.f8333a = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m5072a(PixelRect pixelRect) {
        GcamModuleJNI.PixelRectVector_add(this.f8333a, this, pixelRect.f8331a, pixelRect);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5073b() {
        long j = this.f8333a;
        if (j != 0) {
            if (this.f8334b) {
                this.f8334b = false;
                GcamModuleJNI.delete_PixelRectVector(j);
            }
            this.f8333a = 0L;
        }
    }

    protected final void finalize() {
        m5073b();
    }
}
