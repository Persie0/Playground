package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u26 {

    /* JADX INFO: renamed from: a */
    public final int f63318a;

    /* JADX INFO: renamed from: b */
    public final String f63319b;

    /* JADX INFO: renamed from: c */
    public final boolean f63320c;

    /* JADX INFO: renamed from: d */
    public final boolean f63321d;

    /* JADX INFO: renamed from: e */
    public final boolean f63322e;

    /* JADX INFO: renamed from: f */
    public final String f63323f;

    public u26(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f63318a = i;
        this.f63319b = str;
        this.f63320c = z;
        this.f63321d = z2;
        this.f63322e = z3;
        this.f63323f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u26)) {
            return false;
        }
        u26 u26Var = (u26) obj;
        return this.f63318a == u26Var.f63318a && fa4.m11650l(this.f63319b, u26Var.f63319b) && this.f63320c == u26Var.f63320c && this.f63321d == u26Var.f63321d && this.f63322e == u26Var.f63322e && fa4.m11650l(this.f63323f, u26Var.f63323f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f63318a) * 31;
        String str = this.f63319b;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63320c), 31, this.f63321d), 31, this.f63322e);
        String str2 = this.f63323f;
        return iM12428e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f63318a, "MoreScreenState(unreadNotificationsCount=", ", bannerUrl=", this.f63319b, ", showClose=");
        wq1.m24101A(sbM22995r, this.f63320c, ", canShowBanner=", this.f63321d, ", showGrammarGuide=");
        sbM22995r.append(this.f63322e);
        sbM22995r.append(", offer=");
        sbM22995r.append(this.f63323f);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
