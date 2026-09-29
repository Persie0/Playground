package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vw1 {

    /* JADX INFO: renamed from: a */
    public final int f66003a;

    /* JADX INFO: renamed from: b */
    public final String f66004b;

    /* JADX INFO: renamed from: c */
    public final String f66005c;

    /* JADX INFO: renamed from: d */
    public final int f66006d;

    /* JADX INFO: renamed from: e */
    public final int f66007e;

    /* JADX INFO: renamed from: f */
    public final Integer f66008f;

    /* JADX INFO: renamed from: g */
    public final boolean f66009g;

    public vw1(int i, String str, String str2, int i2, int i3, Integer num, boolean z) {
        str.getClass();
        str2.getClass();
        this.f66003a = i;
        this.f66004b = str;
        this.f66005c = str2;
        this.f66006d = i2;
        this.f66007e = i3;
        this.f66008f = num;
        this.f66009g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw1)) {
            return false;
        }
        vw1 vw1Var = (vw1) obj;
        return this.f66003a == vw1Var.f66003a && fa4.m11650l(this.f66004b, vw1Var.f66004b) && fa4.m11650l(this.f66005c, vw1Var.f66005c) && this.f66006d == vw1Var.f66006d && this.f66007e == vw1Var.f66007e && fa4.m11650l(this.f66008f, vw1Var.f66008f) && this.f66009g == vw1Var.f66009g;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f66007e, wq1.m24106b(this.f66006d, ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f66003a) * 31, this.f66004b, 31), this.f66005c, 31), 31), 31);
        Integer num = this.f66008f;
        return Boolean.hashCode(this.f66009g) + ((iM24106b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f66003a, "CupTeamRow(rank=", ", code=", this.f66004b, ", name=");
        AbstractC3393o1.m17748w(this.f66006d, this.f66005c, ", coinsPerUser=", ", totalCoins=", sbM22995r);
        sbM22995r.append(this.f66007e);
        sbM22995r.append(", delta=");
        sbM22995r.append(this.f66008f);
        sbM22995r.append(", isYourTeam=");
        return AbstractC3393o1.m17740o(sbM22995r, this.f66009g, ")");
    }
}
