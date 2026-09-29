package p248ln;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: ln.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7400a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        "true".equals(property);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14799a(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i10 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i10 == 3) {
            objArr[1] = "encode8to7";
        } else if (i10 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i10 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i10 == 10) {
            objArr[1] = "dropMarker";
        } else if (i10 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i10 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i10) {
            case 1:
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 12 && i10 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m14800b(String[] strArr) {
        if (strArr == null) {
            m14799a(7);
            throw null;
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i10 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i11 = 0;
                    while (i11 < length2) {
                        bArr[i10] = (byte) str2.charAt(i11);
                        i11++;
                        i10++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i12 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i13 = 0;
            while (i13 < length4) {
                bArr2[i12] = (byte) str4.charAt(i13);
                i13++;
                i12++;
            }
        }
        for (int i14 = 0; i14 < length3; i14++) {
            bArr2[i14] = (byte) ((bArr2[i14] + 127) & 127);
        }
        int i15 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i15];
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = (bArr2[i16] & 255) >>> i17;
            i16++;
            int i20 = i17 + 1;
            bArr3[i18] = (byte) (i19 + ((bArr2[i16] & ((1 << i20) - 1)) << (7 - i17)));
            if (i17 == 6) {
                i16++;
                i17 = 0;
            } else {
                i17 = i20;
            }
        }
        return bArr3;
    }
}
