package p000;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jlh extends JobService {

    /* JADX INFO: renamed from: a */
    public static final long f34301a = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a */
    public abstract ktz mo4713a(Context context);

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ktz ktzVarMo4713a = mo4713a(this);
        long millis = TimeUnit.DAYS.toMillis(30L);
        kxk.m14975U(((jln) ktzVarMo4713a.f37198a).m13341a(new jzm(millis, 1)), new cou(this, jobParameters, 9), not.INSTANCE);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
