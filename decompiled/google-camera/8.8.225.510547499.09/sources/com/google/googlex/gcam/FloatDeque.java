package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatDeque {

    /* JADX INFO: renamed from: a */
    public transient long f8259a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8260b;

    public FloatDeque() {
        this(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }

    public FloatDeque(long j, boolean z) {
        this.f8260b = z;
        this.f8259a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4947a() {
        long j = this.f8259a;
        if (j != 0) {
            if (this.f8260b) {
                this.f8260b = false;
                GcamModuleJNI.delete_FloatDeque(j);
            }
            this.f8259a = 0L;
        }
    }

    protected final void finalize() {
        m4947a();
    }
}
