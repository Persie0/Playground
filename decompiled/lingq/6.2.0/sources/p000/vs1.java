package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class vs1 {

    /* JADX INFO: renamed from: a */
    public final boolean f65833a;

    /* JADX INFO: renamed from: b */
    public final int f65834b;

    /* JADX INFO: renamed from: c */
    public final int f65835c;

    /* JADX INFO: renamed from: d */
    public final int f65836d;

    /* JADX INFO: renamed from: e */
    public final int f65837e;

    /* JADX INFO: renamed from: f */
    public final Integer f65838f;

    /* JADX INFO: renamed from: g */
    public final String f65839g;

    /* JADX INFO: renamed from: h */
    public final boolean f65840h;

    /* JADX INFO: renamed from: i */
    public final String f65841i;

    /* JADX INFO: renamed from: j */
    public final List f65842j;

    public /* synthetic */ vs1(boolean z, int i, int i2, int i3, Integer num, List list, int i4) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? 0 : 39, (i4 & 32) != 0 ? null : num, null, (i4 & 128) == 0, null, (i4 & 512) != 0 ? EmptyList.f47638a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        return this.f65833a == vs1Var.f65833a && this.f65834b == vs1Var.f65834b && this.f65835c == vs1Var.f65835c && this.f65836d == vs1Var.f65836d && this.f65837e == vs1Var.f65837e && fa4.m11650l(this.f65838f, vs1Var.f65838f) && fa4.m11650l(this.f65839g, vs1Var.f65839g) && this.f65840h == vs1Var.f65840h && fa4.m11650l(this.f65841i, vs1Var.f65841i) && fa4.m11650l(this.f65842j, vs1Var.f65842j);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f65837e, wq1.m24106b(this.f65836d, wq1.m24106b(this.f65835c, wq1.m24106b(this.f65834b, Boolean.hashCode(this.f65833a) * 31, 31), 31), 31), 31);
        Integer num = this.f65838f;
        int iHashCode = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f65839g;
        int iM12428e = g9a.m12428e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f65840h);
        String str2 = this.f65841i;
        return this.f65842j.hashCode() + ((iM12428e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupBadgesState(isLoading=");
        sb.append(this.f65833a);
        sb.append(", level=");
        sb.append(this.f65834b);
        sb.append(", contribution=");
        hn1.m13360j(this.f65835c, this.f65836d, ", daysOpened=", ", totalDays=", sb);
        sb.append(this.f65837e);
        sb.append(", nextThreshold=");
        sb.append(this.f65838f);
        sb.append(", teamCode=");
        ux5.m22976C(this.f65839g, ", hasChampion=", ", championTeamCode=", sb, this.f65840h);
        sb.append(this.f65841i);
        sb.append(", activeDayBadges=");
        sb.append(this.f65842j);
        sb.append(")");
        return sb.toString();
    }

    public vs1(boolean z, int i, int i2, int i3, int i4, Integer num, String str, boolean z2, String str2, List list) {
        list.getClass();
        this.f65833a = z;
        this.f65834b = i;
        this.f65835c = i2;
        this.f65836d = i3;
        this.f65837e = i4;
        this.f65838f = num;
        this.f65839g = str;
        this.f65840h = z2;
        this.f65841i = str2;
        this.f65842j = list;
    }
}
