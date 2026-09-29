package p000;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class dk4 extends AbstractC1134i {
    private static final dk4 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile p47 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        dk4 dk4Var = new dk4();
        DEFAULT_INSTANCE = dk4Var;
        AbstractC1134i.m6544s(dk4.class, dk4Var);
    }

    /* JADX INFO: renamed from: A */
    public static ck4 m10435A() {
        return (ck4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: v */
    public static void m10436v(dk4 dk4Var, String str) {
        dk4Var.getClass();
        str.getClass();
        dk4Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m10437w(dk4 dk4Var, OutputPrefixType outputPrefixType) {
        dk4Var.getClass();
        dk4Var.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* JADX INFO: renamed from: x */
    public static void m10438x(dk4 dk4Var, KeyStatusType keyStatusType) {
        dk4Var.getClass();
        dk4Var.status_ = keyStatusType.getNumber();
    }

    /* JADX INFO: renamed from: y */
    public static void m10439y(dk4 dk4Var, int i) {
        dk4Var.keyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (ak4.f765a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new dk4();
            case 2:
                return new ck4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (dk4.class) {
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
    public final int m10440z() {
        return this.keyId_;
    }
}
