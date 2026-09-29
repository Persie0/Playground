package p406u4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: u4.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9423m0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f48365a;

    /* JADX INFO: renamed from: b */
    public static final boolean f48366b;

    /* JADX INFO: renamed from: c */
    public static final boolean f48367c;

    /* JADX INFO: renamed from: u4.m0$a */
    public static class a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a */
        public final float[] f48368a = new float[9];

        /* JADX INFO: renamed from: b */
        public final float[] f48369b = new float[9];

        /* JADX INFO: renamed from: c */
        public final Matrix f48370c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f3, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f48368a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f48369b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f10 = fArr2[i10];
                float f11 = fArr[i10];
                fArr2[i10] = C0204c.m845d(f10, f11, f3, f11);
            }
            Matrix matrix3 = this.f48370c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f48365a = true;
        f48366b = true;
        f48367c = i10 >= 28;
    }
}
