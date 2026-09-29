package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ud4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f63754r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f63755s;

    /* JADX INFO: renamed from: q */
    public int f63756q;

    static {
        List list = se4.f60736a;
        f63754r = "JobInstall";
        sj5 sj5VarM20396w = r46.m20396w();
        f63755s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobInstall");
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        l67 l67VarM15900c;
        rq7 rq7VarM20117a;
        long j;
        long j2;
        boolean z;
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            l67VarM15900c = am7VarM20694j.f837b;
        }
        if (l67VarM15900c == null) {
            PayloadType payloadType = PayloadType.Install;
            long j3 = ((d74) ce4Var.f9968c).f35078b;
            long jM11226G = ((rl7) ce4Var.f9967b).m20699o().m11226G();
            long jCurrentTimeMillis = System.currentTimeMillis();
            em7 em7VarM20699o = ((rl7) ce4Var.f9967b).m20699o();
            synchronized (em7VarM20699o) {
                j = em7VarM20699o.f37462c;
            }
            if (jCurrentTimeMillis < j + 2592000000L) {
                j2 = j;
            } else {
                j2 = ((d74) ce4Var.f9968c).f35078b;
                if (jCurrentTimeMillis >= 2592000000L + j2) {
                    j2 = jCurrentTimeMillis;
                }
            }
            long jM13601f = ((hz8) ce4Var.f9970e).m13601f();
            hz8 hz8Var = (hz8) ce4Var.f9970e;
            synchronized (hz8Var) {
                z = hz8Var.f43253h;
            }
            l67VarM15900c = l67.m15900c(payloadType, j3, jM11226G, j2, jM13601f, z, ((hz8) ce4Var.f9970e).m13599d());
        }
        l67VarM15900c.m15902e(((d74) ce4Var.f9968c).f35077a, (g02) ce4Var.f9969d);
        ((rl7) ce4Var.f9967b).m20694j().m568O(l67VarM15900c);
        if (((rl7) ce4Var.f9967b).m20693i().m25692F().f55555d.f63390a) {
            f63755s.m21555D("SDK disabled, aborting");
            return ie4.m13808b(new Pair(null, l67VarM15900c));
        }
        if (!l67VarM15900c.m15904g((g02) ce4Var.f9969d)) {
            f63755s.m21555D("Payload disabled, aborting");
            return ie4.m13808b(new Pair(null, l67VarM15900c));
        }
        qq7 qq7Var = (qq7) ce4Var.f9972g;
        synchronized (qq7Var) {
            rq7VarM20117a = qq7Var.m20117a(true);
        }
        if (!rq7VarM20117a.m20751f()) {
            f63755s.m21555D("Rate limited, waiting for limit to be lifted");
            return new ie4(JobAction.GoWaitForDependencies, null, -1L);
        }
        sq5 sq5Var = f63755s;
        r46.m20394u(sq5Var, "Sending install at " + ci8.m4710W(((d74) ce4Var.f9968c).f35078b) + " seconds");
        nk6 nk6VarM15906i = l67VarM15900c.m15906i(((d74) ce4Var.f9968c).f35077a, this.f63756q, ((rl7) ce4Var.f9967b).m20693i().m25692F().f55560i.m24936a());
        if (!m3644o()) {
            return ie4.m13807a();
        }
        if (nk6VarM15906i.f52879a) {
            return ie4.m13808b(new Pair(nk6VarM15906i, l67VarM15900c));
        }
        sq5Var.m21555D("Transmit failed, retrying after " + (nk6VarM15906i.f52881c / 1000.0d) + " seconds");
        this.f63756q = this.f63756q + 1;
        return ie4.m13810d(nk6VarM15906i.f52881c);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        Pair pair = (Pair) obj;
        sq5 sq5Var = f63755s;
        if (!z || pair == null) {
            return;
        }
        if (pair.first == null) {
            rl7 rl7Var = (rl7) ce4Var.f9967b;
            rl7Var.m20694j().m571R(true);
            rl7Var.m20694j().m572S(System.currentTimeMillis());
            am7 am7VarM20694j = rl7Var.m20694j();
            am7 am7VarM20694j2 = rl7Var.m20694j();
            synchronized (am7VarM20694j2) {
                j3 = am7VarM20694j2.f840e;
            }
            am7VarM20694j.m570Q(j3 + 1);
            am7 am7VarM20694j3 = rl7Var.m20694j();
            l67 l67Var = (l67) pair.second;
            am7 am7VarM20694j4 = rl7Var.m20694j();
            synchronized (am7VarM20694j4) {
                j4 = am7VarM20694j4.f840e;
            }
            am7VarM20694j3.m566M(e32.m10815a(l67Var, j4, rl7Var.m20693i().m25692F().f55555d.f63390a));
            rl7Var.m20694j().m568O(null);
            r46.m20394u(sq5Var, "Completed install at " + ci8.m4710W(((d74) ce4Var.f9968c).f35078b) + " seconds with a network duration of 0.0 seconds");
            sq5Var.m21555D("Completed install locally");
            return;
        }
        d74 d74Var = (d74) ce4Var.f9968c;
        rl7 rl7Var2 = (rl7) ce4Var.f9967b;
        if (((String) d74Var.f35081e) != null && d74Var.f35079c && rl7Var2.m20693i().m25692F().f55559h.f57263b && rl7Var2.m20689e().m17824d() > 0) {
            sq5Var.m21555D("Removing manufactured clicks from an instant app");
            rl7Var2.m20689e().m17826f();
        }
        rl7Var2.m20694j().m571R(false);
        rl7Var2.m20694j().m572S(System.currentTimeMillis());
        am7 am7VarM20694j5 = rl7Var2.m20694j();
        am7 am7VarM20694j6 = rl7Var2.m20694j();
        synchronized (am7VarM20694j6) {
            j = am7VarM20694j6.f840e;
        }
        am7VarM20694j5.m570Q(j + 1);
        am7 am7VarM20694j7 = rl7Var2.m20694j();
        l67 l67Var2 = (l67) pair.second;
        am7 am7VarM20694j8 = rl7Var2.m20694j();
        synchronized (am7VarM20694j8) {
            j2 = am7VarM20694j8.f840e;
        }
        am7VarM20694j7.m566M(e32.m10815a(l67Var2, j2, rl7Var2.m20693i().m25692F().f55555d.f63390a));
        rl7Var2.m20694j().m568O(null);
        r46.m20394u(sq5Var, "Completed install at " + ci8.m4710W(d74Var.f35078b) + " seconds with a network duration of " + (((nk6) pair.first).f52883e / 1000.0d) + " seconds");
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        this.f63756q = 1;
        ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.InstallStarted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        boolean z;
        ArrayList arrayList;
        boolean zM562I = ((rl7) ce4Var.f9967b).m20694j().m562I();
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        am7 am7VarM20694j = rl7Var.m20694j();
        synchronized (am7VarM20694j) {
            z = am7VarM20694j.f841f;
        }
        if (zM562I && !z) {
            return true;
        }
        if (!zM562I || !z) {
            return false;
        }
        boolean z2 = rl7Var.m20693i().m25692F().f55555d.f63390a;
        rk7 rk7Var = (rk7) ce4Var.f9971f;
        synchronized (rk7Var) {
            arrayList = rk7Var.f59444g;
        }
        return z2 || arrayList.contains(PayloadType.Install);
    }
}
