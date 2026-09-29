package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class hr4 extends AbstractC0675i {
    private static final hr4 DEFAULT_INSTANCE;
    private static volatile r47 PARSER;

    static {
        hr4 hr4Var = new hr4();
        DEFAULT_INSTANCE = hr4Var;
        AbstractC0675i.m2381k(hr4.class, hr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static gr4 m13437n() {
        return (gr4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new hr4();
            case 2:
                return new gr4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (hr4.class) {
                    try {
                        yk3Var = PARSER;
                        if (yk3Var == null) {
                            yk3Var = new yk3();
                            PARSER = yk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return yk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }
}
