package p000;

import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrt {

    /* JADX INFO: renamed from: a */
    protected transient boolean f44289a;

    /* JADX INFO: renamed from: b */
    private transient long f44290b;

    public nrt() {
        this(GcamModuleJNI.new_MakernoteMetadata());
    }

    public nrt(long j) {
        this.f44289a = true;
        this.f44290b = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m17634a(nrt nrtVar) {
        if (nrtVar == null) {
            return 0L;
        }
        return nrtVar.f44290b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17635b() {
        long j = this.f44290b;
        if (j != 0) {
            if (this.f44289a) {
                this.f44289a = false;
                GcamModuleJNI.delete_MakernoteMetadata(j);
            }
            this.f44290b = 0L;
        }
    }

    protected final void finalize() {
        m17635b();
    }
}
