package com.google.firebase.messaging;

import ae.C0065e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p047ce.InterfaceC1999a;

/* JADX INFO: renamed from: com.google.firebase.messaging.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3247j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Set<Intent> f16398a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public static void m9264a(Intent intent) {
        Bundle bundle;
        try {
            Bundle extras = intent.getExtras();
            bundle = extras != null ? extras.getBundle("gcm.n.analytics_data") : null;
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    C0065e c0065eM434b = C0065e.m434b();
                    c0065eM434b.m437a();
                    InterfaceC1999a interfaceC1999a = (InterfaceC1999a) c0065eM434b.f174d.mo11748a(InterfaceC1999a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC1999a != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        interfaceC1999a.mo5935c(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        interfaceC1999a.mo5934b("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            C3251n.m9269a(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.f16398a.add(intent)) {
            return;
        }
        m9264a(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f16398a.remove(activity.getIntent());
        }
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
