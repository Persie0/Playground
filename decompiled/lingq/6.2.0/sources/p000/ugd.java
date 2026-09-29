package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ugd {
    /* JADX INFO: renamed from: a */
    public static Pair m22735a(sq5 sq5Var, int i, ce4 ce4Var, o67 o67Var) {
        l67 l67VarM15901d;
        rq7 rq7VarM20117a;
        synchronized (o67Var) {
            String strM21354f = o67Var.f53897a.m21354f();
            l67VarM15901d = strM21354f == null ? null : l67.m15901d(dg4.m10329d(strM21354f, true));
        }
        if (l67VarM15901d == null) {
            sq5Var.m21555D("failed to retrieve payload from the queue, dropping payload");
            o67Var.m17825e();
            return new Pair(Boolean.FALSE, ie4.m13807a());
        }
        if (((rl7) ce4Var.f9967b).m20693i().m25692F().f55555d.f63390a) {
            sq5Var.m21555D("SDK disabled, dropping payload");
            o67Var.m17825e();
            return new Pair(Boolean.FALSE, ie4.m13807a());
        }
        l67VarM15901d.m15902e(((d74) ce4Var.f9968c).f35077a, (g02) ce4Var.f9969d);
        if (!l67VarM15901d.m15904g((g02) ce4Var.f9969d)) {
            sq5Var.m21555D("payload is disabled, dropping payload");
            o67Var.m17825e();
            return new Pair(Boolean.FALSE, ie4.m13807a());
        }
        qq7 qq7Var = (qq7) ce4Var.f9972g;
        synchronized (qq7Var) {
            rq7VarM20117a = qq7Var.m20117a(true);
        }
        if (!rq7VarM20117a.f59723a) {
            sq5Var.m21555D("Rate limited, waiting for limit to be lifted");
            return new Pair(Boolean.FALSE, new ie4(JobAction.GoWaitForDependencies, null, -1L));
        }
        nk6 nk6VarM15906i = l67VarM15901d.m15906i(((d74) ce4Var.f9968c).f35077a, i, ((rl7) ce4Var.f9967b).m20693i().m25692F().f55560i.m24936a());
        boolean z = nk6VarM15906i.f52879a;
        if (!z && !nk6VarM15906i.f52880b) {
            sq5Var.m21555D("Transmit failed, out of attempts after " + i + " attempts");
            o67Var.m17825e();
            return new Pair(Boolean.FALSE, ie4.m13807a());
        }
        if (z) {
            o67Var.m17825e();
            return new Pair(Boolean.FALSE, ie4.m13807a());
        }
        sq5Var.m21555D("Transmit failed, retrying after " + (nk6VarM15906i.f52881c / 1000.0d) + " seconds");
        synchronized (o67Var) {
            o67Var.f53897a.m21362n(l67VarM15901d.m15905h().toString());
        }
        return new Pair(Boolean.TRUE, ie4.m13810d(nk6VarM15906i.f52881c));
    }
}
