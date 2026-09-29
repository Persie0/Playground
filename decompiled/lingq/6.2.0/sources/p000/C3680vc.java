package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: vc */
/* JADX INFO: loaded from: classes.dex */
public final class C3680vc extends AbstractC1134i {
    private static final C3680vc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private int version_;

    static {
        C3680vc c3680vc = new C3680vc();
        DEFAULT_INSTANCE = c3680vc;
        AbstractC1134i.m6544s(C3680vc.class, c3680vc);
    }

    /* JADX INFO: renamed from: A */
    public static C3680vc m23220A(ByteString byteString, ox2 ox2Var) {
        return (C3680vc) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m23221v(C3680vc c3680vc) {
        c3680vc.version_ = 0;
    }

    /* JADX INFO: renamed from: w */
    public static void m23222w(C3680vc c3680vc, ByteString byteString) {
        c3680vc.getClass();
        c3680vc.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: z */
    public static C3643uc m23223z() {
        return (C3643uc) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3606tc.f62121a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3680vc();
            case 2:
                return new C3643uc(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3680vc.class) {
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

    /* JADX INFO: renamed from: x */
    public final ByteString m23224x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final int m23225y() {
        return this.version_;
    }
}
