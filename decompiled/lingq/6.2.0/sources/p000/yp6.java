package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yp6 {

    /* JADX INFO: renamed from: a */
    public final int f70240a;

    /* JADX INFO: renamed from: b */
    public final String f70241b;

    /* JADX INFO: renamed from: c */
    public final String f70242c;

    /* JADX INFO: renamed from: d */
    public final String f70243d;

    /* JADX INFO: renamed from: e */
    public final String f70244e;

    /* JADX INFO: renamed from: f */
    public final String f70245f;

    /* JADX INFO: renamed from: g */
    public final String f70246g;

    /* JADX INFO: renamed from: h */
    public final String f70247h;

    /* JADX INFO: renamed from: i */
    public final boolean f70248i;

    /* JADX INFO: renamed from: j */
    public final boolean f70249j;

    /* JADX INFO: renamed from: k */
    public final boolean f70250k;

    /* JADX INFO: renamed from: l */
    public final Integer f70251l;

    /* JADX INFO: renamed from: m */
    public final String f70252m;

    /* JADX INFO: renamed from: n */
    public final String f70253n;

    /* JADX INFO: renamed from: o */
    public final String f70254o;

    /* JADX INFO: renamed from: p */
    public final String f70255p;

    /* JADX INFO: renamed from: q */
    public final String f70256q;

    /* JADX INFO: renamed from: r */
    public final String f70257r;

    /* JADX INFO: renamed from: s */
    public final List f70258s;

    public yp6(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, List list) {
        ux5.m22975B(str, str2, str3, str4, str5);
        ux5.m22975B(str6, str10, str11, str12, str13);
        list.getClass();
        this.f70240a = i;
        this.f70241b = str;
        this.f70242c = str2;
        this.f70243d = str3;
        this.f70244e = str4;
        this.f70245f = str5;
        this.f70246g = str6;
        this.f70247h = str7;
        this.f70248i = z;
        this.f70249j = z2;
        this.f70250k = z3;
        this.f70251l = num;
        this.f70252m = str8;
        this.f70253n = str9;
        this.f70254o = str10;
        this.f70255p = str11;
        this.f70256q = str12;
        this.f70257r = str13;
        this.f70258s = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m25243a() {
        return this.f70256q;
    }

    /* JADX INFO: renamed from: b */
    public final String m25244b() {
        return this.f70255p;
    }

    /* JADX INFO: renamed from: c */
    public final String m25245c() {
        return this.f70253n;
    }

    /* JADX INFO: renamed from: d */
    public final List m25246d() {
        return this.f70258s;
    }

    /* JADX INFO: renamed from: e */
    public final String m25247e() {
        return this.f70242c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp6)) {
            return false;
        }
        yp6 yp6Var = (yp6) obj;
        return this.f70240a == yp6Var.f70240a && fa4.m11650l(this.f70241b, yp6Var.f70241b) && fa4.m11650l(this.f70242c, yp6Var.f70242c) && fa4.m11650l(this.f70243d, yp6Var.f70243d) && fa4.m11650l(this.f70244e, yp6Var.f70244e) && fa4.m11650l(this.f70245f, yp6Var.f70245f) && fa4.m11650l(this.f70246g, yp6Var.f70246g) && fa4.m11650l(this.f70247h, yp6Var.f70247h) && this.f70248i == yp6Var.f70248i && this.f70249j == yp6Var.f70249j && this.f70250k == yp6Var.f70250k && fa4.m11650l(this.f70251l, yp6Var.f70251l) && fa4.m11650l(this.f70252m, yp6Var.f70252m) && fa4.m11650l(this.f70253n, yp6Var.f70253n) && fa4.m11650l(this.f70254o, yp6Var.f70254o) && fa4.m11650l(this.f70255p, yp6Var.f70255p) && fa4.m11650l(this.f70256q, yp6Var.f70256q) && fa4.m11650l(this.f70257r, yp6Var.f70257r) && fa4.m11650l(this.f70258s, yp6Var.f70258s);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25248f() {
        return this.f70248i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25249g() {
        return this.f70249j;
    }

    /* JADX INFO: renamed from: h */
    public final String m25250h() {
        return this.f70252m;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f70240a) * 31, this.f70241b, 31), this.f70242c, 31), this.f70243d, 31), this.f70244e, 31), this.f70245f, 31), this.f70246g, 31);
        String str = this.f70247h;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f70248i), 31, this.f70249j), 31, this.f70250k);
        Integer num = this.f70251l;
        int iHashCode = (iM12428e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f70252m;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70253n;
        return this.f70258s.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, this.f70254o, 31), this.f70255p, 31), this.f70256q, 31), this.f70257r, 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m25251i() {
        return this.f70247h;
    }

    /* JADX INFO: renamed from: j */
    public final String m25252j() {
        return this.f70246g;
    }

    /* JADX INFO: renamed from: k */
    public final String m25253k() {
        return this.f70245f;
    }

    /* JADX INFO: renamed from: l */
    public final String m25254l() {
        return this.f70254o;
    }

    /* JADX INFO: renamed from: m */
    public final int m25255m() {
        return this.f70240a;
    }

    /* JADX INFO: renamed from: n */
    public final Integer m25256n() {
        return this.f70251l;
    }

    /* JADX INFO: renamed from: o */
    public final String m25257o() {
        return this.f70241b;
    }

    /* JADX INFO: renamed from: p */
    public final String m25258p() {
        return this.f70257r;
    }

    /* JADX INFO: renamed from: q */
    public final String m25259q() {
        return this.f70243d;
    }

    /* JADX INFO: renamed from: r */
    public final String m25260r() {
        return this.f70244e;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25261s() {
        return this.f70250k;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f70240a, "OfferEntity(id=", ", title=", this.f70241b, ", code=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70242c, ", type=", this.f70243d, ", visibility=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70244e, ", dateStart=", this.f70245f, ", dateEnd=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70246g, ", dateCountdown=", this.f70247h, ", countdownEnabled=");
        wq1.m24101A(sbM22995r, this.f70248i, ", countdownEnded=", this.f70249j, ", isActive=");
        sbM22995r.append(this.f70250k);
        sbM22995r.append(", tier=");
        sbM22995r.append(this.f70251l);
        sbM22995r.append(", ctaText=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70252m, ", androidCoupon=", this.f70253n, ", discount=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70254o, ", accentColorLight=", this.f70255p, ", accentColorDark=");
        AbstractC3393o1.m17725C(sbM22995r, this.f70256q, ", trialHeader=", this.f70257r, ", banners=");
        return hn1.m13356f(sbM22995r, this.f70258s, ")");
    }
}
