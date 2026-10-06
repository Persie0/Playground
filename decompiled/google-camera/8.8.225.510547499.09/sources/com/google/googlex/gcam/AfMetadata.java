package com.google.googlex.gcam;

import p000.nra;
import p000.nrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AfMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8228a;

    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata());
    }

    public AfMetadata(long j) {
        this.f8228a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4895a() {
        if (this.f8228a != 0) {
            this.f8228a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4896b(nra nraVar) {
        GcamModuleJNI.AfMetadata_mode_set(this.f8228a, this, nraVar.f44136h);
    }

    /* JADX INFO: renamed from: c */
    public final void m4897c(nrb nrbVar) {
        GcamModuleJNI.AfMetadata_state_set(this.f8228a, this, nrbVar.f44147i);
    }

    /* JADX INFO: renamed from: d */
    public final void m4898d(int i) {
        GcamModuleJNI.AfMetadata_trigger_set(this.f8228a, this, i);
    }

    protected final void finalize() {
        m4895a();
    }
}
