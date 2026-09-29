package p000;

/* JADX INFO: renamed from: sv */
/* JADX INFO: loaded from: classes.dex */
public final class C3588sv implements h73 {

    /* JADX INFO: renamed from: a */
    public float f61450a;

    /* JADX INFO: renamed from: b */
    public float f61451b;

    /* JADX INFO: renamed from: a */
    public y63 m21747a(float f) {
        double dM21748b = m21748b(f);
        double d = z63.f70984a;
        double d2 = d - 1.0d;
        return new y63(f, (float) (Math.exp((d / d2) * dM21748b) * ((double) (this.f61450a * this.f61451b))), (long) (Math.exp(dM21748b / d2) * 1000.0d));
    }

    /* JADX INFO: renamed from: b */
    public double m21748b(float f) {
        float[] fArr = AbstractC2965ei.f37273a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f61450a * this.f61451b)));
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: g */
    public float mo13109g() {
        return this.f61450a;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: h */
    public float mo13110h(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f61451b));
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: i */
    public float mo13111i(float f, float f2, long j) {
        float f3 = this.f61451b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: m */
    public long mo13112m(float f) {
        return ((long) ((((float) Math.log(this.f61450a / Math.abs(f))) * 1000.0f) / this.f61451b)) * 1000000;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: p */
    public float mo13113p(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.f61450a;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.f61451b;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }
}
