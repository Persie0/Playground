package p000;

import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.store.huawei.referrer.internal.HuaweiReferrerStatus;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rd4 extends bd4 {

    /* JADX INFO: renamed from: s */
    public static final String f59107s;

    /* JADX INFO: renamed from: t */
    public static final sq5 f59108t;

    /* JADX INFO: renamed from: u */
    public static final Object f59109u;

    /* JADX INFO: renamed from: q */
    public int f59110q;

    /* JADX INFO: renamed from: r */
    public InstallReferrerClient f59111r;

    static {
        List list = se4.f60736a;
        f59107s = "JobHuaweiReferrer";
        sj5 sj5VarM20396w = r46.m20396w();
        f59108t = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobHuaweiReferrer");
        f59109u = new Object();
    }

    /* JADX INFO: renamed from: q */
    public static InstallReferrerStateListener m20582q() {
        return new qd4();
    }

    /* JADX INFO: renamed from: r */
    public static rd4 m20583r() {
        rd4 rd4Var = new rd4(f59107s, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f59108t);
        rd4Var.f59110q = 1;
        rd4Var.f59111r = null;
        return rd4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        hx3 hx3Var = (hx3) obj;
        if (!z || hx3Var == null) {
            return;
        }
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        g02 g02Var = (g02) ce4Var.f9969d;
        rl7Var.m20694j().m565L(hx3Var);
        d02 d02VarM12256d = g02Var.m12256d();
        synchronized (d02VarM12256d) {
            d02VarM12256d.f34766l = hx3Var;
        }
        g02Var.m12254b(SdkTimingAction.HuaweiReferrerCompleted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        this.f59110q = 1;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        hx3 hx3Var;
        if (!((rl7) ce4Var.f9967b).m20693i().m25692F().f55556e.f64836a || !((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "huawei_referrer")) {
            return true;
        }
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            hx3Var = am7VarM20694j.f834K;
        }
        return hx3Var != null && ((gx3) hx3Var).m12960d();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        v44 v44Var = ((rl7) ce4Var.f9967b).m20693i().m25692F().f55556e;
        if (jobAction == JobAction.ResumeAsyncTimeOut) {
            m20585t();
            int i = this.f59110q;
            if (i >= v44Var.f64837b + 1) {
                return ie4.m13808b(new gx3(System.currentTimeMillis(), i, ci8.m4710W(this.f8377j), HuaweiReferrerStatus.TimedOut, null, null, null));
            }
            this.f59110q = i + 1;
        }
        try {
            synchronized (f59109u) {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(((d74) ce4Var.f9968c).f35077a).build();
                this.f59111r = installReferrerClientBuild;
                installReferrerClientBuild.startConnection(m20582q());
            }
            return ie4.m13809c(ci8.m4705R(v44Var.f64839d));
        } catch (Throwable th) {
            f59108t.m21555D("Unable to create referrer client: " + th.getMessage());
            return ie4.m13808b(new gx3(System.currentTimeMillis(), this.f59110q, ci8.m4710W(this.f8377j), HuaweiReferrerStatus.MissingDependency, null, null, null));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m20585t() {
        synchronized (f59109u) {
            try {
                InstallReferrerClient installReferrerClient = this.f59111r;
                if (installReferrerClient != null) {
                    installReferrerClient.endConnection();
                }
            } catch (Throwable th) {
                f59108t.m21555D("Unable to close the referrer client: " + th.getMessage());
            }
            this.f59111r = null;
        }
    }
}
