package p038c2;

/* JADX INFO: renamed from: c2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1663f extends AbstractC1659b {

    /* JADX INFO: renamed from: a */
    public final double[] f9328a;

    /* JADX INFO: renamed from: b */
    public final double[][] f9329b;

    /* JADX INFO: renamed from: c */
    public final double[] f9330c;

    public C1663f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f9330c = new double[length2];
        this.f9328a = dArr;
        this.f9329b = dArr2;
        if (length2 > 2) {
            double d10 = 0.0d;
            int i10 = 0;
            while (i10 < dArr.length) {
                double d11 = dArr2[i10][0];
                if (i10 > 0) {
                    double d12 = d11 - d10;
                    Math.hypot(d12, d12);
                }
                i10++;
                d10 = d11;
            }
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: b */
    public final double mo5370b(double d10) {
        double d11;
        double d12;
        double dM5391g;
        double[] dArr = this.f9328a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f9329b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            dM5391g = m5391g(d13);
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
                        double d17 = (d10 - d15) / (d16 - d15);
                        return (dArr2[i12][0] * d17) + ((1.0d - d17) * dArr2[i11][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
            d11 = dArr2[i10][0];
            d12 = d10 - d14;
            dM5391g = m5391g(d14);
        }
        return (dM5391g * d12) + d11;
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: c */
    public final void mo5371c(double d10, double[] dArr) {
        double[] dArr2 = this.f9328a;
        int length = dArr2.length;
        double[][] dArr3 = this.f9329b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f9330c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    dArr[i10] = (dArr3[i15][i10] * d15) + ((1.0d - d15) * dArr3[i13][i10]);
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
        double[] dArr = this.f9328a;
        int length = dArr.length;
        double[][] dArr2 = this.f9329b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f9330c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    fArr[i10] = (float) ((dArr2[i15][i10] * d15) + ((1.0d - d15) * dArr2[i13][i10]));
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a A[LOOP:1: B:16:0x0038->B:17:0x003a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:11:0x0022->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[SYNTHETIC] */
    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: e */
    public final void mo5373e(double d10, double[] dArr) {
        int i10;
        int i11;
        double d11;
        double d12;
        double[] dArr2 = this.f9328a;
        int length = dArr2.length;
        double[][] dArr3 = this.f9329b;
        int length2 = dArr3[0].length;
        double d13 = dArr2[0];
        if (d10 > d13) {
            d13 = dArr2[length - 1];
            if (d10 >= d13) {
            }
            i10 = 0;
            while (i10 < length - 1) {
                i11 = i10 + 1;
                d11 = dArr2[i11];
                if (d10 <= d11) {
                    d12 = d11 - dArr2[i10];
                    for (int i12 = 0; i12 < length2; i12++) {
                        dArr[i12] = (dArr3[i11][i12] - dArr3[i10][i12]) / d12;
                    }
                    break;
                }
                i10 = i11;
            }
        }
        d10 = d13;
        i10 = 0;
        while (i10 < length - 1) {
            i11 = i10 + 1;
            d11 = dArr2[i11];
            if (d10 <= d11) {
                d12 = d11 - dArr2[i10];
                while (i12 < length2) {
                    dArr[i12] = (dArr3[i11][i12] - dArr3[i10][i12]) / d12;
                }
                break;
                break;
            }
            i10 = i11;
        }
    }

    @Override // p038c2.AbstractC1659b
    /* JADX INFO: renamed from: f */
    public final double[] mo5374f() {
        return this.f9328a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[LOOP:0: B:11:0x001e->B:17:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x002d A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final double m5391g(double d10) {
        int i10;
        int i11;
        double d11;
        double[] dArr = this.f9328a;
        int length = dArr.length;
        double d12 = dArr[0];
        if (d10 >= d12) {
            d12 = dArr[length - 1];
            if (d10 >= d12) {
            }
            i10 = 0;
            while (i10 < length - 1) {
                i11 = i10 + 1;
                d11 = dArr[i11];
                if (d10 <= d11) {
                    double d13 = d11 - dArr[i10];
                    double[][] dArr2 = this.f9329b;
                    return (dArr2[i11][0] - dArr2[i10][0]) / d13;
                }
                i10 = i11;
            }
            return 0.0d;
        }
        d10 = d12;
        i10 = 0;
        while (i10 < length - 1) {
            i11 = i10 + 1;
            d11 = dArr[i11];
            if (d10 <= d11) {
                double d14 = d11 - dArr[i10];
                double[][] dArr3 = this.f9329b;
                return (dArr3[i11][0] - dArr3[i10][0]) / d14;
            }
            i10 = i11;
        }
        return 0.0d;
    }
}
