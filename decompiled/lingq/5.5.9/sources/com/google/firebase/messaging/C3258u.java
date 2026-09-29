package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.google.firebase.messaging.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3258u {

    /* JADX INFO: renamed from: e */
    public static C3258u f16437e;

    /* JADX INFO: renamed from: a */
    public String f16438a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f16439b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f16440c = null;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f16441d = new ArrayDeque();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized C3258u m9290a() {
        try {
            if (f16437e == null) {
                f16437e = new C3258u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16437e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9291b(Context context) {
        if (this.f16440c == null) {
            this.f16440c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f16439b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f16440c.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9292c(Context context) {
        if (this.f16439b == null) {
            this.f16439b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f16439b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f16439b.booleanValue();
    }
}
