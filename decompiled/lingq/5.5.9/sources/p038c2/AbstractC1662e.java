package p038c2;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p003a2.C0009a;

/* JADX INFO: renamed from: c2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1662e {

    /* JADX INFO: renamed from: a */
    public a f9309a;

    /* JADX INFO: renamed from: b */
    public String f9310b;

    /* JADX INFO: renamed from: c */
    public int f9311c = 0;

    /* JADX INFO: renamed from: d */
    public String f9312d = null;

    /* JADX INFO: renamed from: e */
    public int f9313e = 0;

    /* JADX INFO: renamed from: f */
    public final ArrayList<b> f9314f = new ArrayList<>();

    /* JADX INFO: renamed from: c2.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C1665h f9315a;

        /* JADX INFO: renamed from: b */
        public final float[] f9316b;

        /* JADX INFO: renamed from: c */
        public final double[] f9317c;

        /* JADX INFO: renamed from: d */
        public final float[] f9318d;

        /* JADX INFO: renamed from: e */
        public final float[] f9319e;

        /* JADX INFO: renamed from: f */
        public final float[] f9320f;

        /* JADX INFO: renamed from: g */
        public AbstractC1659b f9321g;

        /* JADX INFO: renamed from: h */
        public double[] f9322h;

        public a(String str, int i10, int i11) {
            long j10;
            char c10;
            C1665h c1665h = new C1665h();
            this.f9315a = c1665h;
            c1665h.f9339e = i10;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int iIndexOf = str.indexOf(40) + 1;
                int iIndexOf2 = str.indexOf(44, iIndexOf);
                char c11 = 0;
                int i12 = 0;
                while (iIndexOf2 != -1) {
                    dArr[i12] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                    iIndexOf = iIndexOf2 + 1;
                    iIndexOf2 = str.indexOf(44, iIndexOf);
                    i12++;
                }
                dArr[i12] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                double[] dArrCopyOf = Arrays.copyOf(dArr, i12 + 1);
                int length = (dArrCopyOf.length * 3) - 2;
                int length2 = dArrCopyOf.length - 1;
                double d10 = 1.0d / ((double) length2);
                double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i13 = 0;
                while (i13 < dArrCopyOf.length) {
                    double d11 = dArrCopyOf[i13];
                    int i14 = i13 + length2;
                    dArr2[i14][c11] = d11;
                    double d12 = ((double) i13) * d10;
                    dArr3[i14] = d12;
                    if (i13 > 0) {
                        int i15 = (length2 * 2) + i13;
                        j10 = 4607182418800017408L;
                        c10 = 0;
                        dArr2[i15][0] = d11 + 1.0d;
                        dArr3[i15] = d12 + 1.0d;
                        int i16 = i13 - 1;
                        dArr2[i16][0] = (d11 - 1.0d) - d10;
                        dArr3[i16] = (d12 - 1.0d) - d10;
                    } else {
                        j10 = 4607182418800017408L;
                        c10 = 0;
                    }
                    i13++;
                    c11 = c10;
                }
                c1665h.f9338d = new C1664g(dArr3, dArr2);
            }
            this.f9316b = new float[i11];
            this.f9317c = new double[i11];
            this.f9318d = new float[i11];
            this.f9319e = new float[i11];
            this.f9320f = new float[i11];
            float[] fArr = new float[i11];
        }
    }

    /* JADX INFO: renamed from: c2.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f9323a;

        /* JADX INFO: renamed from: b */
        public final float f9324b;

        /* JADX INFO: renamed from: c */
        public final float f9325c;

        /* JADX INFO: renamed from: d */
        public final float f9326d;

        /* JADX INFO: renamed from: e */
        public final float f9327e;

        public b(float f3, float f10, float f11, float f12, int i10) {
            this.f9323a = i10;
            this.f9324b = f12;
            this.f9325c = f10;
            this.f9326d = f3;
            this.f9327e = f11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m5388a(float f3) {
        double dSignum;
        double d10;
        double dAbs;
        a aVar = this.f9309a;
        AbstractC1659b abstractC1659b = aVar.f9321g;
        if (abstractC1659b != null) {
            abstractC1659b.mo5371c(f3, aVar.f9322h);
        } else {
            double[] dArr = aVar.f9322h;
            dArr[0] = aVar.f9319e[0];
            dArr[1] = aVar.f9320f[0];
            dArr[2] = aVar.f9316b[0];
        }
        double[] dArr2 = aVar.f9322h;
        double d11 = dArr2[0];
        double d12 = dArr2[1];
        double d13 = f3;
        C1665h c1665h = aVar.f9315a;
        c1665h.getClass();
        double d14 = 0.0d;
        if (d13 < 0.0d) {
            d13 = 0.0d;
        } else if (d13 > 1.0d) {
            d13 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(c1665h.f9336b, d13);
        if (iBinarySearch > 0) {
            d14 = 1.0d;
        } else if (iBinarySearch != 0) {
            int i10 = (-iBinarySearch) - 1;
            float[] fArr = c1665h.f9335a;
            float f10 = fArr[i10];
            int i11 = i10 - 1;
            float f11 = fArr[i11];
            double d15 = f10 - f11;
            double[] dArr3 = c1665h.f9336b;
            double d16 = dArr3[i10];
            double d17 = dArr3[i11];
            double d18 = d15 / (d16 - d17);
            d14 = ((((d13 * d13) - (d17 * d17)) * d18) / 2.0d) + ((d13 - d17) * (((double) f11) - (d18 * d17))) + c1665h.f9337c[i11];
        }
        double d19 = d14 + d12;
        switch (c1665h.f9339e) {
            case 1:
                dSignum = Math.signum(0.5d - (d19 % 1.0d));
                break;
            case 2:
                d10 = 1.0d;
                dAbs = Math.abs((((d19 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = d10 - dAbs;
                break;
            case 3:
                dSignum = (((d19 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                d10 = 1.0d;
                dAbs = ((d19 * 2.0d) + 1.0d) % 2.0d;
                dSignum = d10 - dAbs;
                break;
            case 5:
                dSignum = Math.cos((d12 + d19) * 6.283185307179586d);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                d10 = 1.0d;
                double dAbs2 = 1.0d - Math.abs(((d19 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = d10 - dAbs;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                dSignum = c1665h.f9338d.mo5370b(d19 % 1.0d);
                break;
            default:
                dSignum = Math.sin(d19 * 6.283185307179586d);
                break;
        }
        return (float) ((dSignum * aVar.f9322h[2]) + d11);
    }

    /* JADX INFO: renamed from: b */
    public void mo5389b(ConstraintAttribute constraintAttribute) {
    }

    /* JADX INFO: renamed from: c */
    public final void m5390c() {
        int i10;
        ArrayList<b> arrayList = this.f9314f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C1661d());
        double[] dArr = new double[size];
        char c10 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f9309a = new a(this.f9312d, this.f9311c, size);
        int i11 = 0;
        for (b bVar : arrayList) {
            float f3 = bVar.f9326d;
            dArr[i11] = ((double) f3) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f10 = bVar.f9324b;
            dArr3[c10] = f10;
            float f11 = bVar.f9325c;
            dArr3[1] = f11;
            float f12 = bVar.f9327e;
            dArr3[2] = f12;
            a aVar = this.f9309a;
            aVar.f9317c[i11] = ((double) bVar.f9323a) / 100.0d;
            aVar.f9318d[i11] = f3;
            aVar.f9319e[i11] = f11;
            aVar.f9320f[i11] = f12;
            aVar.f9316b[i11] = f10;
            i11++;
            c10 = 0;
        }
        a aVar2 = this.f9309a;
        double[] dArr4 = aVar2.f9317c;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr4.length, 3);
        float[] fArr = aVar2.f9316b;
        aVar2.f9322h = new double[fArr.length + 2];
        double[] dArr6 = new double[fArr.length + 2];
        double d10 = dArr4[0];
        float[] fArr2 = aVar2.f9318d;
        C1665h c1665h = aVar2.f9315a;
        if (d10 > 0.0d) {
            c1665h.m5395a(0.0d, fArr2[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            c1665h.m5395a(1.0d, fArr2[length]);
        }
        for (int i12 = 0; i12 < dArr5.length; i12++) {
            double[] dArr7 = dArr5[i12];
            dArr7[0] = aVar2.f9319e[i12];
            dArr7[1] = aVar2.f9320f[i12];
            dArr7[2] = fArr[i12];
            c1665h.m5395a(dArr4[i12], fArr2[i12]);
        }
        int i13 = 0;
        double d11 = 0.0d;
        while (true) {
            float[] fArr3 = c1665h.f9335a;
            if (i13 >= fArr3.length) {
                break;
            }
            d11 += (double) fArr3[i13];
            i13++;
        }
        int i14 = 1;
        double d12 = 0.0d;
        while (true) {
            float[] fArr4 = c1665h.f9335a;
            if (i14 >= fArr4.length) {
                break;
            }
            int i15 = i14 - 1;
            float f13 = (fArr4[i15] + fArr4[i14]) / 2.0f;
            double[] dArr8 = c1665h.f9336b;
            d12 = ((dArr8[i14] - dArr8[i15]) * ((double) f13)) + d12;
            i14++;
        }
        int i16 = 0;
        while (true) {
            float[] fArr5 = c1665h.f9335a;
            if (i16 >= fArr5.length) {
                break;
            }
            fArr5[i16] = (float) (((double) fArr5[i16]) * (d11 / d12));
            i16++;
            dArr5 = dArr5;
        }
        double[][] dArr9 = dArr5;
        c1665h.f9337c[0] = 0.0d;
        int i17 = 1;
        while (true) {
            float[] fArr6 = c1665h.f9335a;
            if (i17 >= fArr6.length) {
                break;
            }
            int i18 = i17 - 1;
            float f14 = (fArr6[i18] + fArr6[i17]) / 2.0f;
            double[] dArr10 = c1665h.f9336b;
            double d13 = dArr10[i17] - dArr10[i18];
            double[] dArr11 = c1665h.f9337c;
            dArr11[i17] = (d13 * ((double) f14)) + dArr11[i18];
            i17++;
        }
        if (dArr4.length > 1) {
            i10 = 0;
            aVar2.f9321g = AbstractC1659b.m5382a(0, dArr4, dArr9);
        } else {
            i10 = 0;
            aVar2.f9321g = null;
        }
        AbstractC1659b.m5382a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f9310b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (b bVar : this.f9314f) {
            StringBuilder sbM26o = C0009a.m26o(string, "[");
            sbM26o.append(bVar.f9323a);
            sbM26o.append(" , ");
            sbM26o.append(decimalFormat.format(bVar.f9324b));
            sbM26o.append("] ");
            string = sbM26o.toString();
        }
        return string;
    }
}
