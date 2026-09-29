package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.measurement.internal.C1045d;
import p000.RunnableC3626tw;
import p000.eoc;
import p000.g2b;
import p000.i5d;
import p000.kjc;
import p000.nr9;
import p000.u62;
import p000.xcc;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements i5d {

    /* JADX INFO: renamed from: a */
    public nr9 f12310a;

    @Override // p000.i5d
    /* JADX INFO: renamed from: a */
    public final boolean mo5840a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.i5d
    /* JADX INFO: renamed from: b */
    public final void mo5841b(Intent intent) {
        g2b.m12304a(intent);
    }

    @Override // p000.i5d
    /* JADX INFO: renamed from: c */
    public final void mo5842c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final nr9 m5844d() {
        if (this.f12310a == null) {
            this.f12310a = new nr9(this);
        }
        return this.f12310a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        nr9 nr9VarM5844d = m5844d();
        nr9VarM5844d.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new eoc(C1045d.m5881C((Service) nr9VarM5844d.f53173a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m5844d().f53173a).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m5844d().f53173a).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m5844d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        nr9 nr9VarM5844d = m5844d();
        if (intent == null) {
            nr9VarM5844d.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) nr9VarM5844d.f53173a;
        xcc xccVar = kjc.m15281r(service, null, null, null).f47438f;
        kjc.m15280l(xccVar);
        String action = intent.getAction();
        xccVar.f68076I.m17925c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC3626tw runnableC3626tw = new RunnableC3626tw(i2, 3, nr9VarM5844d, xccVar, intent);
        C1045d c1045dM5881C = C1045d.m5881C(service);
        c1045dM5881C.mo5913d().m22076M(new u62(nr9VarM5844d, c1045dM5881C, runnableC3626tw));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m5844d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
