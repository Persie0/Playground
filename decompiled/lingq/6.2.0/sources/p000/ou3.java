package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class ou3 extends AbstractC1134i {
    private static final ou3 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile p47 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        ou3 ou3Var = new ou3();
        DEFAULT_INSTANCE = ou3Var;
        AbstractC1134i.m6544s(ou3.class, ou3Var);
    }

    /* JADX INFO: renamed from: A */
    public static nu3 m18514A() {
        return (nu3) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: v */
    public static void m18515v(ou3 ou3Var, HashType hashType) {
        ou3Var.getClass();
        ou3Var.hash_ = hashType.getNumber();
    }

    /* JADX INFO: renamed from: w */
    public static void m18516w(ou3 ou3Var, int i) {
        ou3Var.tagSize_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static ou3 m18517x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (mu3.f51850a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new ou3();
            case 2:
                return new nu3(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (ou3.class) {
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
    public final HashType m18518y() {
        HashType hashTypeForNumber = HashType.forNumber(this.hash_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    /* JADX INFO: renamed from: z */
    public final int m18519z() {
        return this.tagSize_;
    }
}
