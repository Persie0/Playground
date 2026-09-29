package p290o6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7952e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43320a = null;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str = this.f43320a;
        if (str != null) {
            CleverTapAPI.m6424k(activity, str);
        } else {
            CleverTapAPI.m6424k(activity, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = CleverTapAPI.f10979e;
        if (concurrentHashMap == null) {
            return;
        }
        Iterator<String> it = concurrentHashMap.keySet().iterator();
        while (true) {
            while (it.hasNext()) {
                CleverTapAPI cleverTapAPI = CleverTapAPI.f10979e.get(it.next());
                if (cleverTapAPI != null) {
                    try {
                        cleverTapAPI.f10981b.f43473c.m15753b();
                    } catch (Throwable unused) {
                    }
                }
            }
            return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String str = this.f43320a;
        if (str != null) {
            CleverTapAPI.m6425l(activity, str);
        } else {
            CleverTapAPI.m6425l(activity, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
