package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ewu {

    /* JADX INFO: renamed from: a */
    private static gtd f20694a = null;

    /* JADX INFO: renamed from: a */
    public static gtd m7957a(bob bobVar) {
        int i;
        int i2;
        int iAbs;
        if (f20694a == null) {
            ArrayList arrayList = new ArrayList(bobVar.f3960f);
            ArrayList arrayList2 = new ArrayList(bobVar.f3957c);
            int[] iArr = new int[arrayList.size()];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i3 >= arrayList.size()) {
                    break;
                }
                iArr[i3] = -1;
                double dM2811b = ((bon) arrayList.get(i3)).m2811b();
                double dM2810a = ((bon) arrayList.get(i3)).m2810a();
                int i5 = Integer.MAX_VALUE;
                int i6 = 0;
                while (i6 < arrayList2.size()) {
                    Double.isNaN(dM2811b);
                    Double.isNaN(dM2810a);
                    double d = dM2811b / dM2810a;
                    double dM2811b2 = ((bon) arrayList2.get(i6)).m2811b();
                    double d2 = dM2811b;
                    double dM2810a2 = ((bon) arrayList2.get(i6)).m2810a();
                    Double.isNaN(dM2811b2);
                    Double.isNaN(dM2810a2);
                    if (Math.abs(d - (dM2811b2 / dM2810a2)) < 0.03d && ((bon) arrayList2.get(i6)).m2811b() < 640 && (iAbs = Math.abs(((bon) arrayList2.get(i6)).m2811b() - 320)) < i5) {
                        iArr[i3] = i6;
                        i5 = iAbs;
                    }
                    i6++;
                    dM2811b = d2;
                }
                if (iArr[i3] >= 0) {
                    i4++;
                }
                i3++;
            }
            double d3 = Double.MAX_VALUE;
            if (i4 == 0) {
                double d4 = 320.0d;
                int i7 = 0;
                int i8 = -1;
                while (i7 < arrayList2.size()) {
                    double dAbs = Math.abs(((bon) arrayList2.get(i7)).m2811b() - 320);
                    double d5 = dAbs < d4 ? dAbs : d4;
                    if (dAbs < d4) {
                        i8 = i7;
                    }
                    i7++;
                    d4 = d5;
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    iArr[i9] = i8;
                }
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (i2 < arrayList.size()) {
                if (iArr[i2] >= 0) {
                    double dAbs2 = Math.abs(((bon) arrayList.get(i2)).m2811b() - 3000);
                    double dM2811b3 = ((bon) arrayList.get(i2)).m2811b();
                    double dM2810a3 = ((bon) arrayList.get(i2)).m2810a();
                    Double.isNaN(dM2811b3);
                    Double.isNaN(dM2810a3);
                    double dAbs3 = Math.abs((dM2811b3 / dM2810a3) - 1.3333333333333333d);
                    if (i < 0 || dAbs2 < d3 || (dAbs2 == d3 && dAbs3 < d3)) {
                        i = i2;
                        d3 = dAbs3;
                        d3 = dAbs2;
                    }
                }
                i2++;
            }
            if (d3 > 0.03d) {
                double d6 = d3;
                double d7 = d3;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (iArr[i10] >= 0) {
                        double dM2811b4 = ((bon) arrayList.get(i10)).m2811b();
                        double dM2810a4 = ((bon) arrayList.get(i10)).m2810a();
                        Double.isNaN(dM2811b4);
                        Double.isNaN(dM2810a4);
                        double dAbs4 = Math.abs((dM2811b4 / dM2810a4) - 1.3333333333333333d);
                        double dAbs5 = Math.abs(((bon) arrayList.get(i10)).m2811b() - 3000);
                        if (dAbs4 + 0.03d < d7) {
                            double dAbs6 = Math.abs(((bon) arrayList.get(i10)).m2811b() - 3000);
                            if (dAbs6 < 1050.0d) {
                                d7 = dAbs4;
                            }
                            if (dAbs6 < 1050.0d) {
                                d6 = dAbs5;
                            }
                            if (dAbs6 < 1050.0d) {
                                i = i10;
                            }
                        } else if (Math.abs(dAbs4 - d7) < 0.03d && dAbs5 < d6) {
                            i = i10;
                            d7 = dAbs4;
                            d6 = dAbs5;
                        }
                    }
                }
            }
            int i11 = iArr[i];
            bon bonVar = (bon) arrayList.get(i);
            bonVar.m2811b();
            bonVar.m2810a();
            f20694a = new gtd((bon) arrayList2.get(i11), (bon) arrayList.get(i));
        }
        return f20694a;
    }
}
