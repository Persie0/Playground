package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vd9 {

    /* JADX INFO: renamed from: a */
    public final int f65243a;

    /* JADX INFO: renamed from: b */
    public final int f65244b;

    /* JADX INFO: renamed from: c */
    public final float f65245c;

    /* JADX INFO: renamed from: d */
    public final float f65246d;

    /* JADX INFO: renamed from: e */
    public final float f65247e;

    /* JADX INFO: renamed from: f */
    public final int f65248f;

    /* JADX INFO: renamed from: g */
    public final int f65249g;

    /* JADX INFO: renamed from: h */
    public final int f65250h;

    /* JADX INFO: renamed from: i */
    public final td9 f65251i;

    /* JADX INFO: renamed from: j */
    public int f65252j;

    /* JADX INFO: renamed from: k */
    public int f65253k;

    /* JADX INFO: renamed from: l */
    public int f65254l;

    /* JADX INFO: renamed from: m */
    public int f65255m;

    /* JADX INFO: renamed from: n */
    public int f65256n;

    /* JADX INFO: renamed from: o */
    public int f65257o;

    /* JADX INFO: renamed from: p */
    public int f65258p;

    /* JADX INFO: renamed from: q */
    public double f65259q;

    public vd9(int i, int i2, float f, float f2, int i3, boolean z) {
        this.f65243a = i;
        this.f65244b = i2;
        this.f65245c = f;
        this.f65246d = f2;
        this.f65247e = i / i3;
        this.f65248f = i / 400;
        int i4 = i / 65;
        this.f65249g = i4;
        this.f65250h = i4 * 2;
        this.f65251i = z ? new sd9(this) : new ud9(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m23235a(int i, int i2) {
        td9 td9Var = this.f65251i;
        td9Var.mo21262j(i2);
        Object objMo21260h = td9Var.mo21260h();
        int i3 = this.f65244b;
        System.arraycopy(objMo21260h, i * i3, td9Var.mo21261i(), this.f65253k * i3, i3 * i2);
        this.f65253k += i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m23236b() {
        bna.m3987z(this.f65253k >= 0);
        return this.f65251i.mo21267o() * this.f65253k * this.f65244b;
    }

    /* JADX INFO: renamed from: c */
    public final int m23237c() {
        return this.f65251i.mo21267o() * this.f65252j * this.f65244b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m23238d() {
        float f;
        int iMo21269q;
        double d;
        int i;
        int iRound;
        int i2;
        int iRound2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5 = this.f65253k;
        float f2 = this.f65245c;
        float f3 = this.f65246d;
        double d2 = f2 / f3;
        float f4 = this.f65247e * f3;
        int i6 = this.f65243a;
        int i7 = 1;
        td9 td9Var = this.f65251i;
        int i8 = this.f65244b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i9 = this.f65252j;
            int i10 = this.f65250h;
            if (i9 >= i10) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f65257o;
                    if (i12 > 0) {
                        int iMin = Math.min(i10, i12);
                        m23235a(i11, iMin);
                        this.f65257o -= iMin;
                        i11 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i7;
                        i = i10;
                    } else {
                        int i13 = i6 > 4000 ? i6 / 4000 : i7;
                        int i14 = this.f65249g;
                        int i15 = this.f65248f;
                        if (i8 == i7 && i13 == i7) {
                            iMo21269q = td9Var.mo21258f(i11, i15, i14);
                            f = f4;
                        } else {
                            td9Var.mo21257e(i11, i13);
                            f = f4;
                            int iMo21269q2 = td9Var.mo21269q(i15 / i13, i14 / i13);
                            if (i13 != i7) {
                                int i16 = iMo21269q2 * i13;
                                int i17 = i13 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                if (i18 >= i15) {
                                    i15 = i18;
                                }
                                if (i19 <= i14) {
                                    i14 = i19;
                                }
                                if (i8 == i7) {
                                    iMo21269q = td9Var.mo21258f(i11, i15, i14);
                                } else {
                                    td9Var.mo21257e(i11, i7);
                                    iMo21269q = td9Var.mo21269q(i15, i14);
                                }
                            } else {
                                iMo21269q = iMo21269q2;
                            }
                        }
                        int i20 = td9Var.mo21263k() ? this.f65258p : iMo21269q;
                        td9Var.mo21259g();
                        this.f65258p = iMo21269q;
                        double d3 = this.f65259q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i20) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.f65259q = d4 - ((double) iRound2);
                                td9Var = td9Var;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i20)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.f65257o = iRound3;
                                this.f65259q = d5 - ((double) iRound3);
                                iRound2 = i20;
                            }
                            td9Var.mo21262j(iRound2);
                            int i21 = i10;
                            int i22 = iRound2;
                            td9Var.mo21265m(i22, this.f65244b, this.f65253k, i11, i11 + i20);
                            this.f65253k += i22;
                            i11 = i20 + i22 + i11;
                            i = i21;
                            i2 = i7;
                        } else {
                            d = d2;
                            int i23 = i7;
                            i = i10;
                            if (d < 0.5d) {
                                double d6 = ((((double) i20) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.f65259q = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i20)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.f65257o = iRound4;
                                this.f65259q = d7 - ((double) iRound4);
                                iRound = i20;
                            }
                            int i24 = i20 + iRound;
                            td9Var.mo21262j(i24);
                            i2 = i23;
                            System.arraycopy(td9Var.mo21260h(), i11 * i8, td9Var.mo21261i(), this.f65253k * i8, i20 * i8);
                            int i25 = i11;
                            td9Var.mo21265m(iRound, this.f65244b, this.f65253k + i20, i20 + i11, i25);
                            this.f65253k += i24;
                            i11 = i25 + iRound;
                        }
                    }
                    if (i11 + i > i9) {
                        break;
                    }
                    i10 = i;
                    f4 = f;
                    i7 = i2;
                    d2 = d;
                }
                int i26 = this.f65252j - i11;
                System.arraycopy(td9Var.mo21260h(), i11 * i8, td9Var.mo21260h(), 0, i26 * i8);
                this.f65252j = i26;
            }
            if (f != 1.0f || this.f65253k == i5) {
            }
            long j3 = (long) (i6 / f);
            long j4 = i6;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i27 = this.f65253k - i5;
            td9Var.mo21266n(i27);
            System.arraycopy(td9Var.mo21261i(), i5 * i8, td9Var.mo21264l(), this.f65254l * i8, i27 * i8);
            this.f65253k = i5;
            this.f65254l += i27;
            int i28 = 0;
            while (true) {
                i3 = this.f65254l - 1;
                if (i28 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.f65255m + 1;
                    j = i4;
                    long j5 = j * j3;
                    j2 = this.f65256n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i29 = i2;
                    td9Var.mo21262j(i29);
                    td9Var.mo21255c(i28, j4, j3);
                    this.f65256n += i29;
                    this.f65253k += i29;
                }
                int i30 = i2;
                this.f65255m = i4;
                if (j == j4) {
                    this.f65255m = 0;
                    bna.m3987z(j2 == j3 ? i30 : 0);
                    this.f65256n = 0;
                }
                i28++;
                i2 = i30;
            }
            if (i3 == 0) {
                return;
            }
            System.arraycopy(td9Var.mo21264l(), i3 * i8, td9Var.mo21264l(), 0, (this.f65254l - i3) * i8);
            this.f65254l -= i3;
            return;
        }
        m23235a(0, this.f65252j);
        this.f65252j = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }
}
