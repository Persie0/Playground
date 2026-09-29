package p038c2;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p003a2.C0009a;

/* JADX INFO: renamed from: c2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1672o {

    /* JADX INFO: renamed from: a */
    public AbstractC1659b f9370a;

    /* JADX INFO: renamed from: e */
    public int f9374e;

    /* JADX INFO: renamed from: f */
    public String f9375f;

    /* JADX INFO: renamed from: i */
    public long f9378i;

    /* JADX INFO: renamed from: b */
    public int f9371b = 0;

    /* JADX INFO: renamed from: c */
    public final int[] f9372c = new int[10];

    /* JADX INFO: renamed from: d */
    public final float[][] f9373d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g */
    public final float[] f9376g = new float[3];

    /* JADX INFO: renamed from: h */
    public boolean f9377h = false;

    /* JADX INFO: renamed from: j */
    public float f9379j = Float.NaN;

    /* JADX INFO: renamed from: a */
    public final float m5403a(float f3) {
        float fAbs;
        switch (this.f9371b) {
            case 1:
                return Math.signum(f3 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f3);
                break;
            case 3:
                return (((f3 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f3 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f3 * 6.2831855f);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                float fAbs2 = 1.0f - Math.abs(((f3 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f3 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: b */
    public void mo5404b(float f3, float f10, float f11, int i10, int i11) {
        int i12 = this.f9374e;
        this.f9372c[i12] = i10;
        float[] fArr = this.f9373d[i12];
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        this.f9371b = Math.max(this.f9371b, i11);
        this.f9374e++;
    }

    /* JADX INFO: renamed from: c */
    public void mo5405c(int i10) {
        float[][] fArr;
        int i11 = this.f9374e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f9375f);
            return;
        }
        int[] iArr = this.f9372c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (true) {
            fArr = this.f9373d;
            if (i12 <= 0) {
                break;
            }
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
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
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
        int i25 = 0;
        for (int i26 = 1; i26 < iArr.length; i26++) {
            if (iArr[i26] != iArr[i26 - 1]) {
                i25++;
            }
        }
        if (i25 == 0) {
            i25 = 1;
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i25, 3);
        int i27 = 0;
        for (int i28 = 0; i28 < this.f9374e; i28++) {
            if (i28 <= 0 || iArr[i28] != iArr[i28 - 1]) {
                dArr[i27] = ((double) iArr[i28]) * 0.01d;
                double[] dArr3 = dArr2[i27];
                float[] fArr4 = fArr[i28];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i27++;
            }
        }
        this.f9370a = AbstractC1659b.m5382a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f9375f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f9374e; i10++) {
            StringBuilder sbM26o = C0009a.m26o(string, "[");
            sbM26o.append(this.f9372c[i10]);
            sbM26o.append(" , ");
            sbM26o.append(decimalFormat.format(this.f9373d[i10]));
            sbM26o.append("] ");
            string = sbM26o.toString();
        }
        return string;
    }
}
