package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tj9 implements uj9 {

    /* JADX INFO: renamed from: a */
    public final int f62421a;

    /* JADX INFO: renamed from: b */
    public final List f62422b;

    /* JADX INFO: renamed from: c */
    public final boolean f62423c;

    /* JADX INFO: renamed from: d */
    public final int f62424d;

    /* JADX INFO: renamed from: e */
    public final String f62425e;

    public tj9(int i, List list, boolean z, int i2, String str) {
        list.getClass();
        this.f62421a = i;
        this.f62422b = list;
        this.f62423c = z;
        this.f62424d = i2;
        this.f62425e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj9)) {
            return false;
        }
        tj9 tj9Var = (tj9) obj;
        return this.f62421a == tj9Var.f62421a && fa4.m11650l(this.f62422b, tj9Var.f62422b) && this.f62423c == tj9Var.f62423c && this.f62424d == tj9Var.f62424d && fa4.m11650l(this.f62425e, tj9Var.f62425e);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f62424d, g9a.m12428e(ux5.m22979b(Integer.hashCode(this.f62421a) * 31, 31, this.f62422b), 31, this.f62423c), 31);
        String str = this.f62425e;
        return iM24106b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(streakValue=");
        sb.append(this.f62421a);
        sb.append(", entries=");
        sb.append(this.f62422b);
        sb.append(", shouldShowRepair=");
        hn1.m13373w(sb, this.f62423c, ", latestStreakDays=", this.f62424d, ", brokenStreakDate=");
        return AbstractC3393o1.m17738m(sb, this.f62425e, ")");
    }

    public /* synthetic */ tj9(int i, List list, boolean z, int i2) {
        this(i, list, (i2 & 4) != 0 ? false : z, 0, null);
    }
}
