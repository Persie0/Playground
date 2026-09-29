package p000;

import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class ai4 extends AbstractC1134i {
    private static final ai4 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f13555b;

    static {
        ai4 ai4Var = new ai4();
        DEFAULT_INSTANCE = ai4Var;
        AbstractC1134i.m6544s(ai4.class, ai4Var);
    }

    /* JADX INFO: renamed from: C */
    public static zh4 m434C() {
        return (zh4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: v */
    public static void m435v(ai4 ai4Var, String str) {
        ai4Var.getClass();
        str.getClass();
        ai4Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m436w(ai4 ai4Var, ByteString byteString) {
        ai4Var.getClass();
        ai4Var.value_ = byteString;
    }

    /* JADX INFO: renamed from: x */
    public static void m437x(ai4 ai4Var, KeyData$KeyMaterialType keyData$KeyMaterialType) {
        ai4Var.getClass();
        ai4Var.keyMaterialType_ = keyData$KeyMaterialType.getNumber();
    }

    /* JADX INFO: renamed from: y */
    public static ai4 m438y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m439A() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: B */
    public final ByteString m440B() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (yh4.f69847a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ai4();
            case 2:
                return new zh4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (ai4.class) {
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
    public final KeyData$KeyMaterialType m442z() {
        KeyData$KeyMaterialType keyData$KeyMaterialTypeForNumber = KeyData$KeyMaterialType.forNumber(this.keyMaterialType_);
        return keyData$KeyMaterialTypeForNumber == null ? KeyData$KeyMaterialType.UNRECOGNIZED : keyData$KeyMaterialTypeForNumber;
    }
}
