package p000;

import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tw1 {

    /* JADX INFO: renamed from: a */
    public final boolean f62977a;

    /* JADX INFO: renamed from: b */
    public final CupLeaderboardTab f62978b;

    /* JADX INFO: renamed from: c */
    public final String f62979c;

    /* JADX INFO: renamed from: d */
    public final Integer f62980d;

    /* JADX INFO: renamed from: e */
    public final int f62981e;

    /* JADX INFO: renamed from: f */
    public final List f62982f;

    /* JADX INFO: renamed from: g */
    public final boolean f62983g;

    /* JADX INFO: renamed from: h */
    public final Integer f62984h;

    /* JADX INFO: renamed from: i */
    public final Integer f62985i;

    /* JADX INFO: renamed from: j */
    public final boolean f62986j;

    /* JADX INFO: renamed from: k */
    public final List f62987k;

    public tw1(boolean z, CupLeaderboardTab cupLeaderboardTab, String str, Integer num, int i, List list, boolean z2, Integer num2, Integer num3, boolean z3, List list2) {
        cupLeaderboardTab.getClass();
        list.getClass();
        list2.getClass();
        this.f62977a = z;
        this.f62978b = cupLeaderboardTab;
        this.f62979c = str;
        this.f62980d = num;
        this.f62981e = i;
        this.f62982f = list;
        this.f62983g = z2;
        this.f62984h = num2;
        this.f62985i = num3;
        this.f62986j = z3;
        this.f62987k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw1)) {
            return false;
        }
        tw1 tw1Var = (tw1) obj;
        return this.f62977a == tw1Var.f62977a && this.f62978b == tw1Var.f62978b && fa4.m11650l(this.f62979c, tw1Var.f62979c) && fa4.m11650l(this.f62980d, tw1Var.f62980d) && this.f62981e == tw1Var.f62981e && fa4.m11650l(this.f62982f, tw1Var.f62982f) && this.f62983g == tw1Var.f62983g && fa4.m11650l(this.f62984h, tw1Var.f62984h) && fa4.m11650l(this.f62985i, tw1Var.f62985i) && this.f62986j == tw1Var.f62986j && fa4.m11650l(this.f62987k, tw1Var.f62987k);
    }

    public final int hashCode() {
        int iHashCode = (this.f62978b.hashCode() + (Boolean.hashCode(this.f62977a) * 31)) * 31;
        String str = this.f62979c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f62980d;
        int iM12428e = g9a.m12428e(ux5.m22979b(wq1.m24106b(this.f62981e, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f62982f), 31, this.f62983g);
        Integer num2 = this.f62984h;
        int iHashCode3 = (iM12428e + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f62985i;
        return this.f62987k.hashCode() + g9a.m12428e((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f62986j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupTeamLeaderboardState(isLoading=");
        sb.append(this.f62977a);
        sb.append(", tab=");
        sb.append(this.f62978b);
        sb.append(", yourTeamCode=");
        hn1.m13371u(sb, this.f62979c, ", yourTeamRank=", this.f62980d, ", teamCount=");
        sb.append(this.f62981e);
        sb.append(", rows=");
        sb.append(this.f62982f);
        sb.append(", isContributorsLoading=");
        sb.append(this.f62983g);
        sb.append(", globalRank=");
        sb.append(this.f62984h);
        sb.append(", placesToTop=");
        sb.append(this.f62985i);
        sb.append(", hasGlobalRank=");
        sb.append(this.f62986j);
        sb.append(", contributorRows=");
        return hn1.m13356f(sb, this.f62987k, ")");
    }
}
