package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fr6 extends sa1 {

    /* JADX INFO: renamed from: d */
    public static final float[] f39525d;

    /* JADX INFO: renamed from: e */
    public static final float[] f39526e;

    /* JADX INFO: renamed from: f */
    public static final float[] f39527f;

    /* JADX INFO: renamed from: g */
    public static final float[] f39528g;

    static {
        float[] fArrM24368y = x74.m24368y(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, x74.m24353j(C3400o8.f53963c.f53965b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f39525d = fArrM24368y;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f39526e = fArr;
        f39527f = x74.m24365v(fArrM24368y);
        f39528g = x74.m24365v(fArr);
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: a */
    public final float mo1400a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: b */
    public final float mo1401b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: d */
    public final long mo1403d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f39528g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f39527f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: e */
    public final float mo1404e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f39528g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f39527f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: f */
    public final long mo1405f(float f, float f2, float f3, float f4, sa1 sa1Var) {
        float[] fArr = f39525d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM18274q = AbstractC3423or.m18274q(f5);
        float fM18274q2 = AbstractC3423or.m18274q(f6);
        float fM18274q3 = AbstractC3423or.m18274q(f7);
        float[] fArr2 = f39526e;
        return d32.m10033d((fArr2[6] * fM18274q3) + (fArr2[3] * fM18274q2) + (fArr2[0] * fM18274q), (fArr2[7] * fM18274q3) + (fArr2[4] * fM18274q2) + (fArr2[1] * fM18274q), (fArr2[8] * fM18274q3) + (fArr2[5] * fM18274q2) + (fArr2[2] * fM18274q), f4, sa1Var);
    }
}
