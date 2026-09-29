package p286o2;

import ae.C0062b;

/* JADX INFO: renamed from: o2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7912l {

    /* JADX INFO: renamed from: k */
    public static final C7912l f43072k;

    /* JADX INFO: renamed from: a */
    public final float f43073a;

    /* JADX INFO: renamed from: b */
    public final float f43074b;

    /* JADX INFO: renamed from: c */
    public final float f43075c;

    /* JADX INFO: renamed from: d */
    public final float f43076d;

    /* JADX INFO: renamed from: e */
    public final float f43077e;

    /* JADX INFO: renamed from: f */
    public final float f43078f;

    /* JADX INFO: renamed from: g */
    public final float[] f43079g;

    /* JADX INFO: renamed from: h */
    public final float f43080h;

    /* JADX INFO: renamed from: i */
    public final float f43081i;

    /* JADX INFO: renamed from: j */
    public final float f43082j;

    static {
        float f3;
        float f10;
        float[] fArr = C0062b.f150L;
        float fM251B2 = (float) ((((double) C0062b.m251B2()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C0062b.f148J;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f3 = 0.100000046f;
            f10 = 0.59f;
        } else {
            f3 = 0.12999998f;
            f10 = 0.525f;
        }
        float f19 = f3 + f10;
        float fExp = (1.0f - (((float) Math.exp(((-fM251B2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp};
        float f20 = 1.0f / ((5.0f * fM251B2) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float fCbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) fM251B2) * 5.0d))) + (f21 * fM251B2);
        float fM251B3 = C0062b.m251B2() / fArr[1];
        double d11 = fM251B3;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f18)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f17)) / 100.0d, 0.42d), fPow2};
        float f23 = fArr7[0];
        float f24 = fArr7[1];
        f43072k = new C7912l(fM251B3, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f23 * 400.0f) / (f23 + 27.13f)) * 2.0f) + ((f24 * 400.0f) / (f24 + 27.13f))) * fPow, fPow, fPow, f19, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C7912l(float f3, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f43078f = f3;
        this.f43073a = f10;
        this.f43074b = f11;
        this.f43075c = f12;
        this.f43076d = f13;
        this.f43077e = f14;
        this.f43079g = fArr;
        this.f43080h = f15;
        this.f43081i = f16;
        this.f43082j = f17;
    }
}
