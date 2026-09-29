package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class jk4 extends AbstractC1134i {
    private static final jk4 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private String keyUri_ = "";

    static {
        jk4 jk4Var = new jk4();
        DEFAULT_INSTANCE = jk4Var;
        AbstractC1134i.m6544s(jk4.class, jk4Var);
    }

    /* JADX INFO: renamed from: w */
    public static jk4 m14524w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static jk4 m14525y(ByteString byteString, ox2 ox2Var) {
        return (jk4) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (ik4.f44221a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new jk4();
            case 2:
                return new ep0(2);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (jk4.class) {
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
    public final String m14526x() {
        return this.keyUri_;
    }
}
