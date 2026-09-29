package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zd4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f71384r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f71385s;

    /* JADX INFO: renamed from: q */
    public long f71386q;

    static {
        List list = se4.f60736a;
        f71384r = "JobMetaAttributionId";
        sj5 sj5VarM20396w = r46.m20396w();
        f71385s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobMetaAttributionId");
    }

    /* JADX INFO: renamed from: q */
    public static zd4 m25558q() {
        zd4 zd4Var = new zd4(f71384r, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f71385s);
        zd4Var.f71386q = 0L;
        return zd4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        boolean zM12259g = ((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "fb_attribution_id");
        sq5 sq5Var = f71385s;
        if (!zM12259g) {
            r46.m20394u(sq5Var, "Collection of FB ATTRIBUTION ID denied");
            return ie4.m13808b(null);
        }
        try {
            String strM9937c = cy5.m9937c(((d74) ce4Var.f9968c).f35077a);
            r46.m20394u(sq5Var, "Collection of FB ATTRIBUTION ID succeeded");
            return ie4.m13808b(strM9937c);
        } catch (Throwable th) {
            r46.m20394u(sq5Var, "Collection of FB ATTRIBUTION ID failed");
            sq5Var.m21555D(th.getMessage());
            return ie4.m13808b(null);
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        String str = (String) obj;
        if (z) {
            this.f71386q = System.currentTimeMillis();
            d02 d02VarM12256d = ((g02) ce4Var.f9969d).m12256d();
            synchronized (d02VarM12256d) {
                d02VarM12256d.f34770p = str;
            }
        }
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
        long jM25691E = ((rl7) ce4Var.f9967b).m20693i().m25691E();
        long jM13600e = ((hz8) ce4Var.f9970e).m13600e();
        long j = this.f71386q;
        return j >= jM25691E && j >= jM13600e;
    }
}
