package p000;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cni extends JobService {

    /* JADX INFO: renamed from: e */
    public static final long f6345e = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: c */
    public abstract nps mo3983c();

    /* JADX INFO: renamed from: d */
    public abstract nps mo3984d();

    /* JADX INFO: renamed from: e */
    protected abstract ExecutorService mo3985e();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        kxk.m14975U(nod.m17554j(npm.m17611q(mo3983c()), new cnc(this, 2), mo3985e()), new cou(this, jobParameters, 1), mo3985e());
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
