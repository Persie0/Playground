package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: eu */
/* JADX INFO: loaded from: classes.dex */
public final class C2977eu {

    /* JADX INFO: renamed from: a */
    public final float f37835a;

    /* JADX INFO: renamed from: b */
    public final float f37836b;

    /* JADX INFO: renamed from: c */
    public final float f37837c;

    /* JADX INFO: renamed from: d */
    public final float f37838d;

    /* JADX INFO: renamed from: e */
    public final float f37839e;

    /* JADX INFO: renamed from: f */
    public final float f37840f;

    /* JADX INFO: renamed from: g */
    public final float f37841g;

    /* JADX INFO: renamed from: h */
    public float f37842h;

    /* JADX INFO: renamed from: i */
    public float f37843i;

    /* JADX INFO: renamed from: j */
    public final float[] f37844j;

    /* JADX INFO: renamed from: k */
    public final float f37845k;

    /* JADX INFO: renamed from: l */
    public final float f37846l;

    /* JADX INFO: renamed from: m */
    public final float f37847m;

    /* JADX INFO: renamed from: n */
    public final float f37848n;

    /* JADX INFO: renamed from: o */
    public final float f37849o;

    /* JADX INFO: renamed from: p */
    public final boolean f37850p;

    /* JADX INFO: renamed from: q */
    public final float f37851q;

    /* JADX INFO: renamed from: r */
    public final float f37852r;

    public C2977eu(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.f37835a = f;
        this.f37836b = f2;
        this.f37837c = f3;
        this.f37838d = f4;
        this.f37839e = f5;
        this.f37840f = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.f37847m = f11;
        float f12 = 1.0f / (f2 - f);
        this.f37845k = f12;
        float[] fArr = new float[101];
        this.f37844j = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f37841g = fHypot;
            this.f37846l = fHypot * f12;
            this.f37851q = f8 * f12;
            this.f37852r = f9 * f12;
            this.f37848n = Float.NaN;
            this.f37849o = Float.NaN;
            z = true;
        } else {
            this.f37848n = f8 * f11;
            this.f37849o = f9 * (-f11);
            this.f37851q = z2 ? f5 : f3;
            this.f37852r = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC3352my.f52015b;
            float f15 = f14;
            float fHypot2 = 0.0f;
            float f16 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f13;
                float fCos = ((float) Math.cos(d)) * f14;
                f7 = f10;
                fHypot2 += (float) Math.hypot(fSin - f16, fCos - f15);
                fArr2[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f16 = fSin;
                f15 = fCos;
                i3 = i2;
                f10 = f7;
            }
            this.f37841g = fHypot2;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f17 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f17);
                if (iBinarySearch >= 0) {
                    fArr[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i6] = f7;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f18 = i8;
                    float f19 = fArr2[i8];
                    fArr[i6] = (((f17 - f19) / (fArr2[i7 - i2] - f19)) + f18) / 90.0f;
                }
            }
            this.f37846l = this.f37841g * this.f37845k;
            z = z3;
        }
        this.f37850p = z;
    }

    /* JADX INFO: renamed from: a */
    public final float m11336a() {
        float f = this.f37848n * this.f37843i;
        return f * this.f37847m * (this.f37846l / ((float) Math.hypot(f, (-this.f37849o) * this.f37842h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m11337b() {
        float f = this.f37848n * this.f37843i;
        float f2 = (-this.f37849o) * this.f37842h;
        return f2 * this.f37847m * (this.f37846l / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: c */
    public final void m11338c(float f) {
        float f2 = (this.f37847m == -1.0f ? this.f37836b - f : f - this.f37835a) * this.f37845k;
        float fM17726a = 0.0f;
        if (f2 > 0.0f) {
            fM17726a = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.f37844j;
                float f4 = fArr[i];
                fM17726a = AbstractC3393o1.m17726a(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fM17726a * 1.5707964f;
        this.f37842h = (float) Math.sin(d);
        this.f37843i = (float) Math.cos(d);
    }
}
