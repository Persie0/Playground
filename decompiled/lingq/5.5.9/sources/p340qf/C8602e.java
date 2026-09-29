package p340qf;

import android.support.v4.media.session.C0166e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;

/* JADX INFO: renamed from: qf.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8602e extends AbstractC8609l {
    /* JADX INFO: renamed from: d */
    public static void m16821d(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int[] iArr;
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i10 = 0; i10 < length; i10++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                int length2 = str.length();
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < length2; i11++) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == 0) {
                        sb2.append("%U");
                    } else if (cCharAt == ' ') {
                        sb2.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb2.append("%V");
                    } else if (cCharAt == '`') {
                        sb2.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb2.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb2.append('$');
                        sb2.append((char) ((cCharAt - 1) + 65));
                    } else if (cCharAt < ' ') {
                        sb2.append('%');
                        sb2.append((char) ((cCharAt - 27) + 65));
                    } else {
                        if (cCharAt > ',' && cCharAt != '/') {
                            if (cCharAt != ':') {
                                if (cCharAt <= '9') {
                                    sb2.append((char) ((cCharAt - '0') + 48));
                                } else if (cCharAt <= '?') {
                                    sb2.append('%');
                                    sb2.append((char) ((cCharAt - ';') + 70));
                                } else if (cCharAt <= 'Z') {
                                    sb2.append((char) ((cCharAt - 'A') + 65));
                                } else if (cCharAt <= '_') {
                                    sb2.append('%');
                                    sb2.append((char) ((cCharAt - '[') + 75));
                                } else if (cCharAt <= 'z') {
                                    sb2.append('+');
                                    sb2.append((char) ((cCharAt - 'a') + 65));
                                } else {
                                    if (cCharAt > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                                    }
                                    sb2.append('%');
                                    sb2.append((char) ((cCharAt - '{') + 80));
                                }
                            }
                        }
                        sb2.append('/');
                        sb2.append((char) ((cCharAt - '!') + 65));
                    }
                }
                str = sb2.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(C0166e.m762h("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)"));
            }
        }
        int[] iArr2 = new int[9];
        int i12 = length + 25;
        int i13 = 0;
        while (true) {
            iArr = C8601d.f46088a;
            if (i13 >= length) {
                break;
            }
            m16821d(iArr2, iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))]);
            for (int i14 = 0; i14 < 9; i14++) {
                i12 += iArr2[i14];
            }
            i13++;
        }
        boolean[] zArr = new boolean[i12];
        m16821d(iArr2, 148);
        int iM16825a = AbstractC8609l.m16825a(zArr, 0, iArr2, true);
        int[] iArr3 = {1};
        int iM16825a2 = AbstractC8609l.m16825a(zArr, iM16825a, iArr3, false) + iM16825a;
        for (int i15 = 0; i15 < length; i15++) {
            m16821d(iArr2, iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i15))]);
            int iM16825a3 = AbstractC8609l.m16825a(zArr, iM16825a2, iArr2, true) + iM16825a2;
            iM16825a2 = AbstractC8609l.m16825a(zArr, iM16825a3, iArr3, false) + iM16825a3;
        }
        m16821d(iArr2, 148);
        AbstractC8609l.m16825a(zArr, iM16825a2, iArr2, true);
        return zArr;
    }

    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
