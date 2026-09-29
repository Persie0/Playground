package p038c2;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: c2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1664g extends AbstractC1659b {

    /* JADX INFO: renamed from: a */
    public final double[] f9331a;

    /* JADX INFO: renamed from: b */
    public final double[][] f9332b;

    /* JADX INFO: renamed from: c */
    public final double[][] f9333c;

    /* JADX INFO: renamed from: d */
    public final double[] f9334d;

    public C1664g(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f9334d = new double[length2];
        int i10 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                double d10 = dArr[i13] - dArr[i12];
                double[] dArr5 = dArr3[i12];
                double d11 = (dArr2[i13][i11] - dArr2[i12][i11]) / d10;
                dArr5[i11] = d11;
                if (i12 == 0) {
                    dArr4[i12][i11] = d11;
                } else {
                    dArr4[i12][i11] = (dArr3[i12 - 1][i11] + d11) * 0.5d;
                }
                i12 = i13;
            }
            dArr4[i10][i11] = dArr3[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                double d12 = dArr3[i14][i15];
                if (d12 == 0.0d) {
                    dArr4[i14][i15] = 0.0d;
                    dArr4[i14 + 1][i15] = 0.0d;
                } else {
                    double d13 = dArr4[i14][i15] / d12;
                    int i16 = i14 + 1;
                    double d14 = dArr4[i16][i15] / d12;
                    double dHypot = Math.hypot(d13, d14);
                    if (dHypot > 9.0d) {
                        double d15 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i14];
                        double[] dArr7 = dArr3[i14];
                        dArr6[i15] = d13 * d15 * dArr7[i15];
                        dArr4[i16][i15] = d15 * d14 * dArr7[i15];
                    }
                }
            }
        }
        this.f9331a = dArr;
        this.f9332b = dArr2;
        this.f9333c = dArr4;
    }

    /* JADX INFO: renamed from: g */
    public static double m5392g(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = 3.0d * d10;
        return (d10 * d14) + (((((d19 * d14) * d16) + (((d19 * d15) * d16) + ((d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12)))) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    /* JADX INFO: renamed from: i */
    public static double m5393i(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d17 * 2.0d * d12;
        double d20 = ((d19 + ((d18 * d13) + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12;
        double d21 = d10 * d15;
        double d22 = (d21 * d17) + d20;
        double d23 = d10 * d14;
        return (d23 * d11) + ((((d17 * d23) + d22) - (d21 * d16)) - (((2.0d * d10) * d14) * d16));
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: b */
    public final double mo5370b(double d10) {
        double d11;
        double d12;
        double dM5394h;
        double[] dArr = this.f9331a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f9332b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            dM5394h = m5394h(d13);
        } else {
            int i10 = length - 1;
            double d14 = dArr[i10];
            if (d10 < d14) {
                int i11 = 0;
                while (i11 < i10) {
                    double d15 = dArr[i11];
                    if (d10 == d15) {
                        return dArr2[i11][0];
                    }
                    int i12 = i11 + 1;
                    double d16 = dArr[i12];
                    if (d10 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d10 - d15) / d17;
                        double d19 = dArr2[i11][0];
                        double d20 = dArr2[i12][0];
                        double[][] dArr3 = this.f9333c;
                        return m5393i(d17, d18, d19, d20, dArr3[i11][0], dArr3[i12][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
            d11 = dArr2[i10][0];
            d12 = d10 - d14;
            dM5394h = m5394h(d14);
        }
        return (dM5394h * d12) + d11;
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: c */
    public final void mo5371c(double d10, double[] dArr) {
        double[] dArr2 = this.f9331a;
        int length = dArr2.length;
        double[][] dArr3 = this.f9332b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f9334d;
        if (d10 <= d11) {
            mo5373e(d11, dArr4);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d10 - dArr2[0]) * dArr4[i11]) + dArr3[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr2[i12];
        if (d10 >= d12) {
            mo5373e(d12, dArr4);
            while (i10 < length2) {
                dArr[i10] = ((d10 - dArr2[i12]) * dArr4[i10]) + dArr3[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d10 == dArr2[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = dArr3[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d13 = dArr2[i15];
            if (d10 < d13) {
                double d14 = dArr2[i13];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr3[i13][i10];
                    double d18 = dArr3[i15][i10];
                    double[][] dArr5 = this.f9333c;
                    dArr[i10] = m5393i(d15, d16, d17, d18, dArr5[i13][i10], dArr5[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: d */
    public final void mo5372d(double d10, float[] fArr) {
        double[] dArr = this.f9331a;
        int length = dArr.length;
        double[][] dArr2 = this.f9332b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f9334d;
        if (d10 <= d11) {
            mo5373e(d11, dArr3);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d10 - dArr[0]) * dArr3[i11]) + dArr2[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr[i12];
        if (d10 >= d12) {
            mo5373e(d12, dArr3);
            while (i10 < length2) {
                fArr[i10] = (float) (((d10 - dArr[i12]) * dArr3[i10]) + dArr2[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d10 == dArr[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) dArr2[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d13 = dArr[i15];
            if (d10 < d13) {
                double d14 = dArr[i13];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr2[i13][i10];
                    double d18 = dArr2[i15][i10];
                    double[][] dArr4 = this.f9333c;
                    fArr[i10] = (float) m5393i(d15, d16, d17, d18, dArr4[i13][i10], dArr4[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: e */
    public final void mo5373e(double d10, double[] dArr) {
        double[] dArr2 = this.f9331a;
        int length = dArr2.length;
        double[][] dArr3 = this.f9332b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d11 <= d12) {
                double d13 = dArr2[i10];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i12 = 0; i12 < length2; i12++) {
                    double d16 = dArr3[i10][i12];
                    double d17 = dArr3[i11][i12];
                    double[][] dArr4 = this.f9333c;
                    dArr[i12] = m5392g(d14, d15, d16, d17, dArr4[i10][i12], dArr4[i11][i12]) / d14;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: f */
    public final double[] mo5374f() {
        return this.f9331a;
    }

    /* JADX INFO: renamed from: h */
    public final double m5394h(double d10) {
        double[] dArr = this.f9331a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 <= d12) {
                double d13 = dArr[i10];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f9332b;
                double d15 = dArr2[i10][0];
                double d16 = dArr2[i11][0];
                double[][] dArr3 = this.f9333c;
                return m5392g(d14, (d11 - d13) / d14, d15, d16, dArr3[i10][0], dArr3[i11][0]) / d14;
            }
            i10 = i11;
        }
        return 0.0d;
    }
}
