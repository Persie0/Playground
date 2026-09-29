package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: db */
/* JADX INFO: loaded from: classes.dex */
public final class C2922db extends AbstractC1134i {
    private static final C2922db DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private int ivSize_;

    static {
        C2922db c2922db = new C2922db();
        DEFAULT_INSTANCE = c2922db;
        AbstractC1134i.m6544s(C2922db.class, c2922db);
    }

    /* JADX INFO: renamed from: v */
    public static void m10258v(C2922db c2922db) {
        c2922db.ivSize_ = 16;
    }

    /* JADX INFO: renamed from: w */
    public static C2922db m10259w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C0841cb m10260y() {
        return (C0841cb) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC0804bb.f8260a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C2922db();
            case 2:
                return new C0841cb(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C2922db.class) {
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
    public final int m10261x() {
        return this.ivSize_;
    }
}
