package p406u4;

import android.animation.TypeEvaluator;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: u4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9424n implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a */
    public final float[] f48371a;

    public C9424n(float[] fArr) {
        this.f48371a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f3, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f48371a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i10 = 0; i10 < fArr5.length; i10++) {
            float f10 = fArr3[i10];
            fArr5[i10] = C0204c.m845d(fArr4[i10], f10, f3, f10);
        }
        return fArr5;
    }
}
