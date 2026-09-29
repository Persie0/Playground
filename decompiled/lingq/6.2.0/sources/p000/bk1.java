package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 {

    /* JADX INFO: renamed from: a */
    public final long f8631a;

    public /* synthetic */ bk1(long j) {
        this.f8631a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m3793a(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            k54.m14852a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return dk1.m10430h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m3794b(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = m3803k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m3801i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m3802j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m3800h(j);
        }
        return m3793a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3795c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3796d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3797e(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3798f(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3799g(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m3800h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m3801i(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m3802j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m3803k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: l */
    public static String m3804l(long j) {
        int iM3801i = m3801i(j);
        String strValueOf = iM3801i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM3801i);
        int iM3800h = m3800h(j);
        String strValueOf2 = iM3800h != Integer.MAX_VALUE ? String.valueOf(iM3800h) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m3803k(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m3802j(j));
        sb.append(", maxHeight = ");
        return ux5.m22992o(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk1) {
            return this.f8631a == ((bk1) obj).f8631a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8631a);
    }

    public final String toString() {
        return m3804l(this.f8631a);
    }
}
