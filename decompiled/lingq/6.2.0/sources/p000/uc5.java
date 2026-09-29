package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uc5 extends z9d {

    /* JADX INFO: renamed from: a */
    public double[] f63714a;

    /* JADX INFO: renamed from: b */
    public double[][] f63715b;

    /* JADX INFO: renamed from: c */
    public double[] f63716c;

    @Override // p000.z9d
    /* JADX INFO: renamed from: b */
    public final double mo9884b(double d) {
        double d2;
        double d3;
        double dM22672h;
        double[][] dArr = this.f63715b;
        double[] dArr2 = this.f63714a;
        int length = dArr2.length;
        double d4 = dArr2[0];
        if (d <= d4) {
            d2 = dArr[0][0];
            d3 = d - d4;
            dM22672h = m22672h(d4);
        } else {
            int i = length - 1;
            double d5 = dArr2[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr2[i2];
                    if (d == d6) {
                        return dArr[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr2[i3];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr[i3][0] * d8) + ((1.0d - d8) * dArr[i2][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr[i][0];
            d3 = d - d5;
            dM22672h = m22672h(d5);
        }
        return (dM22672h * d3) + d2;
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: c */
    public final void mo9885c(double d, double[] dArr) {
        double[] dArr2 = this.f63716c;
        double[] dArr3 = this.f63714a;
        int length = dArr3.length;
        double[][] dArr4 = this.f63715b;
        int i = 0;
        int length2 = dArr4[0].length;
        double d2 = dArr3[0];
        if (d <= d2) {
            mo9887e(d2, dArr2);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr3[i3];
        if (d >= d3) {
            mo9887e(d3, dArr2);
            while (i < length2) {
                dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr3[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr4[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: d */
    public final void mo9886d(double d, float[] fArr) {
        double[] dArr = this.f63716c;
        double[] dArr2 = this.f63714a;
        int length = dArr2.length;
        double[][] dArr3 = this.f63715b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            mo9887e(d2, dArr);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            mo9887e(d3, dArr);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v6 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.z9d
    /* JADX INFO: renamed from: e */
    public final void mo9887e(double d, double[] dArr) {
        double[] dArr2 = this.f63714a;
        int length = dArr2.length;
        double[][] dArr3 = this.f63715b;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            d = d2;
        } else {
            d2 = dArr2[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: f */
    public final double[] mo9888f() {
        return this.f63714a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    public final double m22672h(double d) {
        double[] dArr = this.f63714a;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d < d2) {
            d = d2;
        } else {
            d2 = dArr[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.f63715b;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
            }
            i = i2;
        }
        return 0.0d;
    }
}
