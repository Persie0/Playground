package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.impl.C0773b;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC0780ao;
import p000.C3386nv;
import p000.a8b;
import p000.d54;
import p000.il7;
import p000.oj5;
import p000.q5d;
import p000.qfa;
import p000.r5d;
import p000.vu2;
import p000.wp7;
import p000.wq1;
import p000.zg9;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements vu2 {

    /* JADX INFO: renamed from: e */
    public static final String f7215e = oj5.m18041h("SystemJobService");

    /* JADX INFO: renamed from: a */
    public C0773b f7216a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7217b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final d54 f7218c = new d54(2);

    /* JADX INFO: renamed from: d */
    public qfa f7219d;

    /* JADX INFO: renamed from: a */
    public static void m2916a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C3386nv.m17633t(wq1.m24118n("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: c */
    public static a8b m2917c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new a8b(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.vu2
    /* JADX INFO: renamed from: b */
    public final void mo2918b(a8b a8bVar, boolean z) {
        m2916a("onExecuted");
        oj5.m18040f().m18042a(f7215e, a8bVar.m181b() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f7217b.remove(a8bVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C0773b c0773bM2910c = C0773b.m2910c(getApplicationContext());
            this.f7216a = c0773bM2910c;
            il7 il7Var = c0773bM2910c.f7209f;
            this.f7219d = new qfa(il7Var, c0773bM2910c.f7207d);
            il7Var.m14012a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            oj5.m18040f().m18046j(f7215e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C0773b c0773b = this.f7216a;
        if (c0773b != null) {
            il7 il7Var = c0773b.f7209f;
            synchronized (il7Var.f44277k) {
                il7Var.f44276j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m2916a("onStartJob");
        C0773b c0773b = this.f7216a;
        String str = f7215e;
        if (c0773b == null) {
            oj5.m18040f().m18042a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        a8b a8bVarM2917c = m2917c(jobParameters);
        if (a8bVarM2917c == null) {
            oj5.m18040f().m18043c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f7217b;
        if (map.containsKey(a8bVarM2917c)) {
            oj5.m18040f().m18042a(str, "Job is already being executed by SystemJobService: " + a8bVarM2917c);
            return false;
        }
        oj5.m18040f().m18042a(str, "onStartJob for " + a8bVarM2917c);
        map.put(a8bVarM2917c, jobParameters);
        wp7 wp7Var = new wp7();
        if (q5d.m19676j(jobParameters) != null) {
            wp7Var.f67155b = Arrays.asList(q5d.m19676j(jobParameters));
        }
        if (q5d.m19675i(jobParameters) != null) {
            wp7Var.f67154a = Arrays.asList(q5d.m19675i(jobParameters));
        }
        r5d.m20418b(jobParameters);
        this.f7219d.m19912l(this.f7218c.m10102e(a8bVarM2917c), wp7Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m2916a("onStopJob");
        if (this.f7216a == null) {
            oj5.m18040f().m18042a(f7215e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        a8b a8bVarM2917c = m2917c(jobParameters);
        if (a8bVarM2917c == null) {
            oj5.m18040f().m18043c(f7215e, "WorkSpec id not found!");
            return false;
        }
        oj5.m18040f().m18042a(f7215e, "onStopJob for " + a8bVarM2917c);
        this.f7217b.remove(a8bVarM2917c);
        zg9 zg9Var = (zg9) this.f7218c.f35011a.remove(a8bVarM2917c);
        if (zg9Var != null) {
            int iM2939e = Build.VERSION.SDK_INT >= 31 ? AbstractC0780ao.m2939e(jobParameters) : -512;
            qfa qfaVar = this.f7219d;
            qfaVar.getClass();
            qfaVar.m19913m(zg9Var, iM2939e);
        }
        il7 il7Var = this.f7216a.f7209f;
        String strM181b = a8bVarM2917c.m181b();
        synchronized (il7Var.f44277k) {
            zContains = il7Var.f44275i.contains(strM181b);
        }
        return !zContains;
    }
}
