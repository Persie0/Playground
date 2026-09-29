package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class wa4 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66561a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f66561a) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
