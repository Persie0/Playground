package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import cc.BinderC1987y4;
import cc.C1846i7;
import cc.C1860k3;
import cc.C1897o4;
import cc.C1935s6;
import cc.InterfaceC1926r6;
import p115fb.RunnableC5494j;
import p390t3.AbstractC9193a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1926r6 {

    /* JADX INFO: renamed from: a */
    public C1935s6 f14598a;

    @Override // cc.InterfaceC1926r6
    /* JADX INFO: renamed from: a */
    public final boolean mo5853a(int i10) {
        return stopSelfResult(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1926r6
    /* JADX INFO: renamed from: b */
    public final void mo5854b(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = AbstractC9193a.f47732a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = AbstractC9193a.f47732a;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1926r6
    /* JADX INFO: renamed from: c */
    public final void mo5855c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final C1935s6 m8531d() {
        if (this.f14598a == null) {
            this.f14598a = new C1935s6(this);
        }
        return this.f14598a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C1935s6 c1935s6M8531d = m8531d();
        if (intent == null) {
            c1935s6M8531d.m5885c().f9942f.m5623a("onBind called with null intent");
        } else {
            c1935s6M8531d.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new BinderC1987y4(C1846i7.m5630N(c1935s6M8531d.f10199a));
            }
            c1935s6M8531d.m5885c().f9945i.m5624b(action, "onBind received unknown action");
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1860k3 c1860k3 = C1897o4.m5777s(m8531d().f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C1860k3 c1860k3 = C1897o4.m5777s(m8531d().f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m8531d().m5883a(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final C1935s6 c1935s6M8531d = m8531d();
        final C1860k3 c1860k3 = C1897o4.m5777s(c1935s6M8531d.f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        if (intent == null) {
            c1860k3.f9945i.m5623a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            c1860k3.f9938I.m5625c(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Runnable runnable = new Runnable() { // from class: cc.q6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1935s6 c1935s6 = c1935s6M8531d;
                        InterfaceC1926r6 interfaceC1926r6 = (InterfaceC1926r6) c1935s6.f10199a;
                        int i12 = i11;
                        if (interfaceC1926r6.mo5853a(i12)) {
                            c1860k3.f9938I.m5624b(Integer.valueOf(i12), "Local AppMeasurementService processed last upload request. StartId");
                            c1935s6.m5885c().f9938I.m5623a("Completed wakeful intent.");
                            interfaceC1926r6.mo5854b(intent);
                        }
                    }
                };
                C1846i7 c1846i7M5630N = C1846i7.m5630N(c1935s6M8531d.f10199a);
                c1846i7M5630N.mo5518f().m5753p(new RunnableC5494j(c1846i7M5630N, runnable));
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m8531d().m5884b(intent);
        return true;
    }
}
