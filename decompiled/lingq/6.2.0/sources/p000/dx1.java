package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dx1 {

    /* JADX INFO: renamed from: a */
    public final String f36353a;

    /* JADX INFO: renamed from: b */
    public final int f36354b;

    /* JADX INFO: renamed from: c */
    public final int f36355c;

    /* JADX INFO: renamed from: d */
    public final int f36356d;

    /* JADX INFO: renamed from: e */
    public final boolean f36357e;

    public dx1(int i, int i2, int i3, String str, boolean z) {
        this.f36353a = str;
        this.f36354b = i;
        this.f36355c = i2;
        this.f36356d = i3;
        this.f36357e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx1)) {
            return false;
        }
        dx1 dx1Var = (dx1) obj;
        return this.f36353a.equals(dx1Var.f36353a) && this.f36354b == dx1Var.f36354b && this.f36355c == dx1Var.f36355c && this.f36356d == dx1Var.f36356d && this.f36357e == dx1Var.f36357e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36357e) + wq1.m24106b(this.f36356d, wq1.m24106b(this.f36355c, wq1.m24106b(this.f36354b, this.f36353a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f36354b, "CurrentDayStreak(title=", this.f36353a, ", coins=", ", dailyGoal=");
        hn1.m13360j(this.f36355c, this.f36356d, ", activityLevelId=", ", streakMetToday=", sbM17741p);
        return AbstractC3393o1.m17740o(sbM17741p, this.f36357e, ")");
    }
}
