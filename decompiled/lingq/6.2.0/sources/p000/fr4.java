package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class fr4 extends AbstractC0675i {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final fr4 DEFAULT_INSTANCE;
    private static volatile r47 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private String actionKey_ = "";

    static {
        fr4 fr4Var = new fr4();
        DEFAULT_INSTANCE = fr4Var;
        AbstractC0675i.m2381k(fr4.class, fr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m12011n(fr4 fr4Var, String str) {
        fr4Var.getClass();
        str.getClass();
        fr4Var.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12012o(fr4 fr4Var, int i) {
        fr4Var.appWidgetId_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m12013p(fr4 fr4Var, String str) {
        fr4Var.getClass();
        fr4Var.actionKey_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static fr4 m12014s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static er4 m12015u() {
        return (er4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new fr4();
            case 2:
                return new er4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (fr4.class) {
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
    public final String m12016q() {
        return this.actionKey_;
    }

    /* JADX INFO: renamed from: r */
    public final int m12017r() {
        return this.appWidgetId_;
    }

    /* JADX INFO: renamed from: t */
    public final String m12018t() {
        return this.receiver_;
    }
}
