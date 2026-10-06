package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azp extends ayi {

    /* JADX INFO: renamed from: a */
    public static final Object f2777a;

    /* JADX INFO: renamed from: l */
    private static azp f2778l;

    /* JADX INFO: renamed from: m */
    private static azp f2779m;

    /* JADX INFO: renamed from: b */
    public Context f2780b;

    /* JADX INFO: renamed from: c */
    public axp f2781c;

    /* JADX INFO: renamed from: d */
    public WorkDatabase f2782d;

    /* JADX INFO: renamed from: e */
    public List f2783e;

    /* JADX INFO: renamed from: f */
    public azb f2784f;

    /* JADX INFO: renamed from: g */
    public boolean f2785g;

    /* JADX INFO: renamed from: h */
    public BroadcastReceiver.PendingResult f2786h;

    /* JADX INFO: renamed from: i */
    public final bbo f2787i;

    /* JADX INFO: renamed from: j */
    public bkn f2788j;

    /* JADX INFO: renamed from: k */
    public C1058va f2789k;

    static {
        ayc.m2100b("WorkManagerImpl");
        f2778l = null;
        f2779m = null;
        f2777a = new Object();
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public azp(Context context, final axp axpVar, C1058va c1058va, byte[] bArr) {
        aps apsVarM348g;
        boolean z = context.getResources().getBoolean(C0100R.bool.workmanager_test_configuration);
        final Context applicationContext = context.getApplicationContext();
        ?? r4 = c1058va.f47802a;
        applicationContext.getClass();
        r4.getClass();
        if (z) {
            apsVarM348g = new aps(applicationContext, WorkDatabase.class, null);
            apsVarM348g.m1815c();
        } else {
            apsVarM348g = aek.m348g(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            apsVarM348g.f2049c = new aqs() { // from class: azh
                @Override // p000.aqs
                /* JADX INFO: renamed from: a */
                public final aqt mo1878a(aqr aqrVar) {
                    return new ard().mo1878a(afk.m524p(applicationContext, aqrVar.f2153b, aqrVar.f2154c, true, true));
                }
            };
        }
        apsVarM348g.f2048b = r4;
        apsVarM348g.f2047a.add(ayn.f2727a);
        apsVarM348g.m1814b(ayt.f2732c);
        apsVarM348g.m1814b(new azc(applicationContext, 2, 3));
        apsVarM348g.m1814b(ayu.f2733c);
        apsVarM348g.m1814b(ayv.f2734c);
        apsVarM348g.m1814b(new azc(applicationContext, 5, 6));
        apsVarM348g.m1814b(ayw.f2735c);
        apsVarM348g.m1814b(ayx.f2736c);
        apsVarM348g.m1814b(ayy.f2737c);
        apsVarM348g.m1814b(new azq(applicationContext));
        apsVarM348g.m1814b(new azc(applicationContext, 10, 11));
        apsVarM348g.m1814b(ayp.f2728c);
        apsVarM348g.m1814b(ayq.f2729c);
        apsVarM348g.m1814b(ayr.f2730c);
        apsVarM348g.m1814b(ays.f2731c);
        apsVarM348g.m1816d();
        final WorkDatabase workDatabase = (WorkDatabase) apsVarM348g.m1813a();
        Context applicationContext2 = context.getApplicationContext();
        ayc aycVar = new ayc();
        synchronized (ayc.f2709a) {
            ayc.f2710b = aycVar;
        }
        bbo bboVar = new bbo(applicationContext2, c1058va, (byte[]) null);
        this.f2787i = bboVar;
        int i = azf.f2762a;
        bai baiVar = new bai(applicationContext2, this);
        bdz.m2261a(applicationContext2, SystemJobService.class, true);
        ayc.m2099a();
        final List listAsList = Arrays.asList(baiVar, new azu(applicationContext2, axpVar, bboVar, this));
        azb azbVar = new azb(context, axpVar, c1058va, workDatabase, null);
        Context applicationContext3 = context.getApplicationContext();
        this.f2780b = applicationContext3;
        this.f2781c = axpVar;
        this.f2789k = c1058va;
        this.f2782d = workDatabase;
        this.f2783e = listAsList;
        this.f2784f = azbVar;
        this.f2788j = new bkn(workDatabase);
        this.f2785g = false;
        final ?? r3 = c1058va.f47802a;
        azbVar.m2112b(new ayo() { // from class: aze
            @Override // p000.ayo
            /* JADX INFO: renamed from: a */
            public final void mo1714a(bcj bcjVar, boolean z2) {
                r3.execute(new apv(listAsList, bcjVar, axpVar, workDatabase, 2));
            }
        });
        if (azo.m2123a(applicationContext3)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        bdx.m2257b(this.f2789k, new bdu(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static azp m2125e(Context context) {
        azp azpVarM2125e;
        Object obj = f2777a;
        synchronized (obj) {
            synchronized (obj) {
                azpVarM2125e = f2778l;
                if (azpVarM2125e == null) {
                    azpVarM2125e = f2779m;
                }
            }
            return azpVarM2125e;
        }
        if (azpVarM2125e == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof axo)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            axp axpVarMo2087a = ((axo) applicationContext).mo2087a();
            synchronized (obj) {
                azp azpVar = f2778l;
                if (azpVar != null && f2779m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (azpVar == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (f2779m == null) {
                        f2779m = new azp(applicationContext2, axpVarMo2087a, new C1058va(axpVarMo2087a.f2671b), null);
                    }
                    f2778l = f2779m;
                }
                azpVarM2125e = m2125e(applicationContext);
            }
        }
        return azpVarM2125e;
    }

    @Override // p000.ayi
    /* JADX INFO: renamed from: a */
    public final nps mo2101a(String str) {
        bec becVar = new bec(this, str);
        ((beb) this.f2789k.f47802a).execute(becVar);
        return becVar.f3027c;
    }

    @Override // p000.ayi
    /* JADX INFO: renamed from: b */
    public final ayg mo2102b(String str, int i, List list) {
        return new azg(this, str, i, list).m2122h();
    }

    @Override // p000.ayi
    /* JADX INFO: renamed from: c */
    public final ayg mo2103c() {
        bds bdsVarM2248b = bds.m2248b("F250_WORKER_TAG", this, true);
        bdx.m2257b(this.f2789k, bdsVarM2248b);
        return bdsVarM2248b.f3006d;
    }

    /* JADX INFO: renamed from: f */
    public final void m2126f() {
        synchronized (f2777a) {
            this.f2785g = true;
            BroadcastReceiver.PendingResult pendingResult = this.f2786h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f2786h = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2127g() {
        List listM2158e;
        Context context = this.f2780b;
        int i = bai.f2868a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (listM2158e = bai.m2158e(context, jobScheduler)) != null && !listM2158e.isEmpty()) {
            Iterator it = listM2158e.iterator();
            while (it.hasNext()) {
                bai.m2159f(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        bcw bcwVarMo1700B = this.f2782d.mo1700B();
        bdk bdkVar = (bdk) bcwVarMo1700B;
        bdkVar.f2987a.m1824l();
        arf arfVarM1853e = bdkVar.f2992f.m1853e();
        bdkVar.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            ((bdk) bcwVarMo1700B).f2987a.m1829q();
            bdkVar.f2987a.m1827o();
            bdkVar.f2992f.m1855g(arfVarM1853e);
            azf.m2120a(this.f2781c, this.f2782d, this.f2783e);
        } catch (Throwable th) {
            bdkVar.f2987a.m1827o();
            bdkVar.f2992f.m1855g(arfVarM1853e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2128h(bkn bknVar) {
        m2130j(bknVar, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m2129i(bkn bknVar) {
        bdx.m2257b(this.f2789k, new bed(this, bknVar, false, null));
    }

    /* JADX INFO: renamed from: j */
    public final void m2130j(bkn bknVar, C0159ek c0159ek) {
        bdx.m2257b(this.f2789k, new aza(this, bknVar, c0159ek, 2, null, null, null));
    }
}
