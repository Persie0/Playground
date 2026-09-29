package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: ua */
/* JADX INFO: loaded from: classes2.dex */
public final class C3641ua extends AbstractC1134i {
    private static final C3641ua DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private C2922db params_;
    private int version_;

    static {
        C3641ua c3641ua = new C3641ua();
        DEFAULT_INSTANCE = c3641ua;
        AbstractC1134i.m6544s(C3641ua.class, c3641ua);
    }

    /* JADX INFO: renamed from: C */
    public static C3604ta m22643C() {
        return (C3604ta) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: D */
    public static C3641ua m22644D(ByteString byteString, ox2 ox2Var) {
        return (C3641ua) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m22645v(C3641ua c3641ua) {
        c3641ua.version_ = 0;
    }

    /* JADX INFO: renamed from: w */
    public static void m22646w(C3641ua c3641ua, C2922db c2922db) {
        c3641ua.getClass();
        c2922db.getClass();
        c3641ua.params_ = c2922db;
    }

    /* JADX INFO: renamed from: x */
    public static void m22647x(C3641ua c3641ua, ByteString byteString) {
        c3641ua.getClass();
        c3641ua.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: y */
    public static C3641ua m22648y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C2922db m22649A() {
        C2922db c2922db = this.params_;
        return c2922db == null ? C2922db.m10259w() : c2922db;
    }

    /* JADX INFO: renamed from: B */
    public final int m22650B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3567sa.f60572a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3641ua();
            case 2:
                return new C3604ta(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3641ua.class) {
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

    /* JADX INFO: renamed from: z */
    public final ByteString m22651z() {
        return this.keyValue_;
    }
}
