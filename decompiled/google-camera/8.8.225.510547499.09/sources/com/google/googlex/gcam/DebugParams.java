package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DebugParams {

    /* JADX INFO: renamed from: a */
    protected transient boolean f8239a;

    /* JADX INFO: renamed from: b */
    private transient long f8240b;

    public DebugParams() {
        long jNew_DebugParams = GcamModuleJNI.new_DebugParams();
        this.f8239a = true;
        this.f8240b = jNew_DebugParams;
    }

    /* JADX INFO: renamed from: a */
    public static long m4917a(DebugParams debugParams) {
        if (debugParams == null) {
            return 0L;
        }
        return debugParams.f8240b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4918b() {
        long j = this.f8240b;
        if (j != 0) {
            if (this.f8239a) {
                this.f8239a = false;
                GcamModuleJNI.delete_DebugParams(j);
            }
            this.f8240b = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4919c(ImageSaverParams imageSaverParams) {
        GcamModuleJNI.DebugParams_image_saver_params_set(this.f8240b, this, imageSaverParams.f8289a, imageSaverParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m4920d(long j) {
        GcamModuleJNI.DebugParams_save_bitmask_set(this.f8240b, this, j);
    }

    protected final void finalize() {
        m4918b();
    }
}
