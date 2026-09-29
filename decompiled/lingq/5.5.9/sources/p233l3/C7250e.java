package p233l3;

/* JADX INFO: renamed from: l3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7250e {

    /* JADX INFO: renamed from: a */
    public double f40723a;

    /* JADX INFO: renamed from: b */
    public double f40724b;

    /* JADX INFO: renamed from: c */
    public boolean f40725c;

    /* JADX INFO: renamed from: d */
    public double f40726d;

    /* JADX INFO: renamed from: e */
    public double f40727e;

    /* JADX INFO: renamed from: f */
    public double f40728f;

    /* JADX INFO: renamed from: g */
    public double f40729g;

    /* JADX INFO: renamed from: h */
    public double f40730h;

    /* JADX INFO: renamed from: i */
    public double f40731i;

    /* JADX INFO: renamed from: j */
    public final AbstractC7247b.g f40732j;

    public C7250e() {
        this.f40723a = Math.sqrt(1500.0d);
        this.f40724b = 0.5d;
        this.f40725c = false;
        this.f40731i = Double.MAX_VALUE;
        this.f40732j = new AbstractC7247b.g();
    }

    public C7250e(float f3) {
        this.f40723a = Math.sqrt(1500.0d);
        this.f40724b = 0.5d;
        this.f40725c = false;
        this.f40732j = new AbstractC7247b.g();
        this.f40731i = f3;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7247b.g m14598a(double d10, double d11, long j10) {
        double dCos;
        double dPow;
        if (!this.f40725c) {
            if (this.f40731i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f40724b;
            if (d12 > 1.0d) {
                double d13 = this.f40723a;
                this.f40728f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f40724b;
                double d15 = this.f40723a;
                this.f40729g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f40730h = Math.sqrt(1.0d - (d12 * d12)) * this.f40723a;
            }
            this.f40725c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.f40731i;
        double d18 = this.f40724b;
        if (d18 > 1.0d) {
            double d19 = this.f40729g;
            double d20 = this.f40728f;
            double d21 = d17 - (((d19 * d17) - d11) / (d19 - d20));
            double d22 = ((d17 * d19) - d11) / (d19 - d20);
            dPow = (Math.pow(2.718281828459045d, this.f40728f * d16) * d22) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d23 = this.f40729g;
            double dPow2 = Math.pow(2.718281828459045d, d23 * d16) * d21 * d23;
            double d24 = this.f40728f;
            dCos = (Math.pow(2.718281828459045d, d24 * d16) * d22 * d24) + dPow2;
        } else if (d18 == 1.0d) {
            double d25 = this.f40723a;
            double d26 = (d25 * d17) + d11;
            double d27 = (d26 * d16) + d17;
            double dPow3 = Math.pow(2.718281828459045d, (-d25) * d16) * d27;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f40723a) * d16) * d27;
            double d28 = this.f40723a;
            dCos = (Math.pow(2.718281828459045d, (-d28) * d16) * d26) + (dPow4 * (-d28));
            dPow = dPow3;
        } else {
            double d29 = 1.0d / this.f40730h;
            double d30 = this.f40723a;
            double d31 = ((d18 * d30 * d17) + d11) * d29;
            double dSin = ((Math.sin(this.f40730h * d16) * d31) + (Math.cos(this.f40730h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d30 * d16);
            double d32 = this.f40723a;
            double d33 = this.f40724b;
            double d34 = (-d32) * dSin * d33;
            double dPow5 = Math.pow(2.718281828459045d, (-d33) * d32 * d16);
            double d35 = this.f40730h;
            double dSin2 = Math.sin(d35 * d16) * (-d35) * d17;
            double d36 = this.f40730h;
            dCos = (((Math.cos(d36 * d16) * d31 * d36) + dSin2) * dPow5) + d34;
            dPow = dSin;
        }
        float f3 = (float) (dPow + this.f40731i);
        AbstractC7247b.g gVar = this.f40732j;
        gVar.f40717a = f3;
        gVar.f40718b = (float) dCos;
        return gVar;
    }
}
