package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rs1 {

    /* JADX INFO: renamed from: a */
    public final int f59748a;

    /* JADX INFO: renamed from: b */
    public final int f59749b;

    /* JADX INFO: renamed from: c */
    public final Integer f59750c;

    /* JADX INFO: renamed from: d */
    public final int f59751d;

    public rs1(int i, int i2, int i3, Integer num) {
        this.f59748a = i;
        this.f59749b = i2;
        this.f59750c = num;
        this.f59751d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs1)) {
            return false;
        }
        rs1 rs1Var = (rs1) obj;
        return this.f59748a == rs1Var.f59748a && this.f59749b == rs1Var.f59749b && fa4.m11650l(this.f59750c, rs1Var.f59750c) && this.f59751d == rs1Var.f59751d;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f59749b, Integer.hashCode(this.f59748a) * 31, 31);
        Integer num = this.f59750c;
        return Integer.hashCode(this.f59751d) + ((iM24106b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f59748a, this.f59749b, "CupBadgesEntryState(level=", ", daysOpened=", ", nextThreshold=");
        sbM22994q.append(this.f59750c);
        sbM22994q.append(", earnedCount=");
        sbM22994q.append(this.f59751d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
