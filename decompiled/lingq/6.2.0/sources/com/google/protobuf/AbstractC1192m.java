package com.google.protobuf;

import p000.AbstractC3037gg;
import p000.uk9;
import p000.zga;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192m {

    /* JADX INFO: renamed from: a */
    public static final C1191l f13964a;

    static {
        f13964a = (zga.f71558e && zga.f71557d && !AbstractC3037gg.m12571a()) ? new C1191l(1) : new C1191l(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m6883a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m6885c(b, bArr[i]);
        }
        if (i3 == 2) {
            return m6886d(b, bArr[i], bArr[i + 1]);
        }
        uk9.m22780o();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m6884b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new Utf8$UnpairedSurrogateException(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        uk9.m22773g(((long) i2) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m6885c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m6886d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
