package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class re4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f59157r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f59158s;

    /* JADX INFO: renamed from: q */
    public long f59159q;

    static {
        List list = se4.f60736a;
        f59157r = "JobUpdateInstall";
        sj5 sj5VarM20396w = r46.m20396w();
        f59158s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobUpdateInstall");
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        eg4 eg4Var;
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            eg4Var = am7VarM20694j.f843h;
        }
        dg4 dg4Var = (dg4) eg4Var;
        if (dg4Var.m10345o("android_id")) {
            dg4Var.m10350t("android_id");
            ((rl7) ce4Var.f9967b).m20694j().m573T(dg4Var);
        }
        PayloadType payloadType = PayloadType.Update;
        long j = ((d74) ce4Var.f9968c).f35078b;
        long jM11226G = ((rl7) ce4Var.f9967b).m20699o().m11226G();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM13601f = ((hz8) ce4Var.f9970e).m13601f();
        hz8 hz8Var = (hz8) ce4Var.f9970e;
        synchronized (hz8Var) {
            z = hz8Var.f43253h;
        }
        l67 l67VarM15900c = l67.m15900c(payloadType, j, jM11226G, jCurrentTimeMillis, jM13601f, z, ((hz8) ce4Var.f9970e).m13599d());
        l67VarM15900c.m15902e(((d74) ce4Var.f9968c).f35077a, (g02) ce4Var.f9969d);
        dg4 dg4VarM10336f = ((dg4) l67VarM15900c.f49189c).m10336f();
        dg4VarM10336f.m10350t("usertime");
        dg4VarM10336f.m10350t("uptime");
        dg4VarM10336f.m10350t("starttime");
        am7 am7VarM20694j2 = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j2) {
            z2 = am7VarM20694j2.f842g;
        }
        if (!z2) {
            ((rl7) ce4Var.f9967b).m20694j().m573T(dg4VarM10336f);
            am7 am7VarM20694j3 = ((rl7) ce4Var.f9967b).m20694j();
            synchronized (am7VarM20694j3) {
                am7VarM20694j3.f842g = true;
                ((cj9) am7VarM20694j3.f60774a).m4779g("install.update_watchlist_initialized", true);
            }
            f59158s.m21555D("Initialized with starting values");
            return ie4.m13807a();
        }
        if (dg4Var.equals(dg4VarM10336f)) {
            f59158s.m21555D("No watched values updated");
            return ie4.m13807a();
        }
        synchronized (dg4Var) {
            jSONObject = new JSONObject();
            synchronized (dg4VarM10336f) {
                jSONObject2 = dg4VarM10336f.f35593a;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject2.opt(next);
                Object objM3238e0 = objOpt == null ? null : b34.m3238e0(objOpt);
                if (objM3238e0 != null && !dg4Var.m10335e(objM3238e0, next)) {
                    try {
                        jSONObject.put(next, b34.m3233b0(objM3238e0));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            arrayList.add(itKeys2.next());
        }
        for (String str : arrayList) {
            f59158s.m21555D("Watched value " + str + " updated");
        }
        ((rl7) ce4Var.f9967b).m20694j().m573T(dg4VarM10336f);
        if (((rl7) ce4Var.f9967b).m20693i().m25692F().f55557f.f66374a) {
            ((rl7) ce4Var.f9967b).m20704t().m17821a(l67VarM15900c);
            return ie4.m13807a();
        }
        f59158s.m21555D("Updates disabled, ignoring");
        return ie4.m13807a();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        if (z) {
            this.f59159q = System.currentTimeMillis();
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
        long jM13600e = ((hz8) ce4Var.f9970e).m13600e();
        am7 am7VarM20694j = ((rl7) ce4Var.f9967b).m20694j();
        synchronized (am7VarM20694j) {
            j = am7VarM20694j.f845j;
        }
        long j2 = this.f59159q;
        return j2 >= jM25691E && j2 >= jM13600e && j2 >= j;
    }
}
