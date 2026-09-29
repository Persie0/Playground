package p000;

import androidx.glance.appwidget.protobuf.AbstractC0667a;
import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nr4 extends AbstractC0675i {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final nr4 DEFAULT_INSTANCE;
    private static volatile r47 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = "";
    private j94 appWidgetIds_ = v74.f64968d;

    static {
        nr4 nr4Var = new nr4();
        DEFAULT_INSTANCE = nr4Var;
        AbstractC0675i.m2381k(nr4.class, nr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m17598n(nr4 nr4Var, String str) {
        nr4Var.getClass();
        str.getClass();
        nr4Var.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m17599o(nr4 nr4Var, Iterable iterable) {
        List list = nr4Var.appWidgetIds_;
        if (!((AbstractC3356n1) list).f52152a) {
            int size = list.size();
            int i = size == 0 ? 10 : size * 2;
            v74 v74Var = (v74) list;
            if (i < v74Var.f64970c) {
                ij6.m13959q();
                return;
            }
            nr4Var.appWidgetIds_ = new v74(Arrays.copyOf(v74Var.f64969b, i), v74Var.f64970c, true);
        }
        AbstractC0667a.m2277a(iterable, nr4Var.appWidgetIds_);
    }

    /* JADX INFO: renamed from: q */
    public static nr4 m17600q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static mr4 m17601s() {
        return (mr4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new nr4();
            case 2:
                return new mr4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (nr4.class) {
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

    /* JADX INFO: renamed from: p */
    public final j94 m17602p() {
        return this.appWidgetIds_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17603r() {
        return this.receiver_;
    }
}
