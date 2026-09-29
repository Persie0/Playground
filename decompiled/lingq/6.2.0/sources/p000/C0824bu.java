package p000;

/* JADX INFO: renamed from: bu */
/* JADX INFO: loaded from: classes2.dex */
public final class C0824bu {

    /* JADX INFO: renamed from: s */
    public static final double[] f8997s = new double[91];

    /* JADX INFO: renamed from: a */
    public double[] f8998a;

    /* JADX INFO: renamed from: b */
    public double f8999b;

    /* JADX INFO: renamed from: c */
    public double f9000c;

    /* JADX INFO: renamed from: d */
    public double f9001d;

    /* JADX INFO: renamed from: e */
    public double f9002e;

    /* JADX INFO: renamed from: f */
    public double f9003f;

    /* JADX INFO: renamed from: g */
    public double f9004g;

    /* JADX INFO: renamed from: h */
    public double f9005h;

    /* JADX INFO: renamed from: i */
    public double f9006i;

    /* JADX INFO: renamed from: j */
    public double f9007j;

    /* JADX INFO: renamed from: k */
    public double f9008k;

    /* JADX INFO: renamed from: l */
    public double f9009l;

    /* JADX INFO: renamed from: m */
    public double f9010m;

    /* JADX INFO: renamed from: n */
    public double f9011n;

    /* JADX INFO: renamed from: o */
    public double f9012o;

    /* JADX INFO: renamed from: p */
    public double f9013p;

    /* JADX INFO: renamed from: q */
    public boolean f9014q;

    /* JADX INFO: renamed from: r */
    public boolean f9015r;

    /* JADX INFO: renamed from: a */
    public final double m4169a() {
        double d = this.f9007j * this.f9013p;
        double dHypot = this.f9011n / Math.hypot(d, (-this.f9008k) * this.f9012o);
        return this.f9014q ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: b */
    public final double m4170b() {
        double d = this.f9007j * this.f9013p;
        double d2 = (-this.f9008k) * this.f9012o;
        double dHypot = this.f9011n / Math.hypot(d, d2);
        return this.f9014q ? (-d2) * dHypot : d2 * dHypot;
    }

    /* JADX INFO: renamed from: c */
    public final double m4171c(double d) {
        double d2 = (d - this.f9000c) * this.f9006i;
        double d3 = this.f9002e;
        return ((this.f9003f - d3) * d2) + d3;
    }

    /* JADX INFO: renamed from: d */
    public final double m4172d(double d) {
        double d2 = (d - this.f9000c) * this.f9006i;
        double d3 = this.f9004g;
        return ((this.f9005h - d3) * d2) + d3;
    }

    /* JADX INFO: renamed from: e */
    public final double m4173e() {
        return (this.f9007j * this.f9012o) + this.f9009l;
    }

    /* JADX INFO: renamed from: f */
    public final double m4174f() {
        return (this.f9008k * this.f9013p) + this.f9010m;
    }

    /* JADX INFO: renamed from: g */
    public final void m4175g(double d) {
        double d2 = (this.f9014q ? this.f9001d - d : d - this.f9000c) * this.f9006i;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f8998a;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f9012o = Math.sin(d5);
        this.f9013p = Math.cos(d5);
    }
}
