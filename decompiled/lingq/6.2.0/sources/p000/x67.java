package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class x67 extends AbstractC1183d implements y67 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final x67 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile q47 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C3435ot applicationInfo_;
    private int bitField0_;
    private jk3 gaugeMetric_;
    private kk6 networkRequestMetric_;
    private e8a traceMetric_;
    private kba transportInfo_;

    static {
        x67 x67Var = new x67();
        DEFAULT_INSTANCE = x67Var;
        AbstractC1183d.m6813q(x67.class, x67Var);
    }

    /* JADX INFO: renamed from: s */
    public static void m24317s(x67 x67Var, C3435ot c3435ot) {
        x67Var.getClass();
        x67Var.applicationInfo_ = c3435ot;
        x67Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m24318t(x67 x67Var, jk3 jk3Var) {
        x67Var.getClass();
        x67Var.gaugeMetric_ = jk3Var;
        x67Var.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: u */
    public static void m24319u(x67 x67Var, e8a e8aVar) {
        x67Var.getClass();
        x67Var.traceMetric_ = e8aVar;
        x67Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: v */
    public static void m24320v(x67 x67Var, kk6 kk6Var) {
        x67Var.getClass();
        x67Var.networkRequestMetric_ = kk6Var;
        x67Var.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: y */
    public static w67 m24321y() {
        return (w67) DEFAULT_INSTANCE.m6814j();
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: a */
    public final boolean mo23771a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: b */
    public final boolean mo23772b() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: c */
    public final e8a mo23773c() {
        e8a e8aVar = this.traceMetric_;
        return e8aVar == null ? e8a.m10923F() : e8aVar;
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: d */
    public final boolean mo23774d() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: e */
    public final kk6 mo23775e() {
        kk6 kk6Var = this.networkRequestMetric_;
        return kk6Var == null ? kk6.m15298G() : kk6Var;
    }

    @Override // p000.y67
    /* JADX INFO: renamed from: f */
    public final jk3 mo23776f() {
        jk3 jk3Var = this.gaugeMetric_;
        return jk3Var == null ? jk3.m14517z() : jk3Var;
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (v67.f64938a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new x67();
            case 2:
                return new w67(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (x67.class) {
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

    /* JADX INFO: renamed from: w */
    public final C3435ot m24322w() {
        C3435ot c3435ot = this.applicationInfo_;
        return c3435ot == null ? C3435ot.m18470y() : c3435ot;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m24323x() {
        return (this.bitField0_ & 1) != 0;
    }
}
