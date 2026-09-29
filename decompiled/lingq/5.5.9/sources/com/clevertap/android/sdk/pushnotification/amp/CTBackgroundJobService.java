package com.clevertap.android.sdk.pushnotification.amp;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import java.util.concurrent.ConcurrentHashMap;
import p290o6.C7987z;

/* JADX INFO: loaded from: classes.dex */
public class CTBackgroundJobService extends JobService {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.amp.CTBackgroundJobService$a */
    public class RunnableC2255a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JobParameters f11332a;

        public RunnableC2255a(JobParameters jobParameters) {
            this.f11332a = jobParameters;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CTBackgroundJobService cTBackgroundJobService = CTBackgroundJobService.this;
            Context applicationContext = cTBackgroundJobService.getApplicationContext();
            ConcurrentHashMap<String, CleverTapAPI> concurrentHashMap = CleverTapAPI.f10979e;
            JobParameters jobParameters = this.f11332a;
            if (concurrentHashMap == null) {
                CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(applicationContext, null);
                if (cleverTapAPIM6420g != null) {
                    C7987z c7987z = cleverTapAPIM6420g.f10981b;
                    if (c7987z.f43471a.f11000f) {
                        c7987z.f43481k.m6581k(applicationContext, jobParameters);
                    } else {
                        C2181a.m6449a("Instance doesn't allow Background sync, not running the Job");
                    }
                }
            } else {
                for (String str : concurrentHashMap.keySet()) {
                    CleverTapAPI cleverTapAPI = CleverTapAPI.f10979e.get(str);
                    if (cleverTapAPI == null || !cleverTapAPI.f10981b.f43471a.f10999e) {
                        if (cleverTapAPI != null) {
                            C7987z c7987z2 = cleverTapAPI.f10981b;
                            if (c7987z2.f43471a.f11000f) {
                                c7987z2.f43481k.m6581k(applicationContext, jobParameters);
                            }
                        }
                        C2181a.m6450b(str, "Instance doesn't allow Background sync, not running the Job");
                    } else {
                        C2181a.m6450b(str, "Instance is Analytics Only not running the Job");
                    }
                }
            }
            cTBackgroundJobService.jobFinished(jobParameters, true);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C2181a.m6455h("Job Service is starting");
        new Thread(new RunnableC2255a(jobParameters)).start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
