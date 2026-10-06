package p000;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmd {

    /* JADX INFO: renamed from: a */
    private static final long f34352a = TimeUnit.MINUTES.toMillis(15);

    /* JADX INFO: renamed from: a */
    public static void m13355a(Context context, JobParameters jobParameters) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        PersistableBundle persistableBundle = new PersistableBundle(jobParameters.getExtras());
        persistableBundle.putLong("debug_rescheduled_because_non_idle", System.currentTimeMillis());
        JobInfo.Builder minimumLatency = new JobInfo.Builder(jobParameters.getJobId(), new ComponentName(context, "com.google.android.gms.learning.internal.training.InAppJobService")).setRequiredNetworkType(persistableBundle.getInt("job_info_required_network_type", 2)).setRequiresDeviceIdle(persistableBundle.getInt("job_info_requires_device_idle", 1) == 1).setRequiresCharging(persistableBundle.getInt("job_info_requires_charging", 1) == 1).setExtras(persistableBundle).setMinimumLatency(persistableBundle.getLong("non_idle_retry_minimum_latency_ms", f34352a));
        long j = persistableBundle.getLong("job_info_override_deadline_ms", 0L);
        if (j > 0) {
            minimumLatency.setOverrideDeadline(j);
        }
        if (abx.m170b(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            minimumLatency.setPersisted(persistableBundle.getInt("job_info_persisted", 1) == 1);
        }
        if (jobScheduler.schedule(minimumLatency.build()) == 1) {
            return;
        }
        String str = pIeXJQLZLfgIN.UVeApUqNUw;
        if (Log.isLoggable(str, 5)) {
            Log.w(str, "Failed to reschedule job " + jobParameters.getJobId());
        }
    }
}
