package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StaticMetadataVector {

    /* JADX INFO: renamed from: a */
    public transient long f8366a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8367b;

    public StaticMetadataVector() {
        long jNew_StaticMetadataVector__SWIG_0 = GcamModuleJNI.new_StaticMetadataVector__SWIG_0();
        this.f8367b = true;
        this.f8366a = jNew_StaticMetadataVector__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5125a(StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_add(this.f8366a, this, StaticMetadata.m5118a(staticMetadata), staticMetadata);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5126b() {
        long j = this.f8366a;
        if (j != 0) {
            if (this.f8367b) {
                this.f8367b = false;
                GcamModuleJNI.delete_StaticMetadataVector(j);
            }
            this.f8366a = 0L;
        }
    }

    protected final void finalize() {
        m5126b();
    }
}
