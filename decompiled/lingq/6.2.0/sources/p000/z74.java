package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z74 {

    /* JADX INFO: renamed from: a */
    public final long f71017a;

    /* JADX INFO: renamed from: a */
    public static long m25484a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z74) {
            return this.f71017a == ((z74) obj).f71017a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71017a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f71017a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return wq1.m24122r(sb, (int) (j & 4294967295L), ')');
    }
}
