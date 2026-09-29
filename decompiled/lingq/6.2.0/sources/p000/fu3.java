package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class fu3 extends AbstractC1134i {
    private static final fu3 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private ou3 params_;
    private int version_;

    static {
        fu3 fu3Var = new fu3();
        DEFAULT_INSTANCE = fu3Var;
        AbstractC1134i.m6544s(fu3.class, fu3Var);
    }

    /* JADX INFO: renamed from: D */
    public static eu3 m12142D() {
        return (eu3) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: E */
    public static fu3 m12143E(ByteString byteString, ox2 ox2Var) {
        return (fu3) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m12145w(fu3 fu3Var) {
        fu3Var.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m12146x(fu3 fu3Var, ou3 ou3Var) {
        fu3Var.getClass();
        ou3Var.getClass();
        fu3Var.params_ = ou3Var;
    }

    /* JADX INFO: renamed from: y */
    public static void m12147y(fu3 fu3Var, ByteString byteString) {
        fu3Var.getClass();
        fu3Var.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: z */
    public static fu3 m12148z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final ByteString m12149A() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: B */
    public final ou3 m12150B() {
        ou3 ou3Var = this.params_;
        return ou3Var == null ? ou3.m18517x() : ou3Var;
    }

    /* JADX INFO: renamed from: C */
    public final int m12151C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (du3.f36241a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new fu3();
            case 2:
                return new eu3();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (fu3.class) {
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
}
