package com.google.googlex.gcam;

import p000.nrg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PortraitRequest {

    /* JADX INFO: renamed from: a */
    public transient long f8338a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8339b;

    public PortraitRequest() {
        long jNew_PortraitRequest = GcamModuleJNI.new_PortraitRequest();
        this.f8339b = true;
        this.f8338a = jNew_PortraitRequest;
    }

    /* JADX INFO: renamed from: a */
    public final PixelRectVector m5076a() {
        long jPortraitRequest_faces_get = GcamModuleJNI.PortraitRequest_faces_get(this.f8338a, this);
        if (jPortraitRequest_faces_get == 0) {
            return null;
        }
        return new PixelRectVector(jPortraitRequest_faces_get, false);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5077b() {
        long j = this.f8338a;
        if (j != 0) {
            if (this.f8339b) {
                this.f8339b = false;
                GcamModuleJNI.delete_PortraitRequest(j);
            }
            this.f8338a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5078c(nrg nrgVar) {
        GcamModuleJNI.PortraitRequest_depth_processing_set(this.f8338a, this, nrgVar.f44186d);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5079d() {
        return GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_get(this.f8338a, this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5080e() {
        return GcamModuleJNI.PortraitRequest_use_gpu_resample_get(this.f8338a, this);
    }

    protected final void finalize() {
        m5077b();
    }
}
