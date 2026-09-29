package p481xc;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: xc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10166a implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: a */
    public final FloatEvaluator f51469a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f3, Float f10, Float f11) {
        float fFloatValue = this.f51469a.evaluate(f3, (Number) f10, (Number) f11).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
