package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import p000.gxn;
import p000.ihk;
import p000.izv;
import p000.jah;
import p000.jar;
import p000.jax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements jax {

    /* JADX INFO: renamed from: a */
    private ihk f7554a;

    /* JADX INFO: renamed from: c */
    private final ihk m4632c() {
        if (this.f7554a == null) {
            this.f7554a = new ihk((Context) this);
        }
        return this.f7554a;
    }

    @Override // p000.jax
    /* JADX INFO: renamed from: a */
    public final boolean mo4633a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.jax
    /* JADX INFO: renamed from: b */
    public final void mo4634b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m4632c().m11357y();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m4632c().m11358z();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m4632c().m11333C(intent, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ihk ihkVarM4632c = m4632c();
        izv izvVarM11947c = izv.m11947c((Context) ihkVarM4632c.f30967b);
        jar jarVarM11951d = izvVarM11947c.m11951d();
        String string = jobParameters.getExtras().getString("action");
        jah jahVar = izvVarM11947c.f32730c;
        jarVarM11951d.m11937r("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        ihkVarM4632c.m11332A(new gxn(ihkVarM4632c, jarVarM11951d, jobParameters, 18, null, null, null, null));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
