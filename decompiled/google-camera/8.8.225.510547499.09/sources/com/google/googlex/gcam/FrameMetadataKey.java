package com.google.googlex.gcam;

import p000.nse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetadataKey {

    /* JADX INFO: renamed from: a */
    public transient long f8265a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8266b;

    public FrameMetadataKey(long j, nse nseVar) {
        long jNew_FrameMetadataKey = GcamModuleJNI.new_FrameMetadataKey(j, nseVar.f44379q);
        this.f8266b = true;
        this.f8265a = jNew_FrameMetadataKey;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4964a() {
        long j = this.f8265a;
        if (j != 0) {
            if (this.f8266b) {
                this.f8266b = false;
                GcamModuleJNI.delete_FrameMetadataKey(j);
            }
            this.f8265a = 0L;
        }
    }

    protected final void finalize() {
        m4964a();
    }
}
