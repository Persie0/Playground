package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cu */
/* JADX INFO: loaded from: classes2.dex */
public final class C2897cu extends z9d {

    /* JADX INFO: renamed from: a */
    public final double[] f34532a;

    /* JADX INFO: renamed from: b */
    public final C0824bu[] f34533b;

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [cu, java.lang.Object] */
    public C2897cu(int[] iArr, double[] dArr, double[][] dArr2) {
        boolean z;
        int i;
        double[] dArr3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f34532a = dArr4;
        int i2 = 1;
        obj.f34533b = new C0824bu[dArr4.length - 1];
        char c = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        C2897cu c2897cu = obj;
        while (true) {
            C0824bu[] c0824buArr = c2897cu.f34533b;
            if (i3 >= c0824buArr.length) {
                return;
            }
            int i6 = iArr[i3];
            if (i6 == 0) {
                i5 = 3;
            } else if (i6 == i2) {
                i4 = i2;
                i5 = i4;
            } else {
                if (i6 != 2) {
                    if (i6 == 3) {
                        if (i4 != i2) {
                            i4 = i2;
                        }
                        i5 = i4;
                    } else if (i6 == 4) {
                        i5 = 4;
                    } else if (i6 == 5) {
                        i5 = 5;
                    }
                }
                i4 = 2;
                i5 = i4;
            }
            double d = dArr4[i3];
            int i7 = i3 + 1;
            double d2 = dArr4[i7];
            double[] dArr5 = dArr2[i3];
            double d3 = dArr5[c];
            int i8 = i2;
            int i9 = i3;
            double d4 = dArr5[i8];
            double[] dArr6 = dArr2[i7];
            boolean z2 = c;
            double d5 = dArr6[z2 ? 1 : 0];
            double d6 = dArr6[i8];
            C0824bu c0824bu = new C0824bu();
            c0824bu.f9015r = z2;
            int i10 = i4;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            boolean z3 = i8;
            if (i5 != z3) {
                if (i5 == 4) {
                    c0824bu.f9014q = d8 > 0.0d;
                } else if (i5 != 5) {
                    c0824bu.f9014q = false;
                } else {
                    c0824bu.f9014q = d8 < 0.0d;
                }
                z = true;
            } else {
                c0824bu.f9014q = z3;
                z = z3;
            }
            c0824bu.f9000c = r16;
            c0824bu.f9001d = d2;
            double d9 = d2 - d;
            double d10 = 1.0d / d9;
            c0824bu.f9006i = d10;
            if (3 == i5) {
                c0824bu.f9015r = z;
            }
            if (c0824bu.f9015r || Math.abs(d7) < 0.001d || Math.abs(d8) < 0.001d) {
                i = 1;
                c0824bu.f9015r = true;
                c0824bu.f9002e = d3;
                c0824bu.f9003f = d5;
                c0824bu.f9004g = d4;
                c0824bu.f9005h = d6;
                double dHypot = Math.hypot(d8, d7);
                c0824bu.f8999b = dHypot;
                c0824bu.f9011n = dHypot * d10;
                c0824bu.f9009l = d7 / d9;
                c0824bu.f9010m = d8 / d9;
            } else {
                double[] dArr7 = new double[101];
                c0824bu.f8998a = dArr7;
                boolean z4 = c0824bu.f9014q;
                c0824bu.f9007j = ((double) (z4 ? -1 : 1)) * d7;
                c0824bu.f9008k = ((double) (z4 ? 1 : -1)) * d8;
                c0824bu.f9009l = z4 ? d5 : d3;
                c0824bu.f9010m = z4 ? d4 : d6;
                double d11 = d4 - d6;
                double dHypot2 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = C0824bu.f8997s;
                    if (i11 >= 91) {
                        break;
                    }
                    double d14 = d13;
                    double radians = Math.toRadians((((double) i11) * 90.0d) / 90.0d);
                    double dSin = Math.sin(radians) * d7;
                    double dCos = Math.cos(radians) * d11;
                    if (i11 > 0) {
                        dHypot2 += Math.hypot(dSin - d12, dCos - d14);
                        dArr3[i11] = dHypot2;
                    }
                    i11++;
                    d13 = dCos;
                    d12 = dSin;
                    dArr7 = dArr7;
                }
                double[] dArr8 = dArr7;
                c0824bu.f8999b = dHypot2;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / dHypot2;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d15 = ((double) i13) / 100.0d;
                    int iBinarySearch = Arrays.binarySearch(dArr3, d15);
                    if (iBinarySearch >= 0) {
                        dArr8[i13] = ((double) iBinarySearch) / 90.0d;
                    } else if (iBinarySearch == -1) {
                        dArr8[i13] = 0.0d;
                    } else {
                        int i14 = -iBinarySearch;
                        int i15 = i14 - 2;
                        double d16 = dArr3[i15];
                        dArr8[i13] = (((d15 - d16) / (dArr3[i14 - 1] - d16)) + ((double) i15)) / 90.0d;
                    }
                }
                c0824bu.f9011n = c0824bu.f8999b * c0824bu.f9006i;
                i = 1;
            }
            c0824buArr[i9] = c0824bu;
            c2897cu = this;
            dArr4 = dArr;
            i2 = i;
            i3 = i7;
            i4 = i10;
            c = 0;
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: b */
    public final double mo9884b(double d) {
        C0824bu[] c0824buArr = this.f34533b;
        C0824bu c0824bu = c0824buArr[0];
        double d2 = c0824bu.f9000c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0824bu.f9015r) {
                return (d3 * c0824buArr[0].f9009l) + c0824bu.m4171c(d2);
            }
            c0824bu.m4175g(d2);
            return (c0824buArr[0].m4169a() * d3) + c0824buArr[0].m4173e();
        }
        if (d > c0824buArr[c0824buArr.length - 1].f9001d) {
            double d4 = c0824buArr[c0824buArr.length - 1].f9001d;
            double d5 = d - d4;
            int length = c0824buArr.length - 1;
            return (d5 * c0824buArr[length].f9009l) + c0824buArr[length].m4171c(d4);
        }
        for (int i = 0; i < c0824buArr.length; i++) {
            C0824bu c0824bu2 = c0824buArr[i];
            if (d <= c0824bu2.f9001d) {
                if (c0824bu2.f9015r) {
                    return c0824bu2.m4171c(d);
                }
                c0824bu2.m4175g(d);
                return c0824buArr[i].m4173e();
            }
        }
        return Double.NaN;
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: c */
    public final void mo9885c(double d, double[] dArr) {
        C0824bu[] c0824buArr = this.f34533b;
        C0824bu c0824bu = c0824buArr[0];
        double d2 = c0824bu.f9000c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0824bu.f9015r) {
                double dM4171c = c0824bu.m4171c(d2);
                C0824bu c0824bu2 = c0824buArr[0];
                dArr[0] = (c0824bu2.f9009l * d3) + dM4171c;
                dArr[1] = (d3 * c0824buArr[0].f9010m) + c0824bu2.m4172d(d2);
                return;
            }
            c0824bu.m4175g(d2);
            dArr[0] = (c0824buArr[0].m4169a() * d3) + c0824buArr[0].m4173e();
            dArr[1] = (c0824buArr[0].m4170b() * d3) + c0824buArr[0].m4174f();
            return;
        }
        if (d <= c0824buArr[c0824buArr.length - 1].f9001d) {
            for (int i = 0; i < c0824buArr.length; i++) {
                C0824bu c0824bu3 = c0824buArr[i];
                if (d <= c0824bu3.f9001d) {
                    if (c0824bu3.f9015r) {
                        dArr[0] = c0824bu3.m4171c(d);
                        dArr[1] = c0824buArr[i].m4172d(d);
                        return;
                    } else {
                        c0824bu3.m4175g(d);
                        dArr[0] = c0824buArr[i].m4173e();
                        dArr[1] = c0824buArr[i].m4174f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = c0824buArr[c0824buArr.length - 1].f9001d;
        double d5 = d - d4;
        int length = c0824buArr.length - 1;
        C0824bu c0824bu4 = c0824buArr[length];
        if (c0824bu4.f9015r) {
            double dM4171c2 = c0824bu4.m4171c(d4);
            C0824bu c0824bu5 = c0824buArr[length];
            dArr[0] = (c0824bu5.f9009l * d5) + dM4171c2;
            dArr[1] = (d5 * c0824buArr[length].f9010m) + c0824bu5.m4172d(d4);
            return;
        }
        c0824bu4.m4175g(d);
        dArr[0] = (c0824buArr[length].m4169a() * d5) + c0824buArr[length].m4173e();
        dArr[1] = (c0824buArr[length].m4170b() * d5) + c0824buArr[length].m4174f();
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: d */
    public final void mo9886d(double d, float[] fArr) {
        C0824bu[] c0824buArr = this.f34533b;
        C0824bu c0824bu = c0824buArr[0];
        double d2 = c0824bu.f9000c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0824bu.f9015r) {
                double dM4171c = c0824bu.m4171c(d2);
                C0824bu c0824bu2 = c0824buArr[0];
                fArr[0] = (float) ((c0824bu2.f9009l * d3) + dM4171c);
                fArr[1] = (float) ((d3 * c0824buArr[0].f9010m) + c0824bu2.m4172d(d2));
                return;
            }
            c0824bu.m4175g(d2);
            fArr[0] = (float) ((c0824buArr[0].m4169a() * d3) + c0824buArr[0].m4173e());
            fArr[1] = (float) ((c0824buArr[0].m4170b() * d3) + c0824buArr[0].m4174f());
            return;
        }
        if (d <= c0824buArr[c0824buArr.length - 1].f9001d) {
            for (int i = 0; i < c0824buArr.length; i++) {
                C0824bu c0824bu3 = c0824buArr[i];
                if (d <= c0824bu3.f9001d) {
                    if (c0824bu3.f9015r) {
                        fArr[0] = (float) c0824bu3.m4171c(d);
                        fArr[1] = (float) c0824buArr[i].m4172d(d);
                        return;
                    } else {
                        c0824bu3.m4175g(d);
                        fArr[0] = (float) c0824buArr[i].m4173e();
                        fArr[1] = (float) c0824buArr[i].m4174f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = c0824buArr[c0824buArr.length - 1].f9001d;
        double d5 = d - d4;
        int length = c0824buArr.length - 1;
        C0824bu c0824bu4 = c0824buArr[length];
        if (!c0824bu4.f9015r) {
            c0824bu4.m4175g(d);
            fArr[0] = (float) c0824buArr[length].m4173e();
            fArr[1] = (float) c0824buArr[length].m4174f();
        } else {
            double dM4171c2 = c0824bu4.m4171c(d4);
            C0824bu c0824bu5 = c0824buArr[length];
            fArr[0] = (float) ((c0824bu5.f9009l * d5) + dM4171c2);
            fArr[1] = (float) ((d5 * c0824buArr[length].f9010m) + c0824bu5.m4172d(d4));
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: e */
    public final void mo9887e(double d, double[] dArr) {
        C0824bu[] c0824buArr = this.f34533b;
        double d2 = c0824buArr[0].f9000c;
        if (d < d2) {
            d = d2;
        } else if (d > c0824buArr[c0824buArr.length - 1].f9001d) {
            d = c0824buArr[c0824buArr.length - 1].f9001d;
        }
        for (int i = 0; i < c0824buArr.length; i++) {
            C0824bu c0824bu = c0824buArr[i];
            if (d <= c0824bu.f9001d) {
                if (c0824bu.f9015r) {
                    dArr[0] = c0824bu.f9009l;
                    dArr[1] = c0824bu.f9010m;
                    return;
                } else {
                    c0824bu.m4175g(d);
                    dArr[0] = c0824buArr[i].m4169a();
                    dArr[1] = c0824buArr[i].m4170b();
                    return;
                }
            }
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: f */
    public final double[] mo9888f() {
        return this.f34532a;
    }
}
