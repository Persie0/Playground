package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfg {

    /* JADX INFO: renamed from: a */
    public static byte[] f3085a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    private static byte[] f3086b = new byte[255];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            f3086b[i2] = -1;
        }
        while (true) {
            byte[] bArr = f3085a;
            int length = bArr.length;
            if (i >= 64) {
                byte[] bArr2 = f3086b;
                bArr2[9] = -2;
                bArr2[10] = -2;
                bArr2[13] = -2;
                bArr2[32] = -2;
                bArr2[61] = -3;
                return;
            }
            f3086b[bArr[i]] = (byte) i;
            i++;
        }
    }
}
