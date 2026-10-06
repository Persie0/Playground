package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ajk {

    /* JADX INFO: renamed from: a */
    public final long f500a;

    /* JADX INFO: renamed from: b */
    public final long f501b;

    public ajk(long j, long j2) {
        if (j2 == 0) {
            this.f500a = 0L;
            this.f501b = 1L;
        } else {
            this.f500a = j;
            this.f501b = j2;
        }
    }

    public final String toString() {
        return this.f500a + "/" + this.f501b;
    }
}
