package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rn4 {

    /* JADX INFO: renamed from: a */
    public final qj9 f59579a;

    /* JADX INFO: renamed from: b */
    public final z41 f59580b;

    /* JADX INFO: renamed from: c */
    public final d4b f59581c;

    /* JADX INFO: renamed from: d */
    public final uj9 f59582d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3066h8 f59583e;

    /* JADX INFO: renamed from: f */
    public final a85 f59584f;

    /* JADX INFO: renamed from: g */
    public final dt0 f59585g;

    /* JADX INFO: renamed from: h */
    public final g80 f59586h;

    /* JADX INFO: renamed from: i */
    public final ws1 f59587i;

    public rn4(qj9 qj9Var, z41 z41Var, d4b d4bVar, uj9 uj9Var, InterfaceC3066h8 interfaceC3066h8, a85 a85Var, dt0 dt0Var, g80 g80Var, ws1 ws1Var) {
        qj9Var.getClass();
        z41Var.getClass();
        d4bVar.getClass();
        uj9Var.getClass();
        interfaceC3066h8.getClass();
        a85Var.getClass();
        dt0Var.getClass();
        g80Var.getClass();
        this.f59579a = qj9Var;
        this.f59580b = z41Var;
        this.f59581c = d4bVar;
        this.f59582d = uj9Var;
        this.f59583e = interfaceC3066h8;
        this.f59584f = a85Var;
        this.f59585g = dt0Var;
        this.f59586h = g80Var;
        this.f59587i = ws1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn4)) {
            return false;
        }
        rn4 rn4Var = (rn4) obj;
        return fa4.m11650l(this.f59579a, rn4Var.f59579a) && fa4.m11650l(this.f59580b, rn4Var.f59580b) && fa4.m11650l(this.f59581c, rn4Var.f59581c) && fa4.m11650l(this.f59582d, rn4Var.f59582d) && fa4.m11650l(this.f59583e, rn4Var.f59583e) && fa4.m11650l(this.f59584f, rn4Var.f59584f) && fa4.m11650l(this.f59585g, rn4Var.f59585g) && fa4.m11650l(this.f59586h, rn4Var.f59586h) && fa4.m11650l(this.f59587i, rn4Var.f59587i);
    }

    public final int hashCode() {
        int iHashCode = (this.f59586h.hashCode() + ((this.f59585g.hashCode() + ((this.f59584f.hashCode() + ((this.f59583e.hashCode() + ((this.f59582d.hashCode() + ((this.f59581c.hashCode() + ((this.f59580b.hashCode() + (this.f59579a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        ws1 ws1Var = this.f59587i;
        return iHashCode + (ws1Var == null ? 0 : ws1Var.hashCode());
    }

    public final String toString() {
        return "LanguageStatsContentState(streakUiState=" + this.f59579a + ", coinsBalanceUiState=" + this.f59580b + ", weekActivityUiState=" + this.f59581c + ", streakWeekUiState=" + this.f59582d + ", activityStatsUiState=" + this.f59583e + ", levelStatsUiState=" + this.f59584f + ", challengesStatsUiState=" + this.f59585g + ", badgesStatsUiState=" + this.f59586h + ", cupBanner=" + this.f59587i + ")";
    }
}
