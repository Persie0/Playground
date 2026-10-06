package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatArray2 {

    /* JADX INFO: renamed from: a */
    public transient long f8253a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8254b;

    public FloatArray2() {
        long jNew_FloatArray2__SWIG_0 = GcamModuleJNI.new_FloatArray2__SWIG_0();
        this.f8254b = true;
        this.f8253a = jNew_FloatArray2__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4939a() {
        long j = this.f8253a;
        if (j != 0) {
            if (this.f8254b) {
                this.f8254b = false;
                GcamModuleJNI.delete_FloatArray2(j);
            }
            this.f8253a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4940b(int i, float f) {
        GcamModuleJNI.FloatArray2_set(this.f8253a, this, i, f);
    }

    protected final void finalize() {
        m4939a();
    }
}
