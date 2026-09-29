package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class et1 {

    /* JADX INFO: renamed from: a */
    public final int f37793a;

    /* JADX INFO: renamed from: b */
    public final String f37794b;

    /* JADX INFO: renamed from: c */
    public final String f37795c;

    /* JADX INFO: renamed from: d */
    public final int f37796d;

    /* JADX INFO: renamed from: e */
    public final Integer f37797e;

    /* JADX INFO: renamed from: f */
    public final boolean f37798f;

    /* JADX INFO: renamed from: g */
    public final String f37799g;

    public et1(int i, String str, String str2, int i2, Integer num, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        this.f37793a = i;
        this.f37794b = str;
        this.f37795c = str2;
        this.f37796d = i2;
        this.f37797e = num;
        this.f37798f = z;
        this.f37799g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et1)) {
            return false;
        }
        et1 et1Var = (et1) obj;
        return this.f37793a == et1Var.f37793a && fa4.m11650l(this.f37794b, et1Var.f37794b) && fa4.m11650l(this.f37795c, et1Var.f37795c) && this.f37796d == et1Var.f37796d && fa4.m11650l(this.f37797e, et1Var.f37797e) && this.f37798f == et1Var.f37798f && fa4.m11650l(this.f37799g, et1Var.f37799g);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f37796d, ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f37793a) * 31, this.f37794b, 31), this.f37795c, 31), 31);
        Integer num = this.f37797e;
        int iM12428e = g9a.m12428e((iM24106b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f37798f);
        String str = this.f37799g;
        return iM12428e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f37793a, "CupContributorRow(rank=", ", username=", this.f37794b, ", teamCode=");
        AbstractC3393o1.m17748w(this.f37796d, this.f37795c, ", score=", ", delta=", sbM22995r);
        sbM22995r.append(this.f37797e);
        sbM22995r.append(", isMe=");
        sbM22995r.append(this.f37798f);
        sbM22995r.append(", photoUrl=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f37799g, ")");
    }
}
