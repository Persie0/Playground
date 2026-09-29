package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ru1 {

    /* JADX INFO: renamed from: a */
    public final int f59812a;

    /* JADX INFO: renamed from: b */
    public final int f59813b;

    /* JADX INFO: renamed from: c */
    public final String f59814c;

    /* JADX INFO: renamed from: d */
    public final Integer f59815d;

    /* JADX INFO: renamed from: e */
    public final int f59816e;

    /* JADX INFO: renamed from: f */
    public final Integer f59817f;

    /* JADX INFO: renamed from: g */
    public final Integer f59818g;

    /* JADX INFO: renamed from: h */
    public final Integer f59819h;

    /* JADX INFO: renamed from: i */
    public final Integer f59820i;

    /* JADX INFO: renamed from: j */
    public final int f59821j;

    /* JADX INFO: renamed from: k */
    public final boolean f59822k;

    /* JADX INFO: renamed from: l */
    public final boolean f59823l;

    /* JADX INFO: renamed from: m */
    public final List f59824m;

    public ru1(int i, int i2, String str, Integer num, int i3, Integer num2, Integer num3, Integer num4, Integer num5, int i4, boolean z, boolean z2, List list) {
        str.getClass();
        list.getClass();
        this.f59812a = i;
        this.f59813b = i2;
        this.f59814c = str;
        this.f59815d = num;
        this.f59816e = i3;
        this.f59817f = num2;
        this.f59818g = num3;
        this.f59819h = num4;
        this.f59820i = num5;
        this.f59821j = i4;
        this.f59822k = z;
        this.f59823l = z2;
        this.f59824m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru1)) {
            return false;
        }
        ru1 ru1Var = (ru1) obj;
        return this.f59812a == ru1Var.f59812a && this.f59813b == ru1Var.f59813b && fa4.m11650l(this.f59814c, ru1Var.f59814c) && fa4.m11650l(this.f59815d, ru1Var.f59815d) && this.f59816e == ru1Var.f59816e && fa4.m11650l(this.f59817f, ru1Var.f59817f) && fa4.m11650l(this.f59818g, ru1Var.f59818g) && fa4.m11650l(this.f59819h, ru1Var.f59819h) && fa4.m11650l(this.f59820i, ru1Var.f59820i) && this.f59821j == ru1Var.f59821j && this.f59822k == ru1Var.f59822k && this.f59823l == ru1Var.f59823l && fa4.m11650l(this.f59824m, ru1Var.f59824m);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f59813b, Integer.hashCode(this.f59812a) * 31, 31), this.f59814c, 31);
        Integer num = this.f59815d;
        int iM24106b = wq1.m24106b(this.f59816e, (iM22980c + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f59817f;
        int iHashCode = (iM24106b + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f59818g;
        int iHashCode2 = (iHashCode + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f59819h;
        int iHashCode3 = (iHashCode2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f59820i;
        return this.f59824m.hashCode() + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f59821j, (iHashCode3 + (num5 != null ? num5.hashCode() : 0)) * 31, 31), 31, this.f59822k), 31, this.f59823l);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f59812a, this.f59813b, "CupResultsState(coins=", ", activeDays=", ", teamCode=");
        hn1.m13371u(sbM22994q, this.f59814c, ", teamFinishRank=", this.f59815d, ", teamCount=");
        sbM22994q.append(this.f59816e);
        sbM22994q.append(", teamRank=");
        sbM22994q.append(this.f59817f);
        sbM22994q.append(", teamContributors=");
        e65.m10883o(sbM22994q, this.f59818g, ", globalRank=", this.f59819h, ", globalContributors=");
        sbM22994q.append(this.f59820i);
        sbM22994q.append(", badgeTier=");
        sbM22994q.append(this.f59821j);
        sbM22994q.append(", isChampion=");
        wq1.m24101A(sbM22994q, this.f59822k, ", isCalculating=", this.f59823l, ", contributors=");
        return hn1.m13356f(sbM22994q, this.f59824m, ")");
    }
}
