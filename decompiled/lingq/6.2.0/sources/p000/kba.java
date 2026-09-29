package p000;

import com.google.firebase.perf.p010v1.TransportInfo$DispatchDestination;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class kba extends AbstractC1183d {
    private static final kba DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile q47 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        kba kbaVar = new kba();
        DEFAULT_INSTANCE = kbaVar;
        AbstractC1183d.m6813q(kba.class, kbaVar);
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (iba.f43909a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new kba();
            case 2:
                return new jba();
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", TransportInfo$DispatchDestination.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (kba.class) {
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
