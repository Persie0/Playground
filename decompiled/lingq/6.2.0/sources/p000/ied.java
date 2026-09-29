package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ied {

    /* JADX INFO: renamed from: a */
    public static p04 f44034a;

    /* JADX INFO: renamed from: a */
    public static final p04 m13854a() {
        p04 p04Var = f44034a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Filled.Fullscreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(7.0f, 14.0f);
        f57Var.m11551f(5.0f, 14.0f);
        f57Var.m11557l(5.0f);
        f57Var.m11550e(5.0f);
        f57Var.m11557l(-2.0f);
        f57Var.m11551f(7.0f, 17.0f);
        f57Var.m11557l(-3.0f);
        f57Var.m11546a();
        f57Var.m11553h(5.0f, 10.0f);
        f57Var.m11550e(2.0f);
        f57Var.m11551f(7.0f, 7.0f);
        f57Var.m11550e(3.0f);
        f57Var.m11551f(10.0f, 5.0f);
        f57Var.m11551f(5.0f, 5.0f);
        f57Var.m11557l(5.0f);
        f57Var.m11546a();
        f57Var.m11553h(17.0f, 17.0f);
        f57Var.m11550e(-3.0f);
        f57Var.m11557l(2.0f);
        f57Var.m11550e(5.0f);
        f57Var.m11557l(-5.0f);
        f57Var.m11550e(-2.0f);
        f57Var.m11557l(3.0f);
        f57Var.m11546a();
        f57Var.m11553h(14.0f, 5.0f);
        f57Var.m11557l(2.0f);
        f57Var.m11550e(3.0f);
        f57Var.m11557l(3.0f);
        f57Var.m11550e(2.0f);
        f57Var.m11551f(19.0f, 5.0f);
        f57Var.m11550e(-5.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f44034a = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static int m13855b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: c */
    public static long m13856c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* JADX INFO: renamed from: d */
    public static long m13857d(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        char c = '/';
        char c2 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = ((long) (length << 1)) - 7286425919675154353L;
                long jM13859f = m13859f(0, bArr2) * (-5435081209227447693L);
                long jM13859f2 = m13859f(8, bArr2);
                long jM13859f3 = m13859f(length - 8, bArr2) * j;
                return m13856c(Long.rotateRight(jM13859f3, 30) + Long.rotateRight(jM13859f + jM13859f2, 43) + (m13859f(length - 16, bArr2) * (-7286425919675154353L)), Long.rotateRight(jM13859f2 - 7286425919675154353L, 18) + jM13859f + jM13859f3, j);
            }
            if (length >= 8) {
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long jM13859f4 = m13859f(0, bArr2) - 7286425919675154353L;
                long jM13859f5 = m13859f(length - 8, bArr2);
                return m13856c((Long.rotateRight(jM13859f5, 37) * j2) + jM13859f4, (Long.rotateRight(jM13859f4, 25) + jM13859f5) * j2, j2);
            }
            if (length >= 4) {
                return m13856c(((long) length) + ((((long) m13855b(0, bArr2)) & 4294967295L) << 3), ((long) m13855b(length - 4, bArr2)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j3 = (((long) (length + ((bArr2[length - 1] & 255) << 2))) * (-4348849565147123417L)) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * (-7286425919675154353L));
            return (j3 ^ (j3 >>> 47)) * (-7286425919675154353L);
        }
        char c3 = '@';
        if (length <= 64) {
            long j4 = ((long) (length << 1)) - 7286425919675154353L;
            long jM13859f6 = m13859f(0, bArr2) * (-7286425919675154353L);
            long jM13859f7 = m13859f(8, bArr2);
            long jM13859f8 = m13859f(length - 8, bArr2) * j4;
            long jRotateRight = Long.rotateRight(jM13859f8, 30) + Long.rotateRight(jM13859f6 + jM13859f7, 43) + (m13859f(length - 16, bArr2) * (-7286425919675154353L));
            long jM13856c = m13856c(jRotateRight, Long.rotateRight(jM13859f7 - 7286425919675154353L, 18) + jM13859f6 + jM13859f8, j4);
            long jM13859f9 = m13859f(16, bArr2) * j4;
            long jM13859f10 = m13859f(24, bArr2);
            long jM13859f11 = (m13859f(length - 32, bArr2) + jRotateRight) * j4;
            return m13856c(Long.rotateRight(jM13859f11, 30) + Long.rotateRight(jM13859f9 + jM13859f10, 43) + ((m13859f(length - 24, bArr2) + jM13856c) * j4), Long.rotateRight(jM13859f10 + jM13859f6, 18) + jM13859f9 + jM13859f11, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jM13859f12 = m13859f(0, bArr2) + 95310865018149119L;
        int i = length - 1;
        int i2 = (i / 64) << 6;
        int i3 = i & 63;
        int i4 = i2 + i3;
        int i5 = i4 - 63;
        long j5 = 2480279821605975764L;
        long j6 = 1390051526045402406L;
        int i6 = i3;
        int i7 = 0;
        while (true) {
            char c4 = c2;
            long jRotateRight2 = Long.rotateRight(m13859f(i7 + 8, bArr2) + jM13859f12 + j5 + jArr[c2], 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(m13859f(i7 + 48, bArr2) + j5 + jArr[1], 42) * (-5435081209227447693L);
            long j7 = jRotateRight2 ^ jArr2[1];
            char c5 = c3;
            long jM13859f13 = m13859f(i7 + 40, bArr2) + jArr[c4] + jRotateRight3;
            long jRotateRight4 = Long.rotateRight(j6 + jArr2[c4], 33) * (-5435081209227447693L);
            char c6 = c;
            int i8 = i6;
            m13858e(bArr2, i7, jArr[1] * (-5435081209227447693L), j7 + jArr2[c4], jArr);
            int i9 = i7;
            long[] jArr3 = jArr;
            m13858e(bArr2, i9 + 32, jRotateRight4 + jArr2[1], m13859f(i9 + 16, bArr2) + jM13859f13, jArr2);
            i7 = i9 + 64;
            if (i7 == i2) {
                long j8 = ((j7 & 255) << 1) - 5435081209227447693L;
                long j9 = jArr2[c4] + ((long) i8);
                jArr2[c4] = j9;
                long j10 = jArr3[c4] + j9;
                jArr3[c4] = j10;
                jArr2[c4] = jArr2[c4] + j10;
                long jRotateRight5 = Long.rotateRight(m13859f(i4 - 55, bArr2) + jRotateRight4 + jM13859f13 + jArr3[c4], 37) * j8;
                long jRotateRight6 = Long.rotateRight(m13859f(i4 - 15, bArr2) + jM13859f13 + jArr3[1], 42) * j8;
                long j11 = jRotateRight5 ^ (jArr2[1] * 9);
                long jM13859f14 = m13859f(i4 - 23, bArr2) + (jArr3[c4] * 9) + jRotateRight6;
                long jRotateRight7 = Long.rotateRight(j7 + jArr2[c4], 33) * j8;
                m13858e(bArr2, i5, jArr3[1] * j8, jArr2[c4] + j11, jArr3);
                m13858e(bArr2, i4 - 31, jArr2[1] + jRotateRight7, m13859f(i4 - 47, bArr2) + jM13859f14, jArr2);
                return m13856c((((jM13859f14 >>> c6) ^ jM13859f14) * (-4348849565147123417L)) + m13856c(jArr3[c4], jArr2[c4], j8) + j11, m13856c(jArr3[1], jArr2[1], j8) + jRotateRight7, j8);
            }
            bArr2 = bArr;
            jM13859f12 = jRotateRight4;
            jArr = jArr3;
            c2 = c4;
            j6 = j7;
            c3 = c5;
            j5 = jM13859f13;
            i6 = i8;
            c = c6;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13858e(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jM13859f = m13859f(i, bArr);
        long jM13859f2 = m13859f(i + 8, bArr);
        long jM13859f3 = m13859f(i + 16, bArr);
        long jM13859f4 = m13859f(i + 24, bArr);
        long j3 = j + jM13859f;
        long j4 = jM13859f2 + j3 + jM13859f3;
        long jRotateRight = Long.rotateRight(j4, 44) + Long.rotateRight(j2 + j3 + jM13859f4, 21);
        jArr[0] = j4 + jM13859f4;
        jArr[1] = jRotateRight + j3;
    }

    /* JADX INFO: renamed from: f */
    public static long m13859f(int i, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }
}
