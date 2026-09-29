package androidx.compose.animation.core;

import ae.C0062b;
import cm.InterfaceC2052l;
import p374s.C8915k;
import p374s.C8935w;
import p374s.InterfaceC8931s;

/* JADX INFO: renamed from: androidx.compose.animation.core.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0370b implements InterfaceC8931s {

    /* JADX INFO: renamed from: a */
    public final float f1663a;

    /* JADX INFO: renamed from: b */
    public final C8935w f1664b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0370b() {
        float f3 = 0.0f;
        this(f3, f3, 7);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0370b(float f3, float f10, float f11) {
        this.f1663a = f11;
        C8935w c8935w = new C8935w();
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c8935w.f46867g = f3;
        c8935w.f46863c = false;
        double d10 = c8935w.f46862b;
        if (((float) (d10 * d10)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c8935w.f46862b = Math.sqrt(f10);
        c8935w.f46863c = false;
        this.f1664b = c8935w;
    }

    public /* synthetic */ C0370b(float f3, float f10, int i10) {
        this((i10 & 1) != 0 ? 1.0f : f3, (i10 & 2) != 0 ? 1500.0f : f10, (i10 & 4) != 0 ? 0.01f : 0.0f);
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: b */
    public final float mo1385b(long j10, float f3, float f10, float f11) {
        C8935w c8935w = this.f1664b;
        c8935w.f46861a = f10;
        return Float.intBitsToFloat((int) (c8935w.m17154a(f3, f11, j10 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0259 A[PHI: r13
      0x0259: PHI (r13v12 double) = (r13v11 double), (r13v11 double), (r13v11 double), (r13v11 double), (r13v13 double) binds: [B:91:0x0222, B:93:0x0228, B:100:0x0246, B:102:0x024a, B:103:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0084  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc A[LOOP:1: B:68:0x01d8->B:70:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x0210  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: c */
    public final long mo1386c(float f3, float f10, float f11) {
        final double dAbs;
        double dAbs2;
        final double d10;
        double dLog;
        double dLog2;
        double dLog3;
        int i10;
        double d11;
        boolean z10;
        boolean z11;
        double d12;
        final double d13;
        double d14;
        InterfaceC2052l<Double, Double> interfaceC2052l;
        InterfaceC2052l<Double, Double> interfaceC2052l2;
        double dLog4;
        int i11;
        long j10;
        double dLog5;
        boolean z12;
        boolean z13;
        double dLog6;
        final double d15;
        InterfaceC2052l<Double, Double> interfaceC2052l3;
        InterfaceC2052l<Double, Double> interfaceC2052l4;
        int i12;
        double d16;
        double dLog7;
        C8935w c8935w = this.f1664b;
        double d17 = c8935w.f46862b;
        float f12 = c8935w.f46867g;
        float f13 = this.f1663a;
        double d18 = (float) (d17 * d17);
        double d19 = f12;
        double d20 = f11 / f13;
        double d21 = (f3 - f10) / f13;
        double d22 = 1.0f;
        double dSqrt = d19 * 2.0d * Math.sqrt(d18);
        double d23 = -dSqrt;
        double d24 = (dSqrt * dSqrt) - (d18 * 4.0d);
        C8915k c8915kM405v0 = C0062b.m405v0(d24);
        c8915kM405v0.f46821a = (c8915kM405v0.f46821a + d23) / 2.0d;
        c8915kM405v0.f46822b /= 2.0d;
        C8915k c8915kM405v1 = C0062b.m405v0(d24);
        double d25 = -1;
        double d26 = c8915kM405v1.f46821a * d25;
        double d27 = c8915kM405v1.f46822b * d25;
        c8915kM405v1.f46821a = (d26 + d23) / 2.0d;
        c8915kM405v1.f46822b = d27 / 2.0d;
        if (!(d21 == 0.0d)) {
            if (d21 < 0.0d) {
                d20 = -d20;
            }
            dAbs = Math.abs(d21);
            dAbs2 = Double.MAX_VALUE;
            if (d19 > 1.0d) {
                final double d28 = c8915kM405v0.f46821a;
                final double d29 = c8915kM405v1.f46821a;
                double d30 = d28 - d29;
                final double d31 = ((d28 * dAbs) - d20) / d30;
                final double d32 = dAbs - d31;
                dLog4 = Math.log(Math.abs(d22 / d32)) / d28;
                dLog5 = Math.log(Math.abs(d22 / d31)) / d29;
                if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    dLog4 = dLog5;
                } else {
                    if (Double.isInfinite(dLog5) || Double.isNaN(dLog5)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!(!z13)) {
                        dLog4 = Math.max(dLog4, dLog5);
                    }
                }
                double d33 = d32 * d28;
                dLog6 = Math.log(d33 / ((-d31) * d29)) / (d29 - d28);
                if (Double.isNaN(dLog6) || dLog6 <= 0.0d) {
                    d15 = -d22;
                } else {
                    if (dLog6 <= 0.0d) {
                        d16 = d22;
                        dLog7 = Math.log((-((d31 * d29) * d29)) / (d33 * d28)) / d30;
                    } else if ((-((Math.exp(dLog6 * d29) * d31) + (Math.exp(d28 * dLog6) * d32))) < d22) {
                        dLog7 = (d31 <= 0.0d || d32 >= 0.0d) ? dLog4 : 0.0d;
                        d16 = -d22;
                    } else {
                        d16 = d22;
                        dLog7 = Math.log((-((d31 * d29) * d29)) / (d33 * d28)) / d30;
                    }
                    dLog4 = dLog7;
                    d15 = d16;
                }
                interfaceC2052l3 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d34) {
                        double dDoubleValue = d34.doubleValue();
                        return Double.valueOf((Math.exp(d29 * dDoubleValue) * d31) + (Math.exp(d28 * dDoubleValue) * d32) + d15);
                    }
                };
                interfaceC2052l4 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d34) {
                        double dDoubleValue = d34.doubleValue();
                        double d35 = d32;
                        double d36 = d28;
                        double dExp = Math.exp(d36 * dDoubleValue) * d35 * d36;
                        double d37 = d31;
                        double d38 = d29;
                        return Double.valueOf((Math.exp(d38 * dDoubleValue) * d37 * d38) + dExp);
                    }
                };
                if (Math.abs(((Number) interfaceC2052l3.mo528n(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    i12 = 0;
                    while (dAbs2 > 0.001d && i12 < 100) {
                        i12++;
                        double dDoubleValue = dLog4 - (((Number) interfaceC2052l3.mo528n(Double.valueOf(dLog4))).doubleValue() / ((Number) interfaceC2052l4.mo528n(Double.valueOf(dLog4))).doubleValue());
                        dAbs2 = Math.abs(dLog4 - dDoubleValue);
                        dLog4 = dDoubleValue;
                    }
                }
            } else if (d19 < 1.0d) {
                double d34 = c8915kM405v0.f46821a;
                double d35 = (d20 - (d34 * dAbs)) / c8915kM405v0.f46822b;
                dLog4 = Math.log(d22 / Math.sqrt((d35 * d35) + (dAbs * dAbs))) / d34;
            } else {
                d10 = c8915kM405v0.f46821a;
                double d36 = d10 * dAbs;
                final double d37 = d20 - d36;
                dLog = Math.log(Math.abs(d22 / dAbs)) / d10;
                dLog2 = Math.log(Math.abs(d22 / d37));
                dLog3 = dLog2;
                while (i10 < 6) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d10));
                }
                d11 = dLog3 / d10;
                if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    dLog = d11;
                } else {
                    if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!(!z11)) {
                        dLog = Math.max(dLog, d11);
                    }
                }
                d12 = (-(d36 + d37)) / (d10 * d37);
                if (Double.isNaN(d12) || d12 <= 0.0d) {
                    d13 = -d22;
                    d14 = dLog;
                } else {
                    if (d12 > 0.0d) {
                        double d38 = d10 * d12;
                        if ((-((Math.exp(d38) * d12 * d37) + (Math.exp(d38) * dAbs))) < d22) {
                            if (d37 < 0.0d && dAbs > 0.0d) {
                                dLog = 0.0d;
                            }
                            d13 = -d22;
                            d14 = dLog;
                        }
                    }
                    d14 = (-(2.0d / d10)) - (dAbs / d37);
                    d13 = d22;
                }
                interfaceC2052l = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d39) {
                        double dDoubleValue2 = d39.doubleValue();
                        return Double.valueOf((Math.exp(d10 * dDoubleValue2) * ((d37 * dDoubleValue2) + dAbs)) + d13);
                    }
                };
                interfaceC2052l2 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d39) {
                        double dDoubleValue2 = d39.doubleValue();
                        double d40 = d10;
                        double d41 = dDoubleValue2 * d40;
                        return Double.valueOf(Math.exp(d41) * ((dAbs * d40) + ((((double) 1) + d41) * d37)));
                    }
                };
                dLog4 = d14;
                i11 = 0;
                while (dAbs2 > 0.001d && i11 < 100) {
                    i11++;
                    double dDoubleValue2 = dLog4 - (((Number) interfaceC2052l.mo528n(Double.valueOf(dLog4))).doubleValue() / ((Number) interfaceC2052l2.mo528n(Double.valueOf(dLog4))).doubleValue());
                    dAbs2 = Math.abs(dLog4 - dDoubleValue2);
                    dLog4 = dDoubleValue2;
                }
            }
            j10 = (long) (dLog4 * 1000.0d);
        } else if (d20 == 0.0d) {
            j10 = 0;
        } else {
            if (d21 < 0.0d) {
                d20 = -d20;
            }
            dAbs = Math.abs(d21);
            dAbs2 = Double.MAX_VALUE;
            if (d19 > 1.0d) {
                final double d210 = c8915kM405v0.f46821a;
                final double d211 = c8915kM405v1.f46821a;
                double d39 = d210 - d211;
                final double d310 = ((d210 * dAbs) - d20) / d39;
                final double d311 = dAbs - d310;
                dLog4 = Math.log(Math.abs(d22 / d311)) / d210;
                dLog5 = Math.log(Math.abs(d22 / d310)) / d211;
                if (Double.isInfinite(dLog4)) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    dLog4 = dLog5;
                } else {
                    if (Double.isInfinite(dLog5)) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (!(!z13)) {
                        dLog4 = Math.max(dLog4, dLog5);
                    }
                }
                double d312 = d311 * d210;
                dLog6 = Math.log(d312 / ((-d310) * d211)) / (d211 - d210);
                if (Double.isNaN(dLog6)) {
                    d15 = -d22;
                } else {
                    d15 = -d22;
                }
                interfaceC2052l3 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d313) {
                        double dDoubleValue3 = d313.doubleValue();
                        return Double.valueOf((Math.exp(d211 * dDoubleValue3) * d310) + (Math.exp(d210 * dDoubleValue3) * d311) + d15);
                    }
                };
                interfaceC2052l4 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d313) {
                        double dDoubleValue3 = d313.doubleValue();
                        double d314 = d311;
                        double d315 = d210;
                        double dExp = Math.exp(d315 * dDoubleValue3) * d314 * d315;
                        double d316 = d310;
                        double d317 = d211;
                        return Double.valueOf((Math.exp(d317 * dDoubleValue3) * d316 * d317) + dExp);
                    }
                };
                if (Math.abs(((Number) interfaceC2052l3.mo528n(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    i12 = 0;
                    while (dAbs2 > 0.001d) {
                        i12++;
                        double dDoubleValue3 = dLog4 - (((Number) interfaceC2052l3.mo528n(Double.valueOf(dLog4))).doubleValue() / ((Number) interfaceC2052l4.mo528n(Double.valueOf(dLog4))).doubleValue());
                        dAbs2 = Math.abs(dLog4 - dDoubleValue3);
                        dLog4 = dDoubleValue3;
                    }
                }
            } else if (d19 < 1.0d) {
                double d313 = c8915kM405v0.f46821a;
                double d314 = (d20 - (d313 * dAbs)) / c8915kM405v0.f46822b;
                dLog4 = Math.log(d22 / Math.sqrt((d314 * d314) + (dAbs * dAbs))) / d313;
            } else {
                d10 = c8915kM405v0.f46821a;
                double d315 = d10 * dAbs;
                final double d316 = d20 - d315;
                dLog = Math.log(Math.abs(d22 / dAbs)) / d10;
                dLog2 = Math.log(Math.abs(d22 / d316));
                dLog3 = dLog2;
                for (i10 = 0; i10 < 6; i10++) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d10));
                }
                d11 = dLog3 / d10;
                if (Double.isInfinite(dLog)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    dLog = d11;
                } else {
                    if (Double.isInfinite(d11)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (!(!z11)) {
                        dLog = Math.max(dLog, d11);
                    }
                }
                d12 = (-(d315 + d316)) / (d10 * d316);
                if (Double.isNaN(d12)) {
                    d13 = -d22;
                    d14 = dLog;
                } else {
                    d13 = -d22;
                    d14 = dLog;
                }
                interfaceC2052l = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d317) {
                        double dDoubleValue4 = d317.doubleValue();
                        return Double.valueOf((Math.exp(d10 * dDoubleValue4) * ((d316 * dDoubleValue4) + dAbs)) + d13);
                    }
                };
                interfaceC2052l2 = new InterfaceC2052l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Double mo528n(Double d317) {
                        double dDoubleValue4 = d317.doubleValue();
                        double d40 = d10;
                        double d41 = dDoubleValue4 * d40;
                        return Double.valueOf(Math.exp(d41) * ((dAbs * d40) + ((((double) 1) + d41) * d316)));
                    }
                };
                dLog4 = d14;
                i11 = 0;
                while (dAbs2 > 0.001d) {
                    i11++;
                    double dDoubleValue4 = dLog4 - (((Number) interfaceC2052l.mo528n(Double.valueOf(dLog4))).doubleValue() / ((Number) interfaceC2052l2.mo528n(Double.valueOf(dLog4))).doubleValue());
                    dAbs2 = Math.abs(dLog4 - dDoubleValue4);
                    dLog4 = dDoubleValue4;
                }
            }
            j10 = (long) (dLog4 * 1000.0d);
        }
        return j10 * 1000000;
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: d */
    public final float mo1387d(float f3, float f10, float f11) {
        return 0.0f;
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: e */
    public final float mo1388e(long j10, float f3, float f10, float f11) {
        C8935w c8935w = this.f1664b;
        c8935w.f46861a = f10;
        return Float.intBitsToFloat((int) (c8935w.m17154a(f3, f11, j10 / 1000000) >> 32));
    }
}
