package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cx9 {

    /* JADX INFO: renamed from: b */
    public static final long f34692b = eh0.m11127g(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f34693c = 0;

    /* JADX INFO: renamed from: a */
    public final long f34694a;

    public /* synthetic */ cx9(long j) {
        this.f34694a = j;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9919a(Object obj, long j) {
        return (obj instanceof cx9) && j == ((cx9) obj).f34694a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9920b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9921c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final int m9922d(long j) {
        return m9923e(j) - m9924f(j);
    }

    /* JADX INFO: renamed from: e */
    public static final int m9923e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final int m9924f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m9925g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m9926h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return wq1.m24122r(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m9919a(obj, this.f34694a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f34694a);
    }

    public final String toString() {
        return m9926h(this.f34694a);
    }
}
