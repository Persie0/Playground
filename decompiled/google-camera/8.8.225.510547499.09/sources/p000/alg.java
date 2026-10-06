package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class alg implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        alh.m908a(activity, akq.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        alh.m908a(activity, akq.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        alh.m908a(activity, akq.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        alh.m908a(activity, akq.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        alh.m908a(activity, akq.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        alh.m908a(activity, akq.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
