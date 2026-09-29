package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import nf.C7771b;
import p340qf.AbstractC8609l;
import p340qf.C8600c;

/* JADX INFO: loaded from: classes.dex */
public final class Code128Writer extends AbstractC8609l {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX INFO: renamed from: d */
    public static CType m9301d(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        if (i10 >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i11 = i10 + 1;
            if (i11 >= length) {
                return CType.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int i10;
        CType cTypeM9301d;
        char cCharAt;
        int i11;
        int iCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt2 = str.charAt(i12);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[][] iArr = C8600c.f46087a;
            if (i14 >= length) {
                arrayList.add(iArr[i15 % 103]);
                arrayList.add(iArr[106]);
                int i17 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i18 : iArr2) {
                        i17 += i18;
                    }
                }
                boolean[] zArr = new boolean[i17];
                Iterator it = arrayList.iterator();
                int iM16825a = 0;
                while (it.hasNext()) {
                    iM16825a += AbstractC8609l.m16825a(zArr, iM16825a, (int[]) it.next(), true);
                }
                return zArr;
            }
            CType cTypeM9301d2 = m9301d(i14, str);
            CType cType = CType.ONE_DIGIT;
            if (cTypeM9301d2 != cType) {
                CType cType2 = CType.UNCODABLE;
                if (cTypeM9301d2 != cType2) {
                    i10 = 99;
                    if (i16 != 99) {
                        if (i16 == 100) {
                            CType cType3 = CType.FNC_1;
                            if (cTypeM9301d2 != cType3 && (cTypeM9301d = m9301d(i14 + 2, str)) != cType2 && cTypeM9301d != cType) {
                                if (cTypeM9301d != cType3) {
                                    int i19 = i14 + 4;
                                    while (true) {
                                        CType cTypeM9301d3 = m9301d(i19, str);
                                        if (cTypeM9301d3 == CType.TWO_DIGITS) {
                                            i19 += 2;
                                        } else if (cTypeM9301d3 != CType.ONE_DIGIT) {
                                            i10 = 99;
                                        }
                                    }
                                } else if (m9301d(i14 + 3, str) == CType.TWO_DIGITS) {
                                    i10 = 99;
                                }
                            }
                            i10 = 100;
                        } else {
                            if (cTypeM9301d2 == CType.FNC_1) {
                                cTypeM9301d2 = m9301d(i14 + 1, str);
                            }
                            if (cTypeM9301d2 == CType.TWO_DIGITS) {
                                i10 = 99;
                            } else {
                                i10 = 100;
                            }
                        }
                    }
                } else if (i14 >= str.length() || ((cCharAt = str.charAt(i14)) >= ' ' && (i16 != 101 || cCharAt >= '`'))) {
                    i10 = 100;
                } else {
                    i10 = 101;
                }
            } else {
                i10 = 100;
            }
            if (i10 == i16) {
                switch (str.charAt(i14)) {
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
                        iCharAt = i16 == 101 ? 101 : 100;
                        break;
                    default:
                        if (i16 == 100) {
                            iCharAt = str.charAt(i14) - ' ';
                        } else if (i16 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i14, i14 + 2));
                            i14++;
                        } else {
                            iCharAt = str.charAt(i14) - ' ';
                            if (iCharAt < 0) {
                                iCharAt += 96;
                            }
                        }
                        break;
                }
                i14++;
            } else {
                if (i16 != 0) {
                    i11 = i10;
                } else if (i10 != 100) {
                    i11 = i10 != 101 ? 105 : 103;
                } else {
                    i11 = 104;
                }
                i16 = i10;
                iCharAt = i11;
            }
            arrayList.add(iArr[iCharAt]);
            i15 += iCharAt * i13;
            if (i14 != 0) {
                i13++;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p340qf.AbstractC8609l, p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo9303j0(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
