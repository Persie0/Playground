package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: ma */
/* JADX INFO: loaded from: classes.dex */
public final class C3328ma extends AbstractC1134i {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C3328ma DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C3641ua aesCtrKey_;
    private fu3 hmacKey_;
    private int version_;

    static {
        C3328ma c3328ma = new C3328ma();
        DEFAULT_INSTANCE = c3328ma;
        AbstractC1134i.m6544s(C3328ma.class, c3328ma);
    }

    /* JADX INFO: renamed from: C */
    public static C3291la m16706C() {
        return (C3291la) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: D */
    public static C3328ma m16707D(ByteString byteString, ox2 ox2Var) {
        return (C3328ma) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m16709w(C3328ma c3328ma) {
        c3328ma.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m16710x(C3328ma c3328ma, C3641ua c3641ua) {
        c3328ma.getClass();
        c3641ua.getClass();
        c3328ma.aesCtrKey_ = c3641ua;
    }

    /* JADX INFO: renamed from: y */
    public static void m16711y(C3328ma c3328ma, fu3 fu3Var) {
        c3328ma.getClass();
        fu3Var.getClass();
        c3328ma.hmacKey_ = fu3Var;
    }

    /* JADX INFO: renamed from: A */
    public final fu3 m16712A() {
        fu3 fu3Var = this.hmacKey_;
        return fu3Var == null ? fu3.m12148z() : fu3Var;
    }

    /* JADX INFO: renamed from: B */
    public final int m16713B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3177ka.f46921a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3328ma();
            case 2:
                return new C3291la();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3328ma.class) {
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
    public final C3641ua m16714z() {
        C3641ua c3641ua = this.aesCtrKey_;
        return c3641ua == null ? C3641ua.m22648y() : c3641ua;
    }
}
