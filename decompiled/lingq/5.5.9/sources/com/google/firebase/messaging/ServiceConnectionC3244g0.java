package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.activity.RunnableC0193l;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lb.C7297a;
import p118fe.C5509a;
import p136gc.C5752h;
import p136gc.C5761q;
import p276nb.ThreadFactoryC7736a;

/* JADX INFO: renamed from: com.google.firebase.messaging.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC3244g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f16385a;

    /* JADX INFO: renamed from: b */
    public final Intent f16386b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f16387c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f16388d;

    /* JADX INFO: renamed from: e */
    public BinderC3242f0 f16389e;

    /* JADX INFO: renamed from: f */
    public boolean f16390f;

    /* JADX INFO: renamed from: com.google.firebase.messaging.g0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Intent f16391a;

        /* JADX INFO: renamed from: b */
        public final C5752h<Void> f16392b = new C5752h<>();

        public a(Intent intent) {
            this.f16391a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ServiceConnectionC3244g0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC7736a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f16388d = new ArrayDeque();
        this.f16390f = false;
        Context applicationContext = context.getApplicationContext();
        this.f16385a = applicationContext;
        this.f16386b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f16387c = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9257a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f16388d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC3242f0 binderC3242f0 = this.f16389e;
            if (binderC3242f0 == null || !binderC3242f0.isBinderAlive()) {
                m9259c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f16389e.m9255a((a) this.f16388d.poll());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized C5761q m9258b(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            ScheduledExecutorService scheduledExecutorService = this.f16387c;
            aVar.f16392b.f34812a.mo12101c(scheduledExecutorService, new C5509a(13, scheduledExecutorService.schedule(new RunnableC0193l(11, aVar), (aVar.f16391a.getFlags() & 268435456) != 0 ? C3238d0.f16375a : 9000L, TimeUnit.MILLISECONDS)));
            this.f16388d.add(aVar);
            m9257a();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.f16392b.f34812a;
    }

    /* JADX INFO: renamed from: c */
    public final void m9259c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f16390f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f16390f) {
            return;
        }
        this.f16390f = true;
        try {
            if (C7297a.m14688b().m14689a(this.f16385a, this.f16386b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f16388d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).f16392b.m12116d(null);
                }
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f16390f = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f16390f = false;
        if (iBinder instanceof BinderC3242f0) {
            this.f16389e = (BinderC3242f0) iBinder;
            m9257a();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        while (true) {
            ArrayDeque arrayDeque = this.f16388d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((a) arrayDeque.poll()).f16392b.m12116d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m9257a();
    }
}
