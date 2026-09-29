package mo;

import dm.C5206f;
import dm.C5207g;

/* JADX INFO: renamed from: mo.h */
/* JADX INFO: loaded from: classes2.dex */
public class C7660h extends C7659g {
    /* JADX INFO: renamed from: K2 */
    public static final Double m15245K2(String str) {
        try {
            if (C7657e.f42132a.m14271b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060 A[PHI: r7
      0x0060: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:23:0x0057, B:26:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x006d A[LOOP:0: B:18:0x0047->B:33:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0068 A[SYNTHETIC] */
    /* JADX INFO: renamed from: L2 */
    public static final Integer m15246L2(String str) {
        boolean z10;
        int i10;
        int i11;
        C5207g.m11111f(str, "<this>");
        C5206f.m11029x0(10);
        int length = str.length();
        if (length != 0) {
            int i12 = 0;
            char cCharAt = str.charAt(0);
            int i13 = -2147483647;
            if (C5207g.m11113h(cCharAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (cCharAt != '-') {
                        if (cCharAt != '+') {
                            break;
                        }
                        z10 = false;
                    } else {
                        i13 = Integer.MIN_VALUE;
                        z10 = true;
                    }
                }
            } else {
                z10 = false;
                i10 = 0;
            }
            int i14 = -59652323;
            while (true) {
                if (i10 >= length) {
                    return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
                }
                int iDigit = Character.digit((int) str.charAt(i10), 10);
                if (iDigit < 0) {
                    break;
                }
                if (i12 >= i14) {
                    i11 = i12 * 10;
                    if (i11 < i13 + iDigit) {
                        break;
                        break;
                    }
                    i12 = i11 - iDigit;
                    i10++;
                } else {
                    if (i14 != -59652323) {
                        break;
                        break;
                    }
                    i14 = i13 / 10;
                    if (i12 < i14) {
                        break;
                    }
                    i11 = i12 * 10;
                    if (i11 < i13 + iDigit) {
                        break;
                        break;
                    }
                    i12 = i11 - iDigit;
                    i10++;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[PHI: r12
      0x0062: PHI (r12v2 long) = (r12v1 long), (r12v5 long) binds: [B:23:0x0054, B:27:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[LOOP:0: B:18:0x0045->B:32:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x006b A[SYNTHETIC] */
    /* JADX INFO: renamed from: M2 */
    public static final Long m15247M2(String str) {
        boolean z10;
        long j10;
        long j11;
        C5206f.m11029x0(10);
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            char cCharAt = str.charAt(0);
            long j12 = -9223372036854775807L;
            if (C5207g.m11113h(cCharAt, 48) < 0) {
                z10 = true;
                if (length != 1) {
                    if (cCharAt == '-') {
                        j12 = Long.MIN_VALUE;
                        i10 = 1;
                    } else if (cCharAt == '+') {
                        z10 = false;
                        i10 = 1;
                    }
                }
            } else {
                z10 = false;
            }
            long j13 = 0;
            long j14 = -256204778801521550L;
            while (i10 < length) {
                int iDigit = Character.digit((int) str.charAt(i10), 10);
                if (iDigit >= 0) {
                    if (j13 >= j14) {
                        j10 = j13 * ((long) 10);
                        j11 = iDigit;
                        if (j10 < j12 + j11) {
                            j13 = j10 - j11;
                            i10++;
                        }
                    } else if (j14 == -256204778801521550L) {
                        j14 = j12 / ((long) 10);
                        if (j13 >= j14) {
                            j10 = j13 * ((long) 10);
                            j11 = iDigit;
                            if (j10 < j12 + j11) {
                                j13 = j10 - j11;
                                i10++;
                            }
                        }
                    }
                }
            }
            return z10 ? Long.valueOf(j13) : Long.valueOf(-j13);
        }
        return null;
    }
}
