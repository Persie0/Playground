package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t61 {

    /* JADX INFO: renamed from: a */
    public final String f61898a;

    /* JADX INFO: renamed from: b */
    public final int f61899b;

    /* JADX INFO: renamed from: c */
    public final String f61900c;

    /* JADX INFO: renamed from: d */
    public final String f61901d;

    /* JADX INFO: renamed from: e */
    public final boolean f61902e;

    /* JADX INFO: renamed from: f */
    public final boolean f61903f;

    /* JADX INFO: renamed from: g */
    public final boolean f61904g;

    /* JADX INFO: renamed from: h */
    public final boolean f61905h;

    /* JADX INFO: renamed from: i */
    public final boolean f61906i;

    /* JADX INFO: renamed from: j */
    public final boolean f61907j;

    /* JADX INFO: renamed from: k */
    public final boolean f61908k;

    public t61(String str, int i, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f61898a = str;
        this.f61899b = i;
        this.f61900c = str2;
        this.f61901d = str3;
        this.f61902e = z;
        this.f61903f = z2;
        this.f61904g = z3;
        this.f61905h = z4;
        this.f61906i = z5;
        this.f61907j = z6;
        this.f61908k = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t61)) {
            return false;
        }
        t61 t61Var = (t61) obj;
        return this.f61898a.equals(t61Var.f61898a) && this.f61899b == t61Var.f61899b && this.f61900c.equals(t61Var.f61900c) && this.f61901d.equals(t61Var.f61901d) && this.f61902e == t61Var.f61902e && this.f61903f == t61Var.f61903f && this.f61904g == t61Var.f61904g && this.f61905h == t61Var.f61905h && this.f61906i == t61Var.f61906i && this.f61907j == t61Var.f61907j && this.f61908k == t61Var.f61908k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61908k) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f61899b, this.f61898a.hashCode() * 31, 31), this.f61900c, 31), this.f61901d, 31), 31, this.f61902e), 31, this.f61903f), 31, this.f61904g), 31, this.f61905h), 31, this.f61906i), 31, this.f61907j);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f61899b, "CollectionCourseMenuState(title=", this.f61898a, ", courseId=", ", courseUrl=");
        AbstractC3393o1.m17725C(sbM17741p, this.f61900c, ", shelfCode=", this.f61901d, ", isPremium=");
        wq1.m24101A(sbM17741p, this.f61902e, ", isLiked=", this.f61903f, ", isAllLessonsTaken=");
        wq1.m24101A(sbM17741p, this.f61904g, ", isSomeLessonsTaken=", this.f61905h, ", isBlacklisted=");
        wq1.m24101A(sbM17741p, this.f61906i, ", canSubscribe=", this.f61907j, ", isSubscribed=");
        return AbstractC3393o1.m17740o(sbM17741p, this.f61908k, ")");
    }
}
