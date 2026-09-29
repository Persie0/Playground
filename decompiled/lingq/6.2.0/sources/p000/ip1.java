package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class ip1 extends AbstractC1183d {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final ip1 DEFAULT_INSTANCE;
    private static volatile q47 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        ip1 ip1Var = new ip1();
        DEFAULT_INSTANCE = ip1Var;
        AbstractC1183d.m6813q(ip1.class, ip1Var);
    }

    /* JADX INFO: renamed from: s */
    public static void m14059s(ip1 ip1Var, long j) {
        ip1Var.bitField0_ |= 1;
        ip1Var.clientTimeUs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m14060t(ip1 ip1Var, long j) {
        ip1Var.bitField0_ |= 2;
        ip1Var.userTimeUs_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14061u(ip1 ip1Var, long j) {
        ip1Var.bitField0_ |= 4;
        ip1Var.systemTimeUs_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static hp1 m14062v() {
        return (hp1) DEFAULT_INSTANCE.m6814j();
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (gp1.f41125a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ip1();
            case 2:
                return new hp1(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (ip1.class) {
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
}
