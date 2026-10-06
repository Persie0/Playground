package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RawReadView {

    /* JADX INFO: renamed from: a */
    public transient long f8349a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8350b;

    public RawReadView() {
        this(GcamModuleJNI.new_RawReadView());
    }

    public RawReadView(long j) {
        this.f8350b = true;
        this.f8349a = j;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void mo5090a() {
        long j = this.f8349a;
        if (j != 0) {
            if (this.f8350b) {
                this.f8350b = false;
                GcamModuleJNI.delete_RawReadView(j);
            }
            this.f8349a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5091b() {
        return GcamModuleJNI.RawReadView_empty(this.f8349a, this);
    }

    protected void finalize() {
        mo5090a();
    }
}
