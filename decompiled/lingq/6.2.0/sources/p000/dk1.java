package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class dk1 {
    /* JADX INFO: renamed from: a */
    public static final long m10423a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            k54.m14852a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m10430h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m10424b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m10423a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final int m10425c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m10426d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM3803k = bk1.m3803k(j);
        int iM3801i = bk1.m3801i(j);
        if (i < iM3803k) {
            i = iM3803k;
        }
        if (i <= iM3801i) {
            iM3801i = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM3802j = bk1.m3802j(j);
        int iM3800h = bk1.m3800h(j);
        if (i2 < iM3802j) {
            i2 = iM3802j;
        }
        if (i2 <= iM3800h) {
            iM3800h = i2;
        }
        return (((long) iM3801i) << 32) | (((long) iM3800h) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m10427e(long j, long j2) {
        int iM3803k = bk1.m3803k(j);
        int iM3801i = bk1.m3801i(j);
        int iM3802j = bk1.m3802j(j);
        int iM3800h = bk1.m3800h(j);
        int iM3803k2 = bk1.m3803k(j2);
        if (iM3803k2 < iM3803k) {
            iM3803k2 = iM3803k;
        }
        if (iM3803k2 > iM3801i) {
            iM3803k2 = iM3801i;
        }
        int iM3801i2 = bk1.m3801i(j2);
        if (iM3801i2 >= iM3803k) {
            iM3803k = iM3801i2;
        }
        if (iM3803k <= iM3801i) {
            iM3801i = iM3803k;
        }
        int iM3802j2 = bk1.m3802j(j2);
        if (iM3802j2 < iM3802j) {
            iM3802j2 = iM3802j;
        }
        if (iM3802j2 > iM3800h) {
            iM3802j2 = iM3800h;
        }
        int iM3800h2 = bk1.m3800h(j2);
        if (iM3800h2 >= iM3802j) {
            iM3802j = iM3800h2;
        }
        if (iM3802j <= iM3800h) {
            iM3800h = iM3802j;
        }
        return m10423a(iM3803k2, iM3801i, iM3802j2, iM3800h);
    }

    /* JADX INFO: renamed from: f */
    public static final int m10428f(int i, long j) {
        int iM3802j = bk1.m3802j(j);
        int iM3800h = bk1.m3800h(j);
        if (i < iM3802j) {
            i = iM3802j;
        }
        return i > iM3800h ? iM3800h : i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m10429g(int i, long j) {
        int iM3803k = bk1.m3803k(j);
        int iM3801i = bk1.m3801i(j);
        if (i < iM3803k) {
            i = iM3803k;
        }
        return i > iM3801i ? iM3801i : i;
    }

    /* JADX INFO: renamed from: h */
    public static final long m10430h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM10425c = m10425c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM10425c2 = m10425c(i6);
        if (iM10425c + iM10425c2 > 31) {
            m10433k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM10425c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM10425c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM10425c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m10431i(long j, int i, int i2) {
        int iM3803k = bk1.m3803k(j) + i;
        if (iM3803k < 0) {
            iM3803k = 0;
        }
        int iM3801i = bk1.m3801i(j);
        if (iM3801i != Integer.MAX_VALUE && (iM3801i = iM3801i + i) < 0) {
            iM3801i = 0;
        }
        int iM3802j = bk1.m3802j(j) + i2;
        if (iM3802j < 0) {
            iM3802j = 0;
        }
        int iM3800h = bk1.m3800h(j);
        return m10423a(iM3803k, iM3801i, iM3802j, (iM3800h == Integer.MAX_VALUE || (iM3800h = iM3800h + i2) >= 0) ? iM3800h : 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m10432j(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m10431i(j, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static final void m10433k(int i, int i2) {
        throw new IllegalArgumentException(ux5.m22987j(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: l */
    public static final Void m10434l(int i) {
        throw new IllegalArgumentException(ux5.m22989l("Can't represent a size of ", i, " in Constraints"));
    }
}
