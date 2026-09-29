package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ifc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f44063a = new C0282a(809749026, false, new xd1(16));

    /* JADX INFO: renamed from: a */
    public static byte[] m13881a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            C3386nv.m17626m("The key length in bytes must be 32.");
            return null;
        }
        long jM13882b = m13882b(0, bArr) & 67108863;
        int i = 3;
        long jM13882b2 = (m13882b(3, bArr) >> 2) & 67108611;
        long jM13882b3 = (m13882b(6, bArr) >> 4) & 67092735;
        long jM13882b4 = (m13882b(9, bArr) >> 6) & 66076671;
        long jM13882b5 = (m13882b(12, bArr) >> 8) & 1048575;
        long j = jM13882b2 * 5;
        long j2 = jM13882b3 * 5;
        long j3 = jM13882b4 * 5;
        long j4 = jM13882b5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jM13882b6 = j9 + (m13882b(0, bArr3) & 67108863);
            long jM13882b7 = j5 + ((m13882b(i, bArr3) >> 2) & 67108863);
            long jM13882b8 = j6 + ((m13882b(6, bArr3) >> 4) & 67108863);
            long jM13882b9 = j7 + ((m13882b(9, bArr3) >> 6) & 67108863);
            long j10 = jM13882b2;
            long jM13882b10 = j8 + (((m13882b(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jM13882b10 * j) + (jM13882b9 * j2) + (jM13882b8 * j3) + (jM13882b7 * j4) + (jM13882b6 * jM13882b);
            long j12 = (jM13882b10 * j2) + (jM13882b9 * j3) + (jM13882b8 * j4) + (jM13882b7 * jM13882b) + (jM13882b6 * j10);
            long j13 = (jM13882b10 * j3) + (jM13882b9 * j4) + (jM13882b8 * jM13882b) + (jM13882b7 * j10) + (jM13882b6 * jM13882b3);
            long j14 = (jM13882b10 * j4) + (jM13882b9 * jM13882b) + (jM13882b8 * j10) + (jM13882b7 * jM13882b3) + (jM13882b6 * jM13882b4);
            long j15 = jM13882b9 * j10;
            long j16 = jM13882b10 * jM13882b;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jM13882b8 * jM13882b3) + (jM13882b7 * jM13882b4) + (jM13882b6 * jM13882b5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jM13882b2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jM13882b11 = m13882b(16, bArr) + j50;
        long j54 = jM13882b11 & 4294967295L;
        long jM13882b12 = m13882b(20, bArr) + j51 + (jM13882b11 >> 32);
        long jM13882b13 = m13882b(24, bArr) + j52 + (jM13882b12 >> 32);
        long jM13882b14 = (m13882b(28, bArr) + j53 + (jM13882b13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m13883c(bArr4, j54, 0);
        m13883c(bArr4, jM13882b12 & 4294967295L, 4);
        m13883c(bArr4, jM13882b13 & 4294967295L, 8);
        m13883c(bArr4, jM13882b14, 12);
        return bArr4;
    }

    /* JADX INFO: renamed from: b */
    public static long m13882b(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: c */
    public static void m13883c(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
