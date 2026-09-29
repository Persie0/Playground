package p000;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zy3 extends h3d {

    /* JADX INFO: renamed from: b */
    public static final fg2 f72377b = new fg2(4);

    /* JADX INFO: renamed from: a */
    public final fg2 f72378a;

    public zy3(fg2 fg2Var) {
        this.f72378a = fg2Var;
    }

    /* JADX INFO: renamed from: A */
    public static mja m25855A(int i, k47 k47Var, String str) {
        byte[] bArr = new byte[i];
        k47Var.m14827k(bArr, 0, i);
        return new mja(str, null, new String(bArr, 0, m25861G(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: B */
    public static mja m25856B(int i, k47 k47Var) {
        if (i < 1) {
            return null;
        }
        int iM14842z = k47Var.m14842z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        k47Var.m14827k(bArr, 0, i2);
        int iM25860F = m25860F(bArr, 0, iM14842z);
        String str = new String(bArr, 0, iM25860F, m25858D(iM14842z));
        int iM25857C = m25857C(iM14842z) + iM25860F;
        return new mja("WXXX", str, m25872w(bArr, iM25857C, m25861G(iM25857C, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: C */
    public static int m25857C(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: D */
    public static Charset m25858D(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX INFO: renamed from: E */
    public static String m25859E(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: F */
    public static int m25860F(byte[] bArr, int i, int i2) {
        int iM25861G = m25861G(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM25861G;
        }
        while (iM25861G < bArr.length - 1) {
            if ((iM25861G - i) % 2 == 0 && bArr[iM25861G + 1] == 0) {
                return iM25861G;
            }
            iM25861G = m25861G(iM25861G + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: G */
    public static int m25861G(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: H */
    public static int m25862H(int i, k47 k47Var) {
        byte[] bArr = k47Var.f46700a;
        int i2 = k47Var.f46701b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: I */
    public static boolean m25863I(k47 k47Var, int i, int i2, boolean z) {
        int iM14808C;
        long jM14808C;
        int iM14812G;
        int i3;
        int i4 = k47Var.f46701b;
        while (true) {
            try {
                boolean z2 = true;
                if (k47Var.m14820a() < i2) {
                    k47Var.m14818M(i4);
                    return true;
                }
                if (i >= 3) {
                    iM14808C = k47Var.m14829m();
                    jM14808C = k47Var.m14807B();
                    iM14812G = k47Var.m14812G();
                } else {
                    iM14808C = k47Var.m14808C();
                    jM14808C = k47Var.m14808C();
                    iM14812G = 0;
                }
                if (iM14808C == 0 && jM14808C == 0 && iM14812G == 0) {
                    k47Var.m14818M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM14808C) != 0) {
                        k47Var.m14818M(i4);
                        return false;
                    }
                    jM14808C = (((jM14808C >> 24) & 255) << 21) | (jM14808C & 255) | (((jM14808C >> 8) & 255) << 7) | (((jM14808C >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM14812G & 64) != 0 ? 1 : 0;
                    if ((iM14812G & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM14812G & 32) != 0 ? 1 : 0;
                    if ((iM14812G & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM14808C < i3) {
                    k47Var.m14818M(i4);
                    return false;
                }
                if (k47Var.m14820a() < jM14808C) {
                    k47Var.m14818M(i4);
                    return false;
                }
                k47Var.m14819N((int) jM14808C);
            } catch (Throwable th) {
                k47Var.m14818M(i4);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static C3154jo m25864o(k47 k47Var, int i, int i2) {
        int iM25861G;
        String strConcat;
        int iM14842z = k47Var.m14842z();
        Charset charsetM25858D = m25858D(iM14842z);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        k47Var.m14827k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + AbstractC3584sr.m21625f0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM25861G = 2;
        } else {
            iM25861G = m25861G(0, bArr);
            String strM21625f0 = AbstractC3584sr.m21625f0(new String(bArr, 0, iM25861G, StandardCharsets.ISO_8859_1));
            strConcat = strM21625f0.indexOf(47) == -1 ? "image/".concat(strM21625f0) : strM21625f0;
        }
        int i4 = bArr[iM25861G + 1] & 255;
        int i5 = iM25861G + 2;
        int iM25860F = m25860F(bArr, i5, iM14842z);
        String str = new String(bArr, i5, iM25860F - i5, charsetM25858D);
        int iM25857C = m25857C(iM14842z) + iM25860F;
        return new C3154jo(strConcat, str, i4, i3 <= iM25857C ? uma.f64081b : Arrays.copyOfRange(bArr, iM25857C, i3));
    }

    /* JADX INFO: renamed from: p */
    public static lu0 m25865p(k47 k47Var, int i, int i2, boolean z, int i3, fg2 fg2Var) throws Throwable {
        int i4 = k47Var.f46701b;
        int iM25861G = m25861G(i4, k47Var.f46700a);
        String str = new String(k47Var.f46700a, i4, iM25861G - i4, StandardCharsets.ISO_8859_1);
        k47Var.m14818M(iM25861G + 1);
        int iM14829m = k47Var.m14829m();
        int iM14829m2 = k47Var.m14829m();
        long jM14807B = k47Var.m14807B();
        if (jM14807B == 4294967295L) {
            jM14807B = -1;
        }
        long jM14807B2 = k47Var.m14807B();
        long j = jM14807B2 == 4294967295L ? -1L : jM14807B2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (k47Var.f46701b < i5) {
            az3 az3VarM25868s = m25868s(i2, k47Var, z, i3, fg2Var);
            if (az3VarM25868s != null) {
                arrayList.add(az3VarM25868s);
            }
        }
        return new lu0(str, iM14829m, iM14829m2, jM14807B, j, (az3[]) arrayList.toArray(new az3[0]));
    }

    /* JADX INFO: renamed from: q */
    public static mu0 m25866q(k47 k47Var, int i, int i2, boolean z, int i3, fg2 fg2Var) throws Throwable {
        int i4 = k47Var.f46701b;
        int iM25861G = m25861G(i4, k47Var.f46700a);
        String str = new String(k47Var.f46700a, i4, iM25861G - i4, StandardCharsets.ISO_8859_1);
        k47Var.m14818M(iM25861G + 1);
        int iM14842z = k47Var.m14842z();
        boolean z2 = (iM14842z & 2) != 0;
        boolean z3 = (iM14842z & 1) != 0;
        int iM14842z2 = k47Var.m14842z();
        String[] strArr = new String[iM14842z2];
        for (int i5 = 0; i5 < iM14842z2; i5++) {
            int i6 = k47Var.f46701b;
            int iM25861G2 = m25861G(i6, k47Var.f46700a);
            strArr[i5] = new String(k47Var.f46700a, i6, iM25861G2 - i6, StandardCharsets.ISO_8859_1);
            k47Var.m14818M(iM25861G2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (k47Var.f46701b < i7) {
            az3 az3VarM25868s = m25868s(i2, k47Var, z, i3, fg2Var);
            if (az3VarM25868s != null) {
                arrayList.add(az3VarM25868s);
            }
        }
        return new mu0(str, z2, z3, strArr, (az3[]) arrayList.toArray(new az3[0]));
    }

    /* JADX INFO: renamed from: r */
    public static gb1 m25867r(int i, k47 k47Var) {
        if (i < 4) {
            return null;
        }
        int iM14842z = k47Var.m14842z();
        Charset charsetM25858D = m25858D(iM14842z);
        byte[] bArr = new byte[3];
        k47Var.m14827k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        k47Var.m14827k(bArr2, 0, i2);
        int iM25860F = m25860F(bArr2, 0, iM14842z);
        String str2 = new String(bArr2, 0, iM25860F, charsetM25858D);
        int iM25857C = m25857C(iM14842z) + iM25860F;
        return new gb1(str, str2, m25872w(bArr2, iM25857C, m25860F(bArr2, iM25857C, iM14842z), charsetM25858D));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x014b A[Catch: all -> 0x0142, Exception | OutOfMemoryError -> 0x0145, TryCatch #1 {all -> 0x0142, blocks: (B:107:0x013b, B:114:0x014b, B:121:0x0160, B:123:0x0167, B:131:0x0180, B:140:0x0195, B:151:0x01ad, B:158:0x01be, B:178:0x01fc, B:187:0x0213, B:188:0x0218), top: B:202:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[Catch: all -> 0x0142, Exception | OutOfMemoryError -> 0x0145, TryCatch #1 {all -> 0x0142, blocks: (B:107:0x013b, B:114:0x014b, B:121:0x0160, B:123:0x0167, B:131:0x0180, B:140:0x0195, B:151:0x01ad, B:158:0x01be, B:178:0x01fc, B:187:0x0213, B:188:0x0218), top: B:202:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:141:0x019a  */
    /* JADX WARN: Code duplicated, block: B:143:0x019e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:172:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:174:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0203  */
    /* JADX WARN: Code duplicated, block: B:183:0x020b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0218 A[Catch: all -> 0x0142, Exception | OutOfMemoryError -> 0x0201, TRY_LEAVE, TryCatch #0 {Exception | OutOfMemoryError -> 0x0201, blocks: (B:178:0x01fc, B:187:0x0213, B:188:0x0218), top: B:200:0x01ea }] */
    /* JADX INFO: renamed from: s */
    public static az3 m25868s(int i, k47 k47Var, boolean z, int i2, fg2 fg2Var) throws Throwable {
        int iM14809D;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        az3 az3Var;
        az3 rc0Var;
        boolean z7;
        int i4 = i;
        k47 k47Var2 = k47Var;
        int iM14842z = k47Var2.m14842z();
        int iM14842z2 = k47Var2.m14842z();
        int iM14842z3 = k47Var2.m14842z();
        int iM14842z4 = i4 >= 3 ? k47Var2.m14842z() : 0;
        if (i4 == 4) {
            iM14809D = k47Var2.m14809D();
            if (!z) {
                iM14809D = (((iM14809D >> 24) & 255) << 21) | (iM14809D & 255) | (((iM14809D >> 8) & 255) << 7) | (((iM14809D >> 16) & 255) << 14);
            }
        } else {
            iM14809D = i4 == 3 ? k47Var2.m14809D() : k47Var2.m14808C();
        }
        int iM14812G = i4 >= 3 ? k47Var2.m14812G() : 0;
        if (iM14842z == 0 && iM14842z2 == 0 && iM14842z3 == 0 && iM14842z4 == 0 && iM14809D == 0 && iM14812G == 0) {
            k47Var2.m14818M(k47Var2.f46702c);
            return null;
        }
        int i5 = k47Var2.f46701b + iM14809D;
        if (i5 > k47Var2.f46702c) {
            ss5.m21707d0("Id3Decoder", "Frame size exceeds remaining tag data");
            k47Var2.m14818M(k47Var2.f46702c);
            return null;
        }
        if (fg2Var != null) {
            switch (fg2Var.f39033a) {
                default:
                    if ((iM14842z == 67 && iM14842z2 == 79 && iM14842z3 == 77 && (iM14842z4 == 77 || i4 == 2)) || (iM14842z == 77 && iM14842z2 == 76 && iM14842z3 == 76 && (iM14842z4 == 84 || i4 == 2))) {
                        z7 = true;
                        break;
                    }
                case 4:
                    z7 = false;
                    break;
            }
            if (!z7) {
                k47Var2.m14818M(i5);
                return null;
            }
        }
        if (i4 == 3) {
            z3 = (iM14812G & 128) != 0;
            boolean z8 = (iM14812G & 64) != 0;
            z2 = (iM14812G & 32) != 0;
            z5 = z8;
            z6 = false;
            z4 = z3;
        } else if (i4 == 4) {
            boolean z9 = (iM14812G & 64) != 0;
            boolean z10 = (iM14812G & 8) != 0;
            z5 = (iM14812G & 4) != 0;
            z6 = (iM14812G & 2) != 0;
            boolean z11 = z10;
            z4 = (iM14812G & 1) != 0;
            z2 = z9;
            z3 = z11;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z3 || z5) {
            ss5.m21707d0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            k47Var2.m14818M(i5);
            return null;
        }
        if (z2) {
            iM14809D--;
            k47Var2.m14819N(1);
        }
        if (z4) {
            iM14809D -= 4;
            k47Var2.m14819N(4);
        }
        if (z6) {
            iM14809D = m25862H(iM14809D, k47Var2);
        }
        int i6 = 84;
        try {
            try {
                if (iM14842z != 84) {
                    if (iM14842z == i6) {
                        rc0Var = m25873x(iM14809D, k47Var2, m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4));
                    } else if (iM14842z != 87 && iM14842z2 == 88 && iM14842z3 == 88 && (i4 == 2 || iM14842z4 == 88)) {
                        rc0Var = m25856B(iM14809D, k47Var2);
                    } else if (iM14842z == 87) {
                        rc0Var = m25855A(iM14809D, k47Var2, m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4));
                    } else if (iM14842z != 80 && iM14842z2 == 82 && iM14842z3 == 73 && iM14842z4 == 86) {
                        rc0Var = m25871v(iM14809D, k47Var2);
                    } else if (iM14842z != 71 && iM14842z2 == 69 && iM14842z3 == 79 && (iM14842z4 == 66 || i4 == 2)) {
                        rc0Var = m25869t(iM14809D, k47Var2);
                    } else if (i4 == 2) {
                        if (iM14842z != 80 && iM14842z2 == 73 && iM14842z3 == 67) {
                            rc0Var = m25864o(k47Var2, iM14809D, i4);
                        } else if (iM14842z != 67 && iM14842z2 == 79 && iM14842z3 == 77 && (iM14842z4 == 77 || i4 == 2)) {
                            rc0Var = m25867r(iM14809D, k47Var2);
                        } else if (iM14842z != 67 && iM14842z2 == 72 && iM14842z3 == 65 && iM14842z4 == 80) {
                            i3 = iM14809D;
                            try {
                                rc0Var = m25865p(k47Var2, i3, i4, z, i2, fg2Var);
                                i4 = i;
                                k47Var2 = k47Var;
                            } catch (Exception | OutOfMemoryError e) {
                                e = e;
                                i4 = i;
                                k47Var2 = k47Var;
                                k47Var2.m14818M(i5);
                                az3Var = null;
                            } catch (Throwable th) {
                                th = th;
                                k47Var2 = k47Var;
                                k47Var2.m14818M(i5);
                                throw th;
                            }
                        } else {
                            i3 = iM14809D;
                            try {
                                if (iM14842z != 67 && iM14842z2 == 84 && iM14842z3 == 79 && iM14842z4 == 67) {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    rc0Var = m25866q(k47Var2, i3, i4, z, i2, fg2Var);
                                } else {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77 && iM14842z2 == 76 && iM14842z3 == 76 && iM14842z4 == 84) {
                                        rc0Var = m25870u(i3, k47Var2);
                                    } else {
                                        String strM25859E = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr = new byte[i3];
                                        k47Var2.m14827k(bArr, 0, i3);
                                        rc0Var = new rc0(strM25859E, bArr);
                                    }
                                }
                            } catch (Exception | OutOfMemoryError e2) {
                                e = e2;
                                k47Var2.m14818M(i5);
                                az3Var = null;
                            }
                        }
                        k47Var2.m14818M(i5);
                        az3Var = rc0Var;
                        e = null;
                    } else if (iM14842z != 65 && iM14842z2 == 80 && iM14842z3 == 73 && iM14842z4 == 67) {
                        rc0Var = m25864o(k47Var2, iM14809D, i4);
                    } else {
                        if (iM14842z != 67) {
                        }
                        if (iM14842z != 67) {
                            i3 = iM14809D;
                            if (iM14842z != 67) {
                                i4 = i;
                                k47Var2 = k47Var;
                                if (iM14842z != 77) {
                                    String strM25859E2 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr2 = new byte[i3];
                                    k47Var2.m14827k(bArr2, 0, i3);
                                    rc0Var = new rc0(strM25859E2, bArr2);
                                } else {
                                    String strM25859E3 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr3 = new byte[i3];
                                    k47Var2.m14827k(bArr3, 0, i3);
                                    rc0Var = new rc0(strM25859E3, bArr3);
                                }
                            } else {
                                i4 = i;
                                k47Var2 = k47Var;
                                if (iM14842z != 77) {
                                    String strM25859E4 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr4 = new byte[i3];
                                    k47Var2.m14827k(bArr4, 0, i3);
                                    rc0Var = new rc0(strM25859E4, bArr4);
                                } else {
                                    String strM25859E5 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr5 = new byte[i3];
                                    k47Var2.m14827k(bArr5, 0, i3);
                                    rc0Var = new rc0(strM25859E5, bArr5);
                                }
                            }
                            k47Var2.m14818M(i5);
                            az3Var = rc0Var;
                            e = null;
                        } else {
                            i3 = iM14809D;
                            if (iM14842z != 67) {
                                i4 = i;
                                k47Var2 = k47Var;
                                if (iM14842z != 77) {
                                    String strM25859E6 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr6 = new byte[i3];
                                    k47Var2.m14827k(bArr6, 0, i3);
                                    rc0Var = new rc0(strM25859E6, bArr6);
                                } else {
                                    String strM25859E7 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr7 = new byte[i3];
                                    k47Var2.m14827k(bArr7, 0, i3);
                                    rc0Var = new rc0(strM25859E7, bArr7);
                                }
                            } else {
                                i4 = i;
                                k47Var2 = k47Var;
                                if (iM14842z != 77) {
                                    String strM25859E8 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr8 = new byte[i3];
                                    k47Var2.m14827k(bArr8, 0, i3);
                                    rc0Var = new rc0(strM25859E8, bArr8);
                                } else {
                                    String strM25859E9 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                    byte[] bArr9 = new byte[i3];
                                    k47Var2.m14827k(bArr9, 0, i3);
                                    rc0Var = new rc0(strM25859E9, bArr9);
                                }
                            }
                            k47Var2.m14818M(i5);
                            az3Var = rc0Var;
                            e = null;
                        }
                    }
                    i3 = iM14809D;
                    k47Var2.m14818M(i5);
                    az3Var = rc0Var;
                    e = null;
                } else {
                    if (iM14842z2 == 88 && iM14842z3 == 88 && (i4 == 2 || iM14842z4 == 88)) {
                        rc0Var = m25875z(iM14809D, k47Var2);
                    } else {
                        i6 = 84;
                        if (iM14842z == i6) {
                            rc0Var = m25873x(iM14809D, k47Var2, m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4));
                        } else if (iM14842z != 87) {
                            if (iM14842z == 87) {
                                rc0Var = m25855A(iM14809D, k47Var2, m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4));
                            } else if (iM14842z != 80) {
                                if (iM14842z != 71) {
                                    if (i4 == 2) {
                                        if (iM14842z != 80) {
                                        }
                                        if (iM14842z != 67) {
                                        }
                                        if (iM14842z != 67) {
                                            i3 = iM14809D;
                                            if (iM14842z != 67) {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E10 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr10 = new byte[i3];
                                                    k47Var2.m14827k(bArr10, 0, i3);
                                                    rc0Var = new rc0(strM25859E10, bArr10);
                                                } else {
                                                    String strM25859E11 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr11 = new byte[i3];
                                                    k47Var2.m14827k(bArr11, 0, i3);
                                                    rc0Var = new rc0(strM25859E11, bArr11);
                                                }
                                            } else {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E12 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr12 = new byte[i3];
                                                    k47Var2.m14827k(bArr12, 0, i3);
                                                    rc0Var = new rc0(strM25859E12, bArr12);
                                                } else {
                                                    String strM25859E13 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr13 = new byte[i3];
                                                    k47Var2.m14827k(bArr13, 0, i3);
                                                    rc0Var = new rc0(strM25859E13, bArr13);
                                                }
                                            }
                                            k47Var2.m14818M(i5);
                                            az3Var = rc0Var;
                                            e = null;
                                        } else {
                                            i3 = iM14809D;
                                            if (iM14842z != 67) {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E14 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr14 = new byte[i3];
                                                    k47Var2.m14827k(bArr14, 0, i3);
                                                    rc0Var = new rc0(strM25859E14, bArr14);
                                                } else {
                                                    String strM25859E15 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr15 = new byte[i3];
                                                    k47Var2.m14827k(bArr15, 0, i3);
                                                    rc0Var = new rc0(strM25859E15, bArr15);
                                                }
                                            } else {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E16 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr16 = new byte[i3];
                                                    k47Var2.m14827k(bArr16, 0, i3);
                                                    rc0Var = new rc0(strM25859E16, bArr16);
                                                } else {
                                                    String strM25859E17 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr17 = new byte[i3];
                                                    k47Var2.m14827k(bArr17, 0, i3);
                                                    rc0Var = new rc0(strM25859E17, bArr17);
                                                }
                                            }
                                            k47Var2.m14818M(i5);
                                            az3Var = rc0Var;
                                            e = null;
                                        }
                                    } else {
                                        if (iM14842z != 65) {
                                        }
                                        if (iM14842z != 67) {
                                        }
                                        if (iM14842z != 67) {
                                            i3 = iM14809D;
                                            if (iM14842z != 67) {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E18 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr18 = new byte[i3];
                                                    k47Var2.m14827k(bArr18, 0, i3);
                                                    rc0Var = new rc0(strM25859E18, bArr18);
                                                } else {
                                                    String strM25859E19 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr19 = new byte[i3];
                                                    k47Var2.m14827k(bArr19, 0, i3);
                                                    rc0Var = new rc0(strM25859E19, bArr19);
                                                }
                                            } else {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr110 = new byte[i3];
                                                    k47Var2.m14827k(bArr110, 0, i3);
                                                    rc0Var = new rc0(strM25859E110, bArr110);
                                                } else {
                                                    String strM25859E111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr111 = new byte[i3];
                                                    k47Var2.m14827k(bArr111, 0, i3);
                                                    rc0Var = new rc0(strM25859E111, bArr111);
                                                }
                                            }
                                            k47Var2.m14818M(i5);
                                            az3Var = rc0Var;
                                            e = null;
                                        } else {
                                            i3 = iM14809D;
                                            if (iM14842z != 67) {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr112 = new byte[i3];
                                                    k47Var2.m14827k(bArr112, 0, i3);
                                                    rc0Var = new rc0(strM25859E112, bArr112);
                                                } else {
                                                    String strM25859E113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr113 = new byte[i3];
                                                    k47Var2.m14827k(bArr113, 0, i3);
                                                    rc0Var = new rc0(strM25859E113, bArr113);
                                                }
                                            } else {
                                                i4 = i;
                                                k47Var2 = k47Var;
                                                if (iM14842z != 77) {
                                                    String strM25859E114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr114 = new byte[i3];
                                                    k47Var2.m14827k(bArr114, 0, i3);
                                                    rc0Var = new rc0(strM25859E114, bArr114);
                                                } else {
                                                    String strM25859E115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                    byte[] bArr115 = new byte[i3];
                                                    k47Var2.m14827k(bArr115, 0, i3);
                                                    rc0Var = new rc0(strM25859E115, bArr115);
                                                }
                                            }
                                            k47Var2.m14818M(i5);
                                            az3Var = rc0Var;
                                            e = null;
                                        }
                                    }
                                } else if (i4 == 2) {
                                    if (iM14842z != 80) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr116 = new byte[i3];
                                                k47Var2.m14827k(bArr116, 0, i3);
                                                rc0Var = new rc0(strM25859E116, bArr116);
                                            } else {
                                                String strM25859E117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr117 = new byte[i3];
                                                k47Var2.m14827k(bArr117, 0, i3);
                                                rc0Var = new rc0(strM25859E117, bArr117);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr118 = new byte[i3];
                                                k47Var2.m14827k(bArr118, 0, i3);
                                                rc0Var = new rc0(strM25859E118, bArr118);
                                            } else {
                                                String strM25859E119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr119 = new byte[i3];
                                                k47Var2.m14827k(bArr119, 0, i3);
                                                rc0Var = new rc0(strM25859E119, bArr119);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E1110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1110 = new byte[i3];
                                                k47Var2.m14827k(bArr1110, 0, i3);
                                                rc0Var = new rc0(strM25859E1110, bArr1110);
                                            } else {
                                                String strM25859E1111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1111 = new byte[i3];
                                                k47Var2.m14827k(bArr1111, 0, i3);
                                                rc0Var = new rc0(strM25859E1111, bArr1111);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E1112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1112 = new byte[i3];
                                                k47Var2.m14827k(bArr1112, 0, i3);
                                                rc0Var = new rc0(strM25859E1112, bArr1112);
                                            } else {
                                                String strM25859E1113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1113 = new byte[i3];
                                                k47Var2.m14827k(bArr1113, 0, i3);
                                                rc0Var = new rc0(strM25859E1113, bArr1113);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                } else {
                                    if (iM14842z != 65) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E1114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1114 = new byte[i3];
                                                k47Var2.m14827k(bArr1114, 0, i3);
                                                rc0Var = new rc0(strM25859E1114, bArr1114);
                                            } else {
                                                String strM25859E1115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1115 = new byte[i3];
                                                k47Var2.m14827k(bArr1115, 0, i3);
                                                rc0Var = new rc0(strM25859E1115, bArr1115);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E1116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1116 = new byte[i3];
                                                k47Var2.m14827k(bArr1116, 0, i3);
                                                rc0Var = new rc0(strM25859E1116, bArr1116);
                                            } else {
                                                String strM25859E1117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1117 = new byte[i3];
                                                k47Var2.m14827k(bArr1117, 0, i3);
                                                rc0Var = new rc0(strM25859E1117, bArr1117);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E1118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1118 = new byte[i3];
                                                k47Var2.m14827k(bArr1118, 0, i3);
                                                rc0Var = new rc0(strM25859E1118, bArr1118);
                                            } else {
                                                String strM25859E1119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr1119 = new byte[i3];
                                                k47Var2.m14827k(bArr1119, 0, i3);
                                                rc0Var = new rc0(strM25859E1119, bArr1119);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11110 = new byte[i3];
                                                k47Var2.m14827k(bArr11110, 0, i3);
                                                rc0Var = new rc0(strM25859E11110, bArr11110);
                                            } else {
                                                String strM25859E11111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111 = new byte[i3];
                                                k47Var2.m14827k(bArr11111, 0, i3);
                                                rc0Var = new rc0(strM25859E11111, bArr11111);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                }
                            } else if (iM14842z != 71) {
                                if (i4 == 2) {
                                    if (iM14842z != 80) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11112 = new byte[i3];
                                                k47Var2.m14827k(bArr11112, 0, i3);
                                                rc0Var = new rc0(strM25859E11112, bArr11112);
                                            } else {
                                                String strM25859E11113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11113 = new byte[i3];
                                                k47Var2.m14827k(bArr11113, 0, i3);
                                                rc0Var = new rc0(strM25859E11113, bArr11113);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11114 = new byte[i3];
                                                k47Var2.m14827k(bArr11114, 0, i3);
                                                rc0Var = new rc0(strM25859E11114, bArr11114);
                                            } else {
                                                String strM25859E11115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11115 = new byte[i3];
                                                k47Var2.m14827k(bArr11115, 0, i3);
                                                rc0Var = new rc0(strM25859E11115, bArr11115);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11116 = new byte[i3];
                                                k47Var2.m14827k(bArr11116, 0, i3);
                                                rc0Var = new rc0(strM25859E11116, bArr11116);
                                            } else {
                                                String strM25859E11117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11117 = new byte[i3];
                                                k47Var2.m14827k(bArr11117, 0, i3);
                                                rc0Var = new rc0(strM25859E11117, bArr11117);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11118 = new byte[i3];
                                                k47Var2.m14827k(bArr11118, 0, i3);
                                                rc0Var = new rc0(strM25859E11118, bArr11118);
                                            } else {
                                                String strM25859E11119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11119 = new byte[i3];
                                                k47Var2.m14827k(bArr11119, 0, i3);
                                                rc0Var = new rc0(strM25859E11119, bArr11119);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                } else {
                                    if (iM14842z != 65) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111110 = new byte[i3];
                                                k47Var2.m14827k(bArr111110, 0, i3);
                                                rc0Var = new rc0(strM25859E111110, bArr111110);
                                            } else {
                                                String strM25859E111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111 = new byte[i3];
                                                k47Var2.m14827k(bArr111111, 0, i3);
                                                rc0Var = new rc0(strM25859E111111, bArr111111);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111112 = new byte[i3];
                                                k47Var2.m14827k(bArr111112, 0, i3);
                                                rc0Var = new rc0(strM25859E111112, bArr111112);
                                            } else {
                                                String strM25859E111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111113 = new byte[i3];
                                                k47Var2.m14827k(bArr111113, 0, i3);
                                                rc0Var = new rc0(strM25859E111113, bArr111113);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111114 = new byte[i3];
                                                k47Var2.m14827k(bArr111114, 0, i3);
                                                rc0Var = new rc0(strM25859E111114, bArr111114);
                                            } else {
                                                String strM25859E111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111115 = new byte[i3];
                                                k47Var2.m14827k(bArr111115, 0, i3);
                                                rc0Var = new rc0(strM25859E111115, bArr111115);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111116 = new byte[i3];
                                                k47Var2.m14827k(bArr111116, 0, i3);
                                                rc0Var = new rc0(strM25859E111116, bArr111116);
                                            } else {
                                                String strM25859E111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111117 = new byte[i3];
                                                k47Var2.m14827k(bArr111117, 0, i3);
                                                rc0Var = new rc0(strM25859E111117, bArr111117);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                }
                            } else if (i4 == 2) {
                                if (iM14842z != 80) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111118 = new byte[i3];
                                            k47Var2.m14827k(bArr111118, 0, i3);
                                            rc0Var = new rc0(strM25859E111118, bArr111118);
                                        } else {
                                            String strM25859E111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111119 = new byte[i3];
                                            k47Var2.m14827k(bArr111119, 0, i3);
                                            rc0Var = new rc0(strM25859E111119, bArr111119);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111110 = new byte[i3];
                                            k47Var2.m14827k(bArr1111110, 0, i3);
                                            rc0Var = new rc0(strM25859E1111110, bArr1111110);
                                        } else {
                                            String strM25859E1111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111, bArr1111111);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111112 = new byte[i3];
                                            k47Var2.m14827k(bArr1111112, 0, i3);
                                            rc0Var = new rc0(strM25859E1111112, bArr1111112);
                                        } else {
                                            String strM25859E1111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111113 = new byte[i3];
                                            k47Var2.m14827k(bArr1111113, 0, i3);
                                            rc0Var = new rc0(strM25859E1111113, bArr1111113);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111114 = new byte[i3];
                                            k47Var2.m14827k(bArr1111114, 0, i3);
                                            rc0Var = new rc0(strM25859E1111114, bArr1111114);
                                        } else {
                                            String strM25859E1111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111115 = new byte[i3];
                                            k47Var2.m14827k(bArr1111115, 0, i3);
                                            rc0Var = new rc0(strM25859E1111115, bArr1111115);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            } else {
                                if (iM14842z != 65) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111116 = new byte[i3];
                                            k47Var2.m14827k(bArr1111116, 0, i3);
                                            rc0Var = new rc0(strM25859E1111116, bArr1111116);
                                        } else {
                                            String strM25859E1111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111117 = new byte[i3];
                                            k47Var2.m14827k(bArr1111117, 0, i3);
                                            rc0Var = new rc0(strM25859E1111117, bArr1111117);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111118 = new byte[i3];
                                            k47Var2.m14827k(bArr1111118, 0, i3);
                                            rc0Var = new rc0(strM25859E1111118, bArr1111118);
                                        } else {
                                            String strM25859E1111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111119 = new byte[i3];
                                            k47Var2.m14827k(bArr1111119, 0, i3);
                                            rc0Var = new rc0(strM25859E1111119, bArr1111119);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111110 = new byte[i3];
                                            k47Var2.m14827k(bArr11111110, 0, i3);
                                            rc0Var = new rc0(strM25859E11111110, bArr11111110);
                                        } else {
                                            String strM25859E11111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111, bArr11111111);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111112 = new byte[i3];
                                            k47Var2.m14827k(bArr11111112, 0, i3);
                                            rc0Var = new rc0(strM25859E11111112, bArr11111112);
                                        } else {
                                            String strM25859E11111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111113 = new byte[i3];
                                            k47Var2.m14827k(bArr11111113, 0, i3);
                                            rc0Var = new rc0(strM25859E11111113, bArr11111113);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            }
                        } else if (iM14842z == 87) {
                            rc0Var = m25855A(iM14809D, k47Var2, m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4));
                        } else if (iM14842z != 80) {
                            if (iM14842z != 71) {
                                if (i4 == 2) {
                                    if (iM14842z != 80) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111114 = new byte[i3];
                                                k47Var2.m14827k(bArr11111114, 0, i3);
                                                rc0Var = new rc0(strM25859E11111114, bArr11111114);
                                            } else {
                                                String strM25859E11111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111115 = new byte[i3];
                                                k47Var2.m14827k(bArr11111115, 0, i3);
                                                rc0Var = new rc0(strM25859E11111115, bArr11111115);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111116 = new byte[i3];
                                                k47Var2.m14827k(bArr11111116, 0, i3);
                                                rc0Var = new rc0(strM25859E11111116, bArr11111116);
                                            } else {
                                                String strM25859E11111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111117 = new byte[i3];
                                                k47Var2.m14827k(bArr11111117, 0, i3);
                                                rc0Var = new rc0(strM25859E11111117, bArr11111117);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E11111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111118 = new byte[i3];
                                                k47Var2.m14827k(bArr11111118, 0, i3);
                                                rc0Var = new rc0(strM25859E11111118, bArr11111118);
                                            } else {
                                                String strM25859E11111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr11111119 = new byte[i3];
                                                k47Var2.m14827k(bArr11111119, 0, i3);
                                                rc0Var = new rc0(strM25859E11111119, bArr11111119);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111110 = new byte[i3];
                                                k47Var2.m14827k(bArr111111110, 0, i3);
                                                rc0Var = new rc0(strM25859E111111110, bArr111111110);
                                            } else {
                                                String strM25859E111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111111 = new byte[i3];
                                                k47Var2.m14827k(bArr111111111, 0, i3);
                                                rc0Var = new rc0(strM25859E111111111, bArr111111111);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                } else {
                                    if (iM14842z != 65) {
                                    }
                                    if (iM14842z != 67) {
                                    }
                                    if (iM14842z != 67) {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111112 = new byte[i3];
                                                k47Var2.m14827k(bArr111111112, 0, i3);
                                                rc0Var = new rc0(strM25859E111111112, bArr111111112);
                                            } else {
                                                String strM25859E111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111113 = new byte[i3];
                                                k47Var2.m14827k(bArr111111113, 0, i3);
                                                rc0Var = new rc0(strM25859E111111113, bArr111111113);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111114 = new byte[i3];
                                                k47Var2.m14827k(bArr111111114, 0, i3);
                                                rc0Var = new rc0(strM25859E111111114, bArr111111114);
                                            } else {
                                                String strM25859E111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111115 = new byte[i3];
                                                k47Var2.m14827k(bArr111111115, 0, i3);
                                                rc0Var = new rc0(strM25859E111111115, bArr111111115);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    } else {
                                        i3 = iM14809D;
                                        if (iM14842z != 67) {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111116 = new byte[i3];
                                                k47Var2.m14827k(bArr111111116, 0, i3);
                                                rc0Var = new rc0(strM25859E111111116, bArr111111116);
                                            } else {
                                                String strM25859E111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111117 = new byte[i3];
                                                k47Var2.m14827k(bArr111111117, 0, i3);
                                                rc0Var = new rc0(strM25859E111111117, bArr111111117);
                                            }
                                        } else {
                                            i4 = i;
                                            k47Var2 = k47Var;
                                            if (iM14842z != 77) {
                                                String strM25859E111111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111118 = new byte[i3];
                                                k47Var2.m14827k(bArr111111118, 0, i3);
                                                rc0Var = new rc0(strM25859E111111118, bArr111111118);
                                            } else {
                                                String strM25859E111111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                                byte[] bArr111111119 = new byte[i3];
                                                k47Var2.m14827k(bArr111111119, 0, i3);
                                                rc0Var = new rc0(strM25859E111111119, bArr111111119);
                                            }
                                        }
                                        k47Var2.m14818M(i5);
                                        az3Var = rc0Var;
                                        e = null;
                                    }
                                }
                            } else if (i4 == 2) {
                                if (iM14842z != 80) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111110 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111110, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111110, bArr1111111110);
                                        } else {
                                            String strM25859E1111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111111 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111111, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111111, bArr1111111111);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111112 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111112, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111112, bArr1111111112);
                                        } else {
                                            String strM25859E1111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111113 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111113, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111113, bArr1111111113);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111114 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111114, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111114, bArr1111111114);
                                        } else {
                                            String strM25859E1111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111115 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111115, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111115, bArr1111111115);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111116 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111116, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111116, bArr1111111116);
                                        } else {
                                            String strM25859E1111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111117 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111117, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111117, bArr1111111117);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            } else {
                                if (iM14842z != 65) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111118 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111118, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111118, bArr1111111118);
                                        } else {
                                            String strM25859E1111111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111119 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111119, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111119, bArr1111111119);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111110 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111110, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111110, bArr11111111110);
                                        } else {
                                            String strM25859E11111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111111 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111111, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111111, bArr11111111111);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111112 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111112, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111112, bArr11111111112);
                                        } else {
                                            String strM25859E11111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111113 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111113, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111113, bArr11111111113);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111114 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111114, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111114, bArr11111111114);
                                        } else {
                                            String strM25859E11111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111115 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111115, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111115, bArr11111111115);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            }
                        } else if (iM14842z != 71) {
                            if (i4 == 2) {
                                if (iM14842z != 80) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111116 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111116, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111116, bArr11111111116);
                                        } else {
                                            String strM25859E11111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111117 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111117, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111117, bArr11111111117);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E11111111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111118 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111118, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111118, bArr11111111118);
                                        } else {
                                            String strM25859E11111111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr11111111119 = new byte[i3];
                                            k47Var2.m14827k(bArr11111111119, 0, i3);
                                            rc0Var = new rc0(strM25859E11111111119, bArr11111111119);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111110 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111110, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111110, bArr111111111110);
                                        } else {
                                            String strM25859E111111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111111 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111111, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111111, bArr111111111111);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111112 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111112, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111112, bArr111111111112);
                                        } else {
                                            String strM25859E111111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111113 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111113, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111113, bArr111111111113);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            } else {
                                if (iM14842z != 65) {
                                }
                                if (iM14842z != 67) {
                                }
                                if (iM14842z != 67) {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111114 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111114, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111114, bArr111111111114);
                                        } else {
                                            String strM25859E111111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111115 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111115, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111115, bArr111111111115);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111116 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111116, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111116, bArr111111111116);
                                        } else {
                                            String strM25859E111111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111117 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111117, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111117, bArr111111111117);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                } else {
                                    i3 = iM14809D;
                                    if (iM14842z != 67) {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E111111111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111118 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111118, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111118, bArr111111111118);
                                        } else {
                                            String strM25859E111111111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr111111111119 = new byte[i3];
                                            k47Var2.m14827k(bArr111111111119, 0, i3);
                                            rc0Var = new rc0(strM25859E111111111119, bArr111111111119);
                                        }
                                    } else {
                                        i4 = i;
                                        k47Var2 = k47Var;
                                        if (iM14842z != 77) {
                                            String strM25859E1111111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111111110 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111111110, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111111110, bArr1111111111110);
                                        } else {
                                            String strM25859E1111111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                            byte[] bArr1111111111111 = new byte[i3];
                                            k47Var2.m14827k(bArr1111111111111, 0, i3);
                                            rc0Var = new rc0(strM25859E1111111111111, bArr1111111111111);
                                        }
                                    }
                                    k47Var2.m14818M(i5);
                                    az3Var = rc0Var;
                                    e = null;
                                }
                            }
                        } else if (i4 == 2) {
                            if (iM14842z != 80) {
                            }
                            if (iM14842z != 67) {
                            }
                            if (iM14842z != 67) {
                                i3 = iM14809D;
                                if (iM14842z != 67) {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E1111111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111112 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111112, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111112, bArr1111111111112);
                                    } else {
                                        String strM25859E1111111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111113 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111113, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111113, bArr1111111111113);
                                    }
                                } else {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E1111111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111114 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111114, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111114, bArr1111111111114);
                                    } else {
                                        String strM25859E1111111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111115 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111115, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111115, bArr1111111111115);
                                    }
                                }
                                k47Var2.m14818M(i5);
                                az3Var = rc0Var;
                                e = null;
                            } else {
                                i3 = iM14809D;
                                if (iM14842z != 67) {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E1111111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111116 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111116, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111116, bArr1111111111116);
                                    } else {
                                        String strM25859E1111111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111117 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111117, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111117, bArr1111111111117);
                                    }
                                } else {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E1111111111118 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111118 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111118, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111118, bArr1111111111118);
                                    } else {
                                        String strM25859E1111111111119 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr1111111111119 = new byte[i3];
                                        k47Var2.m14827k(bArr1111111111119, 0, i3);
                                        rc0Var = new rc0(strM25859E1111111111119, bArr1111111111119);
                                    }
                                }
                                k47Var2.m14818M(i5);
                                az3Var = rc0Var;
                                e = null;
                            }
                        } else {
                            if (iM14842z != 65) {
                            }
                            if (iM14842z != 67) {
                            }
                            if (iM14842z != 67) {
                                i3 = iM14809D;
                                if (iM14842z != 67) {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E11111111111110 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111110 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111110, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111110, bArr11111111111110);
                                    } else {
                                        String strM25859E11111111111111 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111111 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111111, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111111, bArr11111111111111);
                                    }
                                } else {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E11111111111112 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111112 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111112, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111112, bArr11111111111112);
                                    } else {
                                        String strM25859E11111111111113 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111113 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111113, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111113, bArr11111111111113);
                                    }
                                }
                                k47Var2.m14818M(i5);
                                az3Var = rc0Var;
                                e = null;
                            } else {
                                i3 = iM14809D;
                                if (iM14842z != 67) {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E11111111111114 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111114 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111114, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111114, bArr11111111111114);
                                    } else {
                                        String strM25859E11111111111115 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111115 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111115, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111115, bArr11111111111115);
                                    }
                                } else {
                                    i4 = i;
                                    k47Var2 = k47Var;
                                    if (iM14842z != 77) {
                                        String strM25859E11111111111116 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111116 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111116, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111116, bArr11111111111116);
                                    } else {
                                        String strM25859E11111111111117 = m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4);
                                        byte[] bArr11111111111117 = new byte[i3];
                                        k47Var2.m14827k(bArr11111111111117, 0, i3);
                                        rc0Var = new rc0(strM25859E11111111111117, bArr11111111111117);
                                    }
                                }
                                k47Var2.m14818M(i5);
                                az3Var = rc0Var;
                                e = null;
                            }
                        }
                    }
                    i3 = iM14809D;
                    k47Var2.m14818M(i5);
                    az3Var = rc0Var;
                    e = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception | OutOfMemoryError e3) {
            e = e3;
            i3 = iM14809D;
        }
        if (az3Var == null) {
            ss5.m21709e0("Id3Decoder", "Failed to decode frame: id=" + m25859E(i4, iM14842z, iM14842z2, iM14842z3, iM14842z4) + ", frameSize=" + i3, e);
        }
        return az3Var;
    }

    /* JADX INFO: renamed from: t */
    public static hl3 m25869t(int i, k47 k47Var) {
        int iM14842z = k47Var.m14842z();
        Charset charsetM25858D = m25858D(iM14842z);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        k47Var.m14827k(bArr, 0, i2);
        int iM25861G = m25861G(0, bArr);
        String strM11402l = ez5.m11402l(new String(bArr, 0, iM25861G, StandardCharsets.ISO_8859_1));
        int i3 = iM25861G + 1;
        int iM25860F = m25860F(bArr, i3, iM14842z);
        String strM25872w = m25872w(bArr, i3, iM25860F, charsetM25858D);
        int iM25857C = m25857C(iM14842z) + iM25860F;
        int iM25860F2 = m25860F(bArr, iM25857C, iM14842z);
        String strM25872w2 = m25872w(bArr, iM25857C, iM25860F2, charsetM25858D);
        int iM25857C2 = m25857C(iM14842z) + iM25860F2;
        return new hl3(strM11402l, strM25872w, strM25872w2, i2 <= iM25857C2 ? uma.f64081b : Arrays.copyOfRange(bArr, iM25857C2, i2));
    }

    /* JADX INFO: renamed from: u */
    public static i06 m25870u(int i, k47 k47Var) {
        int iM14812G = k47Var.m14812G();
        int iM14808C = k47Var.m14808C();
        int iM14808C2 = k47Var.m14808C();
        int iM14842z = k47Var.m14842z();
        int iM14842z2 = k47Var.m14842z();
        so0 so0Var = new so0();
        so0Var.m21508l(k47Var);
        int i2 = ((i - 10) * 8) / (iM14842z + iM14842z2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM21503g = so0Var.m21503g(iM14842z);
            int iM21503g2 = so0Var.m21503g(iM14842z2);
            iArr[i3] = iM21503g;
            iArr2[i3] = iM21503g2;
        }
        return new i06(iM14812G, iM14808C, iM14808C2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public static ok7 m25871v(int i, k47 k47Var) {
        byte[] bArr = new byte[i];
        k47Var.m14827k(bArr, 0, i);
        int iM25861G = m25861G(0, bArr);
        String str = new String(bArr, 0, iM25861G, StandardCharsets.ISO_8859_1);
        int i2 = iM25861G + 1;
        return new ok7(str, i <= i2 ? uma.f64081b : Arrays.copyOfRange(bArr, i2, i));
    }

    /* JADX INFO: renamed from: w */
    public static String m25872w(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* JADX INFO: renamed from: x */
    public static bw9 m25873x(int i, k47 k47Var, String str) {
        if (i < 1) {
            return null;
        }
        int iM14842z = k47Var.m14842z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        k47Var.m14827k(bArr, 0, i2);
        return new bw9(str, null, m25874y(bArr, iM14842z, 0));
    }

    /* JADX INFO: renamed from: y */
    public static ImmutableList m25874y(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m6291y("");
        }
        c14 c14VarM6284m = ImmutableList.m6284m();
        int iM25860F = m25860F(bArr, i2, i);
        while (i2 < iM25860F) {
            c14VarM6284m.m3157b(new String(bArr, i2, iM25860F - i2, m25858D(i)));
            i2 = m25857C(i) + iM25860F;
            iM25860F = m25860F(bArr, i2, i);
        }
        ImmutableList immutableListM4280g = c14VarM6284m.m4280g();
        return immutableListM4280g.isEmpty() ? ImmutableList.m6291y("") : immutableListM4280g;
    }

    /* JADX INFO: renamed from: z */
    public static bw9 m25875z(int i, k47 k47Var) {
        if (i < 1) {
            return null;
        }
        int iM14842z = k47Var.m14842z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        k47Var.m14827k(bArr, 0, i2);
        int iM25860F = m25860F(bArr, 0, iM14842z);
        return new bw9("TXXX", new String(bArr, 0, iM25860F, m25858D(iM14842z)), m25874y(bArr, iM14842z, m25857C(iM14842z) + iM25860F));
    }

    @Override // p000.h3d
    /* JADX INFO: renamed from: b */
    public final ey5 mo13039b(jy5 jy5Var, ByteBuffer byteBuffer) {
        return m25876n(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final ey5 m25876n(int i, byte[] bArr) {
        boolean z;
        yy3 yy3Var;
        int i2;
        int i3;
        int iM25862H;
        az3 az3VarM25868s;
        ArrayList arrayList = new ArrayList();
        k47 k47Var = new k47(i, bArr);
        boolean z2 = false;
        if (k47Var.m14820a() < 10) {
            ss5.m21707d0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM14808C = k47Var.m14808C();
            if (iM14808C == 4801587) {
                int iM14842z = k47Var.m14842z();
                k47Var.m14819N(1);
                int iM14842z2 = k47Var.m14842z();
                int iM14841y = k47Var.m14841y();
                if (iM14842z != 2) {
                    if (iM14842z == 3) {
                        if ((iM14842z2 & 64) != 0) {
                            int iM14829m = k47Var.m14829m();
                            k47Var.m14819N(iM14829m);
                            iM14841y -= iM14829m + 4;
                        }
                    } else if (iM14842z == 4) {
                        if ((iM14842z2 & 64) != 0) {
                            int iM14841y2 = k47Var.m14841y();
                            k47Var.m14819N(iM14841y2 - 4);
                            iM14841y -= iM14841y2;
                        }
                        if ((iM14842z2 & 16) != 0) {
                            iM14841y -= 10;
                        }
                    } else {
                        hn1.m13364n("Skipped ID3 tag with unsupported majorVersion=", iM14842z, "Id3Decoder");
                    }
                    if (iM14842z < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    yy3Var = new yy3(iM14842z, iM14841y, z);
                } else if ((iM14842z2 & 64) != 0) {
                    ss5.m21707d0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM14842z < 4 || (iM14842z2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yy3Var = new yy3(iM14842z, iM14841y, z);
                }
                if (yy3Var == null) {
                    return null;
                }
                i2 = yy3Var.f70640a;
                int i4 = k47Var.f46701b;
                i3 = i2 == 2 ? 6 : 10;
                iM25862H = yy3Var.f70642c;
                if (yy3Var.f70641b) {
                    iM25862H = m25862H(iM25862H, k47Var);
                }
                k47Var.m14817L(i4 + iM25862H);
                if (!m25863I(k47Var, i2, i3, false)) {
                    if (i2 == 4 || !m25863I(k47Var, 4, i3, true)) {
                        hn1.m13364n("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (k47Var.m14820a() >= i3) {
                    az3VarM25868s = m25868s(i2, k47Var, z2, i3, this.f72378a);
                    if (az3VarM25868s != null) {
                        arrayList.add(az3VarM25868s);
                    }
                }
                return new ey5(arrayList);
            }
            ss5.m21707d0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM14808C))));
        }
        yy3Var = null;
        if (yy3Var == null) {
            return null;
        }
        i2 = yy3Var.f70640a;
        int i5 = k47Var.f46701b;
        if (i2 == 2) {
        }
        iM25862H = yy3Var.f70642c;
        if (yy3Var.f70641b) {
            iM25862H = m25862H(iM25862H, k47Var);
        }
        k47Var.m14817L(i5 + iM25862H);
        if (!m25863I(k47Var, i2, i3, false)) {
            if (i2 == 4) {
            }
            hn1.m13364n("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        while (k47Var.m14820a() >= i3) {
            az3VarM25868s = m25868s(i2, k47Var, z2, i3, this.f72378a);
            if (az3VarM25868s != null) {
                arrayList.add(az3VarM25868s);
            }
        }
        return new ey5(arrayList);
    }
}
