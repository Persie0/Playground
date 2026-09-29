package p286o2;

import ae.C0062b;
import android.graphics.Color;
import p312p2.C8169a;

/* JADX INFO: renamed from: o2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7901a {

    /* JADX INFO: renamed from: a */
    public final float f43033a;

    /* JADX INFO: renamed from: b */
    public final float f43034b;

    /* JADX INFO: renamed from: c */
    public final float f43035c;

    /* JADX INFO: renamed from: d */
    public final float f43036d;

    /* JADX INFO: renamed from: e */
    public final float f43037e;

    /* JADX INFO: renamed from: f */
    public final float f43038f;

    public C7901a(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f43033a = f3;
        this.f43034b = f10;
        this.f43035c = f11;
        this.f43036d = f12;
        this.f43037e = f13;
        this.f43038f = f14;
    }

    /* JADX INFO: renamed from: a */
    public static C7901a m15663a(int i10) {
        C7912l c7912l = C7912l.f43072k;
        float fM258D1 = C0062b.m258D1(Color.red(i10));
        float fM258D2 = C0062b.m258D1(Color.green(i10));
        float fM258D3 = C0062b.m258D1(Color.blue(i10));
        float[][] fArr = C0062b.f151M;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * fM258D3) + (fArr2[1] * fM258D2) + (fArr2[0] * fM258D1);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * fM258D3) + (fArr3[1] * fM258D2) + (fArr3[0] * fM258D1);
        float[] fArr4 = fArr[2];
        float f11 = (fM258D3 * fArr4[2]) + (fM258D2 * fArr4[1]) + (fM258D1 * fArr4[0]);
        float[][] fArr5 = C0062b.f148J;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = c7912l.f43079g;
        float f15 = fArr9[0] * f12;
        float f16 = fArr9[1] * f13;
        float f17 = fArr9[2] * f14;
        float fAbs = Math.abs(f15);
        float f18 = c7912l.f43080h;
        float fPow = (float) Math.pow(((double) (fAbs * f18)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f16) * f18)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f17) * f18)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f19 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f20 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f21)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = fAtan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float f26 = f23 * c7912l.f43074b;
        float f27 = c7912l.f43073a;
        double d11 = f26 / f27;
        float f28 = c7912l.f43082j;
        float f29 = c7912l.f43076d;
        float fPow4 = ((float) Math.pow(d11, f28 * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f27 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c7912l.f43078f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f24) < 20.14d ? 360.0f + f24 : f24)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c7912l.f43077e) * c7912l.f43075c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f31 = c7912l.f43081i * fSqrt;
        Math.sqrt((fPow5 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d12 = f25;
        return new C7901a(f24, fSqrt, fPow4, f32, fLog * ((float) Math.cos(d12)), fLog * ((float) Math.sin(d12)));
    }

    /* JADX INFO: renamed from: b */
    public static C7901a m15664b(float f3, float f10, float f11) {
        C7912l c7912l = C7912l.f43072k;
        float f12 = c7912l.f43076d;
        double d10 = ((double) f3) / 100.0d;
        Math.sqrt(d10);
        float f13 = c7912l.f43073a + 4.0f;
        float f14 = c7912l.f43081i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(d10))) * c7912l.f43076d) / f13);
        float f15 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) f14) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f11) / 180.0f;
        return new C7901a(f11, f10, f3, f15, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m15665c(C7912l c7912l) {
        float fSqrt;
        float f3 = this.f43034b;
        double d10 = f3;
        float f10 = this.f43035c;
        if (d10 != 0.0d) {
            double d11 = f10;
            if (d11 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f3 / ((float) Math.sqrt(d11 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c7912l.f43078f), 0.73d), 1.1111111111111112d);
        double d12 = (this.f43033a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
        float fPow2 = c7912l.f43073a * ((float) Math.pow(((double) f10) / 100.0d, (1.0d / ((double) c7912l.f43076d)) / ((double) c7912l.f43082j)));
        float f11 = fCos * 3846.1538f * c7912l.f43077e * c7912l.f43075c;
        float f12 = fPow2 / c7912l.f43074b;
        float fSin = (float) Math.sin(d12);
        float fCos2 = (float) Math.cos(d12);
        float f13 = (((0.305f + f12) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f11 * 23.0f)));
        float f14 = fCos2 * f13;
        float f15 = f13 * fSin;
        float f16 = f12 * 460.0f;
        float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))));
        float fSignum = Math.signum(f17);
        float f20 = 100.0f / c7912l.f43080h;
        float fPow3 = fSignum * f20 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f18) * f20 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f19) * f20 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float[] fArr = c7912l.f43079g;
        float f21 = fPow3 / fArr[0];
        float f22 = fSignum2 / fArr[1];
        float f23 = fSignum3 / fArr[2];
        float[][] fArr2 = C0062b.f149K;
        float[] fArr3 = fArr2[0];
        float f24 = (fArr3[2] * f23) + (fArr3[1] * f22) + (fArr3[0] * f21);
        float[] fArr4 = fArr2[1];
        float f25 = (fArr4[2] * f23) + (fArr4[1] * f22) + (fArr4[0] * f21);
        float[] fArr5 = fArr2[2];
        return C8169a.m16210b(f24, f25, (f23 * fArr5[2]) + (f22 * fArr5[1]) + (f21 * fArr5[0]));
    }
}
