package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: ha */
/* JADX INFO: loaded from: classes.dex */
public final class C3068ha extends AbstractC1134i {
    private static final C3068ha DEFAULT_INSTANCE;
    private static volatile p47 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C3068ha c3068ha = new C3068ha();
        DEFAULT_INSTANCE = c3068ha;
        AbstractC1134i.m6544s(C3068ha.class, c3068ha);
    }

    /* JADX INFO: renamed from: v */
    public static void m13149v(C3068ha c3068ha) {
        c3068ha.tagSize_ = 16;
    }

    /* JADX INFO: renamed from: w */
    public static C3068ha m13150w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C3031ga m13151y() {
        return (C3031ga) DEFAULT_INSTANCE.m6545g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (AbstractC2994fa.f38696a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3068ha();
            case 2:
                return new C3031ga(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (C3068ha.class) {
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
    public final int m13152x() {
        return this.tagSize_;
    }
}
