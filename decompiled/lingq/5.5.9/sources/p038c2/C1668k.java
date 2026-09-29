package p038c2;

/* JADX INFO: renamed from: c2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1668k implements InterfaceC1670m {

    /* JADX INFO: renamed from: b */
    public double f9348b;

    /* JADX INFO: renamed from: c */
    public double f9349c;

    /* JADX INFO: renamed from: d */
    public float f9350d;

    /* JADX INFO: renamed from: e */
    public float f9351e;

    /* JADX INFO: renamed from: f */
    public float f9352f;

    /* JADX INFO: renamed from: g */
    public float f9353g;

    /* JADX INFO: renamed from: h */
    public float f9354h;

    /* JADX INFO: renamed from: a */
    public double f9347a = 0.5d;

    /* JADX INFO: renamed from: i */
    public int f9355i = 0;

    @Override // p038c2.InterfaceC1670m
    /* JADX INFO: renamed from: a */
    public final float mo5399a() {
        return 0.0f;
    }

    @Override // p038c2.InterfaceC1670m
    public final float getInterpolation(float f3) {
        C1668k c1668k = this;
        float f10 = f3;
        double d10 = f10 - c1668k.f9350d;
        double d11 = c1668k.f9348b;
        double d12 = c1668k.f9347a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) c1668k.f9353g)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            double d14 = c1668k.f9351e;
            double d15 = c1668k.f9349c;
            int i11 = iSqrt;
            int i12 = i10;
            double d16 = c1668k.f9352f;
            double d17 = c1668k.f9353g;
            double d18 = ((((((-d11) * (d14 - d15)) - (d16 * d12)) / d17) * d13) / 2.0d) + d16;
            double d19 = ((((-((((d13 * d18) / 2.0d) + d14) - d15)) * d11) - (d18 * d12)) / d17) * d13;
            float f11 = (float) (d16 + d19);
            this.f9352f = f11;
            float f12 = (float) ((((d19 / 2.0d) + d16) * d13) + d14);
            this.f9351e = f12;
            int i13 = this.f9355i;
            if (i13 > 0) {
                if (f12 < 0.0f && (i13 & 1) == 1) {
                    this.f9351e = -f12;
                    this.f9352f = -f11;
                }
                float f13 = this.f9351e;
                if (f13 > 1.0f && (i13 & 2) == 2) {
                    this.f9351e = 2.0f - f13;
                    this.f9352f = -this.f9352f;
                }
            }
            f10 = f3;
            iSqrt = i11;
            i10 = i12 + 1;
            c1668k = this;
        }
        C1668k c1668k2 = c1668k;
        c1668k2.f9350d = f10;
        return c1668k2.f9351e;
    }

    @Override // p038c2.InterfaceC1670m
    /* JADX INFO: renamed from: i */
    public final boolean mo5400i() {
        double d10 = ((double) this.f9351e) - this.f9349c;
        double d11 = this.f9348b;
        double d12 = this.f9352f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f9353g))) / d11) <= ((double) this.f9354h);
    }
}
