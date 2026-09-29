package p000;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.session.C0702j;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType;
import com.google.android.gms.internal.mlkit_vision_text_common.AbstractC0981l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.token.TokenReadings;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class n58 implements fm1, xo6, xr2, xk0, fk6, e94, p9b, rn8, lkd, o9a {

    /* JADX INFO: renamed from: b */
    public static final n58 f52374b = new n58(0);

    /* JADX INFO: renamed from: c */
    public static final n58 f52375c = new n58(1);

    /* JADX INFO: renamed from: d */
    public static final n58 f52376d = new n58(2);

    /* JADX INFO: renamed from: e */
    public static final C0702j f52377e = new C0702j();

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ n58 f52378f = new n58(15);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52379a;

    public /* synthetic */ n58(int i) {
        this.f52379a = i;
    }

    /* JADX INFO: renamed from: c */
    public static ad0 m17230c(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        ad0 ad0Var = new ad0(length, length2);
        int[] iArr = ad0Var.f506d;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    ad0Var.m273b(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return ad0Var;
    }

    /* JADX INFO: renamed from: e */
    public static final Bundle m17231e(RemoteServiceWrapper$EventType remoteServiceWrapper$EventType, String str, List list) {
        if (!lp1.f49971a.contains(n58.class)) {
            try {
                remoteServiceWrapper$EventType.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("event", remoteServiceWrapper$EventType.toString());
                bundle.putString("app_id", str);
                if (RemoteServiceWrapper$EventType.CUSTOM_APP_EVENTS != remoteServiceWrapper$EventType) {
                    return bundle;
                }
                JSONArray jSONArrayM17235g = f52374b.m17235g(str, list);
                if (jSONArrayM17235g.length() != 0) {
                    bundle.putString("custom_events", jSONArrayM17235g.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                lp1.m16420a(n58.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static i72 m17232i(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new i72(httpURLConnection);
    }

    /* JADX INFO: renamed from: j */
    public static String m17233j(n58 n58Var, String str, String str2, LessonTransliteration lessonTransliteration, TokenTransliteration tokenTransliteration, TokenReadings tokenReadings, int i) {
        if ((i & 4) != 0) {
            lessonTransliteration = null;
        }
        if ((i & 8) != 0) {
            tokenTransliteration = null;
        }
        if ((i & 16) != 0) {
            tokenReadings = null;
        }
        n58Var.getClass();
        str.getClass();
        str2.getClass();
        return !str.equals(LanguageLearn.Japanese.getCode()) ? str2 : med.m16800a(str2, lessonTransliteration, tokenTransliteration, tokenReadings);
    }

    /* JADX INFO: renamed from: k */
    public static byte[][] m17234k(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p000.fk6
    /* JADX INFO: renamed from: a */
    public boolean mo11926a() {
        return true;
    }

    @Override // p000.o9a
    public /* synthetic */ Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.xo6
    /* JADX INFO: renamed from: b */
    public String mo9832b() {
        return "expected an Int value";
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        return (z68) obj;
    }

    @Override // p000.xk0
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.xr2
    /* JADX INFO: renamed from: d */
    public void mo10679d(as2 as2Var) {
        int i;
        String str = as2Var.f7417a;
        int i2 = as2Var.f7420d;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (zed.m25584c(cCharAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(as2Var.f7420d);
            char cCharAt3 = str.charAt(as2Var.f7420d + 1);
            if (zed.m25584c(cCharAt2) && zed.m25584c(cCharAt3)) {
                as2Var.m3019d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                as2Var.f7420d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cM3016a = as2Var.m3016a();
        int iM25587f = zed.m25587f(str, as2Var.f7420d, 0);
        if (iM25587f == 0) {
            if (!zed.m25585d(cM3016a)) {
                as2Var.m3019d((char) (cM3016a + 1));
                as2Var.f7420d++;
                return;
            } else {
                as2Var.m3019d((char) 235);
                as2Var.m3019d((char) (cM3016a - 127));
                as2Var.f7420d++;
                return;
            }
        }
        if (iM25587f == 1) {
            as2Var.m3019d((char) 230);
            as2Var.f7421e = 1;
            return;
        }
        if (iM25587f == 2) {
            as2Var.m3019d((char) 239);
            as2Var.f7421e = 2;
            return;
        }
        if (iM25587f == 3) {
            as2Var.m3019d((char) 238);
            as2Var.f7421e = 3;
        } else if (iM25587f == 4) {
            as2Var.m3019d((char) 240);
            as2Var.f7421e = 4;
        } else if (iM25587f != 5) {
            C3386nv.m17633t("Illegal mode: ".concat(String.valueOf(iM25587f)));
        } else {
            as2Var.m3019d((char) 231);
            as2Var.f7421e = 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:200:0x03f4 A[LOOP:13: B:199:0x03f2->B:200:0x03f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x040d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0416  */
    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        CharacterSetECI characterSetECIByName;
        boolean z;
        String str2;
        char c;
        char c2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int[][] iArr;
        int i5;
        int[][] iArr2;
        int i6;
        boolean z3;
        String str3;
        int i7;
        int i8;
        int i9;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            C3386nv.m17626m("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
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
            enumMap.get(encodeHintType3).getClass();
            ho2.m13383c();
            return null;
        }
        EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
        int i10 = enumMap.containsKey(encodeHintType4) ? Integer.parseInt(enumMap.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
        int i11 = enumMap.containsKey(encodeHintType5) ? Integer.parseInt(enumMap.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
        Charset charsetForName = enumMap.containsKey(encodeHintType6) ? Charset.forName(enumMap.get(encodeHintType6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i11 < 0 || i11 > 8) {
            C3386nv.m17626m("Error correction level must be between 0 and 8!");
            return null;
        }
        int i12 = 1 << (i11 + 1);
        Charset charset = i17.f43335e;
        StringBuilder sb = new StringBuilder(str.length());
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charsetForName.name())) != null) {
            int value = characterSetECIByName.getValue();
            if (value >= 0 && value < 900) {
                sb.append((char) 927);
                sb.append((char) value);
            } else if (value < 810900) {
                sb.append((char) 926);
                sb.append((char) ((value / DescriptorProtos.Edition.EDITION_LEGACY_VALUE) - 1));
                sb.append((char) (value % DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
            } else {
                if (value >= 811800) {
                    throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(value)));
                }
                sb.append((char) 925);
                sb.append((char) (810900 - value));
            }
        }
        int length = str.length();
        int i13 = h17.f41662a[compactionValueOf.ordinal()];
        if (i13 == 1) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            i17.m13615c(str, 0, length, sb, 0);
        } else if (i13 == 2) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            i17.m13613a(bytes.length, 1, sb, bytes);
        } else if (i13 != 3) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                int iM13615c = 0;
                while (true) {
                    if (i15 >= length) {
                        z = zBooleanValue;
                        str2 = str4;
                        break loop0;
                    }
                    int length2 = str.length();
                    char c3 = '0';
                    if (i15 < length2) {
                        int i16 = i15;
                        char cCharAt = str.charAt(i15);
                        int i17 = 0;
                        while (cCharAt >= '0' && cCharAt <= '9' && i16 < length2) {
                            i17++;
                            i16++;
                            if (i16 < length2) {
                                cCharAt = str.charAt(i16);
                            }
                        }
                        i6 = i17;
                    } else {
                        i6 = 0;
                    }
                    if (i6 >= 13) {
                        break;
                    }
                    int length3 = str.length();
                    int i18 = i15;
                    while (true) {
                        if (i18 < length3) {
                            str3 = str4;
                            char cCharAt2 = str.charAt(i18);
                            z3 = zBooleanValue;
                            int i19 = 0;
                            while (i19 < 13 && cCharAt2 >= c3 && cCharAt2 <= '9' && i18 < length3) {
                                i19++;
                                i18++;
                                if (i18 < length3) {
                                    cCharAt2 = str.charAt(i18);
                                }
                                c3 = '0';
                            }
                            if (i19 >= 13) {
                                i7 = (i18 - i15) - i19;
                                break;
                            }
                            if (i19 <= 0) {
                                char cCharAt3 = str.charAt(i18);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i18++;
                                }
                            }
                            zBooleanValue = z3;
                            str4 = str3;
                            c3 = '0';
                        } else {
                            z3 = zBooleanValue;
                            str3 = str4;
                        }
                        i7 = i18 - i15;
                        break;
                    }
                    if (i7 >= 5 || i6 == length) {
                        if (i14 != 0) {
                            sb.append((char) 900);
                            i14 = 0;
                            i8 = 0;
                        } else {
                            i8 = iM13615c;
                        }
                        iM13615c = i17.m13615c(str, i15, i7, sb, i8);
                        i15 += i7;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i20 = i15;
                        while (i20 < length4) {
                            char cCharAt4 = str.charAt(i20);
                            int i21 = 0;
                            while (true) {
                                if (i21 >= 13 || cCharAt4 < '0') {
                                    break;
                                }
                                if (cCharAt4 > '9' || (i9 = i20 + (i21 = i21 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i9);
                            }
                            if (i21 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i20);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i20++;
                        }
                        int i22 = i20 - i15;
                        if (i22 == 0) {
                            i22 = 1;
                        }
                        int i23 = i15 + i22;
                        byte[] bytes2 = str.substring(i15, i23).getBytes(charsetForName);
                        if (bytes2.length == 1 && i14 == 0) {
                            i17.m13613a(1, 0, sb, bytes2);
                        } else {
                            i17.m13613a(bytes2.length, i14, sb, bytes2);
                            i14 = 1;
                            iM13615c = 0;
                        }
                        i15 = i23;
                    }
                    zBooleanValue = z3;
                    str4 = str3;
                }
                sb.append((char) 902);
                i17.m13614b(i15, i6, str, sb);
                i15 += i6;
                i14 = 2;
            }
        } else {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            sb.append((char) 902);
            i17.m13614b(0, length, str, sb);
        }
        String string = sb.toString();
        int length5 = string.length();
        float f = 0.0f;
        int[] iArr3 = null;
        for (int i24 = 2; i24 <= 30; i24++) {
            int i25 = length5 + 1 + i12;
            int i26 = i25 / i24;
            int i27 = i26 + 1;
            if (i24 * i27 < i25 + i24) {
                i26 = i27;
            }
            if (i26 < 2) {
                break;
            }
            if (i26 <= 30) {
                float f2 = (((i24 * 17) + 69) * 0.357f) / (i26 * 2.0f);
                if (iArr3 == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr3 = new int[]{i24, i26};
                    f = f2;
                }
            }
        }
        if (iArr3 == null) {
            int i28 = length5 + 1 + i12;
            int i29 = i28 / 2;
            int i30 = i29 + 1;
            if (2 * i30 < i28 + 2) {
                i29 = i30;
            }
            if (i29 < 2) {
                c = 0;
                c2 = 1;
                iArr3 = new int[]{2, 2};
            } else {
                c = 0;
                c2 = 1;
            }
        } else {
            c = 0;
            c2 = 1;
        }
        if (iArr3 == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i31 = iArr3[c];
        int i32 = iArr3[c2];
        int i33 = (i31 * i32) - i12;
        int i34 = i33 > length5 + 1 ? (i33 - length5) - 1 : 0;
        if (length5 + i12 + 1 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i35 = length5 + i34 + 1;
        StringBuilder sb2 = new StringBuilder(i35);
        sb2.append((char) i35);
        sb2.append(string);
        for (int i36 = 0; i36 < i34; i36++) {
            sb2.append((char) 900);
        }
        String string2 = sb2.toString();
        if (i11 < 0 || i11 > 8) {
            C3386nv.m17626m(str2);
            return null;
        }
        char[] cArr = new char[i12];
        int length6 = string2.length();
        for (int i37 = 0; i37 < length6; i37++) {
            int i38 = i12 - 1;
            int iCharAt = (string2.charAt(i37) + cArr[i38]) % 929;
            while (true) {
                iArr2 = ewc.f38012a;
                if (i38 > 0) {
                    cArr[i38] = (char) ((cArr[i38 - 1] + (929 - ((iArr2[i11][i38] * iCharAt) % 929))) % 929);
                    i38--;
                }
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i11][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(i12);
        for (int i39 = i12 - 1; i39 >= 0; i39--) {
            char c4 = cArr[i39];
            if (c4 != 0) {
                cArr[i39] = (char) (929 - c4);
            }
            sb3.append(cArr[i39]);
        }
        String string3 = sb3.toString();
        k80 k80Var = new k80(i32, i31);
        String strConcat = string2.concat(string3);
        int i40 = 0;
        for (int i41 = 0; i41 < i32; i41++) {
            int i42 = i41 % 3;
            k80Var.f46843a++;
            ivc.m14162a(130728, 17, k80Var.m14980c());
            if (i42 == 0) {
                i3 = (i41 / 3) * 30;
                i = ((i32 - 1) / 3) + i3;
                i4 = i31 - 1;
            } else {
                if (i42 == 1) {
                    i3 = (i41 / 3) * 30;
                    int i43 = i32 - 1;
                    i = (i11 * 3) + i3 + (i43 % 3);
                    i4 = i43 / 3;
                } else {
                    int i44 = (i41 / 3) * 30;
                    i = (i31 - 1) + i44;
                    i2 = (i11 * 3) + i44 + ((i32 - 1) % 3);
                }
                iArr = ivc.f44689a;
                ivc.m14162a(iArr[i42][i], 17, k80Var.m14980c());
                for (i5 = 0; i5 < i31; i5++) {
                    ivc.m14162a(iArr[i42][strConcat.charAt(i40)], 17, k80Var.m14980c());
                    i40++;
                }
                if (z) {
                    ivc.m14162a(260649, 1, k80Var.m14980c());
                } else {
                    ivc.m14162a(iArr[i42][i2], 17, k80Var.m14980c());
                    ivc.m14162a(260649, 18, k80Var.m14980c());
                }
            }
            i2 = i4 + i3;
            iArr = ivc.f44689a;
            ivc.m14162a(iArr[i42][i], 17, k80Var.m14980c());
            while (i5 < i31) {
                ivc.m14162a(iArr[i42][strConcat.charAt(i40)], 17, k80Var.m14980c());
                i40++;
            }
            if (z) {
                ivc.m14162a(260649, 1, k80Var.m14980c());
            } else {
                ivc.m14162a(iArr[i42][i2], 17, k80Var.m14980c());
                ivc.m14162a(260649, 18, k80Var.m14980c());
            }
        }
        byte[][] bArrM14981d = k80Var.m14981d(1, 4);
        if (bArrM14981d[0].length < bArrM14981d.length) {
            bArrM14981d = m17234k(bArrM14981d);
            z2 = true;
        } else {
            z2 = false;
        }
        int length7 = 200 / bArrM14981d[0].length;
        int length8 = 200 / bArrM14981d.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return m17230c(bArrM14981d, i10);
        }
        byte[][] bArrM14981d2 = k80Var.m14981d(length7, length7 << 2);
        if (z2) {
            bArrM14981d2 = m17234k(bArrM14981d2);
        }
        return m17230c(bArrM14981d2, i10);
    }

    /* JADX INFO: renamed from: g */
    public JSONArray m17235g(String str, List list) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<AppEvent> arrayList = new ArrayList(list);
            st2.m21735b(arrayList);
            boolean zContains = set.contains(this);
            boolean z = false;
            if (!zContains) {
                try {
                    w23 w23VarM24862k = y23.m24862k(str, false);
                    if (w23VarM24862k != null) {
                        z = w23VarM24862k.f66252a;
                    }
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
            }
            for (AppEvent appEvent : arrayList) {
                boolean z2 = appEvent.f11382c;
                if (!z2 || (z2 && z)) {
                    jSONArray.put(appEvent.f11380a);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return null;
        }
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        switch (this.f52379a) {
            case 13:
                zzvb zzvbVar = (zzvb) obj;
                fs9 fs9Var = new fs9(zzvbVar.f12148a, zzvbVar.f12149b, zzvbVar.f12150c, zzvbVar.f12151d);
                List arrayList = zzvbVar.f12154g;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                AbstractC0981l.m5477a(arrayList, new j13());
                return fs9Var;
            default:
                zzl zzlVar = (zzl) obj;
                zzf zzfVar = zzlVar.f12120b;
                String str = zzlVar.f12125g;
                List listM14398c = jcd.m14398c(zzfVar);
                String str2 = zzlVar.f12123e;
                if (cfd.m4634i(str2)) {
                    str2 = "";
                }
                Rect rectM14397b = jcd.m14397b(listM14398c);
                if (cfd.m4634i(str)) {
                    str = "und";
                }
                AbstractC0981l.m5477a(Arrays.asList(zzlVar.f12119a), new nid());
                float f = zzlVar.f12120b.f12118e;
                return new gs9(str2, rectM14397b, listM14398c, str);
        }
    }

    @Override // p000.rn8
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.rn8
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // p000.fk6
    public void shutdown() {
    }
}
