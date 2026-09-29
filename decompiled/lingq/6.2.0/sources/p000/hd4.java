package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hd4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f42214r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f42215s;

    /* JADX INFO: renamed from: q */
    public long f42216q;

    static {
        List list = se4.f60736a;
        f42214r = "JobGoogleAppSetId";
        sj5 sj5VarM20396w = r46.m20396w();
        f42215s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobGoogleAppSetId");
    }

    /* JADX INFO: renamed from: q */
    public static hd4 m13205q() {
        hd4 hd4Var = new hd4(f42214r, Arrays.asList("JobInit", se4.f60739d), JobType.Persistent, TaskQueue.IO, f42215s);
        hd4Var.f42216q = 0L;
        return hd4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        boolean zM12259g = ((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "asid");
        sq5 sq5Var = f42215s;
        if (!zM12259g) {
            r46.m20394u(sq5Var, "Collection of ASID denied");
            return ie4.m13808b(null);
        }
        try {
            Pair pairM24625b = xo3.m24625b(((d74) ce4Var.f9968c).f35077a);
            r46.m20394u(sq5Var, "Collection of ASID succeeded");
            return ie4.m13808b(pairM24625b);
        } catch (Throwable th) {
            r46.m20394u(sq5Var, "Collection of ASID failed");
            sq5Var.m21555D(th.getMessage());
            return ie4.m13808b(null);
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        Pair pair = (Pair) obj;
        if (z) {
            this.f42216q = System.currentTimeMillis();
            g02 g02Var = (g02) ce4Var.f9969d;
            if (pair == null) {
                d02 d02VarM12256d = g02Var.m12256d();
                synchronized (d02VarM12256d) {
                    d02VarM12256d.f34759e = null;
                    d02VarM12256d.f34760f = null;
                }
                return;
            }
            d02 d02VarM12256d2 = g02Var.m12256d();
            String str = (String) pair.first;
            Integer num = (Integer) pair.second;
            synchronized (d02VarM12256d2) {
                d02VarM12256d2.f34759e = str;
                d02VarM12256d2.f34760f = num;
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
        long j = this.f42216q;
        return j >= jM25691E && j >= jM13600e;
    }
}
