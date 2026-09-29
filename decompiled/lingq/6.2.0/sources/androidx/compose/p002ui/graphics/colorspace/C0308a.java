package androidx.compose.p002ui.graphics.colorspace;

import java.util.Arrays;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.aj2;
import p000.d32;
import p000.fa4;
import p000.h9a;
import p000.i4b;
import p000.ij6;
import p000.l70;
import p000.pvc;
import p000.sa1;
import p000.v63;
import p000.va1;
import p000.vi3;
import p000.x74;
import p000.xg8;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0308a extends sa1 {

    /* JADX INFO: renamed from: r */
    public static final ij6 f3940r = new ij6(16);

    /* JADX INFO: renamed from: d */
    public final i4b f3941d;

    /* JADX INFO: renamed from: e */
    public final float f3942e;

    /* JADX INFO: renamed from: f */
    public final float f3943f;

    /* JADX INFO: renamed from: g */
    public final h9a f3944g;

    /* JADX INFO: renamed from: h */
    public final float[] f3945h;

    /* JADX INFO: renamed from: i */
    public final float[] f3946i;

    /* JADX INFO: renamed from: j */
    public final float[] f3947j;

    /* JADX INFO: renamed from: k */
    public final aj2 f3948k;

    /* JADX INFO: renamed from: l */
    public final vi3 f3949l;

    /* JADX INFO: renamed from: m */
    public final xg8 f3950m;

    /* JADX INFO: renamed from: n */
    public final aj2 f3951n;

    /* JADX INFO: renamed from: o */
    public final vi3 f3952o;

    /* JADX INFO: renamed from: p */
    public final xg8 f3953p;

    /* JADX INFO: renamed from: q */
    public final boolean f3954q;

    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0212  */
    /* JADX WARN: Code duplicated, block: B:56:0x021b  */
    /* JADX WARN: Code duplicated, block: B:63:0x022f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0247  */
    /* JADX WARN: Code duplicated, block: B:68:0x0261  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0308a(String str, float[] fArr, i4b i4bVar, float[] fArr2, aj2 aj2Var, aj2 aj2Var2, float f, float f2, h9a h9aVar, int i) {
        int i2;
        float f3;
        float f4;
        boolean z;
        float[] fArr3;
        C0308a c0308a;
        double d;
        int i3;
        super(str, i, 12884901888L);
        this.f3941d = i4bVar;
        this.f3942e = f;
        this.f3943f = f2;
        this.f3944g = h9aVar;
        this.f3948k = aj2Var;
        this.f3949l = new vi3() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                double dDoubleValue = ((Number) obj).doubleValue();
                C0308a c0308a2 = this.f3939b;
                return Double.valueOf(l70.m15943f(c0308a2.f3948k.mo503c(dDoubleValue), c0308a2.f3942e, c0308a2.f3943f));
            }
        };
        this.f3950m = new xg8(this, 0);
        this.f3951n = aj2Var2;
        this.f3952o = new vi3() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                double dDoubleValue = ((Number) obj).doubleValue();
                C0308a c0308a2 = this.f3938b;
                return Double.valueOf(c0308a2.f3951n.mo503c(l70.m15943f(dDoubleValue, c0308a2.f3942e, c0308a2.f3943f)));
            }
        };
        this.f3953p = new xg8(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            C3386nv.m17626m("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            ij6.m13953k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f3945h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = i4bVar.f43526a;
            i2 = 0;
            float f21 = i4bVar.f43527b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.f3946i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                v63.m23130h(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.f3946i = fArr2;
        }
        this.f3947j = x74.m24365v(this.f3946i);
        float fM19516l = pvc.m19516l(fArr4);
        float[] fArr5 = va1.f65096a;
        if (fM19516l / pvc.m19516l(va1.f65097b) > 0.9f) {
            float[] fArr6 = va1.f65096a;
            float f38 = fArr4[i2];
            float f39 = fArr6[i2];
            float f40 = fArr4[1];
            float f41 = fArr6[1];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i2] = f38 - f39;
            fArr7[1] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[i2];
            float f51 = fArr7[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr3 = va1.f65096a;
                if (fArr4 == fArr3) {
                    i3 = i2;
                    while (true) {
                        if (i3 < 6) {
                            if (Float.compare(fArr4[i3], fArr3[i3]) != 0 || Math.abs(fArr4[i3] - fArr3[i3]) <= 0.001f) {
                                i3++;
                            }
                        } else if (x74.m24354k(i4bVar, AbstractC3184kh.f47268j)) {
                            float[] fArr8 = va1.f65096a;
                            c0308a = va1.f65100e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = 1;
                                } else if (Math.abs(aj2Var.mo503c(d) - c0308a.f3948k.mo503c(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (x74.m24354k(i4bVar, AbstractC3184kh.f47268j) && f == f4 && f2 == f3) {
                    float[] fArr9 = va1.f65096a;
                    c0308a = va1.f65100e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = 1;
                        } else if (Math.abs(aj2Var.mo503c(d) - c0308a.f3948k.mo503c(d)) > 0.001d && Math.abs(aj2Var2.mo503c(d) - c0308a.f3951n.mo503c(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = i2;
            } else {
                z = 1;
            }
            this.f3954q = z;
        }
        f4 = 0.0f;
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = va1.f65096a;
            if (fArr4 == fArr3) {
                i3 = i2;
                while (true) {
                    if (i3 < 6) {
                        if (Float.compare(fArr4[i3], fArr3[i3]) != 0) {
                        }
                        i3++;
                    } else if (x74.m24354k(i4bVar, AbstractC3184kh.f47268j)) {
                        float[] fArr10 = va1.f65096a;
                        c0308a = va1.f65100e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = 1;
                            } else if (Math.abs(aj2Var.mo503c(d) - c0308a.f3948k.mo503c(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (x74.m24354k(i4bVar, AbstractC3184kh.f47268j)) {
                float[] fArr11 = va1.f65096a;
                c0308a = va1.f65100e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = 1;
                    } else if (Math.abs(aj2Var.mo503c(d) - c0308a.f3948k.mo503c(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = i2;
        } else {
            z = 1;
        }
        this.f3954q = z;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: a */
    public final float mo1400a(int i) {
        return this.f3943f;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: b */
    public final float mo1401b(int i) {
        return this.f3942e;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: c */
    public final boolean mo1402c() {
        return this.f3954q;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: d */
    public final long mo1403d(float f, float f2, float f3) {
        double d = f;
        xg8 xg8Var = this.f3953p;
        float fMo503c = (float) xg8Var.mo503c(d);
        float fMo503c2 = (float) xg8Var.mo503c(f2);
        float fMo503c3 = (float) xg8Var.mo503c(f3);
        float[] fArr = this.f3946i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo503c3) + ((fArr[3] * fMo503c2) + (fArr[0] * fMo503c)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo503c3) + (fArr[4] * fMo503c2) + (fArr[1] * fMo503c))));
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: e */
    public final float mo1404e(float f, float f2, float f3) {
        double d = f;
        xg8 xg8Var = this.f3953p;
        float fMo503c = (float) xg8Var.mo503c(d);
        float fMo503c2 = (float) xg8Var.mo503c(f2);
        float fMo503c3 = (float) xg8Var.mo503c(f3);
        float[] fArr = this.f3946i;
        return (fArr[8] * fMo503c3) + (fArr[5] * fMo503c2) + (fArr[2] * fMo503c);
    }

    @Override // p000.sa1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0308a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0308a c0308a = (C0308a) obj;
        if (Float.compare(c0308a.f3942e, this.f3942e) != 0 || Float.compare(c0308a.f3943f, this.f3943f) != 0 || !fa4.m11650l(this.f3941d, c0308a.f3941d) || !Arrays.equals(this.f3945h, c0308a.f3945h)) {
            return false;
        }
        h9a h9aVar = c0308a.f3944g;
        h9a h9aVar2 = this.f3944g;
        if (h9aVar2 != null) {
            return fa4.m11650l(h9aVar2, h9aVar);
        }
        if (h9aVar == null) {
            return true;
        }
        if (fa4.m11650l(this.f3948k, c0308a.f3948k)) {
            return fa4.m11650l(this.f3951n, c0308a.f3951n);
        }
        return false;
    }

    @Override // p000.sa1
    /* JADX INFO: renamed from: f */
    public final long mo1405f(float f, float f2, float f3, float f4, sa1 sa1Var) {
        float[] fArr = this.f3947j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        xg8 xg8Var = this.f3950m;
        return d32.m10033d((float) xg8Var.mo503c(f5), (float) xg8Var.mo503c(f6), (float) xg8Var.mo503c(f7), f4, sa1Var);
    }

    @Override // p000.sa1
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f3945h) + ((this.f3941d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f3942e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f3943f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        h9a h9aVar = this.f3944g;
        int iHashCode2 = iFloatToIntBits2 + (h9aVar != null ? h9aVar.hashCode() : 0);
        if (h9aVar != null) {
            return iHashCode2;
        }
        return this.f3951n.hashCode() + ((this.f3948k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public C0308a(String str, float[] fArr, i4b i4bVar, final h9a h9aVar, int i) {
        double d;
        aj2 aj2Var;
        aj2 aj2Var2;
        double d2 = h9aVar.f42053a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = h9aVar.f42059g;
        double d4 = h9aVar.f42058f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            aj2Var = new aj2() { // from class: zg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d5) {
                    int i5 = i4;
                    h9a h9aVar2 = h9aVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = va1.f65096a;
                            return va1.m23208a(h9aVar2, d5);
                        case 1:
                            float[] fArr3 = va1.f65096a;
                            return va1.m23210c(h9aVar2, d5);
                        case 2:
                            double d6 = h9aVar2.f42054b;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                        case 3:
                            double d7 = h9aVar2.f42054b;
                            double d8 = h9aVar2.f42055c;
                            double d9 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                        case 4:
                            float[] fArr4 = va1.f65096a;
                            return va1.m23209b(h9aVar2, d5);
                        case 5:
                            float[] fArr5 = va1.f65096a;
                            return va1.m23211d(h9aVar2, d5);
                        case 6:
                            double d10 = h9aVar2.f42054b;
                            double d11 = h9aVar2.f42055c;
                            double d12 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = h9aVar2.f42054b;
                            double d14 = h9aVar2.f42055c;
                            double d15 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                aj2Var = new aj2() { // from class: zg8
                    @Override // p000.aj2
                    /* JADX INFO: renamed from: c */
                    public final double mo503c(double d5) {
                        int i6 = i5;
                        h9a h9aVar2 = h9aVar;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = va1.f65096a;
                                return va1.m23208a(h9aVar2, d5);
                            case 1:
                                float[] fArr3 = va1.f65096a;
                                return va1.m23210c(h9aVar2, d5);
                            case 2:
                                double d6 = h9aVar2.f42054b;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                            case 3:
                                double d7 = h9aVar2.f42054b;
                                double d8 = h9aVar2.f42055c;
                                double d9 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                            case 4:
                                float[] fArr4 = va1.f65096a;
                                return va1.m23209b(h9aVar2, d5);
                            case 5:
                                float[] fArr5 = va1.f65096a;
                                return va1.m23211d(h9aVar2, d5);
                            case 6:
                                double d10 = h9aVar2.f42054b;
                                double d11 = h9aVar2.f42055c;
                                double d12 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = h9aVar2.f42054b;
                                double d14 = h9aVar2.f42055c;
                                double d15 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                aj2Var = new aj2() { // from class: zg8
                    @Override // p000.aj2
                    /* JADX INFO: renamed from: c */
                    public final double mo503c(double d5) {
                        int i7 = i6;
                        h9a h9aVar2 = h9aVar;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = va1.f65096a;
                                return va1.m23208a(h9aVar2, d5);
                            case 1:
                                float[] fArr3 = va1.f65096a;
                                return va1.m23210c(h9aVar2, d5);
                            case 2:
                                double d6 = h9aVar2.f42054b;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                            case 3:
                                double d7 = h9aVar2.f42054b;
                                double d8 = h9aVar2.f42055c;
                                double d9 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                            case 4:
                                float[] fArr4 = va1.f65096a;
                                return va1.m23209b(h9aVar2, d5);
                            case 5:
                                float[] fArr5 = va1.f65096a;
                                return va1.m23211d(h9aVar2, d5);
                            case 6:
                                double d10 = h9aVar2.f42054b;
                                double d11 = h9aVar2.f42055c;
                                double d12 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = h9aVar2.f42054b;
                                double d14 = h9aVar2.f42055c;
                                double d15 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                aj2Var = new aj2() { // from class: zg8
                    @Override // p000.aj2
                    /* JADX INFO: renamed from: c */
                    public final double mo503c(double d5) {
                        int i8 = i7;
                        h9a h9aVar2 = h9aVar;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = va1.f65096a;
                                return va1.m23208a(h9aVar2, d5);
                            case 1:
                                float[] fArr3 = va1.f65096a;
                                return va1.m23210c(h9aVar2, d5);
                            case 2:
                                double d6 = h9aVar2.f42054b;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                            case 3:
                                double d7 = h9aVar2.f42054b;
                                double d8 = h9aVar2.f42055c;
                                double d9 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                            case 4:
                                float[] fArr4 = va1.f65096a;
                                return va1.m23209b(h9aVar2, d5);
                            case 5:
                                float[] fArr5 = va1.f65096a;
                                return va1.m23211d(h9aVar2, d5);
                            case 6:
                                double d10 = h9aVar2.f42054b;
                                double d11 = h9aVar2.f42055c;
                                double d12 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = h9aVar2.f42054b;
                                double d14 = h9aVar2.f42055c;
                                double d15 = h9aVar2.f42056d;
                                return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            aj2Var2 = new aj2() { // from class: zg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d5) {
                    int i8 = i2;
                    h9a h9aVar2 = h9aVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = va1.f65096a;
                            return va1.m23208a(h9aVar2, d5);
                        case 1:
                            float[] fArr3 = va1.f65096a;
                            return va1.m23210c(h9aVar2, d5);
                        case 2:
                            double d6 = h9aVar2.f42054b;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                        case 3:
                            double d7 = h9aVar2.f42054b;
                            double d8 = h9aVar2.f42055c;
                            double d9 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                        case 4:
                            float[] fArr4 = va1.f65096a;
                            return va1.m23209b(h9aVar2, d5);
                        case 5:
                            float[] fArr5 = va1.f65096a;
                            return va1.m23211d(h9aVar2, d5);
                        case 6:
                            double d10 = h9aVar2.f42054b;
                            double d11 = h9aVar2.f42055c;
                            double d12 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = h9aVar2.f42054b;
                            double d14 = h9aVar2.f42055c;
                            double d15 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            aj2Var2 = new aj2() { // from class: zg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d5) {
                    int i8 = i3;
                    h9a h9aVar2 = h9aVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = va1.f65096a;
                            return va1.m23208a(h9aVar2, d5);
                        case 1:
                            float[] fArr3 = va1.f65096a;
                            return va1.m23210c(h9aVar2, d5);
                        case 2:
                            double d6 = h9aVar2.f42054b;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                        case 3:
                            double d7 = h9aVar2.f42054b;
                            double d8 = h9aVar2.f42055c;
                            double d9 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                        case 4:
                            float[] fArr4 = va1.f65096a;
                            return va1.m23209b(h9aVar2, d5);
                        case 5:
                            float[] fArr5 = va1.f65096a;
                            return va1.m23211d(h9aVar2, d5);
                        case 6:
                            double d10 = h9aVar2.f42054b;
                            double d11 = h9aVar2.f42055c;
                            double d12 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = h9aVar2.f42054b;
                            double d14 = h9aVar2.f42055c;
                            double d15 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            aj2Var2 = new aj2() { // from class: zg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d5) {
                    int i9 = i8;
                    h9a h9aVar2 = h9aVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = va1.f65096a;
                            return va1.m23208a(h9aVar2, d5);
                        case 1:
                            float[] fArr3 = va1.f65096a;
                            return va1.m23210c(h9aVar2, d5);
                        case 2:
                            double d6 = h9aVar2.f42054b;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                        case 3:
                            double d7 = h9aVar2.f42054b;
                            double d8 = h9aVar2.f42055c;
                            double d9 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                        case 4:
                            float[] fArr4 = va1.f65096a;
                            return va1.m23209b(h9aVar2, d5);
                        case 5:
                            float[] fArr5 = va1.f65096a;
                            return va1.m23211d(h9aVar2, d5);
                        case 6:
                            double d10 = h9aVar2.f42054b;
                            double d11 = h9aVar2.f42055c;
                            double d12 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = h9aVar2.f42054b;
                            double d14 = h9aVar2.f42055c;
                            double d15 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            aj2Var2 = new aj2() { // from class: zg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d5) {
                    int i10 = i9;
                    h9a h9aVar2 = h9aVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = va1.f65096a;
                            return va1.m23208a(h9aVar2, d5);
                        case 1:
                            float[] fArr3 = va1.f65096a;
                            return va1.m23210c(h9aVar2, d5);
                        case 2:
                            double d6 = h9aVar2.f42054b;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d6 * d5) + h9aVar2.f42055c, h9aVar2.f42053a) : h9aVar2.f42056d * d5;
                        case 3:
                            double d7 = h9aVar2.f42054b;
                            double d8 = h9aVar2.f42055c;
                            double d9 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e ? Math.pow((d7 * d5) + d8, h9aVar2.f42053a) + h9aVar2.f42058f : (d9 * d5) + h9aVar2.f42059g;
                        case 4:
                            float[] fArr4 = va1.f65096a;
                            return va1.m23209b(h9aVar2, d5);
                        case 5:
                            float[] fArr5 = va1.f65096a;
                            return va1.m23211d(h9aVar2, d5);
                        case 6:
                            double d10 = h9aVar2.f42054b;
                            double d11 = h9aVar2.f42055c;
                            double d12 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d12 ? (Math.pow(d5, 1.0d / h9aVar2.f42053a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = h9aVar2.f42054b;
                            double d14 = h9aVar2.f42055c;
                            double d15 = h9aVar2.f42056d;
                            return d5 >= h9aVar2.f42057e * d15 ? (Math.pow(d5 - h9aVar2.f42058f, 1.0d / h9aVar2.f42053a) - d14) / d13 : (d5 - h9aVar2.f42059g) / d15;
                    }
                }
            };
        }
        this(str, fArr, i4bVar, null, aj2Var, aj2Var2, 0.0f, 1.0f, h9aVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0308a(String str, float[] fArr, i4b i4bVar, final double d, float f, float f2, int i) {
        aj2 aj2Var;
        aj2 aj2Var2 = f3940r;
        if (d == 1.0d) {
            aj2Var = aj2Var2;
        } else {
            final int i2 = 0;
            aj2Var = new aj2() { // from class: yg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            aj2Var2 = new aj2() { // from class: yg8
                @Override // p000.aj2
                /* JADX INFO: renamed from: c */
                public final double mo503c(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        aj2 aj2Var3 = aj2Var2;
        this(str, fArr, i4bVar, null, aj2Var, aj2Var3, f, f2, new h9a(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
