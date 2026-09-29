package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f58208a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f58209b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m20163a('b', 8);
        m20163a('t', 9);
        m20163a('n', 10);
        m20163a('f', 12);
        m20163a('r', 13);
        m20163a('/', 47);
        m20163a('\"', 34);
        m20163a('\\', 92);
        byte[] bArr = f58209b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m20163a(char c, int i) {
        if (c != 'u') {
            f58208a[c] = (char) i;
        }
    }
}
