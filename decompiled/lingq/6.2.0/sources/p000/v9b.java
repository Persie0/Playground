package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class v9b extends AbstractC1134i {
    private static final v9b DEFAULT_INSTANCE;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        v9b v9bVar = new v9b();
        DEFAULT_INSTANCE = v9bVar;
        AbstractC1134i.m6544s(v9b.class, v9bVar);
    }

    /* JADX INFO: renamed from: w */
    public static v9b m23195w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static v9b m23196x(ByteString byteString, ox2 ox2Var) {
        return (v9b) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (u9b.f63625a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new v9b();
            case 2:
                return new ep0(5);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (v9b.class) {
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
}
