package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w4b {

    /* JADX INFO: renamed from: a */
    public final int f66396a;

    /* JADX INFO: renamed from: b */
    public long f66397b;

    /* JADX INFO: renamed from: c */
    public long f66398c;

    public w4b(int i) {
        this.f66396a = i;
    }

    /* JADX INFO: renamed from: b */
    public static void m23751b(w4b w4bVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (w4bVar) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = w4bVar.f66397b + j;
                w4bVar.f66397b = j3;
                long j4 = w4bVar.f66398c + j2;
                w4bVar.f66398c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m23752a() {
        return this.f66397b - this.f66398c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f66396a + ", total=" + this.f66397b + ", acknowledged=" + this.f66398c + ", unacknowledged=" + m23752a() + ')';
    }
}
