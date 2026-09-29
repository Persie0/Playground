package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5b {

    /* JADX INFO: renamed from: a */
    public final int f49098a;

    /* JADX INFO: renamed from: b */
    public float f49099b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f49100c;

    /* JADX INFO: renamed from: d */
    public final long f49101d;

    public l5b(int i, Interpolator interpolator, long j) {
        this.f49098a = i;
        this.f49100c = interpolator;
        this.f49101d = j;
    }

    /* JADX INFO: renamed from: a */
    public float mo14856a() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public long mo14857b() {
        return this.f49101d;
    }

    /* JADX INFO: renamed from: c */
    public float mo14858c() {
        float f = this.f49099b;
        Interpolator interpolator = this.f49100c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: d */
    public int mo14859d() {
        return this.f49098a;
    }

    /* JADX INFO: renamed from: e */
    public void mo14860e(float f) {
        this.f49099b = f;
    }
}
