package p000;

import com.lingq.core.domain.model.cup.CupChampion;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupToday;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ew1 {

    /* JADX INFO: renamed from: a */
    public final boolean f37975a;

    /* JADX INFO: renamed from: b */
    public final boolean f37976b;

    /* JADX INFO: renamed from: c */
    public final String f37977c;

    /* JADX INFO: renamed from: d */
    public final String f37978d;

    /* JADX INFO: renamed from: e */
    public final CupChampion f37979e;

    /* JADX INFO: renamed from: f */
    public final boolean f37980f;

    /* JADX INFO: renamed from: g */
    public final CupTeam f37981g;

    /* JADX INFO: renamed from: h */
    public final CupMyStats f37982h;

    /* JADX INFO: renamed from: i */
    public final CupToday f37983i;

    /* JADX INFO: renamed from: j */
    public final List f37984j;

    public ew1(boolean z, boolean z2, String str, String str2, CupChampion cupChampion, boolean z3, CupTeam cupTeam, CupMyStats cupMyStats, CupToday cupToday, List list) {
        list.getClass();
        this.f37975a = z;
        this.f37976b = z2;
        this.f37977c = str;
        this.f37978d = str2;
        this.f37979e = cupChampion;
        this.f37980f = z3;
        this.f37981g = cupTeam;
        this.f37982h = cupMyStats;
        this.f37983i = cupToday;
        this.f37984j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew1)) {
            return false;
        }
        ew1 ew1Var = (ew1) obj;
        return this.f37975a == ew1Var.f37975a && this.f37976b == ew1Var.f37976b && fa4.m11650l(this.f37977c, ew1Var.f37977c) && fa4.m11650l(this.f37978d, ew1Var.f37978d) && fa4.m11650l(this.f37979e, ew1Var.f37979e) && this.f37980f == ew1Var.f37980f && fa4.m11650l(this.f37981g, ew1Var.f37981g) && fa4.m11650l(this.f37982h, ew1Var.f37982h) && fa4.m11650l(this.f37983i, ew1Var.f37983i) && fa4.m11650l(this.f37984j, ew1Var.f37984j);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Boolean.hashCode(this.f37975a) * 31, 31, this.f37976b);
        String str = this.f37977c;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37978d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CupChampion cupChampion = this.f37979e;
        int iM12428e2 = g9a.m12428e((iHashCode2 + (cupChampion == null ? 0 : cupChampion.hashCode())) * 31, 31, this.f37980f);
        CupTeam cupTeam = this.f37981g;
        int iHashCode3 = (iM12428e2 + (cupTeam == null ? 0 : cupTeam.hashCode())) * 31;
        CupMyStats cupMyStats = this.f37982h;
        int iHashCode4 = (iHashCode3 + (cupMyStats == null ? 0 : cupMyStats.hashCode())) * 31;
        CupToday cupToday = this.f37983i;
        return this.f37984j.hashCode() + ((iHashCode4 + (cupToday != null ? cupToday.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("CupSummary(active=", ", ended=", ", startsAt=", this.f37975a, this.f37976b);
        AbstractC3393o1.m17725C(sbM13357g, this.f37977c, ", endsAt=", this.f37978d, ", champion=");
        sbM13357g.append(this.f37979e);
        sbM13357g.append(", joined=");
        sbM13357g.append(this.f37980f);
        sbM13357g.append(", team=");
        sbM13357g.append(this.f37981g);
        sbM13357g.append(", my=");
        sbM13357g.append(this.f37982h);
        sbM13357g.append(", today=");
        sbM13357g.append(this.f37983i);
        sbM13357g.append(", teams=");
        sbM13357g.append(this.f37984j);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
