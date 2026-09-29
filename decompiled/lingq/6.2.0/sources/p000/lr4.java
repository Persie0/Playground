package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.ByteString;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class lr4 extends AbstractC0675i {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final lr4 DEFAULT_INSTANCE;
    private static volatile r47 PARSER;
    private int appWidgetId_;
    private String className_ = "";
    private ByteString actionParameters_ = ByteString.f6037b;

    static {
        lr4 lr4Var = new lr4();
        DEFAULT_INSTANCE = lr4Var;
        AbstractC0675i.m2381k(lr4.class, lr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m16470n(lr4 lr4Var, String str) {
        lr4Var.getClass();
        lr4Var.className_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m16471o(lr4 lr4Var, int i) {
        lr4Var.appWidgetId_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m16472p(lr4 lr4Var, ByteString byteString) {
        lr4Var.getClass();
        lr4Var.actionParameters_ = byteString;
    }

    /* JADX INFO: renamed from: t */
    public static lr4 m16473t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static kr4 m16474u() {
        return (kr4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new lr4();
            case 2:
                return new kr4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (lr4.class) {
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
    public final ByteString m16475q() {
        return this.actionParameters_;
    }

    /* JADX INFO: renamed from: r */
    public final int m16476r() {
        return this.appWidgetId_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16477s() {
        return this.className_;
    }
}
