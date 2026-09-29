package p378s3;

import android.view.animation.Interpolator;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: s3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC8955d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f46921a;

    /* JADX INFO: renamed from: b */
    public final float f46922b;

    public AbstractInterpolatorC8955d(float[] fArr) {
        this.f46921a = fArr;
        this.f46922b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f46921a;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f10 = this.f46922b;
        float f11 = (f3 - (iMin * f10)) / f10;
        float f12 = fArr[iMin];
        return C0204c.m845d(fArr[iMin + 1], f12, f11, f12);
    }
}
