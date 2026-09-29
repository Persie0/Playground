package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes.dex */
public final class qk4 extends AbstractC1134i {
    private static final qk4 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile p47 PARSER;
    private wi4 dekTemplate_;
    private String kekUri_ = "";

    static {
        qk4 qk4Var = new qk4();
        DEFAULT_INSTANCE = qk4Var;
        AbstractC1134i.m6544s(qk4.class, qk4Var);
    }

    /* JADX INFO: renamed from: A */
    public static qk4 m20013A(ByteString byteString, ox2 ox2Var) {
        return (qk4) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static qk4 m20015w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (pk4.f56346a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new qk4();
            case 2:
                return new ep0(3);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (qk4.class) {
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
    public final wi4 m20016x() {
        wi4 wi4Var = this.dekTemplate_;
        return wi4Var == null ? wi4.m23982y() : wi4Var;
    }

    /* JADX INFO: renamed from: y */
    public final String m20017y() {
        return this.kekUri_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20018z() {
        return this.dekTemplate_ != null;
    }
}
