package p436vf;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.kochava.tracker.BuildConfig;
import java.util.Arrays;
import nf.C7770a;
import p415uf.C9522a;

/* JADX INFO: renamed from: vf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9720d {

    /* JADX INFO: renamed from: a */
    public static final int[][] f49730a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f49731b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f49732c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, BuildConfig.SDK_TRUNCATE_LENGTH, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f49733d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:105:0x024d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0250  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254  */
    /* JADX INFO: renamed from: a */
    public static void m18223a(C7770a c7770a, ErrorCorrectionLevel errorCorrectionLevel, C9522a c9522a, int i10, C9718b c9718b) throws WriterException {
        boolean zM15475e;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15 = 0;
        for (byte[] bArr : c9718b.f49725a) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f49730a[0].length;
        m18226d(0, 0, c9718b);
        int i16 = c9718b.f49726b;
        int i17 = i16 - length;
        m18226d(i17, 0, c9718b);
        m18226d(0, i17, c9718b);
        m18225c(0, 7, c9718b);
        int i18 = i16 - 8;
        m18225c(i18, 7, c9718b);
        m18225c(0, i18, c9718b);
        m18227e(7, 0, c9718b);
        int i19 = c9718b.f49727c;
        int i20 = i19 - 7;
        m18227e(i20 - 1, 0, c9718b);
        m18227e(7, i20, c9718b);
        int i21 = i19 - 8;
        if (c9718b.m18220a(8, i21) == 0) {
            throw new WriterException();
        }
        c9718b.m18221b(8, i21, 1);
        int i22 = 5;
        int i23 = c9522a.f49030a;
        if (i23 >= 2) {
            int[] iArr = f49732c[i23 - 1];
            int length2 = iArr.length;
            int i24 = 0;
            while (i24 < length2) {
                int i25 = iArr[i24];
                if (i25 >= 0) {
                    int length3 = iArr.length;
                    while (i15 < length3) {
                        int i26 = iArr[i15];
                        if (i26 >= 0 && m18228f(c9718b.m18220a(i26, i25))) {
                            int i27 = i26 - 2;
                            int i28 = i25 - 2;
                            int i29 = 0;
                            while (i29 < i22) {
                                int[] iArr2 = f49731b[i29];
                                int i30 = length2;
                                int i31 = 0;
                                while (i31 < i22) {
                                    c9718b.m18221b(i27 + i31, i28 + i29, iArr2[i31]);
                                    i31++;
                                    i27 = i27;
                                    length3 = length3;
                                    i22 = 5;
                                }
                                i29++;
                                length2 = i30;
                                i22 = 5;
                            }
                        }
                        i15++;
                        i25 = i25;
                        length2 = length2;
                        length3 = length3;
                        i22 = 5;
                    }
                }
                i24++;
                length2 = length2;
                i15 = 0;
                i22 = 5;
            }
        }
        int i32 = 8;
        while (i32 < i18) {
            int i33 = i32 + 1;
            int i34 = i33 % 2;
            if (m18228f(c9718b.m18220a(i32, 6))) {
                c9718b.m18221b(i32, 6, i34);
            }
            if (m18228f(c9718b.m18220a(6, i32))) {
                c9718b.m18221b(6, i32, i34);
            }
            i32 = i33;
        }
        C7770a c7770a2 = new C7770a();
        if (!(i10 >= 0 && i10 < 8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i10;
        c7770a2.m15473c(bits, 5);
        c7770a2.m15473c(m18224b(bits, 1335), 10);
        C7770a c7770a3 = new C7770a();
        c7770a3.m15473c(21522, 15);
        if (c7770a2.f42693b != c7770a3.f42693b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i35 = 0;
        while (true) {
            int[] iArr3 = c7770a2.f42692a;
            if (i35 >= iArr3.length) {
                break;
            }
            iArr3[i35] = iArr3[i35] ^ c7770a3.f42692a[i35];
            i35++;
        }
        if (c7770a2.f42693b != 15) {
            throw new WriterException("should not happen but we got: " + c7770a2.f42693b);
        }
        int i36 = 0;
        while (true) {
            int i37 = c7770a2.f42693b;
            if (i36 >= i37) {
                break;
            }
            boolean zM15475e2 = c7770a2.m15475e((i37 - 1) - i36);
            int[] iArr4 = f49733d[i36];
            c9718b.m18222c(iArr4[0], iArr4[1], zM15475e2);
            if (i36 < 8) {
                c9718b.m18222c((i16 - i36) - 1, 8, zM15475e2);
            } else {
                c9718b.m18222c(8, (i36 - 8) + i20, zM15475e2);
            }
            i36++;
        }
        if (i23 >= 7) {
            C7770a c7770a4 = new C7770a();
            c7770a4.m15473c(i23, 6);
            c7770a4.m15473c(m18224b(i23, 7973), 12);
            if (c7770a4.f42693b != 18) {
                throw new WriterException("should not happen but we got: " + c7770a4.f42693b);
            }
            int i38 = 17;
            for (int i39 = 0; i39 < 6; i39++) {
                for (int i40 = 0; i40 < 3; i40++) {
                    boolean zM15475e3 = c7770a4.m15475e(i38);
                    i38--;
                    int i41 = (i19 - 11) + i40;
                    c9718b.m18222c(i39, i41, zM15475e3);
                    c9718b.m18222c(i41, i39, zM15475e3);
                }
            }
        }
        int i42 = i16 - 1;
        int i43 = i19 - 1;
        int i44 = 0;
        int i45 = -1;
        while (i42 > 0) {
            if (i42 == 6) {
                i42--;
            }
            while (i43 >= 0 && i43 < i19) {
                for (int i46 = 0; i46 < 2; i46++) {
                    int i47 = i42 - i46;
                    if (m18228f(c9718b.m18220a(i47, i43))) {
                        if (i44 < c7770a.f42693b) {
                            zM15475e = c7770a.m15475e(i44);
                            i44++;
                        } else {
                            zM15475e = false;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    i11 = i43 + i47;
                                    z10 = true;
                                    i12 = i11 & 1;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case 1:
                                    i11 = i43;
                                    z10 = true;
                                    i12 = i11 & 1;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case 2:
                                    i12 = i47 % 3;
                                    z10 = true;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case 3:
                                    i12 = (i43 + i47) % 3;
                                    z10 = true;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case 4:
                                    i11 = (i47 / 3) + (i43 / 2);
                                    z10 = true;
                                    i12 = i11 & 1;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case 5:
                                    int i48 = i43 * i47;
                                    i12 = (i48 % 3) + (i48 & 1);
                                    z10 = true;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    int i49 = i43 * i47;
                                    i13 = i49 & 1;
                                    i14 = i49 % 3;
                                    i11 = i14 + i13;
                                    z10 = true;
                                    i12 = i11 & 1;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i14 = (i43 * i47) % 3;
                                    i13 = (i43 + i47) & 1;
                                    i11 = i14 + i13;
                                    z10 = true;
                                    i12 = i11 & 1;
                                    if (i12 == 0) {
                                        z11 = z10;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        zM15475e = !zM15475e;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i10)));
                            }
                        }
                        c9718b.m18222c(i47, i43, zM15475e);
                    }
                }
                i43 += i45;
            }
            i45 = -i45;
            i43 += i45;
            i42 -= 2;
        }
        if (i44 == c7770a.f42693b) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i44 + '/' + c7770a.f42693b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static int m18224b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i11);
        int iNumberOfLeadingZeros2 = i10 << (iNumberOfLeadingZeros - 1);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= iNumberOfLeadingZeros) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - iNumberOfLeadingZeros);
        }
        return iNumberOfLeadingZeros2;
    }

    /* JADX INFO: renamed from: c */
    public static void m18225c(int i10, int i11, C9718b c9718b) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!m18228f(c9718b.m18220a(i13, i11))) {
                throw new WriterException();
            }
            c9718b.m18221b(i13, i11, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18226d(int i10, int i11, C9718b c9718b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f49730a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c9718b.m18221b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18227e(int i10, int i11, C9718b c9718b) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!m18228f(c9718b.m18220a(i10, i13))) {
                throw new WriterException();
            }
            c9718b.m18221b(i10, i13, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18228f(int i10) {
        return i10 == -1;
    }
}
