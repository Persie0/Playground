package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xp9 implements sm8 {

    /* JADX INFO: renamed from: f */
    public static final String f68501f = oj5.m18041h("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f68502a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f68503b;

    /* JADX INFO: renamed from: c */
    public final wp9 f68504c;

    /* JADX INFO: renamed from: d */
    public final WorkDatabase f68505d;

    /* JADX INFO: renamed from: e */
    public final hh1 f68506e;

    public xp9(Context context, WorkDatabase workDatabase, hh1 hh1Var) {
        JobScheduler jobSchedulerM17403a = ne4.m17403a(context);
        wp9 wp9Var = new wp9(context, hh1Var.f42350d, hh1Var.f42358l);
        this.f68502a = context;
        this.f68503b = jobSchedulerM17403a;
        this.f68504c = wp9Var;
        this.f68505d = workDatabase;
        this.f68506e = hh1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m24631a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            oj5.m18040f().m18044e(f68501f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m24632b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = ne4.f52642a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            oj5.m18040f().m18044e(ne4.f52642a, "getAllPendingJobs() is not reliable on this device.", th);
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
    public static a8b m24633f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new a8b(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: c */
    public final boolean mo21480c() {
        return true;
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: d */
    public final void mo21481d(String str) {
        ArrayList arrayList;
        Context context = this.f68502a;
        JobScheduler jobScheduler = this.f68503b;
        ArrayList<JobInfo> arrayListM24632b = m24632b(context, jobScheduler);
        if (arrayListM24632b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListM24632b) {
                a8b a8bVarM24633f = m24633f(jobInfo);
                if (a8bVarM24633f != null && str.equals(a8bVarM24633f.m181b())) {
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
            m24631a(jobScheduler, ((Integer) it.next()).intValue());
        }
        sp9 sp9VarMo2906w = this.f68505d.mo2906w();
        sp9VarMo2906w.getClass();
        str.getClass();
        AbstractC0758a.m2859b(sp9VarMo2906w.f61206a, false, true, new ql4(str, 27));
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: e */
    public final void mo21482e(p8b... p8bVarArr) {
        int iM23871I;
        hh1 hh1Var = this.f68506e;
        WorkDatabase workDatabase = this.f68505d;
        web webVar = new web(workDatabase);
        for (p8b p8bVar : p8bVarArr) {
            workDatabase.m2830c();
            try {
                u8b u8bVarMo2909z = workDatabase.mo2909z();
                String str = p8bVar.f55772a;
                p8b p8bVarM22569e = u8bVarMo2909z.m22569e(str);
                String str2 = f68501f;
                if (p8bVarM22569e == null) {
                    oj5.m18040f().m18046j(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.m2846s();
                } else if (p8bVarM22569e.f55773b != WorkInfo$State.ENQUEUED) {
                    oj5.m18040f().m18046j(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.m2846s();
                } else {
                    a8b a8bVarM270b = acd.m270b(p8bVar);
                    rp9 rp9VarM21532a = workDatabase.mo2906w().m21532a(a8bVarM270b);
                    if (rp9VarM21532a != null) {
                        iM23871I = rp9VarM21532a.f59689c;
                    } else {
                        hh1Var.getClass();
                        iM23871I = webVar.m23871I(hh1Var.f42355i);
                    }
                    if (rp9VarM21532a == null) {
                        rp9 rp9VarM17245c = n5d.m17245c(a8bVarM270b, iM23871I);
                        sp9 sp9VarMo2906w = workDatabase.mo2906w();
                        sp9VarMo2906w.getClass();
                        AbstractC0758a.m2859b(sp9VarMo2906w.f61206a, false, true, new sx7(26, sp9VarMo2906w, rp9VarM17245c));
                    }
                    m24634g(p8bVar, iM23871I);
                    workDatabase.m2846s();
                }
                workDatabase.m2835h();
            } catch (Throwable th) {
                workDatabase.m2835h();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m24634g(p8b p8bVar, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String strM18986i;
        wp9 wp9Var = this.f68504c;
        wp9Var.getClass();
        ak1 ak1Var = p8bVar.f55781j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = p8bVar.f55772a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", p8bVar.m18981d());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", p8bVar.m18988k());
        JobInfo.Builder extras = new JobInfo.Builder(i, wp9Var.f67159a).setRequiresCharging(ak1Var.m521i()).setRequiresDeviceIdle(ak1Var.m522j()).setExtras(persistableBundle);
        NetworkRequest networkRequestM516d = ak1Var.m516d();
        if (networkRequestM516d != null) {
            o5d.m17810b(extras, networkRequestM516d);
        } else {
            NetworkType networkTypeM518f = ak1Var.m518f();
            if (Build.VERSION.SDK_INT < 30 || networkTypeM518f != NetworkType.TEMPORARILY_UNMETERED) {
                int i3 = vp9.f65768a[networkTypeM518f.ordinal()];
                if (i3 != 1) {
                    i2 = 2;
                    if (i3 == 2) {
                        i2 = 1;
                    } else if (i3 != 3) {
                        i2 = 4;
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 != 5) {
                            oj5.m18040f().m18042a(wp9.f67158d, "API version too low. Cannot convert network type value " + networkTypeM518f);
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!ak1Var.m522j()) {
            extras.setBackoffCriteria(p8bVar.f55784m, p8bVar.f55783l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jM18979a = p8bVar.m18979a();
        wp9Var.f67160b.getClass();
        long jMax = Math.max(jM18979a - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!p8bVar.f55788q && wp9Var.f67161c) {
            extras.setImportantWhileForeground(true);
        }
        if (ak1Var.m519g()) {
            for (yj1 yj1Var : ak1Var.m515c()) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(yj1Var.m25159a(), yj1Var.m25160b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(ak1Var.m514b());
            extras.setTriggerContentMaxDelay(ak1Var.m513a());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(ak1Var.m520h());
        extras.setRequiresStorageNotLow(ak1Var.m523k());
        Object[] objArr = p8bVar.f55782k > 0;
        Object[] objArr2 = jMax > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && p8bVar.f55788q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (strM18986i = p8bVar.m18986i()) != null) {
            extras.setTraceTag(strM18986i);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f68501f;
        oj5.m18040f().m18042a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (this.f68503b.schedule(jobInfoBuild) == 0) {
                oj5.m18040f().m18046j(str2, "Unable to schedule work ID " + str);
                if (p8bVar.f55788q && p8bVar.f55789r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    p8bVar.f55788q = false;
                    oj5.m18040f().m18042a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    m24634g(p8bVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = ne4.f52642a;
            Context context = this.f68502a;
            context.getClass();
            WorkDatabase workDatabase = this.f68505d;
            workDatabase.getClass();
            hh1 hh1Var = this.f68506e;
            hh1Var.getClass();
            int i5 = Build.VERSION.SDK_INT;
            int i6 = i5 >= 31 ? 150 : 100;
            int size = ((List) AbstractC0758a.m2859b(workDatabase.mo2909z().f63598a, true, false, new e0b(9))).size();
            String strM22596N0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler jobSchedulerM17403a = ne4.m17403a(context);
                try {
                    allPendingJobs = jobSchedulerM17403a.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    oj5.m18040f().m18044e(ne4.f52642a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListM24632b = m24632b(context, jobSchedulerM17403a);
                    int size2 = arrayListM24632b != null ? allPendingJobs.size() - arrayListM24632b.size() : 0;
                    String strM17732g = size2 == 0 ? null : AbstractC3393o1.m17732g(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListM24632b2 = m24632b(context, (JobScheduler) systemService);
                    int size3 = arrayListM24632b2 != null ? arrayListM24632b2.size() : 0;
                    strM22596N0 = u91.m22596N0(AbstractC3550rv.m20837e0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strM17732g, size3 != 0 ? AbstractC3393o1.m17732g(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListM24632b3 = m24632b(context, ne4.m17403a(context));
                if (arrayListM24632b3 != null) {
                    strM22596N0 = arrayListM24632b3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbM22995r = ux5.m22995r(i6, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strM22596N0, ".\nThere are ");
            sbM22995r.append(size);
            sbM22995r.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM24122r = wq1.m24122r(sbM22995r, hh1Var.f42357k, '.');
            oj5.m18040f().m18043c(str2, strM24122r);
            throw new IllegalStateException(strM24122r, e);
        } catch (Throwable th2) {
            oj5.m18040f().m18044e(str2, "Unable to schedule " + p8bVar, th2);
        }
    }
}
