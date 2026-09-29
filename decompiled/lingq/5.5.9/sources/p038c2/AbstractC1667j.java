package p038c2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p003a2.C0009a;

/* JADX INFO: renamed from: c2.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1667j {

    /* JADX INFO: renamed from: a */
    public AbstractC1659b f9342a;

    /* JADX INFO: renamed from: b */
    public int[] f9343b = new int[10];

    /* JADX INFO: renamed from: c */
    public float[] f9344c = new float[10];

    /* JADX INFO: renamed from: d */
    public int f9345d;

    /* JADX INFO: renamed from: e */
    public String f9346e;

    /* JADX INFO: renamed from: a */
    public final float m5396a(float f3) {
        return (float) this.f9342a.mo5370b(f3);
    }

    /* JADX INFO: renamed from: b */
    public void mo5397b(int i10, float f3) {
        int[] iArr = this.f9343b;
        if (iArr.length < this.f9345d + 1) {
            this.f9343b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f9344c;
            this.f9344c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f9343b;
        int i11 = this.f9345d;
        iArr2[i11] = i10;
        this.f9344c[i11] = f3;
        this.f9345d = i11 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX INFO: renamed from: c */
    public void mo5398c(int i10) {
        int i11 = this.f9345d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f9343b;
        float[] fArr = this.f9344c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            i12 = i13 - 1;
            int i15 = iArr2[i12];
            if (i14 < i15) {
                int i16 = iArr[i15];
                int i17 = i14;
                int i18 = i17;
                while (i17 < i15) {
                    int i19 = iArr[i17];
                    if (i19 <= i16) {
                        int i20 = iArr[i18];
                        iArr[i18] = i19;
                        iArr[i17] = i20;
                        float f3 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = f3;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float f10 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = f10;
                int i22 = i12 + 1;
                iArr2[i12] = i18 - 1;
                int i23 = i22 + 1;
                iArr2[i22] = i14;
                int i24 = i23 + 1;
                iArr2[i23] = i15;
                i12 = i24 + 1;
                iArr2[i24] = i18 + 1;
            }
        }
        int i25 = 1;
        for (int i26 = 1; i26 < this.f9345d; i26++) {
            int[] iArr3 = this.f9343b;
            if (iArr3[i26 - 1] != iArr3[i26]) {
                i25++;
            }
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i25, 1);
        int i27 = 0;
        for (int i28 = 0; i28 < this.f9345d; i28++) {
            if (i28 > 0) {
                int[] iArr4 = this.f9343b;
                if (iArr4[i28] != iArr4[i28 - 1]) {
                    dArr[i27] = ((double) this.f9343b[i28]) * 0.01d;
                    dArr2[i27][0] = this.f9344c[i28];
                    i27++;
                }
            } else {
                dArr[i27] = ((double) this.f9343b[i28]) * 0.01d;
                dArr2[i27][0] = this.f9344c[i28];
                i27++;
            }
        }
        this.f9342a = AbstractC1659b.m5382a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f9346e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f9345d; i10++) {
            StringBuilder sbM26o = C0009a.m26o(string, "[");
            sbM26o.append(this.f9343b[i10]);
            sbM26o.append(" , ");
            sbM26o.append(decimalFormat.format(this.f9344c[i10]));
            sbM26o.append("] ");
            string = sbM26o.toString();
        }
        return string;
    }
}
