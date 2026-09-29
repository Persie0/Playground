package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class eo2 extends fo2 {

    /* JADX INFO: renamed from: H */
    public final double f37596H;

    /* JADX INFO: renamed from: I */
    public final double f37597I;

    /* JADX INFO: renamed from: J */
    public final double f37598J;

    /* JADX INFO: renamed from: K */
    public final double f37599K;

    public eo2(String str) {
        super(0);
        this.f39372b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f37596H = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.f37597I = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.f37598J = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.f37599K = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    @Override // p000.fo2
    /* JADX INFO: renamed from: b */
    public final double mo3907b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m11278f(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dM11278f = m11278f(d4);
        double d5 = d3 + d2;
        double dM11278f2 = m11278f(d5);
        double dM11279g = m11279g(d4);
        return (((d - dM11278f) * (m11279g(d5) - dM11279g)) / (dM11278f2 - dM11278f)) + dM11279g;
    }

    @Override // p000.fo2
    /* JADX INFO: renamed from: c */
    public final double mo3908c(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m11278f(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m11279g(d5) - m11279g(d4)) / (m11278f(d5) - m11278f(d4));
    }

    /* JADX INFO: renamed from: f */
    public final double m11278f(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f37598J * d5) + (this.f37596H * d4) + (d * d * d);
    }

    /* JADX INFO: renamed from: g */
    public final double m11279g(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f37599K * d5) + (this.f37597I * d4) + (d * d * d);
    }
}
