package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xw1 {

    /* JADX INFO: renamed from: a */
    public final String f68881a;

    /* JADX INFO: renamed from: b */
    public final String f68882b;

    /* JADX INFO: renamed from: c */
    public final int f68883c;

    /* JADX INFO: renamed from: d */
    public final double f68884d;

    /* JADX INFO: renamed from: e */
    public final int f68885e;

    /* JADX INFO: renamed from: f */
    public final int f68886f;

    /* JADX INFO: renamed from: g */
    public final Integer f68887g;

    /* JADX INFO: renamed from: h */
    public final Integer f68888h;

    public xw1(String str, String str2, int i, double d, int i2, int i3, Integer num, Integer num2) {
        str.getClass();
        str2.getClass();
        this.f68881a = str;
        this.f68882b = str2;
        this.f68883c = i;
        this.f68884d = d;
        this.f68885e = i2;
        this.f68886f = i3;
        this.f68887g = num;
        this.f68888h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw1)) {
            return false;
        }
        xw1 xw1Var = (xw1) obj;
        return fa4.m11650l(this.f68881a, xw1Var.f68881a) && fa4.m11650l(this.f68882b, xw1Var.f68882b) && this.f68883c == xw1Var.f68883c && Double.compare(this.f68884d, xw1Var.f68884d) == 0 && this.f68885e == xw1Var.f68885e && this.f68886f == xw1Var.f68886f && fa4.m11650l(this.f68887g, xw1Var.f68887g) && fa4.m11650l(this.f68888h, xw1Var.f68888h);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f68886f, wq1.m24106b(this.f68885e, g9a.m12424a(this.f68884d, wq1.m24106b(this.f68883c, ux5.m22980c(this.f68881a.hashCode() * 31, this.f68882b, 31), 31), 31), 31), 31);
        Integer num = this.f68887g;
        int iHashCode = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f68888h;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupTeamStanding(teamCode=", this.f68881a, ", name=", this.f68882b, ", totalCoins=");
        sbM23000w.append(this.f68883c);
        sbM23000w.append(", coinsPerUser=");
        sbM23000w.append(this.f68884d);
        wq1.m24127w(this.f68885e, this.f68886f, ", participantCount=", ", rank=", sbM23000w);
        sbM23000w.append(", prevRank=");
        sbM23000w.append(this.f68887g);
        sbM23000w.append(", delta=");
        sbM23000w.append(this.f68888h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
