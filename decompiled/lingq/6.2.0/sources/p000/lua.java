package p000;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lua {

    /* JADX INFO: renamed from: a */
    public wh4 f50159a;

    /* JADX INFO: renamed from: b */
    public String f50160b;

    /* JADX INFO: renamed from: c */
    public int f50161c = 0;

    /* JADX INFO: renamed from: d */
    public String f50162d = null;

    /* JADX INFO: renamed from: e */
    public int f50163e = 0;

    /* JADX INFO: renamed from: f */
    public final ArrayList f50164f = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static lua m16546b(String str) {
        if (str.startsWith("CUSTOM")) {
            iua iuaVar = new iua();
            iuaVar.f44621g = new float[1];
            return iuaVar;
        }
        switch (str) {
            case "rotationX":
                return new hua(3);
            case "rotationY":
                return new hua(4);
            case "translationX":
                return new hua(7);
            case "translationY":
                return new hua(8);
            case "translationZ":
                return new hua(9);
            case "progress":
                kua kuaVar = new kua();
                kuaVar.f48440g = false;
                return kuaVar;
            case "scaleX":
                return new hua(5);
            case "scaleY":
                return new hua(6);
            case "waveVariesBy":
                return new hua(0);
            case "rotation":
                return new hua(2);
            case "elevation":
                return new hua(1);
            case "transitionPathRotate":
                return new jua();
            case "alpha":
                return new hua(0);
            case "waveOffset":
                return new hua(0);
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d6  */
    /* JADX INFO: renamed from: a */
    public final float m16547a(float f) {
        double d;
        double d2;
        double dSignum;
        double dAbs;
        wh4 wh4Var = this.f50159a;
        z9d z9dVar = wh4Var.f66825g;
        double[] dArr = wh4Var.f66826h;
        char c = 2;
        if (z9dVar != null) {
            z9dVar.mo9885c(f, dArr);
        } else {
            dArr[0] = wh4Var.f66823e[0];
            dArr[1] = wh4Var.f66824f[0];
            dArr[2] = wh4Var.f66820b[0];
        }
        double[] dArr2 = wh4Var.f66826h;
        double d3 = dArr2[0];
        double d4 = dArr2[1];
        fn3 fn3Var = wh4Var.f66819a;
        double d5 = f;
        fn3Var.getClass();
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 1.0d) {
                d6 = 1.0d;
            } else {
                int iBinarySearch = Arrays.binarySearch((double[]) fn3Var.f39335d, d5);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = (float[]) fn3Var.f39334c;
                float f2 = fArr[iBinarySearch];
                int i = iBinarySearch - 1;
                float f3 = fArr[i];
                d = 2.0d;
                double d7 = f2 - f3;
                double[] dArr3 = (double[]) fn3Var.f39335d;
                double d8 = dArr3[iBinarySearch];
                double d9 = dArr3[i];
                double d10 = d7 / (d8 - d9);
                c = 2;
                d6 = ((((d5 * d5) - (d9 * d9)) * d10) / 2.0d) + ((d5 - d9) * (((double) f3) - (d10 * d9))) + ((double[]) fn3Var.f39336e)[i];
            }
            d2 = d6 + d4;
            switch (fn3Var.f39333b) {
                case 1:
                    dSignum = Math.signum(0.5d - (d2 % 1.0d));
                    break;
                case 2:
                    dAbs = Math.abs((((d2 * 4.0d) + 1.0d) % 4.0d) - d);
                    dSignum = 1.0d - dAbs;
                    break;
                case 3:
                    dSignum = (((d2 * d) + 1.0d) % d) - 1.0d;
                    break;
                case 4:
                    dSignum = 1.0d - (((d2 * d) + 1.0d) % d);
                    break;
                case 5:
                    dSignum = Math.cos((d4 + d2) * 6.283185307179586d);
                    break;
                case 6:
                    double dAbs2 = 1.0d - Math.abs(((d2 * 4.0d) % 4.0d) - d);
                    dAbs = dAbs2 * dAbs2;
                    dSignum = 1.0d - dAbs;
                    break;
                case 7:
                    dSignum = ((s16) fn3Var.f39337f).mo9884b(d2 % 1.0d);
                    break;
                default:
                    dSignum = Math.sin(6.283185307179586d * d2);
                    break;
            }
            return (float) ((dSignum * wh4Var.f66826h[c]) + d3);
        }
        d = 2.0d;
        d2 = d6 + d4;
        switch (fn3Var.f39333b) {
            case 1:
                dSignum = Math.signum(0.5d - (d2 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d2 * 4.0d) + 1.0d) % 4.0d) - d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d2 * d) + 1.0d) % d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d2 * d) + 1.0d) % d);
                break;
            case 5:
                dSignum = Math.cos((d4 + d2) * 6.283185307179586d);
                break;
            case 6:
                double dAbs3 = 1.0d - Math.abs(((d2 * 4.0d) % 4.0d) - d);
                dAbs = dAbs3 * dAbs3;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = ((s16) fn3Var.f39337f).mo9884b(d2 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d2);
                break;
        }
        return (float) ((dSignum * wh4Var.f66826h[c]) + d3);
    }

    /* JADX INFO: renamed from: c */
    public void mo14154c(cj1 cj1Var) {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo13481d(View view, float f);

    /* JADX INFO: renamed from: e */
    public final void m16548e() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<xh4> arrayList = this.f50164f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new ma3(21));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.f50161c;
        String str = this.f50162d;
        wh4 wh4Var = new wh4();
        fn3 fn3Var = new fn3(1);
        fn3Var.f39334c = new float[0];
        fn3Var.f39335d = new double[0];
        wh4Var.f66819a = fn3Var;
        fn3Var.f39333b = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double d4 = d2;
                double d5 = ((double) i6) * d4;
                dArr5[i7] = d5;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d5 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d4;
                    dArr5[i9] = (d5 - 1.0d) - d4;
                }
                i6++;
                d2 = d4;
            }
            fn3Var.f39337f = new s16(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        wh4Var.f66820b = new float[size];
        wh4Var.f66821c = new double[size];
        wh4Var.f66822d = new float[size];
        wh4Var.f66823e = new float[size];
        wh4Var.f66824f = new float[size];
        float[] fArr = new float[size];
        this.f50159a = wh4Var;
        int i10 = i2;
        for (xh4 xh4Var : arrayList) {
            float f = xh4Var.f68204d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i10];
            float f2 = xh4Var.f68202b;
            dArr6[i2] = f2;
            float f3 = xh4Var.f68203c;
            dArr6[i] = f3;
            float f4 = xh4Var.f68205e;
            dArr6[r4] = f4;
            wh4 wh4Var2 = this.f50159a;
            wh4Var2.f66821c[i10] = ((double) xh4Var.f68201a) / 100.0d;
            wh4Var2.f66822d[i10] = f;
            wh4Var2.f66823e[i10] = f3;
            wh4Var2.f66824f[i10] = f4;
            wh4Var2.f66820b[i10] = f2;
            i10++;
        }
        wh4 wh4Var3 = this.f50159a;
        float[] fArr2 = wh4Var3.f66822d;
        fn3 fn3Var2 = wh4Var3.f66819a;
        double[] dArr7 = wh4Var3.f66821c;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = wh4Var3.f66820b;
        wh4Var3.f66826h = new double[fArr3.length + 2];
        double[] dArr9 = new double[fArr3.length + 2];
        double d6 = 0.0d;
        if (dArr7[i2] > 0.0d) {
            fn3Var2.m11949a(0.0d, fArr2[i2]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            fn3Var2.m11949a(d, fArr2[length4]);
        }
        for (int i11 = i2; i11 < dArr8.length; i11++) {
            double[] dArr10 = dArr8[i11];
            dArr10[i2] = wh4Var3.f66823e[i11];
            dArr10[i] = wh4Var3.f66824f[i11];
            dArr10[2] = fArr3[i11];
            fn3Var2.m11949a(dArr7[i11], fArr2[i11]);
        }
        double d7 = 0.0d;
        int i12 = i2;
        while (true) {
            float[] fArr4 = (float[]) fn3Var2.f39334c;
            if (i12 >= fArr4.length) {
                break;
            }
            d7 += (double) fArr4[i12];
            i12++;
        }
        double d8 = 0.0d;
        int i13 = i;
        while (true) {
            float[] fArr5 = (float[]) fn3Var2.f39334c;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f5 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double[] dArr11 = (double[]) fn3Var2.f39335d;
            d8 = ((dArr11[i13] - dArr11[i14]) * ((double) f5)) + d8;
            i13++;
        }
        int i15 = i2;
        while (true) {
            float[] fArr6 = (float[]) fn3Var2.f39334c;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = fArr6[i15] * ((float) (d7 / d8));
            i15++;
            d6 = d6;
        }
        ((double[]) fn3Var2.f39336e)[i2] = d6;
        int i16 = i;
        while (true) {
            float[] fArr7 = (float[]) fn3Var2.f39334c;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f6 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr12 = (double[]) fn3Var2.f39335d;
            double d9 = dArr12[i16] - dArr12[i17];
            double[] dArr13 = (double[]) fn3Var2.f39336e;
            dArr13[i16] = (d9 * ((double) f6)) + dArr13[i17];
            i16++;
        }
        if (dArr7.length > i) {
            i3 = i2;
            wh4Var3.f66825g = z9d.m25517a(i3, dArr7, dArr8);
        } else {
            i3 = i2;
            wh4Var3.f66825g = null;
        }
        z9d.m25517a(i3, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f50160b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (xh4 xh4Var : this.f50164f) {
            StringBuilder sbM22999v = ux5.m22999v(string, "[");
            sbM22999v.append(xh4Var.f68201a);
            sbM22999v.append(" , ");
            sbM22999v.append(decimalFormat.format(xh4Var.f68202b));
            sbM22999v.append("] ");
            string = sbM22999v.toString();
        }
        return string;
    }
}
