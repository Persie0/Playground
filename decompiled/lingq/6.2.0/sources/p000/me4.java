package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.store.samsung.referrer.internal.SamsungReferrerStatus;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerStateListener;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class me4 extends bd4 {

    /* JADX INFO: renamed from: s */
    public static final String f51200s;

    /* JADX INFO: renamed from: t */
    public static final sq5 f51201t;

    /* JADX INFO: renamed from: u */
    public static final Object f51202u;

    /* JADX INFO: renamed from: q */
    public int f51203q;

    /* JADX INFO: renamed from: r */
    public InstallReferrerClient f51204r;

    static {
        List list = se4.f60736a;
        f51200s = "JobSamsungReferrer";
        sj5 sj5VarM20396w = r46.m20396w();
        f51201t = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobSamsungReferrer");
        f51202u = new Object();
    }

    /* JADX INFO: renamed from: q */
    public static InstallReferrerStateListener m16793q() {
        return new le4();
    }

    /* JADX INFO: renamed from: r */
    public static me4 m16794r() {
        me4 me4Var = new me4(f51200s, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f51201t);
        me4Var.f51203q = 1;
        me4Var.f51204r = null;
        return me4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        bl8 bl8Var = (bl8) obj;
        if (!z || bl8Var == null) {
            return;
        }
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        g02 g02Var = (g02) ce4Var.f9969d;
        rl7Var.m20694j().m569P(bl8Var);
        d02 d02VarM12256d = g02Var.m12256d();
        synchronized (d02VarM12256d) {
            d02VarM12256d.f34767m = bl8Var;
        }
        g02Var.m12254b(SdkTimingAction.SamsungReferrerCompleted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        this.f51203q = 1;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        bl8 bl8Var;
        if (!((rl7) ce4Var.f9967b).m20693i().m25692F().f55563l.f64836a || !((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "samsung_referrer")) {
            return true;
        }
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            bl8Var = am7VarM20694j.f835L;
        }
        return bl8Var != null && ((al8) bl8Var).m543d();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        v44 v44Var = ((rl7) ce4Var.f9967b).m20693i().m25692F().f55563l;
        if (jobAction == JobAction.ResumeAsyncTimeOut) {
            m16796t();
            int i = this.f51203q;
            if (i >= v44Var.f64837b + 1) {
                return ie4.m13808b(new al8(System.currentTimeMillis(), i, ci8.m4710W(this.f8377j), SamsungReferrerStatus.TimedOut, null, null, null));
            }
            this.f51203q = i + 1;
        }
        try {
            synchronized (f51202u) {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(((d74) ce4Var.f9968c).f35077a).build();
                this.f51204r = installReferrerClientBuild;
                installReferrerClientBuild.startConnection(m16793q());
            }
            return ie4.m13809c(ci8.m4705R(v44Var.f64839d));
        } catch (Throwable th) {
            f51201t.m21555D("Unable to create referrer client: " + th.getMessage());
            return ie4.m13808b(new al8(System.currentTimeMillis(), this.f51203q, ci8.m4710W(this.f8377j), SamsungReferrerStatus.MissingDependency, null, null, null));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m16796t() {
        synchronized (f51202u) {
            try {
                InstallReferrerClient installReferrerClient = this.f51204r;
                if (installReferrerClient != null) {
                    installReferrerClient.endConnection();
                }
            } catch (Throwable th) {
                f51201t.m21555D("Unable to close the referrer client: " + th.getMessage());
            }
            this.f51204r = null;
        }
    }
}
