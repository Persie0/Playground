package p000;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cj2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10167a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4769a(double d) {
        if (gbd.m12469c(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(gbd.m12468b(d)) <= Math.getExponent(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4770b(double d) {
        if (d > 0.0d && gbd.m12469c(d)) {
            long jM12468b = gbd.m12468b(d);
            if ((jM12468b & (jM12468b - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m4771c(double d) {
        boolean zM4770b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        bna.m3967p("x must be positive and finite", d > 0.0d && gbd.m12469c(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return m4771c(d * 4.503599627370496E15d) - 52;
        }
        switch (bj2.f8586a[roundingMode.ordinal()]) {
            case 1:
                oob.m18191b(m4770b(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !m4770b(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zM4770b = m4770b(d);
                z &= !zM4770b;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zM4770b = m4770b(d);
                z &= !zM4770b;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                uk9.m22780o();
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x009a, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static long m4772d(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        boolean z;
        if (!gbd.m12469c(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (bj2.f8586a[roundingMode.ordinal()]) {
            case 1:
                oob.m18191b(m4769a(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d >= 0.0d || m4769a(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) - 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 3:
                if (d <= 0.0d || m4769a(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) + 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 5:
                if (m4769a(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            default:
                uk9.m22780o();
                return 0L;
        }
    }
}
