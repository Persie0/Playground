package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bpa implements xoa {

    /* JADX INFO: renamed from: H */
    public qn3 f8829H;

    /* JADX INFO: renamed from: a */
    public final s56 f8830a;

    /* JADX INFO: renamed from: b */
    public final t56 f8831b;

    /* JADX INFO: renamed from: c */
    public final int f8832c;

    /* JADX INFO: renamed from: d */
    public final go2 f8833d;

    /* JADX INFO: renamed from: e */
    public int[] f8834e = woa.f67133a;

    /* JADX INFO: renamed from: f */
    public float[] f8835f;

    /* JADX INFO: renamed from: g */
    public AbstractC3081hn f8836g;

    /* JADX INFO: renamed from: h */
    public AbstractC3081hn f8837h;

    /* JADX INFO: renamed from: i */
    public AbstractC3081hn f8838i;

    /* JADX INFO: renamed from: j */
    public AbstractC3081hn f8839j;

    /* JADX INFO: renamed from: k */
    public float[] f8840k;

    /* JADX INFO: renamed from: l */
    public float[] f8841l;

    public bpa(s56 s56Var, t56 t56Var, int i, go2 go2Var) {
        this.f8830a = s56Var;
        this.f8831b = t56Var;
        this.f8832c = i;
        this.f8833d = go2Var;
        float[] fArr = woa.f67134b;
        this.f8835f = fArr;
        this.f8840k = fArr;
        this.f8841l = fArr;
        this.f8829H = woa.f67135c;
    }

    /* JADX INFO: renamed from: a */
    public final int m4030a(int i) {
        int i2;
        s56 s56Var = this.f8830a;
        int i3 = s56Var.f60382b;
        int i4 = 0;
        if (i3 <= 0) {
            v63.m23143u("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = s56Var.f60381a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX INFO: renamed from: c */
    public final float m4031c(int i, int i2, boolean z) {
        go2 go2Var;
        float f;
        s56 s56Var = this.f8830a;
        if (i >= s56Var.f60382b - 1) {
            f = i2;
        } else {
            int iM21103c = s56Var.m21103c(i);
            int iM21103c2 = s56Var.m21103c(i + 1);
            if (i2 != iM21103c) {
                int i3 = iM21103c2 - iM21103c;
                apa apaVar = (apa) this.f8831b.m10152b(iM21103c);
                if (apaVar == null || (go2Var = apaVar.f7339b) == null) {
                    go2Var = this.f8833d;
                }
                float f2 = i3;
                float fMo12780a = go2Var.mo12780a((i2 - iM21103c) / f2);
                return z ? fMo12780a : ((f2 * fMo12780a) + iM21103c) / 1000.0f;
            }
            f = iM21103c;
        }
        return f / 1000.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m4032e(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        float[] fArr;
        boolean z = this.f8829H != woa.f67135c;
        AbstractC3081hn abstractC3081hn4 = this.f8836g;
        t56 t56Var = this.f8831b;
        s56 s56Var = this.f8830a;
        if (abstractC3081hn4 == null) {
            this.f8836g = abstractC3081hn.mo10485c();
            this.f8837h = abstractC3081hn3.mo10485c();
            int i = s56Var.f60382b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = s56Var.m21103c(i2) / 1000.0f;
            }
            this.f8835f = fArr2;
            int i3 = s56Var.f60382b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f8834e = iArr;
        }
        if (z) {
            if (this.f8829H != woa.f67135c && fa4.m11650l(this.f8838i, abstractC3081hn) && fa4.m11650l(this.f8839j, abstractC3081hn2)) {
                return;
            }
            this.f8838i = abstractC3081hn;
            this.f8839j = abstractC3081hn2;
            int iMo10484b = abstractC3081hn.mo10484b() + (abstractC3081hn.mo10484b() % 2);
            this.f8840k = new float[iMo10484b];
            this.f8841l = new float[iMo10484b];
            int i5 = s56Var.f60382b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM21103c = s56Var.m21103c(i6);
                apa apaVar = (apa) t56Var.m10152b(iM21103c);
                if (iM21103c == 0 && apaVar == null) {
                    fArr = new float[iMo10484b];
                    for (int i7 = 0; i7 < iMo10484b; i7++) {
                        fArr[i7] = abstractC3081hn.mo10483a(i7);
                    }
                } else if (iM21103c == this.f8832c && apaVar == null) {
                    fArr = new float[iMo10484b];
                    for (int i8 = 0; i8 < iMo10484b; i8++) {
                        fArr[i8] = abstractC3081hn2.mo10483a(i8);
                    }
                } else {
                    apaVar.getClass();
                    AbstractC3081hn abstractC3081hn5 = apaVar.f7338a;
                    float[] fArr4 = new float[iMo10484b];
                    for (int i9 = 0; i9 < iMo10484b; i9++) {
                        fArr4[i9] = abstractC3081hn5.mo10483a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f8829H = new qn3(this.f8834e, this.f8835f, fArr3);
        }
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public final AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        long j2 = j / 1000000;
        int[] iArr = woa.f67133a;
        long j3 = this.f8832c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC3081hn3;
        }
        m4032e(abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
        AbstractC3081hn abstractC3081hn4 = this.f8837h;
        abstractC3081hn4.getClass();
        int i = 0;
        if (this.f8829H != woa.f67135c) {
            int i2 = (int) j4;
            float fM4031c = m4031c(m4030a(i2), i2, false);
            float[] fArr = this.f8841l;
            C2977eu[][] c2977euArr = (C2977eu[][]) this.f8829H.f57974a;
            float f = c2977euArr[0][0].f37835a;
            float f2 = c2977euArr[c2977euArr.length - 1][0].f37836b;
            if (fM4031c < f) {
                fM4031c = f;
            }
            if (fM4031c <= f2) {
                f2 = fM4031c;
            }
            int length = fArr.length;
            boolean z = false;
            for (C2977eu[] c2977euArr2 : c2977euArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C2977eu c2977eu = c2977euArr2[i4];
                    if (f2 <= c2977eu.f37836b) {
                        if (c2977eu.f37850p) {
                            fArr[i3] = c2977eu.f37851q;
                            fArr[i3 + 1] = c2977eu.f37852r;
                        } else {
                            c2977eu.m11338c(f2);
                            fArr[i3] = c2977eu.m11336a();
                            fArr[i3 + 1] = c2977eu.m11337b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC3081hn4.mo10487e(i, fArr[i]);
                i++;
            }
        } else {
            AbstractC3081hn abstractC3081hnMo4036r = mo4036r((j4 - 1) * 1000000, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
            AbstractC3081hn abstractC3081hnMo4036r2 = mo4036r(j4 * 1000000, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
            int iMo10484b = abstractC3081hnMo4036r.mo10484b();
            while (i < iMo10484b) {
                abstractC3081hn4.mo10487e(i, (abstractC3081hnMo4036r.mo10483a(i) - abstractC3081hnMo4036r2.mo10483a(i)) * 1000.0f);
                i++;
            }
        }
        return abstractC3081hn4;
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: o */
    public final int mo4034o() {
        return 0;
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: q */
    public final int mo4035q() {
        return this.f8832c;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public final AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        AbstractC3081hn abstractC3081hn4;
        AbstractC3081hn abstractC3081hn5;
        AbstractC3081hn abstractC3081hn6 = abstractC3081hn;
        long j2 = j / 1000000;
        int[] iArr = woa.f67133a;
        int i = this.f8832c;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        t56 t56Var = this.f8831b;
        apa apaVar = (apa) t56Var.m10152b(i2);
        if (apaVar != null) {
            return apaVar.f7338a;
        }
        if (i2 >= i) {
            return abstractC3081hn2;
        }
        if (i2 <= 0) {
            return abstractC3081hn6;
        }
        m4032e(abstractC3081hn6, abstractC3081hn2, abstractC3081hn3);
        AbstractC3081hn abstractC3081hn7 = this.f8836g;
        abstractC3081hn7.getClass();
        int i3 = 0;
        if (this.f8829H != woa.f67135c) {
            float fM4031c = m4031c(m4030a(i2), i2, false);
            float[] fArr = this.f8840k;
            C2977eu[][] c2977euArr = (C2977eu[][]) this.f8829H.f57974a;
            int length = c2977euArr.length - 1;
            float f = c2977euArr[0][0].f37835a;
            float f2 = c2977euArr[length][0].f37836b;
            int length2 = fArr.length;
            if (fM4031c < f || fM4031c > f2) {
                if (fM4031c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fM4031c - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    C2977eu c2977eu = c2977euArr[length][i5];
                    boolean z = c2977eu.f37850p;
                    float f4 = c2977eu.f37852r;
                    float f5 = c2977eu.f37851q;
                    if (z) {
                        float f6 = c2977eu.f37835a;
                        float f7 = c2977eu.f37845k;
                        float f8 = c2977eu.f37837c;
                        fArr[i4] = (f5 * f3) + AbstractC3393o1.m17726a(c2977eu.f37839e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = c2977eu.f37838d;
                        fArr[i4 + 1] = (f4 * f3) + AbstractC3393o1.m17726a(c2977eu.f37840f, f10, f9, f10);
                    } else {
                        c2977eu.m11338c(f);
                        fArr[i4] = (c2977eu.m11336a() * f3) + (c2977eu.f37848n * c2977eu.f37842h) + f5;
                        fArr[i4 + 1] = (c2977eu.m11337b() * f3) + (c2977eu.f37849o * c2977eu.f37843i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    c2977euArr = c2977euArr;
                }
            } else {
                int length3 = c2977euArr.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        C2977eu c2977eu2 = c2977euArr[i6][i8];
                        if (fM4031c <= c2977eu2.f37836b) {
                            if (c2977eu2.f37850p) {
                                float f11 = c2977eu2.f37835a;
                                float f12 = c2977eu2.f37845k;
                                float f13 = c2977eu2.f37837c;
                                fArr[i7] = AbstractC3393o1.m17726a(c2977eu2.f37839e, f13, (fM4031c - f11) * f12, f13);
                                float f14 = c2977eu2.f37838d;
                                fArr[i7 + 1] = AbstractC3393o1.m17726a(c2977eu2.f37840f, f14, (fM4031c - f11) * f12, f14);
                            } else {
                                c2977eu2.m11338c(fM4031c);
                                fArr[i7] = (c2977eu2.f37848n * c2977eu2.f37842h) + c2977eu2.f37851q;
                                fArr[i7 + 1] = (c2977eu2.f37849o * c2977eu2.f37843i) + c2977eu2.f37852r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                abstractC3081hn7.mo10487e(i9, fArr[i9]);
            }
        } else {
            int iM4030a = m4030a(i2);
            float fM4031c2 = m4031c(iM4030a, i2, true);
            s56 s56Var = this.f8830a;
            apa apaVar2 = (apa) t56Var.m10152b(s56Var.m21103c(iM4030a));
            if (apaVar2 != null && (abstractC3081hn5 = apaVar2.f7338a) != null) {
                abstractC3081hn6 = abstractC3081hn5;
            }
            apa apaVar3 = (apa) t56Var.m10152b(s56Var.m21103c(iM4030a + 1));
            if (apaVar3 == null || (abstractC3081hn4 = apaVar3.f7338a) == null) {
                abstractC3081hn4 = abstractC3081hn2;
            }
            int iMo10484b = abstractC3081hn7.mo10484b();
            for (int i10 = 0; i10 < iMo10484b; i10++) {
                abstractC3081hn7.mo10487e(i10, (abstractC3081hn4.mo10483a(i10) * fM4031c2) + ((1.0f - fM4031c2) * abstractC3081hn6.mo10483a(i10)));
            }
        }
        return abstractC3081hn7;
    }
}
