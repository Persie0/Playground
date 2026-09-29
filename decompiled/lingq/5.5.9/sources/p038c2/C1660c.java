package p038c2;

import java.util.Arrays;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1660c {

    /* JADX INFO: renamed from: b */
    public static final C1660c f9302b = new C1660c();

    /* JADX INFO: renamed from: c */
    public static final String[] f9303c = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a */
    public String f9304a = "identity";

    /* JADX INFO: renamed from: c2.c$a */
    public static class a extends C1660c {

        /* JADX INFO: renamed from: d */
        public final double f9305d;

        /* JADX INFO: renamed from: e */
        public final double f9306e;

        /* JADX INFO: renamed from: f */
        public final double f9307f;

        /* JADX INFO: renamed from: g */
        public final double f9308g;

        public a(String str) {
            this.f9304a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f9305d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f9306e = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f9307f = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f9308g = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        @Override // p038c2.C1660c
        /* JADX INFO: renamed from: a */
        public final double mo5384a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 0.01d) {
                d11 *= 0.5d;
                d12 = m5386d(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double dM5386d = m5386d(d13);
            double d14 = d12 + d11;
            double dM5386d2 = m5386d(d14);
            double dM5387e = m5387e(d13);
            return (((d10 - dM5386d) * (m5387e(d14) - dM5387e)) / (dM5386d2 - dM5386d)) + dM5387e;
        }

        @Override // p038c2.C1660c
        /* JADX INFO: renamed from: b */
        public final double mo5385b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 1.0E-4d) {
                d11 *= 0.5d;
                d12 = m5386d(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (m5387e(d14) - m5387e(d13)) / (m5386d(d14) - m5386d(d13));
        }

        /* JADX INFO: renamed from: d */
        public final double m5386d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f9307f * d14) + (this.f9305d * d13) + (d10 * d10 * d10);
        }

        /* JADX INFO: renamed from: e */
        public final double m5387e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f9308g * d14) + (this.f9306e * d13) + (d10 * d10 * d10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1660c m5383c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new C1669l(str);
        }
        if (str.startsWith("Schlick")) {
            return new C1666i(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f9303c));
                return f9302b;
        }
    }

    /* JADX INFO: renamed from: a */
    public double mo5384a(double d10) {
        return d10;
    }

    /* JADX INFO: renamed from: b */
    public double mo5385b(double d10) {
        return 1.0d;
    }

    public final String toString() {
        return this.f9304a;
    }
}
