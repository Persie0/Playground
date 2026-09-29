package org.joda.time.chrono;

/* JADX INFO: loaded from: classes.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long serialVersionUID = 538276888268L;

    /* JADX INFO: renamed from: w0 */
    public static final int[] f54902w0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* JADX INFO: renamed from: x0 */
    public static final int[] f54903x0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* JADX INFO: renamed from: y0 */
    public static final long[] f54904y0 = new long[12];

    /* JADX INFO: renamed from: z0 */
    public static final long[] f54905z0 = new long[12];

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) f54902w0[i]) * 86400000;
            int i2 = i + 1;
            f54904y0[i2] = j;
            j2 += ((long) f54903x0[i]) * 86400000;
            f54905z0[i2] = j2;
            i = i2;
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: V */
    public final long mo18424V(int i, int i2) {
        return mo18431c0(i) ? f54905z0[i2 - 1] : f54904y0[i2 - 1];
    }

    /* JADX INFO: renamed from: d0 */
    public final int m18432d0(int i, int i2) {
        return mo18431c0(i) ? f54903x0[i2 - 1] : f54902w0[i2 - 1];
    }

    /* JADX INFO: renamed from: e0 */
    public final int m18433e0(int i, long j) {
        int iM18429a0 = (int) ((j - m18429a0(i)) >> 10);
        if (mo18431c0(i)) {
            if (iM18429a0 < 15356250) {
                if (iM18429a0 < 7678125) {
                    if (iM18429a0 < 2615625) {
                        return 1;
                    }
                    return iM18429a0 < 5062500 ? 2 : 3;
                }
                if (iM18429a0 < 10209375) {
                    return 4;
                }
                return iM18429a0 < 12825000 ? 5 : 6;
            }
            if (iM18429a0 < 23118750) {
                if (iM18429a0 < 17971875) {
                    return 7;
                }
                return iM18429a0 < 20587500 ? 8 : 9;
            }
            if (iM18429a0 >= 25734375) {
                return iM18429a0 < 28265625 ? 11 : 12;
            }
        } else {
            if (iM18429a0 < 15271875) {
                if (iM18429a0 < 7593750) {
                    if (iM18429a0 < 2615625) {
                        return 1;
                    }
                    return iM18429a0 < 4978125 ? 2 : 3;
                }
                if (iM18429a0 < 10125000) {
                    return 4;
                }
                return iM18429a0 < 12740625 ? 5 : 6;
            }
            if (iM18429a0 < 23034375) {
                if (iM18429a0 < 17887500) {
                    return 7;
                }
                return iM18429a0 < 20503125 ? 8 : 9;
            }
            if (iM18429a0 >= 25650000) {
                return iM18429a0 < 28181250 ? 11 : 12;
            }
        }
        return 10;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m18434f0(long j) {
        return this.f54861T.mo3734b(j) == 29 && this.f54866Y.mo11038s(j);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: g0 */
    public final long m18435g0(int i, long j) {
        int iM18428Z = m18428Z(j);
        int iM18429a0 = (int) ((j - m18429a0(iM18428Z)) / 86400000);
        int i2 = iM18429a0 + 1;
        int iM18420T = BasicChronology.m18420T(j);
        if (i2 <= 59) {
            iM18429a0 = i2;
        } else if (mo18431c0(iM18428Z)) {
            if (mo18431c0(i)) {
                iM18429a0 = i2;
            }
        } else if (mo18431c0(i)) {
            iM18429a0 += 2;
        } else {
            iM18429a0 = i2;
        }
        return m18430b0(i, 1, iM18429a0) + ((long) iM18420T);
    }
}
