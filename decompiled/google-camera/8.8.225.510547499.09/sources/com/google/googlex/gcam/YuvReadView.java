package com.google.googlex.gcam;

import p000.nsh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YuvReadView {

    /* JADX INFO: renamed from: a */
    public transient long f8391a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8392b;

    public YuvReadView() {
        this(GcamModuleJNI.new_YuvReadView__SWIG_0());
    }

    public YuvReadView(long j) {
        this.f8392b = true;
        this.f8391a = j;
    }

    public YuvReadView(YuvReadView yuvReadView) {
        this(GcamModuleJNI.new_YuvReadView__SWIG_1(yuvReadView.f8391a, yuvReadView));
    }

    /* JADX INFO: renamed from: a */
    public final nsh m5148a() {
        return nsh.m17644a(GcamModuleJNI.YuvReadView_yuv_format(this.f8391a, this));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5149b() {
        long j = this.f8391a;
        if (j != 0) {
            if (this.f8392b) {
                this.f8392b = false;
                GcamModuleJNI.delete_YuvReadView(j);
            }
            this.f8391a = 0L;
        }
    }

    protected final void finalize() {
        m5149b();
    }
}
