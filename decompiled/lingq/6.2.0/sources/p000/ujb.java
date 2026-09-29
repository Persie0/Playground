package p000;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzmk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ujb implements gj3 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ujb f63992b = new ujb(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ujb f63993c = new ujb(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ujb f63994d = new ujb(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63995a;

    public /* synthetic */ ujb(int i) {
        this.f63995a = i;
    }

    @Override // p000.gj3
    public final Object apply(Object obj) {
        switch (this.f63995a) {
            case 0:
                Context context = (Context) obj;
                String strM4223b = vjb.f65515b;
                if (strM4223b == null) {
                    synchronized (vjb.class) {
                        try {
                            strM4223b = vjb.f65515b;
                            if (strM4223b == null) {
                                strM4223b = bxc.m4223b(context, "com.google.android.gms.measurement");
                                vjb.f65515b = strM4223b;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strM4223b;
            case 1:
                li1 li1Var = t9d.f62026i;
                return "";
            default:
                zzmk zzmkVar = (zzmk) obj;
                if (zzmkVar.f11920a != 29514) {
                    throw zzmkVar;
                }
                d5d d5dVarM12376v = g5d.m12376v();
                k4d k4dVarM17211F = n4d.m17211F();
                k4dVarM17211F.m14851g(System.currentTimeMillis());
                d5dVarM12376v.m10116g(k4dVarM17211F);
                return (g5d) d5dVarM12376v.m22741d();
        }
    }
}
