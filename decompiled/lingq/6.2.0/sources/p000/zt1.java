package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zt1 {

    /* JADX INFO: renamed from: a */
    public final Integer f72124a;

    /* JADX INFO: renamed from: b */
    public final Integer f72125b;

    /* JADX INFO: renamed from: c */
    public final Integer f72126c;

    /* JADX INFO: renamed from: d */
    public final String f72127d;

    /* JADX INFO: renamed from: e */
    public final String f72128e;

    /* JADX INFO: renamed from: f */
    public final String f72129f;

    /* JADX INFO: renamed from: g */
    public final boolean f72130g;

    /* JADX INFO: renamed from: h */
    public final Integer f72131h;

    /* JADX INFO: renamed from: i */
    public final Integer f72132i;

    /* JADX INFO: renamed from: j */
    public final Integer f72133j;

    /* JADX INFO: renamed from: k */
    public final Integer f72134k;

    /* JADX INFO: renamed from: l */
    public final Integer f72135l;

    /* JADX INFO: renamed from: m */
    public final Integer f72136m;

    /* JADX INFO: renamed from: n */
    public final Integer f72137n;

    public zt1(Integer num, Integer num2, Integer num3, String str, String str2, String str3, boolean z, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.f72124a = num;
        this.f72125b = num2;
        this.f72126c = num3;
        this.f72127d = str;
        this.f72128e = str2;
        this.f72129f = str3;
        this.f72130g = z;
        this.f72131h = num4;
        this.f72132i = num5;
        this.f72133j = num6;
        this.f72134k = num7;
        this.f72135l = num8;
        this.f72136m = num9;
        this.f72137n = num10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt1)) {
            return false;
        }
        zt1 zt1Var = (zt1) obj;
        return fa4.m11650l(this.f72124a, zt1Var.f72124a) && fa4.m11650l(this.f72125b, zt1Var.f72125b) && fa4.m11650l(this.f72126c, zt1Var.f72126c) && fa4.m11650l(this.f72127d, zt1Var.f72127d) && fa4.m11650l(this.f72128e, zt1Var.f72128e) && fa4.m11650l(this.f72129f, zt1Var.f72129f) && this.f72130g == zt1Var.f72130g && fa4.m11650l(this.f72131h, zt1Var.f72131h) && fa4.m11650l(this.f72132i, zt1Var.f72132i) && fa4.m11650l(this.f72133j, zt1Var.f72133j) && fa4.m11650l(this.f72134k, zt1Var.f72134k) && fa4.m11650l(this.f72135l, zt1Var.f72135l) && fa4.m11650l(this.f72136m, zt1Var.f72136m) && fa4.m11650l(this.f72137n, zt1Var.f72137n);
    }

    public final int hashCode() {
        Integer num = this.f72124a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f72125b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f72126c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f72127d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72128e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72129f;
        int iM12428e = g9a.m12428e((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f72130g);
        Integer num4 = this.f72131h;
        int iHashCode6 = (iM12428e + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f72132i;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f72133j;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f72134k;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f72135l;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f72136m;
        int iHashCode11 = (iHashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f72137n;
        return iHashCode11 + (num10 != null ? num10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupHeroState(dayNumber=");
        sb.append(this.f72124a);
        sb.append(", totalDays=");
        sb.append(this.f72125b);
        sb.append(", daysRemaining=");
        sb.append(this.f72126c);
        sb.append(", championName=");
        sb.append(this.f72127d);
        sb.append(", championTeamCode=");
        AbstractC3393o1.m17725C(sb, this.f72128e, ", teamCode=", this.f72129f, ", showStats=");
        sb.append(this.f72130g);
        sb.append(", teamRank=");
        sb.append(this.f72131h);
        sb.append(", teamCount=");
        e65.m10883o(sb, this.f72132i, ", finishRankInTeam=", this.f72133j, ", contribution=");
        e65.m10883o(sb, this.f72134k, ", daysActive=", this.f72135l, ", totalCoins=");
        sb.append(this.f72136m);
        sb.append(", participants=");
        sb.append(this.f72137n);
        sb.append(")");
        return sb.toString();
    }
}
