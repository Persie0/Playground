package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: lb */
/* JADX INFO: loaded from: classes.dex */
public final class C3292lb extends AbstractC1134i {
    private static final C3292lb DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private int keySize_;
    private C3529rb params_;

    static {
        C3292lb c3292lb = new C3292lb();
        DEFAULT_INSTANCE = c3292lb;
        AbstractC1134i.m6544s(C3292lb.class, c3292lb);
    }

    /* JADX INFO: renamed from: A */
    public static C3292lb m16051A(ByteString byteString, ox2 ox2Var) {
        return (C3292lb) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m16052v(C3292lb c3292lb, C3529rb c3529rb) {
        c3292lb.getClass();
        c3292lb.params_ = c3529rb;
    }

    /* JADX INFO: renamed from: w */
    public static void m16053w(C3292lb c3292lb, int i) {
        c3292lb.keySize_ = i;
    }

    /* JADX INFO: renamed from: z */
    public static C3178kb m16054z() {
        return (C3178kb) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3141jb.f45367a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3292lb();
            case 2:
                return new C3178kb(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3292lb.class) {
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
    public final int m16055x() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: y */
    public final C3529rb m16056y() {
        C3529rb c3529rb = this.params_;
        return c3529rb == null ? C3529rb.m20560w() : c3529rb;
    }
}
