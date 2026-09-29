package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends AbstractC1134i {
    private static final ek4 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private l94 keyInfo_ = io7.f44360d;
    private int primaryKeyId_;

    static {
        ek4 ek4Var = new ek4();
        DEFAULT_INSTANCE = ek4Var;
        AbstractC1134i.m6544s(ek4.class, ek4Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m11208v(ek4 ek4Var, int i) {
        ek4Var.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m11209w(ek4 ek4Var, dk4 dk4Var) {
        ek4Var.getClass();
        l94 l94Var = ek4Var.keyInfo_;
        if (!((AbstractC3282l1) l94Var).f48878a) {
            int size = l94Var.size();
            ek4Var.keyInfo_ = l94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        ek4Var.keyInfo_.add(dk4Var);
    }

    /* JADX INFO: renamed from: y */
    public static bk4 m11210y() {
        return (bk4) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (ak4.f765a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ek4();
            case 2:
                return new bk4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", dk4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (ek4.class) {
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
    public final dk4 m11211x() {
        return (dk4) this.keyInfo_.get(0);
    }
}
