package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zy5 {

    /* JADX INFO: renamed from: a */
    public final String f72381a;

    /* JADX INFO: renamed from: b */
    public final int f72382b;

    /* JADX INFO: renamed from: c */
    public final int f72383c;

    /* JADX INFO: renamed from: d */
    public final int f72384d;

    public zy5(String str, int i, int i2, int i3) {
        str.getClass();
        this.f72381a = str;
        this.f72382b = i;
        this.f72383c = i2;
        this.f72384d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy5)) {
            return false;
        }
        zy5 zy5Var = (zy5) obj;
        return fa4.m11650l(this.f72381a, zy5Var.f72381a) && this.f72382b == zy5Var.f72382b && this.f72383c == zy5Var.f72383c && this.f72384d == zy5Var.f72384d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72384d) + wq1.m24106b(this.f72383c, wq1.m24106b(this.f72382b, this.f72381a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f72382b, "MilestoneStats(language=", this.f72381a, ", knownWords=", ", lingqs=");
        sbM17741p.append(this.f72383c);
        sbM17741p.append(", dailyScore=");
        sbM17741p.append(this.f72384d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
