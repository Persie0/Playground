package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: classes2.dex */
public final class C0021aj extends AbstractC1183d {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C0021aj DEFAULT_INSTANCE;
    private static volatile q47 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        C0021aj c0021aj = new C0021aj();
        DEFAULT_INSTANCE = c0021aj;
        AbstractC1183d.m6813q(C0021aj.class, c0021aj);
    }

    /* JADX INFO: renamed from: s */
    public static void m451s(C0021aj c0021aj, long j) {
        c0021aj.bitField0_ |= 1;
        c0021aj.clientTimeUs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m452t(C0021aj c0021aj, int i) {
        c0021aj.bitField0_ |= 2;
        c0021aj.usedAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static C3834zi m453u() {
        return (C3834zi) DEFAULT_INSTANCE.m6814j();
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (AbstractC3797yi.f69859a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C0021aj();
            case 2:
                return new C3834zi(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (C0021aj.class) {
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
