package p000;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cm2 {

    /* JADX INFO: renamed from: a */
    public final float[] f10263a;

    /* JADX INFO: renamed from: b */
    public final float[] f10264b;

    /* JADX INFO: renamed from: c */
    public final Matrix f10265c;

    public cm2(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.f10263a = fArr3;
        float[] fArr4 = new float[2];
        this.f10264b = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.f10265c = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    public final void m4850a(float f) {
        float[] fArr = this.f10264b;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f10263a;
        double d = f;
        double d2 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d2) * d) + ((double) fArr2[0]));
        fArr2[1] = (float) ((Math.sin(d2) * d) + ((double) fArr2[1]));
    }

    /* JADX INFO: renamed from: b */
    public final void m4851b() {
        Arrays.fill(this.f10263a, 0.0f);
        float[] fArr = this.f10264b;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.f10265c.reset();
    }

    /* JADX INFO: renamed from: c */
    public final void m4852c(float f) {
        Matrix matrix = this.f10265c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.f10263a);
        matrix.mapPoints(this.f10264b);
    }

    /* JADX INFO: renamed from: d */
    public final void m4853d(float f) {
        float[] fArr = this.f10263a;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f;
        float[] fArr2 = this.f10264b;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f;
    }

    /* JADX INFO: renamed from: e */
    public final void m4854e(float f) {
        float[] fArr = this.f10263a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public cm2() {
        this.f10263a = new float[2];
        this.f10264b = new float[]{1.0f, 0.0f};
        this.f10265c = new Matrix();
    }
}
