package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cg9 implements ui9 {

    /* JADX INFO: renamed from: a */
    public double f10022a;

    /* JADX INFO: renamed from: b */
    public double f10023b;

    /* JADX INFO: renamed from: c */
    public double f10024c;

    /* JADX INFO: renamed from: d */
    public float f10025d;

    /* JADX INFO: renamed from: e */
    public float f10026e;

    /* JADX INFO: renamed from: f */
    public float f10027f;

    /* JADX INFO: renamed from: g */
    public float f10028g;

    /* JADX INFO: renamed from: h */
    public float f10029h;

    /* JADX INFO: renamed from: i */
    public int f10030i;

    @Override // p000.ui9
    /* JADX INFO: renamed from: a */
    public final boolean mo4641a() {
        double d = ((double) this.f10026e) - this.f10024c;
        double d2 = this.f10023b;
        double d3 = this.f10027f;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f10028g))) / d2) <= ((double) this.f10029h);
    }

    @Override // p000.ui9
    /* JADX INFO: renamed from: b */
    public final float mo4642b() {
        return 0.0f;
    }

    @Override // p000.ui9
    public final float getInterpolation(float f) {
        double d = f - this.f10025d;
        if (d > 0.0d) {
            double d2 = this.f10023b;
            double d3 = this.f10022a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f10028g)) * d) * 4.0d)) + 1.0d);
            double d4 = d / ((double) iSqrt);
            int i = 0;
            while (i < iSqrt) {
                float f2 = this.f10026e;
                double d5 = f2;
                double d6 = this.f10024c;
                double d7 = d4;
                float f3 = this.f10027f;
                double d8 = f3;
                double d9 = ((-d2) * (d5 - d6)) - (d3 * d8);
                double d10 = this.f10028g;
                double d11 = (((d9 / d10) * d7) / 2.0d) + d8;
                double d12 = ((((-((((d7 * d11) / 2.0d) + d5) - d6)) * d2) - (d11 * d3)) / d10) * d7;
                float f4 = f3 + ((float) d12);
                this.f10027f = f4;
                float f5 = f2 + ((float) (((d12 / 2.0d) + d8) * d7));
                this.f10026e = f5;
                int i2 = this.f10030i;
                if (i2 > 0) {
                    if (f5 < 0.0f && (i2 & 1) == 1) {
                        this.f10026e = -f5;
                        this.f10027f = -f4;
                    }
                    float f6 = this.f10026e;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.f10026e = 2.0f - f6;
                        this.f10027f = -this.f10027f;
                    }
                }
                i++;
                d4 = d7;
            }
        }
        this.f10025d = f;
        if (mo4641a()) {
            this.f10026e = (float) this.f10024c;
        }
        return this.f10026e;
    }
}
