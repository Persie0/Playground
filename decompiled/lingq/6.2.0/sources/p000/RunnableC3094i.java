package p000;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3094i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43265a;

    public /* synthetic */ RunnableC3094i(int i) {
        this.f43265a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w24 w24Var;
        Class clsM23678b;
        ArrayList arrayListM23677a = null;
        switch (this.f43265a) {
            case 0:
                if (!lp1.f49971a.contains(AbstractC3129j.class)) {
                    try {
                        Object systemService = sy2.m21766a().getSystemService("activity");
                        systemService.getClass();
                        AbstractC3129j.m14228a((ActivityManager) systemService);
                    } catch (Exception unused) {
                        return;
                    } catch (Throwable th) {
                        lp1.m16420a(AbstractC3129j.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                int i = AlarmManagerSchedulerBroadcastReceiver.f11538a;
                break;
            case 2:
                Context contextM21766a = sy2.m21766a();
                ArrayList arrayListM23676f = w24.m23676f(contextM21766a, m24.f50455g);
                if (arrayListM23676f.isEmpty()) {
                    Object obj = m24.f50455g;
                    if (!lp1.f49971a.contains(w24.class)) {
                        try {
                            arrayListM23677a = (obj != null && (clsM23678b = (w24Var = w24.f66276a).m23678b(contextM21766a, "com.android.vending.billing.IInAppBillingService")) != null && w24Var.m23679c(clsM23678b, "getPurchaseHistory") != null) ? w24Var.m23677a(w24Var.m23680d(contextM21766a, obj)) : new ArrayList();
                        } catch (Throwable th2) {
                            lp1.m16420a(w24.class, th2);
                        }
                    }
                    arrayListM23676f = arrayListM23677a;
                }
                AtomicBoolean atomicBoolean = m24.f50449a;
                m24.m16601a(contextM21766a, arrayListM23676f, false);
                break;
            case 3:
                Context contextM21766a2 = sy2.m21766a();
                ArrayList arrayListM23676f2 = w24.m23676f(contextM21766a2, m24.f50455g);
                AtomicBoolean atomicBoolean2 = m24.f50449a;
                m24.m16601a(contextM21766a2, arrayListM23676f2, false);
                Object obj2 = m24.f50455g;
                if (!lp1.f49971a.contains(w24.class)) {
                    try {
                        w24 w24Var2 = w24.f66276a;
                        arrayListM23677a = w24Var2.m23677a(w24Var2.m23681e(contextM21766a2, obj2, "subs"));
                    } catch (Throwable th3) {
                        lp1.m16420a(w24.class, th3);
                    }
                }
                AtomicBoolean atomicBoolean3 = m24.f50449a;
                m24.m16601a(contextM21766a2, arrayListM23677a, true);
                break;
            case 4:
                try {
                    throw null;
                } catch (Exception e) {
                    eh0.m11136q("IterableInitCallbackMgr", "Exception in subscriber initialization callback", e);
                    return;
                }
            default:
                if (!lp1.f49971a.contains(jn9.class)) {
                    try {
                        AtomicBoolean atomicBoolean4 = jn9.f45879b;
                        if (!atomicBoolean4.get()) {
                            atomicBoolean4.set(true);
                            jn9.f45878a.m14559b();
                        }
                    } catch (Throwable th4) {
                        lp1.m16420a(jn9.class, th4);
                    }
                    break;
                }
                break;
        }
    }
}
