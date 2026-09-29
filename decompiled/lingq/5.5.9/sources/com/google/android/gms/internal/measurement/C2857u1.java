package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2857u1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2870v1 f14449a;

    public C2857u1(C2870v1 c2870v1) {
        this.f14449a = c2870v1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f14449a.m8300b(new C2724k1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f14449a.m8300b(new C2818r1(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f14449a.m8300b(new C2682h1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f14449a.m8300b(new C2818r1(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        this.f14449a.m8300b(new C2844t1(this, activity, binderC2751m0));
        Bundle bundleM8060j = binderC2751m0.m8060j(50L);
        if (bundleM8060j != null) {
            bundle.putAll(bundleM8060j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f14449a.m8300b(new C2696i1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f14449a.m8300b(new C2654f1(this, activity));
    }
}
