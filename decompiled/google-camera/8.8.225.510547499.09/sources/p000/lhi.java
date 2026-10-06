package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhi implements lhg {

    /* JADX INFO: renamed from: a */
    private static final nbh f38263a = nbh.m17259h("com/google/android/libraries/performance/primes/federatedlearning/FederatedLearningExampleStoreImpl");

    /* JADX INFO: renamed from: b */
    private final Context f38264b;

    /* JADX INFO: renamed from: c */
    private final Executor f38265c;

    public lhi(Context context, Executor executor) {
        this.f38264b = context;
        this.f38265c = executor;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ pbp m15341h(nwr nwrVar, nwr nwrVar2) {
        nxl nxlVarM18137O = pbp.f47342b.m18137O();
        nxl nxlVarM18137O2 = pbs.f47350b.m18137O();
        nxl nxlVarM18137O3 = pbq.f47345c.m18137O();
        nxl nxlVarM18137O4 = pbo.f47339b.m18137O();
        nxlVarM18137O4.m18096az(nwrVar2);
        pbo pboVar = (pbo) nxlVarM18137O4.mo18103l();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        pbq pbqVar = (pbq) nxlVarM18137O3.f44974b;
        pboVar.getClass();
        pbqVar.f47348b = pboVar;
        pbqVar.f47347a = 1;
        nxlVarM18137O2.m18064aA("token", (pbq) nxlVarM18137O3.mo18103l());
        nxl nxlVarM18137O5 = pbq.f47345c.m18137O();
        nxl nxlVarM18137O6 = pbo.f47339b.m18137O();
        nxlVarM18137O6.m18096az(nwrVar);
        pbo pboVar2 = (pbo) nxlVarM18137O6.mo18103l();
        if (!nxlVarM18137O5.f44974b.m18142ac()) {
            nxlVarM18137O5.mo18106p();
        }
        pbq pbqVar2 = (pbq) nxlVarM18137O5.f44974b;
        pboVar2.getClass();
        pbqVar2.f47348b = pboVar2;
        pbqVar2.f47347a = 1;
        nxlVarM18137O2.m18064aA("application_package", (pbq) nxlVarM18137O5.mo18103l());
        pbs pbsVar = (pbs) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pbp pbpVar = (pbp) nxlVarM18137O.f44974b;
        pbsVar.getClass();
        pbpVar.f47344a = pbsVar;
        return (pbp) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: i */
    private final void m15342i(final String str, final jpf jpfVar) {
        final int iIntValue = nqp.m17625a(str).intValue();
        kxk.m14969O(new Callable() { // from class: lhh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f38258a.m15343f(str, str, iIntValue, jpfVar);
            }
        }, this.f38265c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (r3.schedule(r0) == 1) goto L12;
     */
    @Override // p000.lhg
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo15335a(String str, List list) {
        nwr nwrVarM17801w = nwr.m17801w(this.f38264b.getPackageName());
        ktz ktzVarM15348a = lhk.m15348a(this.f38264b);
        List listM16504L = mkv.m16504L(mkv.m16504L(list, new hgv(nwrVarM17801w, 19)), hnk.f28494g);
        ktz.m14847i(str);
        Object obj = ktzVarM15348a.f37201d;
        Object obj2 = ktzVarM15348a.f37200c;
        long j = jlh.f34301a;
        Context context = (Context) obj;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            JobInfo pendingJob = jobScheduler.getPendingJob(216934020);
            JobInfo jobInfoBuild = new JobInfo.Builder(216934020, new ComponentName(context, (Class<?>) obj2)).setPersisted(true).setRequiresCharging(true).setPeriodic(jlh.f34301a).build();
            if (pendingJob == null || pendingJob.isRequireCharging() != jobInfoBuild.isRequireCharging() || pendingJob.getIntervalMillis() != jlh.f34301a) {
                try {
                } catch (IllegalArgumentException e) {
                    Log.e("ExampleStrDataTtlSvc", "Buggy schedule() implementation!", e);
                }
            }
            kxk.m14975U(((jln) ktzVarM15348a.f37198a).m13341a(new dvz(str, listM16504L, 10)), new cod(4), this.f38265c);
            return;
        }
        throw new jll();
    }

    @Override // p000.lhg
    /* JADX INFO: renamed from: b */
    public void mo15336b(String str) {
        m15342i(str, jnm.f34405d);
    }

    @Override // p000.lhg
    /* JADX INFO: renamed from: c */
    public void mo15337c(String str) {
        m15342i(str, jnm.f34404c);
    }

    /* JADX INFO: renamed from: f */
    public /* synthetic */ jpp m15343f(String str, String str2, int i, jpf jpfVar) {
        Context context = this.f38264b;
        Executor executor = this.f38265c;
        jld jldVarM13339a = jle.m13339a();
        jldVarM13339a.m13336b(str);
        jldVarM13339a.m13338d(str2);
        jldVarM13339a.m13337c(i);
        return jmr.m13372c(context, executor, jldVarM13339a.m13335a()).mo13448a(this.f38265c, jpfVar);
    }
}
