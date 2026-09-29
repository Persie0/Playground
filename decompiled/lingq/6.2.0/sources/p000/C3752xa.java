package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: xa */
/* JADX INFO: loaded from: classes.dex */
public final class C3752xa extends AbstractC1134i {
    private static final C3752xa DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private int keySize_;
    private C2922db params_;

    static {
        C3752xa c3752xa = new C3752xa();
        DEFAULT_INSTANCE = c3752xa;
        AbstractC1134i.m6544s(C3752xa.class, c3752xa);
    }

    /* JADX INFO: renamed from: A */
    public static C3715wa m24424A() {
        return (C3715wa) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static C3752xa m24425B(ByteString byteString, ox2 ox2Var) {
        return (C3752xa) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m24426v(C3752xa c3752xa, C2922db c2922db) {
        c3752xa.getClass();
        c3752xa.params_ = c2922db;
    }

    /* JADX INFO: renamed from: w */
    public static void m24427w(C3752xa c3752xa, int i) {
        c3752xa.keySize_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static C3752xa m24428x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3678va.f65087a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3752xa();
            case 2:
                return new C3715wa(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3752xa.class) {
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
    public final int m24429y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final C2922db m24430z() {
        C2922db c2922db = this.params_;
        return c2922db == null ? C2922db.m10259w() : c2922db;
    }
}
