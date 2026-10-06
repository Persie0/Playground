package com.google.googlex.gcam;

import p000.nrx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PostviewParams {

    /* JADX INFO: renamed from: a */
    public transient long f8341a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8342b;

    public PostviewParams() {
        long jNew_PostviewParams = GcamModuleJNI.new_PostviewParams();
        this.f8342b = true;
        this.f8341a = jNew_PostviewParams;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5082a() {
        long j = this.f8341a;
        if (j != 0) {
            if (this.f8342b) {
                this.f8342b = false;
                GcamModuleJNI.delete_PostviewParams(j);
            }
            this.f8341a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5083b(nrx nrxVar) {
        GcamModuleJNI.PostviewParams_pixel_format_set(this.f8341a, this, nrxVar.f44321l);
    }

    /* JADX INFO: renamed from: c */
    public final void m5084c(int i) {
        GcamModuleJNI.PostviewParams_target_height_set(this.f8341a, this, i);
    }

    /* JADX INFO: renamed from: d */
    public final void m5085d(int i) {
        GcamModuleJNI.PostviewParams_target_width_set(this.f8341a, this, i);
    }

    protected final void finalize() {
        m5082a();
    }
}
