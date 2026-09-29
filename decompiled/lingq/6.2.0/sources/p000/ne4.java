package p000;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ne4 {

    /* JADX INFO: renamed from: a */
    public static final String f52642a = oj5.m18041h("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public static final JobScheduler m17403a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
