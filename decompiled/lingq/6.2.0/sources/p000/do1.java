package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class do1 {

    /* JADX INFO: renamed from: a */
    public final boolean f35929a;

    /* JADX INFO: renamed from: b */
    public final boolean f35930b;

    /* JADX INFO: renamed from: c */
    public final boolean f35931c;

    /* JADX INFO: renamed from: d */
    public final boolean f35932d;

    /* JADX INFO: renamed from: e */
    public final boolean f35933e;

    /* JADX INFO: renamed from: f */
    public final boolean f35934f;

    /* JADX INFO: renamed from: g */
    public final boolean f35935g;

    public do1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f35929a = z;
        this.f35930b = z2;
        this.f35931c = z3;
        this.f35932d = z4;
        this.f35933e = z5;
        this.f35934f = z6;
        this.f35935g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do1)) {
            return false;
        }
        do1 do1Var = (do1) obj;
        return this.f35929a == do1Var.f35929a && this.f35930b == do1Var.f35930b && this.f35931c == do1Var.f35931c && this.f35932d == do1Var.f35932d && this.f35933e == do1Var.f35933e && this.f35934f == do1Var.f35934f && this.f35935g == do1Var.f35935g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35935g) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f35929a) * 31, 31, this.f35930b), 31, this.f35931c), 31, this.f35932d), 31, this.f35933e), 31, this.f35934f);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("CourseContextMenuState(isLiked=", ", isTaken=", ", showBlacklist=", this.f35929a, this.f35930b);
        wq1.m24101A(sbM13357g, this.f35931c, ", showSubscribe=", this.f35932d, ", isSubscribed=");
        wq1.m24101A(sbM13357g, this.f35933e, ", canArchive=", this.f35934f, ", isArchived=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f35935g, ")");
    }
}
