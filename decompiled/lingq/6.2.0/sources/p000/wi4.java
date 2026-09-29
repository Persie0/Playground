package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class wi4 extends AbstractC1134i {
    private static final wi4 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f13555b;

    static {
        wi4 wi4Var = new wi4();
        DEFAULT_INSTANCE = wi4Var;
        AbstractC1134i.m6544s(wi4.class, wi4Var);
    }

    /* JADX INFO: renamed from: C */
    public static vi4 m23978C() {
        return (vi4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: v */
    public static void m23979v(wi4 wi4Var, String str) {
        wi4Var.getClass();
        str.getClass();
        wi4Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m23980w(wi4 wi4Var, ByteString byteString) {
        wi4Var.getClass();
        wi4Var.value_ = byteString;
    }

    /* JADX INFO: renamed from: x */
    public static void m23981x(wi4 wi4Var, OutputPrefixType outputPrefixType) {
        wi4Var.getClass();
        wi4Var.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* JADX INFO: renamed from: y */
    public static wi4 m23982y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m23983A() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: B */
    public final ByteString m23984B() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (ti4.f62340a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new wi4();
            case 2:
                return new vi4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (wi4.class) {
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
    public final OutputPrefixType m23985z() {
        OutputPrefixType outputPrefixTypeForNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return outputPrefixTypeForNumber == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeForNumber;
    }
}
