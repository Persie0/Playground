package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class p80 {

    /* JADX INFO: renamed from: a */
    public static final Charset f55720a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static byte[] m18949a(String str) {
        byte[] bytes = str.getBytes(f55720a);
        int length = bytes.length;
        n80 n80Var = new n80(new byte[(length * 3) / 4]);
        if (!n80Var.m17278G(length, bytes)) {
            C3386nv.m17626m("bad base-64");
            return null;
        }
        int i = n80Var.f50743a;
        byte[] bArr = (byte[]) n80Var.f50744b;
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18950b(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int i5 = i2 + 3;
            bArr2 = o80.f53966c;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i3] = bArr2[(i6 >> 18) & 63];
            bArr3[i3 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i3 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i3 + 3] = bArr2[i6 & 63];
            int i7 = i3 + 4;
            i4--;
            if (i4 == 0) {
                i3 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i3 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & 255) << 4;
            bArr3[i3] = bArr2[(i8 >> 6) & 63];
            bArr3[i3 + 1] = bArr2[i8 & 63];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
            return bArr3;
        }
        if (i2 == length - 2) {
            int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i3] = bArr2[(i9 >> 12) & 63];
            bArr3[i3 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i3 + 2] = bArr2[i9 & 63];
            bArr3[i3 + 3] = 61;
        }
        return bArr3;
    }
}
