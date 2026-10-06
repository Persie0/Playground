package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.util.Log;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000.C0159ek;
import p000.ayc;
import p000.ayo;
import p000.azb;
import p000.azp;
import p000.baj;
import p000.bak;
import p000.bcj;
import p000.bck;
import p000.bkn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SystemJobService extends JobService implements ayo {

    /* JADX INFO: renamed from: a */
    private static final String f1813a = ayc.m2100b("SystemJobService");

    /* JADX INFO: renamed from: b */
    private azp f1814b;

    /* JADX INFO: renamed from: c */
    private final Map f1815c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final bck f1816d = new bck();

    /* JADX INFO: renamed from: b */
    private static bcj m1713b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new bcj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        JobParameters jobParameters;
        ayc.m2099a();
        synchronized (this.f1815c) {
            jobParameters = (JobParameters) this.f1815c.remove(bcjVar);
        }
        this.f1816d.m2205E(bcjVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            azp azpVarM2125e = azp.m2125e(getApplicationContext());
            this.f1814b = azpVarM2125e;
            azpVarM2125e.f2784f.m2112b(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            ayc.m2099a();
            Log.w(f1813a, rgoX.gnJIjuxg);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        azp azpVar = this.f1814b;
        if (azpVar != null) {
            azpVar.f2784f.m2113c(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f1814b == null) {
            ayc.m2099a();
            jobFinished(jobParameters, true);
            return false;
        }
        bcj bcjVarM1713b = m1713b(jobParameters);
        if (bcjVarM1713b == null) {
            ayc.m2099a();
            Log.e(f1813a, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f1815c) {
            if (this.f1815c.containsKey(bcjVarM1713b)) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("Job is already being executed by SystemJobService: ");
                sb.append(bcjVarM1713b);
                return false;
            }
            ayc.m2099a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onStartJob for ");
            sb2.append(bcjVarM1713b);
            this.f1815c.put(bcjVarM1713b, jobParameters);
            C0159ek c0159ek = new C0159ek(null);
            if (baj.m2161a(jobParameters) != null) {
                Arrays.asList(baj.m2161a(jobParameters));
            }
            if (baj.m2162b(jobParameters) != null) {
                Arrays.asList(baj.m2162b(jobParameters));
            }
            bak.m2163a(jobParameters);
            this.f1814b.m2130j(this.f1816d.m2206F(bcjVarM1713b), c0159ek);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f1814b == null) {
            ayc.m2099a();
            return true;
        }
        bcj bcjVarM1713b = m1713b(jobParameters);
        if (bcjVarM1713b == null) {
            ayc.m2099a();
            Log.e(f1813a, "WorkSpec id not found!");
            return false;
        }
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("onStopJob for ");
        sb.append(bcjVarM1713b);
        bcjVarM1713b.toString();
        synchronized (this.f1815c) {
            this.f1815c.remove(bcjVarM1713b);
        }
        bkn bknVarM2205E = this.f1816d.m2205E(bcjVarM1713b);
        if (bknVarM2205E != null) {
            this.f1814b.m2129i(bknVarM2205E);
        }
        azb azbVar = this.f1814b.f2784f;
        String str = bcjVarM1713b.f2946a;
        synchronized (azbVar.f2752f) {
            zContains = azbVar.f2751e.contains(str);
        }
        return !zContains;
    }
}
