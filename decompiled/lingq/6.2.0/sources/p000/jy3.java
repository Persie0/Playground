package p000;

import com.google.zxing.BarcodeFormat;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jy3 extends fyb {

    /* JADX INFO: renamed from: c */
    public static final int[] f46385c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d */
    public static final int[] f46386d = {3, 1, 1};

    /* JADX INFO: renamed from: e */
    public static final int[][] f46387e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f46388b;

    public /* synthetic */ jy3(int i) {
        this.f46388b = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m14746d(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m14747e(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* JADX INFO: renamed from: g */
    public static void m14748g(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m14749h(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3 A[LOOP:4: B:80:0x01b1->B:81:0x01b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3 A[LOOP:5: B:84:0x01d1->B:85:0x01d3, LOOP_END] */
    @Override // p000.fyb
    /* JADX INFO: renamed from: b */
    public final boolean[] mo4913b(String str) {
        int[] iArr;
        int i;
        int i2;
        int[] iArr2;
        int iM12249a;
        int i3;
        int i4;
        int i5 = 9;
        boolean[] zArr = null;
        switch (this.f46388b) {
            case 0:
                int length = str.length();
                if (length % 2 != 0) {
                    C3386nv.m17626m("The length of the input should be even");
                } else if (length <= 80) {
                    zArr = new boolean[(length * 9) + 9];
                    int iM12249a2 = fyb.m12249a(zArr, 0, f46385c, true);
                    for (int i6 = 0; i6 < length; i6 += 2) {
                        int iDigit = Character.digit(str.charAt(i6), 10);
                        int iDigit2 = Character.digit(str.charAt(i6 + 1), 10);
                        int[] iArr3 = new int[10];
                        for (int i7 = 0; i7 < 5; i7++) {
                            int i8 = i7 * 2;
                            int[][] iArr4 = f46387e;
                            iArr3[i8] = iArr4[iDigit][i7];
                            iArr3[i8 + 1] = iArr4[iDigit2][i7];
                        }
                        iM12249a2 += fyb.m12249a(zArr, iM12249a2, iArr3, true);
                    }
                    fyb.m12249a(zArr, iM12249a2, f46386d, true);
                } else {
                    C3386nv.m17626m("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                return zArr;
            case 1:
                int[] iArr5 = j41.f45035e;
                int length2 = str.length();
                if (length2 <= 80) {
                    for (int i9 = 0; i9 < length2; i9++) {
                        if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i9)) < 0) {
                            int length3 = str.length();
                            StringBuilder sb = new StringBuilder();
                            for (int i10 = 0; i10 < length3; i10++) {
                                char cCharAt = str.charAt(i10);
                                if (cCharAt == 0) {
                                    sb.append("%U");
                                } else if (cCharAt == ' ') {
                                    sb.append(cCharAt);
                                } else if (cCharAt == '@') {
                                    sb.append("%V");
                                } else if (cCharAt == '`') {
                                    sb.append("%W");
                                } else if (cCharAt == '-' || cCharAt == '.') {
                                    sb.append(cCharAt);
                                } else if (cCharAt <= 26) {
                                    sb.append('$');
                                    sb.append((char) (cCharAt + '@'));
                                } else if (cCharAt < ' ') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt + '&'));
                                } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                                    sb.append('/');
                                    sb.append((char) (cCharAt + ' '));
                                } else if (cCharAt <= '9') {
                                    sb.append(cCharAt);
                                } else if (cCharAt <= '?') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt + 11));
                                } else if (cCharAt <= 'Z') {
                                    sb.append(cCharAt);
                                } else if (cCharAt <= '_') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt - 16));
                                } else if (cCharAt <= 'z') {
                                    sb.append('+');
                                    sb.append((char) (cCharAt - ' '));
                                } else {
                                    if (cCharAt > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i10) + "'");
                                    }
                                    sb.append('%');
                                    sb.append((char) (cCharAt - '+'));
                                }
                            }
                            str = sb.toString();
                            length2 = str.length();
                            if (length2 <= 80) {
                                iArr = new int[9];
                                i = length2 + 25;
                                for (i2 = 0; i2 < length2; i2++) {
                                    m14748g(iArr, iArr5["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2))]);
                                    for (i4 = 0; i4 < 9; i4++) {
                                        i += iArr[i4];
                                    }
                                }
                                zArr = new boolean[i];
                                m14748g(iArr, 148);
                                int iM12249a3 = fyb.m12249a(zArr, 0, iArr, true);
                                iArr2 = new int[]{1};
                                iM12249a = fyb.m12249a(zArr, iM12249a3, iArr2, false) + iM12249a3;
                                for (i3 = 0; i3 < length2; i3++) {
                                    m14748g(iArr, iArr5["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))]);
                                    int iM12249a4 = fyb.m12249a(zArr, iM12249a, iArr, true) + iM12249a;
                                    iM12249a = fyb.m12249a(zArr, iM12249a4, iArr2, false) + iM12249a4;
                                }
                                m14748g(iArr, 148);
                                fyb.m12249a(zArr, iM12249a, iArr, true);
                            } else {
                                C3386nv.m17626m(ux5.m22989l("Requested contents should be less than 80 digits long, but got ", length2, " (extended full ASCII mode)"));
                            }
                        }
                    }
                    iArr = new int[9];
                    i = length2 + 25;
                    while (i2 < length2) {
                        m14748g(iArr, iArr5["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2))]);
                        while (i4 < 9) {
                            i += iArr[i4];
                        }
                    }
                    zArr = new boolean[i];
                    m14748g(iArr, 148);
                    int iM12249a5 = fyb.m12249a(zArr, 0, iArr, true);
                    iArr2 = new int[]{1};
                    iM12249a = fyb.m12249a(zArr, iM12249a5, iArr2, false) + iM12249a5;
                    while (i3 < length2) {
                        m14748g(iArr, iArr5["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))]);
                        int iM12249a6 = fyb.m12249a(zArr, iM12249a, iArr, true) + iM12249a;
                        iM12249a = fyb.m12249a(zArr, iM12249a6, iArr2, false) + iM12249a6;
                    }
                    m14748g(iArr, 148);
                    fyb.m12249a(zArr, iM12249a, iArr, true);
                } else {
                    C3386nv.m17626m("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length2)));
                }
                return zArr;
            default:
                int[] iArr6 = j41.f45036f;
                int length4 = str.length();
                if (length4 <= 80) {
                    int[] iArr7 = new int[9];
                    int length5 = ((str.length() + 4) * 9) + 1;
                    m14749h(iArr7, iArr6[47]);
                    zArr = new boolean[length5];
                    m14746d(zArr, 0, iArr7);
                    for (int i11 = 0; i11 < length4; i11++) {
                        m14749h(iArr7, iArr6["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i11))]);
                        m14746d(zArr, i5, iArr7);
                        i5 += 9;
                    }
                    int iM14747e = m14747e(20, str);
                    m14749h(iArr7, iArr6[iM14747e]);
                    m14746d(zArr, i5, iArr7);
                    StringBuilder sbM22997t = ux5.m22997t(str);
                    sbM22997t.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM14747e));
                    m14749h(iArr7, iArr6[m14747e(15, sbM22997t.toString())]);
                    m14746d(zArr, i5 + 9, iArr7);
                    m14749h(iArr7, iArr6[47]);
                    m14746d(zArr, i5 + 18, iArr7);
                    zArr[i5 + 27] = true;
                } else {
                    C3386nv.m17626m("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length4)));
                }
                return zArr;
        }
    }

    @Override // p000.fyb, p000.p9b
    /* JADX INFO: renamed from: f */
    public final ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        switch (this.f46388b) {
            case 0:
                if (barcodeFormat == BarcodeFormat.ITF) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
            case 1:
                if (barcodeFormat == BarcodeFormat.CODE_39) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
            default:
                if (barcodeFormat == BarcodeFormat.CODE_93) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
        }
    }
}
