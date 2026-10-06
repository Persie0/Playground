package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatVector {

    /* JADX INFO: renamed from: a */
    public transient long f8261a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8262b;

    public FloatVector() {
        this(GcamModuleJNI.new_FloatVector__SWIG_0(), true);
    }

    public FloatVector(long j, boolean z) {
        this.f8262b = z;
        this.f8261a = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m4948a(int i) {
        return GcamModuleJNI.FloatVector_get(this.f8261a, this, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m4949b(float f) {
        GcamModuleJNI.FloatVector_add(this.f8261a, this, f);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4950c() {
        long j = this.f8261a;
        if (j != 0) {
            if (this.f8262b) {
                this.f8262b = false;
                GcamModuleJNI.delete_FloatVector(j);
            }
            this.f8261a = 0L;
        }
    }

    protected final void finalize() {
        m4950c();
    }
}
