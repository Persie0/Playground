package p038c2;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: c2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1669l extends C1660c {

    /* JADX INFO: renamed from: d */
    public final C1664g f9356d;

    public C1669l(String str) {
        this.f9304a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d10 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
            double d11 = dArrCopyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d11;
            double d12 = ((double) i11) * d10;
            dArr3[i12] = d12;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d11 + 1.0d;
                dArr3[i13] = d12 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d11 - 1.0d) - d10;
                dArr3[i14] = (d12 - 1.0d) - d10;
            }
        }
        C1664g c1664g = new C1664g(dArr3, dArr2);
        System.out.println(" 0 " + c1664g.mo5370b(0.0d));
        System.out.println(" 1 " + c1664g.mo5370b(1.0d));
        this.f9356d = c1664g;
    }

    @Override // p038c2.C1660c
    /* JADX INFO: renamed from: a */
    public final double mo5384a(double d10) {
        return this.f9356d.mo5370b(d10);
    }

    @Override // p038c2.C1660c
    /* JADX INFO: renamed from: b */
    public final double mo5385b(double d10) {
        return this.f9356d.m5394h(d10);
    }
}
