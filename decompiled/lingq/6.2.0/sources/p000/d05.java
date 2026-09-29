package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d05 {

    /* JADX INFO: renamed from: a */
    public final boolean f34796a;

    /* JADX INFO: renamed from: b */
    public final boolean f34797b;

    /* JADX INFO: renamed from: c */
    public final boolean f34798c;

    /* JADX INFO: renamed from: d */
    public final boolean f34799d;

    /* JADX INFO: renamed from: e */
    public final boolean f34800e;

    /* JADX INFO: renamed from: f */
    public final boolean f34801f;

    /* JADX INFO: renamed from: g */
    public final boolean f34802g;

    /* JADX INFO: renamed from: h */
    public final boolean f34803h;

    /* JADX INFO: renamed from: i */
    public final boolean f34804i;

    public /* synthetic */ d05(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this(z, z2, z3, z4, z5, (i & 32) == 0, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d05)) {
            return false;
        }
        d05 d05Var = (d05) obj;
        return this.f34796a == d05Var.f34796a && this.f34797b == d05Var.f34797b && this.f34798c == d05Var.f34798c && this.f34799d == d05Var.f34799d && this.f34800e == d05Var.f34800e && this.f34801f == d05Var.f34801f && this.f34802g == d05Var.f34802g && this.f34803h == d05Var.f34803h && this.f34804i == d05Var.f34804i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34804i) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f34796a) * 31, 31, this.f34797b), 31, this.f34798c), 31, this.f34799d), 31, this.f34800e), 31, this.f34801f), 31, this.f34802g), 31, this.f34803h);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LessonContextMenuState(isLiked=", ", isExternal=", ", isTaken=", this.f34796a, this.f34797b);
        wq1.m24101A(sbM13357g, this.f34798c, ", showBlacklist=", this.f34799d, ", fromCourse=");
        wq1.m24101A(sbM13357g, this.f34800e, ", showSubscribe=", this.f34801f, ", isSubscribed=");
        wq1.m24101A(sbM13357g, this.f34802g, ", canArchive=", this.f34803h, ", isArchived=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f34804i, ")");
    }

    public d05(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f34796a = z;
        this.f34797b = z2;
        this.f34798c = z3;
        this.f34799d = z4;
        this.f34800e = z5;
        this.f34801f = z6;
        this.f34802g = z7;
        this.f34803h = z8;
        this.f34804i = z9;
    }
}
