package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ae4 extends bd4 {

    /* JADX INFO: renamed from: q */
    public static final String f539q;

    /* JADX INFO: renamed from: r */
    public static final sq5 f540r;

    static {
        List list = se4.f60736a;
        f539q = "JobMetaReferrer";
        sj5 sj5VarM20396w = r46.m20396w();
        f540r = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobMetaReferrer");
    }

    /* JADX INFO: renamed from: q */
    public static ae4 m295q() {
        return new ae4(f539q, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f540r);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        ay5 ay5Var;
        x44 x44Var = ((rl7) ce4Var.f9967b).m20693i().m25692F().f55565n;
        try {
            ay5Var = cy5.m9938d(((d74) ce4Var.f9968c).f35077a, (String[]) x44Var.f67752c, (String) x44Var.f67753d);
        } catch (Throwable th) {
            f540r.m21555D("Unable to read the referrer: " + th.getMessage());
            ay5Var = new ay5(System.currentTimeMillis(), 0, 0L, dg4.m10328c());
        }
        return ie4.m13808b(ay5Var);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        by5 by5Var = (by5) obj;
        if (!z || by5Var == null) {
            return;
        }
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        g02 g02Var = (g02) ce4Var.f9969d;
        rl7Var.m20694j().m567N(by5Var);
        d02 d02VarM12256d = g02Var.m12256d();
        synchronized (d02VarM12256d) {
            d02VarM12256d.f34771q = by5Var;
        }
        g02Var.m12254b(SdkTimingAction.MetaReferrerCompleted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo298i(ce4 ce4Var) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        by5 by5Var;
        if (!((rl7) ce4Var.f9967b).m20693i().m25692F().f55565n.f67751b || !((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "meta_referrer")) {
            return true;
        }
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            by5Var = am7VarM20694j.f836M;
        }
        return by5Var != null && ((ay5) by5Var).f7666a > 0;
    }
}
