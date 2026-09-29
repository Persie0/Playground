package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: loaded from: classes.dex */
public final class C3677v9 extends AbstractC1134i {
    private static final C3677v9 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private C3068ha params_;
    private int version_;

    static {
        C3677v9 c3677v9 = new C3677v9();
        DEFAULT_INSTANCE = c3677v9;
        AbstractC1134i.m6544s(C3677v9.class, c3677v9);
    }

    /* JADX INFO: renamed from: C */
    public static C3640u9 m23180C() {
        return (C3640u9) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: D */
    public static C3677v9 m23181D(ByteString byteString, ox2 ox2Var) {
        return (C3677v9) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m23183w(C3677v9 c3677v9) {
        c3677v9.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m23184x(C3677v9 c3677v9, ByteString byteString) {
        c3677v9.getClass();
        c3677v9.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: y */
    public static void m23185y(C3677v9 c3677v9, C3068ha c3068ha) {
        c3677v9.getClass();
        c3068ha.getClass();
        c3677v9.params_ = c3068ha;
    }

    /* JADX INFO: renamed from: A */
    public final C3068ha m23186A() {
        C3068ha c3068ha = this.params_;
        return c3068ha == null ? C3068ha.m13150w() : c3068ha;
    }

    /* JADX INFO: renamed from: B */
    public final int m23187B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3603t9.f62007a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3677v9();
            case 2:
                return new C3640u9();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3677v9.class) {
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
    public final ByteString m23188z() {
        return this.keyValue_;
    }
}
