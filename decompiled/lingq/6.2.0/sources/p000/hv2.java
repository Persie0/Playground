package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hv2 {

    /* JADX INFO: renamed from: a */
    public final long f42972a;

    /* JADX INFO: renamed from: b */
    public final long f42973b;

    public hv2(long j, long j2) {
        if (j2 == 0) {
            this.f42972a = 0L;
            this.f42973b = 1L;
        } else {
            this.f42972a = j;
            this.f42973b = j2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m13484a() {
        return this.f42972a / this.f42973b;
    }

    public final String toString() {
        return this.f42972a + "/" + this.f42973b;
    }
}
