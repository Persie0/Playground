package p038c2;

/* JADX INFO: renamed from: c2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1671n implements InterfaceC1670m {

    /* JADX INFO: renamed from: a */
    public float f9357a;

    /* JADX INFO: renamed from: b */
    public float f9358b;

    /* JADX INFO: renamed from: c */
    public float f9359c;

    /* JADX INFO: renamed from: d */
    public float f9360d;

    /* JADX INFO: renamed from: e */
    public float f9361e;

    /* JADX INFO: renamed from: f */
    public float f9362f;

    /* JADX INFO: renamed from: g */
    public float f9363g;

    /* JADX INFO: renamed from: h */
    public float f9364h;

    /* JADX INFO: renamed from: i */
    public float f9365i;

    /* JADX INFO: renamed from: j */
    public int f9366j;

    /* JADX INFO: renamed from: k */
    public boolean f9367k = false;

    /* JADX INFO: renamed from: l */
    public float f9368l;

    /* JADX INFO: renamed from: m */
    public float f9369m;

    @Override // p038c2.InterfaceC1670m
    /* JADX INFO: renamed from: a */
    public final float mo5399a() {
        return this.f9367k ? -m5401b(this.f9369m) : m5401b(this.f9369m);
    }

    /* JADX INFO: renamed from: b */
    public final float m5401b(float f3) {
        float f10;
        float f11;
        float f12 = this.f9360d;
        if (f3 <= f12) {
            f10 = this.f9357a;
            f11 = this.f9358b;
        } else {
            int i10 = this.f9366j;
            if (i10 == 1) {
                return 0.0f;
            }
            f3 -= f12;
            f12 = this.f9361e;
            if (f3 >= f12) {
                if (i10 == 2) {
                    return this.f9364h;
                }
                float f13 = f3 - f12;
                float f14 = this.f9362f;
                if (f13 >= f14) {
                    return this.f9365i;
                }
                float f15 = this.f9359c;
                return f15 - ((f13 * f15) / f14);
            }
            f10 = this.f9358b;
            f11 = this.f9359c;
        }
        return (((f11 - f10) * f3) / f12) + f10;
    }

    /* JADX INFO: renamed from: c */
    public final void m5402c(float f3, float f10, float f11, float f12, float f13) {
        if (f3 == 0.0f) {
            f3 = 1.0E-4f;
        }
        this.f9357a = f3;
        float f14 = f3 / f11;
        float f15 = (f14 * f3) / 2.0f;
        if (f3 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f10 - ((((-f3) / f11) * f3) / 2.0f)) * f11);
            if (fSqrt < f12) {
                this.f9366j = 2;
                this.f9357a = f3;
                this.f9358b = fSqrt;
                this.f9359c = 0.0f;
                float f16 = (fSqrt - f3) / f11;
                this.f9360d = f16;
                this.f9361e = fSqrt / f11;
                this.f9363g = ((f3 + fSqrt) * f16) / 2.0f;
                this.f9364h = f10;
                this.f9365i = f10;
                return;
            }
            this.f9366j = 3;
            this.f9357a = f3;
            this.f9358b = f12;
            this.f9359c = f12;
            float f17 = (f12 - f3) / f11;
            this.f9360d = f17;
            float f18 = f12 / f11;
            this.f9362f = f18;
            float f19 = ((f3 + f12) * f17) / 2.0f;
            float f20 = (f18 * f12) / 2.0f;
            this.f9361e = ((f10 - f19) - f20) / f12;
            this.f9363g = f19;
            this.f9364h = f10 - f20;
            this.f9365i = f10;
            return;
        }
        if (f15 >= f10) {
            this.f9366j = 1;
            this.f9357a = f3;
            this.f9358b = 0.0f;
            this.f9363g = f10;
            this.f9360d = (2.0f * f10) / f3;
            return;
        }
        float f21 = f10 - f15;
        float f22 = f21 / f3;
        if (f22 + f14 < f13) {
            this.f9366j = 2;
            this.f9357a = f3;
            this.f9358b = f3;
            this.f9359c = 0.0f;
            this.f9363g = f21;
            this.f9364h = f10;
            this.f9360d = f22;
            this.f9361e = f14;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f3 * f3) / 2.0f) + (f11 * f10));
        float f23 = (fSqrt2 - f3) / f11;
        this.f9360d = f23;
        float f24 = fSqrt2 / f11;
        this.f9361e = f24;
        if (fSqrt2 < f12) {
            this.f9366j = 2;
            this.f9357a = f3;
            this.f9358b = fSqrt2;
            this.f9359c = 0.0f;
            this.f9360d = f23;
            this.f9361e = f24;
            this.f9363g = ((f3 + fSqrt2) * f23) / 2.0f;
            this.f9364h = f10;
            return;
        }
        this.f9366j = 3;
        this.f9357a = f3;
        this.f9358b = f12;
        this.f9359c = f12;
        float f25 = (f12 - f3) / f11;
        this.f9360d = f25;
        float f26 = f12 / f11;
        this.f9362f = f26;
        float f27 = ((f3 + f12) * f25) / 2.0f;
        float f28 = (f26 * f12) / 2.0f;
        this.f9361e = ((f10 - f27) - f28) / f12;
        this.f9363g = f27;
        this.f9364h = f10 - f28;
        this.f9365i = f10;
    }

    @Override // p038c2.InterfaceC1670m
    public final float getInterpolation(float f3) {
        float f10;
        float f11 = this.f9360d;
        if (f3 <= f11) {
            float f12 = this.f9357a;
            f10 = ((((this.f9358b - f12) * f3) * f3) / (f11 * 2.0f)) + (f12 * f3);
        } else {
            int i10 = this.f9366j;
            if (i10 == 1) {
                f10 = this.f9363g;
            } else {
                float f13 = f3 - f11;
                float f14 = this.f9361e;
                if (f13 < f14) {
                    float f15 = this.f9363g;
                    float f16 = this.f9358b;
                    f10 = ((((this.f9359c - f16) * f13) * f13) / (f14 * 2.0f)) + (f16 * f13) + f15;
                } else if (i10 == 2) {
                    f10 = this.f9364h;
                } else {
                    float f17 = f13 - f14;
                    float f18 = this.f9362f;
                    if (f17 <= f18) {
                        float f19 = this.f9364h;
                        float f20 = this.f9359c * f17;
                        f10 = (f19 + f20) - ((f20 * f17) / (f18 * 2.0f));
                    } else {
                        f10 = this.f9365i;
                    }
                }
            }
        }
        this.f9369m = f3;
        return this.f9367k ? this.f9368l - f10 : this.f9368l + f10;
    }

    @Override // p038c2.InterfaceC1670m
    /* JADX INFO: renamed from: i */
    public final boolean mo5400i() {
        return mo5399a() < 1.0E-5f && Math.abs(this.f9365i - this.f9369m) < 1.0E-5f;
    }
}
