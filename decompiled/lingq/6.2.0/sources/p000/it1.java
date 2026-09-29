package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class it1 {

    /* JADX INFO: renamed from: a */
    public final boolean f44519a;

    /* JADX INFO: renamed from: b */
    public final String f44520b;

    /* JADX INFO: renamed from: c */
    public final Integer f44521c;

    /* JADX INFO: renamed from: d */
    public final Integer f44522d;

    /* JADX INFO: renamed from: e */
    public final Integer f44523e;

    /* JADX INFO: renamed from: f */
    public final boolean f44524f;

    /* JADX INFO: renamed from: g */
    public final List f44525g;

    public it1(boolean z, String str, Integer num, Integer num2, Integer num3, boolean z2, List list) {
        list.getClass();
        this.f44519a = z;
        this.f44520b = str;
        this.f44521c = num;
        this.f44522d = num2;
        this.f44523e = num3;
        this.f44524f = z2;
        this.f44525g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        return this.f44519a == it1Var.f44519a && fa4.m11650l(this.f44520b, it1Var.f44520b) && fa4.m11650l(this.f44521c, it1Var.f44521c) && fa4.m11650l(this.f44522d, it1Var.f44522d) && fa4.m11650l(this.f44523e, it1Var.f44523e) && this.f44524f == it1Var.f44524f && fa4.m11650l(this.f44525g, it1Var.f44525g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f44519a) * 31;
        String str = this.f44520b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f44521c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f44522d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f44523e;
        return this.f44525g.hashCode() + g9a.m12428e((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f44524f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupContributorsState(isLoading=");
        sb.append(this.f44519a);
        sb.append(", teamCode=");
        sb.append(this.f44520b);
        sb.append(", myRank=");
        e65.m10883o(sb, this.f44521c, ", myScore=", this.f44522d, ", totalContributors=");
        sb.append(this.f44523e);
        sb.append(", hasMeSummary=");
        sb.append(this.f44524f);
        sb.append(", rows=");
        return hn1.m13356f(sb, this.f44525g, ")");
    }

    public /* synthetic */ it1(String str, int i) {
        this(true, (i & 2) != 0 ? null : str, null, null, null, false, EmptyList.f47638a);
    }
}
