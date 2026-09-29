package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.measurement.internal.C1045d;
import java.util.Objects;
import p000.i5d;
import p000.kj3;
import p000.lda;
import p000.lxb;
import p000.nr9;
import p000.s46;
import p000.u62;
import p000.v3c;
import p000.wlc;
import p000.xcc;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements i5d {

    /* JADX INFO: renamed from: a */
    public nr9 f12308a;

    @Override // p000.i5d
    /* JADX INFO: renamed from: a */
    public final boolean mo5840a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.i5d
    /* JADX INFO: renamed from: b */
    public final void mo5841b(Intent intent) {
    }

    @Override // p000.i5d
    /* JADX INFO: renamed from: c */
    public final void mo5842c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: d */
    public final nr9 m5843d() {
        if (this.f12308a == null) {
            this.f12308a = new nr9(this);
        }
        return this.f12308a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m5843d().f53173a).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m5843d().f53173a).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m5843d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        nr9 nr9VarM5843d = m5843d();
        Service service = (Service) nr9VarM5843d.f53173a;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            lda.m16130p(string);
            C1045d c1045dM5881C = C1045d.m5881C(service);
            xcc xccVarMo5909b = c1045dM5881C.mo5909b();
            s46 s46Var = c1045dM5881C.f12372l.f47435c;
            xccVarMo5909b.f68076I.m17924b(string, "Local AppMeasurementJobService called. action");
            c1045dM5881C.mo5913d().m22076M(new u62(nr9VarM5843d, c1045dM5881C, new wlc(nr9VarM5843d, xccVarMo5909b, jobParameters, 3)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        lda.m16130p(string);
        v3c v3cVarM23084e = v3c.m23084e(service, null);
        kj3 kj3Var = new kj3(21, nr9VarM5843d, jobParameters);
        v3cVarM23084e.getClass();
        v3cVarM23084e.m23087c(new lxb(v3cVarM23084e, kj3Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m5843d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
