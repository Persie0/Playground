package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bt1 {

    /* JADX INFO: renamed from: a */
    public final int f8962a;

    /* JADX INFO: renamed from: b */
    public final Integer f8963b;

    /* JADX INFO: renamed from: c */
    public final Integer f8964c;

    /* JADX INFO: renamed from: d */
    public final int f8965d;

    /* JADX INFO: renamed from: e */
    public final String f8966e;

    /* JADX INFO: renamed from: f */
    public final String f8967f;

    /* JADX INFO: renamed from: g */
    public final String f8968g;

    /* JADX INFO: renamed from: h */
    public final int f8969h;

    public bt1(int i, Integer num, Integer num2, int i2, String str, String str2, String str3, int i3) {
        str.getClass();
        str3.getClass();
        this.f8962a = i;
        this.f8963b = num;
        this.f8964c = num2;
        this.f8965d = i2;
        this.f8966e = str;
        this.f8967f = str2;
        this.f8968g = str3;
        this.f8969h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        return this.f8962a == bt1Var.f8962a && fa4.m11650l(this.f8963b, bt1Var.f8963b) && fa4.m11650l(this.f8964c, bt1Var.f8964c) && this.f8965d == bt1Var.f8965d && fa4.m11650l(this.f8966e, bt1Var.f8966e) && fa4.m11650l(this.f8967f, bt1Var.f8967f) && fa4.m11650l(this.f8968g, bt1Var.f8968g) && this.f8969h == bt1Var.f8969h;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8962a) * 31;
        Integer num = this.f8963b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8964c;
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f8965d, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), this.f8966e, 31);
        String str = this.f8967f;
        return Integer.hashCode(this.f8969h) + ux5.m22980c((iM22980c + (str != null ? str.hashCode() : 0)) * 31, this.f8968g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupContributor(rank=");
        sb.append(this.f8962a);
        sb.append(", prevRank=");
        sb.append(this.f8963b);
        sb.append(", delta=");
        sb.append(this.f8964c);
        sb.append(", profileId=");
        sb.append(this.f8965d);
        sb.append(", username=");
        AbstractC3393o1.m17725C(sb, this.f8966e, ", photoUrl=", this.f8967f, ", teamCode=");
        sb.append(this.f8968g);
        sb.append(", score=");
        sb.append(this.f8969h);
        sb.append(")");
        return sb.toString();
    }
}
