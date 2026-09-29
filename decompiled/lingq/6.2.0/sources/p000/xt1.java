package p000;

import com.lingq.core.domain.model.cup.CupChampion;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupToday;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xt1 {

    /* JADX INFO: renamed from: a */
    public final int f68682a;

    /* JADX INFO: renamed from: b */
    public final boolean f68683b;

    /* JADX INFO: renamed from: c */
    public final boolean f68684c;

    /* JADX INFO: renamed from: d */
    public final String f68685d;

    /* JADX INFO: renamed from: e */
    public final String f68686e;

    /* JADX INFO: renamed from: f */
    public final boolean f68687f;

    /* JADX INFO: renamed from: g */
    public final CupChampion f68688g;

    /* JADX INFO: renamed from: h */
    public final CupTeam f68689h;

    /* JADX INFO: renamed from: i */
    public final CupMyStats f68690i;

    /* JADX INFO: renamed from: j */
    public final CupToday f68691j;

    /* JADX INFO: renamed from: k */
    public final List f68692k;

    public xt1(int i, boolean z, boolean z2, String str, String str2, boolean z3, CupChampion cupChampion, CupTeam cupTeam, CupMyStats cupMyStats, CupToday cupToday, List list) {
        list.getClass();
        this.f68682a = i;
        this.f68683b = z;
        this.f68684c = z2;
        this.f68685d = str;
        this.f68686e = str2;
        this.f68687f = z3;
        this.f68688g = cupChampion;
        this.f68689h = cupTeam;
        this.f68690i = cupMyStats;
        this.f68691j = cupToday;
        this.f68692k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt1)) {
            return false;
        }
        xt1 xt1Var = (xt1) obj;
        return this.f68682a == xt1Var.f68682a && this.f68683b == xt1Var.f68683b && this.f68684c == xt1Var.f68684c && fa4.m11650l(this.f68685d, xt1Var.f68685d) && fa4.m11650l(this.f68686e, xt1Var.f68686e) && this.f68687f == xt1Var.f68687f && fa4.m11650l(this.f68688g, xt1Var.f68688g) && fa4.m11650l(this.f68689h, xt1Var.f68689h) && fa4.m11650l(this.f68690i, xt1Var.f68690i) && fa4.m11650l(this.f68691j, xt1Var.f68691j) && fa4.m11650l(this.f68692k, xt1Var.f68692k);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(Integer.hashCode(this.f68682a) * 31, 31, this.f68683b), 31, this.f68684c);
        String str = this.f68685d;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68686e;
        int iM12428e2 = g9a.m12428e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f68687f);
        CupChampion cupChampion = this.f68688g;
        int iHashCode2 = (iM12428e2 + (cupChampion == null ? 0 : cupChampion.hashCode())) * 31;
        CupTeam cupTeam = this.f68689h;
        int iHashCode3 = (iHashCode2 + (cupTeam == null ? 0 : cupTeam.hashCode())) * 31;
        CupMyStats cupMyStats = this.f68690i;
        int iHashCode4 = (iHashCode3 + (cupMyStats == null ? 0 : cupMyStats.hashCode())) * 31;
        CupToday cupToday = this.f68691j;
        return this.f68692k.hashCode() + ((iHashCode4 + (cupToday != null ? cupToday.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupEntity(id=");
        sb.append(this.f68682a);
        sb.append(", active=");
        sb.append(this.f68683b);
        sb.append(", ended=");
        hn1.m13367q(", startsAt=", this.f68685d, ", endsAt=", sb, this.f68684c);
        ux5.m22976C(this.f68686e, ", joined=", ", champion=", sb, this.f68687f);
        sb.append(this.f68688g);
        sb.append(", team=");
        sb.append(this.f68689h);
        sb.append(", my=");
        sb.append(this.f68690i);
        sb.append(", today=");
        sb.append(this.f68691j);
        sb.append(", teams=");
        return hn1.m13356f(sb, this.f68692k, ")");
    }
}
