package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdv {

    /* JADX INFO: renamed from: a */
    public final float[] f21494a;

    /* JADX INFO: renamed from: b */
    public final float f21495b;

    /* JADX INFO: renamed from: c */
    public long f21496c = -1;

    /* JADX INFO: renamed from: d */
    public long f21497d = -1;

    /* JADX INFO: renamed from: e */
    public int f21498e = 0;

    /* JADX INFO: renamed from: f */
    public int f21499f = 0;

    public fdv(float[] fArr, float f) {
        lku.m15670x(true, "layFlatDirection must be 3-dimensional");
        float fSqrt = (float) Math.sqrt(m8285a(fArr, fArr));
        lku.m15670x(fSqrt > 0.0f, "layFlatDirection must be non-zero");
        float f2 = 1.0f / fSqrt;
        fArr[0] = fArr[0] * f2;
        fArr[1] = fArr[1] * f2;
        fArr[2] = fArr[2] * f2;
        this.f21494a = fArr;
        this.f21495b = f;
    }

    /* JADX INFO: renamed from: a */
    public static float m8285a(float[] fArr, float[] fArr2) {
        return (fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]);
    }
}
