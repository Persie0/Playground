package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zf9 {

    /* JADX INFO: renamed from: a */
    public double f71495a;

    /* JADX INFO: renamed from: b */
    public double f71496b;

    /* JADX INFO: renamed from: c */
    public boolean f71497c;

    /* JADX INFO: renamed from: d */
    public double f71498d;

    /* JADX INFO: renamed from: e */
    public double f71499e;

    /* JADX INFO: renamed from: f */
    public double f71500f;

    /* JADX INFO: renamed from: g */
    public double f71501g;

    /* JADX INFO: renamed from: h */
    public double f71502h;

    /* JADX INFO: renamed from: i */
    public double f71503i;

    /* JADX INFO: renamed from: j */
    public final C3588sv f71504j;

    public zf9() {
        this.f71495a = Math.sqrt(1500.0d);
        this.f71496b = 0.5d;
        this.f71497c = false;
        this.f71503i = Double.MAX_VALUE;
        this.f71504j = new C3588sv();
    }

    /* JADX INFO: renamed from: a */
    public final void m25593a(float f) {
        if (f < 0.0f) {
            C3386nv.m17626m("Damping ratio must be non-negative");
        } else {
            this.f71496b = f;
            this.f71497c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25594b(float f) {
        if (f <= 0.0f) {
            C3386nv.m17626m("Spring stiffness constant must be positive.");
        } else {
            this.f71495a = Math.sqrt(f);
            this.f71497c = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3588sv m25595c(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f71497c) {
            if (this.f71503i == Double.MAX_VALUE) {
                C3386nv.m17633t("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.f71496b;
            if (d3 > 1.0d) {
                double d4 = this.f71495a;
                this.f71500f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f71496b;
                double d6 = this.f71495a;
                this.f71501g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f71502h = Math.sqrt(1.0d - (d3 * d3)) * this.f71495a;
            }
            this.f71497c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f71503i;
        double d9 = this.f71496b;
        if (d9 > 1.0d) {
            double d10 = this.f71501g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f71500f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f71500f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f71501g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f71500f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f71495a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f71495a) * d7) * d17;
            double d18 = -this.f71495a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f71502h;
            double d20 = this.f71495a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f71502h * d7) * d21) + (Math.cos(this.f71502h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f71495a;
            double d23 = this.f71496b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f71502h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f71502h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f71503i);
        C3588sv c3588sv = this.f71504j;
        c3588sv.f61450a = f;
        c3588sv.f61451b = (float) dCos;
        return c3588sv;
    }

    public zf9(float f) {
        this.f71495a = Math.sqrt(1500.0d);
        this.f71496b = 0.5d;
        this.f71497c = false;
        this.f71504j = new C3588sv();
        this.f71503i = f;
    }
}
