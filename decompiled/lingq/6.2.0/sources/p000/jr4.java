package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.ByteString;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class jr4 extends AbstractC0675i {
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    private static final jr4 DEFAULT_INSTANCE;
    private static volatile r47 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private ByteString bundle_ = ByteString.f6037b;

    static {
        jr4 jr4Var = new jr4();
        DEFAULT_INSTANCE = jr4Var;
        AbstractC0675i.m2381k(jr4.class, jr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m14620n(jr4 jr4Var, String str) {
        jr4Var.getClass();
        str.getClass();
        jr4Var.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14621o(jr4 jr4Var, int i) {
        jr4Var.appWidgetId_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14622p(jr4 jr4Var, ByteString byteString) {
        jr4Var.getClass();
        jr4Var.bundle_ = byteString;
    }

    /* JADX INFO: renamed from: s */
    public static jr4 m14623s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static ir4 m14624u() {
        return (ir4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new jr4();
            case 2:
                return new ir4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"receiver_", "appWidgetId_", "bundle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (jr4.class) {
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

    /* JADX INFO: renamed from: q */
    public final int m14625q() {
        return this.appWidgetId_;
    }

    /* JADX INFO: renamed from: r */
    public final ByteString m14626r() {
        return this.bundle_;
    }

    /* JADX INFO: renamed from: t */
    public final String m14627t() {
        return this.receiver_;
    }
}
