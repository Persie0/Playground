package cc;

import android.content.Context;
import android.content.Intent;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935s6 {

    /* JADX INFO: renamed from: a */
    public final Context f10199a;

    public C1935s6(Context context) {
        C6272i.m12915i(context);
        this.f10199a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m5883a(Intent intent) {
        if (intent == null) {
            m5885c().f9942f.m5623a("onRebind called with null intent");
        } else {
            m5885c().f9938I.m5624b(intent.getAction(), "onRebind called. action");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5884b(Intent intent) {
        if (intent == null) {
            m5885c().f9942f.m5623a("onUnbind called with null intent");
        } else {
            m5885c().f9938I.m5624b(intent.getAction(), "onUnbind called for intent. action");
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1860k3 m5885c() {
        C1860k3 c1860k3 = C1897o4.m5777s(this.f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        return c1860k3;
    }
}
