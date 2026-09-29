package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class s9b extends AbstractC1134i {
    private static final s9b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private int version_;

    static {
        s9b s9bVar = new s9b();
        DEFAULT_INSTANCE = s9bVar;
        AbstractC1134i.m6544s(s9b.class, s9bVar);
    }

    /* JADX INFO: renamed from: A */
    public static r9b m21175A() {
        return (r9b) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static s9b m21176B(ByteString byteString, ox2 ox2Var) {
        return (s9b) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m21178w(s9b s9bVar) {
        s9bVar.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m21179x(s9b s9bVar, ByteString byteString) {
        s9bVar.getClass();
        s9bVar.keyValue_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (q9b.f57483a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new s9b();
            case 2:
                return new r9b();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (s9b.class) {
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
    public final ByteString m21180y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m21181z() {
        return this.version_;
    }
}
