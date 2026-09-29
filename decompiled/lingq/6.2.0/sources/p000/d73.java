package p000;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final class d73 implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public float[] f35076a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.f35076a;
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = AbstractC3393o1.m17726a(fArr2[i], f2, f, f2);
        }
        return fArr3;
    }
}
