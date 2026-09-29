package p385sf;

import com.google.zxing.pdf417.encoder.Compaction;
import com.kochava.tracker.BuildConfig;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: sf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9001c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f47204a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f47205b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f47206c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f47207d;

    /* JADX INFO: renamed from: e */
    public static final Charset f47208e;

    /* JADX INFO: renamed from: sf.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47209a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f47209a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47209a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47209a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];
        f47206c = bArr;
        f47207d = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];
        f47208e = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f47204a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f47206c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f47207d, (byte) -1);
        while (true) {
            byte[] bArr3 = f47205b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f47207d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m17260a(byte[] bArr, int i10, int i11, StringBuilder sb2) {
        int i12;
        if (i10 == 1 && i11 == 0) {
            sb2.append((char) 913);
        } else if (i10 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i10 >= 6) {
            char[] cArr = new char[5];
            i12 = 0;
            while ((0 + i10) - i12 >= 6) {
                long j10 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j10 = (j10 << 8) + ((long) (bArr[i12 + i13] & 255));
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb2.append(cArr[i15]);
                }
                i12 += 6;
            }
        } else {
            i12 = 0;
        }
        while (i12 < 0 + i10) {
            sb2.append((char) (bArr[i12] & 255));
            i12++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17261b(int i10, int i11, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int iMin = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            int length = sb3.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb2.append(sb3.charAt(length));
                }
            }
            i12 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0110 A[EDGE_INSN: B:93:0x0110->B:72:0x0110 BREAK  A[LOOP:0: B:3:0x000f->B:110:0x000f], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m17262c(CharSequence charSequence, int i10, int i11, StringBuilder sb2, int i12) {
        StringBuilder sb3 = new StringBuilder(i11);
        int i13 = i12;
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            char cCharAt = charSequence.charAt(i15);
            byte[] bArr = f47207d;
            byte[] bArr2 = f47206c;
            if (i13 == 0) {
                if (m17264e(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'A'));
                    }
                } else if (m17263d(cCharAt)) {
                    sb3.append((char) 27);
                    i13 = 1;
                } else if (bArr2[cCharAt] != -1) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                    break;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        byte b10 = bArr[cCharAt];
                        if (b10 != -1) {
                            sb3.append((char) b10);
                        } else {
                            sb3.append((char) 29);
                            i13 = 0;
                        }
                    } else {
                        byte b11 = bArr2[cCharAt];
                        if (b11 != -1) {
                            sb3.append((char) b11);
                        } else if (m17264e(cCharAt)) {
                            sb3.append((char) 28);
                            i13 = 0;
                        } else if (m17263d(cCharAt)) {
                            sb3.append((char) 27);
                            i13 = 1;
                        } else {
                            int i16 = i15 + 1;
                            if (i16 < i11) {
                                if (bArr[charSequence.charAt(i16)] != -1) {
                                    sb3.append((char) 25);
                                    i13 = 3;
                                }
                            }
                            sb3.append((char) 29);
                            sb3.append((char) bArr[cCharAt]);
                        }
                    }
                } else if (m17263d(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'a'));
                    }
                } else if (m17264e(cCharAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt - 'A'));
                } else if (bArr2[cCharAt] != -1) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char cCharAt2 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 % 2 != 0) {
                cCharAt2 = (char) (sb3.charAt(i17) + (cCharAt2 * 30));
                sb2.append(cCharAt2);
            } else {
                cCharAt2 = sb3.charAt(i17);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((cCharAt2 * 30) + 29));
        }
        return i13;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m17263d(char c10) {
        if (c10 != ' ' && (c10 < 'a' || c10 > 'z')) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17264e(char c10) {
        if (c10 != ' ' && (c10 < 'A' || c10 > 'Z')) {
            return false;
        }
        return true;
    }
}
