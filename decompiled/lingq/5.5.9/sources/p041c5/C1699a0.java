package p041c5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelper;
import androidx.work.C1243a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1317j;
import p026b5.AbstractC1318k;
import p026b5.C1315h;
import p026b5.InterfaceC1316i;
import p064d5.C5046c;
import p109f5.C5469b;
import p170i5.C6195n;
import p235l5.C7267n;
import p235l5.C7268o;
import p235l5.ExecutorC7270q;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;
import p288o4.InterfaceC7917c;

/* JADX INFO: renamed from: c5.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1699a0 extends AbstractC1317j {

    /* JADX INFO: renamed from: k */
    public static C1699a0 f9472k;

    /* JADX INFO: renamed from: l */
    public static C1699a0 f9473l;

    /* JADX INFO: renamed from: m */
    public static final Object f9474m;

    /* JADX INFO: renamed from: a */
    public Context f9475a;

    /* JADX INFO: renamed from: b */
    public C1243a f9476b;

    /* JADX INFO: renamed from: c */
    public WorkDatabase f9477c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7479a f9478d;

    /* JADX INFO: renamed from: e */
    public List<InterfaceC1720r> f9479e;

    /* JADX INFO: renamed from: f */
    public C1719q f9480f;

    /* JADX INFO: renamed from: g */
    public C7268o f9481g;

    /* JADX INFO: renamed from: h */
    public boolean f9482h;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f9483i;

    /* JADX INFO: renamed from: j */
    public final C6195n f9484j;

    /* JADX INFO: renamed from: c5.a0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m5434a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        AbstractC1314g.m4868f("WorkManagerImpl");
        f9472k = null;
        f9473l = null;
        f9474m = new Object();
    }

    public C1699a0(Context context, C1243a c1243a, C7480b c7480b) {
        RoomDatabase.C1180a c1180aM10983D0;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        final Context applicationContext = context.getApplicationContext();
        ExecutorC7270q executorC7270q = c7480b.f41352a;
        C5207g.m11111f(applicationContext, "context");
        C5207g.m11111f(executorC7270q, "queryExecutor");
        if (z10) {
            c1180aM10983D0 = new RoomDatabase.C1180a(applicationContext, WorkDatabase.class, null);
            c1180aM10983D0.f7531j = true;
        } else {
            c1180aM10983D0 = C5206f.m10983D0(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            c1180aM10983D0.f7530i = new InterfaceC7917c.c() { // from class: c5.v
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p288o4.InterfaceC7917c.c
                /* JADX INFO: renamed from: a */
                public final InterfaceC7917c mo5467a(InterfaceC7917c.b bVar) {
                    Context context2 = applicationContext;
                    C5207g.m11111f(context2, "$context");
                    String str = bVar.f43147b;
                    InterfaceC7917c.a aVar = bVar.f43148c;
                    C5207g.m11111f(aVar, "callback");
                    if (true ^ (str == null || str.length() == 0)) {
                        return new FrameworkSQLiteOpenHelper(context2, str, aVar, true, true);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
            };
        }
        c1180aM10983D0.f7528g = executorC7270q;
        C1700b c1700b = C1700b.f9485a;
        C5207g.m11111f(c1700b, "callback");
        c1180aM10983D0.f7525d.add(c1700b);
        c1180aM10983D0.m4569a(C1710h.f9522c);
        c1180aM10983D0.m4569a(new C1728z(2, applicationContext, 3));
        c1180aM10983D0.m4569a(C1711i.f9523c);
        c1180aM10983D0.m4569a(C1712j.f9524c);
        c1180aM10983D0.m4569a(new C1728z(5, applicationContext, 6));
        c1180aM10983D0.m4569a(C1713k.f9525c);
        c1180aM10983D0.m4569a(C1714l.f9526c);
        c1180aM10983D0.m4569a(C1715m.f9527c);
        c1180aM10983D0.m4569a(new C1701b0(applicationContext));
        c1180aM10983D0.m4569a(new C1728z(10, applicationContext, 11));
        c1180aM10983D0.m4569a(C1706e.f9492c);
        c1180aM10983D0.m4569a(C1708f.f9520c);
        c1180aM10983D0.m4569a(C1709g.f9521c);
        c1180aM10983D0.f7533l = false;
        c1180aM10983D0.f7534m = true;
        WorkDatabase workDatabase = (WorkDatabase) c1180aM10983D0.m4570b();
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1314g.a aVar = new AbstractC1314g.a(c1243a.f7815f);
        synchronized (AbstractC1314g.f8060a) {
            AbstractC1314g.f8061b = aVar;
        }
        C6195n c6195n = new C6195n(applicationContext2, c7480b);
        this.f9484j = c6195n;
        String str = C1721s.f9552a;
        C5469b c5469b = new C5469b(applicationContext2, this);
        C7267n.m14658a(applicationContext2, SystemJobService.class, true);
        AbstractC1314g.m4867d().mo4869a(C1721s.f9552a, "Created SystemJobScheduler and enabled SystemJobService");
        List<InterfaceC1720r> listAsList = Arrays.asList(c5469b, new C5046c(applicationContext2, c1243a, c6195n, this));
        C1719q c1719q = new C1719q(context, c1243a, c7480b, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.f9475a = applicationContext3;
        this.f9476b = c1243a;
        this.f9478d = c7480b;
        this.f9477c = workDatabase;
        this.f9479e = listAsList;
        this.f9480f = c1719q;
        this.f9481g = new C7268o(workDatabase);
        this.f9482h = false;
        if (a.m5434a(applicationContext3)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f9478d.m14863a(new ForceStopRunnable(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public static C1699a0 m5430d(Context context) {
        C1699a0 c1699a0M5430d;
        Object obj = f9474m;
        synchronized (obj) {
            synchronized (obj) {
                try {
                    c1699a0M5430d = f9472k;
                    if (c1699a0M5430d == null) {
                        c1699a0M5430d = f9473l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c1699a0M5430d;
        }
        if (c1699a0M5430d == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof C1243a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m5431e(applicationContext, ((C1243a.b) applicationContext).mo4701a());
            c1699a0M5430d = m5430d(applicationContext);
        }
        return c1699a0M5430d;
    }

    /* JADX INFO: renamed from: e */
    public static void m5431e(Context context, C1243a c1243a) {
        synchronized (f9474m) {
            C1699a0 c1699a0 = f9472k;
            if (c1699a0 != null && f9473l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (c1699a0 == null) {
                Context applicationContext = context.getApplicationContext();
                if (f9473l == null) {
                    f9473l = new C1699a0(applicationContext, c1243a, new C7480b(c1243a.f7811b));
                }
                f9472k = f9473l;
            }
        }
    }

    @Override // p026b5.AbstractC1317j
    /* JADX INFO: renamed from: a */
    public final InterfaceC1316i mo4876a(List<? extends AbstractC1318k> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C1723u(this, null, ExistingWorkPolicy.KEEP, list).m5466k0();
    }

    @Override // p026b5.AbstractC1317j
    /* JADX INFO: renamed from: c */
    public final InterfaceC1316i mo4878c(String str, ExistingWorkPolicy existingWorkPolicy, List<C1315h> list) {
        return new C1723u(this, str, existingWorkPolicy, list).m5466k0();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m5432f() {
        synchronized (f9474m) {
            this.f9482h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f9483i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f9483i = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5433g() {
        ArrayList arrayListM11709e;
        Context context = this.f9475a;
        String str = C5469b.f34052e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListM11709e = C5469b.m11709e(context, jobScheduler)) != null && !arrayListM11709e.isEmpty()) {
            Iterator it = arrayListM11709e.iterator();
            while (it.hasNext()) {
                C5469b.m11708d(((JobInfo) it.next()).getId(), jobScheduler);
            }
        }
        this.f9477c.mo4718z().mo13243u();
        C1721s.m5463a(this.f9476b, this.f9477c, this.f9479e);
    }
}
