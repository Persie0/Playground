package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ct1 {

    /* JADX INFO: renamed from: a */
    public final String f34503a;

    /* JADX INFO: renamed from: b */
    public final int f34504b;

    /* JADX INFO: renamed from: c */
    public final int f34505c;

    /* JADX INFO: renamed from: d */
    public final Integer f34506d;

    /* JADX INFO: renamed from: e */
    public final Integer f34507e;

    /* JADX INFO: renamed from: f */
    public final String f34508f;

    /* JADX INFO: renamed from: g */
    public final String f34509g;

    /* JADX INFO: renamed from: h */
    public final String f34510h;

    /* JADX INFO: renamed from: i */
    public final int f34511i;

    public ct1(String str, int i, int i2, Integer num, Integer num2, String str2, String str3, String str4, int i3) {
        ux5.m22974A(str, str2, str4);
        this.f34503a = str;
        this.f34504b = i;
        this.f34505c = i2;
        this.f34506d = num;
        this.f34507e = num2;
        this.f34508f = str2;
        this.f34509g = str3;
        this.f34510h = str4;
        this.f34511i = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m9873a() {
        return this.f34507e;
    }

    /* JADX INFO: renamed from: b */
    public final String m9874b() {
        return this.f34509g;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m9875c() {
        return this.f34506d;
    }

    /* JADX INFO: renamed from: d */
    public final int m9876d() {
        return this.f34504b;
    }

    /* JADX INFO: renamed from: e */
    public final int m9877e() {
        return this.f34505c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct1)) {
            return false;
        }
        ct1 ct1Var = (ct1) obj;
        return fa4.m11650l(this.f34503a, ct1Var.f34503a) && this.f34504b == ct1Var.f34504b && this.f34505c == ct1Var.f34505c && fa4.m11650l(this.f34506d, ct1Var.f34506d) && fa4.m11650l(this.f34507e, ct1Var.f34507e) && fa4.m11650l(this.f34508f, ct1Var.f34508f) && fa4.m11650l(this.f34509g, ct1Var.f34509g) && fa4.m11650l(this.f34510h, ct1Var.f34510h) && this.f34511i == ct1Var.f34511i;
    }

    /* JADX INFO: renamed from: f */
    public final String m9878f() {
        return this.f34503a;
    }

    /* JADX INFO: renamed from: g */
    public final int m9879g() {
        return this.f34511i;
    }

    /* JADX INFO: renamed from: h */
    public final String m9880h() {
        return this.f34510h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f34505c, wq1.m24106b(this.f34504b, this.f34503a.hashCode() * 31, 31), 31);
        Integer num = this.f34506d;
        int iHashCode = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f34507e;
        int iM22980c = ux5.m22980c((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, this.f34508f, 31);
        String str = this.f34509g;
        return Integer.hashCode(this.f34511i) + ux5.m22980c((iM22980c + (str != null ? str.hashCode() : 0)) * 31, this.f34510h, 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m9881i() {
        return this.f34508f;
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f34504b, "CupContributorEntity(scope=", this.f34503a, ", profileId=", ", rank=");
        sbM17741p.append(this.f34505c);
        sbM17741p.append(", prevRank=");
        sbM17741p.append(this.f34506d);
        sbM17741p.append(", delta=");
        sbM17741p.append(this.f34507e);
        sbM17741p.append(", username=");
        sbM17741p.append(this.f34508f);
        sbM17741p.append(", photoUrl=");
        AbstractC3393o1.m17725C(sbM17741p, this.f34509g, ", teamCode=", this.f34510h, ", score=");
        return wq1.m24123s(sbM17741p, this.f34511i, ")");
    }
}
