package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SceneFlicker {

    /* JADX INFO: renamed from: a */
    public transient long f8352a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8353b;

    public SceneFlicker() {
        long jNew_SceneFlicker = GcamModuleJNI.new_SceneFlicker();
        this.f8353b = true;
        this.f8352a = jNew_SceneFlicker;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5093a() {
        long j = this.f8352a;
        if (j != 0) {
            if (this.f8353b) {
                this.f8353b = false;
                GcamModuleJNI.delete_SceneFlicker(j);
            }
            this.f8352a = 0L;
        }
    }

    protected final void finalize() {
        m5093a();
    }
}
