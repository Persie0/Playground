package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class ok4 extends AbstractC1134i {
    private static final ok4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private qk4 params_;
    private int version_;

    static {
        ok4 ok4Var = new ok4();
        DEFAULT_INSTANCE = ok4Var;
        AbstractC1134i.m6544s(ok4.class, ok4Var);
    }

    /* JADX INFO: renamed from: A */
    public static nk4 m18057A() {
        return (nk4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static ok4 m18058B(ByteString byteString, ox2 ox2Var) {
        return (ok4) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m18060w(ok4 ok4Var) {
        ok4Var.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m18061x(ok4 ok4Var, qk4 qk4Var) {
        ok4Var.getClass();
        qk4Var.getClass();
        ok4Var.params_ = qk4Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (mk4.f51436a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ok4();
            case 2:
                return new nk4();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (ok4.class) {
                    try {
                        wk3Var = PARSER;
                        if (wk3Var == null) {
                            wk3Var = new wk3();
                            PARSER = wk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final qk4 m18062y() {
        qk4 qk4Var = this.params_;
        return qk4Var == null ? qk4.m20015w() : qk4Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m18063z() {
        return this.version_;
    }
}
