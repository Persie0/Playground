package p402u0;

import dm.C5207g;
import java.util.Arrays;
import p118fe.C5509a;
import p338qd.C8584v;
import p385sf.C9000b;

/* JADX INFO: renamed from: u0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9374q extends AbstractC9360c {

    /* JADX INFO: renamed from: p */
    public static final C9362e f48148p = new C9362e(1);

    /* JADX INFO: renamed from: d */
    public final C9376s f48149d;

    /* JADX INFO: renamed from: e */
    public final float f48150e;

    /* JADX INFO: renamed from: f */
    public final float f48151f;

    /* JADX INFO: renamed from: g */
    public final C9375r f48152g;

    /* JADX INFO: renamed from: h */
    public final float[] f48153h;

    /* JADX INFO: renamed from: i */
    public final float[] f48154i;

    /* JADX INFO: renamed from: j */
    public final float[] f48155j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9366i f48156k;

    /* JADX INFO: renamed from: l */
    public final C9369l f48157l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC9366i f48158m;

    /* JADX INFO: renamed from: n */
    public final C9370m f48159n;

    /* JADX INFO: renamed from: o */
    public final boolean f48160o;

    /* JADX INFO: renamed from: u0.q$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static float m17745a(float[] fArr) {
            float f3 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            float f15 = (((((f11 * f14) + ((f10 * f13) + (f3 * f12))) - (f12 * f13)) - (f10 * f11)) - (f3 * f14)) * 0.5f;
            return f15 < 0.0f ? -f15 : f15;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9374q(String str, float[] fArr, C9376s c9376s, final double d10, float f3, float f10, int i10) {
        boolean z10 = d10 == 1.0d;
        C9362e c9362e = f48148p;
        this(str, fArr, c9376s, null, z10 ? c9362e : new InterfaceC9366i() { // from class: u0.o
            @Override // p402u0.InterfaceC9366i
            /* JADX INFO: renamed from: j */
            public final double mo11741j(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, 1.0d / d10);
            }
        }, d10 == 1.0d ? c9362e : new InterfaceC9366i() { // from class: u0.p
            @Override // p402u0.InterfaceC9366i
            /* JADX INFO: renamed from: j */
            public final double mo11741j(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, d10);
            }
        }, f3, f10, new C9375r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    public C9374q(String str, float[] fArr, C9376s c9376s, C9375r c9375r, int i10) {
        InterfaceC9366i c9369l;
        InterfaceC9366i c5509a;
        double d10 = c9375r.f48166f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = d10 == 0.0d;
        double d11 = c9375r.f48167g;
        if (z10) {
            if (d11 == 0.0d) {
                c9369l = new C9371n(i12, c9375r);
            } else {
                c9369l = new C9369l(i11, c9375r);
            }
        } else {
            c9369l = new C9369l(i11, c9375r);
        }
        if (d10 == 0.0d) {
            if (d11 == 0.0d) {
                c5509a = new C9370m(i11, c9375r);
            } else {
                c5509a = new C5509a(i12, c9375r);
            }
        } else {
            c5509a = new C5509a(i12, c9375r);
        }
        this(str, fArr, c9376s, null, c9369l, c5509a, 0.0f, 1.0f, c9375r, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9374q(String str, float[] fArr, C9376s c9376s, float[] fArr2, InterfaceC9366i interfaceC9366i, InterfaceC9366i interfaceC9366i2, float f3, float f10, C9375r c9375r, int i10) {
        boolean z10;
        boolean z11;
        super(str, C9359b.f48096a, i10);
        C5207g.m11111f(str, "name");
        C5207g.m11111f(fArr, "primaries");
        C5207g.m11111f(interfaceC9366i, "oetf");
        C5207g.m11111f(interfaceC9366i2, "eotf");
        this.f48149d = c9376s;
        this.f48150e = f3;
        this.f48151f = f10;
        this.f48152g = c9375r;
        this.f48156k = interfaceC9366i;
        boolean z12 = false;
        z12 = false;
        z12 = false;
        z12 = false;
        z12 = false;
        z12 = false;
        this.f48157l = new C9369l(z12 ? 1 : 0, this);
        this.f48158m = interfaceC9366i2;
        this.f48159n = new C9370m(z12 ? 1 : 0, this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f3 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f10 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = f11 + f12 + fArr[2];
            fArr3[0] = f11 / f13;
            fArr3[1] = f12 / f13;
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = f14 + f15 + fArr[5];
            fArr3[2] = f14 / f16;
            fArr3[3] = f15 / f16;
            float f17 = fArr[6];
            float f18 = fArr[7];
            float f19 = f17 + f18 + fArr[8];
            fArr3[4] = f17 / f19;
            fArr3[5] = f18 / f19;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f48153h = fArr3;
        if (fArr2 == null) {
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr3[2];
            float f23 = fArr3[3];
            float f24 = fArr3[4];
            float f25 = fArr3[5];
            float f26 = 1;
            float f27 = (f26 - f20) / f21;
            float f28 = (f26 - f22) / f23;
            float f29 = (f26 - f24) / f25;
            float f30 = c9376s.f48168a;
            float f31 = c9376s.f48169b;
            float f32 = (f26 - f30) / f31;
            float f33 = f20 / f21;
            float f34 = (f22 / f23) - f33;
            float f35 = (f30 / f31) - f33;
            float f36 = f28 - f27;
            float f37 = (f24 / f25) - f33;
            float f38 = (((f32 - f27) * f34) - (f35 * f36)) / (((f29 - f27) * f34) - (f36 * f37));
            float f39 = (f35 - (f37 * f38)) / f34;
            float f40 = (1.0f - f39) - f38;
            float f41 = f40 / f21;
            float f42 = f39 / f23;
            float f43 = f38 / f25;
            this.f48154i = new float[]{f41 * f20, f40, ((1.0f - f20) - f21) * f41, f42 * f22, f39, ((1.0f - f22) - f23) * f42, f43 * f24, f38, ((1.0f - f24) - f25) * f43};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f48154i = fArr2;
        }
        this.f48155j = C9361d.m17734d(this.f48154i);
        float fM17745a = a.m17745a(fArr3);
        float[] fArr4 = C9363f.f48105a;
        if (fM17745a / a.m17745a(C9363f.f48106b) > 0.9f) {
            float[] fArr5 = C9363f.f48105a;
            float f44 = fArr3[0];
            float f45 = fArr5[0];
            float f46 = f44 - f45;
            z10 = true;
            float f47 = fArr3[1];
            float f48 = fArr5[1];
            float f49 = f47 - f48;
            float f50 = fArr3[2];
            float f51 = fArr5[2];
            float f52 = f50 - f51;
            float f53 = fArr3[3];
            float f54 = fArr5[3];
            float f55 = f53 - f54;
            float f56 = fArr3[4];
            float f57 = fArr5[4];
            float f58 = f56 - f57;
            float f59 = fArr3[5];
            float f60 = fArr5[5];
            float f61 = f59 - f60;
            if (((f48 - f60) * f46) - ((f45 - f57) * f49) < 0.0f || ((f45 - f51) * f49) - ((f48 - f54) * f46) < 0.0f || ((f54 - f48) * f52) - ((f51 - f45) * f55) < 0.0f || ((f51 - f57) * f55) - ((f54 - f60) * f52) < 0.0f || ((f60 - f54) * f58) - ((f57 - f51) * f61) < 0.0f || ((f57 - f45) * f61) - ((f60 - f48) * f58) >= 0.0f) {
            }
        } else {
            z10 = true;
        }
        if (i10 != 0) {
            float[] fArr6 = C9363f.f48105a;
            if (fArr3 == fArr6) {
                z11 = z10;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= 6) {
                    z11 = z10;
                    break;
                } else {
                    if (Float.compare(fArr3[i11], fArr6[i11]) != 0 && Math.abs(fArr3[i11] - fArr6[i11]) > 0.001f) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (z11 && C9361d.m17733c(c9376s, C9000b.f47200e)) {
                if (f3 == 0.0f ? z10 : false) {
                    if (f10 == 1.0f ? z10 : false) {
                        float[] fArr7 = C9363f.f48105a;
                        C9374q c9374q = C9363f.f48107c;
                        for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                            if (Math.abs(interfaceC9366i.mo11741j(d10) - c9374q.f48156k.mo11741j(d10)) <= 0.001d ? z10 : false) {
                                if (Math.abs(interfaceC9366i2.mo11741j(d10) - c9374q.f48158m.mo11741j(d10)) <= 0.001d ? z10 : false) {
                                }
                            }
                        }
                        z12 = z10;
                    }
                }
            }
        } else {
            z12 = z10;
        }
        this.f48160o = z12;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: a */
    public final float[] mo17723a(float[] fArr) {
        C9361d.m17737g(this.f48155j, fArr);
        double d10 = fArr[0];
        C9369l c9369l = this.f48157l;
        fArr[0] = (float) c9369l.mo11741j(d10);
        fArr[1] = (float) c9369l.mo11741j(fArr[1]);
        fArr[2] = (float) c9369l.mo11741j(fArr[2]);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: b */
    public final float mo17724b(int i10) {
        return this.f48151f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: c */
    public final float mo17725c(int i10) {
        return this.f48150e;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: d */
    public final boolean mo17726d() {
        return this.f48160o;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: e */
    public final long mo17727e(float f3, float f10, float f11) {
        double d10 = f3;
        C9370m c9370m = this.f48159n;
        float fMo11741j = (float) c9370m.mo11741j(d10);
        float fMo11741j2 = (float) c9370m.mo11741j(f10);
        float fMo11741j3 = (float) c9370m.mo11741j(f11);
        float[] fArr = this.f48154i;
        return (((long) Float.floatToIntBits(C9361d.m17738h(fMo11741j, fMo11741j2, fMo11741j3, fArr))) << 32) | (((long) Float.floatToIntBits(C9361d.m17739i(fMo11741j, fMo11741j2, fMo11741j3, fArr))) & 4294967295L);
    }

    @Override // p402u0.AbstractC9360c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean zM11106a = false;
        if (obj != null) {
            if (C9374q.class == obj.getClass()) {
                if (!super.equals(obj)) {
                    return false;
                }
                C9374q c9374q = (C9374q) obj;
                if (Float.compare(c9374q.f48150e, this.f48150e) == 0 && Float.compare(c9374q.f48151f, this.f48151f) == 0 && C5207g.m11106a(this.f48149d, c9374q.f48149d) && Arrays.equals(this.f48153h, c9374q.f48153h)) {
                    C9375r c9375r = c9374q.f48152g;
                    C9375r c9375r2 = this.f48152g;
                    if (c9375r2 != null) {
                        return C5207g.m11106a(c9375r2, c9375r);
                    }
                    if (c9375r == null) {
                        return true;
                    }
                    if (C5207g.m11106a(this.f48156k, c9374q.f48156k)) {
                        zM11106a = C5207g.m11106a(this.f48158m, c9374q.f48158m);
                    }
                }
                return false;
            }
        }
        return zM11106a;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: f */
    public final float[] mo17728f(float[] fArr) {
        double d10 = fArr[0];
        C9370m c9370m = this.f48159n;
        fArr[0] = (float) c9370m.mo11741j(d10);
        fArr[1] = (float) c9370m.mo11741j(fArr[1]);
        fArr[2] = (float) c9370m.mo11741j(fArr[2]);
        C9361d.m17737g(this.f48154i, fArr);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: g */
    public final float mo17729g(float f3, float f10, float f11) {
        double d10 = f3;
        C9370m c9370m = this.f48159n;
        return C9361d.m17740j((float) c9370m.mo11741j(d10), (float) c9370m.mo11741j(f10), (float) c9370m.mo11741j(f11), this.f48154i);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: h */
    public final long mo17730h(float f3, float f10, float f11, float f12, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        float[] fArr = this.f48155j;
        float fM17738h = C9361d.m17738h(f3, f10, f11, fArr);
        float fM17739i = C9361d.m17739i(f3, f10, f11, fArr);
        float fM17740j = C9361d.m17740j(f3, f10, f11, fArr);
        C9369l c9369l = this.f48157l;
        return C8584v.m16782g((float) c9369l.mo11741j(fM17738h), (float) c9369l.mo11741j(fM17739i), (float) c9369l.mo11741j(fM17740j), f12, abstractC9360c);
    }

    @Override // p402u0.AbstractC9360c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f48153h) + ((this.f48149d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f48150e;
        boolean z10 = true;
        int iHashCode2 = 0;
        int iFloatToIntBits = (iHashCode + (!((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f3) : 0)) * 31;
        float f10 = this.f48151f;
        if (f10 != 0.0f) {
            z10 = false;
        }
        int iFloatToIntBits2 = (iFloatToIntBits + (!z10 ? Float.floatToIntBits(f10) : 0)) * 31;
        C9375r c9375r = this.f48152g;
        if (c9375r != null) {
            iHashCode2 = c9375r.hashCode();
        }
        int i10 = iFloatToIntBits2 + iHashCode2;
        if (c9375r == null) {
            return this.f48158m.hashCode() + ((this.f48156k.hashCode() + (i10 * 31)) * 31);
        }
        return i10;
    }
}
