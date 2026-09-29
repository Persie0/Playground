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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p276nb.ThreadFactoryC7736a;

/* JADX INFO: renamed from: com.google.firebase.messaging.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3261x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f16452a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f16453b;

    /* JADX INFO: renamed from: c */
    public final FirebaseMessaging f16454c;

    /* JADX INFO: renamed from: com.google.firebase.messaging.x$a */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC3261x f16455a;

        public a(RunnableC3261x runnableC3261x) {
            this.f16455a = runnableC3261x;
        }

        /* JADX INFO: renamed from: a */
        public final void m9298a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f16455a.f16454c.f16310d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            RunnableC3261x runnableC3261x = this.f16455a;
            if (runnableC3261x != null && runnableC3261x.m9296a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                RunnableC3261x runnableC3261x2 = this.f16455a;
                runnableC3261x2.f16454c.getClass();
                FirebaseMessaging.m9228b(runnableC3261x2, 0L);
                this.f16455a.f16454c.f16310d.unregisterReceiver(this);
                this.f16455a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC3261x(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7736a("firebase-iid-executor"));
        this.f16454c = firebaseMessaging;
        this.f16452a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f16310d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f16453b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9296a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16454c.f16310d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m9297b() throws IOException {
        boolean z10 = true;
        try {
            if (this.f16454c.m9229a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message)) {
                if (!"InternalServerError".equals(message)) {
                    z10 = false;
                }
            }
            if (!z10) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        C3258u c3258uM9290a = C3258u.m9290a();
        FirebaseMessaging firebaseMessaging = this.f16454c;
        boolean zM9292c = c3258uM9290a.m9292c(firebaseMessaging.f16310d);
        PowerManager.WakeLock wakeLock = this.f16453b;
        if (zM9292c) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    try {
                        firebaseMessaging.f16317k = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!firebaseMessaging.f16316j.m9273c()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f16317k = false;
                    }
                    if (C3258u.m9290a().m9292c(firebaseMessaging.f16310d)) {
                        wakeLock.release();
                    }
                    return;
                }
                if (C3258u.m9290a().m9291b(firebaseMessaging.f16310d) && !m9296a()) {
                    new a(this).m9298a();
                    if (C3258u.m9290a().m9292c(firebaseMessaging.f16310d)) {
                        wakeLock.release();
                    }
                    return;
                }
                if (m9297b()) {
                    synchronized (firebaseMessaging) {
                        try {
                            firebaseMessaging.f16317k = false;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    firebaseMessaging.m9233f(this.f16452a);
                }
                if (C3258u.m9290a().m9292c(firebaseMessaging.f16310d)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    try {
                        firebaseMessaging.f16317k = false;
                        if (C3258u.m9290a().m9292c(firebaseMessaging.f16310d)) {
                            wakeLock.release();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        } catch (Throwable th5) {
            if (C3258u.m9290a().m9292c(firebaseMessaging.f16310d)) {
                wakeLock.release();
            }
            throw th5;
        }
    }
}
