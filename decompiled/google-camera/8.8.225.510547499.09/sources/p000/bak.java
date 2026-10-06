package p000;

import android.app.job.JobParameters;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bak {
    /* JADX INFO: renamed from: a */
    public static Network m2163a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m2164b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
