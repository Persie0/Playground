package p470x1;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: x1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10013a {

    /* JADX INFO: renamed from: b */
    public static final int[] f50960b = {18, 20, 17, 15};

    /* JADX INFO: renamed from: c */
    public static final int[] f50961c = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: d */
    public static final int[] f50962d = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: a */
    public final long f50963a;

    /* JADX INFO: renamed from: x1.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static int m18607a(int i10) {
            if (i10 < 8191) {
                return 13;
            }
            if (i10 < 32767) {
                return 15;
            }
            if (i10 < 65535) {
                return 16;
            }
            if (i10 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(C0166e.m762h("Can't represent a size of ", i10, " in Constraints"));
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: b */
        public static long m18608b(int i10, int i11, int i12, int i13) {
            long j10;
            int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
            int iM18607a = m18607a(i14);
            int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
            int iM18607a2 = m18607a(i15);
            if (iM18607a + iM18607a2 > 31) {
                throw new IllegalArgumentException(C0009a.m20h("Can't represent a width of ", i15, " and height of ", i14, " in Constraints"));
            }
            if (iM18607a2 == 13) {
                j10 = 3;
            } else if (iM18607a2 == 18) {
                j10 = 1;
            } else if (iM18607a2 == 15) {
                j10 = 2;
            } else {
                if (iM18607a2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j10 = 0;
            }
            int i16 = 0;
            int i17 = i11 == Integer.MAX_VALUE ? 0 : i11 + 1;
            if (i13 != Integer.MAX_VALUE) {
                i16 = i13 + 1;
            }
            int i18 = C10013a.f50960b[(int) j10];
            return (((long) i17) << 33) | j10 | (((long) i10) << 2) | (((long) i12) << i18) | (((long) i16) << (i18 + 31));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public static long m18609c(int i10) {
            if (i10 >= 0) {
                return m18608b(0, Integer.MAX_VALUE, i10, i10);
            }
            throw new IllegalArgumentException(C0166e.m762h("height(", i10, ") must be >= 0").toString());
        }

        /* JADX INFO: renamed from: d */
        public static long m18610d(int i10) {
            if (i10 >= 0) {
                return m18608b(i10, i10, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(C0166e.m762h("width(", i10, ") must be >= 0").toString());
        }
    }

    public /* synthetic */ C10013a(long j10) {
        this.f50963a = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static long m18596a(long j10, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = m18605j(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = m18603h(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = m18604i(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = m18602g(j10);
        }
        boolean z10 = true;
        if (!(i12 >= 0 && i10 >= 0)) {
            throw new IllegalArgumentException(C0009a.m20h("minHeight(", i12, ") and minWidth(", i10, ") must be >= 0").toString());
        }
        if (!(i11 >= i10 || i11 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
        }
        if (i13 < i12 && i13 != Integer.MAX_VALUE) {
            z10 = false;
        }
        if (z10) {
            return a.m18608b(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m18597b(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m18598c(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> (f50960b[i10] + 31))) & f50962d[i10]) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m18599d(long j10) {
        return (((int) (j10 >> 33)) & f50961c[(int) (3 & j10)]) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m18600e(long j10) {
        return m18602g(j10) == m18604i(j10);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m18601f(long j10) {
        return m18603h(j10) == m18605j(j10);
    }

    /* JADX INFO: renamed from: g */
    public static final int m18602g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> (f50960b[i10] + 31))) & f50962d[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* JADX INFO: renamed from: h */
    public static final int m18603h(long j10) {
        int i10 = ((int) (j10 >> 33)) & f50961c[(int) (3 & j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m18604i(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> f50960b[i10])) & f50962d[i10];
    }

    /* JADX INFO: renamed from: j */
    public static final int m18605j(long j10) {
        return ((int) (j10 >> 2)) & f50961c[(int) (3 & j10)];
    }

    /* JADX INFO: renamed from: k */
    public static String m18606k(long j10) {
        int iM18603h = m18603h(j10);
        String strValueOf = iM18603h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM18603h);
        int iM18602g = m18602g(j10);
        return "Constraints(minWidth = " + m18605j(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + m18604i(j10) + ", maxHeight = " + (iM18602g != Integer.MAX_VALUE ? String.valueOf(iM18602g) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10013a) {
            return this.f50963a == ((C10013a) obj).f50963a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50963a);
    }

    public final String toString() {
        return m18606k(this.f50963a);
    }
}
