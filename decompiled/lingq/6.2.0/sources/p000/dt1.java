package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dt1 {

    /* JADX INFO: renamed from: a */
    public final String f36190a;

    /* JADX INFO: renamed from: b */
    public final Integer f36191b;

    /* JADX INFO: renamed from: c */
    public final int f36192c;

    public dt1(int i, Integer num, String str) {
        str.getClass();
        this.f36190a = str;
        this.f36191b = num;
        this.f36192c = i;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m10616a() {
        return this.f36191b;
    }

    /* JADX INFO: renamed from: b */
    public final String m10617b() {
        return this.f36190a;
    }

    /* JADX INFO: renamed from: c */
    public final int m10618c() {
        return this.f36192c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        return fa4.m11650l(this.f36190a, dt1Var.f36190a) && fa4.m11650l(this.f36191b, dt1Var.f36191b) && this.f36192c == dt1Var.f36192c;
    }

    public final int hashCode() {
        int iHashCode = this.f36190a.hashCode() * 31;
        Integer num = this.f36191b;
        return Integer.hashCode(this.f36192c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupContributorMeEntity(scope=");
        sb.append(this.f36190a);
        sb.append(", rank=");
        sb.append(this.f36191b);
        sb.append(", score=");
        return wq1.m24123s(sb, this.f36192c, ")");
    }
}
