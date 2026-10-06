package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class JpgEncodeOptions {

    /* JADX INFO: renamed from: a */
    public transient long f8308a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8309b;

    public JpgEncodeOptions() {
        long jNew_JpgEncodeOptions = GcamModuleJNI.new_JpgEncodeOptions();
        this.f8309b = true;
        this.f8308a = jNew_JpgEncodeOptions;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5023a() {
        long j = this.f8308a;
        if (j != 0) {
            if (this.f8309b) {
                this.f8309b = false;
                GcamModuleJNI.delete_JpgEncodeOptions(j);
            }
            this.f8308a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5024b(ShotMetadata shotMetadata) {
        GcamModuleJNI.JpgEncodeOptions_shot_metadata_set(this.f8308a, this, ShotMetadata.m5095a(shotMetadata), shotMetadata);
    }

    protected final void finalize() {
        m5023a();
    }
}
