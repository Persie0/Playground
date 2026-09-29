package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b8b {

    /* JADX INFO: renamed from: a */
    public final long f8123a;

    /* JADX INFO: renamed from: b */
    public final long f8124b;

    public b8b(long j, long j2) {
        this.f8123a = j;
        this.f8124b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b8b.class.equals(obj.getClass())) {
            b8b b8bVar = (b8b) obj;
            if (b8bVar.f8123a == this.f8123a && b8bVar.f8124b == this.f8124b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8124b) + (Long.hashCode(this.f8123a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f8123a + ", flexIntervalMillis=" + this.f8124b + '}';
    }
}
