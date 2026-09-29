package p109f5;

import ae.C0062b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import p026b5.AbstractC1314g;
import p026b5.C1309b;
import p041c5.C1699a0;
import p041c5.InterfaceC1720r;
import p214k5.C6602d;
import p214k5.C6607i;
import p214k5.C6610l;
import p214k5.C6617s;
import p260m8.C7499b;
import p290o6.C7967l0;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5469b implements InterfaceC1720r {

    /* JADX INFO: renamed from: e */
    public static final String f34052e = AbstractC1314g.m4868f("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f34053a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f34054b;

    /* JADX INFO: renamed from: c */
    public final C1699a0 f34055c;

    /* JADX INFO: renamed from: d */
    public final C5468a f34056d;

    public C5469b(Context context, C1699a0 c1699a0) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C5468a c5468a = new C5468a(context);
        this.f34053a = context;
        this.f34055c = c1699a0;
        this.f34054b = jobScheduler;
        this.f34056d = c5468a;
    }

    /* JADX INFO: renamed from: d */
    public static void m11708d(int i10, JobScheduler jobScheduler) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC1314g.m4867d().mo4871c(f34052e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m11709e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            AbstractC1314g.m4867d().mo4871c(f34052e, "getAllPendingJobs() is not reliable on this device.", th2);
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
    public static C6610l m11710f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new C6610l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
            } catch (NullPointerException unused) {
            }
        }
        return null;
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: a */
    public final void mo5460a(C6617s... c6617sArr) {
        int iIntValue;
        C1699a0 c1699a0 = this.f34055c;
        WorkDatabase workDatabase = c1699a0.f9477c;
        final C7967l0 c7967l0 = new C7967l0(workDatabase);
        for (C6617s c6617s : c6617sArr) {
            workDatabase.m4552c();
            try {
                C6617s c6617sMo13237o = workDatabase.mo4718z().mo13237o(c6617s.f37524a);
                String str = f34052e;
                String str2 = c6617s.f37524a;
                if (c6617sMo13237o == null) {
                    AbstractC1314g.m4867d().mo4873g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.m4568s();
                } else if (c6617sMo13237o.f37525b != WorkInfo$State.ENQUEUED) {
                    AbstractC1314g.m4867d().mo4873g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.m4568s();
                } else {
                    C6610l c6610lM14892A = C7499b.m14892A(c6617s);
                    C6607i c6607iMo13209a = workDatabase.mo4715w().mo13209a(c6610lM14892A);
                    if (c6607iMo13209a != null) {
                        iIntValue = c6607iMo13209a.f37509c;
                    } else {
                        c1699a0.f9476b.getClass();
                        final int i10 = c1699a0.f9476b.f7816g;
                        Object objM4567r = ((WorkDatabase) c7967l0.f43382a).m4567r(new Callable() { // from class: l5.j

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ int f40755b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C7967l0 c7967l1 = c7967l0;
                                C5207g.m11111f(c7967l1, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) c7967l1.f43382a;
                                int iM252C = C0062b.m252C(workDatabase2, "next_job_scheduler_id");
                                int i11 = this.f40755b;
                                if (!(i11 <= iM252C && iM252C <= i10)) {
                                    workDatabase2.mo4714v().mo13208b(new C6602d("next_job_scheduler_id", Long.valueOf(i11 + 1)));
                                    iM252C = i11;
                                }
                                return Integer.valueOf(iM252C);
                            }
                        });
                        C5207g.m11110e(objM4567r, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objM4567r).intValue();
                    }
                    if (c6607iMo13209a == null) {
                        c1699a0.f9477c.mo4715w().mo13212d(new C6607i(c6610lM14892A.f37514a, c6610lM14892A.f37515b, iIntValue));
                    }
                    m11711g(c6617s, iIntValue);
                    workDatabase.m4568s();
                }
                workDatabase.m4563n();
            } catch (Throwable th2) {
                workDatabase.m4563n();
                throw th2;
            }
        }
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: b */
    public final boolean mo5461b() {
        return true;
    }

    @Override // p041c5.InterfaceC1720r
    /* JADX INFO: renamed from: c */
    public final void mo5462c(String str) {
        ArrayList arrayList;
        Context context = this.f34053a;
        JobScheduler jobScheduler = this.f34054b;
        ArrayList<JobInfo> arrayListM11709e = m11709e(context, jobScheduler);
        if (arrayListM11709e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListM11709e) {
                C6610l c6610lM11710f = m11710f(jobInfo);
                if (c6610lM11710f != null && str.equals(c6610lM11710f.f37514a)) {
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
            m11708d(((Integer) it.next()).intValue(), jobScheduler);
        }
        this.f34055c.f9477c.mo4715w().mo13213e(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m11711g(C6617s c6617s, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f34054b;
        C5468a c5468a = this.f34056d;
        c5468a.getClass();
        C1309b c1309b = c6617s.f37533j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = c6617s.f37524a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c6617s.f37543t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c6617s.m13222c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, c5468a.f34050a).setRequiresCharging(c1309b.f8047b);
        boolean z10 = c1309b.f8048c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z10).setExtras(persistableBundle);
        int i12 = Build.VERSION.SDK_INT;
        NetworkType networkType = c1309b.f8046a;
        if (i12 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i13 = C5468a.a.f34051a[networkType.ordinal()];
            if (i13 == 1) {
                i11 = 0;
            } else if (i13 == 2) {
                i11 = 1;
            } else if (i13 == 3) {
                i11 = 2;
            } else if (i13 == 4) {
                i11 = 3;
            } else if (i13 != 5) {
                AbstractC1314g.m4867d().mo4869a(C5468a.f34049b, "API version too low. Cannot convert network type value " + networkType);
                i11 = 1;
            } else {
                i11 = 4;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z10) {
            extras.setBackoffCriteria(c6617s.f37536m, c6617s.f37535l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c6617s.m13220a() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c6617s.f37540q) {
            extras.setImportantWhileForeground(true);
        }
        Set<C1309b.a> set = c1309b.f8053h;
        if (!set.isEmpty()) {
            for (C1309b.a aVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f8054a, aVar.f8055b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c1309b.f8051f);
            extras.setTriggerContentMaxDelay(c1309b.f8052g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c1309b.f8049d);
        extras.setRequiresStorageNotLow(c1309b.f8050e);
        boolean z11 = c6617s.f37534k > 0;
        boolean z12 = jMax > 0;
        if (i14 >= 31 && c6617s.f37540q && !z11 && !z12) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f34052e;
        AbstractC1314g.m4867d().mo4869a(str2, "Scheduling work ID " + str + "Job ID " + i10);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                AbstractC1314g.m4867d().mo4873g(str2, "Unable to schedule work ID " + str);
                if (c6617s.f37540q && c6617s.f37541r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c6617s.f37540q = false;
                    AbstractC1314g.m4867d().mo4869a(str2, String.format("Scheduling a non-expedited job (work ID %s)", str));
                    m11711g(c6617s, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListM11709e = m11709e(this.f34053a, jobScheduler);
            int size = arrayListM11709e != null ? arrayListM11709e.size() : 0;
            Locale locale = Locale.getDefault();
            C1699a0 c1699a0 = this.f34055c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(size), Integer.valueOf(c1699a0.f9477c.mo4718z().mo13231i().size()), Integer.valueOf(c1699a0.f9476b.f7817h));
            AbstractC1314g.m4867d().mo4870b(str2, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e10);
            c1699a0.f9476b.getClass();
            throw illegalStateException;
        } catch (Throwable th2) {
            AbstractC1314g.m4867d().mo4871c(str2, "Unable to schedule " + c6617s, th2);
        }
    }
}
