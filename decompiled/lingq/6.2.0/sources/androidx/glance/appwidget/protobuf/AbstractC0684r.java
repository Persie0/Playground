package androidx.glance.appwidget.protobuf;

import p000.AbstractC3074hg;
import p000.aha;
import p000.uk9;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0684r {

    /* JADX INFO: renamed from: a */
    public static final C0683q f6107a;

    static {
        f6107a = (aha.f679e && aha.f678d && !AbstractC3074hg.m13220a()) ? new C0683q(1) : new C0683q(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m2480a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m2482c(b, bArr[i]);
        }
        if (i3 == 2) {
            return m2483d(b, bArr[i], bArr[i + 1]);
        }
        uk9.m22780o();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m2481b(String str) {
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
    public static int m2482c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m2483d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
