package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class uaa implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final float[] f63654a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f63655b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f63656c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = this.f63654a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f63655b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = AbstractC3393o1.m17726a(f2, f3, f, f3);
        }
        Matrix matrix = this.f63656c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
