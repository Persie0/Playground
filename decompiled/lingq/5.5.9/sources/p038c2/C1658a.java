package p038c2;

import java.util.Arrays;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1658a extends AbstractC1659b {

    /* JADX INFO: renamed from: a */
    public final double[] f9279a;

    /* JADX INFO: renamed from: b */
    public final a[] f9280b;

    /* JADX INFO: renamed from: c2.a$a */
    public static class a {

        /* JADX INFO: renamed from: s */
        public static final double[] f9281s = new double[91];

        /* JADX INFO: renamed from: a */
        public final double[] f9282a;

        /* JADX INFO: renamed from: b */
        public double f9283b;

        /* JADX INFO: renamed from: c */
        public final double f9284c;

        /* JADX INFO: renamed from: d */
        public final double f9285d;

        /* JADX INFO: renamed from: e */
        public final double f9286e;

        /* JADX INFO: renamed from: f */
        public final double f9287f;

        /* JADX INFO: renamed from: g */
        public final double f9288g;

        /* JADX INFO: renamed from: h */
        public final double f9289h;

        /* JADX INFO: renamed from: i */
        public final double f9290i;

        /* JADX INFO: renamed from: j */
        public final double f9291j;

        /* JADX INFO: renamed from: k */
        public final double f9292k;

        /* JADX INFO: renamed from: l */
        public final double f9293l;

        /* JADX INFO: renamed from: m */
        public final double f9294m;

        /* JADX INFO: renamed from: n */
        public final double f9295n;

        /* JADX INFO: renamed from: o */
        public double f9296o;

        /* JADX INFO: renamed from: p */
        public double f9297p;

        /* JADX INFO: renamed from: q */
        public final boolean f9298q;

        /* JADX INFO: renamed from: r */
        public final boolean f9299r;

        public a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            double[] dArr;
            double d16 = d12;
            this.f9299r = false;
            boolean z10 = i10 == 1;
            this.f9298q = z10;
            this.f9284c = d10;
            this.f9285d = d11;
            double d17 = 1.0d / (d11 - d10);
            this.f9290i = d17;
            if (3 == i10) {
                this.f9299r = true;
            }
            double d18 = d14 - d16;
            double d19 = d15 - d13;
            if (this.f9299r || Math.abs(d18) < 0.001d || Math.abs(d19) < 0.001d) {
                this.f9299r = true;
                this.f9286e = d16;
                this.f9287f = d14;
                this.f9288g = d13;
                this.f9289h = d15;
                double dHypot = Math.hypot(d19, d18);
                this.f9283b = dHypot;
                this.f9295n = dHypot * d17;
                this.f9293l = d18 / (d11 - d10);
                this.f9294m = d19 / (d11 - d10);
                return;
            }
            this.f9282a = new double[101];
            this.f9291j = ((double) (z10 ? -1 : 1)) * d18;
            this.f9292k = d19 * ((double) (z10 ? 1 : -1));
            this.f9293l = z10 ? d14 : d16;
            this.f9294m = z10 ? d13 : d15;
            double d20 = d13 - d15;
            int i11 = 0;
            double dHypot2 = 0.0d;
            double d21 = 0.0d;
            double d22 = 0.0d;
            while (true) {
                dArr = f9281s;
                if (i11 >= 91) {
                    break;
                }
                double d23 = d18;
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) 90));
                double dSin = Math.sin(radians) * d23;
                double dCos = Math.cos(radians) * d20;
                if (i11 > 0) {
                    dHypot2 += Math.hypot(dSin - d21, dCos - d22);
                    dArr[i11] = dHypot2;
                }
                i11++;
                d22 = dCos;
                d21 = dSin;
                d18 = d23;
            }
            this.f9283b = dHypot2;
            for (int i12 = 0; i12 < 91; i12++) {
                dArr[i12] = dArr[i12] / dHypot2;
            }
            int i13 = 0;
            while (true) {
                double[] dArr2 = this.f9282a;
                if (i13 >= dArr2.length) {
                    this.f9295n = this.f9283b * this.f9290i;
                    return;
                }
                double length = ((double) i13) / ((double) (dArr2.length - 1));
                int iBinarySearch = Arrays.binarySearch(dArr, length);
                if (iBinarySearch >= 0) {
                    dArr2[i13] = ((double) iBinarySearch) / ((double) 90);
                } else if (iBinarySearch == -1) {
                    dArr2[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double d24 = dArr[i15];
                    dArr2[i13] = (((length - d24) / (dArr[i14 - 1] - d24)) + ((double) i15)) / ((double) 90);
                }
                i13++;
            }
        }

        /* JADX INFO: renamed from: a */
        public final double m5375a() {
            double d10 = this.f9291j * this.f9297p;
            double dHypot = this.f9295n / Math.hypot(d10, (-this.f9292k) * this.f9296o);
            if (this.f9298q) {
                d10 = -d10;
            }
            return d10 * dHypot;
        }

        /* JADX INFO: renamed from: b */
        public final double m5376b() {
            double d10 = this.f9291j * this.f9297p;
            double d11 = (-this.f9292k) * this.f9296o;
            double dHypot = this.f9295n / Math.hypot(d10, d11);
            return this.f9298q ? (-d11) * dHypot : d11 * dHypot;
        }

        /* JADX INFO: renamed from: c */
        public final double m5377c(double d10) {
            double d11 = (d10 - this.f9284c) * this.f9290i;
            double d12 = this.f9287f;
            double d13 = this.f9286e;
            return ((d12 - d13) * d11) + d13;
        }

        /* JADX INFO: renamed from: d */
        public final double m5378d(double d10) {
            double d11 = (d10 - this.f9284c) * this.f9290i;
            double d12 = this.f9289h;
            double d13 = this.f9288g;
            return ((d12 - d13) * d11) + d13;
        }

        /* JADX INFO: renamed from: e */
        public final double m5379e() {
            return (this.f9291j * this.f9296o) + this.f9293l;
        }

        /* JADX INFO: renamed from: f */
        public final double m5380f() {
            return (this.f9292k * this.f9297p) + this.f9294m;
        }

        /* JADX INFO: renamed from: g */
        public final void m5381g(double d10) {
            double d11 = (this.f9298q ? this.f9285d - d10 : d10 - this.f9284c) * this.f9290i;
            double d12 = 0.0d;
            if (d11 > 0.0d) {
                d12 = 1.0d;
                if (d11 < 1.0d) {
                    double[] dArr = this.f9282a;
                    double length = d11 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    double d13 = dArr[i10];
                    d12 = ((dArr[i10 + 1] - d13) * (length - ((double) i10))) + d13;
                }
            }
            double d14 = d12 * 1.5707963267948966d;
            this.f9296o = Math.sin(d14);
            this.f9297p = Math.cos(d14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    public C1658a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f9279a = dArr;
        this.f9280b = new a[dArr.length - 1];
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        while (true) {
            a[] aVarArr = this.f9280b;
            if (i10 >= aVarArr.length) {
                return;
            }
            int i13 = iArr[i10];
            if (i13 == 0) {
                i12 = 3;
            } else if (i13 == 1) {
                i11 = 1;
                i12 = i11;
            } else {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (i11 != 1) {
                            i11 = 1;
                        }
                        i12 = i11;
                    }
                }
                i11 = 2;
                i12 = i11;
            }
            double d10 = dArr[i10];
            int i14 = i10 + 1;
            double d11 = dArr[i14];
            double[] dArr3 = dArr2[i10];
            double d12 = dArr3[0];
            double d13 = dArr3[1];
            double[] dArr4 = dArr2[i14];
            aVarArr[i10] = new a(i12, d10, d11, d12, d13, dArr4[0], dArr4[1]);
            i10 = i14;
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: b */
    public final double mo5370b(double d10) {
        a[] aVarArr = this.f9280b;
        a aVar = aVarArr[0];
        double d11 = aVar.f9284c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f9299r) {
                return (d12 * aVarArr[0].f9293l) + aVar.m5377c(d11);
            }
            aVar.m5381g(d11);
            return (aVarArr[0].m5375a() * d12) + aVarArr[0].m5379e();
        }
        if (d10 > aVarArr[aVarArr.length - 1].f9285d) {
            double d13 = aVarArr[aVarArr.length - 1].f9285d;
            double d14 = d10 - d13;
            int length = aVarArr.length - 1;
            return (d14 * aVarArr[length].f9293l) + aVarArr[length].m5377c(d13);
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar2 = aVarArr[i10];
            if (d10 <= aVar2.f9285d) {
                if (aVar2.f9299r) {
                    return aVar2.m5377c(d10);
                }
                aVar2.m5381g(d10);
                return aVarArr[i10].m5379e();
            }
        }
        return Double.NaN;
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: c */
    public final void mo5371c(double d10, double[] dArr) {
        a[] aVarArr = this.f9280b;
        a aVar = aVarArr[0];
        double d11 = aVar.f9284c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f9299r) {
                double dM5377c = aVar.m5377c(d11);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f9293l * d12) + dM5377c;
                dArr[1] = (d12 * aVarArr[0].f9294m) + aVar2.m5378d(d11);
                return;
            }
            aVar.m5381g(d11);
            dArr[0] = (aVarArr[0].m5375a() * d12) + aVarArr[0].m5379e();
            dArr[1] = (aVarArr[0].m5376b() * d12) + aVarArr[0].m5380f();
            return;
        }
        if (d10 <= aVarArr[aVarArr.length - 1].f9285d) {
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                a aVar3 = aVarArr[i10];
                if (d10 <= aVar3.f9285d) {
                    if (aVar3.f9299r) {
                        dArr[0] = aVar3.m5377c(d10);
                        dArr[1] = aVarArr[i10].m5378d(d10);
                        return;
                    } else {
                        aVar3.m5381g(d10);
                        dArr[0] = aVarArr[i10].m5379e();
                        dArr[1] = aVarArr[i10].m5380f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f9285d;
        double d14 = d10 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f9299r) {
            double dM5377c2 = aVar4.m5377c(d13);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.f9293l * d14) + dM5377c2;
            dArr[1] = (d14 * aVarArr[length].f9294m) + aVar5.m5378d(d13);
            return;
        }
        aVar4.m5381g(d10);
        dArr[0] = (aVarArr[length].m5375a() * d14) + aVarArr[length].m5379e();
        dArr[1] = (aVarArr[length].m5376b() * d14) + aVarArr[length].m5380f();
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: d */
    public final void mo5372d(double d10, float[] fArr) {
        a[] aVarArr = this.f9280b;
        a aVar = aVarArr[0];
        double d11 = aVar.f9284c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f9299r) {
                double dM5377c = aVar.m5377c(d11);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f9293l * d12) + dM5377c);
                fArr[1] = (float) ((d12 * aVarArr[0].f9294m) + aVar2.m5378d(d11));
                return;
            }
            aVar.m5381g(d11);
            fArr[0] = (float) ((aVarArr[0].m5375a() * d12) + aVarArr[0].m5379e());
            fArr[1] = (float) ((aVarArr[0].m5376b() * d12) + aVarArr[0].m5380f());
            return;
        }
        if (d10 <= aVarArr[aVarArr.length - 1].f9285d) {
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                a aVar3 = aVarArr[i10];
                if (d10 <= aVar3.f9285d) {
                    if (aVar3.f9299r) {
                        fArr[0] = (float) aVar3.m5377c(d10);
                        fArr[1] = (float) aVarArr[i10].m5378d(d10);
                        return;
                    } else {
                        aVar3.m5381g(d10);
                        fArr[0] = (float) aVarArr[i10].m5379e();
                        fArr[1] = (float) aVarArr[i10].m5380f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f9285d;
        double d14 = d10 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f9299r) {
            aVar4.m5381g(d10);
            fArr[0] = (float) aVarArr[length].m5379e();
            fArr[1] = (float) aVarArr[length].m5380f();
        } else {
            double dM5377c2 = aVar4.m5377c(d13);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.f9293l * d14) + dM5377c2);
            fArr[1] = (float) ((d14 * aVarArr[length].f9294m) + aVar5.m5378d(d13));
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: e */
    public final void mo5373e(double d10, double[] dArr) {
        a[] aVarArr = this.f9280b;
        double d11 = aVarArr[0].f9284c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f9285d) {
            d10 = aVarArr[aVarArr.length - 1].f9285d;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            if (d10 <= aVar.f9285d) {
                if (aVar.f9299r) {
                    dArr[0] = aVar.f9293l;
                    dArr[1] = aVar.f9294m;
                    return;
                } else {
                    aVar.m5381g(d10);
                    dArr[0] = aVarArr[i10].m5375a();
                    dArr[1] = aVarArr[i10].m5376b();
                    return;
                }
            }
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: f */
    public final double[] mo5374f() {
        return this.f9279a;
    }
}
