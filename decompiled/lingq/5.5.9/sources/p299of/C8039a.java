package p299of;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: of.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8039a {

    /* JADX INFO: renamed from: g */
    public static final C8039a f43691g = new C8039a(4201, 4096, 1);

    /* JADX INFO: renamed from: h */
    public static final C8039a f43692h = new C8039a(1033, 1024, 1);

    /* JADX INFO: renamed from: i */
    public static final C8039a f43693i = new C8039a(67, 64, 1);

    /* JADX INFO: renamed from: j */
    public static final C8039a f43694j = new C8039a(19, 16, 1);

    /* JADX INFO: renamed from: k */
    public static final C8039a f43695k = new C8039a(285, 256, 0);

    /* JADX INFO: renamed from: l */
    public static final C8039a f43696l = new C8039a(301, 256, 1);

    /* JADX INFO: renamed from: a */
    public final int[] f43697a;

    /* JADX INFO: renamed from: b */
    public final int[] f43698b;

    /* JADX INFO: renamed from: c */
    public final C8040b f43699c;

    /* JADX INFO: renamed from: d */
    public final int f43700d;

    /* JADX INFO: renamed from: e */
    public final int f43701e;

    /* JADX INFO: renamed from: f */
    public final int f43702f;

    public C8039a(int i10, int i11, int i12) {
        this.f43701e = i10;
        this.f43700d = i11;
        this.f43702f = i12;
        this.f43697a = new int[i11];
        this.f43698b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f43697a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f43698b[this.f43697a[i15]] = i15;
        }
        this.f43699c = new C8040b(this, new int[]{0});
        new C8040b(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public final int m15922a(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f43698b;
            return this.f43697a[(iArr[i10] + iArr[i11]) % (this.f43700d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f43701e));
        sb2.append(',');
        return C0204c.m853l(sb2, this.f43700d, ')');
    }
}
