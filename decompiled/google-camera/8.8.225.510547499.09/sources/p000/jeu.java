package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import com.google.lens.sdk.LensApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class jeu {
    /* JADX INFO: renamed from: b */
    public static jee m12979b(jel jelVar, jec jecVar) {
        jei jeiVar = new jei(jecVar);
        jeiVar.m4649i(jelVar);
        return new jee(jeiVar);
    }

    /* JADX INFO: renamed from: c */
    public static String m12980c(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return NptsKnlVczSZ.yAYOlcOg;
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m12981e(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m12982f(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static long m12983g(byte[] bArr) {
        int length = bArr.length;
        if (length <= 32) {
            if (length > 16) {
                long jM12993q = m12993q(bArr, 0) * (-5435081209227447693L);
                long jM12993q2 = m12993q(bArr, 8);
                long j = ((long) (length + length)) - 7286425919675154353L;
                long jM12993q3 = m12993q(bArr, length - 8) * j;
                return m12992p(Long.rotateRight(jM12993q + jM12993q2, 43) + Long.rotateRight(jM12993q3, 30) + (m12993q(bArr, length - 16) * (-7286425919675154353L)), jM12993q + Long.rotateRight(jM12993q2 - 7286425919675154353L, 18) + jM12993q3, j);
            }
            if (length >= 8) {
                long j2 = ((long) (length + length)) - 7286425919675154353L;
                long jM12993q4 = m12993q(bArr, 0) - 7286425919675154353L;
                long jM12993q5 = m12993q(bArr, length - 8);
                return m12992p(jM12993q4 + (Long.rotateRight(jM12993q5, 37) * j2), (Long.rotateRight(jM12993q4, 25) + jM12993q5) * j2, j2);
            }
            if (length >= 4) {
                return m12992p(((((long) m12991o(bArr, 0)) & 4294967295L) << 3) + ((long) length), ((long) m12991o(bArr, length - 4)) & 4294967295L, ((long) (length + length)) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return (-7286425919675154353L) * m12994r((((long) ((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (length + ((bArr[length - 1] & 255) << 2))) * (-4348849565147123417L)));
        }
        if (length <= 64) {
            long jM12993q6 = m12993q(bArr, 0) * (-7286425919675154353L);
            long jM12993q7 = m12993q(bArr, 8);
            long j3 = ((long) (length + length)) - 7286425919675154353L;
            long jM12993q8 = m12993q(bArr, length - 8) * j3;
            long jM12993q9 = m12993q(bArr, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jM12993q6 + jM12993q7, 43) + Long.rotateRight(jM12993q8, 30);
            long jRotateRight2 = Long.rotateRight(jM12993q7 - 7286425919675154353L, 18) + jM12993q6;
            long jM12993q10 = m12993q(bArr, 16) * j3;
            long jM12993q11 = m12993q(bArr, 24);
            long j4 = jRotateRight + jM12993q9;
            long jM12993q12 = j4 + m12993q(bArr, length - 32);
            long jM12992p = m12992p(j4, jRotateRight2 + jM12993q8, j3) + m12993q(bArr, length - 24);
            long j5 = jM12993q12 * j3;
            return m12992p(Long.rotateRight(jM12993q10 + jM12993q11, 43) + Long.rotateRight(j5, 30) + (jM12992p * j3), jM12993q10 + Long.rotateRight(jM12993q11 + jM12993q6, 18) + j5, j3);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jM12993q13 = m12993q(bArr, 0) + 95310865018149119L;
        long jM12994r = m12994r(-7956866745689871395L) * (-7286425919675154353L);
        long j6 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            long jRotateRight3 = Long.rotateRight(jM12993q13 + j6 + jArr[0] + m12993q(bArr, i + 8), 37) * (-5435081209227447693L);
            long jRotateRight4 = Long.rotateRight(j6 + jArr[1] + m12993q(bArr, i + 48), 42) * (-5435081209227447693L);
            long j7 = jRotateRight3 ^ jArr2[1];
            long jM12993q14 = jArr[0] + m12993q(bArr, i + 40);
            long jRotateRight5 = Long.rotateRight(jM12994r + jArr2[0], 33) * (-5435081209227447693L);
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            m12995s(bArr, i, jArr[1] * (-5435081209227447693L), j7 + jArr2[0], jArr);
            j6 = jRotateRight4 + jM12993q14;
            m12995s(bArr, i + 32, jRotateRight5 + jArr3[1], j6 + m12993q(bArr, i + 16), jArr3);
            int i3 = i + 64;
            int i4 = (i2 >> 6) * 64;
            if (i3 == i4) {
                int i5 = i2 & 63;
                long j8 = j7 & 255;
                long j9 = (-5435081209227447693L) + j8 + j8;
                long j10 = jArr3[0] + ((long) i5);
                long j11 = jArr4[0] + j10;
                jArr4[0] = j11;
                jArr3[0] = j10 + j11;
                int i6 = (i4 + i5) - 63;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j6 + j11 + m12993q(bArr, i6 + 8), 37) * j9;
                long jRotateRight7 = Long.rotateRight(j6 + jArr4[1] + m12993q(bArr, i6 + 48), 42) * j9;
                long j12 = jArr3[1] * 9;
                long jM12993q15 = (jArr4[0] * 9) + m12993q(bArr, i6 + 40);
                long jRotateRight8 = Long.rotateRight(j7 + jArr3[0], 33) * j9;
                long j13 = jRotateRight6 ^ j12;
                m12995s(bArr, i6, jArr4[1] * j9, j13 + jArr3[0], jArr4);
                long j14 = jRotateRight7 + jM12993q15;
                m12995s(bArr, i6 + 32, jRotateRight8 + jArr3[1], m12993q(bArr, i6 + 16) + j14, jArr3);
                return m12992p(m12992p(jArr4[0], jArr3[0], j9) + (m12994r(j14) * (-4348849565147123417L)) + j13, m12992p(jArr4[1], jArr3[1], j9) + jRotateRight8, j9);
            }
            i = i3;
            jM12993q13 = jRotateRight5;
            jM12994r = j7;
            jArr2 = jArr3;
            jArr = jArr4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m12984h(gyw gywVar) {
        gyw gywVar2 = gyw.UNKNOWN;
        switch (gywVar) {
            case UNKNOWN:
                return 1;
            case NORMAL:
            case RENDER_PHOTO:
                return 2;
            case HDR_PLUS:
            case f26883d:
                return 8;
            case BURST:
                return 18;
            case PANORAMA:
                return 12;
            case PHOTOSPHERE:
                return 6;
            case IMAGE_INTENT:
                return 20;
            case VIDEO:
            case CINEMATIC:
            case AMETHYST:
                return 9;
            case PORTRAIT:
                return 22;
            case CYCLOPS_PANO:
                return 23;
            case LONG_EXPOSURE:
                return 29;
            case TIMELAPSE:
                return 11;
            case LONG_SHOT:
            case AUTO_LONG_SHOT:
                return 32;
            case VIDEO_SNAPSHOT:
                return 35;
            case MOTION_BLUR:
                return 36;
            case AMBER:
                return 37;
            case TAXI:
                return 39;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m12985i(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: j */
    public static int m12986j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12987k(gyh gyhVar) {
        gyhVar.mo9890V(null);
    }

    /* JADX INFO: renamed from: l */
    public static void m12988l() {
        throw new UnsupportedOperationException("Only used by Burst and Photosphere sessions");
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static nps m12989m() {
        throw new UnsupportedOperationException("Not supported for CaptureSessions unless overridden");
    }

    /* JADX INFO: renamed from: o */
    private static int m12991o(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: p */
    private static long m12992p(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* JADX INFO: renamed from: q */
    private static long m12993q(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    /* JADX INFO: renamed from: r */
    private static long m12994r(long j) {
        return j ^ (j >>> 47);
    }

    /* JADX INFO: renamed from: s */
    private static void m12995s(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jM12993q = j + m12993q(bArr, i);
        long jM12993q2 = m12993q(bArr, i + 8);
        long jM12993q3 = m12993q(bArr, i + 16);
        long jM12993q4 = m12993q(bArr, i + 24);
        long j3 = jM12993q2 + jM12993q + jM12993q3;
        long jRotateRight = Long.rotateRight(j2 + jM12993q + jM12993q4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jM12993q4;
        jArr[1] = jRotateRight + jM12993q;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public jdu mo12827a(Context context, Looper looper, jgz jgzVar, Object obj, jea jeaVar, jeb jebVar) {
        return mo12996d(context, looper, jgzVar, obj, jeaVar, jebVar);
    }

    /* JADX INFO: renamed from: d */
    public jdu mo12996d(Context context, Looper looper, jgz jgzVar, Object obj, jfe jfeVar, jga jgaVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
