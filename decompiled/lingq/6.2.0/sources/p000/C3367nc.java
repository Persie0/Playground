package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: nc */
/* JADX INFO: loaded from: classes.dex */
public final class C3367nc extends AbstractC1134i {
    private static final C3367nc DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        C3367nc c3367nc = new C3367nc();
        DEFAULT_INSTANCE = c3367nc;
        AbstractC1134i.m6544s(C3367nc.class, c3367nc);
    }

    /* JADX INFO: renamed from: v */
    public static void m17321v(C3367nc c3367nc, int i) {
        c3367nc.keySize_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static C3330mc m17322x() {
        return (C3330mc) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: y */
    public static C3367nc m17323y(ByteString byteString, ox2 ox2Var) {
        return (C3367nc) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3293lc.f49420a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3367nc();
            case 2:
                return new C3330mc(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3367nc.class) {
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

    /* JADX INFO: renamed from: w */
    public final int m17324w() {
        return this.keySize_;
    }
}
