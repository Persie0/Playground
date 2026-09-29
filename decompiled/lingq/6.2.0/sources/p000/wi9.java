package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wi9 implements ui9 {

    /* JADX INFO: renamed from: a */
    public float f66862a;

    /* JADX INFO: renamed from: b */
    public float f66863b;

    /* JADX INFO: renamed from: c */
    public float f66864c;

    /* JADX INFO: renamed from: d */
    public float f66865d;

    /* JADX INFO: renamed from: e */
    public float f66866e;

    /* JADX INFO: renamed from: f */
    public float f66867f;

    /* JADX INFO: renamed from: g */
    public float f66868g;

    /* JADX INFO: renamed from: h */
    public float f66869h;

    /* JADX INFO: renamed from: i */
    public float f66870i;

    /* JADX INFO: renamed from: j */
    public int f66871j;

    /* JADX INFO: renamed from: k */
    public boolean f66872k;

    /* JADX INFO: renamed from: l */
    public float f66873l;

    /* JADX INFO: renamed from: m */
    public float f66874m;

    /* JADX INFO: renamed from: n */
    public float f66875n;

    @Override // p000.ui9
    /* JADX INFO: renamed from: a */
    public final boolean mo4641a() {
        return mo4642b() < 1.0E-5f && Math.abs(this.f66870i - this.f66874m) < 1.0E-5f;
    }

    @Override // p000.ui9
    /* JADX INFO: renamed from: b */
    public final float mo4642b() {
        boolean z = this.f66872k;
        float fM23986c = m23986c(this.f66875n);
        return z ? -fM23986c : fM23986c;
    }

    /* JADX INFO: renamed from: c */
    public final float m23986c(float f) {
        float f2 = this.f66865d;
        if (f <= f2) {
            float f3 = this.f66862a;
            return (((this.f66863b - f3) * f) / f2) + f3;
        }
        int i = this.f66871j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f66866e;
        if (f4 < f5) {
            float f6 = this.f66863b;
            return (((this.f66864c - f6) * f4) / f5) + f6;
        }
        if (i == 2) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.f66867f;
        if (f7 >= f8) {
            return 0.0f;
        }
        float f9 = this.f66864c;
        return f9 - ((f7 * f9) / f8);
    }

    /* JADX INFO: renamed from: d */
    public final void m23987d(float f, float f2, float f3, float f4, float f5) {
        this.f66870i = f2;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f66871j = 2;
                this.f66862a = f;
                this.f66863b = fSqrt;
                this.f66864c = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f66865d = f8;
                this.f66866e = fSqrt / f3;
                this.f66868g = ((f + fSqrt) * f8) / 2.0f;
                this.f66869h = f2;
                this.f66870i = f2;
                return;
            }
            this.f66871j = 3;
            this.f66862a = f;
            this.f66863b = f4;
            this.f66864c = f4;
            float f9 = (f4 - f) / f3;
            this.f66865d = f9;
            float f10 = f4 / f3;
            this.f66867f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f66866e = ((f2 - f11) - f12) / f4;
            this.f66868g = f11;
            this.f66869h = f2 - f12;
            this.f66870i = f2;
            return;
        }
        if (f7 >= f2) {
            this.f66871j = 1;
            this.f66862a = f;
            this.f66863b = 0.0f;
            this.f66868g = f2;
            this.f66865d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f66871j = 2;
            this.f66862a = f;
            this.f66863b = f;
            this.f66864c = 0.0f;
            this.f66868g = f13;
            this.f66869h = f2;
            this.f66865d = f14;
            this.f66866e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f66865d = f15;
        float f16 = fSqrt2 / f3;
        this.f66866e = f16;
        if (fSqrt2 < f4) {
            this.f66871j = 2;
            this.f66862a = f;
            this.f66863b = fSqrt2;
            this.f66864c = 0.0f;
            this.f66865d = f15;
            this.f66866e = f16;
            this.f66868g = ((f + fSqrt2) * f15) / 2.0f;
            this.f66869h = f2;
            return;
        }
        this.f66871j = 3;
        this.f66862a = f;
        this.f66863b = f4;
        this.f66864c = f4;
        float f17 = (f4 - f) / f3;
        this.f66865d = f17;
        float f18 = f4 / f3;
        this.f66867f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f66866e = ((f2 - f19) - f20) / f4;
        this.f66868g = f19;
        this.f66869h = f2 - f20;
        this.f66870i = f2;
    }

    @Override // p000.ui9
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f66865d;
        if (f <= f3) {
            float f4 = this.f66862a;
            f2 = ((((this.f66863b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f66871j;
            if (i == 1) {
                f2 = this.f66868g;
            } else {
                float f5 = f - f3;
                float f6 = this.f66866e;
                if (f5 < f6) {
                    float f7 = this.f66868g;
                    float f8 = this.f66863b;
                    f2 = ((((this.f66864c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f66869h;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f66867f;
                    if (f9 <= f10) {
                        float f11 = this.f66869h;
                        float f12 = this.f66864c * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f66870i;
                    }
                }
            }
        }
        this.f66874m = f2;
        this.f66875n = f;
        boolean z = this.f66872k;
        float f13 = this.f66873l;
        return z ? f13 - f2 : f13 + f2;
    }
}
