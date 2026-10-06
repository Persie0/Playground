package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bai implements azd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2868a = 0;

    /* JADX INFO: renamed from: b */
    private static final String f2869b = ayc.m2100b(xRFdVyfdeve.HujCHP);

    /* JADX INFO: renamed from: c */
    private final Context f2870c;

    /* JADX INFO: renamed from: d */
    private final JobScheduler f2871d;

    /* JADX INFO: renamed from: e */
    private final azp f2872e;

    /* JADX INFO: renamed from: f */
    private final bah f2873f;

    public bai(Context context, azp azpVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        bah bahVar = new bah(context);
        this.f2870c = context;
        this.f2872e = azpVar;
        this.f2871d = jobScheduler;
        this.f2873f = bahVar;
    }

    /* JADX INFO: renamed from: a */
    public static bcj m2157a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new bcj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static List m2158e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ayc.m2099a();
            Log.e(f2869b, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m2159f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ayc.m2099a();
            Log.e(f2869b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: b */
    public final void mo2117b(String str) {
        ArrayList arrayList;
        List<JobInfo> listM2158e = m2158e(this.f2870c, this.f2871d);
        if (listM2158e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listM2158e) {
                bcj bcjVarM2157a = m2157a(jobInfo);
                if (bcjVarM2157a != null && str.equals(bcjVarM2157a.f2946a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2159f(this.f2871d, ((Integer) it.next()).intValue());
        }
        bce bceVarMo1704y = this.f2872e.f2782d.mo1704y();
        bci bciVar = (bci) bceVarMo1704y;
        bciVar.f2942a.m1824l();
        arf arfVarM1853e = bciVar.f2944c.m1853e();
        if (str == null) {
            arfVarM1853e.mo1846f(1);
        } else {
            arfVarM1853e.mo1847g(1, str);
        }
        bciVar.f2942a.m1825m();
        try {
            arfVarM1853e.m1883a();
            ((bci) bceVarMo1704y).f2942a.m1829q();
        } finally {
            bciVar.f2942a.m1827o();
            bciVar.f2944c.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: c */
    public final void mo2118c(bcv... bcvVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.f2872e.f2782d;
        byte[] bArr = null;
        bkn bknVar = new bkn(workDatabase, (byte[]) null);
        for (bcv bcvVar : bcvVarArr) {
            workDatabase.m1825m();
            try {
                bcv bcvVarMo2232a = workDatabase.mo1700B().mo2232a(bcvVar.f2964a);
                if (bcvVarMo2232a == null) {
                    ayc.m2099a();
                    Log.w(f2869b, "Skipping scheduling " + bcvVar.f2964a + " because it's no longer in the DB");
                    workDatabase.m1829q();
                } else if (bcvVarMo2232a.f2981r != 1) {
                    ayc.m2099a();
                    Log.w(f2869b, "Skipping scheduling " + bcvVar.f2964a + " because it is no longer enqueued");
                    workDatabase.m1829q();
                } else {
                    bcj bcjVarM2189b = bbu.m2189b(bcvVar);
                    bcd bcdVarM2124b = azo.m2124b(workDatabase.mo1704y(), bcjVarM2189b);
                    if (bcdVarM2124b != null) {
                        iIntValue = bcdVarM2124b.f2941c;
                    } else {
                        int i = this.f2872e.f2781c.f2673d;
                        Object objM1819d = ((apt) bknVar.f3651a).m1819d(new bdv(bknVar, 2, bArr, bArr));
                        objM1819d.getClass();
                        iIntValue = ((Number) objM1819d).intValue();
                    }
                    if (bcdVarM2124b == null) {
                        this.f2872e.f2782d.mo1704y().mo2193a(azv.m2141b(bcjVarM2189b, iIntValue));
                    }
                    m2160g(bcvVar, iIntValue);
                    workDatabase.m1829q();
                }
                workDatabase.m1827o();
            } catch (Throwable th) {
                workDatabase.m1827o();
                throw th;
            }
        }
    }

    @Override // p000.azd
    /* JADX INFO: renamed from: d */
    public final boolean mo2119d() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2160g(bcv bcvVar, int i) {
        int i2;
        bah bahVar = this.f2873f;
        axr axrVar = bcvVar.f2972i;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", bcvVar.f2964a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", bcvVar.f2980q);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", bcvVar.m2231e());
        JobInfo.Builder extras = new JobInfo.Builder(i, bahVar.f2867a).setRequiresCharging(axrVar.f2679b).setRequiresDeviceIdle(axrVar.f2680c).setExtras(persistableBundle);
        int i3 = axrVar.f2686i;
        if (i3 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            switch (i3 - 1) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            extras.setRequiredNetworkType(i2);
        }
        if (!axrVar.f2680c) {
            extras.setBackoffCriteria(bcvVar.f2974k, bcvVar.f2982s == 2 ? 0 : 1);
        }
        long jMax = Math.max(bcvVar.m2228a() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!bcvVar.f2978o) {
            extras.setImportantWhileForeground(true);
        }
        if (axrVar.m2089a()) {
            for (axq axqVar : axrVar.f2685h) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(axqVar.f2676a, axqVar.f2677b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(axrVar.f2683f);
            extras.setTriggerContentMaxDelay(axrVar.f2684g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(axrVar.f2681d);
        extras.setRequiresStorageNotLow(axrVar.f2682e);
        int i4 = bcvVar.f2973j;
        if (bcvVar.f2978o && i4 <= 0 && jMax <= 0) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        ayc.m2099a();
        String str = bcvVar.f2964a;
        try {
            if (this.f2871d.schedule(jobInfoBuild) == 0) {
                ayc.m2099a();
                Log.w(f2869b, "Unable to schedule work ID " + bcvVar.f2964a);
                if (bcvVar.f2978o && bcvVar.f2983t == 1) {
                    bcvVar.f2978o = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", bcvVar.f2964a);
                    ayc.m2099a();
                    m2160g(bcvVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List listM2158e = m2158e(this.f2870c, this.f2871d);
            int size = listM2158e != null ? listM2158e.size() : 0;
            Locale locale = Locale.getDefault();
            int i5 = this.f2872e.f2781c.f2674e;
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(size), Integer.valueOf(this.f2872e.f2782d.mo1700B().mo2234c().size()), 20);
            ayc.m2099a();
            Log.e(f2869b, str2);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            ayc.m2099a();
            String str3 = f2869b;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to schedule ");
            sb.append(bcvVar);
            Log.e(str3, "Unable to schedule ".concat(String.valueOf(bcvVar)), th);
        }
    }
}
