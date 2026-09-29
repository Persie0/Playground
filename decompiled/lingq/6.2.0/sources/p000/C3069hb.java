package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: hb */
/* JADX INFO: loaded from: classes.dex */
public final class C3069hb extends AbstractC1134i {
    private static final C3069hb DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f13555b;
    private C3529rb params_;
    private int version_;

    static {
        C3069hb c3069hb = new C3069hb();
        DEFAULT_INSTANCE = c3069hb;
        AbstractC1134i.m6544s(C3069hb.class, c3069hb);
    }

    /* JADX INFO: renamed from: C */
    public static C3032gb m13171C() {
        return (C3032gb) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: D */
    public static C3069hb m13172D(ByteString byteString, ox2 ox2Var) {
        return (C3069hb) AbstractC1134i.m6542q(DEFAULT_INSTANCE, byteString, ox2Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m13174w(C3069hb c3069hb) {
        c3069hb.version_ = 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m13175x(C3069hb c3069hb, C3529rb c3529rb) {
        c3069hb.getClass();
        c3529rb.getClass();
        c3069hb.params_ = c3529rb;
    }

    /* JADX INFO: renamed from: y */
    public static void m13176y(C3069hb c3069hb, ByteString byteString) {
        c3069hb.getClass();
        c3069hb.keyValue_ = byteString;
    }

    /* JADX INFO: renamed from: A */
    public final C3529rb m13177A() {
        C3529rb c3529rb = this.params_;
        return c3529rb == null ? C3529rb.m20560w() : c3529rb;
    }

    /* JADX INFO: renamed from: B */
    public final int m13178B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC2995fb.f38748a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3069hb();
            case 2:
                return new C3032gb();
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3069hb.class) {
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

    /* JADX INFO: renamed from: z */
    public final ByteString m13179z() {
        return this.keyValue_;
    }
}
