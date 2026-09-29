package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ap3 {

    /* JADX INFO: renamed from: a */
    public final float[] f7321a;

    /* JADX INFO: renamed from: b */
    public final int[] f7322b;

    public ap3(float[] fArr, int[] iArr) {
        this.f7321a = fArr;
        this.f7322b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m2966a(ap3 ap3Var) {
        int i = 0;
        while (true) {
            int[] iArr = ap3Var.f7322b;
            if (i >= iArr.length) {
                return;
            }
            this.f7321a[i] = ap3Var.f7321a[i];
            this.f7322b[i] = iArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ap3 m2967b(float[] fArr) {
        int iM15165c;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f7321a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f7322b;
            if (iBinarySearch >= 0) {
                iM15165c = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iM15165c = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iM15165c = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iM15165c = ked.m15165c(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iM15165c;
        }
        return new ap3(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ap3.class != obj.getClass()) {
            return false;
        }
        ap3 ap3Var = (ap3) obj;
        return Arrays.equals(this.f7321a, ap3Var.f7321a) && Arrays.equals(this.f7322b, ap3Var.f7322b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7322b) + (Arrays.hashCode(this.f7321a) * 31);
    }
}
