package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: jc */
/* JADX INFO: loaded from: classes.dex */
public final class C3142jc extends AbstractC1134i {
    private static final C3142jc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private int version_;

    static {
        C3142jc c3142jc = new C3142jc();
        DEFAULT_INSTANCE = c3142jc;
        AbstractC1134i.m6544s(C3142jc.class, c3142jc);
    }

    /* JADX INFO: renamed from: A */
    public static C3107ic m14382A() {
        return (C3107ic) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static C3142jc m14383B(ByteString byteString, ox2 ox2Var) {
        return (C3142jc) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m14385w(C3142jc c3142jc) {
        c3142jc.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m14386x(C3142jc c3142jc, ByteString byteString) {
        c3142jc.getClass();
        c3142jc.keyValue_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3070hc.f42147a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3142jc();
            case 2:
                return new C3107ic();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3142jc.class) {
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
    public final ByteString m14387y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m14388z() {
        return this.version_;
    }
}
