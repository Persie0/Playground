package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aiw {

    /* JADX INFO: renamed from: a */
    double f464a;

    /* JADX INFO: renamed from: b */
    double f465b;

    /* JADX INFO: renamed from: c */
    public double f466c;

    /* JADX INFO: renamed from: d */
    public double f467d;

    /* JADX INFO: renamed from: e */
    private boolean f468e;

    /* JADX INFO: renamed from: f */
    private double f469f;

    /* JADX INFO: renamed from: g */
    private double f470g;

    /* JADX INFO: renamed from: h */
    private double f471h;

    /* JADX INFO: renamed from: i */
    private double f472i;

    /* JADX INFO: renamed from: j */
    private final aio f473j;

    public aiw() {
        this.f464a = Math.sqrt(1500.0d);
        this.f465b = 0.5d;
        this.f468e = false;
        this.f472i = Double.MAX_VALUE;
        this.f473j = new aio();
    }

    /* JADX INFO: renamed from: a */
    public final float m789a() {
        return (float) this.f472i;
    }

    /* JADX INFO: renamed from: c */
    public final void m791c(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f465b = f;
        this.f468e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m792d(float f) {
        this.f472i = f;
    }

    /* JADX INFO: renamed from: e */
    public final void m793e(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f464a = Math.sqrt(f);
        this.f468e = false;
    }

    public aiw(float f) {
        this.f464a = Math.sqrt(1500.0d);
        this.f465b = 0.5d;
        this.f468e = false;
        this.f472i = Double.MAX_VALUE;
        this.f473j = new aio();
        this.f472i = f;
    }

    /* JADX INFO: renamed from: b */
    final aio m790b(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f468e) {
            if (this.f472i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f465b;
            if (d3 > 1.0d) {
                double d4 = this.f464a;
                this.f469f = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
                double d5 = this.f465b;
                double d6 = this.f464a;
                this.f470g = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f471h = this.f464a * Math.sqrt(1.0d - (d3 * d3));
            }
            this.f468e = true;
        }
        double d7 = j;
        double d8 = d - this.f472i;
        double d9 = this.f465b;
        Double.isNaN(d7);
        double d10 = d7 / 1000.0d;
        if (d9 > 1.0d) {
            double d11 = this.f470g;
            double d12 = ((d11 * d8) - d2) / (d11 - this.f469f);
            double d13 = d8 - d12;
            double dPow2 = Math.pow(2.718281828459045d, d11 * d10) * d13;
            double dPow3 = Math.pow(2.718281828459045d, this.f469f * d10) * d12;
            double d14 = this.f470g;
            double dPow4 = d13 * d14 * Math.pow(2.718281828459045d, d14 * d10);
            double d15 = this.f469f;
            dCos = dPow4 + (d12 * d15 * Math.pow(2.718281828459045d, d15 * d10));
            dPow = dPow2 + dPow3;
        } else if (d9 == 1.0d) {
            double d16 = this.f464a;
            double d17 = d2 + (d16 * d8);
            double d18 = d8 + (d17 * d10);
            dPow = Math.pow(2.718281828459045d, (-d16) * d10) * d18;
            double dPow5 = d18 * Math.pow(2.718281828459045d, (-this.f464a) * d10);
            double d19 = -this.f464a;
            dCos = (dPow5 * d19) + (d17 * Math.pow(2.718281828459045d, d10 * d19));
        } else {
            double d20 = 1.0d / this.f471h;
            double d21 = this.f464a;
            double d22 = d20 * ((d9 * d21 * d8) + d2);
            double dPow6 = Math.pow(2.718281828459045d, (-d9) * d21 * d10) * ((Math.cos(this.f471h * d10) * d8) + (Math.sin(this.f471h * d10) * d22));
            double d23 = this.f464a;
            double d24 = this.f465b;
            double d25 = (-d23) * dPow6 * d24;
            double dPow7 = Math.pow(2.718281828459045d, (-d24) * d23 * d10);
            double d26 = this.f471h;
            double dSin = (-d26) * d8 * Math.sin(d26 * d10);
            double d27 = this.f471h;
            dCos = d25 + (dPow7 * (dSin + (d22 * d27 * Math.cos(d27 * d10))));
            dPow = dPow6;
        }
        aio aioVar = this.f473j;
        aioVar.f439a = (float) (dPow + this.f472i);
        aioVar.f440b = (float) dCos;
        return aioVar;
    }
}
