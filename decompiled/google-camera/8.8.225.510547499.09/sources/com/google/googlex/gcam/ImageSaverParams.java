package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ImageSaverParams {

    /* JADX INFO: renamed from: a */
    public transient long f8289a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8290b;

    public ImageSaverParams() {
        long jNew_ImageSaverParams = GcamModuleJNI.new_ImageSaverParams();
        this.f8290b = true;
        this.f8289a = jNew_ImageSaverParams;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4993a() {
        long j = this.f8289a;
        if (j != 0) {
            if (this.f8290b) {
                this.f8290b = false;
                GcamModuleJNI.delete_ImageSaverParams(j);
            }
            this.f8289a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4994b(String str) {
        GcamModuleJNI.ImageSaverParams_dest_folder_set(this.f8289a, this, str);
    }

    protected final void finalize() {
        m4993a();
    }
}
