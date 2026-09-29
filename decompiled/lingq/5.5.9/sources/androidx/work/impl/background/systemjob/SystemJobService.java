package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.appcompat.widget.C0322j;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p041c5.C1719q;
import p041c5.C1722t;
import p041c5.InterfaceC1704d;
import p214k5.C6610l;
import p235l5.RunnableC7271r;
import p235l5.RunnableC7272s;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1704d {

    /* JADX INFO: renamed from: d */
    public static final String f7889d = AbstractC1314g.m4868f("SystemJobService");

    /* JADX INFO: renamed from: a */
    public C1699a0 f7890a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7891b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final C0322j f7892c = new C0322j(4);

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    public static class C1254a {
        /* JADX INFO: renamed from: a */
        public static String[] m4742a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* JADX INFO: renamed from: b */
        public static Uri[] m4743b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    public static class C1255b {
        /* JADX INFO: renamed from: a */
        public static Network m4744a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C6610l m4741a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new C6610l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        JobParameters jobParameters;
        AbstractC1314g.m4867d().mo4869a(f7889d, c6610l.f37514a + " executed on JobScheduler");
        synchronized (this.f7891b) {
            try {
                jobParameters = (JobParameters) this.f7891b.remove(c6610l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7892c.m1221i(c6610l);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C1699a0 c1699a0M5430d = C1699a0.m5430d(getApplicationContext());
            this.f7890a = c1699a0M5430d;
            c1699a0M5430d.f9480f.m5454a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC1314g.m4867d().mo4873g(f7889d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1699a0 c1699a0 = this.f7890a;
        if (c1699a0 != null) {
            C1719q c1719q = c1699a0.f9480f;
            synchronized (c1719q.f9548l) {
                c1719q.f9547k.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f7890a == null) {
            AbstractC1314g.m4867d().mo4869a(f7889d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C6610l c6610lM4741a = m4741a(jobParameters);
        if (c6610lM4741a == null) {
            AbstractC1314g.m4867d().mo4870b(f7889d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f7891b) {
            if (this.f7891b.containsKey(c6610lM4741a)) {
                AbstractC1314g.m4867d().mo4869a(f7889d, "Job is already being executed by SystemJobService: " + c6610lM4741a);
                return false;
            }
            AbstractC1314g.m4867d().mo4869a(f7889d, "onStartJob for " + c6610lM4741a);
            this.f7891b.put(c6610lM4741a, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            WorkerParameters.C1242a c1242a = new WorkerParameters.C1242a();
            if (C1254a.m4743b(jobParameters) != null) {
                c1242a.f7809b = Arrays.asList(C1254a.m4743b(jobParameters));
            }
            if (C1254a.m4742a(jobParameters) != null) {
                c1242a.f7808a = Arrays.asList(C1254a.m4742a(jobParameters));
            }
            if (i10 >= 28) {
                C1255b.m4744a(jobParameters);
            }
            C1699a0 c1699a0 = this.f7890a;
            c1699a0.f9478d.m14863a(new RunnableC7271r(c1699a0, this.f7892c.m1224l(c6610lM4741a), c1242a));
            return true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f7890a == null) {
            AbstractC1314g.m4867d().mo4869a(f7889d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C6610l c6610lM4741a = m4741a(jobParameters);
        if (c6610lM4741a == null) {
            AbstractC1314g.m4867d().mo4870b(f7889d, "WorkSpec id not found!");
            return false;
        }
        AbstractC1314g.m4867d().mo4869a(f7889d, "onStopJob for " + c6610lM4741a);
        synchronized (this.f7891b) {
            this.f7891b.remove(c6610lM4741a);
        }
        C1722t c1722tM1221i = this.f7892c.m1221i(c6610lM4741a);
        if (c1722tM1221i != null) {
            C1699a0 c1699a0 = this.f7890a;
            c1699a0.f9478d.m14863a(new RunnableC7272s(c1699a0, c1722tM1221i, false));
        }
        C1719q c1719q = this.f7890a.f9480f;
        String str = c6610lM4741a.f37514a;
        synchronized (c1719q.f9548l) {
            zContains = c1719q.f9546j.contains(str);
        }
        return !zContains;
    }
}
