package p000;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class qm2 {

    /* JADX INFO: renamed from: a */
    public float f57938a;

    /* JADX INFO: renamed from: b */
    public float f57939b;

    /* JADX INFO: renamed from: c */
    public float f57940c;

    /* JADX INFO: renamed from: d */
    public int f57941d;

    /* JADX INFO: renamed from: e */
    public float[] f57942e = null;

    public qm2(qm2 qm2Var) {
        this.f57938a = 0.0f;
        this.f57939b = 0.0f;
        this.f57940c = 0.0f;
        this.f57941d = 0;
        this.f57938a = qm2Var.f57938a;
        this.f57939b = qm2Var.f57939b;
        this.f57940c = qm2Var.f57940c;
        this.f57941d = qm2Var.f57941d;
    }

    /* JADX INFO: renamed from: a */
    public final void m20023a(int i, yk4 yk4Var) {
        int iAlpha = Color.alpha(this.f57941d);
        int iM11422c = f06.m11422c(i);
        Matrix matrix = fna.f39347a;
        int i2 = (int) ((((iAlpha / 255.0f) * iM11422c) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            yk4Var.clearShadowLayer();
        } else {
            yk4Var.setShadowLayer(Math.max(this.f57938a, Float.MIN_VALUE), this.f57939b, this.f57940c, Color.argb(i2, Color.red(this.f57941d), Color.green(this.f57941d), Color.blue(this.f57941d)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20024b(int i) {
        this.f57941d = Color.argb(Math.round((f06.m11422c(i) * Color.alpha(this.f57941d)) / 255.0f), Color.red(this.f57941d), Color.green(this.f57941d), Color.blue(this.f57941d));
    }

    /* JADX INFO: renamed from: c */
    public final void m20025c(Matrix matrix) {
        if (this.f57942e == null) {
            this.f57942e = new float[2];
        }
        float[] fArr = this.f57942e;
        fArr[0] = this.f57939b;
        fArr[1] = this.f57940c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f57942e;
        this.f57939b = fArr2[0];
        this.f57940c = fArr2[1];
        this.f57938a = matrix.mapRadius(this.f57938a);
    }
}
