package p000;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class wj4 extends AbstractC1134i {
    private static final wj4 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile p47 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private ai4 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        wj4 wj4Var = new wj4();
        DEFAULT_INSTANCE = wj4Var;
        AbstractC1134i.m6544s(wj4.class, wj4Var);
    }

    /* JADX INFO: renamed from: E */
    public static vj4 m24010E() {
        return (vj4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: v */
    public static void m24011v(wj4 wj4Var, ai4 ai4Var) {
        wj4Var.getClass();
        wj4Var.keyData_ = ai4Var;
    }

    /* JADX INFO: renamed from: w */
    public static void m24012w(wj4 wj4Var, OutputPrefixType outputPrefixType) {
        wj4Var.getClass();
        wj4Var.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* JADX INFO: renamed from: x */
    public static void m24013x(wj4 wj4Var, KeyStatusType keyStatusType) {
        wj4Var.getClass();
        wj4Var.status_ = keyStatusType.getNumber();
    }

    /* JADX INFO: renamed from: y */
    public static void m24014y(wj4 wj4Var, int i) {
        wj4Var.keyId_ = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m24015A() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: B */
    public final OutputPrefixType m24016B() {
        OutputPrefixType outputPrefixTypeForNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return outputPrefixTypeForNumber == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeForNumber;
    }

    /* JADX INFO: renamed from: C */
    public final KeyStatusType m24017C() {
        KeyStatusType keyStatusTypeForNumber = KeyStatusType.forNumber(this.status_);
        return keyStatusTypeForNumber == null ? KeyStatusType.UNRECOGNIZED : keyStatusTypeForNumber;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m24018D() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (tj4.f62413a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new wj4();
            case 2:
                return new vj4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (wj4.class) {
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
    public final ai4 m24019z() {
        ai4 ai4Var = this.keyData_;
        return ai4Var == null ? ai4.m438y() : ai4Var;
    }
}
