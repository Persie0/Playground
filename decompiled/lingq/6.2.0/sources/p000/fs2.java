package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C1129d;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 extends AbstractC1134i {
    private static final fs2 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile p47 PARSER;
    private ByteString encryptedKeyset_ = ByteString.f13555b;
    private ek4 keysetInfo_;

    static {
        fs2 fs2Var = new fs2();
        DEFAULT_INSTANCE = fs2Var;
        AbstractC1134i.m6544s(fs2.class, fs2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m12047v(fs2 fs2Var, ByteString byteString) {
        fs2Var.getClass();
        fs2Var.encryptedKeyset_ = byteString;
    }

    /* JADX INFO: renamed from: w */
    public static void m12048w(fs2 fs2Var, ek4 ek4Var) {
        fs2Var.getClass();
        fs2Var.keysetInfo_ = ek4Var;
    }

    /* JADX INFO: renamed from: y */
    public static es2 m12049y() {
        return (es2) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: z */
    public static fs2 m12050z(ByteArrayInputStream byteArrayInputStream, ox2 ox2Var) throws InvalidProtocolBufferException {
        AbstractC1134i abstractC1134iM6543r = AbstractC1134i.m6543r(DEFAULT_INSTANCE, new C1129d(byteArrayInputStream), ox2Var);
        AbstractC1134i.m6538f(abstractC1134iM6543r);
        return (fs2) abstractC1134iM6543r;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (ds2.f36155a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new fs2();
            case 2:
                return new es2(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (fs2.class) {
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
    public final ByteString m12051x() {
        return this.encryptedKeyset_;
    }
}
