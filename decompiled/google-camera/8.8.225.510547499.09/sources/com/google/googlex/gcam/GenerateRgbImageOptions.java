package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class GenerateRgbImageOptions {

    /* JADX INFO: renamed from: a */
    public transient long f8273a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8274b;

    public GenerateRgbImageOptions() {
        long jNew_GenerateRgbImageOptions = GcamModuleJNI.new_GenerateRgbImageOptions();
        this.f8274b = true;
        this.f8273a = jNew_GenerateRgbImageOptions;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4978a() {
        long j = this.f8273a;
        if (j != 0) {
            if (this.f8274b) {
                this.f8274b = false;
                GcamModuleJNI.delete_GenerateRgbImageOptions(j);
            }
            this.f8273a = 0L;
        }
    }

    protected final void finalize() {
        m4978a();
    }
}
