package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p045c9.C1753g;
import p045c9.RunnableC1748b;
import p080e.RunnableC5286r;
import p135g9.C5717a;
import p452w8.AbstractC9838s;
import p452w8.C9829j;
import p452w8.C9842w;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11781a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C9842w.m18334b(getApplicationContext());
        C9829j.a aVarM18330a = AbstractC9838s.m18330a();
        aVarM18330a.m18323b(string);
        aVarM18330a.m18324c(C5717a.m12076b(i10));
        if (string2 != null) {
            aVarM18330a.f50029b = Base64.decode(string2, 0);
        }
        C1753g c1753g = C9842w.m18333a().f50056d;
        C9829j c9829jM18322a = aVarM18330a.m18322a();
        RunnableC5286r runnableC5286r = new RunnableC5286r(this, 9, jobParameters);
        c1753g.getClass();
        c1753g.f9634e.execute(new RunnableC1748b(c1753g, c9829jM18322a, i11, runnableC5286r));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
