package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbp {

    /* JADX INFO: renamed from: a */
    public static final lbp f37885a = m15145a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});

    /* JADX INFO: renamed from: b */
    public static final lbp f37886b = m15145a(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});

    /* JADX INFO: renamed from: c */
    public final float[] f37887c;

    private lbp(float[] fArr) {
        lku.m15669w(fArr.length == 9);
        this.f37887c = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static lbp m15145a(float[] fArr) {
        return new lbp(Arrays.copyOf(fArr, fArr.length));
    }

    /* JADX INFO: renamed from: b */
    public static lbp m15146b() {
        return m15145a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    /* JADX INFO: renamed from: c */
    public final lbp m15147c(lbp lbpVar) {
        float[] fArrM15148d = lbpVar.m15148d();
        float[] fArr = new float[9];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = i * 3;
                    int i5 = i4 + i2;
                    fArr[i5] = fArr[i5] + (this.f37887c[(i3 * 3) + i2] * fArrM15148d[i4 + i3]);
                }
            }
        }
        return m15145a(fArr);
    }

    /* JADX INFO: renamed from: d */
    public final float[] m15148d() {
        float[] fArr = this.f37887c;
        return Arrays.copyOf(fArr, fArr.length);
    }

    /* JADX INFO: renamed from: e */
    public final float[] m15149e(float[] fArr) {
        float[] fArr2 = this.f37887c;
        float f = fArr2[6];
        float f2 = fArr[0];
        float f3 = fArr2[7];
        float f4 = fArr[1];
        float f5 = (f * f2) + (f3 * f4) + fArr2[8];
        return new float[]{(((fArr2[0] * f2) + (fArr2[1] * f4)) + fArr2[2]) / f5, (((fArr2[3] * fArr[0]) + (fArr2[4] * f4)) + fArr2[5]) / f5};
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbp) {
            return Arrays.equals(this.f37887c, ((lbp) obj).f37887c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37887c);
    }

    public final String toString() {
        float[] fArr = this.f37887c;
        return "[" + fArr[0] + ", " + fArr[1] + ", " + fArr[2] + "; " + fArr[3] + ", " + fArr[4] + ", " + fArr[5] + "; " + fArr[6] + ", " + fArr[7] + ", " + fArr[8] + "]";
    }
}
