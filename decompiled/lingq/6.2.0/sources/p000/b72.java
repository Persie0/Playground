package p000;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class b72 {

    /* JADX INFO: renamed from: a */
    public int f8040a;

    /* JADX INFO: renamed from: b */
    public boolean f8041b;

    /* JADX INFO: renamed from: c */
    public int f8042c;

    /* JADX INFO: renamed from: d */
    public float f8043d;

    /* JADX INFO: renamed from: e */
    public Object f8044e;

    /* JADX INFO: renamed from: a */
    public static int m3393a(hv4 hv4Var, boolean z) {
        return z ? ((iv4) u91.m22597O0(hv4Var.f42985k)).f44648a + 1 : ((iv4) u91.m22589G0(hv4Var.f42985k)).f44648a - 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m3394b(ss4 ss4Var, boolean z) {
        if (z) {
            ts4 ts4Var = (ts4) u91.m22597O0(ss4Var.f61346m);
            return (ss4Var.f61350q == Orientation.Vertical ? ts4Var.f62821x : ts4Var.f62822y) + 1;
        }
        ts4 ts4Var2 = (ts4) u91.m22589G0(ss4Var.f61346m);
        return (ss4Var.f61350q == Orientation.Vertical ? ts4Var2.f62821x : ts4Var2.f62822y) - 1;
    }
}
