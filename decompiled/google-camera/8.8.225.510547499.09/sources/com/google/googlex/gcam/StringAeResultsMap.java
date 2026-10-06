package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StringAeResultsMap {

    /* JADX INFO: renamed from: a */
    public transient long f8368a;

    public StringAeResultsMap() {
        this(GcamModuleJNI.new_StringAeResultsMap__SWIG_0());
    }

    public StringAeResultsMap(long j) {
        this.f8368a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5127a() {
        if (this.f8368a != 0) {
            this.f8368a = 0L;
        }
    }

    protected final void finalize() {
        m5127a();
    }
}
