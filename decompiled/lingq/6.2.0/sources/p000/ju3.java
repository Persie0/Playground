package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 extends AbstractC1134i {
    private static final ju3 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private ou3 params_;
    private int version_;

    static {
        ju3 ju3Var = new ju3();
        DEFAULT_INSTANCE = ju3Var;
        AbstractC1134i.m6544s(ju3.class, ju3Var);
    }

    /* JADX INFO: renamed from: A */
    public static iu3 m14649A() {
        return (iu3) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static ju3 m14650B(ByteString byteString, ox2 ox2Var) {
        return (ju3) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m14651v(ju3 ju3Var, ou3 ou3Var) {
        ju3Var.getClass();
        ju3Var.params_ = ou3Var;
    }

    /* JADX INFO: renamed from: w */
    public static void m14652w(ju3 ju3Var, int i) {
        ju3Var.keySize_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static ju3 m14653x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (hu3.f42940a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ju3();
            case 2:
                return new iu3(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (ju3.class) {
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
    public final int m14654y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final ou3 m14655z() {
        ou3 ou3Var = this.params_;
        return ou3Var == null ? ou3.m18517x() : ou3Var;
    }
}
