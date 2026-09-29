package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gd4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f40567r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f40568s;

    /* JADX INFO: renamed from: q */
    public long f40569q;

    static {
        List list = se4.f60736a;
        f40567r = "JobGoogleAdvertisingId";
        sj5 sj5VarM20396w = r46.m20396w();
        f40568s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobGoogleAdvertisingId");
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        boolean zM12259g = ((g02) ce4Var.f9969d).m12259g(PayloadType.Install, "adid");
        sq5 sq5Var = f40568s;
        if (!zM12259g) {
            r46.m20394u(sq5Var, "Collection of ADID denied");
            return ie4.m13808b(null);
        }
        try {
            Pair pairM24624a = xo3.m24624a(((d74) ce4Var.f9968c).f35077a);
            r46.m20394u(sq5Var, "Collection of ADID succeeded");
            return ie4.m13808b(pairM24624a);
        } catch (Throwable th) {
            r46.m20394u(sq5Var, "Collection of ADID failed");
            sq5Var.m21555D(th.getMessage());
            return ie4.m13808b(null);
        }
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        Pair pair = (Pair) obj;
        if (z) {
            this.f40569q = System.currentTimeMillis();
            g02 g02Var = (g02) ce4Var.f9969d;
            if (pair == null) {
                d02 d02VarM12256d = g02Var.m12256d();
                synchronized (d02VarM12256d) {
                    d02VarM12256d.f34757c = null;
                    d02VarM12256d.f34758d = null;
                }
                return;
            }
            d02 d02VarM12256d2 = g02Var.m12256d();
            String str = (String) pair.first;
            Boolean bool = (Boolean) pair.second;
            synchronized (d02VarM12256d2) {
                d02VarM12256d2.f34757c = str;
                d02VarM12256d2.f34758d = bool;
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
        long j = this.f40569q;
        return j >= jM25691E && j >= jM13600e;
    }
}
