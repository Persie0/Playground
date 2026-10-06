package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AeModeResult {

    /* JADX INFO: renamed from: a */
    public transient long f8222a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8223b;

    public AeModeResult() {
        long jNew_AeModeResult = GcamModuleJNI.new_AeModeResult();
        this.f8223b = true;
        this.f8222a = jNew_AeModeResult;
    }

    /* JADX INFO: renamed from: a */
    public static long m4877a(AeModeResult aeModeResult) {
        if (aeModeResult == null) {
            return 0L;
        }
        return aeModeResult.f8222a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4878b() {
        long j = this.f8222a;
        if (j != 0) {
            if (this.f8223b) {
                this.f8223b = false;
                GcamModuleJNI.delete_AeModeResult(j);
            }
            this.f8222a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4879c(float f) {
        GcamModuleJNI.AeModeResult_final_tet_set(this.f8222a, this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4880d(float f) {
        GcamModuleJNI.AeModeResult_ideal_tet_set(this.f8222a, this, f);
    }

    protected final void finalize() {
        m4878b();
    }
}
