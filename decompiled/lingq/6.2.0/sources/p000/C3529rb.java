package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: rb */
/* JADX INFO: loaded from: classes.dex */
public final class C3529rb extends AbstractC1134i {
    private static final C3529rb DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private int ivSize_;

    static {
        C3529rb c3529rb = new C3529rb();
        DEFAULT_INSTANCE = c3529rb;
        AbstractC1134i.m6544s(C3529rb.class, c3529rb);
    }

    /* JADX INFO: renamed from: v */
    public static void m20559v(C3529rb c3529rb) {
        c3529rb.ivSize_ = 16;
    }

    /* JADX INFO: renamed from: w */
    public static C3529rb m20560w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C3491qb m20561y() {
        return (C3491qb) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3454pb.f55909a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3529rb();
            case 2:
                return new C3491qb(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3529rb.class) {
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
    public final int m20562x() {
        return this.ivSize_;
    }
}
