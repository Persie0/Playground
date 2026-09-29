package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class el3 {

    /* JADX INFO: renamed from: g */
    public static final el3 f37418g = new el3(4201, 4096, 1);

    /* JADX INFO: renamed from: h */
    public static final el3 f37419h = new el3(1033, 1024, 1);

    /* JADX INFO: renamed from: i */
    public static final el3 f37420i = new el3(67, 64, 1);

    /* JADX INFO: renamed from: j */
    public static final el3 f37421j = new el3(19, 16, 1);

    /* JADX INFO: renamed from: k */
    public static final el3 f37422k = new el3(285, 256, 0);

    /* JADX INFO: renamed from: l */
    public static final el3 f37423l = new el3(301, 256, 1);

    /* JADX INFO: renamed from: a */
    public final int[] f37424a;

    /* JADX INFO: renamed from: b */
    public final int[] f37425b;

    /* JADX INFO: renamed from: c */
    public final fl3 f37426c;

    /* JADX INFO: renamed from: d */
    public final int f37427d;

    /* JADX INFO: renamed from: e */
    public final int f37428e;

    /* JADX INFO: renamed from: f */
    public final int f37429f;

    public el3(int i, int i2, int i3) {
        this.f37428e = i;
        this.f37427d = i2;
        this.f37429f = i3;
        this.f37424a = new int[i2];
        this.f37425b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f37424a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f37425b[this.f37424a[i6]] = i6;
        }
        this.f37426c = new fl3(this, new int[]{0});
    }

    /* JADX INFO: renamed from: a */
    public final int m11215a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f37425b;
        return this.f37424a[(iArr[i] + iArr[i2]) % (this.f37427d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f37428e));
        sb.append(',');
        return wq1.m24122r(sb, this.f37427d, ')');
    }
}
