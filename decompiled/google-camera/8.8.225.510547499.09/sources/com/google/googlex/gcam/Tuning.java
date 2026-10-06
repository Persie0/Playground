package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Tuning {

    /* JADX INFO: renamed from: a */
    public transient long f8376a;

    public Tuning(long j) {
        this.f8376a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5135a() {
        if (this.f8376a != 0) {
            this.f8376a = 0L;
        }
    }

    protected final void finalize() {
        m5135a();
    }
}
