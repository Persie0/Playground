package p000;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class np7 {

    /* JADX INFO: renamed from: a */
    public static final ByteString f53103a;

    static {
        ByteString byteString = ByteString.f54513d;
        f53103a = iy5.m14193h("xn--");
    }

    /* JADX INFO: renamed from: a */
    public static int m17577a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    /* JADX INFO: renamed from: b */
    public static int m17578b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        ij6.m13948e(i, "unexpected digit: ");
        return 0;
    }
}
