package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mfu implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    private final float[] f40389a = new float[9];

    /* JADX INFO: renamed from: b */
    private final float[] f40390b = new float[9];

    /* JADX INFO: renamed from: c */
    private final Matrix f40391c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f40389a);
        matrix2.getValues(this.f40390b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f40390b;
            float f2 = fArr[i];
            float f3 = this.f40389a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f40391c.setValues(this.f40390b);
        return this.f40391c;
    }
}
