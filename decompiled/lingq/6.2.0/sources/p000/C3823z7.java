package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.p011gu.toolargetool.TooLargeTool;
import java.util.HashMap;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3823z7 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final rj5 f70997a;

    /* JADX INFO: renamed from: b */
    public final if3 f70998b;

    /* JADX INFO: renamed from: c */
    public final HashMap f70999c = new HashMap();

    /* JADX INFO: renamed from: d */
    public boolean f71000d;

    public C3823z7(oc3 oc3Var, rj5 rj5Var) {
        this.f70997a = rj5Var;
        this.f70998b = new if3(oc3Var, rj5Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m25481a(Activity activity) {
        rj5 rj5Var = this.f70997a;
        Bundle bundle = (Bundle) this.f70999c.remove(activity);
        if (bundle != null) {
            try {
                mj5 mj5Var = (mj5) rj5Var;
                Log.println(mj5Var.f51398b, mj5Var.f51397a, activity.getClass().getSimpleName() + ".onSaveInstanceState wrote: " + TooLargeTool.bundleBreakdown(bundle));
            } catch (RuntimeException e) {
                Log.w(((mj5) rj5Var).f51397a, e.getMessage(), e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if3 if3Var;
        activity.getClass();
        if (!(activity instanceof id3) || (if3Var = this.f70998b) == null) {
            return;
        }
        ((id3) activity).m13792j().m2152Y(if3Var, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        m25481a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        if (this.f71000d) {
            this.f70999c.put(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        m25481a(activity);
    }
}
