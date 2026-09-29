package p000;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class co2 extends fyb {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10346b;

    public /* synthetic */ co2(int i) {
        this.f10346b = i;
    }

    @Override // p000.fyb
    /* JADX INFO: renamed from: b */
    public final boolean[] mo4913b(String str) {
        boolean[] zArr = null;
        switch (this.f10346b) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!tea.m22017a(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused) {
                            C3386nv.m17626m("Illegal contents");
                        }
                    } else {
                        C3386nv.m17626m("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    return zArr;
                }
                try {
                    str = str + tea.m22018b(str);
                } catch (FormatException e) {
                    throw new IllegalArgumentException(e);
                }
                int i = bo2.f8762g[Character.digit(str.charAt(0), 10)];
                zArr = new boolean[95];
                int iM12249a = fyb.m12249a(zArr, 0, tea.f62201b, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iM12249a += fyb.m12249a(zArr, iM12249a, tea.f62205f[iDigit], false);
                }
                int iM12249a2 = fyb.m12249a(zArr, iM12249a, tea.f62202c, false) + iM12249a;
                for (int i3 = 7; i3 <= 12; i3++) {
                    iM12249a2 += fyb.m12249a(zArr, iM12249a2, tea.f62204e[Character.digit(str.charAt(i3), 10)], true);
                }
                fyb.m12249a(zArr, iM12249a2, tea.f62201b, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!tea.m22017a(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused2) {
                            C3386nv.m17626m("Illegal contents");
                        }
                    } else {
                        C3386nv.m17626m("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    return zArr;
                }
                try {
                    str = str + tea.m22018b(str);
                } catch (FormatException e2) {
                    throw new IllegalArgumentException(e2);
                }
                zArr = new boolean[67];
                int iM12249a3 = fyb.m12249a(zArr, 0, tea.f62201b, true);
                for (int i4 = 0; i4 <= 3; i4++) {
                    iM12249a3 += fyb.m12249a(zArr, iM12249a3, tea.f62204e[Character.digit(str.charAt(i4), 10)], false);
                }
                int iM12249a4 = fyb.m12249a(zArr, iM12249a3, tea.f62202c, false) + iM12249a3;
                for (int i5 = 4; i5 <= 7; i5++) {
                    iM12249a4 += fyb.m12249a(zArr, iM12249a4, tea.f62204e[Character.digit(str.charAt(i5), 10)], true);
                }
                fyb.m12249a(zArr, iM12249a4, tea.f62201b, true);
                return zArr;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!tea.m22017a(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused3) {
                            C3386nv.m17626m("Illegal contents");
                        }
                    } else {
                        C3386nv.m17626m("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    return zArr;
                }
                try {
                    str = str + tea.m22018b(bo2.m3993c(str));
                } catch (FormatException e3) {
                    throw new IllegalArgumentException(e3);
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 == 0 || iDigit2 == 1) {
                    int i6 = bo2.f8763h[iDigit2][Character.digit(str.charAt(7), 10)];
                    zArr = new boolean[51];
                    int iM12249a5 = fyb.m12249a(zArr, 0, tea.f62201b, true);
                    for (int i7 = 1; i7 <= 6; i7++) {
                        int iDigit3 = Character.digit(str.charAt(i7), 10);
                        if (((i6 >> (6 - i7)) & 1) == 1) {
                            iDigit3 += 10;
                        }
                        iM12249a5 += fyb.m12249a(zArr, iM12249a5, tea.f62205f[iDigit3], false);
                    }
                    fyb.m12249a(zArr, iM12249a5, tea.f62203d, false);
                } else {
                    C3386nv.m17626m("Number system must be 0 or 1");
                }
                return zArr;
        }
    }

    @Override // p000.fyb
    /* JADX INFO: renamed from: c */
    public final int mo4914c() {
        return 9;
    }

    @Override // p000.fyb, p000.p9b
    /* JADX INFO: renamed from: f */
    public final ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        switch (this.f10346b) {
            case 0:
                if (barcodeFormat == BarcodeFormat.EAN_13) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
            case 1:
                if (barcodeFormat == BarcodeFormat.EAN_8) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
            default:
                if (barcodeFormat == BarcodeFormat.UPC_E) {
                    return super.mo4915f(str, barcodeFormat, enumMap);
                }
                C3386nv.m17626m("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
                return null;
        }
    }
}
