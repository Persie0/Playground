package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StringFrameMetadataMap {

    /* JADX INFO: renamed from: a */
    public transient long f8369a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8370b;

    public StringFrameMetadataMap() {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
    }

    public StringFrameMetadataMap(long j, boolean z) {
        this.f8370b = z;
        this.f8369a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5128a() {
        long j = this.f8369a;
        if (j != 0) {
            if (this.f8370b) {
                this.f8370b = false;
                GcamModuleJNI.delete_StringFrameMetadataMap(j);
            }
            this.f8369a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5129b(String str, FrameMetadata frameMetadata) {
        GcamModuleJNI.StringFrameMetadataMap_set(this.f8369a, this, str, FrameMetadata.m4951b(frameMetadata), frameMetadata);
    }

    protected final void finalize() {
        m5128a();
    }
}
