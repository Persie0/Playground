package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f84 {

    /* JADX INFO: renamed from: a */
    public final long f38612a;

    public /* synthetic */ f84(long j) {
        this.f38612a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m11592a(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11593b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m11594c(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m11595d(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static String m11596e(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return wq1.m24122r(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f84) {
            return this.f38612a == ((f84) obj).f38612a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38612a);
    }

    public final String toString() {
        return m11596e(this.f38612a);
    }
}
