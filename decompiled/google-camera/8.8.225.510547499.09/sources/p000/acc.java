package p000;

import android.graphics.Color;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class acc {

    /* JADX INFO: renamed from: a */
    public final float f70a;

    /* JADX INFO: renamed from: b */
    public final float f71b;

    /* JADX INFO: renamed from: c */
    public final float f72c;

    /* JADX INFO: renamed from: d */
    public final float f73d;

    /* JADX INFO: renamed from: e */
    public final float f74e;

    /* JADX INFO: renamed from: f */
    public final float f75f;

    public acc(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f70a = f;
        this.f71b = f2;
        this.f72c = f3;
        this.f73d = f4;
        this.f74e = f5;
        this.f75f = f6;
    }

    /* JADX INFO: renamed from: b */
    static acc m178b(int i) {
        float f;
        aco acoVar = aco.f91a;
        float fM181a = acd.m181a(Color.red(i));
        float fM181a2 = acd.m181a(Color.green(i));
        float fM181a3 = acd.m181a(Color.blue(i));
        float[][] fArr = acd.f79d;
        float[] fArr2 = fArr[0];
        float f2 = fArr2[0] * fM181a;
        float f3 = fArr2[1] * fM181a2;
        float f4 = fArr2[2] * fM181a3;
        float[] fArr3 = fArr[1];
        float f5 = fArr3[0] * fM181a;
        float f6 = fArr3[1] * fM181a2;
        float f7 = fArr3[2] * fM181a3;
        float[] fArr4 = fArr[2];
        float[] fArr5 = {f2 + f3 + f4, f5 + f6 + f7, (fM181a * fArr4[0]) + (fM181a2 * fArr4[1]) + (fM181a3 * fArr4[2])};
        float[][] fArr6 = acd.f76a;
        float f8 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f9 = fArr7[0] * f8;
        float f10 = fArr5[1];
        float f11 = fArr7[1] * f10;
        float f12 = fArr5[2];
        float f13 = fArr7[2] * f12;
        float[] fArr8 = fArr6[1];
        float f14 = fArr8[0] * f8;
        float f15 = fArr8[1] * f10;
        float f16 = fArr8[2] * f12;
        float[] fArr9 = fArr6[2];
        float f17 = f8 * fArr9[0];
        float f18 = f10 * fArr9[1];
        float f19 = f12 * fArr9[2];
        float[] fArr10 = acoVar.f97g;
        float f20 = fArr10[0] * (f9 + f11 + f13);
        float f21 = fArr10[1] * (f14 + f15 + f16);
        float f22 = fArr10[2] * (f17 + f18 + f19);
        double dAbs = acoVar.f98h * Math.abs(f20);
        Double.isNaN(dAbs);
        float fPow = (float) Math.pow(dAbs / 100.0d, 0.42d);
        double dAbs2 = acoVar.f98h * Math.abs(f21);
        Double.isNaN(dAbs2);
        float fPow2 = (float) Math.pow(dAbs2 / 100.0d, 0.42d);
        double dAbs3 = acoVar.f98h * Math.abs(f22);
        Double.isNaN(dAbs3);
        float fPow3 = (float) Math.pow(dAbs3 / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f20) * 400.0f) * fPow) / (fPow + 27.13f);
        double d = fSignum;
        float fSignum2 = ((Math.signum(f21) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        double d2 = fSignum2;
        double d3 = fSignum + fSignum2;
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        Double.isNaN(d);
        Double.isNaN(d2);
        double d4 = fSignum3;
        Double.isNaN(d4);
        Double.isNaN(d4);
        Double.isNaN(d3);
        Double.isNaN(d4);
        float f23 = ((float) (d3 - (d4 + d4))) / 9.0f;
        float f24 = ((float) (((d * 11.0d) + (d2 * (-12.0d))) + d4)) / 11.0f;
        float fAtan2 = (((float) Math.atan2(f23, f24)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            f = fAtan2 + 360.0f;
        } else {
            if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            f = fAtan2;
        }
        float f25 = fSignum2 * 20.0f;
        float f26 = (3.1415927f * f) / 180.0f;
        float f27 = (((((40.0f * fSignum) + f25) + fSignum3) / 20.0f) * acoVar.f93c) / acoVar.f92b;
        float f28 = acoVar.f95e;
        float fPow4 = (float) Math.pow(f27, acoVar.f100j * 0.69f);
        float f29 = acoVar.f95e;
        float f30 = fPow4 * 100.0f;
        Math.sqrt(f30 / 100.0f);
        float f31 = acoVar.f92b;
        float f32 = acoVar.f99i;
        float f33 = (((fSignum * 20.0f) + f25) + (fSignum3 * 21.0f)) / 20.0f;
        double d5 = ((double) f) < 20.14d ? 360.0f + f : f;
        Double.isNaN(d5);
        float fCos = ((float) (Math.cos(((d5 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f * 3846.1538f * acoVar.f94d;
        float fSqrt = (float) Math.sqrt((f24 * f24) + (f23 * f23));
        float fPow5 = (float) Math.pow(1.64d - Math.pow(0.29d, acoVar.f96f), 0.73d);
        float fPow6 = (float) Math.pow((fCos * fSqrt) / (f33 + 0.305f), 0.9d);
        double d6 = f30;
        Double.isNaN(d6);
        float f34 = fPow5 * fPow6;
        float fSqrt2 = f34 * ((float) Math.sqrt(d6 / 100.0d));
        float f35 = acoVar.f99i * fSqrt2;
        float f36 = acoVar.f95e;
        Math.sqrt((f34 * 0.69f) / (acoVar.f92b + 4.0f));
        float fLog = (float) Math.log((f35 * 0.0228f) + 1.0f);
        double d7 = f26;
        float f37 = fLog * 43.85965f;
        return new acc(f, fSqrt2, f30, (1.7f * f30) / ((0.007f * f30) + 1.0f), f37 * ((float) Math.cos(d7)), f37 * ((float) Math.sin(d7)));
    }

    /* JADX INFO: renamed from: c */
    public static acc m179c(float f, float f2, float f3) {
        aco acoVar = aco.f91a;
        float f4 = acoVar.f95e;
        double d = f;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        Math.sqrt(d2);
        float f5 = acoVar.f92b;
        float f6 = acoVar.f99i * f2;
        float fSqrt = (float) Math.sqrt(d2);
        float f7 = acoVar.f95e;
        Math.sqrt(((f2 / fSqrt) * 0.69f) / (acoVar.f92b + 4.0f));
        double d3 = f6;
        Double.isNaN(d3);
        double d4 = (3.1415927f * f3) / 180.0f;
        float fLog = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        return new acc(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* JADX INFO: renamed from: a */
    final int m180a(aco acoVar) {
        float f = this.f71b;
        float fSqrt = 0.0f;
        if (f != 0.0d) {
            double d = this.f72c;
            if (d != 0.0d) {
                Double.isNaN(d);
                fSqrt = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        double d2 = fSqrt;
        double dPow = Math.pow(1.64d - Math.pow(0.29d, acoVar.f96f), 0.73d);
        Double.isNaN(d2);
        float fPow = (float) Math.pow(d2 / dPow, 1.1111111111111112d);
        double d3 = (this.f70a * 3.1415927f) / 180.0f;
        Double.isNaN(d3);
        double dCos = Math.cos(2.0d + d3) + 3.8d;
        float f2 = acoVar.f92b;
        double d4 = this.f72c;
        Double.isNaN(d4);
        float f3 = acoVar.f95e;
        double d5 = acoVar.f100j;
        Double.isNaN(d5);
        float fPow2 = f2 * ((float) Math.pow(d4 / 100.0d, 1.4492753673265821d / d5));
        float f4 = ((float) dCos) * 0.25f * 3846.1538f * acoVar.f94d;
        float f5 = fPow2 / acoVar.f93c;
        float fSin = (float) Math.sin(d3);
        float fCos = (float) Math.cos(d3);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((f4 * 23.0f) + ((11.0f * fPow) * fCos)) + ((108.0f * fPow) * fSin));
        float f7 = fCos * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        double dAbs = Math.abs(f10);
        double dAbs2 = Math.abs(f10);
        Double.isNaN(dAbs);
        Double.isNaN(dAbs2);
        float fMax = (float) Math.max(0.0d, (dAbs * 27.13d) / (400.0d - dAbs2));
        float fSignum = Math.signum(f10) * (100.0f / acoVar.f98h);
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        double dAbs3 = Math.abs(f11);
        double dAbs4 = Math.abs(f11);
        Double.isNaN(dAbs3);
        Double.isNaN(dAbs4);
        float fMax2 = (float) Math.max(0.0d, (dAbs3 * 27.13d) / (400.0d - dAbs4));
        float fSignum2 = Math.signum(f11) * (100.0f / acoVar.f98h);
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        double dAbs5 = Math.abs(f12);
        float fAbs = Math.abs(f12);
        Double.isNaN(dAbs5);
        float f13 = fSignum * fPow3;
        double d6 = fAbs;
        Double.isNaN(d6);
        float fMax3 = (float) Math.max(0.0d, (dAbs5 * 27.13d) / (400.0d - d6));
        float fSignum3 = Math.signum(f12) * (100.0f / acoVar.f98h);
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = acoVar.f97g;
        float f14 = f13 / fArr[0];
        float f15 = (fSignum2 * fPow4) / fArr[1];
        float f16 = (fSignum3 * fPow5) / fArr[2];
        float[][] fArr2 = acd.f77b;
        float[] fArr3 = fArr2[0];
        float f17 = fArr3[0] * f14;
        float f18 = fArr3[1] * f15;
        float f19 = fArr3[2] * f16;
        float[] fArr4 = fArr2[1];
        float f20 = fArr4[0] * f14;
        float f21 = fArr4[1] * f15;
        float f22 = fArr4[2] * f16;
        float[] fArr5 = fArr2[2];
        return acp.m210b(f17 + f18 + f19, f20 + f21 + f22, (f14 * fArr5[0]) + (f15 * fArr5[1]) + (f16 * fArr5[2]));
    }
}
