package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Size {

    /* JADX INFO: renamed from: a */
    public transient long f8360a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8361b;

    public Size() {
        long jNew_Size = GcamModuleJNI.new_Size();
        this.f8361b = true;
        this.f8360a = jNew_Size;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5116a() {
        long j = this.f8360a;
        if (j != 0) {
            if (this.f8361b) {
                this.f8361b = false;
                GcamModuleJNI.delete_Size(j);
            }
            this.f8360a = 0L;
        }
    }

    protected final void finalize() {
        m5116a();
    }
}
