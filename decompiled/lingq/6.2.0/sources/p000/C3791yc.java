package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: yc */
/* JADX INFO: loaded from: classes.dex */
public final class C3791yc extends AbstractC1134i {
    private static final C3791yc DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        C3791yc c3791yc = new C3791yc();
        DEFAULT_INSTANCE = c3791yc;
        AbstractC1134i.m6544s(C3791yc.class, c3791yc);
    }

    /* JADX INFO: renamed from: v */
    public static void m25063v(C3791yc c3791yc) {
        c3791yc.keySize_ = 64;
    }

    /* JADX INFO: renamed from: x */
    public static C3754xc m25064x() {
        return (C3754xc) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: y */
    public static C3791yc m25065y(ByteString byteString, ox2 ox2Var) {
        return (C3791yc) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3717wc.f66608a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3791yc();
            case 2:
                return new C3754xc(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3791yc.class) {
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
    public final int m25066w() {
        return this.keySize_;
    }
}
