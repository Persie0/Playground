package p374s;

/* JADX INFO: renamed from: s.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8935w {

    /* JADX INFO: renamed from: c */
    public boolean f46863c;

    /* JADX INFO: renamed from: d */
    public double f46864d;

    /* JADX INFO: renamed from: e */
    public double f46865e;

    /* JADX INFO: renamed from: f */
    public double f46866f;

    /* JADX INFO: renamed from: a */
    public float f46861a = 1.0f;

    /* JADX INFO: renamed from: b */
    public double f46862b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g */
    public float f46867g = 1.0f;

    /* JADX INFO: renamed from: a */
    public final long m17154a(float f3, float f10, long j10) {
        double dCos;
        double dExp;
        if (!this.f46863c) {
            if (this.f46861a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f11 = this.f46867g;
            double d10 = f11;
            double d11 = d10 * d10;
            if (f11 > 1.0f) {
                double d12 = this.f46862b;
                double d13 = d11 - ((double) 1);
                this.f46864d = (Math.sqrt(d13) * d12) + (((double) (-f11)) * d12);
                double d14 = -this.f46867g;
                double d15 = this.f46862b;
                this.f46865e = (d14 * d15) - (Math.sqrt(d13) * d15);
            } else if (f11 >= 0.0f && f11 < 1.0f) {
                this.f46866f = Math.sqrt(((double) 1) - d11) * this.f46862b;
            }
            this.f46863c = true;
        }
        float f12 = f3 - this.f46861a;
        double d16 = j10 / 1000.0d;
        float f13 = this.f46867g;
        if (f13 > 1.0f) {
            double d17 = f12;
            double d18 = this.f46865e;
            double d19 = f10;
            double d20 = this.f46864d;
            double d21 = d17 - (((d18 * d17) - d19) / (d18 - d20));
            double d22 = ((d17 * d18) - d19) / (d18 - d20);
            dExp = (Math.exp(this.f46864d * d16) * d22) + (Math.exp(d18 * d16) * d21);
            double d23 = this.f46865e;
            double dExp2 = Math.exp(d23 * d16) * d21 * d23;
            double d24 = this.f46864d;
            dCos = (Math.exp(d24 * d16) * d22 * d24) + dExp2;
        } else {
            if (f13 == 1.0f) {
                double d25 = this.f46862b;
                double d26 = f12;
                double d27 = (d25 * d26) + ((double) f10);
                double d28 = (d27 * d16) + d26;
                double dExp3 = Math.exp((-d25) * d16) * d28;
                double dExp4 = Math.exp((-this.f46862b) * d16) * d28;
                double d29 = this.f46862b;
                dCos = (Math.exp((-d29) * d16) * d27) + (dExp4 * (-d29));
                dExp = dExp3;
            } else {
                double d30 = ((double) 1) / this.f46866f;
                double d31 = this.f46862b;
                double d32 = f12;
                double d33 = ((((double) f13) * d31 * d32) + ((double) f10)) * d30;
                double dExp5 = Math.exp(((double) (-f13)) * d31 * d16) * ((Math.sin(this.f46866f * d16) * d33) + (Math.cos(this.f46866f * d16) * d32));
                double d34 = this.f46862b;
                float f14 = this.f46867g;
                double d35 = (-d34) * dExp5 * ((double) f14);
                double dExp6 = Math.exp(((double) (-f14)) * d34 * d16);
                double d36 = this.f46866f;
                double dSin = Math.sin(d36 * d16) * (-d36) * d32;
                double d37 = this.f46866f;
                dCos = (((Math.cos(d37 * d16) * d33 * d37) + dSin) * dExp6) + d35;
                dExp = dExp5;
            }
        }
        return (((long) Float.floatToIntBits((float) dCos)) & 4294967295L) | (((long) Float.floatToIntBits((float) (dExp + ((double) this.f46861a)))) << 32);
    }
}
