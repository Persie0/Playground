package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fk9 {

    /* JADX INFO: renamed from: a */
    public final String f39227a;

    /* JADX INFO: renamed from: b */
    public final int f39228b;

    /* JADX INFO: renamed from: c */
    public final int f39229c;

    /* JADX INFO: renamed from: d */
    public final int f39230d;

    /* JADX INFO: renamed from: e */
    public final int f39231e;

    /* JADX INFO: renamed from: f */
    public final boolean f39232f;

    /* JADX INFO: renamed from: g */
    public final List f39233g;

    public fk9(String str, int i, int i2, int i3, int i4, boolean z, List list) {
        this.f39227a = str;
        this.f39228b = i;
        this.f39229c = i2;
        this.f39230d = i3;
        this.f39231e = i4;
        this.f39232f = z;
        this.f39233g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk9)) {
            return false;
        }
        fk9 fk9Var = (fk9) obj;
        return this.f39227a.equals(fk9Var.f39227a) && this.f39228b == fk9Var.f39228b && this.f39229c == fk9Var.f39229c && this.f39230d == fk9Var.f39230d && this.f39231e == fk9Var.f39231e && this.f39232f == fk9Var.f39232f && this.f39233g.equals(fk9Var.f39233g);
    }

    public final int hashCode() {
        return this.f39233g.hashCode() + g9a.m12428e(wq1.m24106b(this.f39231e, wq1.m24106b(this.f39230d, wq1.m24106b(this.f39229c, wq1.m24106b(this.f39228b, this.f39227a.hashCode() * 31, 31), 31), 31), 31), 31, this.f39232f);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f39228b, "StreakWidgetState(languageName=", this.f39227a, ", streakDays=", ", coins=");
        hn1.m13360j(this.f39229c, this.f39230d, ", dailyGoal=", ", currentDayScore=", sbM17741p);
        hn1.m13368r(sbM17741p, this.f39231e, ", streakMetToday=", this.f39232f, ", weekEntries=");
        return hn1.m13356f(sbM17741p, this.f39233g, ")");
    }
}
