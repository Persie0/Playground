package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3236c0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final Object f16363f = new Object();

    /* JADX INFO: renamed from: g */
    public static Boolean f16364g;

    /* JADX INFO: renamed from: h */
    public static Boolean f16365h;

    /* JADX INFO: renamed from: a */
    public final Context f16366a;

    /* JADX INFO: renamed from: b */
    public final C3252o f16367b;

    /* JADX INFO: renamed from: c */
    public final PowerManager.WakeLock f16368c;

    /* JADX INFO: renamed from: d */
    public final C3234b0 f16369d;

    /* JADX INFO: renamed from: e */
    public final long f16370e;

    /* JADX INFO: renamed from: com.google.firebase.messaging.c0$a */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC3236c0 f16371a;

        public a(RunnableC3236c0 runnableC3236c0) {
            this.f16371a = runnableC3236c0;
        }

        /* JADX INFO: renamed from: a */
        public final void m9249a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC3236c0.this.f16366a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            RunnableC3236c0 runnableC3236c0 = this.f16371a;
            if (runnableC3236c0 == null) {
                return;
            }
            if (runnableC3236c0.m9248d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                RunnableC3236c0 runnableC3236c1 = this.f16371a;
                runnableC3236c1.f16369d.f16358f.schedule(runnableC3236c1, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f16371a = null;
            }
        }
    }

    public RunnableC3236c0(C3234b0 c3234b0, Context context, C3252o c3252o, long j10) {
        this.f16369d = c3234b0;
        this.f16366a = context;
        this.f16370e = j10;
        this.f16367b = c3252o;
        this.f16368c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m9245a(Context context) {
        boolean zBooleanValue;
        synchronized (f16363f) {
            Boolean bool = f16365h;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m9246b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f16365h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9246b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m9247c(Context context) {
        boolean zBooleanValue;
        synchronized (f16363f) {
            Boolean bool = f16364g;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m9246b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f16364g = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m9248d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16366a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        C3234b0 c3234b0 = this.f16369d;
        Context context = this.f16366a;
        boolean zM9247c = m9247c(context);
        PowerManager.WakeLock wakeLock = this.f16368c;
        if (zM9247c) {
            wakeLock.acquire(C3241f.f16379a);
        }
        try {
            try {
                synchronized (c3234b0) {
                    c3234b0.f16359g = true;
                }
                if (!this.f16367b.m9273c()) {
                    synchronized (c3234b0) {
                        try {
                            c3234b0.f16359g = false;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (m9247c(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (m9245a(context) && !m9248d()) {
                    new a(this).m9249a();
                    if (m9247c(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    return;
                }
                if (c3234b0.m9243e()) {
                    synchronized (c3234b0) {
                        try {
                            c3234b0.f16359g = false;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    c3234b0.m9244f(this.f16370e);
                }
                if (m9247c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                synchronized (c3234b0) {
                    try {
                        c3234b0.f16359g = false;
                        if (m9247c(context)) {
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        } catch (Throwable th5) {
            if (m9247c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    throw th5;
                }
            }
            throw th5;
        }
    }
}
