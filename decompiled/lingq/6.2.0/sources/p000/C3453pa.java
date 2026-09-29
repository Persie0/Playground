package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes.dex */
public final class C3453pa extends AbstractC1134i {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C3453pa DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile p47 PARSER;
    private C3752xa aesCtrKeyFormat_;
    private ju3 hmacKeyFormat_;

    static {
        C3453pa c3453pa = new C3453pa();
        DEFAULT_INSTANCE = c3453pa;
        AbstractC1134i.m6544s(C3453pa.class, c3453pa);
    }

    /* JADX INFO: renamed from: A */
    public static C3453pa m18998A(ByteString byteString, ox2 ox2Var) {
        return (C3453pa) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m18999v(C3453pa c3453pa, C3752xa c3752xa) {
        c3453pa.getClass();
        c3453pa.aesCtrKeyFormat_ = c3752xa;
    }

    /* JADX INFO: renamed from: w */
    public static void m19000w(C3453pa c3453pa, ju3 ju3Var) {
        c3453pa.getClass();
        c3453pa.hmacKeyFormat_ = ju3Var;
    }

    /* JADX INFO: renamed from: z */
    public static C3402oa m19001z() {
        return (C3402oa) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3365na.f52530a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3453pa();
            case 2:
                return new C3402oa(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3453pa.class) {
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
    public final C3752xa m19002x() {
        C3752xa c3752xa = this.aesCtrKeyFormat_;
        return c3752xa == null ? C3752xa.m24428x() : c3752xa;
    }

    /* JADX INFO: renamed from: y */
    public final ju3 m19003y() {
        ju3 ju3Var = this.hmacKeyFormat_;
        return ju3Var == null ? ju3.m14653x() : ju3Var;
    }
}
