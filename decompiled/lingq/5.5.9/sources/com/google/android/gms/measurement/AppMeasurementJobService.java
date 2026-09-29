package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import cc.C1846i7;
import cc.C1860k3;
import cc.C1897o4;
import cc.C1935s6;
import cc.InterfaceC1926r6;
import p115fb.RunnableC5494j;
import p152hb.RunnableC5952a2;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements InterfaceC1926r6 {

    /* JADX INFO: renamed from: a */
    public C1935s6 f14596a;

    @Override // cc.InterfaceC1926r6
    /* JADX INFO: renamed from: a */
    public final boolean mo5853a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // cc.InterfaceC1926r6
    /* JADX INFO: renamed from: b */
    public final void mo5854b(Intent intent) {
    }

    @Override // cc.InterfaceC1926r6
    @TargetApi(24)
    /* JADX INFO: renamed from: c */
    public final void mo5855c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: d */
    public final C1935s6 m8530d() {
        if (this.f14596a == null) {
            this.f14596a = new C1935s6(this);
        }
        return this.f14596a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1860k3 c1860k3 = C1897o4.m5777s(m8530d().f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C1860k3 c1860k3 = C1897o4.m5777s(m8530d().f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m8530d().m5883a(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C1935s6 c1935s6M8530d = m8530d();
        C1860k3 c1860k3 = C1897o4.m5777s(c1935s6M8530d.f10199a, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        String string = jobParameters.getExtras().getString("action");
        c1860k3.f9938I.m5624b(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            RunnableC5952a2 runnableC5952a2 = new RunnableC5952a2(c1935s6M8530d, c1860k3, jobParameters);
            C1846i7 c1846i7M5630N = C1846i7.m5630N(c1935s6M8530d.f10199a);
            c1846i7M5630N.mo5518f().m5753p(new RunnableC5494j(c1846i7M5630N, runnableC5952a2));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m8530d().m5884b(intent);
        return true;
    }
}
