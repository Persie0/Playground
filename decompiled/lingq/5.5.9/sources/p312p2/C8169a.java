package p312p2;

import android.graphics.Color;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8169a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<double[]> f44300a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m16209a(int i10, int i11, int i12, float[] fArr) {
        float f3;
        float fAbs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float fMax = Math.max(f10, Math.max(f11, f12));
        float fMin = Math.min(f10, Math.min(f11, f12));
        float f13 = fMax - fMin;
        float f14 = (fMax + fMin) / 2.0f;
        float fMin2 = 0.0f;
        if (fMax == fMin) {
            f3 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f10) {
                f3 = ((f11 - f12) / f13) % 6.0f;
            } else {
                f3 = fMax == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            }
            fAbs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f3 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        if (f14 >= 0.0f) {
            fMin2 = Math.min(f14, 1.0f);
        }
        fArr[2] = fMin2;
    }

    /* JADX INFO: renamed from: b */
    public static int m16210b(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double dPow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double dPow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m16211c(float f3, int i10, int i11) {
        float f10 = 1.0f - f3;
        return Color.argb((int) ((Color.alpha(i11) * f3) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f3) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f3) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f3) + (Color.blue(i10) * f10)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static double m16212d(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = m16215g(i10, i11);
        }
        double dM16213e = m16213e(i10) + 0.05d;
        double dM16213e2 = m16213e(i11) + 0.05d;
        return Math.max(dM16213e, dM16213e2) / Math.min(dM16213e, dM16213e2);
    }

    /* JADX INFO: renamed from: e */
    public static double m16213e(int i10) {
        ThreadLocal<double[]> threadLocal = f44300a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static int m16214f(float f3, int i10, int i11) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d10 = f3;
        if (m16212d(m16216h(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (m16212d(m16216h(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: g */
    public static int m16215g(int i10, int i11) {
        int i12;
        int i13;
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i14 = 255 - iAlpha2;
        int i15 = 255 - (((255 - iAlpha) * i14) / 255);
        int iRed = Color.red(i10);
        int iRed2 = Color.red(i11);
        int i16 = 0;
        if (i15 == 0) {
            i12 = 0;
        } else {
            i12 = (((iRed2 * iAlpha) * i14) + ((iRed * 255) * iAlpha2)) / (i15 * 255);
        }
        int iGreen = Color.green(i10);
        int iGreen2 = Color.green(i11);
        if (i15 == 0) {
            i13 = 0;
        } else {
            i13 = (((iGreen2 * iAlpha) * i14) + ((iGreen * 255) * iAlpha2)) / (i15 * 255);
        }
        int iBlue = Color.blue(i10);
        int iBlue2 = Color.blue(i11);
        if (i15 != 0) {
            i16 = (((iBlue2 * iAlpha) * i14) + ((iBlue * 255) * iAlpha2)) / (i15 * 255);
        }
        return Color.argb(i15, i12, i13, i16);
    }

    /* JADX INFO: renamed from: h */
    public static int m16216h(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
