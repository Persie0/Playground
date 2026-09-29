package p000;

import android.content.Context;
import com.android.installreferrer.api.C0918b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class id4 extends bd4 {

    /* JADX INFO: renamed from: s */
    public static final String f43964s;

    /* JADX INFO: renamed from: t */
    public static final sq5 f43965t;

    /* JADX INFO: renamed from: u */
    public static final Object f43966u;

    /* JADX INFO: renamed from: q */
    public int f43967q;

    /* JADX INFO: renamed from: r */
    public C0918b f43968r;

    static {
        List list = se4.f60736a;
        f43964s = "JobGoogleReferrer";
        sj5 sj5VarM20396w = r46.m20396w();
        f43965t = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobGoogleReferrer");
        f43966u = new Object();
    }

    /* JADX INFO: renamed from: q */
    public static void m13793q(id4 id4Var, ce4 ce4Var, GoogleReferrerStatus googleReferrerStatus) {
        id4Var.m13794r();
        v44 v44Var = ((rl7) ce4Var.f9967b).m20693i().m25692F().f55558g;
        uo3 uo3VarM22843a = uo3.m22843a(id4Var.f43967q, ci8.m4710W(id4Var.f8377j), googleReferrerStatus);
        GoogleReferrerStatus googleReferrerStatus2 = uo3VarM22843a.f64130d;
        if (googleReferrerStatus2 != GoogleReferrerStatus.FeatureNotSupported && googleReferrerStatus2 != GoogleReferrerStatus.MissingDependency && googleReferrerStatus2 != GoogleReferrerStatus.PermissionError) {
            int i = id4Var.f43967q;
            int i2 = v44Var.f64837b;
            double d = v44Var.f64838c;
            if (i < i2 + 1) {
                f43965t.m21555D("Gather failed, retrying in " + (ci8.m4705R(d) / 1000.0d) + " seconds");
                id4Var.f43967q = id4Var.f43967q + 1;
                id4Var.m3640f(ie4.m13810d(ci8.m4705R(d)), JobState.RunningAsync);
                return;
            }
        }
        id4Var.m3640f(ie4.m13808b(uo3VarM22843a), JobState.RunningAsync);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        v44 v44Var = ((rl7) ce4Var.f9967b).m20693i().m25692F().f55558g;
        if (jobAction == JobAction.ResumeAsyncTimeOut) {
            m13794r();
            int i = this.f43967q;
            if (i >= v44Var.f64837b + 1) {
                return ie4.m13808b(uo3.m22843a(i, ci8.m4710W(this.f8377j), GoogleReferrerStatus.TimedOut));
            }
            this.f43967q = i + 1;
        }
        try {
            synchronized (f43966u) {
                Context context = InstallReferrerClient.newBuilder(((d74) ce4Var.f9968c).f35077a).f8045a;
                if (context == null) {
                    throw new IllegalArgumentException("Please provide a valid Context.");
                }
                C0918b c0918b = new C0918b(context);
                this.f43968r = c0918b;
                c0918b.startConnection(new bl2(this, ce4Var, false));
            }
            return ie4.m13809c(ci8.m4705R(v44Var.f64839d));
        } catch (Throwable th) {
            f43965t.m21555D("Unable to create referrer client: " + th.getMessage());
            return ie4.m13808b(uo3.m22843a(this.f43967q, ci8.m4710W(this.f8377j), GoogleReferrerStatus.MissingDependency));
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        uo3 uo3Var = (uo3) obj;
        if (!z || uo3Var == null) {
            return;
        }
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        g02 g02Var = (g02) ce4Var.f9969d;
        rl7Var.m20694j().m564K(uo3Var);
        d02 d02VarM12256d = g02Var.m12256d();
        synchronized (d02VarM12256d) {
            d02VarM12256d.f34761g = uo3Var;
        }
        g02Var.m12254b(SdkTimingAction.GoogleReferrerCompleted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        this.f43967q = 1;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        uo3 uo3Var;
        if (!((rl7) ce4Var.f9967b).m20693i().m25692F().f55558g.f64836a || !((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "install_referrer")) {
            return true;
        }
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            uo3Var = am7VarM20694j.f833J;
        }
        return (uo3Var == null || uo3Var.f64130d == GoogleReferrerStatus.NotGathered) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final void m13794r() {
        synchronized (f43966u) {
            try {
                C0918b c0918b = this.f43968r;
                if (c0918b != null) {
                    c0918b.endConnection();
                }
            } catch (Throwable th) {
                f43965t.m21555D("Unable to close the referrer client: " + th.getMessage());
            }
            this.f43968r = null;
        }
    }
}
