package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatArray4 {

    /* JADX INFO: renamed from: a */
    public transient long f8255a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8256b;

    public FloatArray4() {
        this(GcamModuleJNI.new_FloatArray4__SWIG_0(), true);
    }

    public FloatArray4(long j, boolean z) {
        this.f8256b = z;
        this.f8255a = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m4941a(int i) {
        return GcamModuleJNI.FloatArray4_get(this.f8255a, this, i);
    }

    /* JADX INFO: renamed from: b */
    public final long m4942b() {
        return GcamModuleJNI.FloatArray4_size(this.f8255a, this);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4943c() {
        long j = this.f8255a;
        if (j != 0) {
            if (this.f8256b) {
                this.f8256b = false;
                GcamModuleJNI.delete_FloatArray4(j);
            }
            this.f8255a = 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4944d(int i, float f) {
        GcamModuleJNI.FloatArray4_set(this.f8255a, this, i, f);
    }

    protected final void finalize() {
        m4943c();
    }
}
