package p000;

import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0792b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7703a;

    /* JADX INFO: renamed from: b */
    public static final long[] f7704b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(yu0.f70463a);
        bytes.getClass();
        f7703a = bytes;
        f7704b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX INFO: renamed from: a */
    public static final long m3129a(aj0 aj0Var, ByteString byteString, long j, long j2, int i) {
        zt8 zt8Var;
        long j3 = j;
        long j4 = j2;
        byteString.getClass();
        long j5 = i;
        te1.m22001o(byteString.mo18078d(), 0L, j5);
        if (i <= 0) {
            C3386nv.m17626m("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            C3386nv.m17624j(wq1.m24116l("fromIndex < 0: ", j3));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbM22996s = ux5.m22996s(j3, "fromIndex > toIndex: ", " > ");
            sbM22996s.append(j4);
            throw new IllegalArgumentException(sbM22996s.toString().toString());
        }
        long j6 = aj0Var.f723b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (zt8Var = aj0Var.f722a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                zt8Var = zt8Var.f72159g;
                zt8Var.getClass();
                j6 -= (long) (zt8Var.f72155c - zt8Var.f72154b);
            }
            byte[] bArrMo18081h = byteString.mo18081h();
            byte b = bArrMo18081h[0];
            long jMin = Math.min(j4, (aj0Var.f723b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = zt8Var.f72153a;
                int iMin = (int) Math.min(zt8Var.f72155c, (((long) zt8Var.f72154b) + jMin) - j6);
                for (int i2 = (int) ((((long) zt8Var.f72154b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b && m3130b(zt8Var, i2 + 1, bArrMo18081h, 1, i)) {
                        return ((long) (i2 - zt8Var.f72154b)) + j6;
                    }
                }
                j6 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (zt8Var.f72155c - zt8Var.f72154b));
            if (j8 > j3) {
                break;
            }
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j7 = j8;
        }
        byte[] bArrMo18081h2 = byteString.mo18081h();
        byte b2 = bArrMo18081h2[0];
        long jMin2 = Math.min(j4, (aj0Var.f723b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = zt8Var.f72153a;
            int iMin2 = (int) Math.min(zt8Var.f72155c, (((long) zt8Var.f72154b) + jMin2) - j7);
            for (int i3 = (int) ((((long) zt8Var.f72154b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b2 && m3130b(zt8Var, i3 + 1, bArrMo18081h2, 1, i)) {
                    return ((long) (i3 - zt8Var.f72154b)) + j7;
                }
            }
            j7 += (long) (zt8Var.f72155c - zt8Var.f72154b);
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3130b(zt8 zt8Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = zt8Var.f72155c;
        byte[] bArr2 = zt8Var.f72153a;
        while (i2 < i3) {
            if (i == i4) {
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                byte[] bArr3 = zt8Var.f72153a;
                bArr2 = bArr3;
                i = zt8Var.f72154b;
                i4 = zt8Var.f72155c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final String m3131c(aj0 aj0Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (aj0Var.m494q(j2) == 13) {
                String strM470W = aj0Var.m470W(j2, yu0.f70463a);
                aj0Var.skip(2L);
                return strM470W;
            }
        }
        String strM470W2 = aj0Var.m470W(j, yu0.f70463a);
        aj0Var.skip(1L);
        return strM470W2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final int m3132d(aj0 aj0Var, rz6 rz6Var, boolean z) {
        int i;
        int i2;
        int i3;
        zt8 zt8Var;
        int i4;
        rz6Var.getClass();
        zt8 zt8Var2 = aj0Var.f722a;
        if (zt8Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = zt8Var2.f72153a;
        int i5 = zt8Var2.f72154b;
        int i6 = zt8Var2.f72155c;
        int[] iArr = rz6Var.f60086b;
        zt8 zt8Var3 = zt8Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (zt8Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            zt8Var3 = zt8Var3.f72158f;
                            zt8Var3.getClass();
                            int i16 = zt8Var3.f72154b;
                            byte[] bArr2 = zt8Var3.f72153a;
                            i2 = zt8Var3.f72155c;
                            if (zt8Var3 == zt8Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                zt8Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        zt8Var3.getClass();
                        zt8 zt8Var4 = zt8Var3.f72158f;
                        zt8Var4.getClass();
                        i3 = zt8Var4.f72154b;
                        byte[] bArr3 = zt8Var4.f72153a;
                        i4 = zt8Var4.f72155c;
                        if (zt8Var4 != zt8Var2) {
                            zt8Var = zt8Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            zt8Var = null;
                        }
                    } else {
                        zt8Var = zt8Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        zt8Var3 = zt8Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    zt8Var3 = zt8Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
