package com.google.googlex.gcam;

import p000.nsh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YuvImage {

    /* JADX INFO: renamed from: a */
    public transient long f8389a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8390b;

    public YuvImage(int i, int i2, nsh nshVar) {
        this(GcamModuleJNI.new_YuvImage__SWIG_0(i, i2, nshVar.f44398d));
    }

    public YuvImage(long j) {
        this.f8390b = true;
        this.f8389a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5147a() {
        long j = this.f8389a;
        if (j != 0) {
            if (this.f8390b) {
                this.f8390b = false;
                GcamModuleJNI.delete_YuvImage(j);
            }
            this.f8389a = 0L;
        }
    }

    protected final void finalize() {
        m5147a();
    }
}
