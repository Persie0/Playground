package p431v7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import dm.C5207g;
import p291o7.C8004n;
import p317p7.RunnableC8197d;
import p333q7.RunnableC8499a;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9658b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C5207g.m11111f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C5207g.m11111f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C5207g.m11111f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C5207g.m11111f(activity, "activity");
        try {
            C8004n.m15873c().execute(new RunnableC8499a(1));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C5207g.m11111f(activity, "activity");
        C5207g.m11111f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C5207g.m11111f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C5207g.m11111f(activity, "activity");
        try {
            if (C5207g.m11106a(C9659c.f49451e, Boolean.TRUE) && C5207g.m11106a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                C8004n.m15873c().execute(new RunnableC8197d(2));
            }
        } catch (Exception unused) {
        }
    }
}
