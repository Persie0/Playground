package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class hk4 extends AbstractC1134i {
    private static final hk4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private jk4 params_;
    private int version_;

    static {
        hk4 hk4Var = new hk4();
        DEFAULT_INSTANCE = hk4Var;
        AbstractC1134i.m6544s(hk4.class, hk4Var);
    }

    /* JADX INFO: renamed from: A */
    public static gk4 m13303A() {
        return (gk4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static hk4 m13304B(ByteString byteString, ox2 ox2Var) {
        return (hk4) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m13306w(hk4 hk4Var) {
        hk4Var.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m13307x(hk4 hk4Var, jk4 jk4Var) {
        hk4Var.getClass();
        jk4Var.getClass();
        hk4Var.params_ = jk4Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (fk4.f39224a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new hk4();
            case 2:
                return new gk4();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (hk4.class) {
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
    public final jk4 m13308y() {
        jk4 jk4Var = this.params_;
        return jk4Var == null ? jk4.m14524w() : jk4Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m13309z() {
        return this.version_;
    }
}
