package p000;

import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iya extends DecelerateInterpolator {

    /* JADX INFO: renamed from: a */
    public final float f32631a;

    /* JADX INFO: renamed from: b */
    public float f32632b;

    public iya(float f) {
        super(0.5f * f);
        this.f32632b = 0.0f;
        this.f32631a = f;
    }

    @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        this.f32632b = f;
        return super.getInterpolation(f);
    }
}
