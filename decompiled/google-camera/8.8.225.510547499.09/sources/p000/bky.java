package p000;

import android.graphics.Color;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bky implements blq {

    /* JADX INFO: renamed from: a */
    private int f3672a;

    public bky(int i) {
        this.f3672a = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    @Override // p000.blq
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2637a(blt bltVar, float f) {
        int i;
        ArrayList arrayList = new ArrayList();
        int iMo2665q = bltVar.mo2665q();
        if (iMo2665q == 1) {
            bltVar.mo2656h();
        }
        while (bltVar.mo2663o()) {
            arrayList.add(Float.valueOf((float) bltVar.mo2650a()));
        }
        if (iMo2665q == 1) {
            bltVar.mo2658j();
        }
        int size = this.f3672a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.f3672a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f3672a * 4;
            if (i2 >= i5) {
                dsx dsxVar = new dsx(fArr, iArr);
                if (arrayList.size() > i5) {
                    int size2 = (arrayList.size() - i5) / 2;
                    double[] dArr = new double[size2];
                    double[] dArr2 = new double[size2];
                    int i6 = 0;
                    while (i5 < arrayList.size()) {
                        if (i5 % 2 == 0) {
                            dArr[i6] = ((Float) arrayList.get(i5)).floatValue();
                        } else {
                            dArr2[i6] = ((Float) arrayList.get(i5)).floatValue();
                            i6++;
                        }
                        i5++;
                    }
                    for (int i7 = 0; i7 < dsxVar.m6685I(); i7++) {
                        int i8 = ((int[]) dsxVar.f12522b)[i7];
                        double d = ((float[]) dsxVar.f12521a)[i7];
                        int i9 = 1;
                        while (true) {
                            if (i9 >= size2) {
                                i = (int) (dArr2[size2 - 1] * 255.0d);
                                break;
                            }
                            int i10 = i9 - 1;
                            double d2 = dArr[i10];
                            double d3 = dArr[i9];
                            if (d3 >= d) {
                                Double.isNaN(d);
                                double dMax = Math.max(0.0d, Math.min(1.0d, (d - d2) / (d3 - d2)));
                                double d4 = dArr2[i10];
                                i = (int) ((d4 + (dMax * (dArr2[i9] - d4))) * 255.0d);
                                break;
                            }
                            i9++;
                        }
                        ((int[]) dsxVar.f12522b)[i7] = Color.argb(i, Color.red(i8), Color.green(i8), Color.blue(i8));
                    }
                }
                return dsxVar;
            }
            int i11 = i2 / 4;
            double dFloatValue = ((Float) arrayList.get(i2)).floatValue();
            switch (i2 % 4) {
                case 0:
                    if (i11 > 0) {
                        float f2 = (float) dFloatValue;
                        if (fArr[i11 - 1] >= f2) {
                            fArr[i11] = f2 + 0.01f;
                        } else {
                            fArr[i11] = (float) dFloatValue;
                        }
                    } else {
                        fArr[i11] = (float) dFloatValue;
                    }
                    break;
                case 1:
                    Double.isNaN(dFloatValue);
                    i3 = (int) (dFloatValue * 255.0d);
                    break;
                case 2:
                    Double.isNaN(dFloatValue);
                    i4 = (int) (dFloatValue * 255.0d);
                    break;
                case 3:
                    Double.isNaN(dFloatValue);
                    iArr[i11] = Color.argb(255, i3, i4, (int) (dFloatValue * 255.0d));
                    break;
            }
            i2++;
        }
    }
}
