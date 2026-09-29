package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import p000.C3386nv;
import p000.ad0;
import p000.fyb;
import p000.j41;

/* JADX INFO: renamed from: com.google.zxing.oned.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1193a extends fyb {
    /* JADX INFO: renamed from: d */
    public static Code128Writer$CType m6887d(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return Code128Writer$CType.UNCODABLE;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt == 241) {
            return Code128Writer$CType.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return Code128Writer$CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return Code128Writer$CType.ONE_DIGIT;
        }
        char cCharAt2 = str.charAt(i2);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? Code128Writer$CType.ONE_DIGIT : Code128Writer$CType.TWO_DIGITS;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    @Override // p000.fyb
    /* JADX INFO: renamed from: b */
    public final boolean[] mo4913b(String str) {
        int i;
        int i2;
        Code128Writer$CType code128Writer$CTypeM6887d;
        char cCharAt;
        int i3;
        int iCharAt;
        int[][] iArr = j41.f45034d;
        int length = str.length();
        if (length <= 0 || length > 80) {
            C3386nv.m17626m("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
            return null;
        }
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt2 = str.charAt(i4);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        C3386nv.m17626m("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                        return null;
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            Code128Writer$CType code128Writer$CTypeM6887d2 = m6887d(i6, str);
            Code128Writer$CType code128Writer$CType = Code128Writer$CType.ONE_DIGIT;
            if (code128Writer$CTypeM6887d2 == code128Writer$CType) {
                i2 = 100;
                i = 103;
            } else {
                i = 103;
                Code128Writer$CType code128Writer$CType2 = Code128Writer$CType.UNCODABLE;
                if (code128Writer$CTypeM6887d2 != code128Writer$CType2) {
                    i2 = 99;
                    if (i8 != 99) {
                        if (i8 == 100) {
                            Code128Writer$CType code128Writer$CType3 = Code128Writer$CType.FNC_1;
                            if (code128Writer$CTypeM6887d2 != code128Writer$CType3 && (code128Writer$CTypeM6887d = m6887d(i6 + 2, str)) != code128Writer$CType2 && code128Writer$CTypeM6887d != code128Writer$CType) {
                                if (code128Writer$CTypeM6887d != code128Writer$CType3) {
                                    int i9 = i6 + 4;
                                    while (true) {
                                        Code128Writer$CType code128Writer$CTypeM6887d3 = m6887d(i9, str);
                                        if (code128Writer$CTypeM6887d3 == Code128Writer$CType.TWO_DIGITS) {
                                            i9 += 2;
                                        } else if (code128Writer$CTypeM6887d3 != Code128Writer$CType.ONE_DIGIT) {
                                            i2 = 99;
                                        }
                                    }
                                } else if (m6887d(i6 + 3, str) == Code128Writer$CType.TWO_DIGITS) {
                                    i2 = 99;
                                }
                            }
                            i2 = 100;
                        } else {
                            if (code128Writer$CTypeM6887d2 == Code128Writer$CType.FNC_1) {
                                code128Writer$CTypeM6887d2 = m6887d(i6 + 1, str);
                            }
                            if (code128Writer$CTypeM6887d2 == Code128Writer$CType.TWO_DIGITS) {
                                i2 = 99;
                            } else {
                                i2 = 100;
                            }
                        }
                    }
                } else if (i6 >= str.length() || ((cCharAt = str.charAt(i6)) >= ' ' && (i8 != 101 || cCharAt >= '`'))) {
                    i2 = 100;
                } else {
                    i2 = 101;
                }
            }
            if (i2 == i8) {
                switch (str.charAt(i6)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        iCharAt = i8 == 101 ? 101 : 100;
                        break;
                    default:
                        if (i8 == 100) {
                            iCharAt = str.charAt(i6) - ' ';
                        } else if (i8 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i6, i6 + 2));
                            i6++;
                        } else {
                            char cCharAt3 = str.charAt(i6);
                            iCharAt = cCharAt3 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt3 + '@';
                            }
                        }
                        break;
                }
                i6++;
            } else {
                if (i8 != 0) {
                    i3 = i2;
                } else if (i2 != 100) {
                    i3 = i2 != 101 ? 105 : i;
                } else {
                    i3 = 104;
                }
                i8 = i2;
                iCharAt = i3;
            }
            arrayList.add(iArr[iCharAt]);
            i7 += iCharAt * i5;
            if (i6 != 0) {
                i5++;
            }
        }
        arrayList.add(iArr[i7 % 103]);
        arrayList.add(iArr[106]);
        int i10 = 0;
        for (int[] iArr2 : arrayList) {
            for (int i11 : iArr2) {
                i10 += i11;
            }
        }
        boolean[] zArr = new boolean[i10];
        Iterator it = arrayList.iterator();
        int iM12249a = 0;
        while (it.hasNext()) {
            iM12249a += fyb.m12249a(zArr, iM12249a, (int[]) it.next(), true);
        }
        return zArr;
    }

    @Override // p000.fyb, p000.p9b
    /* JADX INFO: renamed from: f */
    public final ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo4915f(str, barcodeFormat, enumMap);
        }
        C3386nv.m17626m("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }
}
