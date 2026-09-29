package androidx.glance.appwidget.protobuf;

import android.database.SQLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3695vr;
import p000.aha;
import p000.au3;
import p000.bk8;
import p000.cad;
import p000.cl9;
import p000.fg2;
import p000.ik8;
import p000.q94;
import p000.uk9;
import p000.vz1;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0683q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6106a;

    public /* synthetic */ C0683q(int i) {
        this.f6106a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2473b(bk8 bk8Var) throws Exception {
        bk8Var.getClass();
        ListBuilder listBuilderM23650t = vz1.m23650t();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (ik8VarMo2873e0.mo2876a0()) {
            try {
                listBuilderM23650t.add(ik8VarMo2873e0.mo2875L(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                    throw th2;
                }
            }
        }
        AbstractC3352my.m17126j(ik8VarMo2873e0, null);
        ListIterator listIterator = vz1.m23635i(listBuilderM23650t).listIterator(0);
        while (true) {
            au3 au3Var = (au3) listIterator;
            if (!au3Var.hasNext()) {
                return;
            }
            String str = (String) au3Var.next();
            if (cl9.m4842Y(str, "room_fts_content_sync_", false)) {
                AbstractC3695vr.m23496g(bk8Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2474d(bk8 bk8Var) throws Exception {
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA foreign_key_check(`TranslationSentence`)");
        try {
            if (ik8VarMo2873e0.mo2876a0()) {
                throw new SQLException(m2475f(ik8VarMo2873e0));
            }
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m2475f(ik8 ik8Var) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            if (i == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(ik8Var.mo2875L(0));
                sb.append("'.\n");
            }
            String strMo2875L = ik8Var.mo2875L(3);
            if (!linkedHashMap.containsKey(strMo2875L)) {
                linkedHashMap.put(strMo2875L, ik8Var.mo2875L(2));
            }
            i++;
        } while (ik8Var.mo2876a0());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC3393o1.m17725C(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static int m2476g(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            C0683q c0683q = AbstractC0684r.f6107a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC0684r.m2482c(i, aha.m411g(bArr, j));
        }
        if (i2 == 2) {
            return AbstractC0684r.m2483d(i, aha.m411g(bArr, j), aha.m411g(bArr, j + 1));
        }
        uk9.m22780o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x012d A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final String m2477a(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f6106a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    uk9.m22777k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw InvalidProtocolBufferException.m2268b();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || cad.m4482a(b6)) {
                                    throw InvalidProtocolBufferException.m2268b();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw InvalidProtocolBufferException.m2268b();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!cad.m4482a(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !cad.m4482a(b7) && !cad.m4482a(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.m2268b();
                                }
                                if (i3 < i5 - 1) {
                                    throw InvalidProtocolBufferException.m2268b();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!cad.m4482a(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || cad.m4482a(b9)))) {
                                    throw InvalidProtocolBufferException.m2268b();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw InvalidProtocolBufferException.m2268b();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw InvalidProtocolBufferException.m2268b();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw InvalidProtocolBufferException.m2268b();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (cad.m4482a(b3)) {
                            }
                            throw InvalidProtocolBufferException.m2268b();
                        }
                        if (i3 < i5 - 2) {
                            throw InvalidProtocolBufferException.m2268b();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!cad.m4482a(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.m2268b();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = q94.f57449a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw InvalidProtocolBufferException.m2268b();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX INFO: renamed from: c */
    public final int m2478c(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 57343;
        switch (this.f6106a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new Utf8$UnpairedSurrogateException(i7, length);
                                        }
                                        uk9.m22772f(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new Utf8$UnpairedSurrogateException(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            aha.m415k(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                aha.m415k(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    aha.m415k(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                                    long j5 = j3 + 2;
                                    aha.m415k(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    aha.m415k(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                aha.m415k(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                aha.m415k(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                aha.m415k(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                aha.m415k(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new Utf8$UnpairedSurrogateException(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new Utf8$UnpairedSurrogateException(i20, length2);
                                    }
                                    fg2.m11820i(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                aha.m415k(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                aha.m415k(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c = 2048;
                            c2 = 57343;
                        }
                    }
                    return (int) j3;
                }
                fg2.m11823l(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: e */
    public final int m2479e(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        byte bM411g;
        long j3;
        byte bM411g2;
        long j4;
        int i5 = i;
        switch (this.f6106a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) >= 0) {
                    long j5 = i5;
                    int i6 = (int) (((long) i2) - j5);
                    if (i6 < 16) {
                        j = 1;
                        i3 = 0;
                    } else {
                        int i7 = 8 - (((int) j5) & 7);
                        long j6 = j5;
                        j = 1;
                        i3 = 0;
                        while (true) {
                            if (i3 < i7) {
                                long j7 = j6 + 1;
                                if (aha.m411g(bArr, j6) >= 0) {
                                    i3++;
                                    j6 = j7;
                                }
                            } else {
                                while (true) {
                                    int i8 = i3 + 8;
                                    if (i8 <= i6) {
                                        if ((aha.f677c.m24506h(bArr, aha.f680f + j6) & (-9187201950435737472L)) == 0) {
                                            j6 += 8;
                                            i3 = i8;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i3 < i6) {
                                        long j8 = j6 + 1;
                                        if (aha.m411g(bArr, j6) >= 0) {
                                            i3++;
                                            j6 = j8;
                                        }
                                    } else {
                                        i3 = i6;
                                    }
                                }
                            }
                        }
                    }
                    int i9 = i6 - i3;
                    long j9 = j5 + ((long) i3);
                    while (true) {
                        byte bM411g3 = 0;
                        while (i9 > 0) {
                            long j10 = j9 + j;
                            bM411g3 = aha.m411g(bArr, j9);
                            if (bM411g3 >= 0) {
                                i9--;
                                j9 = j10;
                            } else {
                                j9 = j10;
                                if (i9 == 0) {
                                    i4 = i9 - 1;
                                    if (bM411g3 < -32) {
                                        if (i4 == 0) {
                                            return bM411g3;
                                        }
                                        i9 -= 2;
                                        if (bM411g3 >= -62) {
                                            j2 = j9 + j;
                                            if (aha.m411g(bArr, j9) > -65) {
                                                j9 = j2;
                                            }
                                        }
                                    } else if (bM411g3 < -16) {
                                        if (i4 < 2) {
                                            return m2476g(bArr, bM411g3, j9, i4);
                                        }
                                        i9 -= 3;
                                        long j11 = j9 + j;
                                        bM411g = aha.m411g(bArr, j9);
                                        if (bM411g > -65 && ((bM411g3 != -32 || bM411g >= -96) && (bM411g3 != -19 || bM411g < -96))) {
                                            j9 += 2;
                                            if (aha.m411g(bArr, j11) > -65) {
                                            }
                                        }
                                    } else {
                                        if (i4 < 3) {
                                            return m2476g(bArr, bM411g3, j9, i4);
                                        }
                                        i9 -= 4;
                                        j3 = j9 + j;
                                        bM411g2 = aha.m411g(bArr, j9);
                                        if (bM411g2 <= -65) {
                                            if ((((bM411g2 + 112) + (bM411g3 << 28)) >> 30) == 0) {
                                                j4 = 2 + j9;
                                                if (aha.m411g(bArr, j3) <= -65) {
                                                    j9 += 3;
                                                    if (aha.m411g(bArr, j4) > -65) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i9 == 0) {
                            i4 = i9 - 1;
                            if (bM411g3 < -32) {
                                if (i4 == 0) {
                                    return bM411g3;
                                }
                                i9 -= 2;
                                if (bM411g3 >= -62) {
                                    j2 = j9 + j;
                                    if (aha.m411g(bArr, j9) > -65) {
                                        j9 = j2;
                                    }
                                }
                            } else if (bM411g3 < -16) {
                                if (i4 < 2) {
                                    return m2476g(bArr, bM411g3, j9, i4);
                                }
                                i9 -= 3;
                                long j12 = j9 + j;
                                bM411g = aha.m411g(bArr, j9);
                                if (bM411g > -65) {
                                }
                            } else {
                                if (i4 < 3) {
                                    return m2476g(bArr, bM411g3, j9, i4);
                                }
                                i9 -= 4;
                                j3 = j9 + j;
                                bM411g2 = aha.m411g(bArr, j9);
                                if (bM411g2 <= -65) {
                                    if ((((bM411g2 + 112) + (bM411g3 << 28)) >> 30) == 0) {
                                        j4 = 2 + j9;
                                        if (aha.m411g(bArr, j3) <= -65) {
                                            j9 += 3;
                                            if (aha.m411g(bArr, j4) > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                uk9.m22777k("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)});
                return 0;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b = bArr[i5];
                if (b < 0) {
                    if (b < -32) {
                        if (i10 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i5 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i10 >= i2 - 1) {
                            return AbstractC0684r.m2480a(bArr, i10, i2);
                        }
                        int i11 = i5 + 2;
                        byte b2 = bArr[i10];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i5 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return AbstractC0684r.m2480a(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i13 = i5 + 3;
                            if (bArr[i12] <= -65) {
                                i5 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i10;
            }
        }
        return 0;
    }
}
