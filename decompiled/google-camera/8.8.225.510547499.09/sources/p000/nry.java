package p000;

import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nry {

    /* JADX INFO: renamed from: a */
    public transient long f44323a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f44324b = true;

    public nry(long j) {
        this.f44323a = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17637a() {
        long j = this.f44323a;
        if (j != 0) {
            if (this.f44324b) {
                this.f44324b = false;
                GcamModuleJNI.delete_PortraitDepthArguments(j);
            }
            this.f44323a = 0L;
        }
    }

    protected final void finalize() {
        m17637a();
    }
}
