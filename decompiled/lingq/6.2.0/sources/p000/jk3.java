package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class jk3 extends AbstractC1183d {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final jk3 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile q47 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private m94 androidMemoryReadings_;
    private int bitField0_;
    private m94 cpuMetricReadings_;
    private fk3 gaugeMetadata_;
    private String sessionId_ = "";

    static {
        jk3 jk3Var = new jk3();
        DEFAULT_INSTANCE = jk3Var;
        AbstractC1183d.m6813q(jk3.class, jk3Var);
    }

    public jk3() {
        jo7 jo7Var = jo7.f45918d;
        this.cpuMetricReadings_ = jo7Var;
        this.androidMemoryReadings_ = jo7Var;
    }

    /* JADX INFO: renamed from: D */
    public static ik3 m14511D() {
        return (ik3) DEFAULT_INSTANCE.m6814j();
    }

    /* JADX INFO: renamed from: t */
    public static void m14513t(jk3 jk3Var, String str) {
        jk3Var.getClass();
        str.getClass();
        jk3Var.bitField0_ |= 1;
        jk3Var.sessionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14514u(jk3 jk3Var, C0021aj c0021aj) {
        jk3Var.getClass();
        c0021aj.getClass();
        m94 m94Var = jk3Var.androidMemoryReadings_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            jk3Var.androidMemoryReadings_ = AbstractC1183d.m6812p(m94Var);
        }
        jk3Var.androidMemoryReadings_.add(c0021aj);
    }

    /* JADX INFO: renamed from: v */
    public static void m14515v(jk3 jk3Var, fk3 fk3Var) {
        jk3Var.getClass();
        fk3Var.getClass();
        jk3Var.gaugeMetadata_ = fk3Var;
        jk3Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: w */
    public static void m14516w(jk3 jk3Var, ip1 ip1Var) {
        jk3Var.getClass();
        ip1Var.getClass();
        m94 m94Var = jk3Var.cpuMetricReadings_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            jk3Var.cpuMetricReadings_ = AbstractC1183d.m6812p(m94Var);
        }
        jk3Var.cpuMetricReadings_.add(ip1Var);
    }

    /* JADX INFO: renamed from: z */
    public static jk3 m14517z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final fk3 m14518A() {
        fk3 fk3Var = this.gaugeMetadata_;
        return fk3Var == null ? fk3.m11923v() : fk3Var;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m14519B() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m14520C() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (hk3.f42532a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new jk3();
            case 2:
                return new ik3();
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", ip1.class, "gaugeMetadata_", "androidMemoryReadings_", C0021aj.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (jk3.class) {
                    try {
                        xk3Var = PARSER;
                        if (xk3Var == null) {
                            xk3Var = new xk3();
                            PARSER = xk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return xk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m14521x() {
        return this.androidMemoryReadings_.size();
    }

    /* JADX INFO: renamed from: y */
    public final int m14522y() {
        return this.cpuMetricReadings_.size();
    }
}
