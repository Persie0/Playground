package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ek9 {

    /* JADX INFO: renamed from: a */
    public final String f37392a;

    /* JADX INFO: renamed from: b */
    public final int f37393b;

    /* JADX INFO: renamed from: c */
    public final int f37394c;

    /* JADX INFO: renamed from: d */
    public final String f37395d;

    /* JADX INFO: renamed from: e */
    public final boolean f37396e;

    /* JADX INFO: renamed from: f */
    public final boolean f37397f;

    public ek9(int i, int i2, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f37392a = str;
        this.f37393b = i;
        this.f37394c = i2;
        this.f37395d = str2;
        this.f37396e = z;
        this.f37397f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek9)) {
            return false;
        }
        ek9 ek9Var = (ek9) obj;
        return fa4.m11650l(this.f37392a, ek9Var.f37392a) && this.f37393b == ek9Var.f37393b && this.f37394c == ek9Var.f37394c && this.f37395d.equals(ek9Var.f37395d) && this.f37396e == ek9Var.f37396e && this.f37397f == ek9Var.f37397f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37397f) + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f37394c, wq1.m24106b(this.f37393b, this.f37392a.hashCode() * 31, 31), 31), this.f37395d, 31), 31, this.f37396e);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f37393b, "StreakWidgetDayEntry(dayLabel=", this.f37392a, ", score=", ", dailyGoal=");
        hn1.m13361k(this.f37394c, ", date=", this.f37395d, ", isCurrentDay=", sbM17741p);
        return e65.m10875g(sbM17741p, this.f37396e, ", isFutureDay=", this.f37397f, ")");
    }
}
