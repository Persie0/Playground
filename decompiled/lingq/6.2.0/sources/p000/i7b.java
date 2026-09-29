package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class i7b implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f43653a;

    /* JADX INFO: renamed from: b */
    public final Intent f43654b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f43655c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f43656d;

    /* JADX INFO: renamed from: e */
    public g7b f43657e;

    /* JADX INFO: renamed from: f */
    public boolean f43658f;

    public i7b(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new o76("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f43656d = new ArrayDeque();
        this.f43658f = false;
        Context applicationContext = context.getApplicationContext();
        this.f43653a = applicationContext;
        this.f43654b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f43655c = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13712a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f43656d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                g7b g7bVar = this.f43657e;
                if (g7bVar == null || !g7bVar.isBinderAlive()) {
                    m13714c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f43657e.m12413a((h7b) this.f43656d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized tld m13713b(Intent intent) {
        h7b h7bVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            h7bVar = new h7b(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f43655c;
            h7bVar.f41923b.f67208a.mo5960b(scheduledThreadPoolExecutor, new dw6(scheduledThreadPoolExecutor.schedule(new mt6(h7bVar, 18), 20L, TimeUnit.SECONDS), 24));
            this.f43656d.add(h7bVar);
            m13712a();
        } catch (Throwable th) {
            throw th;
        }
        return h7bVar.f41923b.f67208a;
    }

    /* JADX INFO: renamed from: c */
    public final void m13714c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f43658f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f43658f) {
            return;
        }
        this.f43658f = true;
        try {
            if (li1.m16230b().m16231a(this.f43653a, this.f43654b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f43656d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((h7b) arrayDeque.poll()).f41923b.m24140d(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f43658f = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f43658f = false;
            if (iBinder instanceof g7b) {
                this.f43657e = (g7b) iBinder;
                m13712a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f43656d;
            while (!arrayDeque.isEmpty()) {
                ((h7b) arrayDeque.poll()).f41923b.m24140d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m13712a();
    }
}
