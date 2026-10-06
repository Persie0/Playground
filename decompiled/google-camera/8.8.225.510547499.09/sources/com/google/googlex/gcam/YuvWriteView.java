package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YuvWriteView {

    /* JADX INFO: renamed from: b */
    public transient long f8393b;

    /* JADX INFO: renamed from: c */
    protected transient boolean f8394c;

    public YuvWriteView() {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_0());
    }

    public YuvWriteView(long j) {
        this.f8394c = true;
        this.f8393b = j;
    }

    /* JADX INFO: renamed from: c */
    public static long m5150c(YuvWriteView yuvWriteView) {
        if (yuvWriteView == null) {
            return 0L;
        }
        return yuvWriteView.f8393b;
    }

    /* JADX INFO: renamed from: a */
    public final int m5151a() {
        return GcamModuleJNI.YuvWriteView_height(this.f8393b, this);
    }

    /* JADX INFO: renamed from: b */
    public final int m5152b() {
        return GcamModuleJNI.YuvWriteView_width(this.f8393b, this);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5153d() {
        long j = this.f8393b;
        if (j != 0) {
            if (this.f8394c) {
                this.f8394c = false;
                GcamModuleJNI.delete_YuvWriteView(j);
            }
            this.f8393b = 0L;
        }
    }

    protected final void finalize() {
        m5153d();
    }
}
