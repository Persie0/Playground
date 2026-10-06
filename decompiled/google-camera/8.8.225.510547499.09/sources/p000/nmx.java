package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmx {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x00a4, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static long m17513a(double d, RoundingMode roundingMode) {
        double dRint;
        boolean z;
        if (!kxk.m15000ar(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (nmw.f43918a[roundingMode.ordinal()]) {
            case 1:
                kxk.m14992aj(m17514b(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d >= 0.0d || m17514b(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) - 1;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 3:
                if (d <= 0.0d || m17514b(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + 1;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
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
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 5:
                if (m17514b(d)) {
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
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
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
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d + Math.copySign(0.5d, d);
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
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
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17514b(double d) {
        if (!kxk.m15000ar(d)) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        lku.m15670x(kxk.m15000ar(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d);
    }
}
