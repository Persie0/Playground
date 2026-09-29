package p000;

import com.google.android.gms.internal.measurement.zzaeh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lcd {

    /* JADX INFO: renamed from: a */
    public static p04 f49484a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m16088a(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m16089b(byte b, byte b2, char[] cArr, int i) throws zzaeh {
        if (b < -62 || m16092e(b2)) {
            uk9.m22782q("Protocol message had invalid UTF-8.");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    /* JADX INFO: renamed from: c */
    public static void m16090c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzaeh {
        if (!m16092e(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m16092e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m16092e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m16092e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m16092e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            }
        }
        uk9.m22782q("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: d */
    public static void m16091d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzaeh {
        if (!m16092e(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m16092e(b3) && !m16092e(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        uk9.m22782q("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16092e(byte b) {
        return b > -65;
    }
}
