package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class bp0 extends AbstractC1134i {
    private static final bp0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private int version_;

    static {
        bp0 bp0Var = new bp0();
        DEFAULT_INSTANCE = bp0Var;
        AbstractC1134i.m6544s(bp0.class, bp0Var);
    }

    /* JADX INFO: renamed from: A */
    public static ap0 m4019A() {
        return (ap0) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: B */
    public static bp0 m4020B(ByteString byteString, ox2 ox2Var) {
        return (bp0) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m4022w(bp0 bp0Var) {
        bp0Var.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m4023x(bp0 bp0Var, ByteString byteString) {
        bp0Var.getClass();
        bp0Var.keyValue_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (zo0.f71812a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new bp0();
            case 2:
                return new ap0();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (bp0.class) {
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
    public final ByteString m4024y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m4025z() {
        return this.version_;
    }
}
