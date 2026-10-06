package p000;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahy implements Interpolator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f395a;

    public ahy(int i) {
        this.f395a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        switch (this.f395a) {
            case 0:
            case 1:
            case 2:
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                return Math.abs(f2);
        }
    }
}
