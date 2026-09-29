package tf;

import ae.C0062b;
import android.support.v4.media.C0141b;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import nf.C7770a;
import nf.C7771b;
import p242lf.InterfaceC7358c;
import p289o5.C7940t;
import p299of.C8039a;
import p415uf.C9522a;
import p436vf.C9717a;
import p436vf.C9718b;
import p436vf.C9719c;
import p436vf.C9720d;

/* JADX INFO: renamed from: tf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9280a implements InterfaceC7358c {
    /* JADX WARN: Code duplicated, block: B:326:0x061b  */
    /* JADX WARN: Code duplicated, block: B:360:0x069a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:415:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd A[EDGE_INSN: B:55:0x00bd->B:59:0x00c7 BREAK  A[LOOP:0: B:40:0x0096->B:52:0x00b5]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[EDGE_INSN: B:57:0x00c2->B:59:0x00c7 BREAK  A[LOOP:0: B:40:0x0096->B:52:0x00b5]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5 A[EDGE_INSN: B:58:0x00c5->B:59:0x00c7 BREAK  A[LOOP:0: B:40:0x0096->B:52:0x00b5]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0163 A[LOOP:1: B:78:0x0135->B:92:0x0163, LOOP_END] */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        boolean z10;
        Mode mode;
        C9522a c9522aM17983b;
        int i10;
        int i11;
        byte[][] bArr;
        C9522a c9522a;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        CharacterSetECI characterSetECIByName;
        int i14;
        boolean z15;
        boolean z16;
        char cCharAt;
        int i15;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
        int i16 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
        boolean zContainsKey = enumMap.containsKey(encodeHintType3);
        String string = zContainsKey ? enumMap.get(encodeHintType3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = C9719c.f49728a;
        if (!zEquals) {
            i14 = 0;
            z15 = false;
            z16 = false;
            while (true) {
                if (i14 < str.length()) {
                    if (z15) {
                        if (z16) {
                            mode = Mode.BYTE;
                            break;
                        }
                        mode = Mode.NUMERIC;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i14);
                if (cCharAt < '0') {
                    if (cCharAt < '`') {
                        i15 = iArr[cCharAt];
                    } else {
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z15 = true;
                } else {
                    if (cCharAt < '`') {
                        i15 = iArr[cCharAt];
                    } else {
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z15 = true;
                }
                i14++;
            }
        } else {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 != 0) {
                    z10 = false;
                    break;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z10 = true;
                        break;
                    }
                    int i18 = bytes[i17] & 255;
                    if ((i18 < 129 || i18 > 159) && (i18 < 224 || i18 > 235)) {
                        z10 = false;
                        break;
                    }
                    i17 += 2;
                }
            } catch (UnsupportedEncodingException unused) {
            }
            if (!z10) {
                i14 = 0;
                z15 = false;
                z16 = false;
                while (true) {
                    if (i14 < str.length()) {
                        if (z15) {
                            if (z16) {
                                mode = Mode.BYTE;
                                break;
                            }
                            mode = Mode.NUMERIC;
                            break;
                        }
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i14);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt < '`') {
                            i15 = iArr[cCharAt];
                        } else {
                            i15 = -1;
                        }
                        if (i15 == -1) {
                            mode = Mode.BYTE;
                            break;
                        }
                        z15 = true;
                    } else {
                        z16 = true;
                    }
                    i14++;
                }
            } else {
                mode = Mode.KANJI;
            }
        }
        C7770a c7770a = new C7770a();
        if (mode == Mode.BYTE && zContainsKey && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            c7770a.m15473c(Mode.ECI.getBits(), 4);
            c7770a.m15473c(characterSetECIByName.getValue(), 8);
        }
        EncodeHintType encodeHintType4 = EncodeHintType.GS1_FORMAT;
        if (enumMap.containsKey(encodeHintType4) && Boolean.valueOf(enumMap.get(encodeHintType4).toString()).booleanValue()) {
            c7770a.m15473c(Mode.FNC1_FIRST_POSITION.getBits(), 4);
        }
        c7770a.m15473c(mode.getBits(), 4);
        C7770a c7770a2 = new C7770a();
        int i19 = C9719c.a.f49729a[mode.ordinal()];
        if (i19 == 1) {
            int length2 = str.length();
            int i20 = 0;
            while (i20 < length2) {
                int iCharAt = str.charAt(i20) - '0';
                int i21 = i20 + 2;
                if (i21 < length2) {
                    c7770a2.m15473c(((str.charAt(i20 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i21) - '0'), 10);
                    i20 += 3;
                } else {
                    i20++;
                    if (i20 < length2) {
                        c7770a2.m15473c((iCharAt * 10) + (str.charAt(i20) - '0'), 7);
                        i20 = i21;
                    } else {
                        c7770a2.m15473c(iCharAt, 4);
                    }
                }
            }
        } else if (i19 == 2) {
            int length3 = str.length();
            int i22 = 0;
            while (i22 < length3) {
                char cCharAt2 = str.charAt(i22);
                int i23 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                if (i23 == -1) {
                    throw new WriterException();
                }
                int i24 = i22 + 1;
                if (i24 < length3) {
                    char cCharAt3 = str.charAt(i24);
                    int i25 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                    if (i25 == -1) {
                        throw new WriterException();
                    }
                    c7770a2.m15473c((i23 * 45) + i25, 11);
                    i22 += 2;
                } else {
                    c7770a2.m15473c(i23, 6);
                    i22 = i24;
                }
            }
        } else if (i19 == 3) {
            try {
                for (byte b10 : str.getBytes(string)) {
                    c7770a2.m15473c(b10, 8);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new WriterException(e10);
            }
        } else {
            if (i19 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i26 = 0; i26 < length4; i26 += 2) {
                    int i27 = ((bytes2[i26] & 255) << 8) | (bytes2[i26 + 1] & 255);
                    if (i27 < 33088 || i27 > 40956) {
                        if (i27 < 57408 || i27 > 60351) {
                            i12 = -1;
                        } else {
                            i13 = 49472;
                        }
                        if (i12 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        c7770a2.m15473c(((i12 >> 8) * 192) + (i12 & 255), 13);
                    } else {
                        i13 = 33088;
                    }
                    i12 = i27 - i13;
                    if (i12 != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    c7770a2.m15473c(((i12 >> 8) * 192) + (i12 & 255), 13);
                }
            } catch (UnsupportedEncodingException e11) {
                throw new WriterException(e11);
            }
        }
        EncodeHintType encodeHintType5 = EncodeHintType.QR_VERSION;
        if (enumMap.containsKey(encodeHintType5)) {
            c9522aM17983b = C9522a.m17983b(Integer.parseInt(enumMap.get(encodeHintType5).toString()));
            int characterCountBits = mode.getCharacterCountBits(c9522aM17983b) + c7770a.f42693b + c7770a2.f42693b;
            int i28 = c9522aM17983b.f49032c;
            C9522a.b bVar = c9522aM17983b.f49031b[errorCorrectionLevelValueOf.ordinal()];
            int i29 = 0;
            for (C9522a.a aVar : bVar.f49036b) {
                i29 += aVar.f49033a;
            }
            if (!(i28 - (i29 * bVar.f49035a) >= (characterCountBits + 7) / 8)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            int characterCountBits2 = mode.getCharacterCountBits(C9522a.m17983b(1)) + c7770a.f42693b + c7770a2.f42693b;
            int i30 = 1;
            while (true) {
                if (i30 > 40) {
                    throw new WriterException("Data too big");
                }
                C9522a c9522aM17983b2 = C9522a.m17983b(i30);
                int i31 = c9522aM17983b2.f49032c;
                C9522a.b bVar2 = c9522aM17983b2.f49031b[errorCorrectionLevelValueOf.ordinal()];
                int i32 = 0;
                for (C9522a.a aVar2 : bVar2.f49036b) {
                    i32 += aVar2.f49033a;
                }
                if (i31 - (i32 * bVar2.f49035a) >= (characterCountBits2 + 7) / 8) {
                    int characterCountBits3 = mode.getCharacterCountBits(c9522aM17983b2) + c7770a.f42693b + c7770a2.f42693b;
                    int i33 = 40;
                    int i34 = 1;
                    while (true) {
                        if (i34 > i33) {
                            throw new WriterException("Data too big");
                        }
                        C9522a c9522aM17983b3 = C9522a.m17983b(i34);
                        int i35 = c9522aM17983b3.f49032c;
                        C9522a.b bVar3 = c9522aM17983b3.f49031b[errorCorrectionLevelValueOf.ordinal()];
                        int i36 = 0;
                        for (C9522a.a aVar3 : bVar3.f49036b) {
                            i36 += aVar3.f49033a;
                        }
                        if (i35 - (i36 * bVar3.f49035a) >= (characterCountBits3 + 7) / 8) {
                            c9522aM17983b = c9522aM17983b3;
                            break;
                        }
                        i34++;
                        i33 = 40;
                    }
                } else {
                    i30++;
                }
            }
        }
        C7770a c7770a3 = new C7770a();
        int i37 = c7770a.f42693b;
        c7770a3.m15474d(c7770a3.f42693b + i37);
        for (int i38 = 0; i38 < i37; i38++) {
            c7770a3.m15472b(c7770a.m15475e(i38));
        }
        int length5 = mode == Mode.BYTE ? (c7770a2.f42693b + 7) / 8 : str.length();
        int characterCountBits4 = mode.getCharacterCountBits(c9522aM17983b);
        int i39 = 1 << characterCountBits4;
        if (length5 >= i39) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(length5);
            sb2.append(" is bigger than ");
            sb2.append(i39 - 1);
            throw new WriterException(sb2.toString());
        }
        c7770a3.m15473c(length5, characterCountBits4);
        int i40 = c7770a2.f42693b;
        c7770a3.m15474d(c7770a3.f42693b + i40);
        for (int i41 = 0; i41 < i40; i41++) {
            c7770a3.m15472b(c7770a2.m15475e(i41));
        }
        C9522a.b bVar4 = c9522aM17983b.f49031b[errorCorrectionLevelValueOf.ordinal()];
        int i42 = 0;
        for (C9522a.a aVar4 : bVar4.f49036b) {
            i42 += aVar4.f49033a;
        }
        int i43 = i42 * bVar4.f49035a;
        int i44 = c9522aM17983b.f49032c;
        int i45 = i44 - i43;
        int i46 = i45 << 3;
        if (c7770a3.f42693b > i46) {
            throw new WriterException("data bits cannot fit in the QR Code" + c7770a3.f42693b + " > " + i46);
        }
        for (int i47 = 0; i47 < 4 && c7770a3.f42693b < i46; i47++) {
            c7770a3.m15472b(false);
        }
        boolean z17 = false;
        int i48 = c7770a3.f42693b & 7;
        if (i48 > 0) {
            while (i48 < 8) {
                c7770a3.m15472b(z17);
                i48++;
                z17 = false;
            }
        }
        int i49 = i45 - ((c7770a3.f42693b + 7) / 8);
        for (int i50 = 0; i50 < i49; i50++) {
            c7770a3.m15473c((i50 & 1) == 0 ? 236 : 17, 8);
        }
        if (c7770a3.f42693b != i46) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i51 = 0;
        for (C9522a.a aVar5 : bVar4.f49036b) {
            i51 += aVar5.f49033a;
        }
        if ((c7770a3.f42693b + 7) / 8 != i45) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i51);
        int i52 = 0;
        int i53 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i52 < i51) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i52 >= i51) {
                throw new WriterException("Block ID too large");
            }
            int i54 = i44 % i51;
            int i55 = i51 - i54;
            int i56 = i44 / i51;
            int i57 = i56 + 1;
            int i58 = i45 / i51;
            int i59 = i58 + 1;
            int i60 = i16;
            int i61 = i56 - i58;
            ErrorCorrectionLevel errorCorrectionLevel = errorCorrectionLevelValueOf;
            int i62 = i57 - i59;
            if (i61 != i62) {
                throw new WriterException("EC bytes mismatch");
            }
            C9522a c9522a2 = c9522aM17983b;
            if (i51 != i55 + i54) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i44 != ((i59 + i62) * i54) + ((i58 + i61) * i55)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i52 < i55) {
                iArr2[0] = i58;
                iArr3[0] = i61;
            } else {
                iArr2[0] = i59;
                iArr3[0] = i62;
            }
            int i63 = iArr2[0];
            byte[] bArr2 = new byte[i63];
            int i64 = i53 << 3;
            int i65 = 0;
            while (i65 < i63) {
                int i66 = i51;
                int i67 = 0;
                int i68 = i44;
                int i69 = 0;
                for (int i70 = 8; i67 < i70; i70 = 8) {
                    if (c7770a3.m15475e(i64)) {
                        i69 |= 1 << (7 - i67);
                    }
                    i64++;
                    i67++;
                }
                bArr2[i65 + 0] = (byte) i69;
                i65++;
                i51 = i66;
                i44 = i68;
            }
            int i71 = i44;
            int i72 = i51;
            int i73 = iArr3[0];
            int[] iArr4 = new int[i63 + i73];
            for (int i74 = 0; i74 < i63; i74++) {
                iArr4[i74] = bArr2[i74] & 255;
            }
            new C7940t(C8039a.f43695k).m15750a(iArr4, i73);
            byte[] bArr3 = new byte[i73];
            for (int i75 = 0; i75 < i73; i75++) {
                bArr3[i75] = (byte) iArr4[i63 + i75];
            }
            arrayList.add(new C9717a(bArr2, bArr3));
            iMax = Math.max(iMax, i63);
            iMax2 = Math.max(iMax2, i73);
            i53 += iArr2[0];
            i52++;
            i51 = i72;
            i16 = i60;
            errorCorrectionLevelValueOf = errorCorrectionLevel;
            c9522aM17983b = c9522a2;
            i44 = i71;
        }
        C9522a c9522a3 = c9522aM17983b;
        ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevelValueOf;
        int i76 = i16;
        int i77 = i44;
        if (i45 != i53) {
            throw new WriterException("Data bytes does not match offset");
        }
        C7770a c7770a4 = new C7770a();
        for (int i78 = 0; i78 < iMax; i78++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((C9717a) it.next()).f49723a;
                if (i78 < bArr4.length) {
                    c7770a4.m15473c(bArr4[i78], 8);
                }
            }
        }
        for (int i79 = 0; i79 < iMax2; i79++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((C9717a) it2.next()).f49724b;
                if (i79 < bArr5.length) {
                    c7770a4.m15473c(bArr5[i79], 8);
                }
            }
        }
        if (i77 != (c7770a4.f42693b + 7) / 8) {
            StringBuilder sbM614j = C0141b.m614j("Interleaving error: ", i77, " and ");
            sbM614j.append((c7770a4.f42693b + 7) / 8);
            sbM614j.append(" differ.");
            throw new WriterException(sbM614j.toString());
        }
        C9522a c9522a4 = c9522a3;
        int i80 = (c9522a4.f49030a * 4) + 17;
        C9718b c9718b = new C9718b(i80, i80);
        int i81 = Integer.MAX_VALUE;
        int i82 = 0;
        int i83 = -1;
        while (true) {
            i10 = c9718b.f49727c;
            i11 = c9718b.f49726b;
            if (i82 >= 8) {
                break;
            }
            ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel2;
            C9720d.m18223a(c7770a4, errorCorrectionLevel3, c9522a4, i82, c9718b);
            int iM291N = C0062b.m291N(c9718b, false) + C0062b.m291N(c9718b, true);
            int i84 = 0;
            int i85 = 0;
            while (true) {
                int i86 = i10 - 1;
                bArr = c9718b.f49725a;
                if (i84 >= i86) {
                    break;
                }
                byte[] bArr6 = bArr[i84];
                int i87 = 0;
                while (i87 < i11 - 1) {
                    byte b11 = bArr6[i87];
                    int i88 = i87 + 1;
                    C7770a c7770a5 = c7770a4;
                    if (b11 == bArr6[i88]) {
                        byte[] bArr7 = bArr[i84 + 1];
                        if (b11 == bArr7[i87] && b11 == bArr7[i88]) {
                            i85++;
                        }
                    }
                    c7770a4 = c7770a5;
                    i87 = i88;
                }
                i84++;
            }
            C7770a c7770a6 = c7770a4;
            int i89 = (i85 * 3) + iM291N;
            int i90 = 0;
            for (int i91 = 0; i91 < i10; i91++) {
                int i92 = 0;
                while (i92 < i11) {
                    byte[] bArr8 = bArr[i91];
                    int i93 = i92 + 6;
                    if (i93 < i11) {
                        c9522a = c9522a4;
                        byte b12 = 1;
                        if (bArr8[i92] == 1 && bArr8[i92 + 1] == 0 && bArr8[i92 + 2] == 1 && bArr8[i92 + 3] == 1 && bArr8[i92 + 4] == 1 && bArr8[i92 + 5] == 0 && bArr8[i93] == 1) {
                            int iMax3 = Math.max(i92 - 4, 0);
                            int iMin = Math.min(i92, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z13 = true;
                                    break;
                                }
                                int i94 = iMin;
                                if (bArr8[iMax3] == b12) {
                                    z13 = false;
                                    break;
                                }
                                iMax3++;
                                b12 = 1;
                                iMin = i94;
                            }
                            if (z13) {
                                i90++;
                            } else {
                                int iMax4 = Math.max(i92 + 7, 0);
                                int iMin2 = Math.min(i92 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z14 = true;
                                        break;
                                    }
                                    byte[] bArr9 = bArr8;
                                    if (bArr8[iMax4] == 1) {
                                        z14 = false;
                                        break;
                                    }
                                    iMax4++;
                                    bArr8 = bArr9;
                                }
                                if (z14) {
                                    i90++;
                                }
                            }
                        }
                    } else {
                        c9522a = c9522a4;
                    }
                    int i95 = i91 + 6;
                    if (i95 < i10) {
                        byte b13 = 1;
                        if (bArr[i91][i92] == 1 && bArr[i91 + 1][i92] == 0 && bArr[i91 + 2][i92] == 1 && bArr[i91 + 3][i92] == 1 && bArr[i91 + 4][i92] == 1 && bArr[i91 + 5][i92] == 0 && bArr[i95][i92] == 1) {
                            int iMax5 = Math.max(i91 - 4, 0);
                            int iMin3 = Math.min(i91, bArr.length);
                            while (true) {
                                if (iMax5 >= iMin3) {
                                    z11 = true;
                                    break;
                                }
                                if (bArr[iMax5][i92] == b13) {
                                    z11 = false;
                                    break;
                                }
                                iMax5++;
                                b13 = 1;
                            }
                            if (z11) {
                                i90++;
                            } else {
                                int iMax6 = Math.max(i91 + 7, 0);
                                int iMin4 = Math.min(i91 + 11, bArr.length);
                                while (true) {
                                    if (iMax6 >= iMin4) {
                                        z12 = true;
                                        break;
                                    }
                                    if (bArr[iMax6][i92] == 1) {
                                        z12 = false;
                                        break;
                                    }
                                    iMax6++;
                                }
                                if (z12) {
                                    i90++;
                                }
                            }
                        }
                    }
                    i92++;
                    c9522a4 = c9522a;
                }
            }
            C9522a c9522a5 = c9522a4;
            int i96 = (i90 * 40) + i89;
            int i97 = 0;
            for (int i98 = 0; i98 < i10; i98++) {
                byte[] bArr10 = bArr[i98];
                for (int i99 = 0; i99 < i11; i99++) {
                    if (bArr10[i99] == 1) {
                        i97++;
                    }
                }
            }
            int i100 = i10 * i11;
            int iAbs = (((Math.abs((i97 << 1) - i100) * 10) / i100) * 10) + i96;
            if (iAbs < i81) {
                i81 = iAbs;
                i83 = i82;
            }
            i82++;
            c7770a4 = c7770a6;
            errorCorrectionLevel2 = errorCorrectionLevel3;
            c9522a4 = c9522a5;
        }
        C9720d.m18223a(c7770a4, errorCorrectionLevel2, c9522a4, i83, c9718b);
        int i101 = i76 << 1;
        int i102 = i11 + i101;
        int i103 = i101 + i10;
        int iMax7 = Math.max(200, i102);
        int iMax8 = Math.max(200, i103);
        int iMin5 = Math.min(iMax7 / i102, iMax8 / i103);
        int i104 = (iMax7 - (i11 * iMin5)) / 2;
        int i105 = (iMax8 - (i10 * iMin5)) / 2;
        C7771b c7771b = new C7771b(iMax7, iMax8);
        int i106 = 0;
        while (i106 < i10) {
            int i107 = 0;
            int i108 = i104;
            while (i107 < i11) {
                if (c9718b.m18220a(i107, i106) == 1) {
                    c7771b.m15478d(i108, i105, iMin5, iMin5);
                }
                i107++;
                i108 += iMin5;
            }
            i106++;
            i105 += iMin5;
        }
        return c7771b;
    }
}
