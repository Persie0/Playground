package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ws1 {

    /* JADX INFO: renamed from: a */
    public final Integer f67225a;

    /* JADX INFO: renamed from: b */
    public final boolean f67226b;

    /* JADX INFO: renamed from: c */
    public final boolean f67227c;

    /* JADX INFO: renamed from: d */
    public final boolean f67228d;

    /* JADX INFO: renamed from: e */
    public final String f67229e;

    /* JADX INFO: renamed from: f */
    public final Integer f67230f;

    /* JADX INFO: renamed from: g */
    public final String f67231g;

    /* JADX INFO: renamed from: h */
    public final String f67232h;

    /* JADX INFO: renamed from: i */
    public final String f67233i;

    /* JADX INFO: renamed from: j */
    public final int f67234j;

    /* JADX INFO: renamed from: k */
    public final boolean f67235k;

    /* JADX INFO: renamed from: l */
    public final Integer f67236l;

    /* JADX INFO: renamed from: m */
    public final boolean f67237m;

    public ws1(Integer num, boolean z, boolean z2, boolean z3, String str, Integer num2, String str2, String str3, String str4, int i, boolean z4, Integer num3, boolean z5) {
        this.f67225a = num;
        this.f67226b = z;
        this.f67227c = z2;
        this.f67228d = z3;
        this.f67229e = str;
        this.f67230f = num2;
        this.f67231g = str2;
        this.f67232h = str3;
        this.f67233i = str4;
        this.f67234j = i;
        this.f67235k = z4;
        this.f67236l = num3;
        this.f67237m = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws1)) {
            return false;
        }
        ws1 ws1Var = (ws1) obj;
        return fa4.m11650l(this.f67225a, ws1Var.f67225a) && this.f67226b == ws1Var.f67226b && this.f67227c == ws1Var.f67227c && this.f67228d == ws1Var.f67228d && fa4.m11650l(this.f67229e, ws1Var.f67229e) && fa4.m11650l(this.f67230f, ws1Var.f67230f) && fa4.m11650l(this.f67231g, ws1Var.f67231g) && fa4.m11650l(this.f67232h, ws1Var.f67232h) && fa4.m11650l(this.f67233i, ws1Var.f67233i) && this.f67234j == ws1Var.f67234j && this.f67235k == ws1Var.f67235k && fa4.m11650l(this.f67236l, ws1Var.f67236l) && this.f67237m == ws1Var.f67237m;
    }

    public final int hashCode() {
        Integer num = this.f67225a;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((num == null ? 0 : num.hashCode()) * 31, 31, this.f67226b), 31, this.f67227c), 31, this.f67228d);
        String str = this.f67229e;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f67230f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f67231g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67232h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f67233i;
        int iM12428e2 = g9a.m12428e(wq1.m24106b(this.f67234j, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.f67235k);
        Integer num3 = this.f67236l;
        return Boolean.hashCode(this.f67237m) + ((iM12428e2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupBanner(dayNumber=");
        sb.append(this.f67225a);
        sb.append(", isLive=");
        sb.append(this.f67226b);
        sb.append(", isEnded=");
        wq1.m24101A(sb, this.f67227c, ", joined=", this.f67228d, ", teamCode=");
        hn1.m13371u(sb, this.f67229e, ", teamRank=", this.f67230f, ", championTeamCode=");
        AbstractC3393o1.m17725C(sb, this.f67231g, ", startDate=", this.f67232h, ", endDate=");
        AbstractC3393o1.m17748w(this.f67234j, this.f67233i, ", participants=", ", canJoinNow=", sb);
        sb.append(this.f67235k);
        sb.append(", daysRemaining=");
        sb.append(this.f67236l);
        sb.append(", isRecapOver=");
        return AbstractC3393o1.m17740o(sb, this.f67237m, ")");
    }
}
