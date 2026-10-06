package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aco {

    /* JADX INFO: renamed from: a */
    static final aco f91a;

    /* JADX INFO: renamed from: b */
    public final float f92b;

    /* JADX INFO: renamed from: c */
    public final float f93c;

    /* JADX INFO: renamed from: d */
    public final float f94d;

    /* JADX INFO: renamed from: e */
    public final float f95e = 0.69f;

    /* JADX INFO: renamed from: f */
    public final float f96f;

    /* JADX INFO: renamed from: g */
    public final float[] f97g;

    /* JADX INFO: renamed from: h */
    public final float f98h;

    /* JADX INFO: renamed from: i */
    public final float f99i;

    /* JADX INFO: renamed from: j */
    public final float f100j;

    static {
        float[] fArr = acd.f78c;
        double dM183c = acd.m183c();
        float[][] fArr2 = acd.f76a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = fArr3[2] * f5;
        float[] fArr4 = fArr2[1];
        float f7 = fArr4[0] * f;
        float f8 = fArr4[1] * f3;
        float f9 = fArr4[2] * f5;
        float[] fArr5 = fArr2[2];
        float f10 = f * fArr5[0];
        float f11 = f3 * fArr5[1];
        float f12 = f5 * fArr5[2];
        Double.isNaN(dM183c);
        float f13 = (float) ((dM183c * 63.66197723675813d) / 100.0d);
        float fExp = 1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float f14 = f10 + f11 + f12;
        float f15 = f7 + f8 + f9;
        float f16 = f2 + f4 + f6;
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp};
        float f17 = 1.0f / ((5.0f * f13) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float f20 = f18 * f13;
        double d2 = f13;
        Double.isNaN(d2);
        float fCbrt = (float) Math.cbrt(d2 * 5.0d);
        float fM183c = acd.m183c() / fArr[1];
        double d3 = fM183c;
        float fSqrt = (float) Math.sqrt(d3);
        float fPow = (float) Math.pow(d3, 0.2d);
        float f21 = f20 + (0.1f * f19 * f19 * fCbrt);
        double d4 = fArr6[0] * f21 * f16;
        Double.isNaN(d4);
        double d5 = fArr6[1] * f21 * f15;
        Double.isNaN(d5);
        double d6 = fArr6[2] * f21 * f14;
        Double.isNaN(d6);
        float fPow2 = (float) Math.pow(d6 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), fPow2};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = (400.0f * fPow2) / (fPow2 + 27.13f);
        float[] fArr8 = {f23, f25, f26};
        float f27 = 0.725f / fPow;
        f91a = new aco(fM183c, (f23 + f23 + f25 + (f26 * 0.05f)) * f27, f27, f27, fArr6, f21, (float) Math.pow(f21, 0.25d), fSqrt + 1.48f);
    }

    private aco(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.f96f = f;
        this.f92b = f2;
        this.f93c = f3;
        this.f94d = f4;
        this.f97g = fArr;
        this.f98h = f5;
        this.f99i = f6;
        this.f100j = f7;
    }
}
