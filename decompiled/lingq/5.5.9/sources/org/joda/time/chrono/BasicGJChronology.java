package org.joda.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long serialVersionUID = 538276888268L;

    /* JADX INFO: renamed from: x0 */
    public static final int[] f44061x0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* JADX INFO: renamed from: y0 */
    public static final int[] f44062y0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* JADX INFO: renamed from: z0 */
    public static final long[] f44063z0 = new long[12];

    /* JADX INFO: renamed from: A0 */
    public static final long[] f44060A0 = new long[12];

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        while (i10 < 11) {
            j10 += ((long) f44061x0[i10]) * 86400000;
            int i11 = i10 + 1;
            f44063z0[i11] = j10;
            j11 += ((long) f44062y0[i10]) * 86400000;
            f44060A0[i11] = j11;
            i10 = i11;
        }
    }

    public BasicGJChronology(ZonedChronology zonedChronology, int i10) {
        super(zonedChronology, i10);
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: G0 */
    public final boolean mo16056G0(long j10) {
        return this.f43981T.mo12572b(j10) == 29 && this.f43986Y.mo12586x(j10);
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: I0 */
    public final long mo16058I0(int i10, long j10) {
        int iM16053D0 = m16053D0(j10);
        int iM16054E0 = ((int) ((j10 - m16054E0(iM16053D0)) / 86400000)) + 1;
        int iM16049v0 = BasicChronology.m16049v0(j10);
        if (iM16054E0 > 59) {
            if (mo16057H0(iM16053D0)) {
                if (!mo16057H0(i10)) {
                    iM16054E0--;
                }
            } else if (mo16057H0(i10)) {
                iM16054E0++;
            }
        }
        return m16055F0(i10, 1, iM16054E0) + ((long) iM16049v0);
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: r0 */
    public final int mo16065r0(int i10, long j10) {
        if (i10 <= 28 && i10 >= 1) {
            return 28;
        }
        int iM16053D0 = m16053D0(j10);
        return mo16066s0(iM16053D0, mo16071y0(iM16053D0, j10));
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: s0 */
    public final int mo16066s0(int i10, int i11) {
        return mo16057H0(i10) ? f44062y0[i11 - 1] : f44061x0[i11 - 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r14 < 5062500) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r14 < 12825000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r14 < 20587500) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r14 < 28265625) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        if (r14 < 4978125) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        if (r14 < 12740625) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r14 < 20503125) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        if (r14 < 28181250) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
    
        return 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 11;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo16071y0(int i10, long j10) {
        int iM16054E0 = (int) ((j10 - m16054E0(i10)) >> 10);
        if (mo16057H0(i10)) {
            if (iM16054E0 < 15356250) {
                if (iM16054E0 < 7678125) {
                    if (iM16054E0 >= 2615625) {
                    }
                    return 1;
                }
                if (iM16054E0 >= 10209375) {
                }
                return 4;
            }
            if (iM16054E0 < 23118750) {
                if (iM16054E0 >= 17971875) {
                }
                return 7;
            }
            if (iM16054E0 < 25734375) {
                return 10;
            }
        } else {
            if (iM16054E0 < 15271875) {
                if (iM16054E0 < 7593750) {
                    if (iM16054E0 >= 2615625) {
                    }
                    return 1;
                }
                if (iM16054E0 >= 10125000) {
                }
                return 4;
            }
            if (iM16054E0 < 23034375) {
                if (iM16054E0 >= 17887500) {
                }
                return 7;
            }
            if (iM16054E0 < 25650000) {
                return 10;
            }
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: z0 */
    public final long mo16072z0(int i10, int i11) {
        return mo16057H0(i10) ? f44060A0[i11 - 1] : f44063z0[i11 - 1];
    }
}
