package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import p000.C3309ls;
import p000.RunnableC3470pr;
import p000.fja;
import p000.mk7;
import p000.n16;
import p000.nba;
import p000.q50;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11539a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        nba.m17319b(getApplicationContext());
        C3309ls c3309lsM19658a = q50.m19658a();
        c3309lsM19658a.m16496P(string);
        c3309lsM19658a.f50066d = mk7.m16870b(i);
        if (string2 != null) {
            c3309lsM19658a.f50065c = Base64.decode(string2, 0);
        }
        n16 n16Var = nba.m17318a().f52578d;
        ((Executor) n16Var.f52177e).execute(new fja(n16Var, c3309lsM19658a.m16506f(), i2, new RunnableC3470pr(21, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
