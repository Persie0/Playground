package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StringStaticMetadataMap {

    /* JADX INFO: renamed from: a */
    public transient long f8374a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8375b;

    public StringStaticMetadataMap() {
        this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
    }

    public StringStaticMetadataMap(long j, boolean z) {
        this.f8375b = z;
        this.f8374a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5133a() {
        long j = this.f8374a;
        if (j != 0) {
            if (this.f8375b) {
                this.f8375b = false;
                GcamModuleJNI.delete_StringStaticMetadataMap(j);
            }
            this.f8374a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5134b(String str, StaticMetadata staticMetadata) {
        GcamModuleJNI.StringStaticMetadataMap_set(this.f8374a, this, str, StaticMetadata.m5118a(staticMetadata), staticMetadata);
    }

    protected final void finalize() {
        m5133a();
    }
}
