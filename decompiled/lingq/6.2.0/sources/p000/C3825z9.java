package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C3825z9 extends AbstractC1134i {
    private static final C3825z9 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER;
    private int keySize_;
    private C3068ha params_;

    static {
        C3825z9 c3825z9 = new C3825z9();
        DEFAULT_INSTANCE = c3825z9;
        AbstractC1134i.m6544s(C3825z9.class, c3825z9);
    }

    /* JADX INFO: renamed from: A */
    public static C3825z9 m25505A(ByteString byteString, ox2 ox2Var) {
        return (C3825z9) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m25506v(C3825z9 c3825z9) {
        c3825z9.keySize_ = 32;
    }

    /* JADX INFO: renamed from: w */
    public static void m25507w(C3825z9 c3825z9, C3068ha c3068ha) {
        c3825z9.getClass();
        c3825z9.params_ = c3068ha;
    }

    /* JADX INFO: renamed from: z */
    public static C3788y9 m25508z() {
        return (C3788y9) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3751x9.f67943a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3825z9();
            case 2:
                return new C3788y9(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3825z9.class) {
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
    public final int m25509x() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: y */
    public final C3068ha m25510y() {
        C3068ha c3068ha = this.params_;
        return c3068ha == null ? C3068ha.m13150w() : c3068ha;
    }
}
