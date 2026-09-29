package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes.dex */
public final class C0805bc extends AbstractC1134i {
    private static final C0805bc DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        C0805bc c0805bc = new C0805bc();
        DEFAULT_INSTANCE = c0805bc;
        AbstractC1134i.m6544s(C0805bc.class, c0805bc);
    }

    /* JADX INFO: renamed from: v */
    public static void m3601v(C0805bc c0805bc, int i) {
        c0805bc.keySize_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static C0014ac m3602x() {
        return (C0014ac) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: y */
    public static C0805bc m3603y(ByteString byteString, ox2 ox2Var) {
        return (C0805bc) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC3827zb.f71296a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C0805bc();
            case 2:
                return new C0014ac(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C0805bc.class) {
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
    public final int m3604w() {
        return this.keySize_;
    }
}
