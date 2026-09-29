package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzco;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qcd {
    /* JADX INFO: renamed from: a */
    public static final String m19863a(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static int m19864b(int i, byte[] bArr, int i2, int i3, vnb vnbVar) throws zzco {
        if ((i >>> 3) == 0) {
            throw new zzco("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m19868f(bArr, i2, vnbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m19867e(bArr, i2, vnbVar) + vnbVar.f65674a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzco("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m19867e(bArr, i2, vnbVar);
            i6 = vnbVar.f65674a;
            if (i6 == i5) {
                break;
            }
            i2 = m19864b(i6, bArr, i2, i3, vnbVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzco.m5347b();
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m19865c(int i, byte[] bArr, int i2, int i3, u3c u3cVar, vnb vnbVar) throws zzco {
        if ((i >>> 3) == 0) {
            throw new zzco("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM19868f = m19868f(bArr, i2, vnbVar);
            u3cVar.m22438a(i, Long.valueOf(vnbVar.f65675b));
            return iM19868f;
        }
        if (i4 == 1) {
            u3cVar.m22438a(i, Long.valueOf(m19871i(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM19867e = m19867e(bArr, i2, vnbVar);
            int i5 = vnbVar.f65674a;
            u3cVar.m22438a(i, i5 == 0 ? zzbb.f11801b : zzbb.m5342d(bArr, iM19867e, i5));
            return iM19867e + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzco("Protocol message contained an invalid tag (zero).");
            }
            u3cVar.m22438a(i, Integer.valueOf(m19869g(i2, bArr)));
            return i2 + 4;
        }
        u3c u3cVarM22437b = u3c.m22437b();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM19867e2 = m19867e(bArr, i2, vnbVar);
            int i8 = vnbVar.f65674a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iM19867e2;
                break;
            }
            i2 = m19865c(i8, bArr, iM19867e2, i3, u3cVarM22437b, vnbVar);
            i7 = i8;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzco.m5347b();
        }
        u3cVar.m22438a(i, u3cVarM22437b);
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m19866d(int i, byte[] bArr, int i2, vnb vnbVar) {
        int i3;
        int i4 = i & 127;
        int i5 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i6 = i4 | ((b & 127) << 7);
            int i7 = i2 + 2;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                vnbVar.f65674a = i6 | (b2 << 14);
                return i7;
            }
            i4 = i6 | ((b2 & 127) << 14);
            i5 = i2 + 3;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i3 = b3 << 21;
            } else {
                int i8 = i4 | ((b3 & 127) << 21);
                int i9 = i2 + 4;
                byte b4 = bArr[i5];
                if (b4 >= 0) {
                    vnbVar.f65674a = i8 | (b4 << 28);
                    return i9;
                }
                int i10 = i8 | ((b4 & 127) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        vnbVar.f65674a = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        vnbVar.f65674a = i4 | i3;
        return i5;
    }

    /* JADX INFO: renamed from: e */
    public static int m19867e(byte[] bArr, int i, vnb vnbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m19866d(b, bArr, i2, vnbVar);
        }
        vnbVar.f65674a = b;
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m19868f(byte[] bArr, int i, vnb vnbVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            vnbVar.f65675b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        vnbVar.f65675b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: g */
    public static int m19869g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: h */
    public static int m19870h(byte[] bArr, int i, vnb vnbVar) throws zzco {
        int iM19867e = m19867e(bArr, i, vnbVar);
        int i2 = vnbVar.f65674a;
        if (i2 == 0) {
            vnbVar.f65676c = "";
            return iM19867e;
        }
        int i3 = iM19867e + i2;
        if (!p5c.f55622a.m142c(bArr, iM19867e, i3)) {
            throw new zzco("Protocol message had invalid UTF-8.");
        }
        vnbVar.f65676c = new String(bArr, iM19867e, i2, btb.f8994a);
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public static long m19871i(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: j */
    public static int m19872j(byte[] bArr, int i, vnb vnbVar) {
        int iM19867e = m19867e(bArr, i, vnbVar);
        int i2 = vnbVar.f65674a;
        if (i2 == 0) {
            vnbVar.f65676c = zzbb.f11801b;
            return iM19867e;
        }
        vnbVar.f65676c = zzbb.m5342d(bArr, iM19867e, i2);
        return iM19867e + i2;
    }
}
