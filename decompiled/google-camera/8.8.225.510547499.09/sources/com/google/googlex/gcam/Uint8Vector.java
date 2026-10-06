package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Uint8Vector {

    /* JADX INFO: renamed from: a */
    public transient long f8377a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8378b;

    public Uint8Vector() {
        long jNew_Uint8Vector__SWIG_0 = GcamModuleJNI.new_Uint8Vector__SWIG_0();
        this.f8378b = true;
        this.f8377a = jNew_Uint8Vector__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5136a() {
        long j = this.f8377a;
        if (j != 0) {
            if (this.f8378b) {
                this.f8378b = false;
                GcamModuleJNI.delete_Uint8Vector(j);
            }
            this.f8377a = 0L;
        }
    }

    protected final void finalize() {
        m5136a();
    }
}
