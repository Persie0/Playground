package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.network.api.result.worldcup.ResultCupTeamStanding;
import com.lingq.core.network.api.result.worldcup.ResultCupTopTeams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class drc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f36121a = new C0282a(-484497693, false, new fe1(29));

    /* JADX INFO: renamed from: b */
    public static final C0282a f36122b = new C0282a(-408254589, false, new he1(0));

    /* JADX INFO: renamed from: c */
    public static final C0282a f36123c = new C0282a(-1731420488, false, new he1(1));

    /* JADX INFO: renamed from: d */
    public static final C0282a f36124d = new C0282a(356866465, false, new ge1(6));

    /* JADX INFO: renamed from: e */
    public static final C0282a f36125e = new C0282a(-128862073, false, new ge1(7));

    /* JADX INFO: renamed from: f */
    public static final C0282a f36126f = new C0282a(155123465, false, new ge1(8));

    /* JADX INFO: renamed from: g */
    public static final C0282a f36127g = new C0282a(-1850367414, false, new ge1(9));

    /* JADX INFO: renamed from: h */
    public static final C0282a f36128h = new C0282a(439109003, false, new ge1(10));

    /* JADX INFO: renamed from: i */
    public static final C0282a f36129i = new C0282a(-1566381876, false, new ge1(11));

    /* JADX INFO: renamed from: j */
    public static final C0282a f36130j = new C0282a(27415958, false, new ge1(12));

    /* JADX INFO: renamed from: k */
    public static final C0282a f36131k = new C0282a(-1978097633, false, new he1(2));

    /* JADX INFO: renamed from: l */
    public static final C0282a f36132l = new C0282a(-1966605349, false, new ge1(13));

    /* JADX INFO: renamed from: m */
    public static final C0282a f36133m = new C0282a(883790532, false, new ge1(14));

    /* JADX INFO: renamed from: n */
    public static final C0282a f36134n = new C0282a(1934347587, false, new ge1(15));

    /* JADX INFO: renamed from: o */
    public static final C0282a f36135o = new C0282a(-807532348, false, new ge1(16));

    /* JADX INFO: renamed from: p */
    public static final C0282a f36136p = new C0282a(745555013, false, new ge1(17));

    /* JADX INFO: renamed from: q */
    public static final C0282a f36137q = new C0282a(-1996324922, false, new ge1(18));

    /* JADX INFO: renamed from: r */
    public static final C0282a f36138r = new C0282a(-1319769378, false, new ge1(19));

    /* JADX INFO: renamed from: s */
    public static final C0282a f36139s = new C0282a(842993246, false, new ge1(20));

    /* JADX INFO: renamed from: t */
    public static final C0282a f36140t = new C0282a(1950764423, false, new ge1(0));

    /* JADX INFO: renamed from: u */
    public static final C0282a f36141u = new C0282a(-1005439450, false, new ge1(1));

    /* JADX INFO: renamed from: v */
    public static final C0282a f36142v = new C0282a(333323973, false, new ge1(2));

    /* JADX INFO: renamed from: w */
    public static final C0282a f36143w = new C0282a(1672087396, false, new ge1(3));

    /* JADX INFO: renamed from: x */
    public static final C0282a f36144x = new C0282a(-1713733813, false, new ge1(4));

    /* JADX INFO: renamed from: y */
    public static final C0282a f36145y = new C0282a(1607593282, false, new ge1(5));

    /* JADX INFO: renamed from: a */
    public static final ArrayList m10614a(ResultCupTopTeams resultCupTopTeams) {
        resultCupTopTeams.getClass();
        List<ResultCupTeamStanding> list = resultCupTopTeams.f21834b;
        ArrayList<xw1> arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (ResultCupTeamStanding resultCupTeamStanding : list) {
            resultCupTeamStanding.getClass();
            String str = resultCupTeamStanding.f21818a;
            String str2 = resultCupTeamStanding.f21819b;
            int i = resultCupTeamStanding.f21820c;
            double d = resultCupTeamStanding.f21821d;
            int i2 = resultCupTeamStanding.f21822e;
            Integer num = resultCupTeamStanding.f21823f;
            arrayList.add(new xw1(str, str2, i, d, i2, num != null ? num.intValue() : 0, resultCupTeamStanding.f21824g, resultCupTeamStanding.f21825h));
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (xw1 xw1Var : arrayList) {
            xw1Var.getClass();
            arrayList2.add(new gw1(xw1Var.f68881a, xw1Var.f68882b, xw1Var.f68883c, xw1Var.f68884d, xw1Var.f68885e, xw1Var.f68886f, xw1Var.f68887g, xw1Var.f68888h));
        }
        return arrayList2;
    }
}
