package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v18 {

    /* JADX INFO: renamed from: a */
    public final String f64700a;

    /* JADX INFO: renamed from: b */
    public final String f64701b;

    /* JADX INFO: renamed from: c */
    public final String f64702c;

    /* JADX INFO: renamed from: d */
    public final long f64703d;

    /* JADX INFO: renamed from: e */
    public final String f64704e;

    /* JADX INFO: renamed from: f */
    public final boolean f64705f;

    public v18(String str, String str2, String str3, long j, String str4, boolean z) {
        this.f64700a = str;
        this.f64701b = str2;
        this.f64702c = str3;
        this.f64703d = j;
        this.f64704e = str4;
        this.f64705f = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m23041a() {
        return this.f64700a;
    }

    /* JADX INFO: renamed from: b */
    public final String m23042b() {
        return this.f64701b;
    }

    /* JADX INFO: renamed from: c */
    public final String m23043c() {
        return this.f64702c;
    }

    /* JADX INFO: renamed from: d */
    public final long m23044d() {
        return this.f64703d;
    }

    /* JADX INFO: renamed from: e */
    public final String m23045e() {
        return this.f64704e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v18)) {
            return false;
        }
        v18 v18Var = (v18) obj;
        return fa4.m11650l(this.f64700a, v18Var.f64700a) && fa4.m11650l(this.f64701b, v18Var.f64701b) && fa4.m11650l(this.f64702c, v18Var.f64702c) && this.f64703d == v18Var.f64703d && fa4.m11650l(this.f64704e, v18Var.f64704e) && this.f64705f == v18Var.f64705f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23046f() {
        return this.f64705f;
    }

    public final int hashCode() {
        String str = this.f64700a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64701b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64702c;
        int iM24106b = wq1.m24106b(0, ux5.m22981d(this.f64703d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.f64704e;
        return Boolean.hashCode(this.f64705f) + ((iM24106b + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("Receipt(orderId=", this.f64700a, ", packageName=", this.f64701b, ", productId=");
        sbM23000w.append(this.f64702c);
        sbM23000w.append(", purchaseTime=");
        sbM23000w.append(this.f64703d);
        sbM23000w.append(", purchaseState=0, purchaseToken=");
        sbM23000w.append(this.f64704e);
        sbM23000w.append(", isAutoRenewing=");
        sbM23000w.append(this.f64705f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
