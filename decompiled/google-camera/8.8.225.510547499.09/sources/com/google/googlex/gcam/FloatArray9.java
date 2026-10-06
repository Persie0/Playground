package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FloatArray9 {

    /* JADX INFO: renamed from: a */
    public transient long f8257a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8258b;

    public FloatArray9() {
        this(GcamModuleJNI.new_FloatArray9__SWIG_0(), true);
    }

    public FloatArray9(long j, boolean z) {
        this.f8258b = z;
        this.f8257a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4945a() {
        long j = this.f8257a;
        if (j != 0) {
            if (this.f8258b) {
                this.f8258b = false;
                GcamModuleJNI.delete_FloatArray9(j);
            }
            this.f8257a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4946b(int i, float f) {
        GcamModuleJNI.FloatArray9_set(this.f8257a, this, i, f);
    }

    protected final void finalize() {
        m4945a();
    }
}
