package p365rf;

import android.support.v4.media.session.C0166e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.EnumMap;
import nf.C7771b;
import p242lf.InterfaceC7358c;
import p261m9.C7524y;
import p338qd.C8584v;
import p385sf.C8999a;
import p385sf.C9000b;
import p385sf.C9001c;

/* JADX INFO: renamed from: rf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8779a implements InterfaceC7358c {
    /* JADX INFO: renamed from: a */
    public static C7771b m17037a(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr[0].length + i11;
        int length2 = bArr.length + i11;
        C7771b c7771b = new C7771b(length, length2);
        int[] iArr = c7771b.f42697d;
        int length3 = iArr.length;
        for (int i12 = 0; i12 < length3; i12++) {
            iArr[i12] = 0;
        }
        int i13 = (length2 - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    c7771b.m15477c(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return c7771b;
    }

    /* JADX INFO: renamed from: b */
    public static byte[][] m17038b(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0381  */
    /* JADX WARN: Code duplicated, block: B:218:0x0480 A[LOOP:13: B:217:0x047e->B:218:0x0480, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0499  */
    /* JADX WARN: Code duplicated, block: B:222:0x04a3  */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        int i10;
        int i11;
        int i12;
        int i13;
        CharacterSetECI characterSetECIByName;
        boolean z10;
        int i14;
        int i15;
        int i16;
        String str2;
        char c10;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        int i22;
        int[][] iArr;
        int i23;
        int[][] iArr2;
        boolean z12;
        int i24;
        String str3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        Compaction compactionValueOf = Compaction.AUTO;
        EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
        boolean zBooleanValue = enumMap.containsKey(encodeHintType) ? Boolean.valueOf(enumMap.get(encodeHintType).toString()).booleanValue() : false;
        EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
        if (enumMap.containsKey(encodeHintType2)) {
            compactionValueOf = Compaction.valueOf(enumMap.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
        if (enumMap.containsKey(encodeHintType3)) {
            ((C8999a) enumMap.get(encodeHintType3)).getClass();
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else {
            i10 = 2;
            i11 = 30;
            i12 = 2;
            i13 = 30;
        }
        EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
        int i32 = enumMap.containsKey(encodeHintType4) ? Integer.parseInt(enumMap.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
        int i33 = enumMap.containsKey(encodeHintType5) ? Integer.parseInt(enumMap.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
        Charset charsetForName = enumMap.containsKey(encodeHintType6) ? Charset.forName(enumMap.get(encodeHintType6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i33 < 0 || i33 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        int i34 = 1 << (i33 + 1);
        byte[] bArr = C9001c.f47204a;
        StringBuilder sb2 = new StringBuilder(str.length());
        Charset charset = C9001c.f47208e;
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charsetForName.name())) != null) {
            int value = characterSetECIByName.getValue();
            if (value >= 0 && value < 900) {
                sb2.append((char) 927);
                sb2.append((char) value);
            } else if (value < 810900) {
                sb2.append((char) 926);
                sb2.append((char) ((value / 900) - 1));
                sb2.append((char) (value % 900));
            } else {
                if (value >= 811800) {
                    throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(value)));
                }
                sb2.append((char) 925);
                sb2.append((char) (810900 - value));
            }
        }
        int length = str.length();
        int i35 = C9001c.a.f47209a[compactionValueOf.ordinal()];
        if (i35 == 1) {
            z10 = zBooleanValue;
            i14 = i10;
            i15 = i32;
            i16 = i33;
            str2 = "Error correction level must be between 0 and 8!";
            C9001c.m17262c(str, 0, length, sb2, 0);
        } else if (i35 == 2) {
            z10 = zBooleanValue;
            i14 = i10;
            i15 = i32;
            i16 = i33;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            C9001c.m17260a(bytes, bytes.length, 1, sb2);
        } else if (i35 != 3) {
            int i36 = 0;
            int i37 = 0;
            loop0: while (true) {
                int i38 = 0;
                while (true) {
                    if (i36 >= length) {
                        z10 = zBooleanValue;
                        i14 = i10;
                        i15 = i32;
                        i16 = i33;
                        str2 = str4;
                        break loop0;
                    }
                    int i39 = i38;
                    int length2 = str.length();
                    if (i36 < length2) {
                        i25 = 0;
                        str3 = str4;
                        char c11 = '0';
                        i24 = i32;
                        char cCharAt = str.charAt(i36);
                        z12 = zBooleanValue;
                        int i40 = i36;
                        while (true) {
                            if (!(cCharAt >= c11 && cCharAt <= '9') || i40 >= length2) {
                                break;
                            }
                            i25++;
                            i40++;
                            if (i40 < length2) {
                                cCharAt = str.charAt(i40);
                            }
                            c11 = '0';
                        }
                    } else {
                        z12 = zBooleanValue;
                        i24 = i32;
                        str3 = str4;
                        i25 = 0;
                    }
                    i26 = i25;
                    char c12 = '\r';
                    if (i26 >= 13) {
                        break;
                    }
                    int length3 = str.length();
                    int i41 = i36;
                    while (true) {
                        if (i41 < length3) {
                            i27 = i10;
                            int i42 = 0;
                            i28 = i33;
                            char cCharAt2 = str.charAt(i41);
                            while (i42 < c12) {
                                if (!(cCharAt2 >= '0' && cCharAt2 <= '9') || i41 >= length3) {
                                    c12 = '\r';
                                    break;
                                }
                                i42++;
                                i41++;
                                if (i41 < length3) {
                                    cCharAt2 = str.charAt(i41);
                                }
                                c12 = '\r';
                            }
                            if (i42 >= c12) {
                                i29 = (i41 - i36) - i42;
                                break;
                            }
                            if (i42 <= 0) {
                                char cCharAt3 = str.charAt(i41);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == c12 || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i41++;
                                }
                            }
                            c12 = '\r';
                            i33 = i28;
                            i10 = i27;
                        } else {
                            i27 = i10;
                            i28 = i33;
                        }
                        i29 = i41 - i36;
                        break;
                    }
                    if (i29 >= 5 || i26 == length) {
                        if (i37 != 0) {
                            sb2.append((char) 900);
                            i30 = 0;
                            i37 = 0;
                        } else {
                            i30 = i39;
                        }
                        int iM17262c = C9001c.m17262c(str, i36, i29, sb2, i30);
                        i36 += i29;
                        i38 = iM17262c;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i43 = i36;
                        while (i43 < length4) {
                            char cCharAt4 = str.charAt(i43);
                            int i44 = 0;
                            while (i44 < 13) {
                                if (!(cCharAt4 >= '0' && cCharAt4 <= '9') || (i31 = i43 + (i44 = i44 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i31);
                            }
                            if (i44 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i43);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i43++;
                        }
                        int i45 = i43 - i36;
                        if (i45 == 0) {
                            i45 = 1;
                        }
                        int i46 = i45 + i36;
                        byte[] bytes2 = str.substring(i36, i46).getBytes(charsetForName);
                        if (bytes2.length == 1 && i37 == 0) {
                            C9001c.m17260a(bytes2, 1, 0, sb2);
                            i38 = i39;
                        } else {
                            C9001c.m17260a(bytes2, bytes2.length, i37, sb2);
                            i37 = 1;
                            i38 = 0;
                        }
                        i36 = i46;
                    }
                    str4 = str3;
                    i32 = i24;
                    zBooleanValue = z12;
                    i33 = i28;
                    i10 = i27;
                }
                sb2.append((char) 902);
                C9001c.m17261b(i36, i26, str, sb2);
                i36 += i26;
                i37 = 2;
                str4 = str3;
                i32 = i24;
                zBooleanValue = z12;
            }
        } else {
            z10 = zBooleanValue;
            i14 = i10;
            i15 = i32;
            i16 = i33;
            str2 = "Error correction level must be between 0 and 8!";
            sb2.append((char) 902);
            C9001c.m17261b(0, length, str, sb2);
        }
        String string = sb2.toString();
        int length5 = string.length();
        float f3 = 0.0f;
        int[] iArr3 = null;
        for (int i47 = i14; i47 <= i11; i47++) {
            int i48 = length5 + 1 + i34;
            int i49 = (i48 / i47) + 1;
            if (i47 * i49 >= i48 + i47) {
                i49--;
            }
            if (i49 < i12) {
                break;
            }
            if (i49 <= i13) {
                float f10 = (((i47 * 17) + 69) * 0.357f) / (i49 * 2.0f);
                if (iArr3 == null || Math.abs(f10 - 3.0f) <= Math.abs(f3 - 3.0f)) {
                    iArr3 = new int[]{i47, i49};
                    f3 = f10;
                }
            }
        }
        if (iArr3 == null) {
            int i50 = length5 + 1 + i34;
            int i51 = (i50 / i14) + 1;
            if (i14 * i51 >= i50 + i14) {
                i51--;
            }
            if (i51 < i12) {
                c10 = 0;
                i17 = 1;
                iArr3 = new int[]{i14, i12};
            } else {
                c10 = 0;
                i17 = 1;
            }
        } else {
            c10 = 0;
            i17 = 1;
        }
        if (iArr3 == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i52 = iArr3[c10];
        int i53 = iArr3[i17];
        int i54 = (i52 * i53) - i34;
        int i55 = i54 > length5 + 1 ? (i54 - length5) - 1 : 0;
        if (i34 + length5 + i17 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i56 = length5 + i55 + i17;
        StringBuilder sb3 = new StringBuilder(i56);
        sb3.append((char) i56);
        sb3.append(string);
        for (int i57 = 0; i57 < i55; i57++) {
            sb3.append((char) 900);
        }
        String string2 = sb3.toString();
        if (i16 < 0 || (i18 = i16) > 8) {
            throw new IllegalArgumentException(str2);
        }
        char[] cArr = new char[i34];
        int length6 = string2.length();
        for (int i58 = 0; i58 < length6; i58++) {
            int i59 = i34 - 1;
            int iCharAt = (string2.charAt(i58) + cArr[i59]) % 929;
            while (true) {
                iArr2 = C9000b.f47196a;
                if (i59 > 0) {
                    int i60 = i59 - 1;
                    cArr[i59] = (char) ((cArr[i60] + (929 - ((iArr2[i18][i59] * iCharAt) % 929))) % 929);
                    i59 = i60;
                }
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i18][0]) % 929)) % 929);
        }
        StringBuilder sb4 = new StringBuilder(i34);
        while (true) {
            i34--;
            if (i34 < 0) {
                break;
            }
            char c13 = cArr[i34];
            if (c13 != 0) {
                cArr[i34] = (char) (929 - c13);
            }
            sb4.append(cArr[i34]);
        }
        String string3 = sb4.toString();
        C7524y c7524y = new C7524y(i53, i52);
        String strM765k = C0166e.m765k(string2, string3);
        int i61 = 0;
        for (int i62 = 0; i62 < i53; i62++) {
            int i63 = i62 % 3;
            c7524y.f41535a++;
            C8584v.m16793r(130728, 17, c7524y.m15026a());
            if (i63 == 0) {
                i21 = (i62 / 3) * 30;
                i19 = ((i53 - 1) / 3) + i21;
                i22 = i52 - 1;
            } else {
                if (i63 == 1) {
                    i21 = (i62 / 3) * 30;
                    int i64 = i53 - 1;
                    i19 = (i18 * 3) + i21 + (i64 % 3);
                    i22 = i64 / 3;
                } else {
                    int i65 = (i62 / 3) * 30;
                    i19 = (i52 - 1) + i65;
                    i20 = (i18 * 3) + i65 + ((i53 - 1) % 3);
                }
                iArr = C8584v.f46024e;
                C8584v.m16793r(iArr[i63][i19], 17, c7524y.m15026a());
                for (i23 = 0; i23 < i52; i23++) {
                    C8584v.m16793r(iArr[i63][strM765k.charAt(i61)], 17, c7524y.m15026a());
                    i61++;
                }
                if (z10) {
                    C8584v.m16793r(260649, 1, c7524y.m15026a());
                } else {
                    C8584v.m16793r(iArr[i63][i20], 17, c7524y.m15026a());
                    C8584v.m16793r(260649, 18, c7524y.m15026a());
                }
            }
            i20 = i22 + i21;
            iArr = C8584v.f46024e;
            C8584v.m16793r(iArr[i63][i19], 17, c7524y.m15026a());
            while (i23 < i52) {
                C8584v.m16793r(iArr[i63][strM765k.charAt(i61)], 17, c7524y.m15026a());
                i61++;
            }
            if (z10) {
                C8584v.m16793r(260649, 1, c7524y.m15026a());
            } else {
                C8584v.m16793r(iArr[i63][i20], 17, c7524y.m15026a());
                C8584v.m16793r(260649, 18, c7524y.m15026a());
            }
        }
        byte[][] bArrM15027b = c7524y.m15027b(1, 4);
        if (bArrM15027b[0].length < bArrM15027b.length) {
            bArrM15027b = m17038b(bArrM15027b);
            z11 = true;
        } else {
            z11 = false;
        }
        int length7 = 200 / bArrM15027b[0].length;
        int length8 = 200 / bArrM15027b.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return m17037a(bArrM15027b, i15);
        }
        byte[][] bArrM15027b2 = c7524y.m15027b(length7, length7 << 2);
        if (z11) {
            bArrM15027b2 = m17038b(bArrM15027b2);
        }
        return m17037a(bArrM15027b2, i15);
    }
}
