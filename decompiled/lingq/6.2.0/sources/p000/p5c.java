package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p5c {

    /* JADX INFO: renamed from: a */
    public static final a6c f55622a;

    static {
        f55622a = (b5c.f7984f && b5c.f7983e) ? new a6c(1) : new a6c(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m18912a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            uk9.m22780o();
            return 0;
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }
}
