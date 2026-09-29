package com.google.android.gms.internal.measurement;

import dm.C5212l;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2809q5 {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static int m8198a(byte[] bArr, int i10, C2796p5 c2796p5) throws zzll {
        int iM8206i = m8206i(bArr, i10, c2796p5);
        int i11 = c2796p5.f14387a;
        if (i11 < 0) {
            throw zzll.m8501b();
        }
        if (i11 > bArr.length - iM8206i) {
            throw zzll.m8503d();
        }
        if (i11 == 0) {
            c2796p5.f14389c = zzka.f14563b;
            return iM8206i;
        }
        c2796p5.f14389c = zzka.m8499Q(bArr, iM8206i, i11);
        return iM8206i + i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m8199b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m8200c(InterfaceC2876v7 interfaceC2876v7, byte[] bArr, int i10, int i11, int i12, C2796p5 c2796p5) throws IOException {
        AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7.mo8106b();
        int iM8210m = m8210m(abstractC2771n6Mo8106b, interfaceC2876v7, bArr, i10, i11, i12, c2796p5);
        interfaceC2876v7.mo8105a(abstractC2771n6Mo8106b);
        c2796p5.f14389c = abstractC2771n6Mo8106b;
        return iM8210m;
    }

    /* JADX INFO: renamed from: d */
    public static int m8201d(InterfaceC2876v7 interfaceC2876v7, int i10, byte[] bArr, int i11, int i12, InterfaceC2836s6 interfaceC2836s6, C2796p5 c2796p5) throws IOException {
        AbstractC2771n6 abstractC2771n6Mo8106b = interfaceC2876v7.mo8106b();
        int iM8211n = m8211n(abstractC2771n6Mo8106b, interfaceC2876v7, bArr, i11, i12, c2796p5);
        interfaceC2876v7.mo8105a(abstractC2771n6Mo8106b);
        c2796p5.f14389c = abstractC2771n6Mo8106b;
        interfaceC2836s6.add(abstractC2771n6Mo8106b);
        while (iM8211n < i12) {
            int iM8206i = m8206i(bArr, iM8211n, c2796p5);
            if (i10 != c2796p5.f14387a) {
                break;
            }
            AbstractC2771n6 abstractC2771n6Mo8106b2 = interfaceC2876v7.mo8106b();
            int iM8211n2 = m8211n(abstractC2771n6Mo8106b2, interfaceC2876v7, bArr, iM8206i, i12, c2796p5);
            interfaceC2876v7.mo8105a(abstractC2771n6Mo8106b2);
            c2796p5.f14389c = abstractC2771n6Mo8106b2;
            interfaceC2836s6.add(abstractC2771n6Mo8106b2);
            iM8211n = iM8211n2;
        }
        return iM8211n;
    }

    /* JADX INFO: renamed from: e */
    public static int m8202e(byte[] bArr, int i10, InterfaceC2836s6 interfaceC2836s6, C2796p5 c2796p5) throws IOException {
        C2784o6 c2784o6 = (C2784o6) interfaceC2836s6;
        int iM8206i = m8206i(bArr, i10, c2796p5);
        int i11 = c2796p5.f14387a + iM8206i;
        while (iM8206i < i11) {
            iM8206i = m8206i(bArr, iM8206i, c2796p5);
            c2784o6.m8147f(c2796p5.f14387a);
        }
        if (iM8206i == i11) {
            return iM8206i;
        }
        throw zzll.m8503d();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static int m8203f(byte[] bArr, int i10, C2796p5 c2796p5) throws zzll {
        int iM8206i = m8206i(bArr, i10, c2796p5);
        int i11 = c2796p5.f14387a;
        if (i11 < 0) {
            throw zzll.m8501b();
        }
        if (i11 == 0) {
            c2796p5.f14389c = "";
            return iM8206i;
        }
        c2796p5.f14389c = new String(bArr, iM8206i, i11, C2849t6.f14439a);
        return iM8206i + i11;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc A[PHI: r13
      0x00dc: PHI (r13v21 byte) = (r13v20 byte), (r13v28 byte) binds: [B:60:0x00d5, B:63:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
    /* JADX INFO: renamed from: g */
    public static int m8204g(byte[] bArr, int i10, C2796p5 c2796p5) throws zzll {
        int i11;
        byte b10;
        int iM8206i = m8206i(bArr, i10, c2796p5);
        int i12 = c2796p5.f14387a;
        if (i12 < 0) {
            throw zzll.m8501b();
        }
        if (i12 == 0) {
            c2796p5.f14389c = "";
            return iM8206i;
        }
        C2838s8 c2838s8 = C2851t8.f14444a;
        int length = bArr.length;
        if ((((length - iM8206i) - i12) | iM8206i | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM8206i), Integer.valueOf(i12)));
        }
        int i13 = iM8206i + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (iM8206i < i13) {
            byte b11 = bArr[iM8206i];
            if (!(b11 >= 0)) {
                break;
            }
            iM8206i++;
            cArr[i14] = (char) b11;
            i14++;
        }
        while (true) {
            while (true) {
                if (iM8206i >= i13) {
                    c2796p5.f14389c = new String(cArr, 0, i14);
                    return i13;
                }
                i11 = iM8206i + 1;
                b10 = bArr[iM8206i];
                if (b10 >= 0) {
                    break;
                }
                if (b10 < -32) {
                    if (i11 >= i13) {
                        throw zzll.m8500a();
                    }
                    int i15 = i11 + 1;
                    byte b12 = bArr[i11];
                    int i16 = i14 + 1;
                    if (b10 < -62 || C5212l.m11183v0(b12)) {
                        throw zzll.m8500a();
                    }
                    cArr[i14] = (char) (((b10 & 31) << 6) | (b12 & 63));
                    iM8206i = i15;
                    i14 = i16;
                } else {
                    if (b10 < -16) {
                        if (i11 >= i13 - 1) {
                            throw zzll.m8500a();
                        }
                        int i17 = i11 + 1;
                        byte b13 = bArr[i11];
                        int i18 = i17 + 1;
                        byte b14 = bArr[i17];
                        int i19 = i14 + 1;
                        if (!C5212l.m11183v0(b13)) {
                            if (b10 != -32) {
                                if (b10 != -19) {
                                    if (!C5212l.m11183v0(b14)) {
                                        cArr[i14] = (char) (((b10 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                        iM8206i = i18;
                                        i14 = i19;
                                    }
                                } else if (b13 < -96) {
                                    b10 = -19;
                                    if (!C5212l.m11183v0(b14)) {
                                        cArr[i14] = (char) (((b10 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                        iM8206i = i18;
                                        i14 = i19;
                                    }
                                }
                            } else if (b13 >= -96) {
                                b10 = -32;
                                if (b10 != -19) {
                                    if (!C5212l.m11183v0(b14)) {
                                        cArr[i14] = (char) (((b10 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                        iM8206i = i18;
                                        i14 = i19;
                                    }
                                } else if (b13 < -96) {
                                    b10 = -19;
                                    if (!C5212l.m11183v0(b14)) {
                                        cArr[i14] = (char) (((b10 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
                                        iM8206i = i18;
                                        i14 = i19;
                                    }
                                }
                            }
                        }
                        throw zzll.m8500a();
                    }
                    if (i11 >= i13 - 2) {
                        throw zzll.m8500a();
                    }
                    int i20 = i11 + 1;
                    byte b15 = bArr[i11];
                    int i21 = i20 + 1;
                    byte b16 = bArr[i20];
                    int i22 = i21 + 1;
                    byte b17 = bArr[i21];
                    if (C5212l.m11183v0(b15) || (((b15 + 112) + (b10 << 28)) >> 30) != 0 || C5212l.m11183v0(b16) || C5212l.m11183v0(b17)) {
                        throw zzll.m8500a();
                    }
                    int i23 = ((b10 & 7) << 18) | ((b15 & 63) << 12) | ((b16 & 63) << 6) | (b17 & 63);
                    cArr[i14] = (char) ((i23 >>> 10) + 55232);
                    cArr[i14 + 1] = (char) ((i23 & 1023) + 56320);
                    i14 += 2;
                    iM8206i = i22;
                }
            }
            int i24 = i14 + 1;
            cArr[i14] = (char) b10;
            iM8206i = i11;
            while (true) {
                i14 = i24;
                if (iM8206i < i13) {
                    byte b18 = bArr[iM8206i];
                    if (!(b18 >= 0)) {
                        break;
                    }
                    iM8206i++;
                    i24 = i14 + 1;
                    cArr[i14] = (char) b18;
                } else {
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m8205h(int i10, byte[] bArr, int i11, int i12, C2689h8 c2689h8, C2796p5 c2796p5) throws zzll {
        if ((i10 >>> 3) == 0) {
            throw new zzll("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM8209l = m8209l(bArr, i11, c2796p5);
            c2689h8.m7873c(i10, Long.valueOf(c2796p5.f14388b));
            return iM8209l;
        }
        if (i13 == 1) {
            c2689h8.m7873c(i10, Long.valueOf(m8212o(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM8206i = m8206i(bArr, i11, c2796p5);
            int i14 = c2796p5.f14387a;
            if (i14 < 0) {
                throw zzll.m8501b();
            }
            if (i14 > bArr.length - iM8206i) {
                throw zzll.m8503d();
            }
            if (i14 == 0) {
                c2689h8.m7873c(i10, zzka.f14563b);
            } else {
                c2689h8.m7873c(i10, zzka.m8499Q(bArr, iM8206i, i14));
            }
            return iM8206i + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzll("Protocol message contained an invalid tag (zero).");
            }
            c2689h8.m7873c(i10, Integer.valueOf(m8199b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2689h8 c2689h8M7871b = C2689h8.m7871b();
        int i16 = 0;
        while (i11 < i12) {
            int iM8206i2 = m8206i(bArr, i11, c2796p5);
            int i17 = c2796p5.f14387a;
            if (i17 == i15) {
                i16 = i17;
                i11 = iM8206i2;
                break;
            }
            i16 = i17;
            i11 = m8205h(i17, bArr, iM8206i2, i12, c2689h8M7871b, c2796p5);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzll.m8502c();
        }
        c2689h8.m7873c(i10, c2689h8M7871b);
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public static int m8206i(byte[] bArr, int i10, C2796p5 c2796p5) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m8207j(b10, bArr, i11, c2796p5);
        }
        c2796p5.f14387a = b10;
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m8207j(int i10, byte[] bArr, int i11, C2796p5 c2796p5) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c2796p5.f14387a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c2796p5.f14387a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2796p5.f14387a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2796p5.f14387a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2796p5.f14387a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m8208k(int i10, byte[] bArr, int i11, int i12, InterfaceC2836s6 interfaceC2836s6, C2796p5 c2796p5) {
        C2784o6 c2784o6 = (C2784o6) interfaceC2836s6;
        int iM8206i = m8206i(bArr, i11, c2796p5);
        c2784o6.m8147f(c2796p5.f14387a);
        while (iM8206i < i12) {
            int iM8206i2 = m8206i(bArr, iM8206i, c2796p5);
            if (i10 != c2796p5.f14387a) {
                break;
            }
            iM8206i = m8206i(bArr, iM8206i2, c2796p5);
            c2784o6.m8147f(c2796p5.f14387a);
        }
        return iM8206i;
    }

    /* JADX INFO: renamed from: l */
    public static int m8209l(byte[] bArr, int i10, C2796p5 c2796p5) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2796p5.f14388b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            i12 = i14;
            b10 = b11;
        }
        c2796p5.f14388b = j11;
        return i12;
    }

    /* JADX INFO: renamed from: m */
    public static int m8210m(Object obj, InterfaceC2876v7 interfaceC2876v7, byte[] bArr, int i10, int i11, int i12, C2796p5 c2796p5) throws IOException {
        int iM8098A = ((C2772n7) interfaceC2876v7).m8098A(obj, bArr, i10, i11, i12, c2796p5);
        c2796p5.f14389c = obj;
        return iM8098A;
    }

    /* JADX INFO: renamed from: n */
    public static int m8211n(Object obj, InterfaceC2876v7 interfaceC2876v7, byte[] bArr, int i10, int i11, C2796p5 c2796p5) throws IOException {
        int iM8207j = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM8207j = m8207j(i12, bArr, iM8207j, c2796p5);
            i12 = c2796p5.f14387a;
        }
        int i13 = iM8207j;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzll.m8503d();
        }
        int i14 = i12 + i13;
        interfaceC2876v7.mo8110f(obj, bArr, i13, i14, c2796p5);
        c2796p5.f14389c = obj;
        return i14;
    }

    /* JADX INFO: renamed from: o */
    public static long m8212o(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
