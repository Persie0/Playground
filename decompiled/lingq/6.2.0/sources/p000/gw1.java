package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gw1 {

    /* JADX INFO: renamed from: a */
    public final String f41412a;

    /* JADX INFO: renamed from: b */
    public final String f41413b;

    /* JADX INFO: renamed from: c */
    public final int f41414c;

    /* JADX INFO: renamed from: d */
    public final double f41415d;

    /* JADX INFO: renamed from: e */
    public final int f41416e;

    /* JADX INFO: renamed from: f */
    public final int f41417f;

    /* JADX INFO: renamed from: g */
    public final Integer f41418g;

    /* JADX INFO: renamed from: h */
    public final Integer f41419h;

    public gw1(String str, String str2, int i, double d, int i2, int i3, Integer num, Integer num2) {
        str.getClass();
        str2.getClass();
        this.f41412a = str;
        this.f41413b = str2;
        this.f41414c = i;
        this.f41415d = d;
        this.f41416e = i2;
        this.f41417f = i3;
        this.f41418g = num;
        this.f41419h = num2;
    }

    /* JADX INFO: renamed from: a */
    public final double m12920a() {
        return this.f41415d;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m12921b() {
        return this.f41419h;
    }

    /* JADX INFO: renamed from: c */
    public final String m12922c() {
        return this.f41413b;
    }

    /* JADX INFO: renamed from: d */
    public final int m12923d() {
        return this.f41416e;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m12924e() {
        return this.f41418g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw1)) {
            return false;
        }
        gw1 gw1Var = (gw1) obj;
        return fa4.m11650l(this.f41412a, gw1Var.f41412a) && fa4.m11650l(this.f41413b, gw1Var.f41413b) && this.f41414c == gw1Var.f41414c && Double.compare(this.f41415d, gw1Var.f41415d) == 0 && this.f41416e == gw1Var.f41416e && this.f41417f == gw1Var.f41417f && fa4.m11650l(this.f41418g, gw1Var.f41418g) && fa4.m11650l(this.f41419h, gw1Var.f41419h);
    }

    /* JADX INFO: renamed from: f */
    public final int m12925f() {
        return this.f41417f;
    }

    /* JADX INFO: renamed from: g */
    public final String m12926g() {
        return this.f41412a;
    }

    /* JADX INFO: renamed from: h */
    public final int m12927h() {
        return this.f41414c;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f41417f, wq1.m24106b(this.f41416e, g9a.m12424a(this.f41415d, wq1.m24106b(this.f41414c, ux5.m22980c(this.f41412a.hashCode() * 31, this.f41413b, 31), 31), 31), 31), 31);
        Integer num = this.f41418g;
        int iHashCode = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41419h;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupTeamEntity(teamCode=", this.f41412a, ", name=", this.f41413b, ", totalCoins=");
        sbM23000w.append(this.f41414c);
        sbM23000w.append(", coinsPerUser=");
        sbM23000w.append(this.f41415d);
        wq1.m24127w(this.f41416e, this.f41417f, ", participantCount=", ", rank=", sbM23000w);
        sbM23000w.append(", prevRank=");
        sbM23000w.append(this.f41418g);
        sbM23000w.append(", delta=");
        sbM23000w.append(this.f41419h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
