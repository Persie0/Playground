package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: xb */
/* JADX INFO: loaded from: classes.dex */
public final class C3753xb extends AbstractC1134i {
    private static final C3753xb DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private int version_;

    static {
        C3753xb c3753xb = new C3753xb();
        DEFAULT_INSTANCE = c3753xb;
        AbstractC1134i.m6544s(C3753xb.class, c3753xb);
    }

    /* JADX INFO: renamed from: A */
    public static C3753xb m24433A(ByteString byteString, ox2 ox2Var) {
        return (C3753xb) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m24434v(C3753xb c3753xb) {
        c3753xb.version_ = 0;
    }

    /* JADX INFO: renamed from: w */
    public static void m24435w(C3753xb c3753xb, ByteString byteString) {
        c3753xb.getClass();
        c3753xb.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: z */
    public static C3716wb m24436z() {
        return (C3716wb) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3679vb.f65155a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3753xb();
            case 2:
                return new C3716wb(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3753xb.class) {
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
    public final ByteString m24437x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final int m24438y() {
        return this.version_;
    }
}
