package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hz0 {

    /* JADX INFO: renamed from: a */
    public final String f43230a;

    /* JADX INFO: renamed from: b */
    public final int f43231b;

    /* JADX INFO: renamed from: c */
    public final int f43232c;

    /* JADX INFO: renamed from: d */
    public final Map f43233d;

    /* JADX INFO: renamed from: e */
    public final Map f43234e;

    public hz0(String str, int i, int i2, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.f43230a = str;
        this.f43231b = i;
        this.f43232c = i2;
        this.f43233d = map;
        this.f43234e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz0)) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.f43230a.equals(hz0Var.f43230a) && this.f43231b == hz0Var.f43231b && this.f43232c == hz0Var.f43232c && fa4.m11650l(this.f43233d, hz0Var.f43233d) && fa4.m11650l(this.f43234e, hz0Var.f43234e);
    }

    public final int hashCode() {
        return this.f43234e.hashCode() + e65.m10869a(wq1.m24106b(this.f43232c, wq1.m24106b(this.f43231b, this.f43230a.hashCode() * 31, 31), 31), 31, this.f43233d);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f43231b, "ChatStatsRefresh(language=", this.f43230a, ", chatId=", ", presentedReplies=");
        sbM17741p.append(this.f43232c);
        sbM17741p.append(", cards=");
        sbM17741p.append(this.f43233d);
        sbM17741p.append(", words=");
        sbM17741p.append(this.f43234e);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
