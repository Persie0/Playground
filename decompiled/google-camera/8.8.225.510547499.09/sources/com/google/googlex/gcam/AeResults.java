package com.google.googlex.gcam;

import p000.nqz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AeResults {

    /* JADX INFO: renamed from: a */
    public transient long f8224a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8225b;

    public AeResults() {
        this(GcamModuleJNI.new_AeResults(), true);
    }

    public AeResults(long j, boolean z) {
        this.f8225b = z;
        this.f8224a = j;
    }

    /* JADX INFO: renamed from: b */
    public static long m4881b(AeResults aeResults) {
        if (aeResults == null) {
            return 0L;
        }
        return aeResults.f8224a;
    }

    /* JADX INFO: renamed from: a */
    public final float m4882a(nqz nqzVar) {
        return GcamModuleJNI.AeResults_FinalTet(this.f8224a, this, nqzVar.f44123c);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4883c() {
        long j = this.f8224a;
        if (j != 0) {
            if (this.f8225b) {
                this.f8225b = false;
                GcamModuleJNI.delete_AeResults(j);
            }
            this.f8224a = 0L;
        }
    }

    protected final void finalize() {
        m4883c();
    }
}
