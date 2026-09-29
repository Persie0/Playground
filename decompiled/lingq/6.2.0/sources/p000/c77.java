package p000;

import com.google.firebase.perf.p010v1.SessionVerbosity;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c77 extends AbstractC1183d {
    private static final c77 DEFAULT_INSTANCE;
    private static volatile q47 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final k94 sessionVerbosity_converter_ = new tr3(14);
    private int bitField0_;
    private String sessionId_ = "";
    private i94 sessionVerbosity_ = u74.f63511d;

    static {
        c77 c77Var = new c77();
        DEFAULT_INSTANCE = c77Var;
        AbstractC1183d.m6813q(c77.class, c77Var);
    }

    /* JADX INFO: renamed from: s */
    public static void m4389s(c77 c77Var, String str) {
        c77Var.getClass();
        str.getClass();
        c77Var.bitField0_ |= 1;
        c77Var.sessionId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m4390t(c77 c77Var, SessionVerbosity sessionVerbosity) {
        c77Var.getClass();
        sessionVerbosity.getClass();
        List list = c77Var.sessionVerbosity_;
        if (!((AbstractC3319m1) list).f50407a) {
            int size = list.size();
            int i = size == 0 ? 10 : size * 2;
            u74 u74Var = (u74) list;
            if (i < u74Var.f63513c) {
                ij6.m13959q();
                return;
            }
            c77Var.sessionVerbosity_ = new u74(Arrays.copyOf(u74Var.f63512b, i), u74Var.f63513c, true);
        }
        ((u74) c77Var.sessionVerbosity_).addInt(sessionVerbosity.getNumber());
    }

    /* JADX INFO: renamed from: w */
    public static b77 m4391w() {
        return (b77) DEFAULT_INSTANCE.m6814j();
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (a77.f323a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new c77();
            case 2:
                return new b77(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (c77.class) {
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

    /* JADX INFO: renamed from: u */
    public final SessionVerbosity m4392u() {
        SessionVerbosity sessionVerbosityForNumber = SessionVerbosity.forNumber(((u74) this.sessionVerbosity_).getInt(0));
        return sessionVerbosityForNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityForNumber;
    }

    /* JADX INFO: renamed from: v */
    public final int m4393v() {
        return this.sessionVerbosity_.size();
    }
}
