package p000;

import android.app.job.JobParameters;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class baj {
    /* JADX INFO: renamed from: a */
    public static Uri[] m2161a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    /* JADX INFO: renamed from: b */
    public static String[] m2162b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
