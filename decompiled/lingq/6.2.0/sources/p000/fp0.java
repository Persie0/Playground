package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends AbstractC1134i {
    private static final fp0 DEFAULT_INSTANCE;
    private static volatile p47 PARSER;

    static {
        fp0 fp0Var = new fp0();
        DEFAULT_INSTANCE = fp0Var;
        AbstractC1134i.m6544s(fp0.class, fp0Var);
    }

    /* JADX INFO: renamed from: w */
    public static fp0 m11978w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static fp0 m11979x(ByteString byteString, ox2 ox2Var) {
        return (fp0) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (dp0.f35982a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new fp0();
            case 2:
                return new ep0(0);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (fp0.class) {
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
