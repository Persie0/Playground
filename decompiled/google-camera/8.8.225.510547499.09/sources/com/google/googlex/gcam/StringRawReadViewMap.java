package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StringRawReadViewMap {

    /* JADX INFO: renamed from: a */
    public transient long f8371a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8372b;

    public StringRawReadViewMap() {
        long jNew_StringRawReadViewMap__SWIG_0 = GcamModuleJNI.new_StringRawReadViewMap__SWIG_0();
        this.f8372b = true;
        this.f8371a = jNew_StringRawReadViewMap__SWIG_0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5130a() {
        long j = this.f8371a;
        if (j != 0) {
            if (this.f8372b) {
                this.f8372b = false;
                GcamModuleJNI.delete_StringRawReadViewMap(j);
            }
            this.f8371a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5131b(String str, RawReadView rawReadView) {
        GcamModuleJNI.StringRawReadViewMap_set(this.f8371a, this, str, rawReadView.f8349a, rawReadView);
    }

    protected final void finalize() {
        m5130a();
    }
}
