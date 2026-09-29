package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.tracker.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ed4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f37054r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f37055s;

    /* JADX INFO: renamed from: q */
    public long f37056q;

    static {
        List list = se4.f60736a;
        f37054r = "JobBackFillPayloads";
        sj5 sj5VarM20396w = r46.m20396w();
        f37055s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobBackFillPayloads");
    }

    /* JADX INFO: renamed from: q */
    public static void m11061q(o67 o67Var, String str, C3487q7 c3487q7) {
        if (o67Var.m17824d() == 0) {
            f37055s.m21555D("Skipping " + str + " queue, empty");
            return;
        }
        f37055s.m21555D("Updating " + str + " queue");
        synchronized (o67Var) {
            o67Var.f53897a.m21363o(new dw6(c3487q7, 1));
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        o67 o67Var;
        C3487q7 c3487q7 = new C3487q7(ce4Var, 14);
        m11061q(((rl7) ce4Var.f9967b).m20689e(), "click", c3487q7);
        m11061q(((rl7) ce4Var.f9967b).m20704t(), "update", c3487q7);
        m11061q(((rl7) ce4Var.f9967b).m20692h(), "identityLink", c3487q7);
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        rl7Var.m20705u();
        synchronized (rl7.f59476R) {
            o67Var = rl7Var.f59483N;
        }
        m11061q(o67Var, "token", c3487q7);
        m11061q(((rl7) ce4Var.f9967b).m20703s(), "session", c3487q7);
        m11061q(((rl7) ce4Var.f9967b).m20691g(), "event", c3487q7);
        return ie4.m13807a();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        if (z) {
            this.f37056q = System.currentTimeMillis();
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
        long j;
        long jM25691E = ((rl7) ce4Var.f9967b).m20693i().m25691E();
        jm7 jm7VarM20700p = ((rl7) ce4Var.f9967b).m20700p();
        synchronized (jm7VarM20700p) {
            j = jm7VarM20700p.f45834d;
        }
        long j2 = this.f37056q;
        return j2 >= jM25691E && j2 >= j;
    }
}
