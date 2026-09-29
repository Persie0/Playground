package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ch4 {

    /* JADX INFO: renamed from: a */
    public final List f10086a;

    /* JADX INFO: renamed from: b */
    public final long f10087b;

    /* JADX INFO: renamed from: c */
    public final boolean f10088c;

    /* JADX INFO: renamed from: d */
    public final hc7 f10089d;

    /* JADX INFO: renamed from: e */
    public final Double f10090e;

    public ch4(List list, long j, boolean z, hc7 hc7Var, Double d) {
        list.getClass();
        this.f10086a = list;
        this.f10087b = j;
        this.f10088c = z;
        this.f10089d = hc7Var;
        this.f10090e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch4)) {
            return false;
        }
        ch4 ch4Var = (ch4) obj;
        return fa4.m11650l(this.f10086a, ch4Var.f10086a) && this.f10087b == ch4Var.f10087b && this.f10088c == ch4Var.f10088c && fa4.m11650l(this.f10089d, ch4Var.f10089d) && fa4.m11650l(this.f10090e, ch4Var.f10090e);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22981d(this.f10087b, this.f10086a.hashCode() * 31, 31), 31, this.f10088c);
        hc7 hc7Var = this.f10089d;
        int iHashCode = (iM12428e + (hc7Var == null ? 0 : hc7Var.hashCode())) * 31;
        Double d = this.f10090e;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "KaraokeContentInputs(sentences=" + this.f10086a + ", progress=" + this.f10087b + ", isLoading=" + this.f10088c + ", playerState=" + this.f10089d + ", progressForVideo=" + this.f10090e + ")";
    }
}
