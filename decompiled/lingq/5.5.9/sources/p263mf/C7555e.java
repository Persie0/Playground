package p263mf;

/* JADX INFO: renamed from: mf.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7555e {

    /* JADX INFO: renamed from: e */
    public static final C7555e f41664e = new C7555e(AbstractC7556f.f41669b, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f41665a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7556f f41666b;

    /* JADX INFO: renamed from: c */
    public final int f41667c;

    /* JADX INFO: renamed from: d */
    public final int f41668d;

    public C7555e(AbstractC7556f abstractC7556f, int i10, int i11, int i12) {
        this.f41666b = abstractC7556f;
        this.f41665a = i10;
        this.f41667c = i11;
        this.f41668d = i12;
    }

    /* JADX INFO: renamed from: a */
    public final C7555e m15072a(int i10) {
        int i11;
        AbstractC7556f c7554d = this.f41666b;
        int i12 = this.f41665a;
        int i13 = this.f41668d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = C7553c.f41658c[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            c7554d.getClass();
            i13 += i16;
            c7554d = new C7554d(c7554d, i15, i16);
        }
        int i17 = this.f41667c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        int i18 = i17 + 1;
        C7555e c7555e = new C7555e(c7554d, i12, i18, i13 + i11);
        if (i18 == 2078) {
            c7555e = c7555e.m15073b(i10 + 1);
        }
        return c7555e;
    }

    /* JADX INFO: renamed from: b */
    public final C7555e m15073b(int i10) {
        int i11 = this.f41667c;
        if (i11 == 0) {
            return this;
        }
        AbstractC7556f abstractC7556f = this.f41666b;
        abstractC7556f.getClass();
        return new C7555e(new C7551a(abstractC7556f, i10 - i11, i11), this.f41665a, 0, this.f41668d);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15074c(C7555e c7555e) {
        int i10;
        int i11 = this.f41668d + (C7553c.f41658c[this.f41665a][c7555e.f41665a] >> 16);
        int i12 = c7555e.f41667c;
        if (i12 > 0 && ((i10 = this.f41667c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= c7555e.f41668d;
    }

    /* JADX INFO: renamed from: d */
    public final C7555e m15075d(int i10, int i11) {
        int i12 = this.f41668d;
        AbstractC7556f c7554d = this.f41666b;
        int i13 = this.f41665a;
        if (i10 != i13) {
            int i14 = C7553c.f41658c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            c7554d.getClass();
            i12 += i16;
            c7554d = new C7554d(c7554d, i15, i16);
        }
        int i17 = i10 == 2 ? 4 : 5;
        c7554d.getClass();
        return new C7555e(new C7554d(c7554d, i11, i17), i10, 0, i12 + i17);
    }

    /* JADX INFO: renamed from: e */
    public final C7555e m15076e(int i10, int i11) {
        int i12 = this.f41665a;
        int i13 = i12 == 2 ? 4 : 5;
        int i14 = C7553c.f41660e[i12][i10];
        AbstractC7556f abstractC7556f = this.f41666b;
        abstractC7556f.getClass();
        return new C7555e(new C7554d(new C7554d(abstractC7556f, i14, i13), i11, 5), i12, 0, this.f41668d + i13 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", C7553c.f41657b[this.f41665a], Integer.valueOf(this.f41668d), Integer.valueOf(this.f41667c));
    }
}
