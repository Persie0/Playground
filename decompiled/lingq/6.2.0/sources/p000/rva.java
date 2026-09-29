package p000;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rva {

    /* JADX INFO: renamed from: a */
    public z9d f59884a;

    /* JADX INFO: renamed from: e */
    public int f59888e;

    /* JADX INFO: renamed from: f */
    public String f59889f;

    /* JADX INFO: renamed from: i */
    public long f59892i;

    /* JADX INFO: renamed from: b */
    public int f59885b = 0;

    /* JADX INFO: renamed from: c */
    public int[] f59886c = new int[10];

    /* JADX INFO: renamed from: d */
    public float[][] f59887d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g */
    public float[] f59890g = new float[3];

    /* JADX INFO: renamed from: h */
    public boolean f59891h = false;

    /* JADX INFO: renamed from: j */
    public float f59893j = Float.NaN;

    /* JADX INFO: renamed from: a */
    public final float m20867a(float f) {
        switch (this.f59885b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                return 1.0f - Math.abs(f);
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                return 1.0f - (((f * 2.0f) + 1.0f) % 2.0f);
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                return 1.0f - (fAbs * fAbs);
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m20868b(float f, long j, View view, web webVar) {
        this.f59884a.mo9886d(f, this.f59890g);
        float[] fArr = this.f59890g;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f59891h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f59893j)) {
            float fM23883t = webVar.m23883t(view, this.f59889f);
            this.f59893j = fM23883t;
            if (Float.isNaN(fM23883t)) {
                this.f59893j = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f59892i) * 1.0E-9d) * ((double) f2)) + ((double) this.f59893j)) % 1.0d);
        this.f59893j = f3;
        String str = this.f59889f;
        HashMap map = (HashMap) webVar.f66742a;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f3});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f3});
            map.put(view, map3);
        }
        this.f59892i = j;
        float f4 = this.f59890g[0];
        float fM20867a = (m20867a(this.f59893j) * f4) + this.f59890g[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f59891h = z;
        return fM20867a;
    }

    /* JADX INFO: renamed from: c */
    public void mo18524c(float f, float f2, float f3, int i, int i2) {
        int[] iArr = this.f59886c;
        int i3 = this.f59888e;
        iArr[i3] = i;
        float[] fArr = this.f59887d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f59885b = Math.max(this.f59885b, i2);
        this.f59888e++;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo17649d(float f, long j, View view, web webVar);

    /* JADX INFO: renamed from: e */
    public void mo18525e(int i) {
        float[][] fArr = this.f59887d;
        int[] iArr = this.f59886c;
        int i2 = this.f59888e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f59889f);
            return;
        }
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f59888e; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = ((double) iArr[i18]) * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f59884a = z9d.m25517a(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f59889f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f59888e; i++) {
            StringBuilder sbM22999v = ux5.m22999v(string, "[");
            sbM22999v.append(this.f59886c[i]);
            sbM22999v.append(" , ");
            sbM22999v.append(decimalFormat.format(this.f59887d[i]));
            sbM22999v.append("] ");
            string = sbM22999v.toString();
        }
        return string;
    }
}
